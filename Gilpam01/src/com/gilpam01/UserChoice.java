package com.gilpam01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class UserChoice extends Activity {

	ImageView SNL, UQL, COUT;
	Intent intent;
	String username;
	public final static String EXTRA_MESSAGE = "com.gilpam01.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_user_choice);
		final Intent intent = getIntent();
		final String username = intent.getStringExtra(WelcomeScreen.EXTRA_MESSAGE);
		Log.e("UserChoice","Logged in user name is "+username);
		Toast.makeText(this,"Welcom "+username+" to Gilpam.com", Toast.LENGTH_SHORT).show();
		
		final ImageView SNL = (ImageView)findViewById(R.id.snlbutton);
		SNL.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SNLClick();
			}

			private void SNLClick() {
				// TODO Auto-generated method stub
				Log.e("UserChoice","User clicked on SNL button");
			}
		});
		final ImageView UQL = (ImageView)findViewById(R.id.uqlbutton);
		UQL.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				UQLClick();
			}

/*			private void UQLClick() {
				// TODO Auto-generated method stub
				Log.e("UserChoice","User clicked on UQL button");
				intent = new Intent(this, UQL.class);
				username = "kiran.duvvuri@gmail.com"; // TODO this username should come from facebook login
		    	intent.putExtra(EXTRA_MESSAGE, username);
		    	startActivity(intent);
			}*/
		});
		final ImageView COUT = (ImageView)findViewById(R.id.coutbutton);
		COUT.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				COUTClick();
			}

			private void COUTClick() {
				// TODO Auto-generated method stub
				Log.e("UserChoice","User clicked on COUT button");
			}
		});
		
	}
	
	private void UQLClick() {
		// TODO Auto-generated method stub
		Log.e("UserChoice","User clicked on UQL button");
		intent = new Intent(this, UQL.class);
		username = "kiran.duvvuri@gmail.com"; // TODO this username should come from facebook login
    	intent.putExtra(EXTRA_MESSAGE, username);
    	startActivity(intent);
	}


}
