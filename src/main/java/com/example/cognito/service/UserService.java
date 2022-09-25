package com.example.cognito.service;

import com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult;
import com.amazonaws.services.cognitoidp.model.ForgotPasswordResult;
import com.amazonaws.services.cognitoidp.model.UserType;
import com.example.cognito.service.dto.LoginDTO;
import com.example.cognito.service.dto.UserPasswordUpdateDTO;
import com.example.cognito.service.dto.UserSignUpDTO;
import com.example.cognito.web.response.AuthenticatedResponse;
import com.example.cognito.web.response.BaseResponse;

import javax.validation.constraints.NotNull;

public interface UserService {

    BaseResponse authenticate(LoginDTO userLogin);

    AuthenticatedResponse updateUserPassword(UserPasswordUpdateDTO userPasswordUpdateDTO);

    void logout(@NotNull String accessToken);

    ForgotPasswordResult userForgotPassword(String username);

    UserType createUser(UserSignUpDTO signUpDTO);

    AdminListUserAuthEventsResult userAuthEvents(String username, int maxResult, String nextToken);
}
