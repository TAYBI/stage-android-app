package com.example.ofppt2;

import android.os.Environment;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ofppt2.classes.Filiere;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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

//        download_details();
        handle_download_click();
    }

    private void handle_download_click() {
        telecharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download_details();
            }
        });
    }

    private void download_details() {
        Document document = new Document();
        String filename = new SimpleDateFormat("yyyyMMdd__HHmmss", Locale.getDefault()).format(System.currentTimeMillis());
        String path = Environment.getExternalStorageDirectory() + "/" + filename + ".pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();

            Paragraph title = new Paragraph(filiere.getName(), FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,
                    new CMYKColor(0, 255, 255,17)));
            title.setAlignment(Element.ALIGN_CENTER);

            PdfPTable table = new PdfPTable(3);
            PdfPCell c1 = new PdfPCell(new Paragraph("N° Module"));
            PdfPCell c2 = new PdfPCell(new Paragraph("Modules"));
            PdfPCell c3 = new PdfPCell(new Paragraph("Total"));
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            List<String>  num_modules = stringToList(filiere.getNumModule());
            List<String>  nom_modules = stringToList(filiere.getNomModule());
            for(String num_module: num_modules){

            }

            document.add(title);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(filiere.getDetails()));
            document.add(new Paragraph(" "));
            document.add(table);

            document.close();
            Toast.makeText(this, filename + " is saved to\n" + path, Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private List<String> stringToList(String s) {
        return Arrays.asList(s.split(",",50));
    }
}
