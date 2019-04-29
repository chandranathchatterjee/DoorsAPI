package com.doors.RestApp.Resident;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resident {

   @Id
    private String id;
    private String name;
    private String flatno;

   // private Visitor visitor;

    public Resident()
    {}

    public Resident(String id, String name, String flatno) {
        this.id = id;
        this.name = name;
        this.flatno = flatno;
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

    public String getFlatno() {
        return flatno;
    }

    public void setFlatno(String flatno) {
        this.flatno = flatno;
    }
}
