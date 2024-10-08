package com.instagram.comments.mvvm.data;

import X.0sL;
import X.1Xl;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1", f = "MediaCommentListRepository.kt", i = {0, 0, 0, 1, 1}, l = {965, 972, 979}, m = "invokeSuspend", n = {"mediaSourceMetadata", "commentRow", "commentLikeActionUUID", "commentRow", "commentLikeActionUUID"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
public final class MediaCommentListRepository$likeCommentAction$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ MediaCommentListRepository A04;
    public final /* synthetic */ 1Xl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$likeCommentAction$1(MediaCommentListRepository mediaCommentListRepository, 1Xl r3, String str, String str2, AnonymousClass4D7 r6, boolean z, boolean z2) {
        super(2, r6);
        this.A05 = r3;
        this.A04 = mediaCommentListRepository;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = z;
        this.A09 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        return new MediaCommentListRepository$likeCommentAction$1(this.A04, this.A05, this.A07, this.A06, r10, this.A08, this.A09);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r25
            X.1Hj r2 = X.1Hj.A02
            r3 = r24
            int r4 = r3.A00
            r17 = 3
            r16 = 2
            r6 = 0
            r12 = 1
            if (r4 == 0) goto L_0x001c
            if (r4 == r12) goto L_0x00b7
            r0 = r16
            if (r4 == r0) goto L_0x00e5
            X.0eS.A00(r1)
        L_0x0019:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x001c:
            X.0eS.A00(r1)
            X.1Xl r0 = r3.A05
            X.1Xj r1 = r0.BPf()
            com.instagram.comments.mvvm.data.MediaCommentListRepository r13 = r3.A04
            com.instagram.common.session.UserSession r0 = r13.A0B
            X.7a7 r9 = X.C333767a6.A00(r0, r1)
            X.0Ud r0 = r13.A0L
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            java.lang.String r11 = r3.A07
            java.lang.String r10 = r3.A06
            X.7dj r7 = X.C335067cK.A01(r0, r11, r10)
            java.lang.String r8 = X.AnonymousClass7TG.A0j()
            X.7a8 r1 = r13.A02
            if (r1 == 0) goto L_0x0076
            boolean r0 = r3.A08
            r18 = r0
            X.1QP r15 = r1.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            r0 = 1549(0x60d, float:2.17E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "comment_post_click"
            long r4 = r15.A00(r5, r4, r0)
            java.util.concurrent.ConcurrentHashMap r14 = r1.A02
            boolean r0 = r14.contains(r8)
            if (r0 == 0) goto L_0x009f
            X.0wj r4 = X.0wj.A01
            r1 = 817896325(0x30c01b85, float:1.397766E-9)
            java.lang.String r0 = "comment_user_flow_logging"
            X.0f9 r4 = r4.AEf(r0, r1)
            java.lang.String r1 = "like_comment_flow"
            java.lang.String r0 = "Attempting to start a marker that has already started."
            r4.ABQ(r1, r0)
            r4.report()
        L_0x0076:
            if (r7 == 0) goto L_0x0019
            boolean r0 = r7.A0S
            boolean r1 = r3.A08
            if (r0 != r1) goto L_0x0019
            r4 = r1 ^ 1
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x009c
            boolean r0 = X.AnonymousClass7TF.A1Q(r1)
        L_0x0088:
            r3.A01 = r9
            r3.A02 = r7
            r3.A03 = r8
            r3.A00 = r12
            X.AyC r1 = new X.AyC
            r1.<init>(r11, r10, r4, r0)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r13, r3, r1)
            if (r0 != r2) goto L_0x00c6
            return r2
        L_0x009c:
            boolean r0 = r7.A0T
            goto L_0x0088
        L_0x009f:
            java.lang.String r0 = "mvvm_comments"
            r15.flowAnnotate(r4, r0, r12)
            r0 = 3467(0xd8b, float:4.858E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1 = r18
            r15.flowAnnotate(r4, r0, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r14.put(r8, r0)
            goto L_0x0076
        L_0x00b7:
            java.lang.Object r8 = r3.A03
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r3.A02
            X.7dj r7 = (X.C335907dj) r7
            java.lang.Object r9 = r3.A01
            X.7a7 r9 = (X.C333777a7) r9
            X.0eS.A00(r1)
        L_0x00c6:
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r3.A04
            com.instagram.common.session.UserSession r5 = r0.A0B
            java.lang.String r4 = r0.A0D
            X.GmL r1 = r0.A04
            r3.A01 = r7
            r3.A02 = r8
            r3.A03 = r6
            r0 = r16
            r3.A00 = r0
            r13 = r5
            r14 = r4
            r15 = r3
            r10 = r1
            r11 = r7
            r12 = r9
            java.lang.Object r1 = com.instagram.comments.mvvm.data.network.LikeActionNetworkRequestsKt.A00(r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L_0x00f0
            return r2
        L_0x00e5:
            java.lang.Object r8 = r3.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r3.A01
            X.7dj r7 = (X.C335907dj) r7
            X.0eS.A00(r1)
        L_0x00f0:
            X.3Ii r1 = (X.C239803Ii) r1
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = r3.A04
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0159
            X.7a8 r4 = r9.A02
            if (r4 == 0) goto L_0x0157
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.concurrent.ConcurrentHashMap r1 = r4.A02
            java.lang.String r0 = "successful_like_comment"
            X.C333787a8.A01(r4, r8, r0, r1)
            X.0gF r0 = X.C60340gF.A00
        L_0x0109:
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x010e:
            java.lang.String r10 = r3.A07
            java.lang.String r5 = r3.A06
            boolean r4 = r3.A08
            boolean r12 = r3.A09
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0019
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0162
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r11 = r1.A00
            java.lang.String r11 = (java.lang.String) r11
            X.7a8 r1 = r9.A02
            if (r1 == 0) goto L_0x013d
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A02
            java.lang.String r20 = "like_comment_fail"
            r19 = r8
            r21 = r6
            r22 = r11
            r23 = r0
            r18 = r1
            X.C333787a8.A00(r18, r19, r20, r21, r22, r23)
        L_0x013d:
            if (r12 == 0) goto L_0x0154
            r1 = r4
        L_0x0140:
            r3.A01 = r6
            r3.A02 = r6
            r0 = r17
            r3.A00 = r0
            X.AyC r0 = new X.AyC
            r0.<init>(r10, r5, r4, r1)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r9, r3, r0)
            if (r0 != r2) goto L_0x0019
            return r2
        L_0x0154:
            boolean r1 = r7.A0T
            goto L_0x0140
        L_0x0157:
            r0 = r6
            goto L_0x0109
        L_0x0159:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x010e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0162:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository$likeCommentAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaCommentListRepository$likeCommentAction$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
