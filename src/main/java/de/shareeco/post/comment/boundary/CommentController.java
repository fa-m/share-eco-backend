package de.shareeco.post.comment.boundary;

import de.shareeco.post.comment.entity.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @GetMapping("/post/{postId}/comment")
    @ResponseBody
    public List<Comment> getComments() {
        return null;
    }

    @PostMapping("/comment")
    @ResponseBody
    public Comment postComment() {
        return null;
    }

    @PutMapping("/comment/{id}")
    @ResponseBody
    public Comment putComment(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/comment/{id}")
    @ResponseBody
    public Comment deleteComment(@PathVariable("id") long id) {
        return null;
    }
}
