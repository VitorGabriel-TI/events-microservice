package br.com.vitorgabrielti.eventsmicroservice.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.vitorgabrielti.eventsmicroservice.dtos.EmailRequestDTO;

@FeignClient(name = "email-service", url = "http://localhost:8090/api/email")
public interface EmailServiceClient {
    @PostMapping("/send")
    void sendEmail(@RequestBody EmailRequestDTO emailRequest);
}
