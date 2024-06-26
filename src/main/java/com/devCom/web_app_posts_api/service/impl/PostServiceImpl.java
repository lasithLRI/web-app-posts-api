package com.devCom.web_app_posts_api.service.impl;

import com.devCom.web_app_posts_api.dto.request.RequestFeedBackDto;
import com.devCom.web_app_posts_api.dto.request.RequestPostDto;
import com.devCom.web_app_posts_api.entity.Feedback;
import com.devCom.web_app_posts_api.entity.Post;
import com.devCom.web_app_posts_api.repository.PostRepository;
import com.devCom.web_app_posts_api.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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
                .images(postDto.getImages())
                .feedbacks(postDto.getFeedbacks())
                .build();

        postRepository.save(post);

    }

    @Override
    public void addComment(RequestFeedBackDto feedBackDto, String id) {
        Optional<Post> opPost = postRepository.findById(id);

        if (opPost.isPresent()){
            Post post = opPost.get();

            Feedback fb = Feedback.builder()
                    .name(feedBackDto.getName())
                    .date(feedBackDto.getDate())
                    .comments(feedBackDto.getComments())
                    .build();

            System.out.println(feedBackDto);
            ArrayList<Feedback> list = new ArrayList<>(post.getFeedbacks());
            list.add(fb);

            System.out.println(list);

            post.setFeedbacks(list);

            postRepository.save(post);

        }

    }

}
