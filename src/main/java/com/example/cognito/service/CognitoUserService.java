package com.example.cognito.service;

import com.amazonaws.services.cognitoidp.model.*;
import com.example.cognito.service.dto.UserSignUpDTO;

import java.util.Optional;

public interface CognitoUserService {

    Optional<AdminInitiateAuthResult> initiateAuth(String username, String password);

    Optional<AdminRespondToAuthChallengeResult> respondToAuthChallenge(
            String username, String newPassword, String session);

    GlobalSignOutResult signOut(String accessToken);

    ForgotPasswordResult forgotPassword(String username);

    void addUserToGroup(String username, String groupName);

    AdminSetUserPasswordResult setUserPassword(String username, String password);

    UserType signUp(UserSignUpDTO signUpDTO);

    AdminListUserAuthEventsResult getUserAuthEvents(String username, int maxResult, String nextToken);
}
