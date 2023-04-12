package com.accessSystem.demand;

import com.accessSystem.login.LoginDTO;
import com.accessSystem.login.LoginMessage;
import com.accessSystem.demand.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemandServiceImpl implements DemandService{
    @Autowired
    DemandRepository demandRepository;

    @Override
    public int addDemand(Demand demand) {
        return demandRepository.save(demand).getId();
    }

    @Override
    public int modifyDemand(Demand demand, int id) {
        demand.setId(id);
        return demandRepository.save(demand).getId();
    }

    @Override
    public Demand findDemand(int id) {
        return demandRepository.findById(id).orElse(null);
    }

    @Override
    public List<Demand> getAllDemands() {
        return demandRepository.findAll();
    }
    public List<Demand> getAllDemandsByUserId(int userId) {
        return demandRepository.findByUser_Id(userId);
    }

    @Override
    public void deleteDemand(int id) {
        demandRepository.deleteById(id);
    }

}
