package com.devCom.web_app_posts_api.controller;


import com.devCom.web_app_posts_api.dto.request.RequestFeedBackDto;
import com.devCom.web_app_posts_api.dto.request.RequestPostDto;
import com.devCom.web_app_posts_api.entity.Feedback;
import com.devCom.web_app_posts_api.entity.Post;
import com.devCom.web_app_posts_api.repository.PostRepository;
import com.devCom.web_app_posts_api.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentsController {

    private final PostService postService;


    @PutMapping("/{id}")
    private boolean updateComments(

            @PathVariable String id,
            @RequestBody RequestFeedBackDto fbDto
    ){

        postService.addComment(fbDto,id);
        return true;

    }
}
