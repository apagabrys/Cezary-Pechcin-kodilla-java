package com.kodilla.testing.forum;

public class ForumComment {
    ForumPost thePost;
    String commentBody;
    String author;

    public ForumComment(ForumPost thePost, String commentBody, String author) {
        this.thePost = thePost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getThePost() {
        return thePost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!thePost.equals(that.thePost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = thePost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
