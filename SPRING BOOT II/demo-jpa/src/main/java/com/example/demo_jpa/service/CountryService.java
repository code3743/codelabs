package com.example.demo_jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo_jpa.model.Country;
import com.example.demo_jpa.repository.CountryRepository;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

   
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }


    public Optional<Country> getCountryById(Long id) {
        return countryRepository.findById(id);
    }

    public Optional<Country> getCountryByName(String name) {
        return countryRepository.findByName(name);
    }

    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
