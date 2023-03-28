package com.example.awcec2homework.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class InstanceInfo {
    private String region;
    private String availabilityZone;
    @JsonFormat(pattern = "MM-dd-yy hh:mm:ss")
    private LocalDateTime time;

    public InstanceInfo(String region, String availabilityZone) {
        this.region = region;
        this.availabilityZone = availabilityZone;
        time = LocalDateTime.now();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
