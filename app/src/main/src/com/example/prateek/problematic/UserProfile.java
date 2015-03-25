package com.example.prateek.problematic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by prateek on 3/5/2015.
 */
public class UserProfile extends ActionBarActivity implements OnClickListener{

	Button cat;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		cat = (Button) findViewById(R.id.btn_cat);
		cat.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btn_cat:
			Intent i = new Intent("com.example.prateek.problematic.CATEGORY");
			startActivity(i);
			break;
		}
	}
}
