package com.accessSystem.demand;

import com.accessSystem.login.LoginDTO;
import com.accessSystem.login.LoginMessage;
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
