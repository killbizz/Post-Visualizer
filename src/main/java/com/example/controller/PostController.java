package com.example.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

import com.example.model.Post;
import com.example.service.JPAPostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private JPAPostService postService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPosts(Model model){
        List<Post> posts = postService.getPosts();
        Collections.sort(posts, new Comparator<Post>(){
            public int compare(Post p1, Post p2){
                int c = p2.getDate().compareTo(p1.getDate());
                if(c == 0) 
                    c = p2.getTime().compareTo(p1.getTime());
                return c;
            }
        } );
        model.addAttribute("posts", posts);
        return "posts";
    }

    @RequestMapping( method = RequestMethod.POST)
    public String insertPost(WebRequest req){
        String id = UUID.randomUUID().toString();
        String author = req.getParameter("author");
        String text = req.getParameter("text");
        Date date = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        Time time = new Time(Calendar.getInstance().getTimeInMillis());
        Post post = new Post(id, author, text, date, time);
        postService.insertPost(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable("id") String id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
    
}
