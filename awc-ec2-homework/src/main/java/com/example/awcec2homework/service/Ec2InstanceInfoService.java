package com.example.awcec2homework.service;

import com.amazonaws.util.EC2MetadataUtils;
import com.example.awcec2homework.model.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Ec2InstanceInfoService {
    private final Logger logger = LoggerFactory.getLogger(Ec2InstanceInfoService.class);

    public InstanceInfo getEc2InstanceInfo() {
        try {
            String region = EC2MetadataUtils.getEC2InstanceRegion();
            String availabilityZone = EC2MetadataUtils.getAvailabilityZone();
            return new InstanceInfo(region, availabilityZone);
        } catch (Exception e) {
            logger.error("Error when getting EC2 instance info", e);
            return new InstanceInfo(null, null);
        }
    }
}
