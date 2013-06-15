package com.gilpam01;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class UQL extends Activity {
	ListView productlistview;
	ArrayList<Product> productdetails;
	AdapterView.AdapterContextMenuInfo info;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_uql);
		
		Intent intent = getIntent();
		final String username = intent.getStringExtra(WelcomeScreen.EXTRA_MESSAGE);
		Log.e("UQL","Logged in user name is "+username);
		Toast.makeText(this,"Welcom "+username+" to Quicklist", Toast.LENGTH_SHORT).show();
		
		productlistview = (ListView)findViewById(R.id.UQL_listview);
		productdetails = new ArrayList<Product>();
		Product product;
		
		int i =0;
		for (i = 1; i<11; i++){
			product = new Product();
			product.setID(i+100+"");
			product.setImage(R.drawable.toordal);
			product.setName("Toor dal");
			product.setUOM(i+" KG");
			product.setPrice(10.50);
			productdetails.add(product);
		}
		Log.e("UQL","product details added and the length is " +i);
		
		productlistview.setAdapter(new ListAdapter(productdetails,this));
/*		productlistview.setOnItemClickListener(new OnItemClickListener() {
       	 public void onItemClick(AdapterView a, View v, int position, long id) {
       	                
       	         String s =(String) ((TextView) v.findViewById(R.id.itemcode)).getText();
       	         Toast.makeText(UQL.this, s, Toast.LENGTH_LONG).show();
       	             }
       	     });*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_uql, menu);
		return true;
	}

}
