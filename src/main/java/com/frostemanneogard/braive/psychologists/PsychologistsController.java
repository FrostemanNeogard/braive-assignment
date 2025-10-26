package com.frostemanneogard.braive.psychologists;

import com.frostemanneogard.braive.advice.responses.ApiResponse;
import com.frostemanneogard.braive.advice.responses.ApiResponseEntity;
import com.frostemanneogard.braive.base.BaseApiController;
import com.frostemanneogard.braive.patients.Patient;
import com.frostemanneogard.braive.patients.PatientsService;
import com.frostemanneogard.braive.psychologists.dtos.PsychologistDto;
import com.frostemanneogard.braive.psychologists.exceptions.PatientAlreadyHasPsychologistException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(PsychologistsController.REQUEST_MAPPING)
@RequiredArgsConstructor
public class PsychologistsController extends BaseApiController {

    public static final String REQUEST_MAPPING = "psychologists";

    private final PsychologistsService psychologistsService;
    private final PatientsService patientsService;

    @Override
    public String getRequestMapping() {
        return REQUEST_MAPPING;
    }

    @GetMapping
    private ResponseEntity<ApiResponse<List<PsychologistDto>>> getAllPsychologists() {
        List<Psychologist> psychologists = this.psychologistsService.getAllPsychologists();

        return ApiResponseEntity.ok(psychologists.stream().map(PsychologistDto::fromEntity).toList());
    }

    @GetMapping("recommend/{patientId}")
    private ResponseEntity<ApiResponse<PsychologistDto>> getPsychologistRecommendation(
            @PathVariable UUID patientId) {
        Patient patient = this.patientsService.getPatientById(patientId);

        if (patient.getPsychologist() != null) {
            throw new PatientAlreadyHasPsychologistException(patient);
        }

        List<Psychologist> psychologists = this.psychologistsService.getPsychologistsOrderedByWorkload();

        return ApiResponseEntity.ok(PsychologistDto.fromEntity(psychologists.getFirst()));
    }

}
