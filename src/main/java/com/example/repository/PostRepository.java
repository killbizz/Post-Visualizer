package com.example.repository;

import java.util.List;

import com.example.model.Post;

public interface PostRepository {
    List<Post> getPosts();
    void insertPost(Post post);
    void deletePost(String id);
}
