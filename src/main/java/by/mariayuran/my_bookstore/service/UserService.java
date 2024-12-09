package by.mariayuran.my_bookstore.service;

import by.mariayuran.my_bookstore.dto.UserDto;
import by.mariayuran.my_bookstore.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);

    void save(User user);

    User findByName(String name);

    List<UserDto> getAll();

    void updateProfile(UserDto dto);
}
