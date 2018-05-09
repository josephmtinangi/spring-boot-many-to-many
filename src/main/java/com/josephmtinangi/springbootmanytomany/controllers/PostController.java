package com.josephmtinangi.springbootmanytomany.controllers;

import com.josephmtinangi.springbootmanytomany.models.Post;
import com.josephmtinangi.springbootmanytomany.repositories.PostRepository;
import com.josephmtinangi.springbootmanytomany.utilities.Helper;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<?> index(Pageable pageable) {

        Page<Post> posts = postRepository.findAll(pageable);

        return Helper.createResponse(posts, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<?> store(@ModelAttribute Post post) {

        Post newPost = postRepository.save(post);

        return Helper.createResponse(newPost, HttpStatus.OK);
    }
}
