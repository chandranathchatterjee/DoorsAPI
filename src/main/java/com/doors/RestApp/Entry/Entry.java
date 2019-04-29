package com.doors.RestApp.Entry;

import com.doors.RestApp.Resident.Resident;
import com.doors.RestApp.Visitor.Visitor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Entry {

   @Id
    private String uid;
   @ManyToOne
    private Visitor visitor;
    private LocalDateTime checkin;
    private String checkout;
    @ManyToOne
    private Resident resident;

    public Entry()
    {}

    public Entry(String uid, String v_id, LocalDateTime checkin, String checkout, String res_id) {
        this.uid = uid;
        this.visitor = new Visitor(v_id,"","","");
        this.checkin = checkin;
        this.checkout = checkout;
        this.resident = new Resident(res_id,"","");
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }


}
