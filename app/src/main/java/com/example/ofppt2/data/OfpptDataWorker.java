package com.example.ofppt2.data;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import static com.example.ofppt2.data.OfpptDatabaseContract.*;


public class OfpptDataWorker {
    private SQLiteDatabase Db;

    public OfpptDataWorker(SQLiteDatabase db){
        Db = db;
    }

    public void insertNivaux(){
        insertNiveau("Technicien Spécialisé","Action Sociale,Administration Gestion et Commerce,Construction Métallique,Fabrication Mécanique,Froid et Génie Thermique,Génie Electrique,NTIC,Réparation des Engins à Moteurs,Arts Graphiques,Aéronautique,Plasturgie");
        insertNiveau("Technicien","Administration Gestion et Commerce,Construction Métallique,Froid et Génie Thermique,Génie Electrique,Réparation des Engins à Moteurs,Transport et Logistique,Textile Habillement,Plasturgie");
        insertNiveau("Qualification","Froid et Génie Thermique,Réparation des Engins à Moteurs,Génie Electrique,Plasturgie");
        insertNiveau("Spécialisation","Bâtiment et Travaux Publics");
    }

    public void insertSecteurs(){
        insertSecteur("Bâtiment et Travaux Publics","Menuiserie Aluminium");
        insertSecteur("Froid et Génie Thermique","Monteur Dépanneur Frigoriste,Technicien en Froid Commercial et Climatisation,Technicien Spécialisé en Génie Climatique");
        insertSecteur("Réparation des Engins à Moteurs","Carrosserie Peinture Automobile,Réparateur de Véhicules Automobiles,Technicien en Réparation des Engins à Moteur (Option: Automobile),Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse,Technicien en Peinture Automobile,Technico-Commercial en Vente de Véhicules et Pièces de Rechange,Technicien spécialisé en Diagnostic et Electronique Embarquée,Technicien Spécialisé Bureau d’Etudes en Automobile,Technicien Spécialisé en Production et Qualité en Automobile,Usinage sur MOCN option METHODE FAO Outillage de presse,Usinage sur MOCN option USINAGE Outillage de presse");
        insertSecteur("Génie Electrique","Electricité d'Entretien Industriel,Electromécanique,Technicien en Electricité de Maintenance Industrielle,Automatisation et Instrumentation Industrielle,Electromécanique des Systèmes Automatisées,Maintenance des Machines Outils et Autres Machines de Production Automatisée,Mécatronique");
        insertSecteur("Plasturgie","Conducteur de Machines en Plasturgie,Monteur Régleur en Plasturgie,Maintenance des Machines et Outillage en Plasturgie");
        insertSecteur("Administration Gestion et Commerce","Agent Technique de Vente,Technicien Comptable d'Entreprises,Technicien Spécialisé en Finance et Comptabilité,Techniques de Secrétariat de Direction,Technicien Spécialisé en Commerce,Technicien Spécialisé en Gestion des Entreprises");
        insertSecteur("Construction Métallique","Technicien en Construction Métallique,Technicien Spécialisé Bureau d'Etude en Construction Métallique");
        insertSecteur("Transport et Logistique","Technicien Logistique");
        insertSecteur("Textile Habillement","Maintenance de Matériel de Confection");
        insertSecteur("Action Sociale","Educateur Spécialisé en Petite Enfance");
        insertSecteur("Fabrication Mécanique","Technicien Spécialisé de Méthodes en Fabrication Mécanique");
        insertSecteur("NTIC","Techniques de Développement Informatique,Techniques des Réseaux Informatiques");
        insertSecteur("Arts Graphiques","Infographie");
        insertSecteur("Aéronautique","TS Traitement de surface");
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

    public void insertNiveau(String name, String secteurs){
        ContentValues values = new ContentValues();
        values.put(NiveauEntry.COLUMN_NAME, name);
        values.put(NiveauEntry.COLUMN_SECTEURS, secteurs);

        Db.insert(NiveauEntry.TABLE_NAME, null, values);
    }

    public void insertSecteur(String name, String filiers){
        ContentValues values = new ContentValues();
        values.put(SecteurEntry.COLUMN_NAME, name);
        values.put(SecteurEntry.COLUMN_FILIERES, filiers);

        Db.insert(SecteurEntry.TABLE_NAME, null, values);
    }


    public void insertFiliere(String num_modules, String nom_modules, String nbr_horaire, String details, String debouches, String conditions, String profile_formation, String etablissement){
        ContentValues values = new ContentValues();
        values.put(FiliereEntry.COLUMN_NUM_MODULES, num_modules);
        values.put(FiliereEntry.COLUMN_NOM_MODULES, nom_modules);
        values.put(FiliereEntry.COLUMN_NBR_HORAIRES, nbr_horaire);
        values.put(FiliereEntry.COLUMN_DETAILS, details);
        values.put(FiliereEntry.COLUMN_DEBOUCHES, debouches);
        values.put(FiliereEntry.COLUMN_CONDITIONS, conditions);
        values.put(FiliereEntry.COLUMN_PROFILE_DE_FORMATION, profile_formation);
        values.put(FiliereEntry.COLUMN_ETABISSEMENT, etablissement);

        long newRowId = Db.insert(FiliereEntry.TABLE_NAME, null, values);
    }
}
