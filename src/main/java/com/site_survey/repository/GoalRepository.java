package com.site_survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.site_survey.entity.Goal;

public interface GoalRepository extends JpaRepository<Goal, Integer> {
    Goal findByUsernameAndType(String username, String type);
}
