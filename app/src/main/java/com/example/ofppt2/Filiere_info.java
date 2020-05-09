package com.example.ofppt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ofppt2.classes.Filiere;

public class Filiere_info extends AppCompatActivity {

    Filiere filiere;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filiere_info);

        filiere = getIntent().getParcelableExtra ("Filiere");
        title = (TextView) findViewById(R.id.title);
        title.setText(filiere.getName());
    }
}
