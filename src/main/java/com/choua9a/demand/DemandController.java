package com.choua9a.demand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemandController {
    @Autowired
    DemandService demandService;
}
