class WallService {

    private var posts = emptyArray<Post>()
    private var commentsArray = emptyArray<Comments>()

    fun add(post: Post): Post {

        val changeId = if (posts.size != 0) posts.last().id + 1 else 1
        val postNext = post.copy(id = changeId)
        posts += postNext
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var change = false
        for ((index, value) in posts.withIndex()) {
            if (value.id == post.id) {
                posts[index] = value.copy(
                    ownerId = value.ownerId,
                    date = value.date
                )
                change = true
            }
        }
        return change
    }

    fun createComment(postId: Int, comments: Comments): Comments {
//        try{
//            commentsArray += comments
//            return commentsArray.last()
//        } catch (e:PostNotFoundException){
//            println("Post not exist")
//        }

//        try {
            for ((index, value) in posts.withIndex()) {
                    if (value.id == postId) {
                        commentsArray += comments
                        break
                    } else {throw PostNotFoundException() }
                }
//            } catch (e: PostNotFoundException) {
//            println("Пост не найден")
//        }
//        return result
        return commentsArray.last()
    }

    class PostNotFoundException:Exception()

}
