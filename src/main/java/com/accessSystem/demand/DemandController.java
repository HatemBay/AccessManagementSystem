package com.accessSystem.demand;

import com.accessSystem.demand.Demand;
import com.accessSystem.demand.DemandDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemandController {
    @Autowired
    DemandService demandService;

    @PostMapping("/new")
    public int newDemand(@RequestBody DemandDTO demandDTO) {
        return demandService.addDemand(demandDTO);
    }

    @PutMapping("/{id}")
    public int updateDemand(@RequestBody DemandDTO demandDTO, @PathVariable int id) {
        return demandService.modifyDemand(demandDTO, id);
    }

    @GetMapping("/{id}")
    public Demand getDemandById(@PathVariable int id) {
        return demandService.findDemand(id);
    }

    @GetMapping("/get-all")
    public List<Demand> getAllDemands() {
        return demandService.getAllDemands();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDemand(@PathVariable int id) {
        demandService.deleteDemand(id);
    }
}
