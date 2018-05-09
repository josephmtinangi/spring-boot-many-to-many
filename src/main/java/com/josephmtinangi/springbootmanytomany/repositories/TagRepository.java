package com.josephmtinangi.springbootmanytomany.repositories;

import com.josephmtinangi.springbootmanytomany.models.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends PagingAndSortingRepository<Tag, Long> {
}
