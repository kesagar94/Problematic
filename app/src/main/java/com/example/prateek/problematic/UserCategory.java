package com.example.prateek.problematic;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;

/**
 * Created by prateek on 3/5/2015.
 */
public class UserCategory extends ActionBarActivity {
    Button btn_movie;

    private String current_user;
    private String current_score;
    private String current_email;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        //to get username
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("current_user");
        String score = bundle.getString("current_score");
        String email=bundle.getString("current_email");

        btn_movie = (Button)findViewById(R.id.btn_movie);
        btn_movie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(UserCategory.this, MoviesCategory.class);
                intent.putExtra("current_user",current_user);
                intent.putExtra("current_score",current_score);
                intent.putExtra("current_score",current_email);
                startActivity(intent);
                overridePendingTransition(R.anim.right_in, R.anim.bottom_in);
            }
        });


    }
}
