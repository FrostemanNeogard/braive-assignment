package com.frostemanneogard.braive.patients;

import com.frostemanneogard.braive.advice.responses.ApiResponse;
import com.frostemanneogard.braive.advice.responses.ApiResponseEntity;
import com.frostemanneogard.braive.base.BaseApiController;
import com.frostemanneogard.braive.patients.dtos.PatientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(PatientsController.REQUEST_MAPPING)
@RequiredArgsConstructor
public class PatientsController extends BaseApiController {

    public static final String REQUEST_MAPPING = "/patients";

    private final PatientsService patientsService;

    @Override
    public String getRequestMapping() {
        return REQUEST_MAPPING;
    }

    @GetMapping
    private ResponseEntity<ApiResponse<List<PatientDto>>> getAllPatients() {
        List<Patient> patients = this.patientsService.getAllPatients();

        return ApiResponseEntity.ok(patients.stream().map(PatientDto::fromEntity).toList());
    }

}
