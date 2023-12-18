package com.democrapp.vote.persistence.models;

public class User {
    private String userId;
    private String userName;


    public String toString(){
        return "User{" + "userId="+ userId+ '\n'
                        + "username="+ userName +'}';
    }
    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
    public String getUserId(){return userId;}
    public void setUserId(String userId){this.userId = userId;}
    public String getUserName(){return userName;}
    public void setUserName(String userName){this.userName = userName;}

}
