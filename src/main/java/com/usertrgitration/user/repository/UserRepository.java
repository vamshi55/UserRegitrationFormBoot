package com.usertrgitration.user.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.usertrgitration.user.documents.User;
@Repository("userrep")
@CrossOrigin(origins="http://localhost:4200")
public interface UserRepository extends MongoRepository<User, UUID> {

}
