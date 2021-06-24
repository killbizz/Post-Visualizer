package com.example.controller;

import java.util.List;

import com.example.model.Post;
import com.example.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPosts(Model model){
        List<Post> posts = postService.getPosts();
        model.addAttribute("posts", posts);
        return "posts";
    }

    // TODO : POST method per inserimento di un nuovo post
    
}
