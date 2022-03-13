package com.HourGlass.soon.service.test;


// Testing with the spring vid on youtube


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private PostService postService;

}

