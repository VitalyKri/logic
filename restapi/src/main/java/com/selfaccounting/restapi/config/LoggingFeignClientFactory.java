package com.selfaccounting.restapi.config;


import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.optionals.OptionalDecoder;
import feign.slf4j.Slf4jLogger;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Primary
@RequiredArgsConstructor
public class LoggingFeignClientFactory implements FeingClient {


    private final ApiProperties gbApiProperties;
    private final ObjectFactory<HttpMessageConverters> messageConverters;
    private static final Logger logger = LogManager.getLogger(LoggingFeignClientFactory.class);

    @Override
    public <T> T newFeignClient(Class<T> requiredType, String url) {
        logger.info("The main() method is called");
        return Feign.builder()
                .encoder(new SpringEncoder(this.messageConverters))
                .decoder(new OptionalDecoder(new ResponseEntityDecoder(new SpringDecoder(this.messageConverters))))
                .options(new Request.Options(
                        gbApiProperties.getConnection().getConnectTimeout(),
                        TimeUnit.SECONDS,
                        gbApiProperties.getConnection().getReadTimeout(),
                        TimeUnit.SECONDS,
                        true
                ))
                .logger(new Slf4jLogger(requiredType))
                .logLevel(feign.Logger.Level.FULL)
                .retryer(new Retryer.Default(
                        gbApiProperties.getConnection().getPeriod(),
                        gbApiProperties.getConnection().getMaxPeriod(),
                        gbApiProperties.getConnection().getMaxAttempts()
                ))
                .contract(new SpringMvcContract())
                .target(requiredType, url);
    }
}
