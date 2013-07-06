package com.knowyourfriends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class MainActivity extends Activity 
{

	//@Override
	//protected void onCreate(Bundle savedInstanceState) 
	//{
		//super.onCreate(savedInstanceState);
		
	//}
	
	
	
	/*public void onCreate(Bundle savedInstanceState)
	{
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    
	}*/
	public class Splash extends Activity {

	    private final int SPLASH_DISPLAY_LENGHT = 1000;

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.activity_main);

	        /* New Handler to start the Menu-Activity 
	         * and close this Splash-Screen after some seconds.*/
	        new Handler().postDelayed(new Runnable(){
	            @Override
	            public void run() {
	                /* Create an Intent that will start the Menu-Activity. */
	                Intent mainIntent = new Intent(Splash.this,Menu.class);
	                Splash.this.startActivity(mainIntent);
	                Splash.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGHT);
	    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
	
	
	
