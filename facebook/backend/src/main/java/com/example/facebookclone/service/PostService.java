package com.example.facebookclone.service;

import com.example.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
