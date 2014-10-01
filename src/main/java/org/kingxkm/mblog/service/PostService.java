package org.kingxkm.mblog.service;


import org.kingxkm.mblog.entity.Post;
import org.kingxkm.mblog.repository.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理类.
 *
 * @author calvin
 */
// Spring Service Bean的标识.

@Transactional
@Service
public class PostService {


    @Autowired
    private PostDao postDao;

    public Iterable<Post> getAllPost() {
        return postDao.findAll();
    }

    public Post getPost(Long id) {
        return postDao.findOne(id);
    }

    public void deletePost(Long id) {
        postDao.delete(id);
    }

    public Post addPost(Post post) {
        return postDao.save(post);
    }
    public List<Post> getAllPostByUserId(Long userId) {
        return postDao.findByUserId(userId);
    }
}
