package com.example.groupno44_biwta.Ananta;

public class UserMemberPassenger {
    private String userId,username,password,role,email,phoneNumber,ferryIdAssigned;

    public UserMemberPassenger(String userId, String username, String password, String role, String email, String phoneNumber, String ferryIdAssigned) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ferryIdAssigned = ferryIdAssigned;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFerryIdAssigned() {
        return ferryIdAssigned;
    }

    public void setFerryIdAssigned(String ferryIdAssigned) {
        this.ferryIdAssigned = ferryIdAssigned;
    }

    @Override
    public String toString() {
        return "UserMemberPassenger{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ferryIdAssigned='" + ferryIdAssigned + '\'' +
                '}';
    }
}
