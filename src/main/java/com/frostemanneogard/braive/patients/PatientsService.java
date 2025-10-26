package com.frostemanneogard.braive.patients;

import com.frostemanneogard.braive.patients.exceptions.PatientNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PatientsService {

    private final PatientsRepository patientsRepository;

    public List<Patient> getAllPatients() {
        return this.patientsRepository.findAll();
    }

    public Patient getPatientById(UUID patientId) {
        return this.patientsRepository.findById(patientId).orElseThrow(
                () -> new PatientNotFoundException(patientId)
        );
    }

}
