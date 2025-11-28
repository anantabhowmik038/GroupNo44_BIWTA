package com.example.groupno44_biwta.Ananta;

import java.time.LocalDate;

public class SafetyReport {
    private int reportId;
    private String ferryId;
    private String crewMemberId;
    private boolean lifeJacketStatus,engineCondition,fireExtinguisherStatus;
    private String status;
    private LocalDate submissionDate;

    public SafetyReport(int reportId, String ferryId, String crewMemberId, boolean lifeJacketStatus, boolean engineCondition, boolean fireExtinguisherStatus, String status, LocalDate submissionDate) {
        this.reportId = reportId;
        this.ferryId = ferryId;
        this.crewMemberId = crewMemberId;
        this.lifeJacketStatus = lifeJacketStatus;
        this.engineCondition = engineCondition;
        this.fireExtinguisherStatus = fireExtinguisherStatus;
        this.status = status;
        this.submissionDate = submissionDate;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getFerryId() {
        return ferryId;
    }

    public void setFerryId(String ferryId) {
        this.ferryId = ferryId;
    }

    public String getCrewMemberId() {
        return crewMemberId;
    }

    public void setCrewMemberId(String crewMemberId) {
        this.crewMemberId = crewMemberId;
    }

    public boolean isLifeJacketStatus() {
        return lifeJacketStatus;
    }

    public void setLifeJacketStatus(boolean lifeJacketStatus) {
        this.lifeJacketStatus = lifeJacketStatus;
    }

    public boolean isEngineCondition() {
        return engineCondition;
    }

    public void setEngineCondition(boolean engineCondition) {
        this.engineCondition = engineCondition;
    }

    public boolean isFireExtinguisherStatus() {
        return fireExtinguisherStatus;
    }

    public void setFireExtinguisherStatus(boolean fireExtinguisherStatus) {
        this.fireExtinguisherStatus = fireExtinguisherStatus;
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
        return "SafetyReport{" +
                "reportId=" + reportId +
                ", ferryId='" + ferryId + '\'' +
                ", crewMemberId='" + crewMemberId + '\'' +
                ", lifeJacketStatus=" + lifeJacketStatus +
                ", engineCondition=" + engineCondition +
                ", fireExtinguisherStatus=" + fireExtinguisherStatus +
                ", status='" + status + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
