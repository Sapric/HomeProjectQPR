package pl.luxoft.qpr.bilykov.service;

import java.util.List;

import pl.luxoft.qpr.bilykov.dto.ChangePasswordRequest;
import pl.luxoft.qpr.bilykov.dto.UserRequest;
import pl.luxoft.qpr.bilykov.model.User;

public interface UserService {

    List<User> getUsers();
    User getUser(String email);
    void register(UserRequest request);
    void deleteUser(String email);
    void deleteUser(int id);
    String getCurrentUser();
    void sendPasswordRequestEmail(String email, String baseUrl);
    void changePassword(ChangePasswordRequest request);

}
