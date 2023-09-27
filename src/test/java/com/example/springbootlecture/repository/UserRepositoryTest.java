package com.example.springbootlecture.repository;

import com.example.springbootlecture.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void 유저등록(){
        //given
        User user = User.builder()
                .id(1L)
                .username("user1")
                .build();

        //when
        userRepository.save(user);

        //then
        User findUser = userRepository.findById(1L).get();

        assertThat(findUser.getId()).isEqualTo(1L);
        assertThat(findUser.getName()).isEqualTo("user1");
        assertThat(findUser.getAge()).isEqualTo(22);
        assertThat(findUser.getGender()).isEqualTo("male");
    }

}
