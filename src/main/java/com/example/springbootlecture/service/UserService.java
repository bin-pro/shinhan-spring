package com.example.springbootlecture.service;

import com.example.springbootlecture.dto.UserDto;
import com.example.springbootlecture.entity.User;
import com.example.springbootlecture.repository.UserRepository;
import com.example.springbootlecture.security.UserDetailsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void joinUser(UserDto.UserJoinRequestDto userJoinRequestDto){
        User user = User.builder()
                .username(userJoinRequestDto.getUsername())
                .password(passwordEncoder.encode(userJoinRequestDto.getPassword()))
                .role(userJoinRequestDto.getRole())
                .build();
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //UUID 있는 경우 해당 UUID로 조회해야함. (UUID는 username으로 사용하지 않음)
        User user = userRepository.findByUsername(username);

        return UserDetailsResponse.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
    }
}
