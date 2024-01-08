package com.laze.outrun.backend.sample.repository;

import com.laze.outrun.backend.sample.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
