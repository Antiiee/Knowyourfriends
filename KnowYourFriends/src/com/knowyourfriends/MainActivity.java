package com.knowyourfriends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;
//import android.app.DownloadManager.Request;
//import android.service.textservice.SpellCheckerService.Session;

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
	/*public class Splash extends Activity {

		private final int SPLASH_DISPLAY_LENGHT = 1000;

		/** Called when the activity is first created. */
		@Override
		public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			setContentView(R.layout.activity_main);

			// start Facebook Login
			Session.openActiveSession(this, true, new Session.StatusCallback() {

				// callback when session changes state
				@Override
				public void call(Session session, SessionState state, Exception exception) {
					if (session.isOpened()) {

						// make request to the /me API
						Request.executeMeRequestAsync(session, new Request.GraphUserCallback() {

							// callback after Graph API response with user object
							@Override
							public void onCompleted(GraphUser user, Response response) {
								if (user != null) {
									TextView welcome = (TextView) findViewById(R.id.welcome);
									welcome.setText("Hello " + user.getName() + "!");
								}
							}
						});
					}
				}

				/* New Handler to start the Menu-Activity 
				 * and close this Splash-Screen after some seconds.
	        new Handler().postDelayed(new Runnable(){
	            @Override
	            public void run() {
	                /* Create an Intent that will start the Menu-Activity. 
	                Intent mainIntent = new Intent(Splash.this,Menu.class);
	                Splash.this.startActivity(mainIntent);
	                Splash.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGHT);*/
			});
		}

		@Override
		public void onActivityResult(int requestCode, int resultCode, Intent data) {
			super.onActivityResult(requestCode, resultCode, data);
			Session.getActiveSession().onActivityResult(this, requestCode, resultCode, data);
		}

/*
		@Override
		public boolean onCreateOptionsMenu(Menu menu) 
		{
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}*/
	}



