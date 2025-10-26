package com.frostemanneogard.braive.patients.dtos;

import com.frostemanneogard.braive.organizations.dtos.OrganizationDto;
import com.frostemanneogard.braive.patients.Patient;
import com.frostemanneogard.braive.psychologists.dtos.PsychologistDto;

import java.time.LocalDate;
import java.util.UUID;

public record PatientDto(
        UUID id,
        String name,
        String nationalIdNum,
        LocalDate dateOfBirth,
        OrganizationDto organization,
        PsychologistDto psychologist) {

    public static PatientDto fromEntity(Patient entity) {
        return new PatientDto(
                entity.getId(),
                entity.getName(),
                entity.getNationalIdNum(),
                entity.getDateOfBirth(),
                OrganizationDto.fromEntity(entity.getOrganization()),
                PsychologistDto.fromEntity(entity.getPsychologist())
        );
    }

}
