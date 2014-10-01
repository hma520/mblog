package org.kingxkm.mblog.repository;


import org.kingxkm.mblog.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostDao extends CrudRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
}
