package com.selfaccounting.restapi.portfolio.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PositionPortfolioDto {
    private String instrumentType;
    private String quantity;
    private double averagePositionPrice;
    private String sector;
    private double payment;
    private double currentPrice;
}
