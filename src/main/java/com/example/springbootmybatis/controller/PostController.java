package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService service;

//    @PostMapping("/posts/{id}")
//    public Posts createPost(@RequestBody Posts post) {
//        Posts createdPost = service.createPost();
//
//    }

    @GetMapping("/posts")
    public List<Posts> getAllPosts() {
        List<Posts> list = service.getAllPosts();

        return list;
    }
//   @DeleteMapping("/posts/{id}")

//   @GetMapping("/posts/{id}")
//    public Posts getPosts

}
