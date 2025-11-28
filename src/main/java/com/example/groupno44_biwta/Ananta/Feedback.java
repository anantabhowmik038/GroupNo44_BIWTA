package com.example.groupno44_biwta.Ananta;

import java.time.LocalDate;

public class Feedback {
    private int feedbackId,passengerId;
    private LocalDate submissionDate;

    private String feedbackType,comments,priorityLevel;
    private int rating;

    private String imagepath,status;

    public Feedback(int feedbackId, int passengerId, LocalDate submissionDate, String feedbackType, String comments, String priorityLevel, int rating, String imagePath, String status) {
        this.feedbackId = feedbackId;
        this.passengerId = passengerId;
        this.submissionDate = submissionDate;
        this.feedbackType = feedbackType;
        this.comments = comments;
        this.priorityLevel = priorityLevel;
        this.rating = rating;
        this.imagepath = imagepath;
        this.status = status;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImagePath() {
        return imagepath;
    }

    public void setImagePath(String imagePath) {
        this.imagepath = imagepath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", passengerId=" + passengerId +
                ", submissionDate=" + submissionDate +
                ", feedbackType='" + feedbackType + '\'' +
                ", comments='" + comments + '\'' +
                ", priorityLevel='" + priorityLevel + '\'' +
                ", rating=" + rating +
                ", imagePath='" + imagepath + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
