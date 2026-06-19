package com.mindcare.model;

public class User implements Notifiable {
    private String name;
    private String phone;
    private String email;
    private String password;

    public User(String name, String email, String password, String phone) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public void notify(String message) {
        System.out.println("Notificando " + name + ": " + message);
    }
}
