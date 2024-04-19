package br.com.api.billingnotification.domain.application.gateways;

import br.com.api.billingnotification.domain.enterprise.entity.User;

public interface UserGateway {
  User createUser(User user);
}
