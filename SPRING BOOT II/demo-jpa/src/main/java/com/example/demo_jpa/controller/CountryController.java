package com.example.demo_jpa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_jpa.model.Country;
import com.example.demo_jpa.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable Long id) {
        
        return countryService.getCountryById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }



    @GetMapping("/name/{name}")
    public ResponseEntity<Country> getCountryByName(@PathVariable String name) {
        return countryService.getCountryByName(name).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Country> createCountry(@RequestBody Country country) {
        Country createdCountry = countryService.createCountry(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCountry);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable Long id) {
        countryService.deleteCountry(id);
        return ResponseEntity.noContent().build();
    }

}
