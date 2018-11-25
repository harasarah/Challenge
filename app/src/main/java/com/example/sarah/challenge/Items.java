package com.example.sarah.challenge;

import com.google.gson.annotations.SerializedName;

public class Items {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("avatar_url")
    private String avatar_url;
    @SerializedName("stargazers_count")
    private String stargazers_count;
    @SerializedName("login")
    private String login;

    public Items(String name, String description, String avatar_url, String stargazers_count, String login) {
        this.name = name;
        this.description = description;
        this.avatar_url = avatar_url;
        this.stargazers_count = stargazers_count;
        this.login = login;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(String stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
