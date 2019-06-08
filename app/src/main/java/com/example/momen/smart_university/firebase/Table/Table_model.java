package com.example.momen.smart_university.firebase.Table;

/**
 * Created by Momen on 3/16/2019.
 */

public class Table_model {

    private String doc_name;
    private String sub_name;
    private int room_num;
    private float from,to;
    private int section;

    public Table_model(){}

    public Table_model(String doc_name, String sub_name, int room_num, float from, float to, int section){
        this.doc_name = doc_name;
        this.sub_name = sub_name;
        this.room_num = room_num;
        this.from = from;
        this.to = to;
        this.section = section;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

    public void setFrom(float from) {
        this.from = from;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setTo(float to) {
        this.to = to;
    }

    public float getFrom() {
        return from;
    }

    public float getTo() {
        return to;
    }

    public int getRoom_num() {
        return room_num;
    }

    public int getSection() {
        return section;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public String getSub_name() {
        return sub_name;
    }
}
