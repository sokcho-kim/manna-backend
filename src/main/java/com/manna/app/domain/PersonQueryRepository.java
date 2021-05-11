package com.manna.app.domain;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.manna.app.domain.QPerson.person;

@RequiredArgsConstructor
@Repository
public class PersonQueryRepository {
    private final JPAQueryFactory jpaQueryFactory;

    public List<Person> findAll(){
        return jpaQueryFactory
                .selectFrom(person).fetch();
    }
}