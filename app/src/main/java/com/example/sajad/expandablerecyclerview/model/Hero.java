package com.example.sajad.expandablerecyclerview.model;

import com.google.gson.annotations.SerializedName;

public class Hero {

    private String name;
    private String realName;
    private String team;
    private String firstAppearance;
    private String createdBy;
    private String publisher;
    // if you want choose name and it's not match json url
    // you can use @SerializedName("name match in json")
    @SerializedName("imageurl")
    private String imageUrl;
    private String bio;

    public Hero(String name, String realName, String team, String firstAppearance, String createdBy, String publisher, String imageUrl, String bio) {
        setName(name);
        setRealName(realName);
        setTeam(team);
        setFirstAppearance(firstAppearance);
        setCreatedBy(createdBy);
        setPublisher(publisher);
        setImageUrl(imageUrl);
        setBio(bio);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
