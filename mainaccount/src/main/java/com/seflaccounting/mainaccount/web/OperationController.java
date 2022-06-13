package com.seflaccounting.mainaccount.web;

import com.seflaccounting.mainaccount.service.Operation.OperationService;
import com.selfaccounting.restapi.operation.api.OperationGateway;
import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.operation.dto.StatisticOperationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;


@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/operation")
public class OperationController implements OperationGateway {

    private final OperationService operationService;

    @Override
    public ResponseEntity updateOperation(List<OperationDto> operationDtoList) {

        for (OperationDto operationDto:
                operationDtoList) {
            operationService.save(operationDto);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<OperationDto> getOperation(String id) {
        return new ResponseEntity<>(operationService.findById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StatisticOperationDto> getStatisticOnMonth(LocalDateTime onDate) {
        return null;
    }


}
