package com.example.diary;

import io.realm.RealmObject;

/**
 * Created by 이금호 on 2017-08-26.
 */

public class Article extends RealmObject {
    private String title;
    private String content;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content;}

    public void setContent(String content) {this.content = content; }
}
