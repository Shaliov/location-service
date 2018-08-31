package godel.kubernetes.example.controller;

import godel.kubernetes.example.enums.PingStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andrey
 */
@RestController
public class MainController {

    @GetMapping("/ping")
    public String ping() {
        return PingStatus.OK.getCode();
    }
}
