package com.selfaccounting.restapi.portfolio.api;


import com.selfaccounting.restapi.portfolio.dto.PortfolioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

public interface PortfolioGateway {

    @PostMapping("/update")
    ResponseEntity updateOperation(@RequestBody PortfolioDto portfolioDto);

    @GetMapping("/{onDate}")
    ResponseEntity<PortfolioDto> getPortfolio(@PathVariable("onDate") LocalDateTime onDate);

}
