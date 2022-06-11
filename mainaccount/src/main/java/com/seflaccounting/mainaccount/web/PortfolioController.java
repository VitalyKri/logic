package com.seflaccounting.mainaccount.web;

import com.selfaccounting.restapi.portfolio.api.PortfolioGateway;
import com.selfaccounting.restapi.portfolio.dto.PortfolioDto;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class PortfolioController implements PortfolioGateway {
    @Override
    public ResponseEntity updateOperation(PortfolioDto portfolioDto) {
        return null;
    }

    @Override
    public ResponseEntity<PortfolioDto> getPortfolio(LocalDateTime onDate) {
        return null;
    }
}
