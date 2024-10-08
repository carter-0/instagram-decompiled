package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;

/* renamed from: X.MFt  reason: case insensitive filesystem */
public final class C66156MFt extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66156MFt(CommentGiphyMediaInfo commentGiphyMediaInfo, C66430MRk mRk, B1F b1f, MediaCommentListRepository mediaCommentListRepository, C53285GlX glX, AnonymousClass571 r7, AnonymousClass572 r8, 1Xl r9, String str, AnonymousClass4D7 r11, C62320sa r12) {
        super(2, r11);
        this.A03 = glX;
        this.A0A = mediaCommentListRepository;
        this.A09 = r9;
        this.A07 = commentGiphyMediaInfo;
        this.A04 = r7;
        this.A08 = r8;
        this.A0B = str;
        this.A01 = r12;
        this.A06 = b1f;
        this.A05 = mRk;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MFt, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFt, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        int i = this.A02;
        AnonymousClass4D7 r10 = r14;
        C53285GlX glX = (C53285GlX) this.A03;
        MediaCommentListRepository mediaCommentListRepository = (MediaCommentListRepository) this.A0A;
        1Xl r8 = (1Xl) this.A09;
        CommentGiphyMediaInfo commentGiphyMediaInfo = (CommentGiphyMediaInfo) this.A07;
        AnonymousClass571 r6 = (AnonymousClass571) this.A04;
        AnonymousClass572 r7 = (AnonymousClass572) this.A08;
        String str = this.A0B;
        if (i != 0) {
            B1F b1f = (B1F) this.A06;
            return new C66156MFt(commentGiphyMediaInfo, (C66430MRk) this.A05, b1f, mediaCommentListRepository, glX, r6, r7, r8, str, r10, (C62320sa) this.A01);
        }
        ? mFt = new C66156MFt(commentGiphyMediaInfo, (C66430MRk) this.A05, (B1F) this.A06, mediaCommentListRepository, glX, r6, r7, r8, str, r10);
        mFt.A01 = obj;
        return mFt;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MFt, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r7 = r26
            int r4 = r0.A02
            X.1Hj r1 = X.1Hj.A02
            int r6 = r0.A00
            r2 = 4
            r5 = 3
            r9 = 2
            r3 = 1
            if (r4 == 0) goto L_0x0155
            r4 = 0
            if (r6 == 0) goto L_0x0033
            if (r6 == r3) goto L_0x007c
            if (r6 == r9) goto L_0x00b6
            if (r6 == r5) goto L_0x0102
            X.0eS.A00(r7)
        L_0x001c:
            java.lang.Object r1 = r0.A01
            X.DbS.A1U(r1)
            java.lang.Object r1 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            java.util.Map r1 = r1.A0E
            java.lang.Object r0 = r0.A03
            X.GlX r0 = (X.C53285GlX) r0
            java.lang.String r0 = r0.A04
            r1.remove(r0)
        L_0x0030:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0033:
            X.0eS.A00(r7)
            java.lang.Object r14 = r0.A03
            X.GlX r14 = (X.C53285GlX) r14
            boolean r7 = r14.A05
            java.lang.Object r6 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r6
            if (r7 == 0) goto L_0x0082
            com.instagram.common.session.UserSession r15 = r6.A0B
            X.7a5 r7 = r6.A05
            X.1Xl r7 = r7.A00
            if (r7 == 0) goto L_0x0079
            X.1Xj r18 = r7.BPf()
        L_0x004e:
            java.lang.String r10 = r6.A0D
            java.lang.Object r9 = r0.A09
            X.1Xl r9 = (X.1Xl) r9
            X.GmL r13 = r6.A04
            java.lang.Object r12 = r0.A07
            com.instagram.api.schemas.CommentGiphyMediaInfo r12 = (com.instagram.api.schemas.CommentGiphyMediaInfo) r12
            java.lang.Object r8 = r0.A04
            X.571 r8 = (X.AnonymousClass571) r8
            java.lang.Object r7 = r0.A08
            X.572 r7 = (X.AnonymousClass572) r7
            java.lang.String r6 = r0.A0B
            r0.A00 = r3
            r17 = r7
            r19 = r9
            r20 = r10
            r21 = r6
            r22 = r0
            r16 = r8
            java.lang.Object r7 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r7 != r1) goto L_0x007f
            return r1
        L_0x0079:
            r18 = r4
            goto L_0x004e
        L_0x007c:
            X.0eS.A00(r7)
        L_0x007f:
            X.3Ii r7 = (X.C239803Ii) r7
            goto L_0x00bb
        L_0x0082:
            com.instagram.common.session.UserSession r13 = r6.A0B
            java.lang.String r12 = r6.A0D
            java.lang.Object r11 = r0.A09
            X.1Xl r11 = (X.1Xl) r11
            X.GmL r10 = r6.A04
            java.lang.Object r8 = r0.A07
            com.instagram.api.schemas.CommentGiphyMediaInfo r8 = (com.instagram.api.schemas.CommentGiphyMediaInfo) r8
            java.lang.Object r7 = r0.A04
            X.571 r7 = (X.AnonymousClass571) r7
            java.lang.Object r6 = r0.A08
            X.572 r6 = (X.AnonymousClass572) r6
            java.lang.String r3 = r0.A0B
            r0.A00 = r9
            r15 = r8
            r16 = r10
            r17 = r14
            r18 = r13
            r19 = r7
            r20 = r6
            r21 = r11
            r22 = r12
            r23 = r3
            r24 = r0
            java.lang.Object r7 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r7 != r1) goto L_0x00b9
            return r1
        L_0x00b6:
            X.0eS.A00(r7)
        L_0x00b9:
            X.3Ii r7 = (X.C239803Ii) r7
        L_0x00bb:
            java.lang.Object r11 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r11 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r11
            java.lang.Object r12 = r0.A03
            X.GlX r12 = (X.C53285GlX) r12
            java.lang.String r10 = r0.A0B
            java.lang.Object r9 = r0.A06
            X.B1F r9 = (X.B1F) r9
            boolean r3 = r7 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x00f9
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r8 = r7.A00
            X.JwJ r8 = (X.C61081JwJ) r8
            if (r8 == 0) goto L_0x0105
            java.lang.String r7 = r12.A04
            X.GmL r3 = r11.A04
            boolean r6 = r3.A0b
            X.7a4 r3 = r12.A02
            if (r3 == 0) goto L_0x00f6
            java.util.List r17 = r3.A00()
        L_0x00e3:
            r0.A00 = r5
            r19 = r6
            r12 = r8
            r13 = r9
            r14 = r11
            r15 = r7
            r16 = r10
            r18 = r0
            java.lang.Object r3 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto L_0x0105
            return r1
        L_0x00f6:
            r17 = r4
            goto L_0x00e3
        L_0x00f9:
            boolean r3 = r7 instanceof X.C297815sO
            if (r3 != 0) goto L_0x0109
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0102:
            X.0eS.A00(r7)
        L_0x0105:
            X.3Ih r7 = X.C51967G9n.A0d()
        L_0x0109:
            java.lang.Object r13 = r0.A05
            X.MRk r13 = (X.C66430MRk) r13
            java.lang.Object r5 = r0.A03
            X.GlX r5 = (X.C53285GlX) r5
            java.lang.Object r12 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r12 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r12
            java.lang.String r11 = r0.A0B
            boolean r3 = r7 instanceof X.C239793Ih
            if (r3 != 0) goto L_0x001c
            boolean r3 = r7 instanceof X.C297815sO
            if (r3 == 0) goto L_0x027b
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r10 = r7.A00
            X.7fv r10 = (X.C337227fv) r10
            if (r10 == 0) goto L_0x0153
            boolean r9 = r10.A09
        L_0x0129:
            java.lang.String r8 = r5.A04
            java.lang.String r7 = r5.A03
            if (r10 == 0) goto L_0x014f
            java.lang.String r6 = r10.A06
            java.lang.String r5 = r10.A05
            java.util.List r3 = r10.A08
            java.lang.Integer r4 = r10.A03
        L_0x0137:
            r14 = r4
            r15 = r8
            r16 = r7
            r17 = r6
            r18 = r5
            r19 = r3
            r20 = r9
            r13.AUc(r14, r15, r16, r17, r18, r19, r20)
            r0.A00 = r2
            java.lang.Object r2 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A02(r12, r10, r8, r11, r0)
            if (r2 != r1) goto L_0x001c
            return r1
        L_0x014f:
            r6 = r4
            r5 = r4
            r3 = r4
            goto L_0x0137
        L_0x0153:
            r9 = 0
            goto L_0x0129
        L_0x0155:
            if (r6 == 0) goto L_0x0162
            if (r6 == r3) goto L_0x01e7
            if (r6 == r9) goto L_0x01e7
            if (r6 == r5) goto L_0x0233
            X.0eS.A00(r7)
            goto L_0x0030
        L_0x0162:
            X.0eS.A00(r7)
            java.lang.Object r6 = r0.A01
            X.4Cq r6 = (X.C262224Cq) r6
            r20 = 0
            java.lang.Object r12 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r12 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r12
            java.lang.Object r11 = r0.A03
            X.GlX r11 = (X.C53285GlX) r11
            java.lang.String r10 = r0.A0B
            java.lang.Object r14 = r0.A07
            com.instagram.api.schemas.CommentGiphyMediaInfo r14 = (com.instagram.api.schemas.CommentGiphyMediaInfo) r14
            java.lang.Object r8 = r0.A04
            X.571 r8 = (X.AnonymousClass571) r8
            java.lang.Object r7 = r0.A08
            X.572 r7 = (X.AnonymousClass572) r7
            r21 = 6
            X.MHM r4 = new X.MHM
            r13 = r4
            r15 = r12
            r16 = r8
            r17 = r11
            r18 = r7
            r19 = r10
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.String) r19, (X.AnonymousClass4D7) r20, (int) r21)
            X.AnonymousClass7TE.A1Z(r4, r6)
            boolean r4 = r11.A05
            com.instagram.common.session.UserSession r6 = r12.A0B
            if (r4 == 0) goto L_0x01c7
            X.7a5 r4 = r12.A05
            X.1Xl r4 = r4.A00
            if (r4 == 0) goto L_0x01a5
            X.1Xj r20 = r4.BPf()
        L_0x01a5:
            java.lang.String r13 = r12.A0D
            java.lang.Object r9 = r0.A09
            X.1Xl r9 = (X.1Xl) r9
            X.GmL r4 = r12.A04
            r0.A00 = r3
            r15 = r4
            r16 = r11
            r17 = r6
            r18 = r8
            r19 = r7
            r21 = r9
            r22 = r13
            r23 = r10
            r24 = r0
            java.lang.Object r7 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x01c4:
            if (r7 != r1) goto L_0x01ea
            return r1
        L_0x01c7:
            java.lang.String r13 = r12.A0D
            java.lang.Object r4 = r0.A09
            X.1Xl r4 = (X.1Xl) r4
            X.GmL r3 = r12.A04
            r0.A00 = r9
            r15 = r3
            r16 = r11
            r17 = r6
            r18 = r8
            r19 = r7
            r20 = r4
            r21 = r13
            r22 = r10
            r23 = r0
            java.lang.Object r7 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01c4
        L_0x01e7:
            X.0eS.A00(r7)
        L_0x01ea:
            X.3Ii r7 = (X.C239803Ii) r7
            java.lang.Object r11 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r11 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r11
            java.lang.Object r10 = r0.A03
            X.GlX r10 = (X.C53285GlX) r10
            java.lang.String r9 = r0.A0B
            java.lang.Object r8 = r0.A06
            X.B1F r8 = (X.B1F) r8
            boolean r3 = r7 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x022a
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r7 = r7.A00
            X.JwJ r7 = (X.C61081JwJ) r7
            if (r7 == 0) goto L_0x0236
            java.lang.String r6 = r10.A04
            X.GmL r3 = r11.A04
            boolean r4 = r3.A0b
            X.7a4 r3 = r10.A02
            if (r3 == 0) goto L_0x0227
            java.util.List r17 = r3.A00()
        L_0x0214:
            r0.A00 = r5
            r19 = r4
            r12 = r7
            r13 = r8
            r14 = r11
            r15 = r6
            r16 = r9
            r18 = r0
            java.lang.Object r3 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != r1) goto L_0x0236
            return r1
        L_0x0227:
            r17 = 0
            goto L_0x0214
        L_0x022a:
            boolean r3 = r7 instanceof X.C297815sO
            if (r3 != 0) goto L_0x023a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0233:
            X.0eS.A00(r7)
        L_0x0236:
            X.3Ih r7 = X.C51967G9n.A0d()
        L_0x023a:
            java.lang.Object r8 = r0.A05
            X.MRk r8 = (X.C66430MRk) r8
            java.lang.Object r6 = r0.A03
            X.GlX r6 = (X.C53285GlX) r6
            java.lang.Object r5 = r0.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            java.lang.String r4 = r0.A0B
            boolean r3 = r7 instanceof X.C239793Ih
            if (r3 != 0) goto L_0x0030
            boolean r3 = r7 instanceof X.C297815sO
            if (r3 == 0) goto L_0x0280
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r3 = r7.A00
            X.7fv r3 = (X.C337227fv) r3
            if (r3 == 0) goto L_0x0279
            boolean r15 = r3.A09
        L_0x025a:
            java.lang.String r10 = r6.A04
            java.lang.String r11 = r6.A03
            if (r3 == 0) goto L_0x0274
            java.lang.String r12 = r3.A06
            java.lang.String r13 = r3.A05
            java.util.List r14 = r3.A08
            java.lang.Integer r9 = r3.A03
        L_0x0268:
            r8.AUc(r9, r10, r11, r12, r13, r14, r15)
            r0.A00 = r2
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A02(r5, r3, r10, r4, r0)
            if (r0 != r1) goto L_0x0030
            return r1
        L_0x0274:
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = 0
            goto L_0x0268
        L_0x0279:
            r15 = 0
            goto L_0x025a
        L_0x027b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0280:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66156MFt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66156MFt) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66156MFt(CommentGiphyMediaInfo commentGiphyMediaInfo, C66430MRk mRk, B1F b1f, MediaCommentListRepository mediaCommentListRepository, C53285GlX glX, AnonymousClass571 r7, AnonymousClass572 r8, 1Xl r9, String str, AnonymousClass4D7 r11) {
        super(2, r11);
        this.A03 = glX;
        this.A0A = mediaCommentListRepository;
        this.A09 = r9;
        this.A07 = commentGiphyMediaInfo;
        this.A04 = r7;
        this.A08 = r8;
        this.A0B = str;
        this.A06 = b1f;
        this.A05 = mRk;
    }
}
