package com.mine.cloud.dockerspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dockerspring")
public class DockerSpringController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greetings() {
        return "Hello Docker Spring";
    }
}
