package com.instagram.comments.mvvm.data;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C376979Kb;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$locallyHideComment$1", f = "MediaCommentListRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaCommentListRepository$locallyHideComment$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ MediaCommentListRepository A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$locallyHideComment$1(MediaCommentListRepository mediaCommentListRepository, String str, String str2, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A01 = mediaCommentListRepository;
        this.A03 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.mvvm.data.MediaCommentListRepository$locallyHideComment$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        ? mediaCommentListRepository$locallyHideComment$1 = new MediaCommentListRepository$locallyHideComment$1(this.A01, this.A03, this.A02, r6);
        mediaCommentListRepository$locallyHideComment$1.A00 = obj;
        return mediaCommentListRepository$locallyHideComment$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaCommentListRepository$locallyHideComment$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        AnonymousClass7TE.A1Z(new C376979Kb(this.A01, this.A03, this.A02, (AnonymousClass4D7) null, 0), (C262224Cq) this.A00);
        return C60340gF.A00;
    }
}
