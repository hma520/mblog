package org.kingxkm.mblog.service;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kingxkm.mblog.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class PostServiceTest extends TestCase {
    @Autowired
    PostService postService;
    @Autowired
    UserService userService;
    public void testGetAllPost() throws Exception {

    }


    @Test
    public void testGetAllPostByUserId() throws Exception {

        System.out.println("查询结果数." + postService.getAllPostByUserId(1l).size());
        System.out.println(JSON.toJSONString(postService.getAllPostByUserId(1l)));
        System.out.println("查询结束.............");
    }


   @Test
    public void testAddPost() throws Exception {
        Post post = new Post();
        post.setTitle("Blog标题行");
        post.setContent("Blog标题行，内容页！！！！！！！！");
        post.setUser(userService.getUser(1l));
        postService.addPost(post);
        System.out.println(JSON.toJSONString(postService.getAllPost()));
    }
}