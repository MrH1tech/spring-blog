package me.volkovd.blog.repositories;

import me.volkovd.blog.entities.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
}
