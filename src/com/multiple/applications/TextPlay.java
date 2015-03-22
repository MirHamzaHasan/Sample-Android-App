package com.multiple.applications;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		Button b=(Button)findViewById(R.id.btnResults_textplay);
		final ToggleButton tb=(ToggleButton) findViewById(R.id.tbOnAndOff_textplay);
	    final EditText et=(EditText) findViewById(R.id.etData_textplay);
		final TextView tv=(TextView)findViewById(R.id.tvResults_textplay);
		tb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(tb.isChecked()){
					et.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else{
					et.setInputType(InputType.TYPE_CLASS_TEXT);
				}
				
			}
		});
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String myString=et.getText().toString();
				if(myString.contentEquals("left")){
					tv.setGravity(Gravity.LEFT);
				}
				else if(myString.contentEquals("right")){
					tv.setGravity(Gravity.RIGHT);
				}
				else if(myString.contentEquals("center")){
					tv.setGravity(Gravity.CENTER);
				}
				else if(myString.contentEquals("red")){
					tv.setTextColor(Color.RED);
				}
				else if(myString.contains("HAMZA")){
					Random cr=new Random();
					tv.setText("HAMZA");
					tv.setTextSize(cr.nextInt(80));
					tv.setTextColor(Color.rgb(cr.nextInt(265),cr.nextInt(265), cr.nextInt(265)));;
					int any=cr.nextInt(3);
					switch(any){
					case 0:
						tv.setGravity(Gravity.LEFT);
						break;
					case 1:
						tv.setGravity(Gravity.CENTER);
						break;
					case 2:
						tv.setGravity(Gravity.RIGHT);
						break;
					
					
					}
					}
				else{
					tv.setText(myString);
				}
				}
			
		});
	}
	
	

	

}
