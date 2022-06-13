package com.seflaccounting.mainaccount.service.Operation;

import com.seflaccounting.mainaccount.dao.OperationDao;
import com.seflaccounting.mainaccount.entity.Operation;
import com.seflaccounting.mainaccount.web.dto.OperationMapper;
import com.selfaccounting.restapi.operation.dto.OperationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class OperationServiceDao extends OperationServiceChain {

    private final OperationDao operationDao;
    private final OperationMapper operationMapper;
    private Map<String, OperationDto> operationMap = new HashMap();

    @Override
    public OperationDto save(OperationDto operationDto) {

        operationMap.put(operationDto.getId(),operationDto);
        return super.save(operationDto);
    }

    @Override
    public OperationDto findById(String id) {
        OperationDto operationDto = operationMap.get(id);
        if (operationDto!=null){
            return operationDto;
        }

        Operation operation = operationDao.findById(id).orElseThrow();
        if (operation!=null){
            return operationMapper.toOperationDto(operation);
        }
        return super.findById(id);
    }

}
