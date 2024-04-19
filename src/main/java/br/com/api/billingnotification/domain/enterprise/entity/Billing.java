package br.com.api.billingnotification.domain.enterprise.entity;

import java.time.LocalDateTime;

public record Billing(Long idBilling, Long idUser, Double value, String status, Long installments,
        String description, LocalDateTime createdAt, LocalDateTime dateReference) {

}
