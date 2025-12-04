package com.example.groupno44_biwta.Ananta;

import java.time.LocalDateTime;

public class OperationalStatus {

    private String statusID,tripId,currentPosition,weatherCondition,safetyTasksCompleted;
    private LocalDateTime timeT;
    private Boolean readyForDeparture;
    private int fuelLevelPercent,passengerCount;
    private Boolean isOverCapacity,boardingCompleted;

    public OperationalStatus(String statusID, String tripId, String currentPosition, String weatherCondition, String safetyTasksCompleted, LocalDateTime timeT, Boolean readyForDeparture, int fuelLevelPercent, int passengerCount, Boolean isOverCapacity, Boolean boardingCompleted) {
        this.statusID = statusID;
        this.tripId = tripId;
        this.currentPosition = currentPosition;
        this.weatherCondition = weatherCondition;
        this.safetyTasksCompleted = safetyTasksCompleted;
        this.timeT = timeT;
        this.readyForDeparture = readyForDeparture;
        this.fuelLevelPercent = fuelLevelPercent;
        this.passengerCount = passengerCount;
        this.isOverCapacity = isOverCapacity;
        this.boardingCompleted = boardingCompleted;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getSafetyTasksCompleted() {
        return safetyTasksCompleted;
    }

    public void setSafetyTasksCompleted(String safetyTasksCompleted) {
        this.safetyTasksCompleted = safetyTasksCompleted;
    }

    public LocalDateTime getTimeT() {
        return timeT;
    }

    public void setTimeT(LocalDateTime timeT) {
        this.timeT = timeT;
    }

    public Boolean getReadyForDeparture() {
        return readyForDeparture;
    }

    public void setReadyForDeparture(Boolean readyForDeparture) {
        this.readyForDeparture = readyForDeparture;
    }

    public int getFuelLevelPercent() {
        return fuelLevelPercent;
    }

    public void setFuelLevelPercent(int fuelLevelPercent) {
        this.fuelLevelPercent = fuelLevelPercent;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public Boolean getOverCapacity() {
        return isOverCapacity;
    }

    public void setOverCapacity(Boolean overCapacity) {
        isOverCapacity = overCapacity;
    }

    public Boolean getBoardingCompleted() {
        return boardingCompleted;
    }

    public void setBoardingCompleted(Boolean boardingCompleted) {
        this.boardingCompleted = boardingCompleted;
    }

    @Override
    public String toString() {
        return "OperationalStatus{" +
                "statusID='" + statusID + '\'' +
                ", tripId='" + tripId + '\'' +
                ", currentPosition='" + currentPosition + '\'' +
                ", weatherCondition='" + weatherCondition + '\'' +
                ", safetyTasksCompleted='" + safetyTasksCompleted + '\'' +
                ", timeT=" + timeT +
                ", readyForDeparture=" + readyForDeparture +
                ", fuelLevelPercent=" + fuelLevelPercent +
                ", passengerCount=" + passengerCount +
                ", isOverCapacity=" + isOverCapacity +
                ", boardingCompleted=" + boardingCompleted +
                '}';
    }
}
