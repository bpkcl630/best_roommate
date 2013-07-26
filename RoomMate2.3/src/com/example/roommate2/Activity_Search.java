package com.example.roommate2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Activity_Search extends Activity {

//	private ImageView imageview_search, imageview_back;

	// TODO Auto-generated constructor stub
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
	}

	public void onClickBack(View v) {
		// TODO Auto-generated method stub
		// Intent intent = new Intent(Activity_Search.this, MainActivity.class);
		// Activity_Search.this.startActivity(intent);
		this.finish();
	}

}
