package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Posts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {
    List<Posts> selectAllPosts();   // 게시물 목록
    Posts selectPostById(String id);// 게시물 상세보기
    int insertPost(Posts post); // 게시물 추가
    int deletePost(String id); // 게시물 삭제
    Posts selectAllByUser_id();
}
