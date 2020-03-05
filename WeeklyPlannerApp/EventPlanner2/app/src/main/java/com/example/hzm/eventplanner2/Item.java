package com.example.hzm.eventplanner2;

/**
 * Created by Khalida Yasmin on 2/10/2018.
 */
public class Item {
    int id;
    String name;
    String type;
    String location;
    String notes;
    String complete;


    public Item(String name, String type, String location, String notes, String complete) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.notes = notes;
        this.complete = complete;
    }

    public Item(int id, String name, String type, String location, String notes, String complete) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.notes = notes;
        this.complete = complete;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

   public String getLocation() { return location; }
   public void setLocation(String location) { this.location = location;}

   public String getNotes() { return notes; }
   public void setNotes(String notes) { this.notes= notes; }

    public String getComplete() { return complete; }
    public void setComplete(String complete) { this.complete= complete; }
}
