package com.frostemanneogard.braive.psychologists.dtos;

import com.frostemanneogard.braive.organizations.dtos.OrganizationDto;
import com.frostemanneogard.braive.psychologists.Psychologist;

import java.time.LocalDate;
import java.util.UUID;

public record PsychologistDto(
        UUID id,
        String name,
        String nationalIdNum,
        LocalDate dateOfBirth,
        OrganizationDto organization) {

    public static PsychologistDto fromEntity(Psychologist psychologist) {
        return new PsychologistDto(
                psychologist.getId(),
                psychologist.getName(),
                psychologist.getNationalIdNum(),
                psychologist.getDateOfBirth(),
                OrganizationDto.fromEntity(psychologist.getOrganization())
        );
    }

}
