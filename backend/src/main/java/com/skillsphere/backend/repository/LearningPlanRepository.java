package com.skillsphere.backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillsphere.backend.model.LearningPlan;
import com.skillsphere.backend.model.User;


@Repository
public interface LearningPlanRepository extends JpaRepository<LearningPlan, Long> {
    List<LearningPlan> findByUser(User user);
    List<LearningPlan> findByStatus(String status); // Fetch plan by status 
}