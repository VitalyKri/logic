package com.selfaccounting.restapi.operation.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatisticOperationDto {
    private LocalDateTime month;
    private double totalCost;
    private double expectedYield;
    private double replenishment;
}
