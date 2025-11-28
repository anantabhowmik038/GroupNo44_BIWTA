package com.example.groupno44_biwta.Ananta;

import java.time.LocalDate;

public class Ticket {
    private int ticketId;
    private int passengerId;
    private int ferryId;

    private double fare;
    private double discountApplied;
    private LocalDate travelDate;

    private String seatNumber,status;
    private boolean isConfirmed;


    public Ticket(int ticketId, int passengerId, int ferryId, double fare, double discountApplied, LocalDate travelDate, String seatNumber, String status, boolean isConfirmed) {
        this.ticketId = ticketId;
        this.passengerId = passengerId;
        this.ferryId = ferryId;
        this.fare = fare;
        this.discountApplied = discountApplied;
        this.travelDate = travelDate;
        this.seatNumber = seatNumber;
        this.status = status;
        this.isConfirmed = isConfirmed;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getFerryId() {
        return ferryId;
    }

    public void setFerryId(int ferryId) {
        this.ferryId = ferryId;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(double discountApplied) {
        this.discountApplied = discountApplied;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", passengerId=" + passengerId +
                ", ferryId=" + ferryId +
                ", fare=" + fare +
                ", discountApplied=" + discountApplied +
                ", travelDate=" + travelDate +
                ", seatNumber='" + seatNumber + '\'' +
                ", status='" + status + '\'' +
                ", isConfirmed=" + isConfirmed +
                '}';
    }
}
