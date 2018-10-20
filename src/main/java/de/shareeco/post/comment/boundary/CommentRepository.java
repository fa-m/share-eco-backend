package de.shareeco.post.comment.boundary;

import de.shareeco.post.comment.entity.Comment;
import de.shareeco.user.boundary.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    UserRepository userRepository = new UserRepository();
    private List<Comment> comments;

    public CommentRepository() {
        comments = new ArrayList<>();
        comments.add(new Comment("18.06.2018", userRepository.getUsers().get(0), "https://www.drklein.de/fileadmin/_processed_/0/4/csm_mahler-torsten_l_428493acd2.jpg", "Mein Vorschlag waere es einfach das naechste mal richtig zu machen", 100));
    }

    public List<Comment> getComments() {
        return comments;
    }
}
