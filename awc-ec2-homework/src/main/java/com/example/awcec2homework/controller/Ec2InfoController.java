package com.example.awcec2homework.controller;

import com.example.awcec2homework.model.InstanceInfo;
import com.example.awcec2homework.service.Ec2InstanceInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Ec2InfoController {

    private final Ec2InstanceInfoService service;

    public Ec2InfoController(Ec2InstanceInfoService service) {
        this.service = service;
    }

    @GetMapping("/info")
    public InstanceInfo getInfo() {
        return service.getEc2InstanceInfo();
    }
}
