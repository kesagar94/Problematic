package com.example.prateek.problematic;

import com.example.prateek.problematic.SQLiteHandler;
import com.example.prateek.problematic.SessionManager;

import java.util.HashMap;
import java.util.List;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.*;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/**
 * Created by prateek on 3/5/2015.
 */
public class UserProfile extends ActionBarActivity {
    Button btn_cat;
    private TextView user_name;
    private TextView user_score;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //to get username
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("current_user");
        String score = bundle.getString("current_score");

        btn_cat = (Button) findViewById(R.id.btn_cat);
        user_name= (TextView) findViewById(R.id.login_username);
        user_score = (TextView) findViewById(R.id.login_score);
        user_name.setText(username);
        user_score.setText(score);

        btn_cat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),UserCategory.class);
                startActivity(i);
                overridePendingTransition(R.anim.top_out, R.anim.bottom_in);
            }
        });

    }


}
