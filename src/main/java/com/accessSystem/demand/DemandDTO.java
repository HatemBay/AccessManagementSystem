package com.accessSystem.demand;

import com.accessSystem.user.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

public class DemandDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String concernedSite;
    String concernedLocal;
    String demandObject;
    String visitDayStart;
    String visitDayEnd;
    Date visitDateStart;
    Date visitDateEnd;
    String refusalReason;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;
    Date created_at;
    Date updated_at;

    public DemandDTO(int id, String concernedSite, String concernedLocal, String demandObject, String visitDayStart, String visitDayEnd, Date visitDateStart, Date visitDateEnd, String refusalReason, User user, Date created_at, Date updated_at) {
        this.id = id;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.refusalReason = refusalReason;
        this.user = user;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcernedSite() {
        return concernedSite;
    }

    public void setConcernedSite(String concernedSite) {
        this.concernedSite = concernedSite;
    }

    public String getConcernedLocal() {
        return concernedLocal;
    }

    public void setConcernedLocal(String concernedLocal) {
        this.concernedLocal = concernedLocal;
    }

    public String getDemandObject() {
        return demandObject;
    }

    public void setDemandObject(String demandObject) {
        this.demandObject = demandObject;
    }

    public String getVisitDayStart() {
        return visitDayStart;
    }

    public void setVisitDayStart(String visitDayStart) {
        this.visitDayStart = visitDayStart;
    }

    public String getVisitDayEnd() {
        return visitDayEnd;
    }

    public void setVisitDayEnd(String visitDayEnd) {
        this.visitDayEnd = visitDayEnd;
    }

    public Date getVisitDateStart() {
        return visitDateStart;
    }

    public void setVisitDateStart(Date visitDateStart) {
        this.visitDateStart = visitDateStart;
    }

    public Date getVisitDateEnd() {
        return visitDateEnd;
    }

    public void setVisitDateEnd(Date visitDateEnd) {
        this.visitDateEnd = visitDateEnd;
    }

    public String getRefusalReason() {
        return refusalReason;
    }

    public void setRefusalReason(String refusalReason) {
        this.refusalReason = refusalReason;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}
