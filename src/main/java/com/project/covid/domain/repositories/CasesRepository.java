package com.project.covid.domain.repositories;

import com.project.covid.domain.CasesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasesRepository extends JpaRepository<CasesEntity, Long> {
}
