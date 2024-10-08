package com.instagram.comments.request;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C334157al;
import X.C53383GnF;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.request.CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1", f = "CommentsFetcher.kt", i = {}, l = {422}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C53383GnF A02;
    public final /* synthetic */ CommentsFetcher A03;
    public final /* synthetic */ C334157al A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1(C53383GnF gnF, CommentsFetcher commentsFetcher, C334157al r4, AnonymousClass4D7 r5, long j, boolean z, boolean z2) {
        super(2, r5);
        this.A03 = commentsFetcher;
        this.A04 = r4;
        this.A02 = gnF;
        this.A06 = z;
        this.A05 = z2;
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.request.CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        CommentsFetcher commentsFetcher = this.A03;
        C334157al r3 = this.A04;
        return new CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1(this.A02, commentsFetcher, r3, r11, this.A01, this.A06, this.A05);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1Hj r2 = X.1Hj.A02
            r6 = r11
            int r1 = r11.A00
            r0 = 1
            if (r1 == 0) goto L_0x000e
            X.0eS.A00(r12)
        L_0x000b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x000e:
            X.0eS.A00(r12)
            com.instagram.comments.request.CommentsFetcher r4 = r11.A03
            X.7al r5 = r11.A04
            X.GnF r3 = r11.A02
            boolean r9 = r11.A06
            boolean r10 = r11.A05
            long r7 = r11.A01
            r11.A00 = r0
            java.lang.Object r0 = com.instagram.comments.request.CommentsFetcher.A00(r3, r4, r5, r6, r7, r9, r10)
            if (r0 != r2) goto L_0x000b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.request.CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentsFetcher$launchFetchJobAndMaybeAddToOngoingPrefetchJobMap$job$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
