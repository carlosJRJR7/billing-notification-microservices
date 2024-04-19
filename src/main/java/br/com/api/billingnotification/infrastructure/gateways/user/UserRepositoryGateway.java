package br.com.api.billingnotification.infrastructure.gateways.user;

import org.springframework.transaction.annotation.Transactional;

import br.com.api.billingnotification.domain.application.gateways.UserGateway;
import br.com.api.billingnotification.domain.enterprise.entity.User;
import br.com.api.billingnotification.infrastructure.persistence.user.UserEntity;
import br.com.api.billingnotification.infrastructure.persistence.user.UserRepository;

public class UserRepositoryGateway implements UserGateway {

  private final UserEntityMapper userEntityMapper;
  private final UserRepository userRepository;

  public UserRepositoryGateway(UserEntityMapper userEntityMapper, UserRepository userRepository) {
    this.userEntityMapper = userEntityMapper;
    this.userRepository = userRepository;
  }

  @Override
  @Transactional
  public User createUser(User user) {
    UserEntity userEntity = userEntityMapper.toEntity(user);
    UserEntity userEntitySaved = userRepository.save(userEntity);

    return userEntityMapper.toDomain(userEntitySaved);
  }
}
