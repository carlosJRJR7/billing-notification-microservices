package br.com.api.billingnotification.domain.application.usecases.user;

import br.com.api.billingnotification.domain.application.gateways.UserGateway;
import br.com.api.billingnotification.domain.enterprise.entity.User;

public class CreateUserUseCase {

  private final UserGateway usersGateways;

  public CreateUserUseCase(UserGateway usersGateways) {
    this.usersGateways = usersGateways;
  }

  public User createUser(User user) {
    return usersGateways.createUser(user);
  }
}
