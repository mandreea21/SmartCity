package com.example.smartcity.repository;

import com.example.smartcity.model.Cutremur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CutremurRepository extends JpaRepository<Cutremur, Long> {
    @Query(value =
            "SELECT * FROM cutremur ORDER BY an_cutremur ASC, luna_cutremur ASC, ziua_cutremur ASC, ora ASC, minut ASC LIMIT 1",
            nativeQuery = true)
    Cutremur findFirstByOrderByDataDesc();
}
