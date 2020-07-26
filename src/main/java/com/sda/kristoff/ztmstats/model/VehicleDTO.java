package com.sda.kristoff.ztmstats.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleDTO {

    @JsonProperty("Line")
    private String line;

    @JsonProperty("Speed")
    private Integer speed;

    @JsonProperty("Delay")
    private Integer delay;

    public String getLine() {
        return line;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getDelay() {
        return delay;
    }


}
