package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService service;

    @PostMapping("")

    @GetMapping("/posts")
    public List<Posts> getAllPosts() {
        List<Posts> list = service.getAllPosts();

        return list;
    }

}
