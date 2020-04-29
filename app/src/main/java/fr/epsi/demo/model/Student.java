package fr.epsi.demo.model;

import org.json.JSONObject;

public class Student {

    private String name = "";
    private String email = "";
    private String picture_url = "";


    public Student(JSONObject jsonObject){
        setName(jsonObject.optString("name",""));
        setEmail(jsonObject.optString("email",""));
        setPicture_url(jsonObject.optString("picture_irl",""));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }
}
