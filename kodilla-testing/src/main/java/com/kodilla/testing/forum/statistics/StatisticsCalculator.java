package com.kodilla.testing.forum.statistics;


public class StatisticsCalculator {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getAverageCommentPerUser() {
        return averageCommentPerUser;
    }

    public double getAverageCommentPerPost() {
        return averageCommentPerPost;
    }



    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(statistics.userNames().size()!= 0) {
            averagePostPerUser = (double)postsQuantity / (double)usersQuantity;
            averageCommentPerUser = (double)commentsQuantity / (double)usersQuantity;
        }else{
            averagePostPerUser = 0;
            averageCommentPerUser = 0;
        }
        if(statistics.postsCount()!=0) {
            averageCommentPerPost = (double)commentsQuantity / (double)postsQuantity;
        }else{
            averageCommentPerPost = 0;
        }
    }
    public void showStatistics(){
        System.out.println("Ilość użytkowników to " + usersQuantity + "/n Ilość postów to " + postsQuantity + "/n Ilość komentarzy to " +
        + commentsQuantity + "/n Srednia ilość postów na użytkownika to " + averagePostPerUser + "/n Srednia ilość komentarzy na użytkownika to " +
        + averageCommentPerUser + "/n Srednia ilość komentarzy na post to " + averageCommentPerPost);
    }



}
