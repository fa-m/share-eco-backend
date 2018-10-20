package de.shareeco.post.entity;

import de.shareeco.post.comment.entity.Comment;
import de.shareeco.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
public class Post implements IPost {
    @Getter
    private final long id;
    @Getter
    private final String date;
    @Getter
    private final User author;
    @Getter
    @Setter
    private String urlToPhoto;
    @Getter
    @Setter
    private String text;
    @Getter
    private int likeCount = 0;
    @Getter
    @Setter
    private List<Comment> comments;

    @Override
    public void addLike() {
        likeCount += 1;
    }

    @Override
    public void removeLike() {
        likeCount -= 1;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
