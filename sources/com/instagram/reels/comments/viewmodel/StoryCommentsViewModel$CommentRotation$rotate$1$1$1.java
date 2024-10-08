package com.instagram.reels.comments.viewmodel;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1$1$1", f = "StoryCommentsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StoryCommentsViewModel$CommentRotation$rotate$1$1$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ boolean A00;

    public StoryCommentsViewModel$CommentRotation$rotate$1$1$1(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? storyCommentsViewModel$CommentRotation$rotate$1$1$1 = new StoryCommentsViewModel$CommentRotation$rotate$1$1$1(r4);
        storyCommentsViewModel$CommentRotation$rotate$1$1$1.A00 = AnonymousClass7TE.A1a(obj);
        return storyCommentsViewModel$CommentRotation$rotate$1$1$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryCommentsViewModel$CommentRotation$rotate$1$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return Boolean.valueOf(!this.A00);
    }
}
