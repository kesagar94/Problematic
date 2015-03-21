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

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        btn_movie = (Button)findViewById(R.id.btn_movie);
        btn_movie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),MoviesCategory.class);
                startActivity(i);
                overridePendingTransition(R.anim.right_in, R.anim.bottom_in);
            }
        });


    }
}
