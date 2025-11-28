package com.example.groupno44_biwta.Ananta;

import java.time.LocalDate;

public class IncidentReport {
    private int incidentId,reportedByCrewId,severityLevel;
    private String ferryId,incidentType;

    private String description,witnessInfo,mediaPath;
    private LocalDate incidentDate;

    private String status;
    private boolean isDraft;

    public IncidentReport(int incidentId, int reportedByCrewId, int severityLevel, String ferryId, String incidentType, String description, String witnessInfo, String mediaPath, LocalDate incidentDate, String status, boolean isDraft) {
        this.incidentId = incidentId;
        this.reportedByCrewId = reportedByCrewId;
        this.severityLevel = severityLevel;
        this.ferryId = ferryId;
        this.incidentType = incidentType;
        this.description = description;
        this.witnessInfo = witnessInfo;
        this.mediaPath = mediaPath;
        this.incidentDate = incidentDate;
        this.status = status;
        this.isDraft = isDraft;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public int getReportedByCrewId() {
        return reportedByCrewId;
    }

    public void setReportedByCrewId(int reportedByCrewId) {
        this.reportedByCrewId = reportedByCrewId;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getFerryId() {
        return ferryId;
    }

    public void setFerryId(String ferryId) {
        this.ferryId = ferryId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWitnessInfo() {
        return witnessInfo;
    }

    public void setWitnessInfo(String witnessInfo) {
        this.witnessInfo = witnessInfo;
    }

    public String getMediaPath() {
        return mediaPath;
    }

    public void setMediaPath(String mediaPath) {
        this.mediaPath = mediaPath;
    }

    public LocalDate getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(LocalDate incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDraft() {
        return isDraft;
    }

    public void setDraft(boolean draft) {
        isDraft = draft;
    }

    @Override
    public String toString() {
        return "IncidentReport{" +
                "incidentId=" + incidentId +
                ", reportedByCrewId=" + reportedByCrewId +
                ", severityLevel=" + severityLevel +
                ", ferryId='" + ferryId + '\'' +
                ", incidentType='" + incidentType + '\'' +
                ", description='" + description + '\'' +
                ", witnessInfo='" + witnessInfo + '\'' +
                ", mediaPath='" + mediaPath + '\'' +
                ", incidentDate=" + incidentDate +
                ", status='" + status + '\'' +
                ", isDraft=" + isDraft +
                '}';
    }

}
