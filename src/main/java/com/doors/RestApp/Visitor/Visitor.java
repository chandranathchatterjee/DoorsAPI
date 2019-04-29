package com.doors.RestApp.Visitor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visitor {

   @Id
    private String id;
    private String name;
    private String locality;
    private String identification;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }


    public Visitor()
    {}


    public Visitor(String id, String name, String locality, String identification) {
        this.id = id;
        this.name = name;
        this.locality = locality;
        this.identification = identification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }


}
