package com.diviso.graeshoppe.shopkeepergateway.client;

import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;

import com.diviso.graeshoppe.shopkeepergateway.security.oauth2.AuthorizationHeaderUtil;

public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
