package com.example.prateek.problematic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Category extends Activity implements OnClickListener{

	Button mov;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.category);
		mov=(Button)findViewById(R.id.btn_movie);
		mov.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.btn_movie:
			Intent i = new Intent("com.example.prateek.problematic.MOVIE");
			startActivity(i);
			break;
		}
	}
	
	

}
