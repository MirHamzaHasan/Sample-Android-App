package com.multiple.applications;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends Activity {
	EditText personalEmail,intro,personalName,stupidThings,hatefulAction,outro;
	String emailAdd,beginning,name,stupidAction,hateFulAct,out;
	Button sendEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_email_actvity);
		try{
		this.initObjects();
		}catch(Exception ex){ex.printStackTrace();}
	}
	
	public void SendEmail(android.view.View v){
		try{
		EditTextToStringConvertor();
		
		String emailAddresses[]={emailAdd};
		String message="Hello "+
		name+
		"I Just want To Say"+
		beginning+
		". Not Only That i Hate Youuu When You"+
		stupidAction +
		", That's Really Make Me Crazy , I just Want You to "+
		hateFulAct+
		" well that's all that i want to say "+
		out+
		" Bye Bye";
	
		Intent emailIntent=new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailAddresses);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Get Lost");
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);
		}catch(Exception ex){Dialog d=new Dialog(this);
		d.setTitle(ex.getMessage());
		d.show();
		}
	}
	private void EditTextToStringConvertor(){
		emailAdd=personalEmail.getText().toString();
		beginning=intro.getText().toString();
		name=personalName.getText().toString();
		stupidAction=stupidThings.getText().toString();
		hateFulAct=hatefulAction.getText().toString();
		out=outro.getText().toString();
	}
	private void initObjects(){
		personalEmail=(EditText) findViewById(R.id.etEmailAddresses_emailactivity);
		intro=(EditText) findViewById(R.id.et_hatefulintro_emailactivity);
		personalName=(EditText) findViewById(R.id.etPersonzName_emailactivity);
		stupidThings=(EditText) findViewById(R.id.etStupidity_emailactivity);
		hatefulAction=(EditText) findViewById(R.id.etYourDesire_emailActivity);
		outro=(EditText) findViewById(R.id.etHateFulOutro_emailActivitys);
	}

}
