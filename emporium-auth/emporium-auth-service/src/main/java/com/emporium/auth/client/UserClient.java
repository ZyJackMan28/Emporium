package com.emporium.auth.client;

import com.emporium.crew.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;
@FeignClient("crew-service")
public interface UserClient extends UserApi {

}