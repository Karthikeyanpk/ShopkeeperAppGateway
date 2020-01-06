package com.diviso.graeshoppe.shopkeepergateway.client.report.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.shopkeepergateway.client.report.ClientConfiguration;

@FeignClient(name="${report.name:report}", url="${report.url:dev.ci3.divisosofttech.com:8077/}", configuration = ClientConfiguration.class)
public interface OrderMasterResourceApiClient extends OrderMasterResourceApi {
}