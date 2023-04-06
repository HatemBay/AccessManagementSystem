package com.choua9a.demand;

import com.choua9a.login.LoginDTO;
import com.choua9a.login.LoginMessage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandServiceImpl implements DemandService{
    @Override
    public int addDemand(DemandDTO demandDTO) {
        return 0;
    }

    @Override
    public int modifyDemand(DemandDTO demandDTO, int id) {
        return 0;
    }

    @Override
    public Demand findDemand(int id) {
        return null;
    }

    @Override
    public Demand findDemandByEmail(String email) {
        return null;
    }

    @Override
    public List<Demand> getAllDemands() {
        return null;
    }

    @Override
    public void deleteDemand(int id) {

    }

    @Override
    public LoginMessage loginDemand(LoginDTO loginDTO) {
        return null;
    }
}
