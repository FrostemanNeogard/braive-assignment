package com.frostemanneogard.braive.organizations;

import com.frostemanneogard.braive.base.BaseEntity;
import com.frostemanneogard.braive.patients.Patient;
import com.frostemanneogard.braive.psychologists.Psychologist;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.Set;

@Entity
@Table(name = "organizations")
@Getter
public class Organization extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "organization")
    private Set<Patient> patients;

    @OneToMany(mappedBy = "organization")
    private Set<Psychologist> psychologists;

}
