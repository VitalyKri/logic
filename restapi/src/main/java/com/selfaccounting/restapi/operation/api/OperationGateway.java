package com.selfaccounting.restapi.operation.api;


import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.operation.dto.StatisticOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

public interface OperationGateway {

    @PostMapping("/update")
    ResponseEntity updateOperation(@RequestBody List<OperationDto> operationDtoList);

    @GetMapping("/{operationId}")
    ResponseEntity<OperationDto> getOperation(@PathVariable("operationId") String id);

    @GetMapping("/{onDate}")
    ResponseEntity<StatisticOperation> getStatisticOnMonth(@PathVariable("onDate") LocalDateTime onDate);

}
