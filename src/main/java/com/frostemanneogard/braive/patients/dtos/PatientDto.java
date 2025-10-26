package com.frostemanneogard.braive.patients.dtos;

import com.frostemanneogard.braive.patients.Patient;

import java.time.LocalDate;
import java.util.UUID;

public record PatientDto(UUID id, String name, String nationalIdNum, LocalDate dateOfBirth) {

    public static PatientDto fromEntity(Patient entity) {
        return new PatientDto(
                entity.getId(),
                entity.getName(),
                entity.getNationalIdNum(),
                entity.getDateOfBirth()
        );
    }

}
