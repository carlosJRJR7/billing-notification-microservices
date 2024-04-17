package br.com.api.billingnotification.domain.application.usecases.user;

import br.com.api.billingnotification.domain.application.gateways.UserGateways;
import br.com.api.billingnotification.domain.enterprise.entity.User;

public class CreateUserUseCase {

  private final UserGateways usersGateways;

  public CreateUserUseCase(UserGateways usersGateways) {
    this.usersGateways = usersGateways;
  }

  public User createUser(User user) {
    return usersGateways.createUser(user);
  }
}
