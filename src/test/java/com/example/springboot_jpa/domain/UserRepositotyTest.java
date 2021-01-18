package com.example.springboot_jpa.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositotyTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void 유저데이터_JPA에_넣기(){

        //given
        User User = new User().builder().name("현").age(28).build();
        userRepository.save(User);

        //when
        List<User> UserList = userRepository.findAll();

        System.out.printf("UserList : "+UserList.get(0).getName());
        //then
        User Users = UserList.get(0);
        assertThat(Users.getName()).isEqualTo("현");
        assertThat(Users.getAge()).isEqualTo(28);
    }

}
