package com.example.ofppt2;

import com.example.ofppt2.classes.*;

import java.util.ArrayList;

public class DataManager {
    ArrayList<Filiere> Filieres;
    ArrayList<Secteur> Secteurs;
    ArrayList<Niveau> Niveaux;

    public DataManager() {
        Filieres = new ArrayList<Filiere>();
        Secteurs = new ArrayList<Secteur>();
        Niveaux = new ArrayList<Niveau>();
    }

    public String getFilieres(String secteur) {
        for(Secteur secteurItem: Secteurs){
            if (secteur.equals(secteurItem.getName())){
                return secteurItem.getFilieres();
            }
        }
        return null;
    }

    public String getSecteurs(String niveau)
    {
        for(Niveau niveauItem: Niveaux){
            if (niveau.equals(niveauItem.getName())){
                return niveauItem.getSecteurs();
            }
        }
        return null;
    }

    public Filiere getFiliere(String filiereName) {
        for(Filiere filiere: Filieres){
            if (filiere.getName() != null && filiere.getName().contains(filiereName)){
                return filiere;
            }
        }
        return null;
    }


    public void setFiliere(Filiere filiere) {
        Filieres.add(filiere);
    }

    public void setSecteur(Secteur secteur) {
        Secteurs.add(secteur);
    }

    public void setNiveau(Niveau niveau) {
        Niveaux.add(niveau);
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
        insertFiliere("Monteur Dépanneur Frigoriste","xx","x","xx","Le Monteur Dépanneur Frigoriste est un ouvrier chargé d’assurer l’entretien, le dépannage et le montage des installations frigorifiques de petite et moyenne puissance. Il exerce son métier au sein des entreprises d’installation et de maintenance en froid commercial (souvent de petites entreprises à structure légère).",
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
        insertFiliere("Carrosserie Peinture Automobile","xx","xx","xx",
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
        insertFiliere("Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse","","","",
                "a fonction principale du Technicien en Fabrication Mécanique est de gérer l’activité et de produire des pièces sur machines conventionnelles et à commande numérique.\n" +
                        "Il travaille dans la majorité des cas dans des entreprises de production des secteurs d’activité du chantier naval, de l’automobile, de la mécanique générale et de précision.",
                "Le Technicien en Fabrication Mécanique peut, selon les aptitudes qu’il démontre, progresser vers la fonction méthode de l’entreprise voire à terme vers la responsabilité d’atelier ou le domaine de la production.",
                "Age maximum : 25 ans\n" +
                        " • Niveau Scolaire : 2ème année du baccalauréat (ex – 3ème Année Secondaire) scientifique et technique\n" +
                        " • Aptitudes et qualités exigées pour l’exercice du métier :\n" +
                        " • Sens de responsabilités, de l’organisation et de la discipline\n" +
                        " • Esprit  d’autonomie, d’analyse, de créativité et des initiatives\n" +
                        " • Bonne aptitude aux relations humaines \n" +
                        " • Maîtrise de soi, motivation pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Mode de sélection des candidats à la formation :\n" +
                        "    • Remplissage du dossier d’orientation ;\n" +
                        "    • Réussite aux tests d’admission.",
                "A l’issue de la formation, le stagiaire sera en mesure d’exécuter les tâches suivantes:\n" +
                        " • Etablir un dossier de fabrication\n" +
                        " • Organiser et gérer une fabrication\n" +
                        " • Usiner sur machines outils traditionnelles\n" +
                        " • Programmer, régler et conduire une machine outil à commande numérique\n" +
                        " • Travailler en établi et assembler des composants mécaniques de base\n" +
                        " • Calculer, mesurer et contrôler\n" +
                        " • Maintenir en bon état de fonctionnement le poste de travail.");
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
        insertFiliere("Automatisation et Instrumentation Industrielle","","","",
                "Le Technicien Spécialisé en Automatisation et Instrumentation Industrielle travaille en général dans des entreprises équipées d’installations automatisées. Il a pour principale tâche d’assurer le bon fonctionnement des éléments des chaînes de production en relation avec la qualité demandée tout en respectant les délais, l’optimisation de la productivité et la bonne gestion des matières utilisées. Les bases de sa fonction consistent à assurer la sécurité des personnes et du matériel.",
                "Le Technicien Spécialisé en Automatisation et Instrumentation Industrielle est un professionnel qui peut faire carrière dans les grandes entreprises utilisant une automatisation de la production. En démontrant son professionnalisme et ses expériences acquises sur le terrain, il peut devenir aisément un chef d’équipe de maintenance et d’intervention.",
                "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Automatiser des systèmes séquentiels simples en utilisant un automate programmable\n" +
                        " • Rendre opérationnel un ensemble capteur\n" +
                        " • conditionneur pour un procédé industriel\n" +
                        " • Assurer le fonctionnement d'un procédé industriel à partir d'un contrôleur industriel\n" +
                        " • Rendre opérationnel des systèmes de commandes électriques des machines électriques\n" +
                        " • Contrôler, dans un contexte industriel, des variables physiques à l'aide d'un automate programmable\n" +
                        " • Maintenir en équilibre un procédé industriel à partir d'un contrôleur numérique\n" +
                        " • Mettre en œuvre une boucle de contrôle de procédé industriel incluant un système SCADA\n" +
                        " • Rendre opérationnel des systèmes de commandes électroniques des machines électriques\n" +
                        " • Conduire le projet de fin d'études");
        insertFiliere("Electromécanique des Systèmes Automatisées","","","",
                "Le \"Technicien Spécialisé Electromécanicien des Systèmes Automatisés\" est un professionnel chargé de maintenir, dans des conditions les plus optimales, le fonctionnement des systèmes automatisés d’une entreprise.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences et son ambition professionnelle, le Technicien Spécialisé Electromécanicien des Systèmes Automatisés se verra confié des responsabilités plus importantes au niveau de l’autonomie et de la gestion des difficultés techniques des interventions, ainsi que de suivi de divers projets de l’entreprise.",
                "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Contre-indications pour exercer ce métier : handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladie nerveuse.\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Installer des câbles et des canalisations\n" +
                        " • Dépanner des circuits électroniques de puissance\n" +
                        " • Installer les divers raccordements et entretenir les luminaires\n" +
                        " • Installer et entretenir les commandes à très basse tension\n" +
                        " • Installer, raccorder et entretenir des transformateurs\n" +
                        " • Installer et Repérer des moteurs et des génératrices à CC\n" +
                        " • Monter des circuits hydrauliques\n" +
                        " • Installer et Repérer des moteurs et des génératrices à CA\n" +
                        " • Installer et entretenir divers systèmes d’alarme et de signalisation\n" +
                        " • Installer, Repérer les commandes électroniques de moteurs\n" +
                        " • Installer et dépanner des moteurs et de génératrices à CC\n" +
                        " • Installer et dépanner des moteurs et des génératrices à CA\n" +
                        " • Installer, Repérer des commandes électroniques des moteurs\n" +
                        " • Réaliser un système automatisé");
        insertFiliere("Techniques des Réseaux Informatiques","","","",
                "Le Technicien Spécialisé en Réseaux Informatiques est un professionnel chargé d’exploiter, sécuriser, optimiser et faire évoluer les ressources informatiques de l’entreprise.Il est le garant de la qualité du service attendu par l’informatique. Il prend en charge le support technique auprès des utilisateurs et apporte des solutions aux différents problèmes qu’ils rencontrent dans l’utilisation des moyens informatiques.",
                "Après quelques années d’expériences réussies, le Technicien Spécialisé en Réseaux Informatiques peut évoluer vers des fonctions d’encadrement ou d’expertise technique.",
                "Age limite : 23 ans\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Capacités d’analyse et de synthèse\n" +
                        " • Sens du service\n" +
                        " • Autonomie,\n" +
                        " • Esprit d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi\n" +
                        " • Curiosité pour les nouvelles technologies de l’information\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Au niveau du support technique\n" +
                        " • Assurer un support technique auprès des utilisateurs de l’informatique\n" +
                        " • Assurer la gestion du parc informatique de l’entreprise\n" +
                        " • Suivre et faire évoluer le dispositif informatique\n" +
                        " • Diagnostiquer et résoudre les problèmes sur les postes de travail et serveurs d’entreprise\n" +
                        " • Suivre et organiser le suivi des pannes et des interventions auprès des utilisateursAu niveau de la maintenance \n" +
                        " • Dépanner les micro-ordinateurs, les serveurs, le réseau\n" +
                        " • Suivre et faire évoluer les systèmes d’exploitationAu niveau système\n" +
                        " • Installer et administrer un poste de travail\n" +
                        " • Installer et administrer un système d’exploitation réseau\n" +
                        " • Installer et administrer les serveurs d’application (messagerie, serveur web,..) Au niveau du réseau \n" +
                        " • Concevoir et planifier l’implantation d’un réseau local d’entreprise\n" +
                        " • Participer au câblage du réseau\n" +
                        " • Assurer la gestion et la supervision d’un réseau informatique\n" +
                        " • Diagnostiquer et résoudre les problèmes du réseau informatique\n" +
                        " • Installer, gérer et sécuriser les éléments actifs d’un réseau étendu");
        insertFiliere("Technico-Commercial en Vente de Véhicules et Pièces de Rechange","","","",
                ".",
                "Le Technico-commercial en Vente de Véhicules et Pièces de Rechange peut prétendre à plusieurs postes en entreprise tels que :\n" +
                        "\n" +
                        " • Réceptionniste\n" +
                        " • Technicien de vente\n" +
                        " • Magasinier\n" +
                        " • Agent en garantie\n" +
                        "\n" +
                        "Pour certains, la création de leur propre entreprise de vente de véhicules et/ou de pièces de rechange est une opportunité.",
                "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi et l’ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Entretenir périodiquement des véhicules automobiles\n" +
                        " • Entretenir et Repérer un système hydraulique\n" +
                        " • Entretenir les organes de la transmission\n" +
                        " • Contrôler les éléments de tenue de la roue\n" +
                        " • Contrôler et Repérer les systèmes de freinage\n" +
                        " • Entretenir et Repérer la carrosserie d’un véhicule automobile\n" +
                        " • Interpréter le comportement des acheteurs\n" +
                        " • Assurer la qualité du service à la clientèle\n" +
                        " • Présenter un produit, un service ou un système\n" +
                        " • Vendre en magasin\n" +
                        " • Gérer les encaissements\n" +
                        " • Appliquer les techniques du Marketing\n" +
                        " • Promouvoir un produit, un service ou un système");
        insertFiliere("Technicien spécialisé en Diagnostic et Electronique Embarquée","","","",
                "Le Technicien Spécialisé en Diagnostic et Electronique Embarquée est un professionnel chargé de gérer les services après-vente, d’animer des équipes en dialoguant au sein de l’entreprise avec les intervenants et la clientèle, de promouvoir les services et la vente des produits de son entreprise. Il s'occupe également du diagnostic et de la remise en conformité des systèmes technologiques rencontrés dans les véhicules modernes",
                "Le lauréat peut prétendre au poste de responsable de services après vente, de conseiller en matière d’achat automobile et de maintenance d’un parc automobile. Il peut également lancer sa propre entreprise moyennant une formation complémentaire en gestion et économie.",
                "\n" +
                        "\n" +
                        "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Conscience professionnelle\n" +
                        " • Sens de l’organisation\n" +
                        " • Sens de responsabilité\n" +
                        " • Sens de la sécurité\n" +
                        " • Maîtrise de soi\n" +
                        " • Sens de l'initiative.\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d'orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "");
        insertFiliere("Infographie","","","",
                "Le \"Technicien Spécialisé en Infographie\" est un professionnel chargé de réaliser des produits de prépresse destinés à l’impression et à l’édition.",
                "L’infographiste ayant une expérience de 4 à 5 ans peut accéder, avec la mise à niveau de ses connaissances, à un poste de direction de production. Avec une formation supplémentaire, il peut aussi s’orienter vers le graphisme et l’animation 3D. Pour certains candidats, la création d’un atelier de service dans ce domaine, constitue une véritable opportunité à saisir.",
                "\n" +
                        "Age limite : 30 ans\n" +
                        "pour les bacheliers et les licenciés\n" +
                        "Niveau scolaire minimum requis : Bacheliers toutes options\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Motivation personnelle,\n" +
                        " • Connaissance des outils de représentation,\n" +
                        " • Capacité d’observation et d’écoute,\n" +
                        " • Capacité de travail en groupe,\n" +
                        " • Capacité d’analyse et de synthèse,\n" +
                        "\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Présélection sur dossier\n" +
                        " • Entretien après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Réaliser la maquette du produit\n" +
                        " • Traiter le contenu du produit\n" +
                        " • Réaliser la mise en page\n" +
                        " • Produire les films et les plaques d’impression");
        insertFiliere("TS Traitement de surface","","","",
                "Le « Technicien Spécialisé en Traitement de Surface » est un professionnel amené à exercer le métier de traitement de surface dans de nombreux secteurs industriels, et plus particulièrement :\n" +
                        "l’automobile, l’aéronautique, la micromécanique, l’horlogerie et la bijouterie. Cela peut concerner aussi les entreprises de formulation de peintures et revêtements.Les traitements et les revêtements de surface sont destinés à protéger, à embellir ou à conférer des propriétés particulières à une surface en la modifiant de différentes manières. Ces traitements peuvent être chimiques ou électrolytiques. Ils doivent être précédés d’une préparation soignée :\n" +
                        "dégraissage et décapage (avant traitement), métallisation, anodisation, phosphatation et la mise en peinture.",
                "Le lauréat peut être employé par des entreprises spécialisées dans le secteur aéronautique. Ces entreprises sont le plus souvent des sous-traitants d’entreprises internationales, voire des ateliers déportés de celles-ci.Selon les aptitudes qu’il démontre, progresser vers un poste de responsabilité : chef de groupe, contremaître, chef d’équipe.",
                "Age limite : 30 ans\n" +
                        "pour les bacheliers et les licenciés\n" +
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
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Gérer un atelier de traitement de surface\n" +
                        " • Analyser les matières premières et les produits finis\n" +
                        " • Effectuer les traitements (chimique, électrolytique) sur les métaux (aciers, aluminium...) Afin de les protéger des agressions mécaniques ou chimiques corrosives\n" +
                        " • Veiller à l'application des règles de sécurité et au respect des normes environnementales\n" +
                        " • Assurer la maintenance des équipements de production\n" +
                        "\n" +
                        "Il assure aussi, la commercialisation des produits");
        insertFiliere("Technicien Spécialisé Bureau d’Etudes en Automobile","","","",
                "Relié au bureau d’études, le Technicien Spécialisé en Bureau d’études option Automobile réalise avec l'outil informatique des pièces mécaniques en CAO 3Dà partir d'un cahier des charges, pour ensuite les retranscrire sur papier, sur des plans 2D. Il assure les tests numériques, avant les essais sur prototype en laboratoire.\n" +
                        "Dans le respect de la qualité  et en répondant aux exigences clients, le Technicien spécialisé en Bureau d’études optimise la conception : Géométrie, Dimensions, matériaux et solutions technologiques.",
                "Le programme de formation est dispensé sur 26 modules en 2100 heures réparties sur quatre semestres de formation. Un stage technique de 240 H est programmé à la fin de formation.",
                "Age maximum : 23 ans pour les bacheliers et 26 ans pour les licenciés\n" +
                        " • Niveau Scolaire : Bacheliers Scientifiques ou Techniques \n" +
                        " • Les qualités et aptitudes que le candidat doit posséder pour l’accès à cette formation sont :\n" +
                        "     ◦ Sens de responsabilités, de l’organisation et de la discipline ;\n" +
                        "     ◦ Esprit d’autonomie, d’analyse, de créativité et d’initiative;\n" +
                        "     ◦ Bonnes relations humaines ;\n" +
                        "     ◦ Maîtrise de soi, motivation pour la technologie et l’ambition pour la promotion professionnelle",
                "A l’issue de la formation, le lauréat sera en mesure d’exécuter les tâches suivantes:\n" +
                        " • Définir la forme géométrique, les dimensions et le matériau d’une pièce mécanique à partir d'un cahier des charges;\n" +
                        " • Concevoir un système industriel\n" +
                        " • Mettre en plan un dessin de définition\n" +
                        " • Définir la nomenclature associée à sa conception\n" +
                        " • Intégrer, dans sa conception, les possibilités de production les mieux adaptés : machines et outillage\n" +
                        " • Gérer les évolutions des versions de la pièce ou le système conçu.\n" +
                        " • Assurer les contrôles des plans : Autocontrôle, contrôle croisé…etc\n" +
                        " • Assurer la traçabilité des plans de définition\n" +
                        " • Participer à la veille technologique ; \n" +
                        " • Prendre la responsabilité des choix technologiques chois");
        insertFiliere("Maintenance des Machines Outils et Autres Machines de Production Automatisée","",
                "",
                "",
                "Ce Technicien Spécialisé est chargé de la maintenance électromécanique et électronique des machines outils et autres machines à commande numérique. Son rayon d’action touche toutes les entreprises ayant un grand parc de machines modernes de production en série.",
                "Le lauréat peut prétendre à un emploi dans les grandes entreprises spécialisées dans la maintenance électromécanique et électronique des machines outils et autres machines à commande numérique. Après quelques années d’expérience, de formation continue et après avoir démontré ses compétences professionnelles, le Technicien Spécialisé en Maintenance des machines outils et autres machines à production automatique se verra confié des responsabilités plus importantes au niveau du suivi des divers projets de l’entreprise.",
                "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Contre-indications pour exercer ce métier : handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladie nerveuse.\n" +
                        "Mode de sélection des candidats :\n" +
                        "\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        "\n" +
                        " • Détecter et remédier aux pannes des systèmes mécaniques, électriques et hydrauliques\n" +
                        " • Installer et entretenir des moteurs à courant alternatif\n" +
                        " • Installer et entretenir des moteurs à courant continu\n" +
                        " • Démonter et monter des systèmes mécaniques\n" +
                        " • Programmer des systèmes à commande numérique\n" +
                        " • Repérer des unités d’un système de contrôle numérique");
        insertFiliere("Maintenance des Machines et Outillage en Plasturgie","","","",
                "Le rôle d’un Technicien Spécialisé en Maintenance des Machines et des Outillages en Plasturgie est d’assurer le bon fonctionnement de tout le matériel de l’atelier. Ainsi, il assure la maintenance du parc des Machines de production, des outillages montés sur les machines, des périphériques qui accompagnent le fonctionnement des machines de production et des installations des fluides nécessaires au fonctionnement des différents organes de l’atelier.",
                "Suite à quelques années d’expérience, et après avoir démontré ses compétences professionnelles, le Technicien Spécialisé en Maintenance des Machines et Outillages en Plasturgie peut évoluer vers :\n" +
                        " • Un poste de Responsable de maintenance ou responsable de production.\n" +
                        " • Le métier de mouliste.",
                "Age limite : 30 ans\n" +
                        "pour les bacheliers et les licenciés\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et l’ambition pour la promotion professionnelle.\n" +
                        "\n" +
                        "Contre-indications à l'exercice du métier handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladies nerveuses, asthme.\n" +
                        "Mode de sélection des candidats :\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection.",
                "A l’issue de la formation, le lauréat sera en mesure d'exécuter les activités suivantes :\n" +
                        " • Assurer la maintenance préventive et curative des machines\n" +
                        " • Assurer la maintenance des outillages\n" +
                        " • Participer à la conception et l’amélioration des outillages\n" +
                        " • Gérer les pièces de rechange\n" +
                        " • Respecter la sécurité et la qualité");
        insertFiliere("Technicien Spécialisé en Production et Qualité en Automobile","","",
                "",
                "Le Technicien Qualité en Automobile interrdent sous I'autorité directe du Responsable qualité.\n" +
                        "exerce ses activites dans des enteprises diversifiées, de taille moyenne. Il est rattaché au service\n" +
                        "qualité constituée d'equipes d'un à plusieurs salariés specialisés.\n" +
                        "Les entreprises d'équipEmentiers sont majoritairement certifiées atu( normes et spécifications liees\n" +
                        "à la production automobile.\n" +
                        "Le Technicien qualité en automobile joue un rôle fondamental dans les domaines suivants\n" +
                        " • Suivi de la qualité < fournisseurs > (AQF)\n" +
                        " • Suivi de la qualité < production > (AQP)\n" +
                        " • Suivi de la qualité < Clients >\n" +
                        " • Suivi des < nouveaux projets >\n" +
                        "Homme ou femme de terrain, il fait viwe les procédures et anime les réunions qualité. Il participe\n" +
                        "aussi à l'élaboration des règles de qualité e'n lien avec la politique de I'e,ntreprise.\n" +
                        "Le Technicien qualité en automobile\n" +
                        " • Étalonne et éventuellement étudie et conçoit les moyens à mettre en æuvre pogr effectuer les " +
                        "contrôles qualité à tous les stades de la fabrication et de l'élaboration du produit, en fonction " +
                        "des spécifications particulieres à I'automobile. \n" +
                        " • S'assure que les non conformités au:r nonnes et spécifications du client soient clairernent" +
                        "identifiées, les causes recherchées, et que les actions correctives soient mises en place." +
                        "Les responsabilités confiées au Technicien quatité en automobile sont frès importantes et exigent " +
                        "un savoir-faire permettant, de respecter les exigences de rapidité et de qualité exigées dans le" +
                        "secteur automobile. Des aptitudes de communication et d'échanges sont nécessaires afin de" +
                        "commr'niquer avec les fournisseurs, avec les clients et avec les utilisateurs des équipernents et les" +
                        "se,nrices production.\n" +
                        "Ses capacités d'analyse et de synthese ainsi que son esprit d'initiative doivelrt lui permettre" +
                        "<< Force de proposition ) potn améliorer la qualité des équipements" +
                        "et les perforrrances de" +
                        "d'êhe" +
                        "l'entreprise. \n" +
                        "C'est un professionnel rigor:reux, méthodique et organisé, gui a le souci pennanent de la qualité" +
                        "des relations humaines et du respect des autes. Il a une vision globale de I'enheprise et sait situer" +
                        "I'importance de sa fonction au sein de I'enheprise." +
                        "Il peut être amené à assurer la formation" +
                        "des nouveaux techniciens et des operategrs qualité. Il doit" +
                        "s'interesser au:r évolutions des techniques, afin de s'adapter rapidernent arD( nouvealx" +
                        "equiperrents et à l'évolution des moyens de contrôle.\n" +
                        " • Véritable animateur de la qualité, le technicien qualité de la production automobile exerce " +
                        "son activité en lien étroit avec I'enserrble des salaries de I'entreprise qu'il sensibilise à " +
                        "I'assurance qualité. son tavail est supervisé par le responsable quahté.",
                "La durée de la fonnation est de 390 H étalée sur 3 mois en mode résidentiel.",
                "Cette formation est destinée essentiellerrent aux lauréats des filiàes TSMpeA et TCeA " +
                        "désirant se perfectionner et se metfre à niveau dans le domaine de la qualité automobile.",
                "Le Technicien qualité en automobile à pour activités principales de :\n" +
                        " • Participer à la définition et à la promotion de la politique qualité.\n" +
                        " • Assurer la qualité des produits réalisés\n" +
                        " • Traiter les non confonnités.\n" +
                        " • Réaliser des audits internes de qualité\n" +
                        " • Participer au changement ou à la modification de produits.\n" +
                        " • Gerer les relations qualités avec les fournisseurs.\n" +
                        " • Mettre en place des améliorations.\n" +
                        " • Tenir à jour la documentation qualité.\n" +
                        " • Former les intenrenants au système qualité.");
        insertFiliere("Technicien Spécialisé Bureau d'Etude en Construction Métallique","","","",
                "La mission principale du Technicien Spécialisé du Bureau d’Etude en Construction Métallique est de participer à la conception et à l’étude d’ensembles en construction métallique. Il peut également Préparer et organiser la fabrication de prototypes.",
                "Le lauréat peut être employé par des établissements de nature et d’importance les plus diverses allant de l’entreprise artisanale à la grande société industrielle.Le Technicien Spécialisé de Bureau d’Etude en Construction Métallique est amené à exercer dans :\n" +
                        "\n" +
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
                "");
        insertFiliere("Usinage sur MOCN option METHODE FAO Outillage de presse","","","",
                "Le technicien Spécialisé en Usinage sur MOCN effectue des tâches polyvalentes dans le domaine de l’usinage, de la préparation des moyens, de la conduite des machines et du suivi de la production. Il exerce son métier dans des entreprises spécialisées en usinage dans le domaine aéronautique mais pas uniquement ; il peut, aussi, apporter son expertise dans des entreprises aux activités industrielles diversifiées où la fabrication de pièces par enlèvement de matière est l’une des activités.\n" +
                        "D’un travail très technique où la dextérité de l’opérateur était prépondérante, on arrive à un métier plus « automatisé » qui fait appel à des moyens de haute technologie s’appuyant sur des machines très performantes avec des chaînes numériques et des systèmes asservis. Les pièces usinées sont de plus en plus complexes d’un point de vue morphologique et dimensionnel, les matériaux évoluent en permanence pour atteindre des niveaux de caractéristiques mécaniques très élevés les rendant plus difficiles à usiner. La concurrence internationale pousse à une recherche permanente de la productivité maximale.",
                "Le mode de formation est résidentiel ou alterné. La durée de formation est deux années incluant des stages en entreprise.",
                "Age maximum : 26  ans pour les bacheliers et 30 ans pour les licenciés\n" +
                        " • Niveau Scolaire : Baccalauréat scientifique ou technique\n" +
                        " • Les qualités et aptitudes que le candidat doit posséder pour l’accès à cette formation sont :\n" +
                        " • Sens des responsabilités, de l’organisation et de la discipline ;\n" +
                        " • Esprit d’autonomie, d’analyse, de créativité et d’initiative;\n" +
                        " • Bonnes relations humaines ;\n" +
                        " • Maîtrise de soi, motivation pour la technologie et ambition pour la promotion professionnelle.\n" +
                        " • Contre - indications : handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladies nerveuses.\n" +
                        " • Mode de sélection des candidats à la formation :\n" +
                        "      ◦ Remplissage du dossier d’orientation ;\n" +
                        "      ◦ Réussite aux entretiens après présélection.",
                "A l’issue de la formation, le stagiaire sera en mesure d’exécuter les tâches suivantes :\n" +
                        " • Préparer la fabrication (choix d’outils et de conditions de coupe, gamme d’usinage, définition des montages porte-pièces, élaboration de programmes CN, contrôle, …)\n" +
                        " • Mettre en œuvre la production (création des montages porte-pièces, des outils assemblés, vérification des programmes, …)\n" +
                        " • Piloter les machines (démarrage machine, téléchargement des programmes, analyse de la fabrication, mise en route, surveillance du bon déroulement, modification et adaptation si nécessaire, lien avec la supervision ou l’ordonnancement)\n" +
                        " • Contrôler la fabrication\n" +
                        " • Assurer la remontée d’information\n" +
                        " • Promouvoir l’amélioration continue\n" +
                        " • Gérer les aléas de productio");
        insertFiliere("Usinage sur MOCN option USINAGE Outillage de presse","","","",
                "Le Technicien Spécialisé en Usinage sur MOCN Option : usinage outillage de presse effectue des tâches polyvalentes dans le domaine de l’usinage, de la préparation des moyens, de la conduite des machines et du suivi de la production. Il exerce son métier dans des entreprises du secteur automobile spécialisées en usinage d’outillage de presse. Il peut, aussi, apporter son expertise dans des entreprises aux activités industrielles diversifiées où la fabrication de pièces sur MOCN est l’une des activités principales.\n" +
                        "\n" +
                        "D’un travail très technique où la dextérité de l’opérateur est prépondérante, on arrive à un métier « automatisé » qui fait appel à des moyens de haute technologie utilisant des machines très performantes avec des chaînes numériques et des systèmes asservis. Dans un contexte internationale caractérisé par une vive concurrence, les opérateurs du secteurs sont à la recherche permanente de la productivité maximale. Les pièces usinées sont de plus en plus complexes d'un point de vue morphologique et dimensionnel. Les matériaux évoluent en permanence pour atteindre des niveaux de caractéristiques mécaniques très élevés les rendant plus difficiles à usiner.",
                "Après quelques années d’expérience et après avoir démontré ses compétences professionnelles, le technicien spécialisé en usinage sur MOCN Option : USINAGE Outillage de presse pourra évoluer vers le poste de responsable d’atelier de fabrication ou de bureau de méthodes. Cette formation lui permettra également de travailler dans toute entreprise où l’activité d’usinage sur MOCN est présente.",
                "\n" +
                        "\n" +
                        "Age maximum : 23 ans\n" +
                        "Niveau Scolaire : Baccalauréat scientifique ou technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens des responsabilités, de l’organisation et de la discipline\n" +
                        " • Esprit d’autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Bonnes relations humaines\n" +
                        " • Maîtrise de soi, motivation pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Contre-indications : handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladies nerveuses.\n" +
                        "\n" +
                        "Mode de sélection des candidats à la formation :\n" +
                        "\n" +
                        " • Remplissage du dossier d’orientation\n" +
                        " • Réussite aux entretiens après présélection",
                "");
        insertFiliere("Mécatronique","","","",
                "Le \"Technicien Spécialisé en Mécatronique (aéronautique/automobile)\" intervient dans des différentes opérations liées au domaine de l'aéronautique et l'automobile, à savoir:\n" +
                        "les équipements électroniques, électriques, électromécaniques, pneumatiques ou hydrauliques, le câblage électrique, les instruments de bord, la radionavigation, le pilotage automatique et le système radar etc.Il exerce son métier dans des entreprises spécialisées dans la fourniture de composants pour l’aéronautique/l'automobile avec une partie câblage électrique ou cartes électroniques. Il peut travailler au sein d'entreprises qui opérent dans le secteur industriel dans les domaines aéronautique/automobile, et disposent du matériel de production avec une dimension électrique importante. C'est un métier qui requiert de la polyvalence pour mener à bien différentes opérations. Parmi les activités qui incombent au Technicien Spécialisé en Mécatronique dans le domaine de la production ou l’installation des composants électriques et électroniques, Il gère:\n" +
                        "le câblage, l'installation des connecteurs, la soudure des différents composants, la conduction des machines, le contrôle des systèmes, la maintenance préventuve, les visites, la mesure des grandeurs, l'établissement des bons de travaux, la saisie des données, le diagnostic, la détection des pannes, la réparation et le changement des organes, l'entretien des équipements électriques, la conduite d'études, le chiffrage, l'assemblage de tout type de composants (électriques, électroniques, hydrauliques, pneumatiques etc.), et la réalisation de schémas électriques. En plus de l'installation, la vérification et le montage, Il fait des essais sur le produit. Au niveau des équipements de production, le Technicien opère plus précisément sur des armoires de commande, des moteurs, des automates programmables, des variateurs de vitesse, des valves, des pompes, des systèmes hydrauliques, des systèmes pneumatiques, des convoyeurs, des éléments de transmission. En vue de garantir le bon fonctionnement des équipements, Il vérifie la conformité et le fonctionnement d'un équipement nouvellement installé, et procède à de nombreuses tâches telles que la validation de l'architecture d'un automatisme, l'ajustement ou l'étalonnement des chaînes de régulation, la programmation des automates. Il apporte toute modification nécessaire à la chaîne de production et participe à des arrêts de maintenance.",
                "Ce technicien spécialisé doit être très autonome, posséder une maturité d’esprit et avoir une bonne présentation. Il doit être disponible, méthodique et posséder une bonne faculté d’observation et de déduction.Les techniciens Spécialisés de Mécatronique (aéronautique/automobile) exercent leurs fonctions dans les entreprises manufacturières et les industries de production. Ils sont à l’emploi de moyennes et grosses entreprises possédant un parc d’équipements qui permet le contrôle et la commande des procédés industriels. Ces techniciens sont employés surtout par les entreprises possédant des systèmes de mesure de grandeurs physiques et de contrôle des procédés. La marge de manœuvre dont ils disposent s'inscrit dans le cadre des limites imposées par la réglementation, les méthodes de travail de l’entreprise et les certifications dont elle dispose.",
                "Age limite : 26 ans pour les bacheliers et 30 ans\n" +
                        "pour les licenciés\n" +
                        "Niveau scolaire minimum requis : Diplôme du Baccalauréat Scientifique ou Technique\n" +
                        "Les qualités et aptitudes que le candidat doit posséder :\n" +
                        "\n" +
                        " • Sens de responsabilité, de l’organisation et de la discipline\n" +
                        " • Esprit d’ Autonomie, d’analyse, de créativité et d’initiative\n" +
                        " • Aisance en relations humaines\n" +
                        " • Maîtrise de soi, Passion pour la technologie et ambition pour la promotion professionnelle\n" +
                        "\n" +
                        "Contre-indications pour exercer ce métier : handicap physique (problème de colonne vertébrale), problème de vue ou de distinction de couleur, maladie du cœur, maladie nerveuse.\n" +
                        "Mode de sélection des candidats :\n" +
                        "\n" +
                        " • Dossier d’orientation à remplir\n" +
                        " • Entretiens après présélection",
                "A l’issue de la formation le technicien spécialisé doit être capable de :\n"+
                        " • Veiller au bon fonctionnement des équipements électroniques et électriques de l'aéronef/automobile et notamment des instruments de bord, de la radionavigation, du pilotage automatique, du système radar, des câblages électriques\n" +
                        " • Effectuer des opérations de contrôle\n" +
                        " • Câbler des composants électriques\n" +
                        " • Installer des composants électroniques sur des cartes\n" +
                        " • Tester le fonctionnement de systèmes électriques ou électromécaniques\n" +
                        " • Installer des connecteurs\n" +
                        " • Souder des composants\n" +
                        " • Effectuer la maintenance de premier niveau\n" +
                        " • Installer des isolants électriques\n" +
                        " • Créer et analyser des schémas électriques\n" +
                        " • Intervenir sur des réseaux de transmission de données\n" +
                        " • Mesurer des grandeurs électriques\n" +
                        " • Calibrer des signaux\n" +
                        " • Installer des armoires électriques\n" +
                        " • Installation électriques, hydrauliques, pneumatiques\n" +
                        " • Détecter une panne ou un dysfonction des préactionneurs et actionneurs (étonnement\n" +
                        " • Décider des réparations à effectuer après un diagnostic\n" +
                        " • Déposer/reposer, monter/démonter, entretenir, Repérer les systèmes avionique\n" +
                        " • Effectuer, lire et Interpréter des relevés de paramètres\n" +
                        " • Maîtriser l'utilisation de matériels de mesure pour effectuer des tests\n" +
                        " • Respecter les engagements de qualité, coûts et délais\n" +
                        " • Participer au lancement d’une nouvelle production\n" +
                        " • Gérer une production\n" +
                        " • Encadrer le personnel d’exécution et contrôler son travail\n" +
                        " • Lire un plan et appliquer avec rigueur la documentation technique\n" +
                        " • Réaliser des documents techniques\n" +
                        " • Lire l'anglais technique\n" +
                        " • Organiser ses interventions");

//        "Technicien Spécialisé Bureau d’Etudes en Automobile"
//        "Technicien en Fabrication Mécanique option Montage / Ajustage Outillage de presse"
//        "Technicien Spécialisé en Production et Qualité en Automobile"
//        "Usinage sur MOCN option METHODE FAO Outillage de presse"
    }


    public void insertFiliere(String name, String num_modules, String nom_modules, String nbr_horaire, String details, String debouches, String conditions, String profile_formation){
        Filiere filiere  = new Filiere(name, num_modules
        , nom_modules
        , nbr_horaire
        , details
        , debouches
        , conditions
        , profile_formation);
        setFiliere(filiere);
 }
}
