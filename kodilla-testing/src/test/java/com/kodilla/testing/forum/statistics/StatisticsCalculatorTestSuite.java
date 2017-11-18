package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock1000Posts(){
        //Given
        ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
        LinkedList<ForumComment> comments = new LinkedList<ForumComment>();
        ForumUser forumUser = new ForumUser("Tymon", "John Snow");
        ForumUser forumUser1 = new ForumUser("Dymon", "John");
        ForumPost thePost = new ForumPost("Hello everyone.", "Tymon");
        ForumPost thePost1 = new ForumPost("Halko.", "Dymon");
        for(int i=0;i<999;i++){
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        }
        forumUser1.addPost(thePost1.getAuthor(), thePost1.getPostBody());
        Statistics statisticsMock = mock (Statistics.class);
        List<String> users = new ArrayList<String>();
        for (int j=0; j<99; j++) {
            users.add(forumUser.toString());
            users.add(forumUser1.toString());
        }
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(comments.size());
        when(statisticsMock.postsCount()).thenReturn(posts.size());
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        int quantityOfUsers = statisticsCalculator.calculateAdvStatistics();
        //Then
        Assert.assertEquals(1000, quantityOfUsers);
    }
}
