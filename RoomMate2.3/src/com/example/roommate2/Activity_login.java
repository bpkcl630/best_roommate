package com.example.roommate2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;

import com.example.roommate2.DatabaseHelper;

public class Activity_login extends Activity {

	public EditText email;
	public EditText password;
	public DatabaseHelper myDB;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		email = (EditText)findViewById(R.id.editText_loginEmail);
		String sEmial= email.getText().toString();
		String sPassword = password.getText().toString();
		password = (EditText)findViewById(R.id.editText_loginPassword);;
		//创建DataBaseHelper辅助类对象
		myDB = new DatabaseHelper(this, "my.db", null, 1);
		//向数据库中插入和更新数据
		insertAndUpdateData(myDB);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
	
	public void onclicklogin(View v){
		Intent intent = new Intent( this,
				MainActivity.class);
		 this.startActivity(intent);
	}

	//向数据库中插入和更新数据
	public void insertAndUpdateData(DatabaseHelper myHelper){
	//获取数据库对象
	SQLiteDatabase db = myHelper.getWritableDatabase();
	//使用execSQL方法向表中插入数据
	//insert into 表名(字段列表) values(值列表)。
	//如： insert into person(name, age) values(‘传智’,3)
	db.execSQL("insert into login_info(email,password) values(sEmail,sPassword)");
	/*//使用insert方法向表中插入数据
	ContentValues values = new ContentValues();
	values.put("name", "xh");
	values.put("level", 5);
	//调用方法插入数据
	db.insert("hero_info", "id", values);
	//使用update方法更新表中的数据
	//清空ContentValues对象
	values.clear();
	values.put("name", "xh");
	values.put("level", 10);
	//更新xh的level 为10
	db.update("login_info", values, "level = 5", null);*/
	//关闭SQLiteDatabase对象
	db.close();
	}

	//从数据库中查询数据
	public String queryData(DatabaseHelper myHelper){
	String result = "";
	//获得数据库对象
	SQLiteDatabase db = myHelper.getReadableDatabase();
	//查询表中的数据
	Cursor cursor = db.query("login_info", null, null, null, null, null, "id asc");
	//获取email列的索引
	int nameIndex = cursor.getColumnIndex("email");
	//获取password列的索引
	int levelIndex = cursor.getColumnIndex("password");
	for (cursor.moveToFirst();!(cursor.isAfterLast());cursor.moveToNext()) {
	result = result + cursor.getString(nameIndex)+ "\t\t";
	result = result + cursor.getInt(levelIndex)+"\n";
	}
	cursor.close();//关闭结果集
	db.close();//关闭数据库对象
	return result;
	}

	@Override
	protected void onDestroy() {
	SQLiteDatabase db = myDB.getWritableDatabase();//获取数据库对象
	//删除hero_info表中所有的数据 传入1 表示删除所有行------>点击back按钮
	db.delete("login_info", "1", null);
	super.onDestroy();
	}
	
}
