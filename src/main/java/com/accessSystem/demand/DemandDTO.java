package com.accessSystem.demand;

import com.accessSystem.user.User;
import jakarta.persistence.*;

import java.util.Date;

public class DemandDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;
    String concernedSite;
    String concernedLocal;
    String demandObject;
    Choice equipmentAdd;
    Choice equipmentRecovery;
    Date visitDayStart;
    Date visitDayEnd;
    String visitDateStart;
    String visitDateEnd;
    String refusalReason;
    String notes;
    Date created_at;
    Date updated_at;

    public DemandDTO(int id, User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, String refusalReason, String notes, Date created_at, Date updated_at) {
        this.id = id;
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.refusalReason = refusalReason;
        this.notes = notes;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public DemandDTO(int id, User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, String refusalReason, String notes) {
        this.id = id;
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.refusalReason = refusalReason;
        this.notes = notes;
    }

    public DemandDTO(User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, String refusalReason, String notes) {
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.refusalReason = refusalReason;
        this.notes = notes;
    }

    public DemandDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Choice getEquipmentAdd() {
        return equipmentAdd;
    }

    public void setEquipmentAdd(Choice equipmentAdd) {
        this.equipmentAdd = equipmentAdd;
    }

    public Choice getEquipmentRecovery() {
        return equipmentRecovery;
    }

    public void setEquipmentRecovery(Choice equipmentRecovery) {
        this.equipmentRecovery = equipmentRecovery;
    }

    public Date getVisitDayStart() {
        return visitDayStart;
    }

    public void setVisitDayStart(Date visitDayStart) {
        this.visitDayStart = visitDayStart;
    }

    public Date getVisitDayEnd() {
        return visitDayEnd;
    }

    public void setVisitDayEnd(Date visitDayEnd) {
        this.visitDayEnd = visitDayEnd;
    }

    public String getVisitDateStart() {
        return visitDateStart;
    }

    public void setVisitDateStart(String visitDateStart) {
        this.visitDateStart = visitDateStart;
    }

    public String getVisitDateEnd() {
        return visitDateEnd;
    }

    public void setVisitDateEnd(String visitDateEnd) {
        this.visitDateEnd = visitDateEnd;
    }

    public String getRefusalReason() {
        return refusalReason;
    }

    public void setRefusalReason(String refusalReason) {
        this.refusalReason = refusalReason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
