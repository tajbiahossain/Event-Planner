package com.example.hzm.eventplanner2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class DatabaseHandler extends SQLiteOpenHelper{
    private static final int databaseVersion = 1;
    private static final String databaseName = "expenseManagerDB";
    private static final String tableName = "items";
    private static final String keyId = "id";
    private static final String keyName = "name";
    private static final String keyType = "type";
    private static final String keyLocation = "location";
    private static final String keyNotes = "notes";
    private static final String keyComplete = "complete";

    public DatabaseHandler(Context context) {
        super(context, databaseName,null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+tableName
                +"("
                +keyId+" INTEGER PRIMARY KEY, "
                +keyName+" TEXT, "
                +keyType+" TEXT, "
                +keyLocation+" TEXT, "
                +keyNotes+" TEXT,"
                +keyComplete+" TEXT"
                +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion1) {
        String sql = "DROP TABLE IF EXISTS "+tableName;
        db.execSQL(sql);
        onCreate(db);
    }

    public void insertItem(Item item){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(keyId, item.getId());
        values.put(keyName, item.getName());
        values.put(keyType, item.getType());
        values.put(keyLocation, item.getLocation());
        values.put(keyNotes, item.getNotes());
        values.put(keyComplete, item.getComplete());
        db.insert(tableName,null, values);
        db.close();
    }

    public Item getItem(int ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM items WHERE id = " + ID , null);
        Item item = null;
        if (cursor.moveToFirst()) {
            item = new Item(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5));
        }
        db.close();
        return item;
    }

    
    public String getName(int ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM items WHERE id = " + ID , null);
        String string = null;
        if (cursor.moveToFirst()) {
            string = new String(cursor.getString(1));
        }
        db.close();
        return string;
    }


    public String getType(int ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM items WHERE id = " + ID , null);
        String string = null;
        if (cursor.moveToFirst()) {
            string = new String(cursor.getString(2));
        }
        db.close();
        return string;
    }


    public List<Item> getAllItems(int ID){
        SQLiteDatabase db = this.getReadableDatabase();

        List<Item> itemList = new ArrayList<>();
        String sql = "SELECT * FROM items WHERE id = " + ID;
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
                Item item = new Item(Integer.parseInt(cursor.getString(0)), cursor.getString(1),cursor.getString(2), cursor.getString(3),cursor.getString(4), cursor.getString(5) );
                itemList.add(item);
        }
        db.close();
        return itemList;
    }


    public List<Item> getAllItems(){
        SQLiteDatabase db = this.getReadableDatabase();

        List<Item> itemList = new ArrayList<>();
        String sql = "SELECT * FROM " + tableName;
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
            do {
                Item item = new Item(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5));
                itemList.add(item);
            }while (cursor.moveToNext());
        }
        db.close();
        return itemList;
    }


    public void deleteItem(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(tableName, keyId+"=?", new String[]{String.valueOf(id)});
        db.close();
    }


}
