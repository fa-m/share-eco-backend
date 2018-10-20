package de.shareeco.post.boundary;

import de.shareeco.post.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private PostRepository postRepository = new PostRepository();

    @GetMapping("/post")
    @ResponseBody
    public List<Post> getPosts() {
        return postRepository.getPosts();
    }

    @GetMapping("/post/{postId}")
    @ResponseBody
    public Post getPostById(@PathVariable("postId") long id) {
        return postRepository.getPostById(id);
    }
}
