package br.com.vitorgabrielti.eventsmicroservice.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
    
}
