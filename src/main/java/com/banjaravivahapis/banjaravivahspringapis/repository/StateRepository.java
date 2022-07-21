package com.banjaravivahapis.banjaravivahspringapis.repository;

import com.banjaravivahapis.banjaravivahspringapis.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StateRepository extends JpaRepository<StateEntity,Integer> {
@Query(value ="select district_name  from states_tb where state_id=:state_id",nativeQuery = true)
String getDistrict(@Param("state_id") int state_id);
}
