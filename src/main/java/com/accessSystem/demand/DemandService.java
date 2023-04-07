package com.accessSystem.demand;

import com.accessSystem.login.LoginDTO;
import com.accessSystem.login.LoginMessage;

import java.util.List;

public interface DemandService {
    public int addDemand(DemandDTO demandDTO);
    public int modifyDemand(DemandDTO demandDTO, int id);
    public Demand findDemand(int id);
    public Demand findDemandByEmail(String email);
    public List<Demand> getAllDemands();
    public void deleteDemand(int id);
    public LoginMessage loginDemand(LoginDTO loginDTO);
}
