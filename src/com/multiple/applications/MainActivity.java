package com.multiple.applications;


import android.app.ListActivity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {

	String classes[]={"Counter","TextPlay","EmailActivity","PhotoActivity","example5"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTitle("Main Menu");
		this.setListAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,classes));
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String Selected=classes[position];
		try{
		Class ourClass=Class.forName("com.multiple.applications."+Selected);
		Intent intent=new Intent(MainActivity.this,ourClass);
		startActivity(intent);
		}catch(ClassNotFoundException e){e.printStackTrace();}
		
	}
}
