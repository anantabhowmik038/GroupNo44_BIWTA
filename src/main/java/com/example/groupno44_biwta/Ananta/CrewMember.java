package com.example.groupno44_biwta.Ananta;

public class CrewMember {
    private int crewId;
    private String name,rank,username,passwordHash,assignedFerryId;


    public CrewMember(int crewId, String name, String rank, String username, String passwordHash, String assignedFerryId) {
        this.crewId = crewId;
        this.name = name;
        this.rank = rank;
        this.username = username;
        this.passwordHash = passwordHash;
        this.assignedFerryId = assignedFerryId;

    }

    public int getCrewId() {
        return crewId;
    }

    public void setCrewId(int crewId) {
        this.crewId = crewId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getAssignedFerryId() {
        return assignedFerryId;
    }

    public void setAssignedFerryId(String assignedFerryId) {
        this.assignedFerryId = assignedFerryId;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "crewId=" + crewId +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", assignedFerryId='" + assignedFerryId + '\'' +
                '}';
    }
}
