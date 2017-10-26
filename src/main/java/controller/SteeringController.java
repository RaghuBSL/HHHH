/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.AuditInfra;
import entity.PartnerOnboard;
import entity.Partnermaster;
import entity.Steering;
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
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author S Ragothaman
 */
@Named("steeringController")
@SessionScoped
public class SteeringController implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
   
    //
    private String level;
    private String trainerPosition;
    private Date startDate;
    private Date endDate;
    @Inject
    session.AppMapBean appMapEJB;
    private List<Steering> items ;
   
    private Steering selected;
    
    
    public SteeringController() {
    }

    @PostConstruct
    public void init() {
    }
    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return the trainerPosition
     */
    public String getTrainerPosition() {
        return trainerPosition;
    }

    /**
     * @param trainerPosition the trainerPosition to set
     */
    public void setTrainerPosition(String trainerPosition) {
        this.trainerPosition = trainerPosition;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the trainerCreateForm
     */
   

    /**
     * @return the items
     */
    public List<Steering> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<Steering> items) {
        this.items = items;
    }


}
