package com.arnaudlcelestino.vaiana_quizz.controller;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.arnaudlcelestino.vaiana_quizz.R;
import com.arnaudlcelestino.vaiana_quizz.model.Banque_Questions;
import com.arnaudlcelestino.vaiana_quizz.model.Question;

import java.util.Arrays;

public class Fenetre_Quizz extends AppCompatActivity implements View.OnClickListener {

    private TextView textQuestion;
    private Button reponse1;
    private Button reponse2;
    private Button reponse3;
    private Button reponse4;

    private Banque_Questions mBanque_Questions;
    private Question mQuestionActuelle;

    private int mScore = 0;
    private int nombreQuestion = 10;
    public static final String BUNDLE_EXTRA_SCORE = "BUNDLE_EXTRA_SCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre__quizz);

        mBanque_Questions = this.genererQuestion();

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        reponse1 = (Button) findViewById(R.id.reponse1);
        reponse2 = (Button) findViewById(R.id.reponse2);
        reponse3 = (Button) findViewById(R.id.reponse3);
        reponse4 = (Button) findViewById(R.id.reponse4);

        reponse1.setTag(0);
        reponse2.setTag(1);
        reponse3.setTag(2);
        reponse4.setTag(3);

        reponse1.setOnClickListener(this);
        reponse2.setOnClickListener(this);
        reponse3.setOnClickListener(this);
        reponse4.setOnClickListener(this);

        mQuestionActuelle = mBanque_Questions.getQuestion();
        this.afficherQuestion(mQuestionActuelle);

    }

    private void afficherQuestion(final Question question) {

        textQuestion.setText(question.getmQuestion());
        reponse1.setText(question.getmListQ().get(0));
        reponse2.setText(question.getmListQ().get(1));
        reponse3.setText(question.getmListQ().get(2));
        reponse4.setText(question.getmListQ().get(3));
    }

    private Banque_Questions genererQuestion() {

        Question q1 = new Question("Comment s'appelle la grande déesse ?", Arrays.asList("Te Fiti", "Maui", "Gramma", "Tala"), 0);
        Question q2 = new Question("Comment s'appelle le père de Vaiana?", Arrays.asList("Maui", "Tala", "Gramma", "Tui"), 3);
        Question q3 = new Question("Pourquoi Vaiana n'a-t-elle pas le droit d'aller au dessus du récif ?", Arrays.asList("Parce que c'est nul", "Parce que c'est dangereux", "Au dessus du récif, la mer est maudite", "Elle ne sait pas naviguer"), 1);
        Question q4 = new Question("Comment se nomme la grand-mère de Vaiana ?", Arrays.asList("Gramma Tala", "Gramma Toula", "Granas Tala", "Gramma Tui"), 0);
        Question q5 = new Question("Comment s'appelle le poulet qui accompagne Vaiana dans son épopée ?", Arrays.asList("Hie Hie", "Hay Hay", "Cot Cot", "Hei Hei"), 3);
        Question q6 = new Question("Que sont les Kakamoas sur les trois grands bateaux qu'affronte Vaiana ?", Arrays.asList("Des pastèques", "Des kiwis", "Des noix de coco", "des abricots"), 2);
        Question q7 = new Question("Comment s'appelle le monstre de lave ?", Arrays.asList("Te Tui", "Te Fiti", "Ta Riko", "Te Ka"), 3);
        Question q8 = new Question("Que pose Vaiana sur la Tour des Chefs ?", Arrays.asList("Une pierre comme les autres", "Un coquillage", "Un fossile d'ammonite", "Un pierre précieuse"), 1);
        Question q9 = new Question("Quel est le vrai nom du film ?", Arrays.asList("Moana", "Vania", "Moviana", "SaraHamster ;) "), 0);
        Question q10 = new Question("Sur quelle mer ou océan les aventures de Vaiana se déroulent-elles ?", Arrays.asList("Mer des Caraïbes", "Océan Indien", "Austral", "Océan Pacifique"), 3);

        Question q11 = new Question("Quel est le sous-titre de ce film des studios Disney ?", Arrays.asList("La princesse du bout du monde", "Le voyage au bout du monde", "La légende du bout du monde", "La légende de Moana"), 2);
        Question q12 = new Question("Quel est le nom de l'île où le père de Vaiana est le chef respecté de tout son peuple", Arrays.asList("Rapanui", "Motunui", "Mahori", "Maeva"), 1);
        Question q13 = new Question("Quel est le rêve de Vaiana depuis sa plus tendre enfance ?", Arrays.asList("Découvrir le nouveau monde au-delà de la barrière de corail", "De retrouver sa liberté", "Rencontrer le prince charmant", "Devenir la princesse de son île"), 0);
        Question q14 = new Question("Quel objet sacré a été volé à la déesse de la nature sur son île légendaire", Arrays.asList("L'âme de Kiribati", "Le coeur de l'océan", "Le coeur de Tefiti", "L'esprit de Nafuti"), 2);
        Question q15 = new Question("Quelle entité naturelle a choisi Vaiana pour sauver son peuple ?", Arrays.asList("Le vent", "La lave", "L'océan", "Les nuages"), 2);
        Question q16 = new Question("En quel animal marin tatoué sur son dos, la grand-mère de Vaiana veut-elle se réincarner après sa mort?", Arrays.asList("Une raie", "Un dauphin", "Un requin", "ne baleine"), 0);
        Question q17 = new Question("Grand-mère Tala encourage sa petite-fille à accomplir son destin et lui dévoile l'existence d'une grotte secrète. Que découvre Vaiana sur ses ancètres?", Arrays.asList("C'étaient des demi-dieux", "C'étaient des explorateurs", "C'étaient des guerriers", "Qu'ils sont vivants"), 1);
        Question q18 = new Question("Quel animal de compagnie de Vaiana va rester sur l'île après son départ?", Arrays.asList("Un chien", "Une poule", "Un poulet", "Un cochon"), 3);
        Question q19 = new Question("Comment s'appelle le demi-dieu qui va aider Vaiana à sillonner l'océan à la recherche de l'île de la déesse de la nature ?", Arrays.asList("Maturi", "Maui", "Mawahi", "Maisoui"), 1);
        Question q20 = new Question("A quelle tribu appartiennent les mini-pirates habillés de noix de coco qui attaquent nos héros ?", Arrays.asList("Komora", "Krakatoa", "Kakamora", "Kakatoes"), 3);

        Question q21 = new Question("Quel est le surnom du royaume de Lalotaï où se trouve détenue l'arme magique du demi-dieu ?", Arrays.asList("Le royaume du diable", "Le royaume des monstres", "Le royaume des morts-vivants", "Le royaume des dieux"), 1);
        Question q22 = new Question("Quel animal géant et vaniteux, aimant se parer avec tout ce qui brille, conservait l'arme magique dans son antre ?", Arrays.asList("Une pieuvre", "Une tortue", "Un crabe", "Une salamandre"), 2);
        Question q23 = new Question("Quelle est donc cette arme magique qui lui avait été offerte par les dieux?", Arrays.asList("Une pagaie", "Un sabre", "Un hameçon", "Un harpon"), 2);
        Question q24 = new Question("Quelle est la nature du monstre que les héros doivent affronter lors du combat final ?", Arrays.asList("Un monstre de feu", "Un dragon crachant du feu", "Le kraken", "Un monstre de lave"), 3);
        Question q25 = new Question("Qui interprète Vaiana, dans notre version française ?", Arrays.asList("Anaïs Delva", "Cerise Calixte", "Vaiana", "Laurie"), 1);
        Question q26 = new Question("Qui sont les réalisateurs de ce merveilleux film ?", Arrays.asList("Mark Andrews et Brenda Chapman", "Ron Clements et John Musker", "Byron Howard et Nathan Greno", "Yvain Athal et Gauvin chevalier"), 1);
        Question q27 = new Question("Comment se nomment les deux compagnons de Vaiana dans son voyage ?", Arrays.asList("Sven et Olaf", "Hei Hei et Pua", "Hei Hei et Maui", "Tala et Tiki"), 1);
        Question q28 = new Question("Pourquoi Vaiana doit-elle partir pour cette aventure ?", Arrays.asList("Si elle ne part pas, il n'y a pas de film", "Car elle se rebelle", "Pour la gloire", "Elle doit emmener Maui rendre le cœur de Te Fiti"), 3);
        Question q29 = new Question("Les réalisateurs de ce film on fait beaucoup d'autre films chez Disney mais dans ces propositions, un seul est un de leur film. Lequel ?", Arrays.asList("Rox et Roucky", "Les Aristochats", "La Petite Sirène", "Raiponce"), 2);
        Question q30 = new Question("Quand le film Vaiana est-il sorti sur nos grands écrans", Arrays.asList("Le 10 juillet 2012", "Le 4 décembre 2013", "Le 1er décembre 2010", "Le 30 novembre 2016"), 3);

        Question q31 = new Question("Comment Maui obtient-il ses tatouages ?", Arrays.asList("Il se les fait lui-même", "Il les mérite", "Je sais pas", "Il va chez le tatoueur"), 1);
        Question q32 = new Question("Comment s'appelle la chanson de Maui ?", Arrays.asList("Comme les hommes", "Être un homme comme vous", "Pour les hommes", "Etre libre"), 2);
        Question q33 = new Question("Comment s'appelle la chanson de Vaiana ?", Arrays.asList("Le Bleu lumière", "Libérée, délivrée", "Le bleu du ciel", "Ce rêve bleu"), 0);
        Question q34 = new Question("Quelle est la voix de Maui ?", Arrays.asList("Dwaye Joshson", "Dwane Johnson", "Dwayne Johnson", "Eddie Murphy"), 2);
        Question q35 = new Question("Qui est Tamatoa ?", Arrays.asList("Le père de Vaiana", "Le démon de feu", "Le crabe géant", "Le petit cochon"),2 );
        Question q36 = new Question("De quelle couleur est le cœur de la grande déesse des îles ?", Arrays.asList("Il est vert", "Il est bleu", "Il est jaune", "Il est rouge"), 0);
        Question q37 = new Question("Qu'a dit la grand-mère à Vaiana quand elle échoua sur la rive avec sa pirogue en morceaux après son escapade au-delà du récif ?", Arrays.asList("Je ne dirai rien à ton père", "Tu t'es blessée", "Vilaine, tu as désobéi", "Tu accuseras le cochon"), 3);
        Question q38 = new Question("Poi est... ?", Arrays.asList("Une poule", "Un petit pois", "Un cochon", "Un poulet"), 2);
        Question q39 = new Question("Tamatoa vit... ?", Arrays.asList("À Lalotaille", "Dans l'eau", "Sur une île", "En ville"), 0);
        Question q40 = new Question("Dans ce film, il y a beaucoup de références à... ?", Arrays.asList("Raiponce", "La Reine des neiges", "La petite sirène", "Rebelle"), 1);

        Question q41 = new Question("Qui était l'ami de Vaiana ?", Arrays.asList("Le coq", "Le cochon", "L'océan", "Maui"), 2);
        Question q42 = new Question("Qui était réellement Déca ?", Arrays.asList("Un monstre de lave", "Té Fiti", "La mère de Vaiana", "La déesse de l'île"), 1);
        Question q43 = new Question("Comment Vaiana surnomme t'elle Tua le petit cochon ?", Arrays.asList("Travers de porc", "Tranche de bacon", "Chips de bacon", "La futur porchetta"), 0);
        Question q44 = new Question("Que se passe-t-il sur la plage ?", Arrays.asList("Vaiana se baigne juste", "Vaiana tombe la tête dans l'eau", "L'océan s'ouvre pour Vaiana", "Vaiana ne va pas sur la plage car elle déteste l'eau"), 2);
        Question q45 = new Question("Quels sont les pouvoirs de Maui ?", Arrays.asList("L'eau et le vent", "Les plantes et les animaux", "Le feu et la terre", "Le tonnerre et la pluie"), 0);
        Question q46 = new Question("Complète la phrase : Je suis Vaiana de....", Arrays.asList("Maitonouri", "Mautounoui", "Mautonai", "Moutounouri"), 1);
        Question q47 = new Question("Dans quelle main Te Fiti prend-elle Vaiana à la fin ?", Arrays.asList("La gauche", "La droite", "Les deux", "Je ne sais pas ..."), 1);
        Question q48 = new Question("Combien de temps dure Vaiana ?", Arrays.asList("120 minutes", "110 minutes", "107 minutes", "90 minutes"), 2);
        Question q49 = new Question("Comment s'appelle la mère de Vaiana ?", Arrays.asList("Cina", "Tuala", "Sina", "Tala"), 2);
        Question q50 = new Question("Quelle est la couleur dominante du collier de Vaiana ?", Arrays.asList("Bleu", "Vert", "Jaune", "Rose"), 0);


        return new Banque_Questions(Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10,
                q11, q12, q13, q14, q15, q16, q17, q18, q19, q20
                                          ,q21,q22,q23,q24,q24,q25,q26,q27,q28,q29,q30,
                                          q31,q32,q33,q34,q35,q36,q37,q38,q39,q40,
                                          q41,q42,q43,q44,q45,q46,q47,q48,q49,q50
        ));

    }

    @Override
    public void onClick(View v) {
        //On récupère l'indice du bonton lors du clic afin de tester si la réponse est bonne ou pas
        int reponseIndex = (int) v.getTag();

        if (reponseIndex == mQuestionActuelle.getIndexReponse()) {

            //Si indentifiant est bon la réponse est bnonne

            Toast.makeText(this, "Bonne réponse!", Toast.LENGTH_SHORT).show();
            mScore++;
        } else {

            //Sinon la réponse est mauvaise
            Toast.makeText(this, "Mauvaise réponse!", Toast.LENGTH_SHORT).show();
        }

        if (--nombreQuestion == 0) {

            finDuJeu();

        } else {

            mQuestionActuelle = mBanque_Questions.getQuestion();
            afficherQuestion(mQuestionActuelle);

        }
    }

    private void finDuJeu() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Le Quizz est terminé !"
        )
                .setMessage("Votre Score est de : " + mScore + "/10 !")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent();
                        intent.putExtra(BUNDLE_EXTRA_SCORE, mScore);
                        setResult(RESULT_OK, intent);
                        finish();
                        finish();

                    }
                })
                .create()
                .show();
        mScore = 0;
    }


}
