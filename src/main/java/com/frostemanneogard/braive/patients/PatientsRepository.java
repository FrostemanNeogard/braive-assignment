package com.frostemanneogard.braive.patients;

import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface PatientsRepository extends ListCrudRepository<Patient, UUID> {
}
