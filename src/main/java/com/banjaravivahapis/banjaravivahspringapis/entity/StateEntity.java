package com.banjaravivahapis.banjaravivahspringapis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "states_tb")
public class StateEntity {
    @Id
    @GeneratedValue()
    int state_id;
    String state_name;
    String district_name;
}
