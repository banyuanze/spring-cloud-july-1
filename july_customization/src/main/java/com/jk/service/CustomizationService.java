package com.jk.service;

import com.jk.customization.service.CustomizationServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-client")
public interface CustomizationService {

}
