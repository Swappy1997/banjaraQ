package com.banjaravivahapis.banjaravivahspringapis.service;

import com.banjaravivahapis.banjaravivahspringapis.entity.StateEntity;
import com.banjaravivahapis.banjaravivahspringapis.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public StateEntity saveState(StateEntity state){
        return   stateRepository.save(state);

    }
    public List<StateEntity> saveStates(List<StateEntity> stateEntities){
        return   stateRepository.saveAll(stateEntities);

    }
    public List<StateEntity> getAllStates(){
        return   stateRepository.findAll();

    }
    public StateEntity getStatesById(int id){
        return   stateRepository.findById(id).orElse(null);

    }
    public String getdistrict(int state_id){
        return   stateRepository.getDistrict(state_id);
    }
}
