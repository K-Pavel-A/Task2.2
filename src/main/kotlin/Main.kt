fun main() {

    val post1 = Post(
        id = 1,
        ownerId = 2,
        fromId = 3,
        createdBy = 5656,
        date = 12042022,
        text = "",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = "",
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

    val post2 = Post(
        id = 2,
        ownerId = 3,
        fromId = 4,
        createdBy = 5656,
        date = 12042022,
        text = " ",
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
    val post3 = Post(
        id = 3,
        ownerId = 6,
        fromId = 11,
        createdBy = 5656,
        date = 12042022,
        text = "",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = "news",
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

    val wall = WallService()

    wall.add(post1)
    wall.add(post2)
    wall.add(post3)

    wall.update(post1)
    val newComment = Comments(5,true,true,true,false)

    wall.createComment(2, newComment)
}