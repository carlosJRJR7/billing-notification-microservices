package br.com.api.billingnotification.infrastructure.controllers.users;

import br.com.api.billingnotification.domain.enterprise.entity.User;

public class UserDTOMapper {

  DataUserResponse toResponse(User user) {
    return new DataUserResponse(user.id(), user.name(), user.email(), user.phone());
  }

  User toUser(DataUserRequest dataUsersRequest) {
    return new User(dataUsersRequest.id(), dataUsersRequest.name(), dataUsersRequest.password(),
        dataUsersRequest.email(), dataUsersRequest.phone());
  }

}
