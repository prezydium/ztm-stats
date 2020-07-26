package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.model.Vehicle;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Calculator {

    public static Double avgSpeed(List<Vehicle> vehicles) {
        return vehicles.stream()
                .mapToInt(Vehicle::getSpeed)
                .average()
                .orElse(0);
    }

    public static Map<String, Double> avgSpeedByAllLines(List<Vehicle> vehicles) {
        return vehicles.stream()
                .collect(
                        groupingBy(Vehicle::getLine, averagingInt(Vehicle::getSpeed)));

    }

    public static Double avgSpeedForGivenLine(String line, List<Vehicle> vehicles) {
        List<Vehicle> oneLineVehicles = vehicles.stream()
                .filter(vehicle -> vehicle.getLine().equals(line))
                .collect(toList());
        return avgSpeed(oneLineVehicles);
    }

}
