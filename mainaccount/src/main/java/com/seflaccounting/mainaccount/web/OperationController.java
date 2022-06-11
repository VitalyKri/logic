package com.seflaccounting.mainaccount.web;

import com.selfaccounting.restapi.operation.api.OperationGateway;
import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.operation.dto.StatisticOperation;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;

public class OperationController implements OperationGateway {
    @Override
    public ResponseEntity updateOperation(List<OperationDto> operationDtoList) {
        return null;
    }

    @Override
    public ResponseEntity<OperationDto> getOperation(String id) {
        return null;
    }

    @Override
    public ResponseEntity<StatisticOperation> getStatisticOnMonth(LocalDateTime onDate) {
        return null;
    }
}
