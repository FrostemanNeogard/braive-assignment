package com.frostemanneogard.braive.patients.exceptions;

import java.util.UUID;

public class PatientNotFoundException extends RuntimeException {

    public PatientNotFoundException(UUID id) {
        super(String.format("Patient not found: \"%s\"", id));
    }

}
