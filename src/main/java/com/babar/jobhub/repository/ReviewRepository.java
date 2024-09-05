package com.babar.jobhub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.babar.jobhub.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByCompanyId(Long companyId);

}
