package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Posts;

import java.util.List;

public interface PostService {
    List<Posts> getAllPosts();  //게시물 전체
    Posts getPostById(String id);        //게시물 보기
    int createPost(Posts post); //게시물 추가
    int removePost(String id);  //게시물 삭제
    Posts getAllByUser_id();    //사용자별 목록
}
