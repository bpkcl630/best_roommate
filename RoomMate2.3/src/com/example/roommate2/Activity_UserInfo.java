package com.example.roommate2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class Activity_UserInfo extends Activity {

	protected TabHost mtabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity__user_info);
		
		/** Tabhost----主页面 **/
		mtabHost = (TabHost) findViewById(R.id.tabhost);
		mtabHost.setup();
		View tabview1 = createTabView(mtabHost.getContext(), "个人资料");
		TabSpec setContent = mtabHost.newTabSpec("tag1").setIndicator(tabview1)
				.setContent(R.id.tab1);
		mtabHost.addTab(setContent);
		View tabview2 = createTabView(mtabHost.getContext(), "室友要求");
		setContent = mtabHost.newTabSpec("tag2").setIndicator(tabview2)
				.setContent(R.id.tab2);
		mtabHost.addTab(setContent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity__user_info, menu);
		return true;
	}
	
	private static View createTabView(final Context context, final String text) {
		View view = LayoutInflater.from(context).inflate(
				R.layout.tab_indicator, null);
		TextView tv = (TextView) view.findViewById(R.id.title);
		tv.setText(text);
		return view;
	}
	
	public void onclickback(View v) {
		this.finish();
	}

}
