package com.josephmtinangi.springbootmanytomany.repositories;

import com.josephmtinangi.springbootmanytomany.models.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
