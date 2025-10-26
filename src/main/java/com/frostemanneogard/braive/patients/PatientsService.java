package com.frostemanneogard.braive.patients;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PatientsService {

    private final PatientsRepository patientsRepository;

    public PatientsService(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    public List<Patient> getAllPatients() {
        return this.patientsRepository.findAll();
    }

}
