package X;

/* renamed from: X.7dr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C335977dr extends 0Yk implements 0sI {
    public C335977dr(Object obj) {
        super(5, obj, C52971GgO.class, "createActionBarUiState", "createActionBarUiState(Ljava/util/List;Lcom/instagram/comments/mvvm/data/model/CommentListServerConfigModel;Lcom/instagram/comments/mvvm/data/model/MediaSourceMetadataModel;Z)Lcom/instagram/comments/mvvm/viewmodel/ActionBarUiState;", 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r1 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r0 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        if (r1 == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        if (r0 != null) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r19 = this;
            r0 = r23
            r9 = r22
            r5 = r21
            r4 = r20
            java.util.List r4 = (java.util.List) r4
            X.7aJ r5 = (X.C333887aJ) r5
            X.7a7 r9 = (X.C333777a7) r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            r0 = r19
            java.lang.Object r0 = r0.receiver
            X.GgO r0 = (X.C52971GgO) r0
            X.GmL r6 = r0.A08
            boolean r1 = r6.A0d
            r8 = 0
            if (r1 == 0) goto L_0x0037
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r10 = 0
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x002e
            X.1Xj r8 = r0.BPf()
        L_0x002e:
            X.7cx r7 = new X.7cx
            r11 = r10
            r12 = r10
            r13 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0037:
            boolean r1 = r4.isEmpty()
            r2 = 1
            r3 = r1 ^ 1
            r1 = 0
            if (r3 == 0) goto L_0x0094
            boolean r3 = r6.A0e
            if (r3 == 0) goto L_0x0052
            X.7aO r7 = r0.A0I
            if (r7 == 0) goto L_0x0052
            boolean r3 = r7.A00
            if (r3 != 0) goto L_0x0052
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = r0.A0A
            r3.A0I(r7)
        L_0x0052:
            boolean r3 = X.C52971GgO.A06(r0)
            if (r3 == 0) goto L_0x00c5
            boolean r4 = r6.A0k
            boolean r3 = r6.A0b
            java.lang.Integer r11 = X.C335457cz.A00(r9, r4, r3)
            if (r9 == 0) goto L_0x0092
            boolean r12 = r9.A0f
        L_0x0064:
            boolean r13 = r5.A04
            if (r9 == 0) goto L_0x008f
            boolean r5 = r9.A0S
            com.instagram.model.mediatype.ProductType r4 = r9.A07
        L_0x006c:
            com.instagram.model.mediatype.ProductType r3 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r4 == r3) goto L_0x0071
            r2 = 0
        L_0x0071:
            if (r9 == 0) goto L_0x0075
            boolean r1 = r9.A0a
        L_0x0075:
            if (r5 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            r14 = 1
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r14 = 0
        L_0x007d:
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0087
        L_0x0083:
            X.1Xj r8 = r0.BPf()
        L_0x0087:
            X.7cx r7 = new X.7cx
            r9 = r7
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r7
        L_0x008f:
            r5 = 0
            r4 = r8
            goto L_0x006c
        L_0x0092:
            r12 = 0
            goto L_0x0064
        L_0x0094:
            boolean r4 = r6.A0k
            boolean r3 = r6.A0b
            java.lang.Integer r11 = X.C335457cz.A00(r9, r4, r3)
            if (r9 == 0) goto L_0x00c3
            boolean r12 = r9.A0f
        L_0x00a0:
            boolean r13 = r5.A04
            if (r9 == 0) goto L_0x00c0
            boolean r5 = r9.A0S
            com.instagram.model.mediatype.ProductType r4 = r9.A07
        L_0x00a8:
            com.instagram.model.mediatype.ProductType r3 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r4 == r3) goto L_0x00ad
            r2 = 0
        L_0x00ad:
            if (r9 == 0) goto L_0x00b1
            boolean r1 = r9.A0a
        L_0x00b1:
            if (r5 != 0) goto L_0x00b8
            if (r2 == 0) goto L_0x00b8
            r14 = 1
            if (r1 != 0) goto L_0x00b9
        L_0x00b8:
            r14 = 0
        L_0x00b9:
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0087
            goto L_0x0083
        L_0x00c0:
            r5 = 0
            r4 = r8
            goto L_0x00a8
        L_0x00c3:
            r12 = 0
            goto L_0x00a0
        L_0x00c5:
            int r3 = r4.size()
            X.7cz r7 = X.C335457cz.A00
            com.instagram.common.session.UserSession r11 = r0.A0E
            if (r9 == 0) goto L_0x017b
            boolean r13 = r9.A0f
            boolean r14 = r9.A0e
            boolean r15 = r9.A0c
            X.1sw r8 = r9.A06
        L_0x00d7:
            X.1sw r5 = X.1sw.A04
            r16 = 0
            if (r8 != r5) goto L_0x00df
            r16 = 1
        L_0x00df:
            boolean r5 = r6.A0b
            X.7a0 r10 = r0.A0C
            r0 = 8
            X.0qQ.A0B(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0110
            int r6 = r4.size()
            if (r6 != r2) goto L_0x0123
            java.lang.Object r8 = X.00k.A0I(r4)
            X.7dj r8 = (X.C335907dj) r8
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r12 = r2.A01(r11)
            r18 = r1
            r17 = r5
            java.util.ArrayList r1 = r7.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.addAll(r1)
        L_0x0110:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x011d
            X.IMy r1 = X.C57058IMy.A00
            r0.add(r1)
        L_0x011d:
            X.7cy r7 = new X.7cy
            r7.<init>(r3, r0)
            return r7
        L_0x0123:
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r5 = r2.A01(r11)
            if (r9 == 0) goto L_0x0179
            java.lang.String r2 = r9.A0G
        L_0x012d:
            boolean r2 = X.C335457cz.A01(r5, r2, r4, r13, r14)
            if (r2 == 0) goto L_0x014a
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L_0x015e
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x015e
        L_0x013d:
            int r5 = r4.size()
            r2 = 25
            if (r5 > r2) goto L_0x014a
            X.IMz r2 = X.C57059IMz.A00
            r0.add(r2)
        L_0x014a:
            boolean r2 = r7.A03(r11, r4, r13)
            if (r2 == 0) goto L_0x0110
            X.IMx r2 = X.C57057IMx.A00
            r0.add(r2)
            X.GpR r2 = new X.GpR
            r2.<init>(r1, r1)
            r0.add(r2)
            goto L_0x0110
        L_0x015e:
            java.util.Iterator r6 = r4.iterator()
        L_0x0162:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x013d
            java.lang.Object r2 = r6.next()
            X.7dj r2 = (X.C335907dj) r2
            X.7dd r5 = r2.A07
            boolean r2 = r5.A05
            if (r2 != 0) goto L_0x014a
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L_0x0162
            goto L_0x014a
        L_0x0179:
            r2 = 0
            goto L_0x012d
        L_0x017b:
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335977dr.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
