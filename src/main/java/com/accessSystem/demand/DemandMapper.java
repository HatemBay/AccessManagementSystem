package com.accessSystem.demand;

import com.accessSystem.user.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemandMapper {
    public DemandDTO toDto(Demand demand) {
        User user = demand.getUser();
        String concernedSite = demand.getConcernedSite();
        String concernedLocal = demand.getConcernedLocal();
        String demandObject = demand.getDemandObject();
        Choice equipementAdd = demand.getEquipmentAdd();
        Choice equipementRecovery = demand.getEquipmentRecovery();
        Date visitDayStart = demand.getVisitDayStart();
        Date visitDayEnd = demand.getVisitDayEnd();
//        String demandObject = demand.getDemandObject();


        return new DemandDTO();
    }

    public Demand toDemand(DemandDTO demandDTO) {
        return new Demand();
    }
}
