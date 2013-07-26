package com.example.roommate2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Activity_vip extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vip);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_vip, menu);
		return true;
	}

	public void onclickgoback(View v) {
		this.finish();
	}

}
