package com.sda.kristoff.ztmstats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZtmData {

    @JsonProperty("LastUpdateData")
    private String updateTime;

    @JsonProperty("Vehicles")
    private List<VehicleDTO> vehicleDTOS;

    public String getUpdateTime() {
        return updateTime;
    }

    public List<VehicleDTO> getVehicleDTOS() {
        return vehicleDTOS;
    }

}
