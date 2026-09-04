package com.example.helloworld.controller;

import com.example.helloworld.model.Greeting;
import com.example.helloworld.repository.GreetingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    private final GreetingRepository repository;

    public GreetingController(GreetingRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Greeting> all(){
        return repository.findAll();
    }

    @PostMapping
    public Greeting add(@RequestBody Greeting greeting){
        return repository.save(greeting);
    }
}
