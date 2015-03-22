package com.example.prateek.problematic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;

/**
 * Created by prateek on 3/20/2015.
 */
public class MoviesCategory extends ActionBarActivity {

    private Button btn1_movie;
    private Button btn2_movie;
    private Button btn3_movie;
    private Button btn4_movie;
    private Button btn5_movie;
    private Button btn6_movie;
    private Button btn7_movie;
    private Button btn8_movie;
    private Button btn9_movie;


    private String current_user;
    private String current_score;
    private String current_email;
    private String current_question;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        //user level buttons
        btn1_movie = (Button)findViewById(R.id.btn1_movie);
        btn2_movie = (Button)findViewById(R.id.btn2_movie);
        btn3_movie = (Button)findViewById(R.id.btn3_movie);
        btn4_movie = (Button)findViewById(R.id.btn4_movie);
        btn5_movie = (Button)findViewById(R.id.btn5_movie);
        btn6_movie = (Button)findViewById(R.id.btn6_movie);
        btn7_movie = (Button)findViewById(R.id.btn7_movie);
        btn8_movie = (Button)findViewById(R.id.btn8_movie);
        btn9_movie = (Button)findViewById(R.id.btn9_movie);


        //to get username
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("current_user");
        String score = bundle.getString("current_score");
        String email=bundle.getString("current_email");

        current_email=email;
        current_score=score;
        current_user=username;

        //button_listener 1
        btn1_movie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                current_question="1";
                Intent intent = new Intent(MoviesCategory.this,QuestionDisplay.class);
                intent.putExtra("current_user",current_user);
                intent.putExtra("current_score",current_score);
                intent.putExtra("current_score",current_email);
                intent.putExtra("current_question",current_question);

                startActivity(intent);
                overridePendingTransition(R.anim.top_out, R.anim.bottom_in);
            }
        });

        //button_listener 2
        btn2_movie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                current_question="2";
                Intent intent = new Intent(MoviesCategory.this,QuestionDisplay.class);
                intent.putExtra("current_user",current_user);
                intent.putExtra("current_score",current_score);
                intent.putExtra("current_score",current_email);
                intent.putExtra("current_question",current_question);

                startActivity(intent);
                overridePendingTransition(R.anim.top_out, R.anim.bottom_in);
            }
        });



    }
}
