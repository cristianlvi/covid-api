package com.project.covid.domain.repositories;

import com.project.covid.domain.DeathsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeathsRepository extends JpaRepository<DeathsEntity, Long> {
}
