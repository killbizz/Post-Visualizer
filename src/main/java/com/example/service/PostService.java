package com.example.service;

import java.util.List;

import com.example.model.Post;

public interface PostService {
    List<Post> getPosts();
    void insertPost(Post post);
    void deletePost(String id);
}
