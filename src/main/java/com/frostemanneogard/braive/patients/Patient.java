package com.frostemanneogard.braive.patients;

import com.frostemanneogard.braive.base.Person;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "patients")
@Getter
public class Patient extends Person {

    @Column
    private UUID organizationId;

}
