package com.multiple.applications;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Splash extends Activity {
	MediaPlayer media;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		
		final ImageView iv=(ImageView)findViewById(R.id.ivSplash);
		iv.setBackgroundResource(R.anim.animation);
	
		
		media=MediaPlayer.create(Splash.this, R.raw.splash);
		media.start();
		AnimationDrawable anim=(AnimationDrawable)iv.getBackground();
		
		Thread timer=new Thread(){
			public void run(){
				try{
					
					sleep(5000);
					
					
					
				}catch(Exception ex){ex.printStackTrace();}
				finally{
				   
					startActivity(new Intent(Splash.this,MainActivity.class));
				}
			}
		};
		timer.start();anim.start();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		media.release();//this will not take sound to second activity
		this.finish();
	}

	
}
