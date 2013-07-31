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
	// TODO 
	   db.execSQL("CREATE TABLE mytable_login (_id INTEGER PRIMARY KEYAUTOINCREMENT, email TEXT,password TEXT);");
   }     
		     
    @Override    
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {     
    // TODO   
   }     
		     
   @Override    
   public void onOpen(SQLiteDatabase db) {     
	  super.onOpen(db);       
		
   }     
}     

