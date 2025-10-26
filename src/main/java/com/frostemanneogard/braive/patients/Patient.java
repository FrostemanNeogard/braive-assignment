package com.frostemanneogard.braive.patients;

import com.frostemanneogard.braive.base.Person;
import com.frostemanneogard.braive.organizations.Organization;
import com.frostemanneogard.braive.psychologists.Psychologist;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "patients")
@Getter
public class Patient extends Person {

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "psychologist_id")
    private Psychologist psychologist;

}
