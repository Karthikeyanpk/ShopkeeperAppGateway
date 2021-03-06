package com.diviso.graeshoppe.shopkeepergateway.client.store.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.shopkeepergateway.client.store.ClientConfiguration;

@FeignClient(name="${store.name:store}", url="${store.url:dev.ci1.divisosofttech.com:8071/}", configuration = ClientConfiguration.class)
public interface StoreSettingsResourceApiClient extends StoreSettingsResourceApi {
}