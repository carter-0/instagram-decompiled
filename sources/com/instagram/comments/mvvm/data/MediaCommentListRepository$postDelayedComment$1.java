package com.instagram.comments.mvvm.data;

import X.0sL;
import X.0sP;
import X.1Xl;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass571;
import X.AnonymousClass572;
import X.AnonymousClass7TE;
import X.B1F;
import X.C53285GlX;
import X.C60340gF;
import X.C62320sa;
import X.C66430MRk;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1", f = "MediaCommentListRepository.kt", i = {0, 1, 1, 2}, l = {798, 807, 820}, m = "invokeSuspend", n = {"postDelayedCommentJob", "postDelayedCommentJob", "offensiveScore", "postDelayedCommentJob"}, s = {"L$0", "L$0", "L$5", "L$0"})
public final class MediaCommentListRepository$postDelayedComment$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ CommentGiphyMediaInfo A09;
    public final /* synthetic */ C66430MRk A0A;
    public final /* synthetic */ B1F A0B;
    public final /* synthetic */ MediaCommentListRepository A0C;
    public final /* synthetic */ C53285GlX A0D;
    public final /* synthetic */ AnonymousClass571 A0E;
    public final /* synthetic */ AnonymousClass572 A0F;
    public final /* synthetic */ 1Xl A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ C62320sa A0J;
    public final /* synthetic */ 0sP A0K;
    public final /* synthetic */ boolean A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$postDelayedComment$1(CommentGiphyMediaInfo commentGiphyMediaInfo, C66430MRk mRk, B1F b1f, MediaCommentListRepository mediaCommentListRepository, C53285GlX glX, AnonymousClass571 r7, AnonymousClass572 r8, 1Xl r9, String str, String str2, AnonymousClass4D7 r12, C62320sa r13, 0sP r14, long j, boolean z) {
        super(2, r12);
        this.A0L = z;
        this.A0C = mediaCommentListRepository;
        this.A0D = glX;
        this.A0H = str;
        this.A0G = r9;
        this.A08 = j;
        this.A0I = str2;
        this.A09 = commentGiphyMediaInfo;
        this.A0E = r7;
        this.A0F = r8;
        this.A0J = r13;
        this.A0B = b1f;
        this.A0A = mRk;
        this.A0K = r14;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.4D7, com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r20) {
        boolean z = this.A0L;
        MediaCommentListRepository mediaCommentListRepository = this.A0C;
        C53285GlX glX = this.A0D;
        String str = this.A0H;
        1Xl r9 = this.A0G;
        long j = this.A08;
        String str2 = this.A0I;
        CommentGiphyMediaInfo commentGiphyMediaInfo = this.A09;
        AnonymousClass571 r7 = this.A0E;
        AnonymousClass572 r8 = this.A0F;
        C62320sa r13 = this.A0J;
        ? mediaCommentListRepository$postDelayedComment$1 = new MediaCommentListRepository$postDelayedComment$1(commentGiphyMediaInfo, this.A0A, this.A0B, mediaCommentListRepository, glX, r7, r8, r9, str, str2, r20, r13, this.A0K, j, z);
        mediaCommentListRepository$postDelayedComment$1.A07 = obj;
        return mediaCommentListRepository$postDelayedComment$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.instagram.comments.mvvm.data.MediaCommentListRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.instagram.comments.mvvm.data.MediaCommentListRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: com.instagram.comments.mvvm.data.MediaCommentListRepository} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: com.instagram.comments.mvvm.data.MediaCommentListRepository} */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r13 = r29
            X.1Hj r5 = X.1Hj.A02
            r3 = r28
            int r0 = r3.A00
            r6 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 == r2) goto L_0x00bc
            if (r0 == r7) goto L_0x0132
            java.lang.Object r4 = r3.A07
            X.4Co r4 = (X.C262204Co) r4
            X.0eS.A00(r13)
        L_0x0018:
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = r3.A0C
            java.util.Map r1 = r8.A0E
            X.GlX r0 = r3.A0D
            java.lang.String r9 = r0.A04
            java.lang.Object r0 = r1.get(r9)
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x003d
            java.lang.String r10 = r3.A0I
            r6 = 0
            X.4Cq r0 = r8.A01
            X.JVS r5 = new X.JVS
            r7 = r6
            r11 = r6
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r5, r0)
            r4.EwR()
        L_0x003d:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0040:
            X.0eS.A00(r13)
            java.lang.Object r10 = r3.A07
            X.4Cq r10 = (X.C262224Cq) r10
            boolean r0 = r3.A0L
            if (r0 != 0) goto L_0x006a
            r18 = 0
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = r3.A0C
            X.GlX r8 = r3.A0D
            java.lang.String r4 = r3.A0I
            com.instagram.api.schemas.CommentGiphyMediaInfo r12 = r3.A09
            X.571 r1 = r3.A0E
            X.572 r0 = r3.A0F
            r19 = 7
            X.MHM r11 = new X.MHM
            r17 = r4
            r15 = r8
            r16 = r0
            r13 = r9
            r14 = r1
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.String) r17, (X.AnonymousClass4D7) r18, (int) r19)
            X.AnonymousClass7TE.A1Z(r11, r10)
        L_0x006a:
            r25 = 0
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            X.GlX r13 = r3.A0D
            com.instagram.comments.mvvm.data.MediaCommentListRepository r12 = r3.A0C
            X.1Xl r11 = r3.A0G
            com.instagram.api.schemas.CommentGiphyMediaInfo r0 = r3.A09
            r27 = r0
            X.571 r0 = r3.A0E
            r16 = r0
            X.572 r15 = r3.A0F
            java.lang.String r9 = r3.A0I
            X.0sa r8 = r3.A0J
            X.B1F r4 = r3.A0B
            X.MRk r1 = r3.A0A
            X.MFt r0 = new X.MFt
            r26 = r8
            r23 = r11
            r24 = r9
            r21 = r16
            r22 = r15
            r19 = r12
            r20 = r13
            r17 = r1
            r18 = r4
            r15 = r0
            r16 = r27
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.19B r1 = X.19B.A00
            X.1Er r4 = X.1Eo.A03(r14, r1, r0, r10)
            java.util.Map r1 = r12.A0E
            java.lang.String r0 = r13.A04
            r1.put(r0, r4)
            java.lang.String r1 = r3.A0H
            com.instagram.common.session.UserSession r0 = r12.A0B
            r3.A07 = r4
            r3.A00 = r2
            java.lang.Object r13 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A03(r13, r0, r11, r1, r3)
            if (r13 != r5) goto L_0x00c3
            return r5
        L_0x00bc:
            java.lang.Object r4 = r3.A07
            X.4Co r4 = (X.C262204Co) r4
            X.0eS.A00(r13)
        L_0x00c3:
            X.3Ii r13 = (X.C239803Ii) r13
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = r3.A0C
            X.GlX r11 = r3.A0D
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 == 0) goto L_0x019c
            java.lang.String r10 = r11.A04
            X.4Cq r8 = r9.A01
            r1 = 0
            X.9KW r0 = new X.9KW
            r0.<init>(r9, r10, r1, r2)
            X.AnonymousClass7TE.A1Z(r0, r8)
            X.0gF r0 = X.C60340gF.A00
            X.5sO r13 = new X.5sO
            r13.<init>(r0)
        L_0x00e5:
            r12 = r11
            java.lang.String r8 = r3.A0I
            X.0sP r10 = r3.A0K
            long r0 = r3.A08
            boolean r14 = r13 instanceof X.C239793Ih
            if (r14 == 0) goto L_0x0129
            X.3Ih r13 = (X.C239793Ih) r13
            java.lang.Object r15 = r13.A00
            X.7ft r15 = (X.C337207ft) r15
            boolean r13 = r15.A03
            if (r13 == 0) goto L_0x011b
            java.lang.Integer r14 = r15.A01
            if (r14 == 0) goto L_0x0170
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            if (r13 != r14) goto L_0x0170
            java.lang.String r13 = r11.A04
            r3.A07 = r4
            r3.A02 = r9
            r3.A03 = r11
            r3.A04 = r8
            r3.A05 = r10
            r3.A06 = r15
            r3.A01 = r0
            r3.A00 = r7
            java.lang.Object r13 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A05(r9, r13, r8, r3)
            if (r13 != r5) goto L_0x014f
            return r5
        L_0x011b:
            java.lang.String r8 = r11.A04
            X.4Cq r7 = r9.A01
            r1 = 0
            X.9KW r0 = new X.9KW
            r0.<init>(r9, r8, r1, r2)
            X.AnonymousClass7TE.A1Z(r0, r7)
            goto L_0x0158
        L_0x0129:
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0158
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0132:
            long r0 = r3.A01
            java.lang.Object r15 = r3.A06
            X.7ft r15 = (X.C337207ft) r15
            java.lang.Object r10 = r3.A05
            X.0sP r10 = (X.0sP) r10
            java.lang.Object r8 = r3.A04
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r12 = r3.A03
            X.GlX r12 = (X.C53285GlX) r12
            java.lang.Object r9 = r3.A02
            X.3pa r9 = (X.C252733pa) r9
            java.lang.Object r4 = r3.A07
            X.4Co r4 = (X.C262204Co) r4
            X.0eS.A00(r13)
        L_0x014f:
            boolean r7 = X.AnonymousClass7TE.A1a(r13)
            if (r7 == 0) goto L_0x0170
            r10.invoke(r15)
        L_0x0158:
            long r0 = r3.A08
            r3.A07 = r4
            r7 = 0
            r3.A02 = r7
            r3.A03 = r7
            r3.A04 = r7
            r3.A05 = r7
            r3.A06 = r7
            r3.A00 = r6
            java.lang.Object r0 = X.C241603Pv.A01(r3, r0)
            if (r0 != r5) goto L_0x0018
            return r5
        L_0x0170:
            java.lang.Integer r10 = r15.A01
            if (r10 == 0) goto L_0x0158
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r7 != r10) goto L_0x0158
            X.C357108Wn.A00()
            int r11 = (int) r0
            X.7fu r10 = new X.7fu
            r10.<init>(r11)
            java.lang.String r0 = r12.A04
            X.4Cq r1 = r9.A01
            r20 = 0
            X.JVS r14 = new X.JVS
            r21 = r2
            r19 = r8
            r18 = r0
            r16 = r10
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.19B r0 = X.19B.A00
            X.1Eo.A03(r7, r0, r14, r1)
            goto L_0x0158
        L_0x019c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaCommentListRepository$postDelayedComment$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
