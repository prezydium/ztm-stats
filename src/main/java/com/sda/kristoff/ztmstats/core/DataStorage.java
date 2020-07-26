package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.model.Vehicle;
import com.sda.kristoff.ztmstats.model.ZtmData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DataStorage {

    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm:ss");

    private LocalDateTime updateTime;
    private List<Vehicle> vehicles;

    public void update(ZtmData ztmData) {
        updateTime = LocalDateTime.parse(ztmData.getUpdateTime(), DATE_TIME_FORMAT);
        vehicles = ztmData.getVehicles();
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
