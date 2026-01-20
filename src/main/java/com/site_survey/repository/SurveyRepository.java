package com.site_survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.site_survey.entity.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {
}

