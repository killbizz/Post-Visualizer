package com.example.service;

import java.util.List;

import com.example.model.Post;
import com.example.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getPosts() {
        return postRepository.getPosts();
    }

    @Override
    public void insertPost(Post post) {
        postRepository.insertPost(post);
    }

    @Override
    public void deletePost(String id) {
        postRepository.deletePost(id);    
    }
    
}
