package com.seflaccounting.mainaccount.web.dto;

import com.seflaccounting.mainaccount.entity.Operation;
import com.selfaccounting.restapi.operation.dto.OperationDto;
import org.mapstruct.Mapper;

@Mapper
public interface OperationMapper {

                Operation toOperation(OperationDto operationDto);

                OperationDto toOperationDto(Operation operation);

}
