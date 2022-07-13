class WallService {

    private var posts = emptyArray<Post>()

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

}
