package com.seflaccounting.mainaccount.service.Operation;

import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.operation.dto.StatisticOperationDto;

import java.time.LocalDateTime;

public abstract class OperationServiceChain implements OperationService {
    private OperationServiceChain next;

    public OperationDto save(final OperationDto operationDto) {
        if(next != null)
            next.save(operationDto);
        return operationDto;
    }


    public OperationDto findById(String id) {
        if (next!=null){
            OperationDto byId = next.findById(id);
            if (byId!=null){
                return byId;
            }
        }
        throw new NullPointerException();
    }



    public OperationServiceChain link(OperationServiceChain next) {
            this.next = next;
            return next;
    }
}
