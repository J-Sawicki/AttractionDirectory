package com.company.AtrractionDirectory.attraction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("attractions")
public class AttractionResource {

    private AttractionRepository attractionRepository;

    public AttractionResource(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @GetMapping
    public Iterable<Attraction> attractions(){
        return attractionRepository.findAll();
    }
}
