/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author S Ragothaman
 */
public class SprintEvents {
    private int batchID;
    private String batchNumber;
    private int sprint;                // 1 -6 only 
    private Date workDate;
    private String eventID;
    private String yesNo;
    private String remarks;
    private String conductedBy;
    private Date conductedOn;

    /**
     * @return the batchID
     */
    public int getBatchID() {
        return batchID;
    }

    /**
     * @param batchID the batchID to set
     */
    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    /**
     * @return the batchNumber
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * @param batchNumber the batchNumber to set
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * @return the sprint
     */
    public int getSprint() {
        return sprint;
    }

    /**
     * @param sprint the sprint to set
     */
    public void setSprint(int sprint) {
        this.sprint = sprint;
    }

    /**
     * @return the workDate
     */
    public Date getWorkDate() {
        return workDate;
    }

    /**
     * @param workDate the workDate to set
     */
    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    /**
     * @return the eventID
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * @param eventID the eventID to set
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * @return the yesNo
     */
    public String getYesNo() {
        return yesNo;
    }

    /**
     * @param yesNo the yesNo to set
     */
    public void setYesNo(String yesNo) {
        this.yesNo = yesNo;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the conductedBy
     */
    public String getConductedBy() {
        return conductedBy;
    }

    /**
     * @param conductedBy the conductedBy to set
     */
    public void setConductedBy(String conductedBy) {
        this.conductedBy = conductedBy;
    }

    /**
     * @return the conductedOn
     */
    public Date getConductedOn() {
        return conductedOn;
    }

    /**
     * @param conductedOn the conductedOn to set
     */
    public void setConductedOn(Date conductedOn) {
        this.conductedOn = conductedOn;
    }

}
