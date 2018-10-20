package de.shareeco.post.comment.boundary;

import de.shareeco.post.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @GetMapping("/post/{postId}/comment")
    @ResponseBody
    public List<Post> getComments() {

        return null;
    }
}
