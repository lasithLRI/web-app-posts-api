package com.devCom.web_app_posts_api.service;

import com.devCom.web_app_posts_api.dto.request.RequestFeedBackDto;
import com.devCom.web_app_posts_api.dto.request.RequestPostDto;

public interface PostService {
    public void savePost(RequestPostDto postDto);
    public void addComment(RequestFeedBackDto feedBackDto, String id);

    String deletePost(String id);

    public void update(RequestPostDto postDto, String id);

}
