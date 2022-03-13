package com.HourGlass.soon.service.test;


import com.HourGlass.soon.service.test.CommentService;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final CommentService commentService;

    public PostService(CommentService commentService) {
        this.commentService = commentService;
    }
}
