package com.example.smartcity.repository;

import com.example.smartcity.model.Cutremur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CutremurRepository extends JpaRepository<Cutremur, Long> {
    @Query(value =
            "SELECT * FROM cutremur ORDER BY an_cutremur DESC, luna_cutremur DESC, ziua_cutremur DESC, ora DESC, minut DESC LIMIT 1",
            nativeQuery = true)
    Cutremur findFirstByOrderByDataDesc();
}
