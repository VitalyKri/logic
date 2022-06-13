package com.seflaccounting.mainaccount.service.Operation;

import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.operation.dto.StatisticOperationDto;

import java.time.LocalDateTime;

public interface OperationService {

    OperationDto save(final OperationDto operationDto);


    OperationDto findById(String id);


}
