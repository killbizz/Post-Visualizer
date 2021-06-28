package com.example.model;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Post implements Serializable {

    @Id
    private String id;
    private String author;
    private String text;
    // yyyy-mm-dd
    private Date date;
    // hh:mm:ss
    private Time time;

    protected Post() {}

    public Post(String id, String author, String text, Date date, Time time){
        this.id = id;
        this.author = author;
        this.text = text;
        this.date = date;
        this.time = time;
    }


    public String getId() {
        return this.id;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getText() {
        return this.text;
    }

    public Date getDate() {
        return this.date;
    }

    public Time getTime() {
        return this.time;
    }
}
