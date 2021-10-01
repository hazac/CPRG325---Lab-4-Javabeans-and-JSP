package models;

import java.io.Serializable;

public class Note implements Serializable{
    private String title;
    private String contents;

    public Note() {
        this.title = "";
        this.contents = "";
    }

    public Note(String title, String content) {
        this.title = title;
        this.contents = content;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setContents(String content) {
        this.contents = content;
    }



    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
    
}
