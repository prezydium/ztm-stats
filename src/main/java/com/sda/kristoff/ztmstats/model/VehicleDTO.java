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

    public void setLine(String line) {
        this.line = line;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "line='" + line + '\'' +
                ", speed=" + speed +
                ", delay=" + delay +
                '}';
    }
}
