package com.example.hzm.eventplanner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class createEvent extends AppCompatActivity {

    EditText itemNameET, itemLocationET, itemNotesET ;
    Button insertBtn, showAllBtn, editBtn, deleteBtn;
    RadioButton rb;
    RadioGroup rg;
    RadioButton rb2;
    RadioGroup rg2;
    LinearLayout outputLL;
    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        itemNameET = (EditText)findViewById(R.id.itemNameET);
        itemLocationET = (EditText)findViewById(R.id.itemLocationET);
        itemNotesET = (EditText)findViewById(R.id.itemNotesET) ;
        outputLL = (LinearLayout)findViewById(R.id.outputLL);
        rg = (RadioGroup)findViewById(R.id.rgroup);
        rg2 = (RadioGroup)findViewById(R.id.rgroup2);
        db = new DatabaseHandler(this);
    }

    public void insertItem(View v){
        Bundle extras = getIntent().getExtras();
        String getId = extras.getString("id");
        int id = Integer.parseInt(getId);

        String name = itemNameET.getText().toString();
        String typeText = rb2.getText().toString();
        String locationText = itemLocationET.getText().toString();
        String notesText = itemNotesET.getText().toString();
        String completeText = rb.getText().toString();
        if(name.equals("") || typeText.equals("") || locationText.equals("") || completeText.equals("")){
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
        }else{
            db.deleteItem(id);
            db.insertItem(new Item(id ,name, typeText, locationText, notesText, completeText));
            Toast.makeText(getApplicationContext(), "Insert Successful", Toast.LENGTH_SHORT).show();

        }
    }

   public void showItem(View v){

       Bundle extras = getIntent().getExtras();
       String getId = extras.getString("id");
       int id = Integer.parseInt(getId);

       Item item = db.getItem(id);
       if(item == null){
           outputLL.removeAllViews();
           Toast.makeText(getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
       }else{
           outputLL.removeAllViews();
           TextView tempTV = new TextView(this);
           tempTV.setText("Event ID: "+item.getId()+"\nEvent name: "+item.getName()+"\nEvent Type: "+item.getType()+"\nEvent Location: "+item.getLocation()+"\nNotes:"+item.getNotes()+"\nComplete:"+item.getComplete()+"\n\n");
           outputLL.addView(tempTV);
       }
   }
   public void showAllItems(View v){
       Bundle extras = getIntent().getExtras();
       String getId = extras.getString("id");
       int id = Integer.parseInt(getId);
       List<Item> items = db.getAllItems(id);
        if(items.size() == 0){
            outputLL.removeAllViews();
            Toast.makeText(getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
        }else{
            outputLL.removeAllViews();
            TextView tempTV = new TextView(this);
            tempTV.setText("");
            outputLL.addView(tempTV);

            for(Item item : items){
                tempTV = new TextView(this);
                tempTV.setText("Event ID: "+item.getId()+"\nEvent name: "+item.getName()+"\nEvent Type: "+item.getType()+"\nEvent Location: "+item.getLocation()+"\nTasks:"+item.getNotes()+item.getComplete()+"\n\n");
                outputLL.addView(tempTV);
            }
        }
    }
    public void editItem(View v){
        Bundle extras = getIntent().getExtras();
        String getId = extras.getString("id");
        int id = Integer.parseInt(getId);
        if(id==0){
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
        }else{
            db.deleteItem(id);
            Toast.makeText(getApplicationContext(), "Enter new input and save", Toast.LENGTH_SHORT).show();

        }
    }


    public void deleteItem(View v){
        Bundle extras = getIntent().getExtras();
        String getId = extras.getString("id");
        int id = Integer.parseInt(getId);
        if(id==0){
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
        }else{
            db.deleteItem(id);
            Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();

        }
    }

    public void rbclick(View v)
    {
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton)findViewById(radiobuttonid);
    }

    public void rbclick2(View v)
    {
        int radiobuttonid2 = rg2.getCheckedRadioButtonId();
        rb2 = (RadioButton)findViewById(radiobuttonid2);
    }


}
