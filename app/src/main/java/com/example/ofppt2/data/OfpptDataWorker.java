package com.example.ofppt2.data;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import static com.example.ofppt2.data.OfpptDatabaseContract.*;


public class OfpptDataWorker {
    private SQLiteDatabase Db;

    public OfpptDataWorker(SQLiteDatabase db){
        Db = db;
    }

    public void insertSecteurs(){
        insertSecteur("Action Sociale","");
        insertSecteur("Administration Gestion et Commerce","");
        insertSecteur("Aéronautique","");
        insertSecteur("Agroalimentaire","");
        insertSecteur("Arts Graphiques","");
        insertSecteur("Arts Traditionnels","");
        insertSecteur("Audiovisuel","");
        insertSecteur("Bâtiment et Travaux Public","");
        insertSecteur("Construction Métallique","");
        insertSecteur("Cuir","");
        insertSecteur("Electronique et Electrotechnique","");
        insertSecteur("Fabrication Mécanique","");
        insertSecteur("Froid et Génie Thermique","");
        insertSecteur("Hôtellerie et Tourisme","");
        insertSecteur("Nouvelles Technologies de l’Informatique et de la Communication","");
        insertSecteur("Offshoring","");
        insertSecteur("Paramédical","");
        insertSecteur("Réparation des Engins à Moteurs","");
        insertSecteur("Textile Habillement","");
        insertSecteur("Transport et Logistique","");
        insertSecteur("Sports Equestres","");
    }

    public void insertUser(String cin,String name, String lname, String date, String niveau, String secteure, String etablisement, String filiere){
        ContentValues values = new ContentValues();
        values.put(UserssEntry.COLUMN_CIN, cin);
        values.put(UserssEntry.COLUMN_NAME, name);
        values.put(UserssEntry.COLUMN_LAST_NAME, lname);
        values.put(UserssEntry.COLUMN_DATE_NAIS, date);
        values.put(UserssEntry.COLUMN_NIVEAU, niveau);
        values.put(UserssEntry.COLUMN_SECTEURE, secteure);
        values.put(UserssEntry.COLUMN_ETABLISEMENT, etablisement);
        values.put(UserssEntry.COLUMN_FILIERE, filiere);

        long newRowId = Db.insert(UserssEntry.TABLE_NAME, null, values);
    }

    public void insertSecteur(String name, String etablisements){
        ContentValues values = new ContentValues();
        values.put(SecteurEntry.COLUMN_NAME, name);
        values.put(SecteurEntry.COLUMN_ETABLISEMENTS, etablisements);

        long newRowId = Db.insert(SecteurEntry.TABLE_NAME, null, values);
    }

    public void insertEtablisement(String name, String filieres){
        ContentValues values = new ContentValues();
        values.put(EtablisementEntry.COLUMN_NAME, name);
        values.put(EtablisementEntry.COLUMN_FILIERES, filieres);

        long newRowId = Db.insert(EtablisementEntry.TABLE_NAME, null, values);
    }

    public void insertFiliere(String num_modules, String nom_modules, String nbr_horaire, String details, String debouches, String conditions){
        ContentValues values = new ContentValues();
        values.put(FiliereEntry.COLUMN_NUM_MODULES, num_modules);
        values.put(FiliereEntry.COLUMN_NOM_MODULES, nom_modules);
        values.put(FiliereEntry.COLUMN_NBR_HORAIRES, nbr_horaire);
        values.put(FiliereEntry.COLUMN_DETAILS, details);
        values.put(FiliereEntry.COLUMN_DEBOUCHES, debouches);
        values.put(FiliereEntry.COLUMN_CONDITIONS, conditions);

        long newRowId = Db.insert(FiliereEntry.TABLE_NAME, null, values);
    }
}
