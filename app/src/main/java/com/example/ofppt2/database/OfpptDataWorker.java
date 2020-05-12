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
                        " • Participer à la mise en exploitation et au support technique de l’application");
        insertFiliere("Menuiserie Aluminium","","","","L’Ouvrier Spécialisé en Menuiserie Aluminium est un professionnel capable de réaliser l’assemblage en atelier des cadres en aluminium et de les mettre en place dans les chantiers de construction.",
                "L’Ouvrier Spécialisé en Menuiserie Aluminium peut être employé dans une PME ou dans une grande entreprise. Il peut également créer sa propre entreprise.",
                        "Age limite : de 15 à 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 6ème année de l’Enseignement Fondamental et plus\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " •  Bonne dextérité\n" +
                        " •  Méticuleux\n" +
                        " •  Esprit créatif\n" +
                        "\n" +
                        "Contre indications :\n" +
                        "\n" +
                        " • Troubles moteurs des membres inférieurs ou supérieurs\n" +
                        " • Vertige\n" +
                        "\n" +
                        " • Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                        "Le programme de formation est étalé sur 1150 heures dont un stage d’application de 4 mois en entreprise.\n" +
                        "\n" +
                        "Modules :\n" +
                        "\n" +
                        " • Métier et formation en menuiserie aluminium\n" +
                        " • Aluminium dans le bâtiment\n" +
                        " • Les produits verriers\n" +
                        " • Devis descriptif, quantitatif, et estimatif.\n" +
                        " • Etudes d’une gamme y compris occultation et fermeture\n" +
                        " • Fabrication et usinage\n" +
                        " • Pose de la menuiserie aluminium sur chantier.\n" +
                        " • Plan d’hygiène et de sécurité\n" +
                        " • Stage en entreprise");
        insertFiliere("Monteur Dépanneur Frigoriste","","","","Le Monteur Dépanneur Frigoriste est un ouvrier chargé d’assurer l’entretien, le dépannage et le montage des installations frigorifiques de petite et moyenne puissance. Il exerce son métier au sein des entreprises d’installation et de maintenance en froid commercial (souvent de petites entreprises à structure légère).",
                "Le lauréat peut être employé dans les PME ou dans une grande entreprise dans les secteurs industriels les plus divers. Il peut être affecté dans les services techniques du secteur public. Il peut également créer sa propre entreprise.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis :\n" +
                        "\n" +
                        " • 3ème année de l’Enseignement collégial \n" +
                        "\n" +
                        "Ou Diplôme du niveau Spécialisation dans les secteurs Industriel et du BTP\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n\n" +
                        " • Bonne dextérité\n" +
                        " • Méticuleux\n" +
                        " • Esprit créatif.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        "\n • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Réaliser le montage d’installations frigorifiques simples, utilisées principalement pour la conservation des denrées alimentaires (chambres froides\n" +
                        "vitrines réfrigérées comptoirs ou armoires frigorifiques…)\n" +
                        " • Mettre au point des chambres froides de petites ou moyennes puissances\n" +
                        " • Mettre en service, maintenir, entretenir et dépanner des équipements de froid et de climatisation grand public\n" +
                        " • Dépanner et apporter les modifications nécessaires à leur bon fonctionnement\n" +
                        " • Procéder aux opérations d’entretien courantes\n" +
                        " • Maintenir et remplacer les éléments défectueux si nécessaire");
        insertFiliere("Carrosserie Peinture Automobile","","","",
                "Le Carrossier Peintre est un professionnel chargé de remettre en état les carrosseries et peintures qui composent le véhicule automobile. A l’issue de sa formation, l’appelant sera capable de réaliser des réparations simples, des opérations de remise en état par remplacement d’éléments ou par réparation, de faire les essais nécessaires avant et après les travaux et de réaliser l’autocontrôle de la qualité des travaux entrepris.",
                "Le lauréat peut prétendre au poste de responsable du service Carrosserie Peinture d’un parc automobile dans une grande entreprise ou un grand garage. Il peut également lancer sa propre entreprise dans le domaine de la Carrosserie Peinture.",
                        "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 3ème année de l’Enseignement collégial\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de l'organisation\n" +
                        " • Sociabilité\n" +
                        " • Sens de responsabilité\n" +
                        " • Conscience professionnelle élevée\n" +
                        " • Bonne capacité d'adaptation\n" +
                        "\n" +
                        "\nContre-indications à l'exercice du métier:\n" +
                        " • Allergie au bruit\n" +
                        " • Allergie aux odeurs d’hydrocarbure\n" +
                        " • Maladies pulmonaires\n" +
                        " • Allergie à la peinture et ses produits\n" +
                        " • Non distinction des couleurs.\n" +
                        "\n" +
                        " • Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n\n" +
                        " • Appliquer les règles d’hygiène et de sécurité de travail\n" +
                        " • Catégoriser les différents types de véhicules automobiles et leurs composants\n" +
                        " • Interpréter des dessins d’ensemble des plans mécaniques et plans de soubassement\n" +
                        " • Effectuer des travaux de soudage\n" +
                        " • Déposer, reposer, régler des éléments amovibles\n" +
                        " • Repérer, remplacer des vitrages\n" +
                        " • Effectuer des travaux de réparation des matériaux composites\n" +
                        " • Appliquer les différents produits en carrosserie automobile\n" +
                        " • Appliquer les différents produits utilisés en peinture automobile\n" +
                        " • Monter et corriger tous types de teintes\n" +
                        " • Appliquer une laque\n" +
                        " • Effectuer les travaux de bases en carrosserie automobile");
        insertFiliere("Réparateur de Véhicules Automobiles","","","",
                "Le \"Réparateur de Véhicules Automobiles\" est un spécialiste de la réparation automobile qui possède le savoir, les habilités et les qualifications nécessaires pour exécuter les réparations liées aux systèmes. Celles-ci concernent la propulsion, le freinage, la suspension, le guidage, la sécurité et le confort des passagers.",
                "Le lauréat peut prétendre au poste de responsable de maintenance d’un parc automobile dans une grande entreprise ou un grand garage.Il peut également ouvrir son propre garage moyennant une bonne expérience.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 3ème année de l’enseignement collégial ou plus\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de l'organisation.\n" +
                        " • Rigueur de l'intellectuel\n" +
                        " • Autonomie et capacité d'initiative\n" +
                        " • Sociabilité\n" +
                        " • Sens de responsabilité\n" +
                        " • Conscience professionnelle\n" +
                        " • Bonne capacité d'adaptation.\n" +
                        "\n" +
                        "Contre-indications à l'exercice du métier:\n" +
                        " • Les affections graves du squelette\n" +
                        " • Les déficiences de la vision et de l'ouïe (après correction)\n" +
                        " • L'épilepsie, le vertige, les pertes de mémoires\n" +
                        " • Allergie aux bruits mécaniques\n" +
                        " • Allergie aux odeurs d’hydrocarbures.\n" +
                        " \n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                        "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Appliquer les règles d’hygiène et de sécurité au travail\n" +
                        " • Effectuer les travaux de base en fabrication mécanique\n" +
                        " • Interpréter des dessins d’ensembles et plans mécaniques\n" +
                        " • Etudier les moteurs thermiques\n" +
                        " • Repérer le système de refroidissement et de graissage\n" +
                        " • Repérer des moteurs à essence et diesel\n" +
                        " • Analyser le fonctionnement des différents circuits électriques\n" +
                        " • Effectuer la maintenance préventive\n" +
                        " • Exploiter les schémas électriques\n" +
                        " • Effectuer la maintenance des systèmes électriques\n" +
                        " • Utiliser les règles de mécanique appliquée\n" +
                        " • Repérer les éléments de la transmission\n" +
                        " • Repérer le système de suspension\n" +
                        " • Repérer le système de direction\n" +
                        " • Repérer le système de freinage");
        insertFiliere("Electricité d'Entretien Industriel","","","",
                "L’Ouvrier Qualifié en Electricité d’Entretien Industriel est un professionnel polyvalent capable d’assurer l’installation, le raccordement, la réparation et le dépannage des équipements électriques des entreprises industrielles.",
                "Après quelques années d’expérience, de formation continue et après avoir démontré ses compétences professionnelles, l’Ouvrier Qualifié en Electricité d’Entretien Industriel se verra confié des responsabilités plus importantes au niveau de l’autonomie et de la gestion des difficultés techniques et des interventions, ainsi que de la gestion du parc de matériel de l’entreprise. Il pourra exercer la fonction de responsable d’achat pièces de rechange. Il peut également créer une entreprise de maintenance des équipements électriques.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 3ème année de l’Enseignement Collégial Ou diplôme du niveau de spécialisation dans le secteur Industriel .\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Bonne dextérité\n" +
                        " • Méticuleux\n" +
                        " • Esprit créatif\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "L’Ouvrier Qualifié en Electricité d’Entretien Industriel doit être capable de :\n" +
                        " • Installer des canalisations électriques\n" +
                        " • Installer des conducteurs, câbles, boîtes et accessoires\n" +
                        " • Installer, raccorder et entretenir des luminaires\n" +
                        " • Dépanner  • des machines électriques tournantes\n" +
                        " • Raccorder et dépanner des commandes manuelles de moteurs à c c et à ca \n" +
                        " • Installer et raccorder des transformateurs\n" +
                        " • Raccorder et entretenir un système d’urgence\n" +
                        " • Installer l’appareillage de chauffage électrique\n" +
                        " • Installer des systèmes d’alarme et de signalisation\n" +
                        " • Installer du matériel téléphonique\n" +
                        " • Repérer des installations et de l’équipement électrique\n" +
                        " • dRaccorder et dépanner des commandes automatiques de moteurs à c c et à ca");
        insertFiliere("Electromécanique","","","",
                "\n" +
                        "\n" +
                        "\"L’Ouvrier Qualifié en Electromécanique\" est un professionnel qui est amené à intervenir sur des systèmes mécaniques, hydrauliques, électriques et électroniques.\n",
                "Après quelques années d’expérience en entreprise après et avoir démontré ses compétences professionnelles, l’Ouvrier Qualifié en Electromécanique se verra confié des responsabilités plus importantes au niveau de la gestion des difficultés techniques des interventions notamment la maintenance des installations électromécanique",
                        "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis :\n" +
                        " • 3ème année de l’Enseignement Collégial\n" +
                        "Ou\n" +
                        " • diplôme du niveau de spécialisation dans le secteur Industriel\n" +
                        "\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        " • Bonne dextérité\n" +
                        " • Méticuleux\n" +
                        " • Esprit créatif\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                        "A l’issue de la formation, l’Ouvrier Qualifié en Electromécanique doit être capable de :\n" +
                        " • Monter et raccorder des tuyaux, des tubes et des boyaux\n" +
                        " • Monter des circuits pneumatiques\n" +
                        " • Monter et ajuster des arbres, des roulements et coussinets\n" +
                        " • Dépanner des moteurs et des génératrices à courant continu et leurs dispositifs de commande\n" +
                        " • Entretenir et Repérer des accessoires de transmission et de transformation du mouvement\n" +
                        " • Dépanner des moteurs et des génératrices à courant alternatif et leurs dispositifs de commande\n" +
                        " • Entretenir et Repérer des dispositifs de transmission d’énergie mécanique\n" +
                        " • Dépanner des compresseurs et des moteurs pneumatiques\n" +
                        " • Monter des circuits hydrauliques\n" +
                        " • Dépanner des pompes et des moteurs hydrauliques\n" +
                        " • Entretenir et dépanner un système électromécanique");
        insertFiliere("Conducteur de Machines en Plasturgie","","","",
                "Le rôle principal du \"Conducteur de Machines en Plasturgie\" est d’optimiser la production de ses machines dans l’atelier ou dans l’îlot de production. A cet effet, il gère de nombreux aspects relatifs à ces machines, à savoir:\n" +
                        "le réglage, l'autocontrôle des pièces, l'emballage et le conditionnement des produits, ainsi que la maintenance de 1er niveau.",
                "Après quelques années d’expérience et avoir démontré ses compétences professionnelles, le Conducteur de Machines en Plasturgie verra sa situation évoluer vers le poste plus valorisant de Régleur de Machines en Plasturgie.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 3ème année de l’Enseignement Collégial ou plus.Oudiplôme du niveau de spécialisation dans le secteur Industriel.\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Contre-indications à l'exercice du métier: handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladies nerveuses, asthme.\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Conduire et régler sa machine\n" +
                        " • Assurer l’autocontrôle en cours de production\n" +
                        " • Emballer les pièces produites\n" +
                        " • Assurer la maintenance de premier niveau de sa machine\n" +
                        " • Remplir les feuilles de suivi de la qualité et de production\n" +
                        " • Assister le régleur dans le montage et le démontage de l’outillage");
        insertFiliere("Agent Technique de Vente","","","",
                "L’Agent Technique de Vente intervient en Magasin ou dans les Grandes Surfaces. Il participe à l’accroissement de l’activité de vente, tout en lui apportant une dimension qualitative. La relation client étant l’une des pièces maitresses de l’entreprise, il est important d’assurer le suivi de la clientèle en vue de la fidéliser.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, l’Agent Technique de Vente se verra confié le poste de chef de secteur de vente, chef de produit ou responsable d’une équipe de vendeurs. Il peut également évoluer vers les métiers de la logistique.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis :\n" +
                        "\n" +
                        " • 2ème année du Baccalauréat toutes séries\n" +
                        " • ou diplôme : Employé (e) d’étages niveau qualification \n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission\n" +
                        " • Test de français pour Titulaires du diplôme d’employé(e) d’étages",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "Utiliser les techniques de gestion Utiliser les outils de la bureautique Maîtriser les techniques de vente Appliquer les techniques d’organisation concernant le magasin Gérer les stocks et les approvisionnements du Magasin Maîtriser les procédures d’enregistrement journalier des ventes Maîtriser l’arithmétique commerciale Rédiger une correspondance commerciale arabe et française  Appliquer les principes de base en marketing et plus particulièrement en Marchandisage");
        insertFiliere("Technicien Comptable d'Entreprises","","","",
                "Le Technicien Comptable d’Entreprise prend en charge de nombreuses tâches qui incombent au service de la comptabilité comme le traitement et l’analyse comptable, et participe à la mise en place du système d’information comptable de l’entreprise.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, le Technicien Comptable d’Entreprise peut prendre la responsabilité de la comptabilité au niveau d’une PME ou seconder le chef comptable dans les grandes structures. Il peut également exercer pour son propre compte en créant un bureau fiduciaire et obtenir le titre de comptable agréé.",
                "Age limite: 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 2ème année du Baccalauréat toutes séries\n" +
                        "Mode de sélection des candidats :\n" +
                        "\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "Enregistrer les opérations en comptabilité et établir les situations périodiques Réaliser les opérations de fin d’exercice et établir les documents de synthèse Etablir les déclarations fiscales, courantes et annuelles Préparer et établir les paies et déclarations sociales Assurer la gestion de la trésorerie et établir les budgets Présenter et commenter les situations comptables et documents d’aide à la gestion Assurer le suivi administratif des opérations commerciales, établir les devis, factures Participer à la gestion des stocks Assurer le suivi administratif et financier du personnel Contribuer au suivi juridique des obligations de la société Participer aux choix de logiciels et d’équipements informatiques Tenir les tableaux de bord");
        insertFiliere("Technicien en Construction Métallique","","","",
                "La fonction principale du Technicien en Construction Métallique est de Préparer la fabrication, et de réaliser des constructions métalliques en totale autonomie sur les équipements traditionnels et à commandes numériques.",
                "\n" +
                        "Le Technicien en Construction Métallique peut, selon les aptitudes qu’il démontre, progresser vers un poste à responsabilité comme: chef de groupe, contremaître, chef d’équipe.",
                "Age limite : 25 ans\n" +
                        "Niveau scolaire minimum requis : 2ème année du baccalauréat (ex – 3ème Année Secondaire) scientifique et technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiatives\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d’exécuter les tâches suivantes :\n" +
                        " • Préparer la fabrication de la construction métallique\n" +
                        " • Réaliser la fabrication de la construction métallique\n" +
                        " • Maintenir en bon état de fonctionnement les équipements de l’atelier de fabrication");
        insertFiliere("Technicien en Froid Commercial et Climatisation","","","",
                "Le Technicien en Froid Commercial et Climatisation est un professionnel qui travaille principalement dans les entreprises d’Installation et de Maintenance en Froid Commercial, en chantier chez les clients (commerces alimentaires de détail et petites industries agroalimentaires). Il agit également dans les services d’entretien des collectivités et notamment dans les hôtels.",
                "Le Technicien en Froid Commercial et Climatisation peut être employé dans les entreprises prestataires de services, dans les collectivités ou dans les services de maintenance en froid commercial et climatisation.La création d’une entreprise est tout à fait possible pour les éléments dynamiques.\n",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 2ème année du baccalauréat scientifique ou technique Ou Diplôme du niveau Qualification dans les secteurs Industriel et du BTP\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Monter les chambres froides préfabriquées ou mettre en place des armoires et des vitrines réfrigérées\n" +
                        " • Monter des installations frigorifiques simples ou complexes, monter des tuyauteries, souder, braser, monter des appareils, essayer et contrôler le fonctionnement des installations\n" +
                        " • Dépanner les installations, rechercher les anomalies de fonctionnement, diagnostiquer la panne, relever et contrôler les caractéristiques de fonctionnement");
        insertFiliere("Technicien en Electricité de Maintenance Industrielle","","","",
                "Le technicien en électricité de maintenance industrielle est un professionnel qui est amené à assurer l’installation, la maintenance et l’entretien des équipements électriques industriels.",
                        "Après quelques années d’expérience, de formation continue et après avoir démontré ses compétences et sa conscience professionnelle, ce technicien se verra confier des responsabilités plus grandes en termes d’autonomie et de gestion des difficultés techniques. Il peut facilement créer sa propre entreprise, sur des activités bien ciblées: maintenance des transformateurs et installations d’équipements électriques par exemple.",
                        "Age maximum : 30 ans\n" +
                        "\n" +
                        "Niveau Scolaire minimum : 2ème année du baccalauréat scientifique ou technique\n" +
                        "Ou Diplôme du niveau Qualification dans le secteur Industriel\n" +
                        "Aptitudes et qualités exigées pour l’exercice du métier :\n" +
                        "\n" +
                        " • Sens des responsabilités, de l’organisation et de la discipline\n" +
                        " • Esprit d’autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Bonne aptitude aux relations humaines\n" +
                        " • Maîtrise de soi, motivation pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Mode de sélection des candidats à la formation :\n" +
                        " • Remplissage du dossier d’orientation\n" +
                        " • Réussite aux tests d’admission ",
                        "A l'issue de la formation, le stagiaire sera en mesure d'exécuter les opérations et les activités suivantes:\n" +
                        "\n" +
                        " • Installer des câbles et des canalisations\n" +
                        " • Installer des sorties d’éclairage et des prises de courant utilitaires\n" +
                        " • Installer, raccorder et entretenir des luminaires\n" +
                        " • Installer et entretenir des commandes à très basse tension\n" +
                        " • Installer, raccorder et entretenir des transformateurs\n" +
                        " • Installer, entretenir des systèmes d’alarme et de signalisation\n" +
                        " • Utiliser l’automate programmable -Installer et dépanner des moteurs et de génératrices à CC\n" +
                        " • Installer et dépanner des moteurs et de génératrices à CA\n" +
                        " • Installer, réparer des commandes électroniques des moteurs\n" +
                        " • Installer un système électrique commandé par API");
        insertFiliere("Technicien en Réparation des Engins à Moteur (Option: Automobile)",
                "","",""
                ,"Le \"Technicien en Réparation des Engins à Moteur, Option Automobile\" est un professionnel est chargé de l'accueil du client, la réception des véhicules, et de gèrer les aspects organisationnels de l'atelier Il remet en état les systèmes mécaniques, électriques et électroniques composants le véhicule automobile.Le Technicien en Répération des Engins à Moteur est en mesure de réaliser des diagnostics, de réaliser les opérations de remise en conformité (remplacement ou réparation), de faire les essais nécessaires avant et après les travaux, et de réaliser l’autocontrôle de la qualité des travaux entrepris.",
              "Le lauréat peut prétendre au poste de responsable de maintenance d’un parc automobile dans une grande entreprise ou un grand garage. Il peut également ouvrir son propre garage moyennant une certaine expérience.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 2ème année du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :- Rigueur et précision du raisonnement logique\n" +
                        "\n" +
                        " • Esprit d'analyse et de synthèse\n" +
                        " • Sens de l'organisation.\n" +
                        " • Autonomie et capacité d'initiative\n" +
                        " • Sociabilité\n" +
                        " • Sens de responsabilité\n" +
                        " • Conscience professionnelle élevée\n" +
                        " • Bonne capacité d'adaptation.\n" +
                        "\n" +
                        "Contre-indications à l'exercice du métier :\n" +
                        " • Tout handicap moteur important\n" +
                        " • Troubles de la vue et de l'ouïe non corrigés.\n" +
                        " • Allergies au bruit et aux odeurs d’hydrocarbures\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                        "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Appliquer les bases d’ajustage\n" +
                        " • Souder et découper au gaz et à l’arc\n" +
                        " • Lire et Interpréter des plans et documents techniques\n" +
                        " • Etudier des moteurs thermiques\n" +
                        " • Repérer des moteurs à combustion interne\n" +
                        " • Entretenir et remettre en conformité les systèmes de :\n" +
                        " • Production d'énergie annexe\n" +
                        " • refroidissement et de lubrification\n" +
                        " • D'allumage\n" +
                        " • d'alimentation en carburant\n" +
                        " • de suspension\n" +
                        " • de freinage\n" +
                        " • de direction\n" +
                        " • de transmission de puissance\n" +
                        " • Entretenir et remettre en conformité un système de régulation de température\n" +
                        " • Appliquer les principes d’électricité et d’électronique aux véhicules à moteur\n" +
                        " • Analyser des polluants résultants de la combustion\n" +
                        " • Utiliser les méthodes et les outils de diagnostic\n" +
                        " • Organiser un atelier\n" +
                        " • Organiser et gérer la maintenance d'un parc");
        insertFiliere("Technicien Logistique","","","",
                "Le Technicien en Logistique est chargé des opérations de réception, de mise en stock, de préparation des commandes et d’expédition des marchandises. Il assure également le suivi du parc des engins de manutention et peut être amené à en conduire lui-même. Il coordonne, anime et régule le travail d’une ou de plusieurs équipes d’opérateurs en fonction de la charge de travail.Le Technicien en Logistique exerce son activité notamment dans les entrepôts dédiés ou chez des prestataires de services, les dépôts de stockage des entreprises de production ou sur des plateformes logistiques.",
                "Le Technicien en Logistique peut travailler dans toute entreprise comportant une activité de stockage, qu’elle soit industrielle ou commerciale. Il peut prétendre, après quelques années d’expérience, à un poste de chef d’équipe, de responsable de magasin ou de responsable de dépôt.",
                "- Age limite : 30 ans maximum- Niveau scolaire minimum requis : 2ème année du Baccalauréat scientifique ou technique Les qualités et aptitudes que le candidat doit posséder : Conscience professionnelle Sens de l'organisation Esprit méthodique Autonomie Sens de la responsabilité Travail en équipe Sens de la communication Souci permanent de la sécurité. Capacité d’utiliser les moyens de manutention manuels ou mécanisés Mode de sélection des candidats : Présélection sur dossier Evaluation sur la base des batteries de tests Entretien individuel",
                "A l’issue de la formation, le stagiaire sera en mesure d’exécuter les opérations et les activités suivantes  Organiser les activités de réception et de déchargement  Ranger les produits en stock Organiser les opérations de préparation des commandes Organiser les activités d’expédition et de chargement Affecter les moyens humains et matériels  Utiliser des chariots automoteurs de manutention à conducteur porté catégories 1, 3 et 5.");
//        insertFiliere("Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse","","","","","","","");
        insertFiliere("Technicien en Peinture Automobile","","","",
                "Le Technicien en Peinture Automobile est un professionnel chargé de l’accueil du client, participe à l’élaboration d’une expertise et d’un devis, diagnostique l’état du véhicule. Il prépare le véhicule en améliorant la qualité de la surface et applique notamment une couche anticorrosion, il prépare la peinture, maitrise les techniques d’application de peinture adaptées aux différents supports (composite, acier, aluminium) mais également des produits conforme aux nouvelles normes (peinture à l’eau), Il recherche la teinte exacte grâce aux documents techniques et à l’outil informatique. C’est ensuite l’application de la peinture en cabine avec un matériel de protection. Minutieux et rigoureux, le peintre automobile doit réaliser des retouches invisibles ou effectue des raccords. Pour cela il doit avoir une excellente vision des couleurs.La maîtrise de la gestion et le stocke en approvisionnement.",
                "Le travail du peintre en automobile est généralement exécuté seul.La formation a pour objectif de former des techniciens d’atelier pour exercer :\n" +
                        " • dans des entreprises de carrosserie constructeur\n" +
                        " • chez les fabricants de peinture\n" +
                        " • dans les ateliers des parcs automobiles (concessions, filiales, succursales)\n" +
                        " • Il peut également lancer sa propre entreprise. Il peut être en relation avec le client, l’expert ou les fournisseurs de matière première ou les équipementiers",
                "Age limite : 30 ans\n" +
                        "maximum\n" +
                        "Niveau scolaire minimum requis :\n" +
                        " • Niveau baccalauréat scientifique ou technique\n" +
                        " • Diplôme qualification dans une secteur industriel\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Evaluation sur la base des batteries de tests\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " Homme de dialogue et de communication capable de s’intégrer dans une équipe et de se situer dans le cadre global de l’entreprise Appliquer les règles d’hygiène et de sécurité au travail, de l'ergonomie et de l'environnement Connaissance des carrosseries Agencer et entretenir le poste de travail et outils Etablir des devis et des ordres de réparation Connaissance des matériaux (ferreux ou non ferreux, composite et plastique) Connaissances des produits (peinture, solvants, durcisseurs, mastic, métallisé, nacrée, etc…) et des matériels qui permettent de les Préparer et de les appliquer  Protéger et traiter les surfaces Appliquer les différents produits de peinture automobile Corriger et ajuster les teintes Réaliser des raccords Dessiner et créer des motifs de décoration Mettre à jour et classer la documentation technique Appliquer les procédures qualité en vigueur dans l’entreprise Gérer le stock de produits de peinture Restituer le véhicule au client et lui explique les travaux réalisés Développer un esprit de créativité en tenant compte d'un sens artistique et d'un sens esthétique Etre tuteur de formation");
        insertFiliere("Maintenance de Matériel de Confection","","","",
                "Dans le secteur de l’habillement, le Technicien de Maintenance de Matériel de Confection (TMMC), doit assurer le bon fonctionnement des machines de confection et des annexes de production en effectuant les activités de la maintenance préventive et curative et en apportant les améliorations et les adaptations de postes nécessaires.Le Technicien de Maintenance de Matériel de Confection conduit les machines de confection au besoin et effectue tous les réglages indispensables à un fonctionnement fiable dans le respect des normes d’hygiène et sécurité. Il intervient dans le domaine de la mécanique, du pneumatique et peut participer aux réparations électroniques et automatiques.Sa fonction est d’un niveau intermédiaire, entre celui du responsable et de l’opérateur de maintenance. Il est responsable de l’état des machines et du budget alloué à leur maintenance.",
                "Après avoir acquis de l’expérience, les personnes démontrant les capacités et la volonté d’apprendre peuvent accéder à un poste de responsable de département maintenance. Selon leur potentiel, avec l’expérience et une formation appropriée, ces personnes peuvent également accéder à des postes de responsables de production ou encore créer une petite entreprise de vente et réparation de matériel de confection, ou de services dédiés à l’assistance après vente.",
                "Age limite: 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis: 2ème année du Baccalauréat toutes séries OuDiplôme du niveau Qualification dans le secteur Industriel.Un concours, pour les prétendants peut être exigé, et accompagné des tests suivants :\n" +
                        "\n" +
                        " • Test de mathématique.\n" +
                        " • Test de français permettant de vérifier :\n" +
                        "\n" +
                        "Les qualités et les aptitudes que le candidat doit posséder :\n" +
                        " • Intérêt pour le métier\n" +
                        " • Capacité à comprendre, à écrire et à parler le français\n" +
                        " • Appréciation du travail en équipe",
                "A l’issue de sa formation le lauréat de la filière « TMMC » aura acquis, les compétences requises pour occuper efficacement ses fonctions et garantir le bon fonctionnement du matériel de production et annexes de production en respectant les spécifications techniques et les normes de qualité du clientSa connaissance des machines et de la mécanique d’entretien, des techniques d’intervention, du processus de maintenance et de la gestion de la maintenance, lui permet d’être en mesure d’exécuter les tâches de maintenance du matériel de confection suivantes :\n" +
                        "\n" +
                        " • Elaborer le plan de maintenance préventive\n" +
                        " • Mettre en œuvre la maintenance préventive\n" +
                        " • Mettre en œuvre et optimiser la maintenance corrective\n" +
                        " • Gérer le stock des pièces de rechange\n" +
                        " • Apporter des solutions techniques à l’aménagement des postes de travail\n" +
                        " • Gérer le parc matériel\n" +
                        " • Superviser les activités de maintenance\n" +
                        " • Organiser l’atelier de maintenance\n" +
                        " • Assurer l’intégration de nouveaux biens\n" +
                        " • Améliorer la performance du matériel et du coût liés à la maintenance");
        insertFiliere("Monteur Régleur en Plasturgie","","","",
                "Le rôle principal du \"Monteur Régleur en Plasturgie\" est d’assurer la bonne gestion des machines nécessaire au bon déroulement de la production d’un atelier ou d’un îlot de production. A cet effet, il exécute les changements de production, effectue l’industrialisation des nouvelles productions, maintien et optimise la production.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, le Monteur Régleur peut évoluer vers un poste de Chef d’Equipe puis Responsable de Production.",
                "Age limite : 30 ans\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : 2ème année du baccalauréat scientifique ou techniqueOuDiplôme du niveau Qualification dans le secteur Industriel.\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Contre-indications à l'exercice du métier handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladies nerveuses, asthme.\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Tests d’admission",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Assurer le démarrage et les changements de production\n" +
                        " • Assurer la maintenance\n" +
                        " • Industrialiser les nouvelles productions\n" +
                        " • Respecter la sécurité et la qualité au cours de la production");
        insertFiliere("Educateur Spécialisé en Petite Enfance","","",
                "",
                "L'Éducateur peut contribuer à l'épanouissement de l'enfant et à l'amélioration de la vie de leur famille. Il a pour mission d’accompagner et guider les enfants dans leurs activités quotidiennes dans le but d’acquérir diverses compétences, à l'instar de la psychomotricité, la linguistique, la communication et le développement socio-émotionnel. Il est question aussi de soutenir le développement de leur confiance en soi, leur autonomie, la capacité à intégrer un groupe, à résoudre des problèmes etc. C’est pour cette raison qu’il est important, en plus d’avoir un sens de responsabilité, de témoigner un grand respect et de l’amour aux enfants. Cette filière vise à préparer les meilleurs Éducateurs pour le développement de l'enfant.",
                        "L’Éducateur Spécialisé en Petite Enfance est amené à exercer son métier dans les différentes structures éducatives préscolaires :\n" +
                        "\n" +
                        " • Publiques,\n" +
                        " • Semipubliques,\n" +
                        " • Privées,\n" +
                        " • ONG,\n" +
                        " • Projet personnel …",
                " • Niveau scolaire minimum requis : Etre titulaire d'un baccalauréat\n" +
                        " • Age limite: 30 ans pour les candidats bacheliers comme pour les licenciés",

                        "La formation a pour finalité de permettre au lauréat d’acquérir le savoir, la pédagogie, ainsi que les outils pratiques relatifs au métier d'Éducateur Spécialisé en Petite Enfance. Ce programme assure une haute qualité de formation visant à développer chez le lauréat, qui travaillera auprès d'un groupe d’enfants, de bonnes qualités d’accueil, d'accompagnement et de suivi, en vue de favoriser leur processus de développement et d’apprentissage.A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Accueil et accompagnement du jeune enfant et de sa famille\n" +
                        " • Organisation de l’environnement du travail\n" +
                        " • Elaboration de projets éducatifs au profit d’enfants d’âge préscolaire\n" +
                        " • Planification et organisation d’activités éducatives\n" +
                        " • Mise en œuvre d’activités éducatives en faveur du jeune enfant\n" +
                        " • Gestion administrative\n" +
                        " • Communication professionnelle\n" +
                        " • Intégration des technologies de l'information et de communication dans le domaine du préscolaire\n" +
                        " • Évaluation de la progression des apprentissages chez l’enfant");
        insertFiliere("Technicien Spécialisé en Finance et Comptabilité","","",
                "",
                "Le Technicien Spécialisé en Finance et Comptabilité (TSFC) agit dans des contextes de travail variés et évolutifs qui dépendent de plusieurs paramètres, à savoir :\n" +
                        "la structure juridique, la taille, les choix organisationnels et technologiques des entreprises. Il exerce ses fonctions dans le respect des obligations légales et contractuelles et des procédures internes. Et ce, dans la limite des marges d’autonomie qui lui sont attribuées. Le Technicien Spécialisé en Finance et Comptabilité est en mesure de :\n" +
                        "\n" +
                        " • Organiser et réaliser la gestion des obligations comptables, fiscales et sociales\n" +
                        " • Participer à l'élaboration et à la communication des informations financières et de gestion\n" +
                        " • Contribuer aux prévisions et à la préparation des décisions. \n" +
                        "\n" +
                        "Cette filière ouvre des opportunités d’embauche au sein des services administratifs, comptables et financiers des entreprises, des cabinets d’expertise comptable, et autres organisations.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, le Technicien Spécialisé en Finance et Comptabilité se verra confié des responsabilités plus importantes d’encadrement et de pilotage dans les divers départements de l’entreprise. Il peut également prendre la responsabilité d’une PME. Plusieurs possibilités d’évolution de carrière sont prévues, notamment vers des fonctions d’encadrement par le biais d'une promotion interne et par la formation continue.Il peut s’orienter vers des postes tels que :\n" +
                        "\n" +
                        " • Chef Comptable ;\n" +
                        " • Contrôleur de Gestion ;\n" +
                        " • Auditeur Financier ;\n" +
                        " • Directeur Administratif et Financier",
                "Age limite : 30 ans\n" +
                        "pour les bacheliers et les licenciés\n" +
                        "Niveau scolaire minimum requis : Bac au minimum ou équivalent en Économie, comptabilité, gestion ou commerce en sciences ou techniques Aptitude physique à l’exercice du métier : Aucune contre indication \n" +
                        "Mode de sélection des candidats :\n" +
                        "\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens suite à la présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d’exécuter les activités suivantes:\n" +
                        " • Maitriser les techniques de communication écrite et orale\n" +
                        " • Appréhender l’entreprise dans son environnement professionnel et économique\n" +
                        " • Tenir la comptabilité générale d’une entreprise (manuelle et informatisée)\n" +
                        " • Se sensibiliser à la culture entrepreneuriale\n" +
                        " • Connaitre les différents types de droits afférents aux opérations commerciales :\n" +
                        " • droit commercial,droit social\n" +
                        " • Réaliser les travaux de fin d’exercice et l’établissement des états de synthèse\n" +
                        " • Elaborer les déclarations fiscales\n" +
                        " • Appliquer les règles des statistiques descriptives, et des mathématiques financières\n" +
                        " • Utiliser efficacement les TIC et des logiciels de gestion\n" +
                        " • Effectuer des techniques de la révision des comptes\n" +
                        " • maîtriser la comptabilité approfondie\n" +
                        " • analyser la situation financière de l’entreprise \n" +
                        " • appréhender des techniques de consolidation et des normes comptables internationales\n" +
                        " • Effectuer le calcul des coûts et des résultats analytiques\n" +
                        " • Etablir les budgets et les tableaux de bord\n" +
                        " • Gérer la trésorerie ");
        insertFiliere("Techniques de Secrétariat de Direction","","","",
                "Les tâches qui incombent aux secrétaires de direction varient selon le type et l'envergure de l'entreprise où elles s'effectuent. Exercer ce métier requiert généralement la pratique des langues :\n" +
                        "française et arabe. Ils assurent, le plus souvent, la liaison entre le directeur, les employés du bureau, ainsi que les visiteurs. Les Secrétaires de Direction exécutent différentes tâches et soutiennent les gestionnaires dans l'organisation du bureau. C’est un travail de bureau et de soutien qui exige l'utilisation d'outils informatiques, la maîtrise de quelques notions de base en législation et en comptabilité. Après avoir acquis eu une expérience significative au travail, les secrétaires de direction se verront confiées des responsabilités plus grandes",
                "Les perspectives d'emploi sont bonnes pour les personnes qui maîtrisent la langue française, qui s’intègrent facilement à l’entreprise et à ses valeurs. La maîtrise d’autres langues étrangères ainsi que la volonté d’apprendre et de s’améliorer sont des atouts majeurs pour accéder au marché du travail.",
                "Age limite : 30 ans pour les bacheliers et les licenciés\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : Baccalauréat toute série\n" +
                        "\n" +
                        "Sélection au concours donnant accès au programme Techniques de Secrétariat de Direction\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection",
                "");
        insertFiliere("Technicien Spécialisé en Commerce","","","",
                "Le Technicien Spécialisé en Commerce a un rôle moteur dans la pérennité de l’entreprise. Sa mission principale est de porter l’image de l’entreprise et fidéliser ses clients. Il est capable de mener toute action commerciale nécessaire à l'atteinte des objectifs fixés de la négociation à la vente d’une prestation en passant par un bon suivi commercial. Dans un contexte fortement concurrentiel, le Technicien Spécialisé en Commerce doit asseoir une bonne stratégie commerciale Il doit avoir tous les outils lui permettant d’analyser le marché en vue d’anticiper les besoins de ses clients grâce à une veille concurrentielle bien menée. Qu’il s’agisse d’une activité de vente locale, nationale ou à l’échelle international, ses qualifications lui offrent une grande capacité d’adaptation à toute situation commerciale.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, le Technicien Spécialisé en Commerce se verra confié des responsabilités importantes dans les directions commerciales ou de marketing.",
                "Age limite: 30 ans\n" +
                        "aussi bien pour les bacheliers que les licenciés\n" +
                        "Niveau scolaire minimum requis : Baccalauréat toutes sériesAptitude physique requise: Aucune difficulté d’élocution\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Réussir les Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Analyser et prospecter l’environnement\n" +
                        " • Mener des négociations commerciales\n" +
                        " • Réaliser des opérations de ventes et en établir les conditions générales\n" +
                        " • Etablir les contrats d’agents\n" +
                        " • Animer une équipe de vente\n" +
                        " • Assurer le suivi opérationnel d’une gestion commerciale sur un un secteur défini\n" +
                        " • Parler une langue étrangère (Anglais ou Espagnol)\n" +
                        " • Utiliser les outils bureautiques (traitement de textes, tableurs, gestions des fichiers etc)\n" +
                        " • Gérer les opérations d’import/export\n" +
                        " • Organiser les voyages d’études, les salons, les expositions\n" +
                        " • Traiter les commandes et les encaissements");
        insertFiliere("Technicien Spécialisé en Gestion des Entreprises","","","",
                "Le Technicien Spécialisé en Gestion d’Entreprise se voit posséder un certain niveau de pratique des techniques en gestion et plus particulièrement, en marketing et en finances. Ce qui lui permet d’occuper une fonction de gestionnaire opérationnel. Selon l'ampleur de l’entreprise, il pourra intégrer une équipe ou assumer tout ou une partie d’une fonction.Dans les PME, il est le collaborateur direct du chef d’entreprise. Il lui apporte soutien et conseil sur les volets financiers, commerciaux, juridiques, ressources humaines et logistiques.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, le Technicien Spécialisé en Gestion des Entreprises se verra confié des responsabilités plus importantes d’encadrement et de pilotage dans les divers départements de l’entreprise. Il peut également prendre la responsabilité d’une PME.",
                "Age limite: 30 ans\n" +
                        "pour bacheliers et licenciés\n" +
                        "Niveau scolaire minimum requis : Baccalauréat ou licence dans une des branches scientifique, littéraire, technique industrielle, de gestion, commerce ou économieAptitude physique à l’exercice du métier : Aucune contre indication\n" +
                        "Mode de sélection des candidats :\n" +
                        "\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection",
                        "A l’issue de la formation, le lauréat sera en mesure d’exécuter les activités suivantes :\n" +
                        " • Tenir la comptabilité générale d’une entreprise (manuelle et informatisée)\n" +
                        " • Réaliser une étude de marché\n" +
                        " • Tenir une gestion commerciale\n" +
                        " • Gérer les données techniques de la production\n" +
                        " • Assurer la gestion de trésorerie\n" +
                        " • Tenir une comptabilité analytique\n" +
                        " • Tenir une gestion budgétaire\n" +
                        " • Gérer une ligne de produit\n" +
                        " • Tenir une Gestion des stocks\n" +
                        " • Réaliser des études d’environnement\n" +
                        " • Réaliser des analyses de poste et élaborer des plans de formation");
        insertFiliere("Technicien Spécialisé Bureau d'Etude en Construction Métallique ","","","",
                "La mission principale du Technicien Spécialisé du Bureau d’Etude en Construction Métallique est de participer à la conception et à l’étude d’ensembles en construction métallique. Il peut également Préparer et organiser la fabrication de prototypes.",
                "Le lauréat peut être employé par des établissements de nature et d’importance les plus diverses allant de l’entreprise artisanale à la grande société industrielle.Le Technicien Spécialisé de Bureau d’Etude en Construction Métallique est amené à exercer dans :\n" +
                        " • Un bureau d’Etude\n" +
                        " • Un service méthode ou de préparation du travail\n" +
                        " • Un bureau de gestion de production\n" +
                        " • Un service gestion de la qualité\n" +
                        " • Dans des chantiers",
                "Age limite : 23 ans\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et l’ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection",
                "A l'issue de la formation, le lauréat sera en mesure d'exécuter les tâches suivantes :\n" +
                        " • Prendre connaissance des directives, des plans et cahiers de charge\n" +
                        " • Analyser une demande, un travail, un problème\n" +
                        " • Etudier, élaborer, prévoir et proposer des solutions\n" +
                        " • Justifier, argumenter les choix\n" +
                        " • Vérifier, contrôler, corriger et finaliser\n" +
                        " • Rédiger les documents et constituer le dossier\n" +
                        " • Réaliser des comptes rendus, et communiquer aisément");
        insertFiliere("Technicien Spécialisé de Méthodes en Fabrication Mécanique","","","",
                "\"Le Technicien Spécialisé de Méthodes en Fabrication Mécanique\" participe à la préparation du travail. Il établit rationnellement les gammes de fabrication, définit le temps d’exécution, et prépare les documents destinés à la fabrication. En partant du principe que\n" +
                        " • tous les domaines confondus\n" +
                        " • toute action est obligatoirement précédée d’un certain nombre de mesures préparatoires, le temps alloué à la préparation du travail n’est pratiquement pas limité. Cela s’applique dans la mécanique générale :\n" +
                        "de la petite à la grande entreprise, de la petite à la grande série, de la pièce simple à la plus complexe.",
                "Le lauréat peut être employé par des établissements de nature et d’importance les plus diverses allant de l’entreprise artisanale à la grande société industrielle. Le Technicien Spécialisé des méthodes en Fabrication Mécanique est amené à exercer dans un service maintenance de toute entreprise : - Industrielle - Agro-alimentaire - Chimie-Parachimie",
                "Age limite : 23 ans\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et l’ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection",
                "\n" +
                        "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Etablir des processus de production\n" +
                        " • Choisir, entre plusieurs procédés de travail et plusieurs processus celui ou ceux qui seront les plus rentables, compte tenu de la qualité\n" +
                        " • Choisir les moyens de production les mieux adaptés :\n" +
                        " • machines, outillage, personnes\n" +
                        " • Pour chaque phase, il faut prévoir et analyser les postes de travail, et déterminer le mode opératoire le plus rationnel\n" +
                        " • Rechercher les meilleures conditions d’exploitation du matériel et proposer l’outillage nécessaire\n" +
                        " • Proposer les adaptations nécessaires en ce qui concerne l’implantation des machines et les aires de stockage\n" +
                        " • Etablir les temps d’exécution et les devis\n" +
                        " • Participer à la mise en route de la fabrication\n" +
                        " • Programmer, régler et conduire une machine-outil à commande numérique\n");
        insertFiliere("Technicien Spécialisé en Génie Climatique","","","",
                "Le Technicien Spécialisé en Génie Climatique peut être un technicien de bureau d’étude, un technicien de mise en service, ou un technicien de maintenance.C'est un homme de terrain, chargé d’intervenir dans les entreprises d’installation, ou de prestation de service pour prendre en charge les opérations de mise en service et de mise au point de différentes installations.",
                "Le Technicien Spécialisé en Génie Climatique peut être employé dans des entreprises prestataires de services, dans des services d’entretien des collectivités, dans des services de maintenance en Génie Climatique ou dans des bureaux d’étude ou comme chef de chantier.La création d’une entreprise est tout à fait possible pour les éléments dynamiques.",
                "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "Niveau scolaire minimum requis : Bacheliers Scientifiques ou Techniques\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • De bonnes relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et l’ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Participer à l’étude technique\n" +
                        " • Contribuer à l’étude budgétaire\n" +
                        " • Préparer l’offre et la négociation\n" +
                        " • Préparer la réalisation\n" +
                        " • Assurer la réalisation et son suivi\n" +
                        " • Participer à la livraison d'une installation\n" +
                        " • Préparer le suivi d'une installation\n" +
                        " • Intervenir sur une installation\n" +
                        " • Optimiser un fonctionnement\n" +
                        " • Communiquer à l’intérieur et à l’extérieur de l’entreprise");
//        insertFiliere("Automatisation et Instrumentation Industrielle","","","","","","","");
//        insertFiliere("Electromécanique des Systèmes Automatisées","","","","","","","");
//        insertFiliere("Techniques des Réseaux Informatiques","","","","","","","");
//        insertFiliere("Technico-Commercial en Vente de Véhicules et Pièces de Rechange","","","","","","","");
//        insertFiliere("Technicien spécialisé en Diagnostic et Electronique Embarquée","","","","","","","");
//        insertFiliere("Infographie","","","","","","","");
//        insertFiliere("TS Traitement de surface","","","","","","","");
//        insertFiliere("Technicien Spécialisé Bureau d’Etudes en Automobile","","","","","","","");
//        insertFiliere("Maintenance des Machines Outils et Autres Machines de Production Automatisée","","","","","","","");
//        insertFiliere("Maintenance des Machines et Outillage en Plasturgie","","","","","","","");
//        insertFiliere("Technicien Spécialisé en Production et Qualité en Automobile","","","","","","","");
//        insertFiliere("Technicien Spécialisé Bureau d'Etude en Construction Métallique","","","","","","","");
//        insertFiliere("Usinage sur MOCN option METHODE FAO Outillage de presse","","","","","","","");
//        insertFiliere("Usinage sur MOCN option USINAGE Outillage de presse","","","","","","","");
//        insertFiliere("Mécatronique","","","","","","","");


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


    public void insertFiliere(String name, String num_modules, String nom_modules, String nbr_horaire, String details, String debouches, String conditions, String profile_formation){
        ContentValues values = new ContentValues();
        values.put(FiliereEntry.COLUMN_NAME, name);
        values.put(FiliereEntry.COLUMN_NUM_MODULES, num_modules);
        values.put(FiliereEntry.COLUMN_NOM_MODULES, nom_modules);
        values.put(FiliereEntry.COLUMN_NBR_HORAIRES, nbr_horaire);
        values.put(FiliereEntry.COLUMN_DETAILS, details);
        values.put(FiliereEntry.COLUMN_DEBOUCHES, debouches);
        values.put(FiliereEntry.COLUMN_CONDITIONS, conditions);
        values.put(FiliereEntry.COLUMN_PROFILE_DE_FORMATION, profile_formation);

        Db.insert(FiliereEntry.TABLE_NAME, null, values);
    }
}