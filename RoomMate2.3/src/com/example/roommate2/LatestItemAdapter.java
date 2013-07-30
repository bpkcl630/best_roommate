package com.example.roommate2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LatestItemAdapter extends BaseAdapter {
	View[] itemViews;
	final Context context;
	private Person currentperson;

	public LatestItemAdapter(Context context) {
		super();
		this.context = context;
	}

	public LatestItemAdapter(Context context, Person[] personlist) {
		this.context = context;
		itemViews = new View[personlist.length];
		
		
		for (int i = 0; i < itemViews.length; i++) {
			currentperson = personlist[i];
			itemViews[i] = makeItemView();
		}
	}

	public int getCount() {
		return itemViews.length;
	}

	public View getItem(int position) {
		return itemViews[position];
	}

	public long getItemId(int position) {
		return position;
	}

	private View makeItemView() {

		// Inflater layout latestitem
		View itemView = LayoutInflater.from(context).inflate(
				R.layout.latest_item, null);

		// find each component and assign correspondent value
		TextView name = (TextView) itemView.findViewById(R.id.tV_latest_name);
		name.setText(currentperson.getName());
		TextView age = (TextView) itemView.findViewById(R.id.tV_latest_age);
		age.setText(String.valueOf(currentperson.getAge()));
		TextView location = (TextView) itemView.findViewById(R.id.tV_latest_location);
		location.setText(currentperson.getLocation());
		ImageView gender = (ImageView) itemView.findViewById(R.id.iV_latest_gender);
		gender.setImageResource(currentperson.getGenderResId());

		return itemView;
	}

	//Implement the abstract method getView in Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null)
			return itemViews[position];
		return convertView;
	}
}
