package com.selfaccounting.restapi.config;

public interface FeingClient  {
      <T> T newFeignClient(Class<T> requiredType, String url);
}
