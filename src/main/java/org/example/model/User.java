package org.example.model;

public class User {
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String password;

    public User(){}

    public User(String name, String LastName, String Email,String Password){
        this.name = name;
        this.lastName = LastName;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("User [id = %d; name = %s; lastName = %s; email = %s; password = %s]",
        id, name, lastName, email, password);
    }
}
