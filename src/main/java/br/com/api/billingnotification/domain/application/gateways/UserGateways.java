package br.com.api.billingnotification.domain.application.gateways;

import br.com.api.billingnotification.domain.enterprise.entity.User;

public interface UserGateways {
  User createUser(User user);
}
