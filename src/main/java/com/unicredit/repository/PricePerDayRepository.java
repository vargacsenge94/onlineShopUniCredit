package com.unicredit.repository;

import com.unicredit.model.entity.PricePerDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePerDayRepository extends JpaRepository<PricePerDay, Long> {
}
