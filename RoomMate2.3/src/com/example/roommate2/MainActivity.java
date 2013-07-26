package com.example.roommate2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class MainActivity extends FragmentActivity {
	private SlidingMenu menu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 设置标题
		setTitle("Attach");

		// 初始化滑动菜单
		initSlidingMenu();
	}

	/**
	 * 初始化滑动菜单
	 */
	private void initSlidingMenu() {
		// 设置主界面视图
		setContentView(R.layout.content_frame);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.content_frame, new mainFragment()).commit();

		// 设置滑动菜单的属性值
		menu = new SlidingMenu(this);
		menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		menu.setShadowWidth(50);
		menu.setShadowDrawable(R.drawable.shadow);
		menu.setBehindOffset(150);
		menu.setFadeDegree(0.35f);
		menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
		// 设置滑动菜单的视图界面
		menu.setMenu(R.layout.menu_frame);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.menu_frame, new menuFragment()).commit();
	}

	@Override
	public void onBackPressed() {
		// 点击返回键关闭滑动菜单
		if (menu.isMenuShowing()) {
			menu.showContent();
		} else {
			super.onBackPressed();
		}
	}

	public void onclickcard(View v) {
		Intent intent = new Intent(this, Activity_Cards.class);
		this.startActivity(intent);
	}

	public void onclickmore(View v) {
		// TODO Auto-generated method stub
		if(menu.isShown())
		{menu.showMenu();}
		else
		{menu.showContent();}
	}

	public void onclicksearch(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, Activity_Search.class);
		this.startActivity(intent);
	}

	public void onclickar(View v) {
		Intent intent = new Intent(this, Activity_PersonInfo.class);
		this.startActivity(intent);
	}
	
	public void onclickexit(View v) {
		Intent home = new Intent(Intent.ACTION_MAIN);   
	    home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);   
	    home.addCategory(Intent.CATEGORY_HOME);   
	    startActivity(home);  
	}
	
	
	public void onclickvip(View v){
		Intent intent = new Intent( this,
				Activity_vip.class);
		this.startActivity(intent);
	}
	
	public void onclicktips(View v){
		Intent intent = new Intent( this,
				Activity_tips.class);
		this.startActivity(intent);
	}

}