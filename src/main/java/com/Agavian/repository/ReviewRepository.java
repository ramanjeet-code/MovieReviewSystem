package com.Agavian.repository;

import com.Agavian.Entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Reviews,Integer> {
}
