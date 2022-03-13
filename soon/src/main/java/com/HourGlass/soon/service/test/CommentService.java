package com.HourGlass.soon.service.test;


// Testing with the spring vid on youtube


import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final PostService postService;

    public CommentService(PostService postService) {
        this.postService = postService;
    }
}

