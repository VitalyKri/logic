package com.selfaccounting.restapi.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "com.selfaccounting")
public class ApiProperties {
        private Connection connection;
        private Endpoint endpoint;

        @Setter
        @Getter
        public static class Connection {
            private Long connectTimeout;
            private Long readTimeout;
            private Long period;
            private Long maxPeriod;
            private Integer maxAttempts;
        }

        @Getter
        @Setter
        public static class Endpoint {
            private String operationUrl;
            private String portfolioUrl;
        }
}
