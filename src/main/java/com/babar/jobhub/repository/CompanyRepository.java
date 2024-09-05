package com.babar.jobhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.babar.jobhub.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
