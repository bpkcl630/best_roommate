package com.example.roommate2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Activity_tips extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tips);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tips, menu);
		return true;
	}

}
