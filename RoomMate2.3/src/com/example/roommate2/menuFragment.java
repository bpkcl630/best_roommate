package com.example.roommate2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class menuFragment extends Fragment {
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.menu_fragment, null);
	}
	
	public void onclickcard(View v){
		Intent intent = new Intent( getActivity(),
				Activity_Cards.class);
		 getActivity().startActivity(intent);
	}
	public void onclickar(View v){
		Intent intent = new Intent( getActivity(),
				Activity_PersonInfo.class);
		 getActivity().startActivity(intent);
	}

}
