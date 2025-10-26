package com.frostemanneogard.braive.patients;

import com.frostemanneogard.braive.base.Person;
import com.frostemanneogard.braive.organizations.Organization;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "patients")
@Getter
public class Patient extends Person {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

}
