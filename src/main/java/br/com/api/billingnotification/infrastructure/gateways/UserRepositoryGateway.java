package br.com.api.billingnotification.infrastructure.gateways;

import br.com.api.billingnotification.domain.application.gateways.UserGateways;
import br.com.api.billingnotification.domain.enterprise.entity.User;
import br.com.api.billingnotification.infrastructure.persistence.UserEntity;
import br.com.api.billingnotification.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateways {

  private final UserEntityMapper userEntityMapper;
  private final UserRepository userRepository;

  public UserRepositoryGateway(UserEntityMapper userEntityMapper, UserRepository userRepository) {
    this.userEntityMapper = userEntityMapper;
    this.userRepository = userRepository;
  }

  @Override
  public User createUser(User user) {
    UserEntity userEntity = userEntityMapper.toEntity(user);
    UserEntity userEntitySaved = userRepository.save(userEntity);

    return userEntityMapper.toDomain(userEntitySaved);
  }
}
