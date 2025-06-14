package com.example.demo_jpa.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.example.demo_jpa.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
    Optional<Country> findByName(String name);
}
