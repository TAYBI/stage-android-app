package com.example.ofppt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.ofppt2.classes.Filiere;

public class Filiere_info extends AppCompatActivity {

    Filiere filiere;
    TextView title, conditions, debouches, profile_de_formation, details;
    Button telecharger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filiere_info);

        filiere = getIntent().getParcelableExtra ("Filiere");

        telecharger = (Button) findViewById(R.id.telecharger);

        title = (TextView) findViewById(R.id.title);
        conditions = (TextView) findViewById(R.id.conditions);
        debouches = (TextView) findViewById(R.id.debouches);
        profile_de_formation = (TextView) findViewById(R.id.profile_formation);
        details = (TextView) findViewById(R.id.details);

        title.setText(filiere.getName());
        details.setText(filiere.getDetails());
        conditions.setText(filiere.getConditions());
        profile_de_formation.setText(filiere.getProfile_de_formation());
        debouches.setText(filiere.getDebouches());

        download_details();
    }

    private void download_details() {

    }
}
