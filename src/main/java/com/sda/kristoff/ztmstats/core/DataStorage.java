package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.model.Vehicle;
import com.sda.kristoff.ztmstats.model.VehicleDTO;
import com.sda.kristoff.ztmstats.model.ZtmData;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class DataStorage {

    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm:ss");

    private LocalDateTime updateTime;
    private List<Vehicle> vehicles;

    public void update(ZtmData ztmData) {
        updateTime = LocalDateTime.parse(ztmData.getUpdateTime(), DATE_TIME_FORMAT);
        vehicles = ztmData.getVehicleDTOS().stream()
                .map(DataStorage::mapVehicle)
                .collect(Collectors.toList());
        System.out.println("Updated storage at " + LocalTime.now());
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    private static Vehicle mapVehicle(VehicleDTO vehicleDTO) {
        return new Vehicle(vehicleDTO.getLine(), vehicleDTO.getSpeed(), vehicleDTO.getDelay());
    }
}
