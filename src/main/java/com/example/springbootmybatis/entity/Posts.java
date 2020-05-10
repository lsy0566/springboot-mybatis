package com.example.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Posts {
    private String id;
    private String user_id;
    private String title;
    private String contents;
    private String del_yn;
    private Date createAt;

}
