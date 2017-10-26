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
public class SprintBatch {
    
    private int batchID;
    private String batchNumber;
    private int sprint;                // 1 -6 only 
    private String rollNumber;
    private int traineeID;
    private int name;
    private Date workDate;
    private String attdMarked;
    private String assgnGiven;
    private String score;               // current is makred RED, Yellow Green
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
     * @return the rollNumber
     */
    public String getRollNumber() {
        return rollNumber;
    }

    /**
     * @param rollNumber the rollNumber to set
     */
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * @return the traineeID
     */
    public int getTraineeID() {
        return traineeID;
    }

    /**
     * @param traineeID the traineeID to set
     */
    public void setTraineeID(int traineeID) {
        this.traineeID = traineeID;
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
     * @return the attdMarked
     */
    public String getAttdMarked() {
        return attdMarked;
    }

    /**
     * @param attdMarked the attdMarked to set
     */
    public void setAttdMarked(String attdMarked) {
        this.attdMarked = attdMarked;
    }

    /**
     * @return the assgnGiven
     */
    public String getAssgnGiven() {
        return assgnGiven;
    }

    /**
     * @param assgnGiven the assgnGiven to set
     */
    public void setAssgnGiven(String assgnGiven) {
        this.assgnGiven = assgnGiven;
    }

    /**
     * @return the score
     */
    public String getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(String score) {
        this.score = score;
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

    /**
     * @return the name
     */
    public int getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(int name) {
        this.name = name;
    }
            
    
}
