package br.com.api.billingnotification.infrastructure.gateways.user;

import br.com.api.billingnotification.domain.enterprise.entity.User;
import br.com.api.billingnotification.infrastructure.persistence.user.UserEntity;

public class UserEntityMapper {

  UserEntity toEntity(User user) {
    return new UserEntity(user.name(), user.password(), user.email(), user.phone(), user.createdAt());
  }

  User toDomain(UserEntity userEntity) {
    return new User(userEntity.getIdUser(), userEntity.getName(), userEntity.getPassword(), userEntity.getEmail(),
        userEntity.getPhone(), userEntity.getCreatedAt());
  }
}
