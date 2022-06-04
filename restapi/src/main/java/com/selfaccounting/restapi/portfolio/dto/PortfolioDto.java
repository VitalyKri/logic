package com.selfaccounting.restapi.portfolio.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioDto {
    private double totalPrice;
    private double totalAmountBounds;
    private double totalAmountShares;
    private double expectedYield;
    private List<PositionPortfolioDto>  positionsPortfolioDto;

}
