package com.wiloke.generic;

public class User implements Comparable<User>{
    private String username;
    private Integer points;

    public User(String username, Integer points) {
        this.username = username;
        this.points = points;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public int compareTo(User anotherUser) {
        return this.points.compareTo(anotherUser.points);
    }
}
