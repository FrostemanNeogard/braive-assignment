package com.frostemanneogard.braive.psychologists.dtos;

import com.frostemanneogard.braive.base.BaseEntity;
import com.frostemanneogard.braive.organizations.dtos.OrganizationDto;
import com.frostemanneogard.braive.patients.dtos.PatientDto;
import com.frostemanneogard.braive.psychologists.Psychologist;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record PsychologistDto(
        UUID id,
        String name,
        String nationalIdNum,
        LocalDate dateOfBirth,
        OrganizationDto organization,
        List<UUID> patientIds) {

    public static PsychologistDto fromEntity(Psychologist psychologist) {
        if (psychologist == null) {
            return null;
        }

        return new PsychologistDto(
                psychologist.getId(),
                psychologist.getName(),
                psychologist.getNationalIdNum(),
                psychologist.getDateOfBirth(),
                OrganizationDto.fromEntity(psychologist.getOrganization()),
                psychologist.getPatients().stream().map((BaseEntity::getId)).toList()
        );
    }

}
