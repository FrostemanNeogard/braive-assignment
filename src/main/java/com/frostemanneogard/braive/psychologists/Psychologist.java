package com.frostemanneogard.braive.psychologists;

import com.frostemanneogard.braive.base.Person;
import com.frostemanneogard.braive.organizations.Organization;
import com.frostemanneogard.braive.patients.Patient;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
@Table(name = "psychologists")
@Getter
public class Psychologist extends Person {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "psychologist")
    private Set<Patient> patients;

}
