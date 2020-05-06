package com.example.ofppt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String niveau = "Technicien Spécialisé,Technicien,Qualification,Spécialisation";
//    private String secteur = "Bâtiment et Travaux Publics,Froid et Génie Thermique," +
//                            "Réparation des Engins à Moteurs," +
//                            "Génie Electrique,Plasturgie,Administration Gestion et Commerce," +
//                            "Construction Métallique,Transport et Logistique,Textile Habillement,"+
//                            "Action Sociale,NTIC,Arts Graphiques,Aéronautique";

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mSpinnerNiveau = (Spinner)findViewById(R.id.spinner_niveau_scolaire);
        fillSpinner(mSpinnerNiveau, stringToList(niveau));

//        Spinner mSpinnerSecteur = (Spinner)findViewById(R.id.spinner_secteur);
//        fillSpinner(mSpinnerSecteur, stringToList(secteur));
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
