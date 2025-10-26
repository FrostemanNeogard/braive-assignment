package com.frostemanneogard.braive.psychologists;

import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface PsychologistsRepository extends ListCrudRepository<Psychologist, UUID> {
}
