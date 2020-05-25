package com.example.ofppt2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ofppt2.classes.Filiere;
import com.example.ofppt2.classes.Niveau;
import com.example.ofppt2.classes.Secteur;
import com.example.ofppt2.database.OfpptOpenHelper;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    DataManager dm;
    OfpptOpenHelper db;
    Filiere filiere;
    TextView visiteurs, dat_nais;
    EditText cin, nom, prenom;
    Spinner mSpinnerNiveauFormation, mSpinnerNiveauScolaire, mSpinnerSecteur, mSpinnerFiliere;
    Button valider;
    private String niveaFormation, secteurs, filieres, niveauScolaire, counter, date;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        niveauScolaire = "bac,niveau bac";

        db = new OfpptOpenHelper(this);
        dm = new DataManager();

        cin = (EditText) findViewById(R.id.cin);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        dat_nais = (TextView) findViewById(R.id.dat_naiss);

        int year = Calendar.getInstance().get(Calendar.YEAR) - 18;
        date = "   " + year + "/" +
                Calendar.getInstance().get(Calendar.MONTH)  +"/" +
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        dat_nais.setText(date);

        visiteurs = (TextView) findViewById(R.id.visiteurs);
        valider = (Button) findViewById(R.id.valider);
        mSpinnerNiveauFormation = (Spinner)findViewById(R.id.spinner_niveau_formation);
        mSpinnerSecteur = (Spinner)findViewById(R.id.spinner_secteur);
        mSpinnerFiliere = (Spinner)findViewById(R.id.spinner_filiere);
        mSpinnerNiveauScolaire = (Spinner)findViewById(R.id.spinner_niveau_scolaire);
        fillSpinner(mSpinnerNiveauScolaire, stringToList(niveauScolaire));

        set_visiteur_num();

        load_Niveaux_data();
        load_Secteurs_data();
        load_Filieres_data();

        load_Niveau_Formation_ParNiveau_Scolaire();
        load_Secteur_Par_Niveau_Formation();
        load_Filiere_Par_Secteur();

        handle_pick_date_click();

        handleValiderClick();
    }

    private void handle_pick_date_click() {
        dat_nais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPickerDailog();
            }
        });
    }

    private void showPickerDailog() {
        DatePickerDialog pickerDialog = new DatePickerDialog(this, R.style.DialogTheme,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        pickerDialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        set_visiteur_num();
    }


    private void set_visiteur_num() {
        Cursor res =  db.getAllUsers();
        if (res.getCount() > 1)
            counter = "Visiteurs " + res.getCount();
        else
            counter = "Visiteur " + res.getCount();
        visiteurs.setText(counter);
    }

    private void handleValiderClick() {
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_user();

                Intent intent = new Intent(MainActivity.this, Filiere_info.class);
                String filereString = mSpinnerFiliere.getSelectedItem().toString();
                filiere = dm.getFiliere(filereString);
                intent.putExtra("Filiere", filiere);
                startActivity(intent);
            }
        });
    }

    private void add_user() {

        if(db.useExisted(cin.getText().toString()).getCount() == 0)
        {
            String dn = dat_nais.getText().toString().substring(3);
             db.insertUser(cin.getText().toString(), prenom.getText().toString(), nom.getText().toString(), dn,
                    mSpinnerNiveauScolaire.getSelectedItem().toString(),
                    mSpinnerNiveauFormation.getSelectedItem().  toString(),
                    mSpinnerSecteur.getSelectedItem().toString(),
                    mSpinnerFiliere.getSelectedItem().toString());
        }
    }

    // HACK:
    private void load_Filieres_data() {
                dm.insertFiliers();
//        Cursor res =  db.getAllFilieres();
//        int i = res.getCount();
//        if(i == 0){
//            showMessage("Error", "No data found");
//        }
//        while (res.moveToNext()){
//            Filiere filiereTemp = new Filiere(res.getString(1),res.getString(2),
//                    res.getString(3),res.getString(4),res.getString(5),
//                    res.getString(6),res.getString(7),res.getString(8));
//            dm.setFiliere(filiereTemp);
//        }
    }

    private void load_Niveaux_data() {
        Cursor res =  db.getAllNiveaux();
        if(res.getCount() == 0){
            showMessage("Error", "No data found");
        }
        while (res.moveToNext()){
            Niveau niveau = new Niveau(res.getString(1), res.getString(2));
            dm.setNiveau(niveau);
        }
    }


    private void load_Secteurs_data() {
        Cursor res =  db.getAllSecteurs();
        if(res.getCount() == 0){
            showMessage("Error", "No data found");
        }
        while (res.moveToNext()){
            Secteur secteur = new Secteur(res.getString(1), res.getString(2));
            dm.setSecteur(secteur);
        }
    }

    private void load_Filiere_Par_Secteur() {
        mSpinnerSecteur.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String secteur  = parent.getItemAtPosition(position).toString();
                filieres = dm.getFilieres(secteur);
                fillSpinner(mSpinnerFiliere, stringToList(filieres));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void load_Secteur_Par_Niveau_Formation() {
        mSpinnerNiveauFormation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String niveau  = parent.getItemAtPosition(position).toString();
                secteurs = dm.getSecteurs(niveau);
                fillSpinner(mSpinnerSecteur, stringToList(secteurs));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void load_Niveau_Formation_ParNiveau_Scolaire() {
        mSpinnerNiveauScolaire.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value  = parent.getItemAtPosition(position).toString();

                if (value.equals("bac"))
                    niveaFormation = "Technicien Spécialisé,Technicien,Qualification,Spécialisation";
                else if (value.equals("niveau bac"))
                    niveaFormation = "Technicien,Qualification,Spécialisation";

                fillSpinner(mSpinnerNiveauFormation, stringToList(niveaFormation));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private List<String> stringToList(String s) {
        return Arrays.asList(s.split(",",50));
    }

    private void fillSpinner(Spinner spinner, List<String> list) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.color_spinner_layout, list);
        adapter.setDropDownViewResource(R.layout.spinner_dopdown_layout);

        spinner.setAdapter(adapter);
    }

    private void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    /**
     * @param view       the picker associated with the dialog
     * @param year       the selected year
     * @param month      the selected month (0-11 for compatibility with
     *                   {@link Calendar#MONTH})
     * @param dayOfMonth the selected day of the month (1-31, depending on
     */
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        int mon = month + 1;
        date = "   "+ year + "/" + mon + "/" + dayOfMonth;
        dat_nais.setText(date);
    }
}
