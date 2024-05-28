package com.example.SpringMysql.Repository;

import com.example.SpringMysql.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<UserDetails,Integer> {
}
