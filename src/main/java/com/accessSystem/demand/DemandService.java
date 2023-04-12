package com.accessSystem.demand;

import com.accessSystem.login.LoginDTO;
import com.accessSystem.login.LoginMessage;

import java.util.List;

public interface DemandService {
    public int addDemand(Demand demand);
    public int modifyDemand(Demand demand, int id);
    public Demand findDemand(int id);
    public List<Demand> getAllDemands();
    public List<Demand> getAllDemandsByUserId(int userId);
    public void deleteDemand(int id);
}
