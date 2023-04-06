package com.choua9a.demand;

import com.choua9a.login.LoginDTO;
import com.choua9a.login.LoginMessage;
import com.choua9a.demand.Demand;
import com.choua9a.demand.DemandDTO;

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
