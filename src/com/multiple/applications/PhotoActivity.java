package com.multiple.applications;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PhotoActivity extends Activity implements View.OnClickListener{
	
	ImageButton ib;
	ImageView iv;
	Button wall;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo);
		initialize();
	}
	private void initialize(){
		ib=(ImageButton) findViewById(R.id.imageButton1_Photo);
		iv=(ImageView) findViewById(R.id.imageView_Photo);
		wall=(Button) findViewById(R.id.button2_Photo);
		ib.setOnClickListener(this);
		wall.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.imageButton1_Photo:
		break;
		case R.id.button2_Photo:
			break;
		}
	}
}
