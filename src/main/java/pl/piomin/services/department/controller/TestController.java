package pl.piomin.services.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by truongnguyen on 10/8/18.
 */
@RestController
@RequestMapping("say")
public class TestController {

    @GetMapping("/{name}")
    public String sayMyName(@PathVariable("name") String name) {
        return "Ahoy " + name;
    }
}
