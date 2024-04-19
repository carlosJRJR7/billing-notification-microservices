package br.com.api.billingnotification.infrastructure.controllers.billing;

import java.time.LocalDateTime;

public record DataBillingRequest(Long id, Long idUser, Double value, String status, Long installments,
        String description, LocalDateTime createdAt, LocalDateTime dateReference) {

}
