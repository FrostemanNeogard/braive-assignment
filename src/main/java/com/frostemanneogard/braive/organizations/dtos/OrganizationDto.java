package com.frostemanneogard.braive.organizations.dtos;

import com.frostemanneogard.braive.organizations.Organization;

import java.util.UUID;

public record OrganizationDto(UUID id, String name) {

    public static OrganizationDto fromEntity(Organization org) {
        return new OrganizationDto(org.getId(), org.getName());
    }

}
