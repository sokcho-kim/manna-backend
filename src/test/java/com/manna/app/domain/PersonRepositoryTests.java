package com.manna.app.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PersonRepositoryTests {
    @Autowired
    private PersonRepository personRepository;

    @Test
    @DisplayName("저장 테스트")
    public void insertTest(){
        String name = "김속초";
        personRepository.save(Person.builder()
                .name(name)
                .build());

        Person person = personRepository.findAll().get(0);
        assertEquals(person.getName(), name);
    }
}