/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author djamilabaroudi
 */
@Entity
@Table(name="PERSONS")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String FirstName;
    
    private String FamilyName;
    
    private String adress;

    /**
     * Get the value of adress
     *
     * @return the value of adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Set the value of adress
     *
     * @param adress new value of adress
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }


    /**
     * Get the value of FamilyName
     *
     * @return the value of FamilyName
     */
    public String getFamilyName() {
        return FamilyName;
    }

    /**
     * Set the value of FamilyName
     *
     * @param FamilyName new value of FamilyName
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }



    /**
     * Get the value of FirstName
     *
     * @return the value of FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Set the value of FirstName
     *
     * @param FirstName new value of FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Person[ id=" + id + " ]";
    }
    
}
