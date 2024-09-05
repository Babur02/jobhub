package com.babar.jobhub.service;

import java.util.List;

import com.babar.jobhub.entity.Review;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);

    Review getReview(Long companyId, Long reviewId);

    boolean updateReview(Long companyId, Long reviewId,Review review);

    boolean deleteReviewById(Long companyId, Long reviewId);
}
