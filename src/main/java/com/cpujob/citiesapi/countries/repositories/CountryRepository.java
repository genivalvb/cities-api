package com.cpujob.citiesapi.countries.repositories;

import com.cpujob.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
