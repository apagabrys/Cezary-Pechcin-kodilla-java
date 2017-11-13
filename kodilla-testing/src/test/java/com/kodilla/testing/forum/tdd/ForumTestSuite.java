package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForumTestSuite {
    private static int testCounter=0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of the test.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");

        //When
        forumUser.addPost("the Crazy One", "Hello everyone. Get the fuck out of my forum!");

        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());
    }
    @Test
    public void testAddComment(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");

        //When
        forumUser.addComment(thePost, "the Crazy One", "Just kidding.");

        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());
    }

    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");
        ForumComment theComment = new ForumComment(thePost, "Just kidding.", "the Crazy One");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment retrievedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");
        ForumComment theComment = new ForumComment(thePost, "Just kidding.", "the Crazy One");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostQuantity());
    }

    @Test
    public void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("the Crazy One", "John Snow");
        ForumPost thePost = new ForumPost("Hello everyone. Get the fuck out of my forum!", "the Crazy One");
        ForumComment theComment = new ForumComment(thePost, "Just kidding.", "the Crazy One");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostQuantity());
    }


}


