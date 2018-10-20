package de.shareeco.post.boundary;

import de.shareeco.post.entity.Post;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostRepository postRepository = new PostRepository();

    @GetMapping("/post")
    @ResponseBody
    public List<Post> getPosts() {
        return postRepository.getPosts();
    }

    @PutMapping("/post/{id}")
    @ResponseBody
    public Post putPost(@PathVariable("id") long id) {
        return postRepository.getPosts().get(0);
    }

    @PostMapping("/post")
    @ResponseBody
    public Post postPost() {
        return postRepository.getPosts().get(0);
    }

    @DeleteMapping("/post/{id}")
    @ResponseBody
    public Post deletePost(@PathVariable("id") long id) {
        return postRepository.getPostById(id);
    }

    @GetMapping("/post/{postId}")
    @ResponseBody
    public Post getPostById(@PathVariable("postId") long id) {
        return postRepository.getPostById(id);
    }
}
