package com.frostemanneogard.braive.psychologists;

import com.frostemanneogard.braive.base.Person;
import com.frostemanneogard.braive.organizations.Organization;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "psychologists")
@Getter
public class Psychologist extends Person {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

}
