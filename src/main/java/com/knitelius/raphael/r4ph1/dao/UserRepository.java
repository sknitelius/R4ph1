package com.knitelius.raphael.r4ph1.dao;

import com.knitelius.raphael.r4ph1.model.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
