package com.selfaccounting.restapi.operation.api;


import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.operation.dto.StatisticOperationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

public interface OperationGateway {

    @PostMapping("/update")
    ResponseEntity updateOperation(@RequestBody List<OperationDto> operationDtoList);

    @GetMapping("/{operationId}")
    ResponseEntity<OperationDto> getOperation(@PathVariable("operationId") String id);

    @GetMapping("/{onDate}")
    ResponseEntity<StatisticOperationDto> getStatisticOnMonth(@PathVariable("onDate") LocalDateTime onDate);

}
