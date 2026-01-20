package com.site_survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.site_survey.entity.CarbonLog;

import java.time.LocalDate;
import java.util.List;

public interface CarbonLogRepository extends JpaRepository<CarbonLog, Integer> {

    // ✅ History (user-wise)
    List<CarbonLog> findByUsernameOrderByDateDesc(String username);

    // ✅ Weekly
    @Query("""
        SELECT COALESCE(SUM(c.totalEmission), 0)
        FROM CarbonLog c
        WHERE c.username = :username
        AND c.date >= :fromDate
    """)
    Integer getWeeklyEmissionByUsername(
            @Param("username") String username,
            @Param("fromDate") LocalDate fromDate
    );

    // ✅ Monthly
    @Query("""
        SELECT COALESCE(SUM(c.totalEmission), 0)
        FROM CarbonLog c
        WHERE c.username = :username
        AND c.date >= :fromDate
    """)
    Integer getMonthlyEmissionByUsername(
            @Param("username") String username,
            @Param("fromDate") LocalDate fromDate
    );

    // ✅ LEADERBOARD (TOTAL EMISSION – ALL USERS)
    @Query("SELECT COALESCE(SUM(c.totalEmission), 0) FROM CarbonLog c")
    Double totalEmission();
    
    @Query("""
    	    SELECT c.username, SUM(c.totalEmission)
    	    FROM CarbonLog c
    	    GROUP BY c.username
    	    ORDER BY SUM(c.totalEmission)
    	""")
    	List<Object[]> leaderboardByUser();

}
