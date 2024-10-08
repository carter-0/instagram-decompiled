package com.instagram.barcelona.feed.post.data;

import X.AnonymousClass43D;
import X.C252733pa;
import com.instagram.common.session.UserSession;

public final class PostRepository extends C252733pa {
    public final UserSession A00;
    public final PostViewStateRepository A01;

    public PostRepository(PostViewStateRepository postViewStateRepository, UserSession userSession) {
        super("Barcelona_post", AnonymousClass43D.A00(1682293663));
        this.A00 = userSession;
        this.A01 = postViewStateRepository;
    }
}
