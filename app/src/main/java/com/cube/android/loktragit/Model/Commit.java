package com.cube.android.loktragit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abc on 02-05-2017.
 */

public class Commit {
    @SerializedName("author")
    private Author author;
    @SerializedName("committer")
    private Committer committer;
    @SerializedName("message")
    private String message;
    @SerializedName("tree")
    private Tree tree;
    @SerializedName("url")
    private String url;
    @SerializedName("comment_count")
    private int comment_count;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Committer getCommitter() {
        return committer;
    }

    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }
}
