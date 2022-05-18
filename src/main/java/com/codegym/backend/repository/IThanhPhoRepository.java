package com.codegym.backend.repository;

import com.codegym.backend.model.ThanhPho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IThanhPhoRepository extends JpaRepository<ThanhPho, Long> {
}
