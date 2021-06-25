package com.example.repository;

import java.util.Optional;

import com.example.model.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPAPostRepository extends CrudRepository<Post, String> {

    Optional<Post> findById(String id);
    
}
