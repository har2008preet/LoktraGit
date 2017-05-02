package com.cube.android.loktragit.Model;

import java.util.List;

/**
 * Created by abc on 02-05-2017.
 */

public class Repo {
    private String sha;
    private Commit commit;
    private String url;
    private String html_url;
    private String comments_url;
    private PersonDetail author;
    private PersonDetail committer;
    private List<Parent> parents = null;

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
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

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public PersonDetail getAuthor() {
        return author;
    }

    public void setAuthor(PersonDetail author) {
        this.author = author;
    }

    public PersonDetail getCommitter() {
        return committer;
    }

    public void setCommitter(PersonDetail committer) {
        this.committer = committer;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }
}
