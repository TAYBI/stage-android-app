package com.example.ofppt2.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import static com.example.ofppt2.database.OfpptDatabaseContract.*;


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

    public void insertFiliers(){
        insertFiliere("Techniques de Développement Informatique","M1,M2,M3,M4,M4,M5,M6,M7,M8,M9,M10,M11,M12,M13,M14,M15,M16,M17,M18",
                "Arabe,Communication écrite et orale,Anglais technique,Entrepreneurship,Métier et formation dans les NTIC,L'entreprise et son environnement, Gestion du temps et Production de documents,L'essentiel en technologies de l'information,Bureautique,Programmation structurée,Programmation événementielle et Orientée Objet,Analyse et conception orientée objet,Bases de données,Développement d'application client/serveur,Développement web côté client,Développement web côté serveur,Développement d'applications mobiles,Projet de fin de formation,Moyens de recherche d'emploi,Stage en entreprise",
                "",
                "Le \"Technicien Spécialisé en Développement Informatique\" est un professionnel en charge du développement et de la maintenance des applications informatiques. Il intervient, généralement pour le compte de Sociétés de Services et d’Ingénierie Informatiques, dans de nombreux domaines applicatifs (industrie, gestion, loisirs etc.). En amont du projet, le Technicien est réceptif aux attentes du client. Il étude avec précision un certain nombre de paramètres pour mener à bien sa mission il s'agit notamment du cahier des charges, des capacités de l’environnement technique, ainsi que des contraintes du système de production du client. En aval, Il participe à la mise en exploitation et au support technique de l’application",
                "Après quelques années d’expériences réussies, le Technicien Spécialisé en Développement informatique peut évoluer vers diverses fonctions, selon ses aptitudes et motivations :\n\n • Expert technique : Concepteur, Réalisateur, Architecte logiciel, …\n • Expert métier : Analyste, Responsable d’application,…\n • Encadrement : Chef de projet.\n\nLa création d’une entreprise de services informatiques dans le domaine du développement d’applications constitue pour certains une opportunité.",
                "Age limite : 23 ans\n" +
                            "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                            "Les qualités et aptitudes que le candidat doit posséder :\n" +
                            "\n" +
                            " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                            " • Autonomie\n" +
                            " • Esprit d’analyse et de synthèse\n" +
                            " • Créativité\n" +
                            " • Curiosité pour les nouvelles technologies de l’information\n" +
                            " • Fortes capacités d’adaptation\n" +
                            "\n" +
                            "Mode de sélection des candidats :\n" +
                            "\n" +
                            " • Dossier d’orientation à remplir\n" +
                            " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "Analyse et conception:\n" +
                        "\n" +
                        " • Analyser et Interpréter un cahier des charges\n" +
                        " • Rédiger des spécifications fonctionnelles et techniques\n" +
                        " • Réaliser des maquettes et des prototypes\n" +
                        " • Concevoir des bases de données\n" +
                        " • Concevoir une interface utilisateur dans un environnement Windows (GUI) ou Internet (IUI)\n" +
                        " • Au niveau de la réalisation Technique\n" +
                        " • Réaliser des composants logiciels à l’aide d’un langage de programmation orientée objet\n" +
                        " • Assembler et Intégrer des composants logiciels\n" +
                        " • Réaliser des tests unitaires et tests d’intégration\n" +
                        " • Participer à la mise en exploitation et au support technique de l’application","ISTA MAAMORA");
//        insertFiliere("Menuiserie Aluminium","","","","","","","","");
//        insertFiliere("Techniques de Développement Informatique","","","","","","","","");
//        insertFiliere("Monteur Dépanneur Frigoriste","","","","","","","","");
//        insertFiliere("Carrosserie Peinture Automobile","","","","","","","","");
//        insertFiliere("Réparateur de Véhicules Automobiles","","","","","","","","");
//        insertFiliere("Electricité d'Entretien Industriel","","","","","","","","");
//        insertFiliere("Electromécanique","","","","","","","","");
//        insertFiliere("Conducteur de Machines en Plasturgie","","","","","","","","");
//        insertFiliere("Agent Technique de Vente","","","","","","","","");
//        insertFiliere("Technicien Comptable d'Entreprises","","","","","","","","");
//        insertFiliere("Technicien en Construction Métallique","","","","","","","","");
//        insertFiliere("Technicien en Froid Commercial et Climatisation","","","","","","","","");
//        insertFiliere("Technicien en Electricité de Maintenance Industrielle","","","","","","","","");
//        insertFiliere("Technicien en Réparation des Engins à Moteur (Option: Automobile)","","","","","","","","");
//        insertFiliere("Technicien Logistique","","","","","","","","");
//        insertFiliere("Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse","","","","","","","","");
//        insertFiliere("Technicien en Peinture Automobile","","","","","","","","");
//        insertFiliere("Maintenance de Matériel de Confection","","","","","","","","");
//        insertFiliere("Monteur Régleur en Plasturgie","","","","","","","","");
//        insertFiliere("Educateur Spécialisé en Petite Enfance","","","","","","","","");
//        insertFiliere("Technicien Spécialisé en Finance et Comptabilité","","","","","","","","");
//        insertFiliere("Techniques de Secrétariat de Direction","","","","","","","","");
//        insertFiliere("Technicien Spécialisé en Commerce","","","","","","","","");
//        insertFiliere("Technicien Spécialisé en Gestion des Entreprises","","","","","","","","");
//        insertFiliere("Technicien Spécialisé Bureau d'Etude en Construction Métallique ","","","","","","","","");
//        insertFiliere("Technicien Spécialisé de Méthodes en Fabrication Mécanique","","","","","","","","");
//        insertFiliere("Technicien Spécialisé en Génie Climatique","","","","","","","","");
//        insertFiliere("Automatisation et Instrumentation Industrielle","","","","","","","","");
//        insertFiliere("Electromécanique des Systèmes Automatisées","","","","","","","","");
//        insertFiliere("Techniques des Réseaux Informatiques","","","","","","","","");
//        insertFiliere("Technico-Commercial en Vente de Véhicules et Pièces de Rechange","","","","","","","","");
//        insertFiliere("Technicien spécialisé en Diagnostic et Electronique Embarquée","","","","","","","","");
//        insertFiliere("Infographie","","","","","","","","");
//        insertFiliere("TS Traitement de surface","","","","","","","","");
//        insertFiliere("Technicien Spécialisé Bureau d’Etudes en Automobile","","","","","","","","");
//        insertFiliere("Maintenance des Machines Outils et Autres Machines de Production Automatisée","","","","","","","","");
//        insertFiliere("Maintenance des Machines et Outillage en Plasturgie","","","","","","","","");
//        insertFiliere("Technicien Spécialisé en Production et Qualité en Automobile","","","","","","","","");
//        insertFiliere("Technicien Spécialisé Bureau d'Etude en Construction Métallique","","","","","","","","");
//        insertFiliere("Usinage sur MOCN option METHODE FAO Outillage de presse","","","","","","","","");
//        insertFiliere("Usinage sur MOCN option USINAGE Outillage de presse","","","","","","","","");
//        insertFiliere("Mécatronique","","","","","","","","");

//        "Menuiserie Aluminium "
//        "Monteur Dépanneur Frigoriste "
//        "Carrosserie Peinture Automobile "
//        "Réparateur de Véhicules Automobiles "
//        "Electricité d'Entretien Industriel "
//        "Electromécanique"
//        "Conducteur de Machines en Plasturgie"
//        "Agent Technique de Vente "
//        "Technicien Comptable d'Entreprises "
//        "Technicien en Construction Métallique "
//        "Technicien en Froid Commercial et Climatisation "
//        "Technicien en Electricité de Maintenance Industrielle "
//        "Technicien en Réparation des Engins à Moteur (Option: Automobile) "
//        "Technicien Logistique "
//        "Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse"
//        "Technicien en Peinture Automobile "
//        "Maintenance de Matériel de Confection"
//        "Monteur Régleur en Plasturgie "
//        "Educateur Spécialisé en Petite Enfance"
//        "Technicien Spécialisé en Finance et Comptabilité"
//        "Techniques de Secrétariat de Direction "
//        "Technicien Spécialisé en Commerce "
//        "Technicien Spécialisé en Gestion des Entreprises "
//        "Technicien Spécialisé Bureau d'Etude en Construction Métallique "
//        "Technicien Spécialisé de Méthodes en Fabrication Mécanique "
//        "Technicien Spécialisé en Génie Climatique "
//        "Automatisation et Instrumentation Industrielle "
//        "Electromécanique des Systèmes Automatisées "
//        "Techniques de Développement Informatique "
//        "Techniques des Réseaux Informatiques "
//        "Technico-Commercial en Vente de Véhicules et Pièces de Rechange "
//        "Technicien spécialisé en Diagnostic et Electronique Embarquée "
//        "Infographie "
//        "TS Traitement de surface "
//        "Technicien Spécialisé Bureau d’Etudes en Automobile "
//        "Maintenance des Machines Outils et Autres Machines de Production Automatisée"
//        "Maintenance des Machines et Outillage en Plasturgie "
//        "Technicien Spécialisé en Production et Qualité en Automobile"
//        "Technicien Spécialisé Bureau d'Etude en Construction Métallique"
//        "Usinage sur MOCN option METHODE FAO Outillage de presse"
//        "Usinage sur MOCN option USINAGE Outillage de presse"
//        "Mécatronique"
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


    public void insertFiliere(String name, String num_modules, String nom_modules, String nbr_horaire, String details, String debouches, String conditions, String profile_formation, String etablissement){
        ContentValues values = new ContentValues();
        values.put(FiliereEntry.COLUMN_NAME, name);
        values.put(FiliereEntry.COLUMN_NUM_MODULES, num_modules);
        values.put(FiliereEntry.COLUMN_NOM_MODULES, nom_modules);
        values.put(FiliereEntry.COLUMN_NBR_HORAIRES, nbr_horaire);
        values.put(FiliereEntry.COLUMN_DETAILS, details);
        values.put(FiliereEntry.COLUMN_DEBOUCHES, debouches);
        values.put(FiliereEntry.COLUMN_CONDITIONS, conditions);
        values.put(FiliereEntry.COLUMN_PROFILE_DE_FORMATION, profile_formation);
        values.put(FiliereEntry.COLUMN_ETABISSEMENT, etablissement);

        Db.insert(FiliereEntry.TABLE_NAME, null, values);
    }
}
