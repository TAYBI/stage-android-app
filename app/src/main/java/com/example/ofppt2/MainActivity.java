package com.example.ofppt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private String niveaFormation;
    private String niveauScolaire = "bac,niveau bac";


//    private String secteur = "Bâtiment et Travaux Publics,Froid et Génie Thermique," +
//                            "Réparation des Engins à Moteurs," +
//                            "Génie Electrique,Plasturgie,Administration Gestion et Commerce," +
//                            "Construction Métallique,Transport et Logistique,Textile Habillement,"+
//                            "Action Sociale,NTIC,Arts Graphiques,Aéronautique";

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner mSpinnerNiveauFormation = (Spinner)findViewById(R.id.spinner_niveau_formation);

        final Spinner mSpinnerNiveauScolaire = (Spinner)findViewById(R.id.spinner_niveau_scolaire);
        fillSpinner(mSpinnerNiveauScolaire, stringToList(niveauScolaire));
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
}
