package de.shareeco.post.boundary;

import de.shareeco.post.comment.boundary.CommentRepository;
import de.shareeco.post.entity.Post;
import de.shareeco.user.boundary.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    UserRepository userRepository = new UserRepository();
    CommentRepository commentRepository = new CommentRepository();
    private List<Post> posts;

    public PostRepository() {
        posts = new ArrayList<>();
        posts.add(new Post(0, "17.06.2018", userRepository.getUsers().get(0), "https://www.drklein.de/fileadmin/_processed_/0/4/csm_mahler-torsten_l_428493acd2.jpg", "Hallo ich haben einen Fehler.. einen grossen", 1, commentRepository.getComments()));
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Post getPostById(long id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
