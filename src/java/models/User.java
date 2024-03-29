package models;

import java.io.Serializable;

//User object

public class User implements Serializable{
    
    private String email;
    private boolean active;
    private String fName;
    private String lName;
    private String password;
    private Role role;

    public User() {
    }

    public User(String email, boolean active, String fName, String lName, String password, Role role) {
        this.email = email;
        this.active = active;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.role = role;    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
}
