package com.cube.android.loktragit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abc on 02-05-2017.
 */

public class Parent {
    @SerializedName("sha")
    private String sha;
    @SerializedName("url")
    private String url;
    @SerializedName("html_url")
    private String html_url;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}
