package X;

public final class P8W implements AnonymousClass7DW {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public P8W(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A06 = obj4;
        this.A04 = obj6;
        this.A01 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A02 = obj5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.NVH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: X.NVH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: X.P8i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: X.P9n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.P9h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: X.PA2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.NVI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.P8h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: X.P9o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.P9f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: X.PA1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.NVH} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (X.AnonymousClass9HV.A00(r7).A00(X.C66580MXl.A0g(r8), 7) == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0133, code lost:
        if (r0.BCL() != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0168, code lost:
        if (X.AnonymousClass9HV.A00(r10).A00(X.C66580MXl.A0g(r12), 7) == false) goto L_0x016a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DRg(android.view.MotionEvent r38, java.lang.Object r39, boolean r40) {
        /*
            r37 = this;
            r1 = r37
            r0 = r39
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x00de;
                case 1: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            X.NVI r0 = (X.NVI) r0
            java.lang.Object r5 = r1.A06
            X.OIO r5 = (X.OIO) r5
            java.util.List r3 = r0.A06
            java.lang.Object r2 = X.00k.A0I(r3)
            X.GnV r2 = (X.C53398GnV) r2
            java.lang.String r2 = r2.A04
            r5.A01 = r2
            X.3lr r3 = X.C66583MXo.A0K(r3)
            r13 = 0
            if (r3 == 0) goto L_0x00db
            java.lang.String r2 = "igid"
            java.lang.String r2 = r3.A08(r2)
        L_0x0029:
            r5.A02 = r2
            java.lang.Object r4 = r1.A04
            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
            java.lang.String r8 = r4.A00
            java.lang.Object r6 = r1.A01
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r7 = r1.A05
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r2 = r1.A03
            X.NKo r2 = (X.C68495NKo) r2
            java.lang.String r9 = r2.A0J
            X.Bmm r3 = r0.A01
            if (r3 == 0) goto L_0x0049
            java.lang.String r2 = "igid"
            java.lang.String r13 = r3.A08(r2)
        L_0x0049:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 0
            long r2 = r10.toMicros(r2)
            java.lang.String r14 = X.AnonymousClass7F5.A00(r6, r2)
            if (r8 == 0) goto L_0x0068
            X.9HW r10 = X.AnonymousClass9HV.A00(r7)
            X.3t0 r3 = X.C66580MXl.A0g(r8)
            r2 = 7
            boolean r2 = r10.A00(r3, r2)
            r16 = 1
            if (r2 != 0) goto L_0x006a
        L_0x0068:
            r16 = 0
        L_0x006a:
            r35 = 0
            java.lang.String r15 = r5.A0G
            r10 = r6
            r11 = r7
            r12 = r9
            r17 = r35
            r18 = r35
            java.util.ArrayList r33 = X.C71127OdQ.A05(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r2 = r33.isEmpty()
            if (r2 != 0) goto L_0x0009
            X.MuF r2 = r5.A0A
            java.lang.String r3 = r0.A05
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r2 = r2.A06
            X.05G r2 = r2.A06
            r2.Epw(r3)
            X.Ocl r16 = X.C71107Ocl.A00
            java.lang.String r14 = r4.A01
            java.lang.Object r9 = r1.A02
            X.7ST r9 = (X.AnonymousClass7ST) r9
            android.graphics.PointF r18 = X.C66584MXp.A08(r38)
            X.0eK r1 = r5.A0H
            java.lang.Object r2 = X.C66580MXl.A0s(r1)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            android.graphics.PointF r1 = X.C66584MXp.A08(r38)
            android.view.View r19 = X.C70866OPf.A00(r1, r2)
            X.P9o r3 = new X.P9o
            r3.<init>(r5)
            X.P8h r13 = r5.A08
            X.P9d r12 = r5.A04
            X.PA1 r11 = r5.A05
            X.P9f r2 = r5.A09
            r10 = 4
            X.PQr r1 = new X.PQr
            r1.<init>(r5, r10)
            X.0sn r34 = X.0sn.A00
            r29 = r1
            r30 = r8
            r31 = r14
            r32 = r15
            r36 = r35
            r22 = r13
            r23 = r3
            r24 = r12
            r25 = r2
            r26 = r9
            r27 = r11
            r28 = r4
            r20 = r7
            r21 = r0
            r17 = r6
            goto L_0x0214
        L_0x00db:
            r2 = r13
            goto L_0x0029
        L_0x00de:
            X.NVH r0 = (X.NVH) r0
            java.lang.Object r4 = r1.A06
            X.OIT r4 = (X.OIT) r4
            X.N3F r3 = r0.A01
            java.lang.String r2 = r3.A05
            r4.A03 = r2
            com.instagram.user.model.User r8 = r3.A02
            r16 = 0
            if (r8 == 0) goto L_0x0195
            java.lang.String r2 = r8.getId()
        L_0x00f4:
            r4.A02 = r2
            X.N37 r2 = r3.A00
            if (r2 == 0) goto L_0x0191
            java.lang.Integer r2 = r2.A04
        L_0x00fc:
            X.1iA r2 = X.1i9.A00(r2)
            r4.A01 = r2
            java.lang.Integer r7 = r0.A07
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            boolean r2 = X.C51969G9p.A1a(r7, r2)
            r4.A04 = r2
            java.lang.Object r5 = r1.A04
            com.instagram.model.direct.DirectThreadKey r5 = (com.instagram.model.direct.DirectThreadKey) r5
            java.lang.String r12 = r5.A00
            java.lang.String r11 = r4.A0K
            java.lang.String r2 = "questions"
            boolean r2 = X.0qQ.A0K(r11, r2)
            if (r2 == 0) goto L_0x0186
            com.instagram.common.session.UserSession r9 = r4.A09
            X.0Tu r6 = X.0Tu.A05
            r2 = 36319407392365865(0x81084f00131d29, double:3.0318777092226246E-306)
            boolean r36 = X.182.A06(r6, r9, r2)
        L_0x0129:
            boolean r2 = r4.A0M
            if (r2 == 0) goto L_0x0135
            boolean r2 = r0.BCL()
            r35 = 1
            if (r2 == 0) goto L_0x0137
        L_0x0135:
            r35 = 0
        L_0x0137:
            java.lang.Object r6 = r1.A01
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r10 = r1.A05
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r2 = r1.A03
            X.NKo r2 = (X.C68495NKo) r2
            java.lang.String r9 = r2.A0J
            if (r8 == 0) goto L_0x014b
            java.lang.String r16 = r8.getId()
        L_0x014b:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.A00
            long r2 = r8.toMicros(r2)
            java.lang.String r17 = X.AnonymousClass7F5.A00(r6, r2)
            if (r12 == 0) goto L_0x016a
            X.9HW r8 = X.AnonymousClass9HV.A00(r10)
            X.3t0 r3 = X.C66580MXl.A0g(r12)
            r2 = 7
            boolean r2 = r8.A00(r3, r2)
            r19 = 1
            if (r2 != 0) goto L_0x016c
        L_0x016a:
            r19 = 0
        L_0x016c:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            boolean r20 = X.AnonymousClass7TF.A1W(r7, r2)
            r13 = r6
            r14 = r10
            r15 = r9
            r18 = r11
            r21 = r36
            java.util.ArrayList r33 = X.C71127OdQ.A05(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r35 != 0) goto L_0x0199
            boolean r2 = r33.isEmpty()
            if (r2 == 0) goto L_0x0199
            return
        L_0x0186:
            java.lang.String r2 = "challenges"
            boolean r2 = X.0qQ.A0K(r11, r2)
            boolean r36 = X.AnonymousClass7TF.A1P(r2)
            goto L_0x0129
        L_0x0191:
            r2 = r16
            goto L_0x00fc
        L_0x0195:
            r2 = r16
            goto L_0x00f4
        L_0x0199:
            X.MuF r2 = r4.A0D
            java.lang.String r3 = r4.A03
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r2 = r2.A06
            X.05G r2 = r2.A06
            r2.Epw(r3)
            X.Ocl r16 = X.C71107Ocl.A00
            java.lang.String r2 = r5.A01
            r20 = r2
            java.lang.Object r9 = r1.A02
            X.7ST r9 = (X.AnonymousClass7ST) r9
            android.graphics.PointF r18 = X.C66584MXp.A08(r38)
            X.0eK r1 = r4.A0L
            java.lang.Object r2 = X.C66580MXl.A0s(r1)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            android.graphics.PointF r1 = X.C66584MXp.A08(r38)
            android.view.View r19 = X.C70866OPf.A00(r1, r2)
            X.P9n r8 = new X.P9n
            r8.<init>(r4)
            X.P8i r1 = r4.A06
            r17 = r1
            X.P9d r15 = r4.A07
            X.PA2 r14 = r4.A08
            X.P9h r13 = r4.A0C
            r1 = 3
            X.PQr r7 = new X.PQr
            r7.<init>(r4, r1)
            com.instagram.common.session.UserSession r1 = r4.A09
            X.2Dm r1 = X.1bJ.A00(r1)
            com.instagram.model.direct.DirectThreadKey r2 = r4.A0J
            X.3U9 r4 = r1.B33(r2)
            r1 = 0
            if (r4 == 0) goto L_0x01f6
            int r3 = r4.C6a()
            r2 = 29
            if (r3 != r2) goto L_0x01f6
            X.3S9 r2 = r4.A01
            X.3Te r2 = r2.A0s
            if (r2 == 0) goto L_0x01f6
            java.util.List r1 = r2.A09
        L_0x01f6:
            r21 = r0
            r22 = r17
            r23 = r8
            r24 = r15
            r25 = r13
            r26 = r9
            r27 = r14
            r28 = r5
            r29 = r7
            r30 = r12
            r31 = r20
            r32 = r11
            r34 = r1
            r17 = r6
            r20 = r10
        L_0x0214:
            r16.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8W.DRg(android.view.MotionEvent, java.lang.Object, boolean):void");
    }
}
