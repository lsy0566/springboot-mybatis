package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostMapper mapper;

    @Override   //게시물 목록
    public List<Posts> getAllPosts() {
        return mapper.selectAllPosts();
    }

    @Override   //게시물 상세보기
    public Posts getPostById(String id) {
        return mapper.selectPostById(id);
    }

    @Override
    public int createPost(Posts post) {
        return mapper.insertPost(post);
    }

    @Override
    public int removePost(String id) {
        return mapper.deletePost(id);
    }

    @Override
    public Posts getAllByUser_id() {
        return mapper.selectAllByUser_id();
    }
}
