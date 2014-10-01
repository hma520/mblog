package org.kingxkm.mblog.repository;


import org.kingxkm.mblog.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post, Long> {
}
