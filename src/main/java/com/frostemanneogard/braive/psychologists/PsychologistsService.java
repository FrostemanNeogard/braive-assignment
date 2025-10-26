package com.frostemanneogard.braive.psychologists;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PsychologistsService {

    private final PsychologistsRepository psychologistsRepository;

    public List<Psychologist> getAllPsychologists() {
        return this.psychologistsRepository.findAll();
    }

    public List<Psychologist> getPsychologistsOrderedByWorkload() {
        return this.psychologistsRepository.findWorkloadOrderedAscending();
    }

}
