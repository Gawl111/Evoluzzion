package com.raulete.evoluzzion.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
  
	static final String DATABASE_NAME = "evoluzzion";
	static final int DATABASE_VERSION = 1;

	public DatabaseHelper(Context paramContext){
		super(paramContext, "tasks", null, 1);
	}

	public void onCreate(SQLiteDatabase database){
		databaseSetup(database);
	}

	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion){
		
	}
	
	public void databaseSetup(SQLiteDatabase database){
		//paramSQLiteDatabase.execSQL(Task.getCreateSQL());
	}
	
}