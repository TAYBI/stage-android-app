package com.example.ofppt2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ofppt2.classes.Filiere;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Filiere_info extends AppCompatActivity{

    private static final int STORAGE_CODE = 1000;

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

        handle_download_click();
    }

    private void handle_download_click() {
        telecharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                        String[] permeessions  = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permeessions, STORAGE_CODE);
                    }
                    else {
                        download_details();
                    }
                }
                else {
                    download_details();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case STORAGE_CODE:{
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    download_details();
                }else {
                    Toast.makeText(this, "Permission denied ... ☹ !", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void download_details() {
        String filename = new SimpleDateFormat("yyyyMMdd__HHmmss", Locale.getDefault()).format(System.currentTimeMillis());
        String path = Environment.getExternalStorageDirectory() + "/" + filename + ".pdf";
        File file =  new File(path);
        Document document = new Document(PageSize.A4);

        try{
            PdfWriter.getInstance(document, new FileOutputStream(file.getAbsoluteFile()));
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage() + path, Toast.LENGTH_SHORT).show();
        }

        document.open();

        Paragraph header = new Paragraph(filiere.getName(), FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD,
                new CMYKColor(0, 0, 0,255)));
        header.setAlignment(Element.ALIGN_CENTER);

        PdfPTable table = fill_table();


        try {
//            PdfWriter.getInstance(document, new FileOutputStream(path));

            document.add(header);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(filiere.getDetails()));
            line(document);

            make_paragraph(document, "Profil de la formation", filiere.getProfile_de_formation());
            line(document);

            make_paragraph(document, "Conditions d’admission: ", filiere.getConditions());
            line(document);

            make_paragraph(document, "Débouchés: ", filiere.getDebouches());
            line(document);

            document.add(make_title("Programme de formation: "));
            document.add(new Paragraph(" "));
            document.add(table);

        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, filename + " is saved to\n" + path, Toast.LENGTH_SHORT).show();
        document.close();

//        finally {
        try{
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//            Uri fileUri  = Uri.fromFile( file );
            Uri fileUri  = FileProvider.getUriForFile(this, BuildConfig.APPLICATION_ID + ".provider", file);
            intent.setDataAndType( fileUri, "application/pdf" );
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(this, e.getMessage() + path, Toast.LENGTH_SHORT).show();
        }
        finally {
            Toast.makeText(this, filename + " is saved to\n" + path, Toast.LENGTH_SHORT).show();
        }
//        }
    }

    private void make_paragraph(Document document, String title, String body) {
        try {
            document.add(make_title(title));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(body));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private void line(Document document) {
        try {
            document.add(new Paragraph(" "));
            document.add(new LineSeparator(0.5f, 100, null, 0, -5));
            document.add(new Paragraph(" "));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private PdfPTable fill_table() {
        PdfPTable table = new PdfPTable(3);
        try {
            table.setTotalWidth(500);
            table.setWidths(new float[] {1, 3, 1});
            table.setLockedWidth(true);
            PdfPCell c1 = new PdfPCell(make_table_header("N° Module"));
            PdfPCell c2 = new PdfPCell(make_table_header("Modules"));
            PdfPCell c3 = new PdfPCell(make_table_header("Total"));
            c1.setPadding(10);
            c2.setPadding(10);
            c3.setPadding(10);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(c3);

            List<String>  num_modules = stringToList(filiere.getNumModule());
            List<String>  nom_modules = stringToList(filiere.getNomModule());
            for(int i =0; i < num_modules.size(); i ++){
                c1 = new PdfPCell(new Paragraph(num_modules.get(i)));
                c2 = new PdfPCell(new Paragraph(nom_modules.get(i)));
                c3 = new PdfPCell(new Paragraph("xx"));
                c1.setPadding(8);
                c2.setPadding(8);
                c3.setPadding(8);
                table.addCell(c1);
                table.addCell(c2);
                table.addCell(c3);
            }
        } catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return table;
    }

    private Paragraph make_table_header(String s) {
        Paragraph title = new Paragraph(s, FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD,
                new CMYKColor(0, 0, 0,255)));
        return title;
    }

    private Paragraph make_title(String s) {
        Paragraph title = new Paragraph(s, FontFactory.getFont(FontFactory.HELVETICA, 15, Font.BOLD,
                new CMYKColor(0, 0, 0,255)));
        return title;
    }

    private List<String> stringToList(String s) {
        return Arrays.asList(s.split(",",50));
    }
}
