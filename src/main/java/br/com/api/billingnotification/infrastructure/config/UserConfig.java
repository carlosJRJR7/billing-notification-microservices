package br.com.api.billingnotification.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.api.billingnotification.domain.application.gateways.UserGateway;
import br.com.api.billingnotification.domain.application.usecases.user.CreateUserUseCase;
import br.com.api.billingnotification.infrastructure.controllers.user.UserDTOMapper;
import br.com.api.billingnotification.infrastructure.gateways.user.UserEntityMapper;
import br.com.api.billingnotification.infrastructure.gateways.user.UserRepositoryGateway;
import br.com.api.billingnotification.infrastructure.persistence.user.UserRepository;

@Configuration
public class UserConfig {

  @Bean
  CreateUserUseCase createUserUseCase(UserGateway usersGateways) {
    return new CreateUserUseCase(usersGateways);
  }

  @Bean
  UserGateway userGateways(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userEntityMapper, userRepository);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper userDTOMapper() {
    return new UserDTOMapper();
  }

}
