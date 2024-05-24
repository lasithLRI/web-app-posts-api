package com.devCom.web_app_posts_api.repository;

import com.devCom.web_app_posts_api.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
