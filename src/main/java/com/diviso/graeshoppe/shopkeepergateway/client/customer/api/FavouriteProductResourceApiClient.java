package com.diviso.graeshoppe.shopkeepergateway.client.customer.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.shopkeepergateway.client.customer.ClientConfiguration;

@FeignClient(name="${customer.name:customer}", url="${customer.url:dev.ci1.divisosofttech.com:8088/}", configuration = ClientConfiguration.class)
public interface FavouriteProductResourceApiClient extends FavouriteProductResourceApi {
}