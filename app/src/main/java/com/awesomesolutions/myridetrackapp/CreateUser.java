package com.awesomesolutions.myridetrackapp;

public class CreateUser
{
    public CreateUser(){}

    public CreateUser(String name, String email, String password, String code, String issharing, String lng, String lat, String imageurl,String userid) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.code = code;
        this.issharing = issharing;
        this.lng = lng;
        this.lat = lat;
        this.imageurl = imageurl;
        this.userid = userid;
    }

    public String name,email,password,code,issharing,lng,lat,imageurl,userid;
}
