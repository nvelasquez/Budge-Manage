/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Nestor_Velasquez
 */
@Entity
@Table(uniqueConstraints= {@UniqueConstraint(columnNames={"BUDGETUSER_ID, EXPENDING_NAME"})})
public class Expending extends Finance implements Serializable {
    @ManyToOne
    private BudgetUser budgetUser;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Expending_id")
    private Integer id;
    
    @Column(name="Expending_name")
    private String name;
    @Column(name="Expending_total")
    private double expendingTotal;
    @Column(name="Generate_Date", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private Timestamp generateDate;
    @Column(name="Update_Date", columnDefinition="DATE DEFAULT CURRENT_DATE")
    private Timestamp updateDate;
    @Column(name="Expending_priority")
    private int priority;
    @Column(name="Expending_Type")
    private String type;

    public Expending() {
    
    }

    public Expending(BudgetUser budgetUser, String name, double expendingTotal, Timestamp generateDate, Timestamp updateDate, int priority, String type) {
        this.budgetUser = budgetUser;
        this.name = name;
        this.expendingTotal = expendingTotal;
        this.generateDate = generateDate;
        this.updateDate = updateDate;
        this.priority = priority;
        this.type = type;
    }
    
    
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expending)) {
            return false;
        }
        Expending other = (Expending) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * @return the expendingTotal
     */
    @Override
    public double getFinanceTotal() {
        return expendingTotal;
    }

    /**
     * @param expendingTotal the expendingTotal to set
     */
    @Override
    public void seFinanceTotal(double expendingTotal) {
        this.expendingTotal = expendingTotal;
    }

    /**
     * @return the generateDate
     */
    @Override
    public Timestamp getGenerateDate() {
        return generateDate;
    }

    /**
     * @param generateDate the generateDate to set
     */
    @Override
    public void setGenerateDate(Timestamp generateDate) {
        this.generateDate = generateDate;
    }

    /**
     * @return the updateDate
     */
    @Override
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    @Override
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the priority
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return the type
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    @Override
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the budgetUser
     */
    public BudgetUser getBudgetUser() {
        return budgetUser;
    }

    /**
     * @param budgetUser the budgetUser to set
     */
    public void setBudgetUser(BudgetUser budgetUser) {
        this.budgetUser = budgetUser;
    }

}
