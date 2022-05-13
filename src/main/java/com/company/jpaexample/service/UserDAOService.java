package com.company.jpaexample.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.company.jpaexample.entity.User;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {
    
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
