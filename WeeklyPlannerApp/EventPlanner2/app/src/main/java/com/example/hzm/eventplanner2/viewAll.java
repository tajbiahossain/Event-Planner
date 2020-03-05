package com.example.hzm.eventplanner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class viewAll extends AppCompatActivity {
    EditText itemIdET;
    Button itemShowBtn, showAllBtn;
    LinearLayout outputLL, outputLL2;
    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        itemIdET = (EditText) findViewById(R.id.itemIdET);
        outputLL = (LinearLayout) findViewById(R.id.outputLL);
        outputLL2 = (LinearLayout) findViewById(R.id.outputLL2);
        db = new DatabaseHandler(this);
    }

    public void showItem(View v) {

        String getId = itemIdET.getText().toString();
        if (getId.equals("")){
            Toast.makeText(getApplicationContext(), "No Input Found", Toast.LENGTH_SHORT).show();
        }
        else {
            int id = Integer.parseInt(getId);

            Item item = db.getItem(id);
            if (item == null) {
                outputLL2.removeAllViews();
                Toast.makeText(getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
            } else {
                outputLL2.removeAllViews();
                TextView tempTV = new TextView(this);
                tempTV.setText("Event ID: " + item.getId() + "\nEvent name: " + item.getName() + "\nEvent Type: " + item.getType() + "\nEvent Location: " + item.getLocation() + "\nLists/Notes:\n" + item.getNotes() + "\nComplete:" + item.getComplete() + "\n\n");
                outputLL2.addView(tempTV);
            }
        }
    }


    public void showAllItems(View v) {
        List<Item> items = db.getAllItems();
        if (items.size() == 0) {
            Toast.makeText(getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
        } else {
            outputLL.removeAllViews();
            TextView tempTV = new TextView(this);
            tempTV.setText("");
            outputLL.addView(tempTV);

            for (Item item : items) {
                tempTV = new TextView(this);
                tempTV.setText("Event ID: " + item.getId() + "\nEvent name: " + item.getName() + "\nEvent Type: " + item.getType() + "\nEvent Location: " + item.getLocation() + "\nLists/Notes:\n" + item.getNotes() + "\nComplete:" + item.getComplete() + "\n\n");
                outputLL.addView(tempTV);
            }
        }


    }
}