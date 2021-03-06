package com.example.springboot_jpa.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserApiRepositoryTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void API_등록테스트(){
        //GIVEN
        String name ="Hyun";
        int age = 28;

        UserResponseDto userResponseDto = UserResponseDto.builder().name(name).age(age).build();
        System.out.printf("userResponseDto : "+userResponseDto.getName());
        System.out.printf("userResponseDto : "+userResponseDto);
        String url ="http://localhost:"+port+"/api/v1/users";
        System.out.printf("url : "+url);
        //when
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url,userResponseDto,Long.class);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);

        List<User> userList = userRepository.findAll();
        assertThat(userList.get(0).getName()).isEqualTo("Hyun");
        assertThat(userList.get(0).getAge()).isEqualTo(age);

    }
}
