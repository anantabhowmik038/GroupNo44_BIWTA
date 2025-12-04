package com.example.groupno44_biwta.Ananta;

import java.time.LocalDate;

public class IncidentAndFeedback {
    private String reportId,sourceUserId,reportType,tripId,severityLevel,description,attachmentURL,status;
    private LocalDate submissionDate;

    public IncidentAndFeedback(String reportId, String sourceUserId, String reportType, String tripId, String severityLevel, String description, String attachmentURL, String status, LocalDate submissionDate) {
        this.reportId = reportId;
        this.sourceUserId = sourceUserId;
        this.reportType = reportType;
        this.tripId = tripId;
        this.severityLevel = severityLevel;
        this.description = description;
        this.attachmentURL = attachmentURL;
        this.status = status;
        this.submissionDate = submissionDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getSourceUserId() {
        return sourceUserId;
    }

    public void setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachmentURL() {
        return attachmentURL;
    }

    public void setAttachmentURL(String attachmentURL) {
        this.attachmentURL = attachmentURL;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "IncidentAndFeedback{" +
                "reportId='" + reportId + '\'' +
                ", sourceUserId='" + sourceUserId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", tripId='" + tripId + '\'' +
                ", severityLevel='" + severityLevel + '\'' +
                ", description='" + description + '\'' +
                ", attachmentURL='" + attachmentURL + '\'' +
                ", status='" + status + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
