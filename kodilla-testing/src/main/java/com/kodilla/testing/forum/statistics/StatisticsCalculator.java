package com.kodilla.testing.forum.statistics;


public class StatisticsCalculator {
    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private int averagePostPerUser;
    private int averageCommentPerUser;
    private int averageCommentPerPost;

    public StatisticsCalculator(int usersQuantity, int postsQuantity, int commentsQuantity, int averagePostPerUser, int averageCommentPerUser, int averageCommentPerPost) {
        this.statistics = statistics;
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.averagePostPerUser = averagePostPerUser;
        this.averageCommentPerUser = averageCommentPerUser;
        this.averageCommentPerPost = averageCommentPerPost;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public int getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public int getAverageCommentPerPost() {
        return averageCommentPerPost;
    }



    public int calculateAdvStatistics(Statistics statistics){
        int usersQuantity = statistics.userNames().size();
        int postsQuantity = statistics.postsCount();
        int commentsQuantity = statistics.commentsCount();
        int averagePostPerUser = postsQuantity/usersQuantity;
        int averageCommentPerUser = commentsQuantity/usersQuantity;
        int averageCommentPerPost = commentsQuantity/postsQuantity;

    }
    public void showStatistics(){
        System.out.println("Ilość użytkowników to " + usersQuantity + "/n Ilość postów to " + postsQuantity + "/n Ilość komentarzy to " +
        + commentsQuantity + "/n Srednia ilość postów na użytkownika to " + averagePostPerUser + "/n Srednia ilość komentarzy na użytkownika to " +
        + averageCommentPerUser + "/n Srednia ilość komentarzy na post to " + averageCommentPerPost);
    }



}
