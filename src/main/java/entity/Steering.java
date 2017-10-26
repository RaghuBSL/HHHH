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
public class Steering {
    /*
    <th>ID</th>
    <th>Date</th>
    <th>Topic</th>
    <th>Description</th>
    <th>Updated By</th>
    <th>Updated On</th>
*/
    private Integer steeringID;
    private Date    date;
    private String topic;
    private String description;
    private String updatedBy;
    private Date   updatedOn;

    /**
     * @return the steeringID
     */
    public Integer getSteeringID() {
        return steeringID;
    }

    /**
     * @param steeringID the steeringID to set
     */
    public void setSteeringID(Integer steeringID) {
        this.steeringID = steeringID;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return the updatedOn
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * @param updatedOn the updatedOn to set
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
    
    
}
