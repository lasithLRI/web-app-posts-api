package com.devCom.web_app_posts_api.controller;

import com.devCom.web_app_posts_api.dto.request.RequestPostDto;
import com.devCom.web_app_posts_api.entity.Post;
import com.devCom.web_app_posts_api.service.PostService;
import com.devCom.web_app_posts_api.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    private ResponseEntity<StandardResponse> savePost(@RequestBody RequestPostDto postDto){

        postService.savePost(postDto);

        return new ResponseEntity<>(
                new StandardResponse(201,"Post was Saved",postDto.getTitle()),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable(value = "id") String id){
        String deleted = postService.deletePost(id);
        return deleted;
    }

    @PutMapping("/update/{id}")
    public String updatePost(@PathVariable String id, @RequestBody RequestPostDto postDto){
        postService.update(postDto,id);
        return "Updated..";
    }
}
