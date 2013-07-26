package com.example.roommate2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class Activity_Cards extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cards);
		GridView gv = (GridView) findViewById(R.id.card_gridView);
		// 为GridView设置适配器
		int[] imgs = { R.drawable.card_02, R.drawable.card_03,
				R.drawable.card_04, R.drawable.card_05, R.drawable.card_06,
				R.drawable.card_07 };

		List<HashMap<String, String>> aList1 = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < 6; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("imagelist1", Integer.toString(imgs[i]));
			aList1.add(hm);
		}
		String[] from1 = { "imagelist1" };
		int[] to1 = { R.id.imageView_latest }; // imageview's id

		SimpleAdapter adapter1 = new SimpleAdapter(getBaseContext(), aList1,
				R.layout.latest_item01, from1, to1);
		gv.setAdapter(adapter1);
		
		gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView adapterView, View view,
					int arg2, long arg3) {
				int selectedPosition = adapterView.getSelectedItemPosition();
				// Intent intent = new Intent();
				Intent intent = new Intent(Activity_Cards.this,
						Activity_PersonInfo.class);
				Activity_Cards.this.startActivity(intent);
				// super.onListClick(adapterView,view,selectedPosition,arg3);
			}
		});

	}

	public void onclickgoback(View v) {
		this.finish();
	}
}
