package com.sda.kristoff.ztmstats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZtmData {

    @JsonProperty("LastUpdateData")
    private String updateTime;

    @JsonProperty("Vehicles")
    private List<Vehicle> vehicles;

    public String getUpdateTime() {
        return updateTime;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
