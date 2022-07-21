package com.banjaravivahapis.banjaravivahspringapis.controller;

import com.banjaravivahapis.banjaravivahspringapis.entity.Product;
import com.banjaravivahapis.banjaravivahspringapis.entity.StateEntity;
import com.banjaravivahapis.banjaravivahspringapis.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StateController {
    @Autowired
    private StateService stateService;

    @PostMapping("/addState")
    public StateEntity addState(@RequestBody StateEntity state){
        return stateService.saveState(state);
    }
    @PostMapping("/addStates")
    public List<StateEntity> addStates(@RequestBody List<StateEntity> stateEntities){
        return  stateService.saveStates(stateEntities);
    }
    @GetMapping("/allStates")
    public List<StateEntity> findAllStates(){
        return stateService.getAllStates();
    }
    @GetMapping("/stateBy/{id}")
    public StateEntity findById(@PathVariable int id){
        return stateService.getStatesById(id);
    }
    @GetMapping("/getDistrict/{state_id}")
    public String getDistrict(@PathVariable int state_id){
        return  stateService.getdistrict(state_id);
    }
}
