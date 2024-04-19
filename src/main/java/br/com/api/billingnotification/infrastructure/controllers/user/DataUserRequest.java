package br.com.api.billingnotification.infrastructure.controllers.user;

public record DataUserRequest(Long id, String name, String password, String email, String phone) {

}
