package com.seflaccounting.mainaccount.web.dto;

import com.seflaccounting.mainaccount.entity.Instrument;
import com.seflaccounting.mainaccount.entity.Operation;
import com.selfaccounting.restapi.instument.InstrumentDto;
import com.selfaccounting.restapi.operation.dto.OperationDto;
import org.mapstruct.Mapper;

@Mapper
public interface InstrumentMapper {

    Instrument toOperation(InstrumentDto instrumentDto);

    InstrumentDto toOperationDto(Instrument instrument);

}
