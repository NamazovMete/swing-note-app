package com.namazovmete;
import java.time.LocalDateTime;

public class Note {
    private int id;
    private String title;
    private String body;
    private LocalDateTime timestamp;
    
    public Note(String title, String body) {
        this.title = title;
        this.body = body;
        this.timestamp = LocalDateTime.now();
    }

    // constructor for database
    public Note(int id, String title, String body, LocalDateTime timestamp) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }
}
