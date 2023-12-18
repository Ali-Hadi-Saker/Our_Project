package com.democrapp.vote.persistence.models;

public class User {
    private String userId;
    private String userName;


    public String toString(){
        return "User{" + "userId="+ userId+ '\n'
                        + "username="+ userName +'}';
    }
}
