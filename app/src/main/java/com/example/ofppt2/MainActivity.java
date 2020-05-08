package com.example.ofppt2;

import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ofppt2.classes.Niveau;
import com.example.ofppt2.classes.Secteur;
import com.example.ofppt2.data.OfpptOpenHelper;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    DataManager dm;
    OfpptOpenHelper db;
    Spinner mSpinnerNiveauFormation, mSpinnerNiveauScolaire, mSpinnerSecteur, mSpinnerFiliere;
    private String niveaFormation, secteurs, filieres;
    private String niveauScolaire = "bac,niveau bac";


            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new OfpptOpenHelper(this);
        dm = new DataManager();

        mSpinnerNiveauFormation = (Spinner)findViewById(R.id.spinner_niveau_formation);
        mSpinnerSecteur = (Spinner)findViewById(R.id.spinner_secteur);
        mSpinnerFiliere = (Spinner)findViewById(R.id.spinner_filiere);
        mSpinnerNiveauScolaire = (Spinner)findViewById(R.id.spinner_niveau_scolaire);
        fillSpinner(mSpinnerNiveauScolaire, stringToList(niveauScolaire));

        load_Niveaux_data();
        load_Secteurs_data();

        load_Niveau_Formation_ParNiveau_Scolaire();
        load_Secteur_Par_Niveau_Formation();
        load_Filiere_Par_Secteur();
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
