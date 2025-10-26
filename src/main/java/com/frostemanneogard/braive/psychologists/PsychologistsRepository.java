package com.frostemanneogard.braive.psychologists;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.UUID;

public interface PsychologistsRepository extends ListCrudRepository<Psychologist, UUID> {

    @Query("""
        SELECT p
        FROM Psychologist p
        LEFT JOIN p.patients pat
        GROUP BY p.id
        ORDER BY COUNT(pat) ASC
    """)
    List<Psychologist> findWorkloadOrderedAscending();

}
