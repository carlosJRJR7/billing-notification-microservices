package br.com.api.billingnotification.infrastructure.controllers.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.billingnotification.domain.application.usecases.user.CreateUserUseCase;
import br.com.api.billingnotification.domain.enterprise.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

  private final CreateUserUseCase createUserUseCase;
  private final UserDTOMapper usersDTOMapper;

  public UserController(CreateUserUseCase createUserUseCase, UserDTOMapper usersDTOMapper) {
    this.createUserUseCase = createUserUseCase;
    this.usersDTOMapper = usersDTOMapper;
  }

  @PostMapping
  public DataUserResponse createUsers(DataUserRequest dataUsersRequest) {
    User userRequest = usersDTOMapper.toUser(dataUsersRequest);
    User userObj = createUserUseCase.createUser(userRequest);
    DataUserResponse userResponse = usersDTOMapper.toResponse(userObj);
    return userResponse;
  }

}
