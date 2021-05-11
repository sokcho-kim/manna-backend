package com.manna.app.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PersonQuerydslRepositoryTests {
    @Autowired
    private PersonQueryRepository queryRepository;

    @Test
    @DisplayName("Querydsl 조회 테스트")
    public void findAllTest(){
        queryRepository.findAll();
    }
}