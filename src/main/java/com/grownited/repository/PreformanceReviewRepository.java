package com.grownited.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grownited.entity.AppraisalEntity;
import com.grownited.entity.PreformanceReviewEntity;


public interface PreformanceReviewRepository extends JpaRepository <PreformanceReviewEntity, Integer>{

}
