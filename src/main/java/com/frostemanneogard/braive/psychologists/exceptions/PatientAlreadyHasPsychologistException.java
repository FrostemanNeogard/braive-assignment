package com.frostemanneogard.braive.psychologists.exceptions;

import com.frostemanneogard.braive.patients.Patient;

public class PatientAlreadyHasPsychologistException extends RuntimeException {

    public PatientAlreadyHasPsychologistException(Patient patient) {
        super(String.format(
                "Patient already has a psychologist assigned: \"%s\"", patient.getId()
        ));
    }

}
