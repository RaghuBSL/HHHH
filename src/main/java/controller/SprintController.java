/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.AuditInfra;
import entity.PartnerOnboard;
import entity.Partnermaster;
import entity.SprintBatch;
import entity.TraineeList;
import entity.Trainer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author S Ragothaman
 */
@Named("sprintController")
@SessionScoped
public class SprintController implements Serializable {

    private String groupMeeting;
    private String remarks = "";
    private String trainee;
    private Boolean leader = false;

    //
    private List<SprintBatch> items;
    private SprintBatch selected;

    @Inject
    session.AppMapBean appMapEJB;

    public SprintController() {
    }

    @PostConstruct
    public void init() {

    }

    public void addGroup() {
        if (null != trainee) {
            if (leader) {
                if (null != trainee) {
                    remarks = remarks + " Leader " + trainee + "\n";
                   // System.out.println("1 leader Added " + remarks + trainee);
                } else {
                   // System.out.println("2 trainee null  " + remarks + trainee);
                }
            } else if (null != trainee) {
                remarks = remarks + trainee + "\n";
               // System.out.println("3 trainee   " + remarks );
            } else {
              //  System.out.println("4 trainee null  " + remarks + trainee);
            }
           // System.out.println("5 " + remarks);
            leader = false;
            trainee = "";
        }

    }

    /**
     * @return the selected
     */
    public SprintBatch getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(SprintBatch selected) {
        this.selected = selected;
    }

    /**
     * @return the items
     */
    public List<SprintBatch> getItems() {
        return items;
    }

    /**
     * @return the groupMeeting
     */
    public String getGroupMeeting() {
        return groupMeeting;
    }

    /**
     * @param groupMeeting the groupMeeting to set
     */
    public void setGroupMeeting(String groupMeeting) {
        this.groupMeeting = groupMeeting;
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
     * @return the trainee
     */
    public String getTrainee() {
        return trainee;
    }

    /**
     * @param trainee the trainee to set
     */
    public void setTrainee(String trainee) {
        this.trainee = trainee;
    }

    /**
     * @return the leader
     */
    public Boolean getLeader() {
        return leader;
    }

    /**
     * @param leader the leader to set
     */
    public void setLeader(Boolean leader) {
        this.leader = leader;
    }
}
