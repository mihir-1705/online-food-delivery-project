package in.mihir.foodiesapi.service;

import in.mihir.foodiesapi.io.UserRequest;
import in.mihir.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
