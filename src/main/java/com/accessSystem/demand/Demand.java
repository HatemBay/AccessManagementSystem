package com.accessSystem.demand;

import com.accessSystem.user.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Demand {
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
    String visitDayStart;
    String visitDayEnd;
    Date visitDateStart;
    Date visitDateEnd;
    String refusalReason;
    String notes;
    Date created_at;
    Date updated_at;

    public Demand() {
    }

    public Demand(User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, String visitDayStart, String visitDayEnd, Date visitDateStart, Date visitDateEnd, String refusalReason, String notes, Date created_at, Date updated_at) {
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

    public Demand(int id, User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, String visitDayStart, String visitDayEnd, Date visitDateStart, Date visitDateEnd, String refusalReason, String notes, Date created_at, Date updated_at) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demand demand = (Demand) o;
        return id == demand.id && Objects.equals(user, demand.user) && Objects.equals(concernedSite, demand.concernedSite) && Objects.equals(concernedLocal, demand.concernedLocal) && Objects.equals(demandObject, demand.demandObject) && equipmentAdd == demand.equipmentAdd && equipmentRecovery == demand.equipmentRecovery && Objects.equals(visitDayStart, demand.visitDayStart) && Objects.equals(visitDayEnd, demand.visitDayEnd) && Objects.equals(visitDateStart, demand.visitDateStart) && Objects.equals(visitDateEnd, demand.visitDateEnd) && Objects.equals(refusalReason, demand.refusalReason) && Objects.equals(notes, demand.notes) && Objects.equals(created_at, demand.created_at) && Objects.equals(updated_at, demand.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, concernedSite, concernedLocal, demandObject, equipmentAdd, equipmentRecovery, visitDayStart, visitDayEnd, visitDateStart, visitDateEnd, refusalReason, notes, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Demand{" +
                "id=" + id +
                ", user=" + user +
                ", concernedSite='" + concernedSite + '\'' +
                ", concernedLocal='" + concernedLocal + '\'' +
                ", demandObject='" + demandObject + '\'' +
                ", equipmentAdd=" + equipmentAdd +
                ", equipmentRecovery=" + equipmentRecovery +
                ", visitDayStart='" + visitDayStart + '\'' +
                ", visitDayEnd='" + visitDayEnd + '\'' +
                ", visitDateStart=" + visitDateStart +
                ", visitDateEnd=" + visitDateEnd +
                ", refusalReason='" + refusalReason + '\'' +
                ", notes='" + notes + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
