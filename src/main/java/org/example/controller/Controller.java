package org.example.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class Controller {

    @PostMapping("/hello")
    public void sendMessage(@RequestParam("message") String message) {
        log.info("Received a request for greeting with name: {}", message);

        log.debug("Received a request for greeting with name: {}", message);

        log.error("Received a request for greeting with name: {}", message);

        log.trace("Received a request for greeting with name: {}", message);

        log.warn("Received a request for greeting with name: {}", message);
    }
}