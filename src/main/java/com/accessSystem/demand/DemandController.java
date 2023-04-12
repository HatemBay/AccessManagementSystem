package com.accessSystem.demand;

import com.accessSystem.demand.Demand;
import com.accessSystem.demand.DemandDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("demands")
public class DemandController {
    @Autowired
    DemandService demandService;

    @PostMapping("/new")
    public int newDemand(@RequestBody Demand demand) {
        return demandService.addDemand(demand);
    }

    @PutMapping("/{id}")
    public int updateDemand(@RequestBody Demand demand, @PathVariable int id) {
        return demandService.modifyDemand(demand, id);
    }

    @GetMapping("/{id}")
    public Demand getDemandById(@PathVariable int id) {
        return demandService.findDemand(id);
    }

    @GetMapping("/get-all")
    public List<Demand> getAllDemands() {
        return demandService.getAllDemands();
    }
    @GetMapping("/get-all/user/{userId}")
    public List<Demand> getAllDemandsByUserId(@PathVariable int userId) {
        return demandService.getAllDemandsByUserId(userId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDemand(@PathVariable int id) {
        demandService.deleteDemand(id);
    }
}
