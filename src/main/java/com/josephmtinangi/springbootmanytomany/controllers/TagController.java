package com.josephmtinangi.springbootmanytomany.controllers;

import com.josephmtinangi.springbootmanytomany.models.Tag;
import com.josephmtinangi.springbootmanytomany.repositories.TagRepository;
import com.josephmtinangi.springbootmanytomany.utilities.Helper;
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
@RequestMapping(path = "/tags")
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<?> index(Pageable pageable) {

        Page<Tag> tags = tagRepository.findAll(pageable);

        return Helper.createResponse(tags, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<?> index(@ModelAttribute Tag tag) {

        Tag newTag = tagRepository.save(tag);

        return Helper.createResponse(newTag, HttpStatus.OK);
    }
}
