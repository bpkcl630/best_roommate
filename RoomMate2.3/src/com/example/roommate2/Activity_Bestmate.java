package com.example.roommate2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class Activity_Bestmate extends FragmentActivity {
	// TODO Auto-generated constructor stub

	protected int pageIndex;

	protected int[] layoutid = new int[] { R.layout.activity_query_01,
			R.layout.activity_query_02, R.layout.activity_query_03,
			R.layout.activity_query_04, R.layout.activity_query_05,
			R.layout.activity_query_06 };

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bestmate);

		pageIndex = 0;

		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,
						new PageFragment(layoutid[pageIndex])).commit();

	}

	public void onClickNext(View v) {
		pageIndex++;
		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,
						new PageFragment(layoutid[pageIndex])).commit();
	}

	public void onClickPre(View v) {
		pageIndex--;
		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,
						new PageFragment(layoutid[pageIndex])).commit();
	}

	public void onClickResult(View v) {

		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,
						new PageFragment(R.layout.activity_query_result)).commit();
	}
	
	public void onClickag(View v) {
		pageIndex = 0;
		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.content_frame,
						new PageFragment(layoutid[pageIndex])).commit();
	}

	public void onclickgoback(View v) {
		this.finish();
	}
}
