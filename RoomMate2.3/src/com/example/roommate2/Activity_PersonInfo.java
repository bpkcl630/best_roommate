package com.example.roommate2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Activity_PersonInfo extends Activity {

	// TODO Auto-generated constructor stub
	private ListView personInfoList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personinfo01);

		personInfoList = (ListView) findViewById(R.id.personinfo_listView);
		/** fill listview in drawer **/
		int[] flags = new int[] { R.drawable.personinfo_02,
				R.drawable.personinfo_03, R.drawable.personinfo_05,
				R.drawable.personinfo_06, R.drawable.personinfo_07, };

		List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < 5; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("imagelist3", Integer.toString(flags[i]));
			aList.add(hm);
		}
		String[] from = { "imagelist3" };
		int[] to = { R.id.imageView_personinfo }; // 是xml里面哪个imageview id
		SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList,
				R.layout.personinfo_item, from, to);
		/* layout里面不需要src属性 */
		personInfoList.setAdapter(adapter);

	}
	
	public void clickBackBt(View v) {
	this.finish();
	}

}
