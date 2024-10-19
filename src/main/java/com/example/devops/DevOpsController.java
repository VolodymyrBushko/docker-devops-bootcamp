package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DevOpsController {

    private static final String DEVOPS = "DEVOPS";
    private static final String DEVOPS_VARIABLE_IS_EMPTY_MESSAGE = "The 'DEVOPS' variable is empty!";

    @GetMapping("/devops")
    public String getDevOpsVariable() {
        return Optional.ofNullable(System.getenv(DEVOPS)).orElse(DEVOPS_VARIABLE_IS_EMPTY_MESSAGE);
    }
}
