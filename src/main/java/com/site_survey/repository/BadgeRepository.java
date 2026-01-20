package com.site_survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.site_survey.entity.Badge;

public interface BadgeRepository extends JpaRepository<Badge, Integer> {
    Badge findByName(String name);
}
