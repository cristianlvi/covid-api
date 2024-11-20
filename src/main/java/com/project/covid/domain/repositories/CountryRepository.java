package com.project.covid.domain.repositories;

import com.project.covid.domain.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountriesEntity, Long> {
}
