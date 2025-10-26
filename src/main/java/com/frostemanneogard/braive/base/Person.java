package com.frostemanneogard.braive.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.time.LocalDate;

@MappedSuperclass
@Getter
public abstract class Person extends BaseEntity {

    @Column(nullable = false)
    protected String name;

    @Column(unique = true, nullable = false)
    protected String nationalIdNum;

    @Column(nullable = false)
    protected LocalDate dateOfBirth;

}
