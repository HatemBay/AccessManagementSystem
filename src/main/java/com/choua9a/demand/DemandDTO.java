package com.choua9a.demand;

import com.choua9a.user.User;
import jakarta.persistence.*;

import java.util.Date;

public class DemandDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String concernedSite;
    String concernedLocal;
    String demandObject;
    int visitDayStart;
    int visitDayEnd;
    Date visitDateStart;
    Date visitDateEnd;
    String refusalReason;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user;
    Date created_at;
    Date updated_at;
}
