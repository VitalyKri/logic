package com.seflaccounting.mainaccount.web.dto;


import com.seflaccounting.mainaccount.entity.Operation;
import com.seflaccounting.mainaccount.entity.PositionPortfolio;
import com.selfaccounting.restapi.operation.dto.OperationDto;
import com.selfaccounting.restapi.portfolio.dto.PositionPortfolioDto;
import org.mapstruct.Mapper;

@Mapper
public interface PositionPortfolioMapper {

    PositionPortfolio toOperation(PositionPortfolioDto positionPortfolioDto);

    PositionPortfolioDto toOperationDto(PositionPortfolio positionPortfolio);

}
