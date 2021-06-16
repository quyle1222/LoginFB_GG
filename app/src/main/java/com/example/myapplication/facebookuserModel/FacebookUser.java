package com.example.myapplication.facebookuserModel;

import com.google.gson.annotations.SerializedName;

public class FacebookUser {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("first_name")
    private String first_name;

    @SerializedName("last_name")
    private String last_name;

    @SerializedName("email")
    private String email;

    public FacebookUser(String id, String name, String first_name, String last_name, String email) {
        this.id = id;
        this.name = name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
