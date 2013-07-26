package com.example.roommate2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class mainFragment extends Fragment {

	protected TabHost mtabHost;
	protected ListView listView1, listView2, listView_latest, mDrawerList;
	protected ImageView Bestmatebutton;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main_fragment, null);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Bestmatebutton = (ImageView) getView().findViewById(R.id.bestmate);
		Bestmatebutton.setOnClickListener(new MyButtonListener_Bestmate());

		/** Tabhost----主页面 **/
		TabHost mtabHost = (TabHost) getView().findViewById(R.id.tabhost);
		mtabHost.setup();
		/** 最新 **/
		View tabview1 = createTabView(mtabHost.getContext(), "最新");
		TabSpec setContent = mtabHost.newTabSpec("tag1").setIndicator(tabview1)
				.setContent(R.id.latestPerson);
		mtabHost.addTab(setContent);
		/** 推荐 **/
		View tabview2 = createTabView(mtabHost.getContext(), "推荐");
		setContent = mtabHost.newTabSpec("tag2").setIndicator(tabview2)
				.setContent(R.id.matchlayout);
		mtabHost.addTab(setContent);

		/** fill listview in tabhost **/
		listView1 = (ListView) getView().findViewById(R.id.latestPerson);
		listView2 = (ListView) getView().findViewById(R.id.matchPerson);

		int[] flags1 = new int[] { R.drawable.lastest_02,
				R.drawable.lastest_03, R.drawable.lastest_04,
				R.drawable.lastest_05, R.drawable.lastest_06,
				R.drawable.lastest_07, R.drawable.lastest_02,
				R.drawable.lastest_03, R.drawable.lastest_04,
				R.drawable.lastest_05, R.drawable.lastest_06,
				R.drawable.lastest_07, };
		int[] flags2 = new int[] { R.drawable.match_02, R.drawable.match_03,
				R.drawable.match_04, R.drawable.match_05, R.drawable.match_02,
				R.drawable.match_03, R.drawable.match_04, R.drawable.match_05, };

		List<HashMap<String, String>> aList1 = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < 12; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("imagelist1", Integer.toString(flags1[i]));
			aList1.add(hm);
		}

		List<HashMap<String, String>> aList2 = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < 8; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("imagelist2", Integer.toString(flags2[i]));
			aList2.add(hm);
		}
		String[] from1 = { "imagelist1" }, from2 = { "imagelist2" };
		int[] to1 = { R.id.imageView_latest }, to2 = { R.id.imageView_match }; // imageview
																				// id

		SimpleAdapter adapter1 = new SimpleAdapter(getActivity()
				.getBaseContext(), aList1, R.layout.latest_item01, from1, to1);
		/* layout里面不需要src属性 */
		SimpleAdapter adapter2 = new SimpleAdapter(getActivity()
				.getBaseContext(), aList2, R.layout.latest_item01, from2, to1);
		/* layout里面不需要src属性 */
		listView1.setAdapter(adapter1);
		listView2.setAdapter(adapter2);

		/** 点击item,进入下一个界面 **/
		listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView adapterView, View view,
					int arg2, long arg3) {
				int selectedPosition = adapterView.getSelectedItemPosition();
				// Intent intent = new Intent();
				Intent intent = new Intent(getActivity(),
						Activity_PersonInfo.class);
				getActivity().startActivity(intent);
				// super.onListClick(adapterView,view,selectedPosition,arg3);
			}
		});
		listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView adapterView, View view,
					int arg2, long arg3) {
				int selectedPosition = adapterView.getSelectedItemPosition();
				// Intent intent = new Intent();
				Intent intent = new Intent(getActivity(),
						Activity_PersonInfo.class);
				getActivity().startActivity(intent);
				// super.onListClick(adapterView,view,selectedPosition,arg3);
			}
		});

	}

	private static View createTabView(final Context context, final String text) {
		View view = LayoutInflater.from(context).inflate(
				R.layout.tab_indicator, null);
		TextView tv = (TextView) view.findViewById(R.id.title);
		tv.setText(text);
		return view;
	}

	class MyButtonListener_Bestmate implements OnClickListener {
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(getActivity(), Activity_Bestmate.class);
			getActivity().startActivity(intent);
		}
	}

}
