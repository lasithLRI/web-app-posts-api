package com.devCom.web_app_posts_api.service.impl;

import com.devCom.web_app_posts_api.dto.request.RequestPostDto;
import com.devCom.web_app_posts_api.entity.Post;
import com.devCom.web_app_posts_api.repository.PostRepository;
import com.devCom.web_app_posts_api.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    @Override
    public void savePost(RequestPostDto postDto) {

        Post post = Post.builder()
                .title(postDto.getTitle())
                .descriptions(postDto.getDescriptions())
                .charges(postDto.getCharges())
                .contact(postDto.getContact())
                .build();

        postRepository.save(post);

    }
}
