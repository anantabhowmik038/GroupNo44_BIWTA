package com.example.groupno44_biwta.Ananta;

public class Ferry {
    private int ferryId;
    private  String name;
    private int capacity;
    private int currentPassengerCount;
    private double fuelLevel;
    private float engineTemperature;
    private String currentPosition;
    private String currentStatus;
    private boolean warning;

    public Ferry(int ferryId, String name, int capacity, int currentPassengerCount, double fuelLevel, float engineTemperature, String currentPosition, String currentStatus, boolean warning) {
        this.ferryId = ferryId;
        this.name = name;
        this.capacity = capacity;
        this.currentPassengerCount = currentPassengerCount;
        this.fuelLevel = fuelLevel;
        this.engineTemperature = engineTemperature;
        this.currentPosition = currentPosition;
        this.currentStatus = currentStatus;
        this.warning = warning;
    }


    public int getFerryId() {
        return ferryId;
    }

    public void setFerryId(int ferryId) {
        this.ferryId = ferryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPassengerCount() {
        return currentPassengerCount;
    }

    public void setCurrentPassengerCount(int currentPassengerCount) {
        this.currentPassengerCount = currentPassengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public float getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(float engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public boolean isWarning() {
        return warning;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }


    @Override
    public String toString() {
        return "Ferry{" +
                "ferryId=" + ferryId +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", currentPassengerCount=" + currentPassengerCount +
                ", fuelLevel=" + fuelLevel +
                ", engineTemperature=" + engineTemperature +
                ", currentPosition='" + currentPosition + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", warning=" + warning +
                '}';
    }
}
