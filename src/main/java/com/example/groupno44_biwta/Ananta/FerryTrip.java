package com.example.groupno44_biwta.Ananta;

import java.time.LocalDateTime;

public class FerryTrip {
    private String tripId,ferryId,ferryName,routeID,originTerminal,destinationTerminal;
    private LocalDateTime scheduledDeparture;
    private int capacityPassenger;

    public FerryTrip(String tripId, String ferryId, String ferryName, String routeID, String originTerminal, String destinationTerminal, LocalDateTime scheduledDeparture, int capacityPassenger) {
        this.tripId = tripId;
        this.ferryId = ferryId;
        this.ferryName = ferryName;
        this.routeID = routeID;
        this.originTerminal = originTerminal;
        this.destinationTerminal = destinationTerminal;
        this.scheduledDeparture = scheduledDeparture;
        this.capacityPassenger = capacityPassenger;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getFerryId() {
        return ferryId;
    }

    public void setFerryId(String ferryId) {
        this.ferryId = ferryId;
    }

    public String getFerryName() {
        return ferryName;
    }

    public void setFerryName(String ferryName) {
        this.ferryName = ferryName;
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public LocalDateTime getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(LocalDateTime scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public int getCapacityPassenger() {
        return capacityPassenger;
    }

    public void setCapacityPassenger(int capacityPassenger) {
        this.capacityPassenger = capacityPassenger;
    }

    @Override
    public String toString() {
        return "FerryTrip{" +
                "tripId='" + tripId + '\'' +
                ", ferryId='" + ferryId + '\'' +
                ", ferryName='" + ferryName + '\'' +
                ", routeID='" + routeID + '\'' +
                ", originTerminal='" + originTerminal + '\'' +
                ", destinationTerminal='" + destinationTerminal + '\'' +
                ", scheduledDeparture=" + scheduledDeparture +
                ", capacityPassenger=" + capacityPassenger +
                '}';
    }
}
