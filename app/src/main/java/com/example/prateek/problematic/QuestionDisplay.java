package com.example.prateek.problematic;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by prateek on 3/21/2015.
 */
public class QuestionDisplay  extends ActionBarActivity {

    ImageView ques_movie_image;


    private String current_user;
    private String current_score;
    private String current_email;
    private String current_question;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        //to get username
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("current_user");
        String score = bundle.getString("current_score");
        String email=bundle.getString("current_email");
        String question=bundle.getString("current_question");

        ques_movie_image=(ImageView) findViewById(R.id.ques_movie_image);

        current_email=email;
        current_score=score;
        current_user=username;
        current_question=question;



       if(current_question.equalsIgnoreCase("1")) {
           ques_movie_image.setBackgroundResource(R.drawable.movies1);
       }
        else if(current_question.equalsIgnoreCase("2")) {
            ques_movie_image.setBackgroundResource(R.drawable.movies2);
        }




    }
}
