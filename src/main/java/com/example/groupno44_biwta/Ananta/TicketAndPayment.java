package com.example.groupno44_biwta.Ananta;

import java.time.LocalDateTime;

public class TicketAndPayment {
    private String ticketId,userId,trip,seatType,status;
    private LocalDateTime originalDeparture,currentDeparture;
    private double finalFare,refundAmount;
    private String paymentStatus;

    public TicketAndPayment(String ticketId, String userId, String trip, String seatType, String status, LocalDateTime originalDeparture, LocalDateTime currentDeparture, double finalFare, double refundAmount, String paymentStatus) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.trip = trip;
        this.seatType = seatType;
        this.status = status;
        this.originalDeparture = originalDeparture;
        this.currentDeparture = currentDeparture;
        this.finalFare = finalFare;
        this.refundAmount = refundAmount;
        this.paymentStatus = paymentStatus;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getOriginalDeparture() {
        return originalDeparture;
    }

    public void setOriginalDeparture(LocalDateTime originalDeparture) {
        this.originalDeparture = originalDeparture;
    }

    public LocalDateTime getCurrentDeparture() {
        return currentDeparture;
    }

    public void setCurrentDeparture(LocalDateTime currentDeparture) {
        this.currentDeparture = currentDeparture;
    }

    public double getFinalFare() {
        return finalFare;
    }

    public void setFinalFare(double finalFare) {
        this.finalFare = finalFare;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "TicketAndPayment{" +
                "ticketId='" + ticketId + '\'' +
                ", userId='" + userId + '\'' +
                ", trip='" + trip + '\'' +
                ", seatType='" + seatType + '\'' +
                ", status='" + status + '\'' +
                ", originalDeparture=" + originalDeparture +
                ", currentDeparture=" + currentDeparture +
                ", finalFare=" + finalFare +
                ", refundAmount=" + refundAmount +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
