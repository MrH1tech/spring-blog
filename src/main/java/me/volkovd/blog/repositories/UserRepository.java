package me.volkovd.blog.repositories;

import me.volkovd.blog.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
