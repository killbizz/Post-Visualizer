package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Post;
import com.example.repository.JPAPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAPostService {
    
    @Autowired
    private JPAPostRepository postRepository;

    public List<Post> getPosts() {
        List<Post> posts = new ArrayList<Post>();
        postRepository.findAll().forEach( post -> {
            posts.add(post);
        });
        return posts;
    }

    public void insertPost(Post post) {
        postRepository.save(post);
    }

    public void deletePost(String id) {
        postRepository.deleteById(id);   
    }

}
