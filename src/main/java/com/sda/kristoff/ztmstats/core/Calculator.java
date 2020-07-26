package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.model.Vehicle;

import java.util.List;
import java.util.Map;

public class Calculator {

    public Double avgSpeed(List<Vehicle> vehicles) {
        return vehicles.stream()
                .mapToInt(Vehicle::getSpeed)
                .average()
                .orElse(0);
    }

    public Map<String, Integer> avgSpeedByAllLines(List<Vehicle> vehicles) {

    }

    public Integer avgSpeedForGivenLine(List<Vehicle> vehicles) {

    }

}
