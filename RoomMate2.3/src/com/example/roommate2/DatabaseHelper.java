package com.example.roommate2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {     
	
	DatabaseHelper(Context context, String name, CursorFactory cursorFactory, int version) 
	{     
		super(context, name, cursorFactory, version);     
	 }     
		     
   @Override    
   public void onCreate(SQLiteDatabase db) {     
	// TODO 创建数据库后，对数据库的操作 
	/*创建一个名为 mytable_login 的表，表有一个列名为 _id，并且是主键，
	 * 这列的值是会自动增长的整数(例如，当你插入一行时，SQLite 会给这列自动赋值）
	 * 另外还有列：email( 字符 ) 和 password( 字符 )。 SQLite 会自动为主键列创建索引。*/
	   db.execSQL("CREATE TABLE mytable_login (_id INTEGER PRIMARY KEYAUTOINCREMENT, email TEXT,password TEXT);");
   }     
		     
    @Override    
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {     
    // TODO 更改数据库版本的操作     
   }     
		     
   @Override    
   public void onOpen(SQLiteDatabase db) {     
	  super.onOpen(db);       
		// TODO 每次成功打开数据库后首先被执行     
   }     
}     

