package com.frostemanneogard.braive.psychologists;

import com.frostemanneogard.braive.advice.responses.ApiResponse;
import com.frostemanneogard.braive.advice.responses.ApiResponseEntity;
import com.frostemanneogard.braive.base.BaseApiController;
import com.frostemanneogard.braive.psychologists.dtos.PsychologistDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(PsychologistsController.REQUEST_MAPPING)
@RequiredArgsConstructor
public class PsychologistsController extends BaseApiController {

    public static final String REQUEST_MAPPING = "psychologists";

    private final PsychologistsService psychologistsService;

    @Override
    public String getRequestMapping() {
        return REQUEST_MAPPING;
    }

    @GetMapping
    private ResponseEntity<ApiResponse<List<PsychologistDto>>> getAllPatients() {
        List<Psychologist> patients = this.psychologistsService.getAllPsychologists();

        return ApiResponseEntity.ok(patients.stream().map(PsychologistDto::fromEntity).toList());
    }

}
