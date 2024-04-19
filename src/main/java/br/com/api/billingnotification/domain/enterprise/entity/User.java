package br.com.api.billingnotification.domain.enterprise.entity;

import java.time.LocalDateTime;

public record User(Long id, String name, String password, String email, String phone, LocalDateTime createdAt) {
}
