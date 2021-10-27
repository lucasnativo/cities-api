package com.sampaio.citiesapi.states.repositories;

import com.sampaio.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
