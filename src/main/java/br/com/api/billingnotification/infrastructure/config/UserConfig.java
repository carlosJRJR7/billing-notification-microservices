package br.com.api.billingnotification.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.api.billingnotification.domain.application.gateways.UserGateways;
import br.com.api.billingnotification.domain.application.usecases.user.CreateUserUseCase;
import br.com.api.billingnotification.infrastructure.controllers.users.UserDTOMapper;
import br.com.api.billingnotification.infrastructure.gateways.UserEntityMapper;
import br.com.api.billingnotification.infrastructure.gateways.UserRepositoryGateway;
import br.com.api.billingnotification.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {

  @Bean
  CreateUserUseCase createUserUseCase(UserGateways usersGateways) {
    return new CreateUserUseCase(usersGateways);
  }

  @Bean
  UserGateways usersGateways(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userEntityMapper, userRepository);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper usersDTOMapper() {
    return new UserDTOMapper();
  }

}
