package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void test1000Posts0Comments(){
        //Given
        Statistics statisticsMock = mock (Statistics.class);
        List<String> users = new ArrayList<String>();
        users.add("Roko");
        users.add("Czoko");
        users.add("Moko");

        int postsCounter = 1000;
        int commentsCounter = 0;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(333.33, statisticsCalculator.getAveragePostPerUser(), 0.01);
        Assert.assertEquals(0.0, statisticsCalculator.getAverageCommentPerUser(), 0.01);
        Assert.assertEquals(0.0, statisticsCalculator.getAverageCommentPerPost(), 0.01);
    }
    @Test
    public void test0Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCounter = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getAveragePostPerUser(), 0.01);
    }
    @Test
    public void testCommentsGreaterThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCounter = 1;
        int commentsCounter = 2;
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2.0, statisticsCalculator.getAverageCommentPerPost(), 0.01);
    }
    @Test
    public void testPostsGreaterThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCounter = 2;
        int commentsCounter = 1;
        when(statisticsMock.postsCount()).thenReturn(postsCounter);
        when(statisticsMock.commentsCount()).thenReturn(commentsCounter);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, statisticsCalculator.getAverageCommentPerPost(), 0.01);
    }
    @Test
    public void test0Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = Collections.nCopies(1000, "Czarek");
        int postCounter = 1000;
        when(statisticsMock.userNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1.0, statisticsCalculator.getAveragePostPerUser(), 0.01);
    }
    @Test
    public void test1000Users(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = Collections.emptyList();
        int postCounter = 0;
        when(statisticsMock.userNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getAveragePostPerUser(), 0.01);
    }
}

