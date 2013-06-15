package com.gilpam01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class WelcomeScreen extends Activity implements OnClickListener{
	//Facebook fb;
	ImageView pic, button;
	public static boolean SessionValid;
	Intent intent;
	String username;
    public final static String EXTRA_MESSAGE = "com.gilpam01.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        String app_id = getString(R.string.app_id);
        setContentView(R.layout.layout_welcome_screen);
        button = (ImageView)findViewById(R.id.loginbtn);
        button.setOnClickListener(this);
        updateButtonImage();
        
    }

    private void updateButtonImage() {
		// TODO Auto-generated method stub
		if(SessionValid){
			button.setImageResource(R.drawable.logout_button);
		} else {
			button.setImageResource(R.drawable.login_button);
		}
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.layout_welcome_screen, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(SessionValid){
//			Toast.makeText(this,"You are already logged in", Toast.LENGTH_SHORT).show();
			SessionValid=false;
			updateButtonImage();

		} else {
			SessionValid=true;
//			Toast.makeText(this,"you are already logged out", Toast.LENGTH_SHORT).show();
			updateButtonImage();
			intent = new Intent(this, UserChoice.class);
			username = "kiran.duvvuri@gmail.com"; // TODO this username should come from facebook login
	    	intent.putExtra(EXTRA_MESSAGE, username);
	    	startActivity(intent);
		}
	}

   
}
