package de.shareeco.post.comment.entity;

import de.shareeco.post.entity.IPost;
import de.shareeco.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
public class Comment implements IPost {
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
    @Setter
    private int likeCount;

    @Override
    public void addLike() {
        likeCount += 1;
    }

    @Override
    public void removeLike() {
        likeCount -= 1;
    }
}
