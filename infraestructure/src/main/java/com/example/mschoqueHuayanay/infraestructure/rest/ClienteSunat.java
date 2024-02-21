package com.example.mschoqueHuayanay.infraestructure.rest;


import com.example.mschoqueHuayanay.domain.aggregates.response.ResponseSunat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cliente-sunat", url = "https://api.apis.net.pe/v2/sunat/")
public interface ClienteSunat {

    @GetMapping("/ruc")
    ResponseSunat getInfoSunat(@RequestParam("numero") String numero,
                               @RequestHeader("Authorization") String authorization);

}
