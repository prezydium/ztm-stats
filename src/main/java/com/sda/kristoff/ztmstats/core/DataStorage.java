package com.sda.kristoff.ztmstats.core;

import com.sda.kristoff.ztmstats.model.Vehicle;
import com.sda.kristoff.ztmstats.model.ZtmData;

import java.time.LocalDateTime;
import java.util.List;

public class DataStorage {

    private LocalDateTime updateTime;
    private List<Vehicle> vehicles;

    public void update(ZtmData ztmData) {
        updateTime = LocalDateTime.parse(ztmData.getUpdateTime());
        vehicles = ztmData.getVehicles();
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
