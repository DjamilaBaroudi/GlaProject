/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author djamilabaroudi
 */
@Entity
@Table(name="ITEM")
public class item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String ItemName;

    private String Description;

    private double BasicPrice;

    private String Status;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date StartingDate;
    
    

    /**
     * Get the value of DateBid
     *
     * @return the value of DateBid
     */
  


    /**
     * Get the value of StartingDate
     *
     * @return the value of StartingDate
     */
    public Date getStartingDate() {
        return StartingDate;
    }

    /**
     * Set the value of StartingDate
     *
     * @param StartingDate new value of StartingDate
     */
    public void setStartingDate(Date StartingDate) {
        this.StartingDate = StartingDate;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date EndDate;

    /**
     * Get the value of EndDate
     *
     * @return the value of EndDate
     */
    public Date getEndDate() {
        return EndDate;
    }

    /**
     * Set the value of EndDate
     *
     * @param EndDate new value of EndDate
     */
    

    /**
     * Get the value of Status
     *
     * @return the value of Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Set the value of Status
     *
     * @param Status new value of Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get the value of BasicPrice
     *
     * @return the value of BasicPrice
     */
    public double getBasicPrice() {
        return BasicPrice;
    }

    /**
     * Set the value of BasicPrice
     *
     * @param BasicPrice new value of BasicPrice
     */
    public void setBasicPrice(double BasicPrice) {
        this.BasicPrice = BasicPrice;
    }

    /**
     * Get the value of Description
     *
     * @return the value of Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Set the value of Description
     *
     * @param Description new value of Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get the value of ItemName
     *
     * @return the value of ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     * Set the value of ItemName
     *
     * @param ItemName new value of ItemName
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        if (!(object instanceof item)) {
            return false;
        }
        item other = (item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item[ id=" + id + " ]";
    }
    
}
