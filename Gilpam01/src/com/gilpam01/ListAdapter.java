package com.gilpam01;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
	private ArrayList<Product> product;
	Context context;
//	private Product Holder;
	private static int i=0;

	ListAdapter(ArrayList<Product> product, Context context){
		this.product = product;
		this.context = context;
	}

	@Override
	public int getCount() {
		return product.size();
	}

	@Override
	public Object getItem(int position) {
		return product.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		i++;
		Log.e("Adapter", "inside adapter get view : "+i);
		View v = convertView;
		if (v==null){
			LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.itemlistview, null);
            
		} 
		
		ImageView image = (ImageView)v.findViewById(R.id.itemimageid);
        TextView nameView = (TextView)v.findViewById(R.id.itemname);
        TextView codeView = (TextView)v.findViewById(R.id.itemcode);
        TextView uomView = (TextView)v.findViewById(R.id.itemuom);
        TextView priceView = (TextView)v.findViewById(R.id.itemprice);
        CheckBox cbView = (CheckBox)v.findViewById(R.id.addcart);

        Product PRODUCT = product.get(position);
        
        image.setImageResource(PRODUCT.image);
        nameView.setText(PRODUCT.name);
        codeView.setText("Item code:"+PRODUCT.id+"");
        uomView.setText(PRODUCT.uom);
        priceView.setText(PRODUCT.price+"");
        cbView.setChecked(PRODUCT.isSelected());
        Log.e("Adapter", "name view: "+PRODUCT.name);
		return v;
	}


}
