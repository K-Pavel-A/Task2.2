import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_PostsNotZero() {
        val wall = WallService()
        val post = Post(
            id = 0,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )

        wall.add(post)
        val result = wall.add(post).id
        assertTrue(result > 0)
    }

    @Test
    fun update_postExist() {
        val wall = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )

        wall.add(post1)

        val update = Post(
            id =1,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )

        val result = wall.update(update)
        assertTrue(result)
    }

    @Test
    fun update_postsNotExist() {
        val wall = WallService()
        val post1 = Post(
            id = 0,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )

        wall.add(post1)

        val update = Post(
            id = 6,
            ownerId = 666,
            fromId = 111,
            createdBy = 5656,
            date = 12042022,
            text = "Sun shine and it is okey",
            replyOwnerId = 7890,
            replyPostId = 2346,
            friendsOnly = false,
            comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
            copyright = "newspaper Pravda",
            likes = Likes(count = 25, userLikes = true, canLike = false, canPublish = true),
            reposts = Reposts(count = 3, userReposted = true),
            viewsCount = 15,
            postType = "post",
            signerId = 8965,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            postponedId = 0
        )
        val result = wall.update(update)
        assertFalse(result)
    }
}