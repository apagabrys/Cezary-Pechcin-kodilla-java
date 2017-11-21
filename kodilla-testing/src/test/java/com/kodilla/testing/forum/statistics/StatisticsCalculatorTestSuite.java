package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test
    public void test1000Posts(){
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
}
