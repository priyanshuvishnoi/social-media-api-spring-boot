package com.priyanshu.socialmediaapi.repository;

import com.priyanshu.socialmediaapi.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{email:'?0'}")
    User findUserByEmail(String email);
}
