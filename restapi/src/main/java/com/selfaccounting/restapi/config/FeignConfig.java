package com.selfaccounting.restapi.config;

import com.selfaccounting.restapi.operation.api.OperationGateway;
import com.selfaccounting.restapi.portfolio.api.PortfolioGateway;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@EnableFeignClients
@EnableConfigurationProperties(ApiProperties.class)
@RequiredArgsConstructor
@Import(value = {FeignClientFactory.class})
@Getter
@ComponentScan("com.selfaccounting.restapi.config")
public class FeignConfig {
    private final ApiProperties apiProperties;
    private final FeignClientFactory feignClientFactory;

        @Bean
        public OperationGateway operationGateway() {
            return feignClientFactory.newFeignClient(OperationGateway.class, apiProperties.getEndpoint().getOperationUrl());
        }

        @Bean
        public PortfolioGateway portfolioGateway() {
            return feignClientFactory.newFeignClient(PortfolioGateway.class, apiProperties.getEndpoint().getPortfolioUrl());
        }

}
