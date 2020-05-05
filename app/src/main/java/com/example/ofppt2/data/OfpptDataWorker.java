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
        insertSecteur("Bâtiment et Travaux Public","CENTRE DE FORMATION OULED OUJIH");
        insertSecteur("Froid et Génie Thermique","ISTA MAAMORA");
        insertSecteur("NTIC","ISTA MAAMORA");
        insertSecteur("Réparation des Engins à Moteurs","ISTA MAAMORA INDUSTRIEL,Centre de Formation Dans les Métiers de l'Automobile de Kenitra");
        insertSecteur("Génie Electrique","CENTRE DE FORMATION OULED OUJIH,Centre de Formation Dans les Métiers de l'Automobile de Kenitra,ISTA MAAMORA");
        insertSecteur("Plasturgie","Centre de Formation Dans les Métiers de l'Automobile de Kenitra");
        insertSecteur("Administration Gestion et Commerce","ISTA MAAMORA,CENTRE DE FORMATION OULED OUJIH");
        insertSecteur("Construction Métallique","ISTA MAAMORA");
        insertSecteur("Transport et Logistique","CENTRE DE FORMATION OULED OUJIH");
        insertSecteur("Textile Habillement","Centre de Formation Dans les Métiers de l'Automobile de Kenitra");
        insertSecteur("Action Sociale","ISTA MAAMORA");
        insertSecteur("Fabrication Mécanique","ISTA MAAMORA");
        insertSecteur("Arts Graphiques","CENTRE DE FORMATION OULED OUJIH");
        insertSecteur("Aéronautique","Centre de Formation Dans les Métiers de l'Automobile de Kenitra");
    }

    public void insertEtablissements(){
        insertEtablissement("CENTRE DE FORMATION OULED OUJIH","Menuiserie Aluminium,Electricité d'Entretien Industriel,Technicien Comptable d'Entreprises,Technicien Logistique,Technicien Spécialisé en Commerce,Technicien Spécialisé en Gestion des Entreprises,Infographie");
        insertEtablissement("ISTA MAAMORA","Monteur Dépanneur Frigoriste,Agent Technique de Vente,Technicien Comptable d'Entreprises,Technicien en Construction Métallique,Technicien en Froid Commercial et Climatisation,Technicien en Electricité de Maintenance Industrielle,Educateur Spécialisé en Petite Enfance,Technicien Spécialisé en Finance et Comptabilité,Techniques de Secrétariat de Direction,Technicien Spécialisé en Commerce,Technicien Spécialisé en Gestion des Entreprises,Technicien Spécialisé Bureau d'Etude en Construction Métallique,Technicien Spécialisé de Méthodes en Fabrication Mécanique,Technicien Spécialisé en Génie Climatique,Automatisation et Instrumentation Industrielle,Electromécanique des Systèmes Automatisées,Techniques de Développement Informatique,Techniques des Réseaux Informatiques");
        insertEtablissement("ISTA MAAMORA INDUSTRIEL","Carrosserie Peinture Automobile,Réparateur de Véhicules Automobiles,Technicien en Réparation des Engins à Moteur (Option: Automobile),Technico-Commercial en Vente de Véhicules et Pièces de Rechange,Technicien spécialisé en Diagnostic et Electronique Embarquée");
        insertEtablissement("Centre de Formation Dans les Métiers de l'Automobile de Kenitra","Electromécanique,Conducteur de Machines en Plasturgie,Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse,Technicien en Peinture Automobile,Maintenance de Matériel de Confection,Technicien en Construction Métallique,Monteur Régleur en Plasturgie,TS Traitement de surface,Technicien Spécialisé Bureau d’Etudes en Automobile,Maintenance des Machines Outils et Autres Machines de Production Automatisée,Maintenance des Machines et Outillage en Plasturgie,Technicien Spécialisé en Production et Qualité en Automobile,Technicien Spécialisé Bureau d'Etude en Construction Métallique,Usinage sur MOCN option METHODE FAO Outillage de presse,Usinage sur MOCN option USINAGE Outillage de presse,Technicien spécialisé en Diagnostic et Electronique Embarquée,Mécatronique");
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

        long newRowId = Db.insert(NiveauEntry.TABLE_NAME, null, values);
    }

    public void insertSecteur(String name, String etablissements){
        ContentValues values = new ContentValues();
        values.put(SecteurEntry.COLUMN_NAME, name);
        values.put(SecteurEntry.COLUMN_ETABLISEMENTS, etablissements);

        long newRowId = Db.insert(SecteurEntry.TABLE_NAME, null, values);
    }

    public void insertEtablissement(String name, String filieres){
        ContentValues values = new ContentValues();
        values.put(EtablissementEntry.COLUMN_NAME, name);
        values.put(EtablissementEntry.COLUMN_FILIERES, filieres);

        long newRowId = Db.insert(EtablissementEntry.TABLE_NAME, null, values);
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
