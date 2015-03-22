package com.multiple.applications;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Counter extends Activity {
	int counter=0;
	TextView tv;
	Button add;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle("Counter");
		setContentView(R.layout.activity_counter);
		tv=(TextView)findViewById(R.id.tvResults);
		add=(Button)findViewById(R.id.btnAdd);
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				counter++;
			
				
				tv.setText("Your Total Is "+ counter);
			}
		});
	}
	public void SubClicked(View v){
		counter--;
		tv.setText("Your Total Is "+ counter);
	}
	
	
}
