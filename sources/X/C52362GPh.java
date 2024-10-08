package X;

/* renamed from: X.GPh  reason: case insensitive filesystem */
public final class C52362GPh implements AnonymousClass2xU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C52362GPh(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        if (r9.A2T != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQp(X.AnonymousClass3W1 r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 0
            X.0qQ.A0B(r9, r3)
            r0 = 2
            if (r10 != r0) goto L_0x0081
            boolean r0 = r9.A22
            if (r0 != 0) goto L_0x0081
            java.lang.Object r6 = r8.A03
            X.Hqb r6 = (X.C55970Hqb) r6
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0081
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.Object r2 = r8.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r1 = r2.A30()
            if (r1 == 0) goto L_0x0081
            java.lang.Object r7 = r8.A01
            X.Hkr r7 = (X.C55632Hkr) r7
            java.lang.String r0 = "media_id"
            r5.put(r0, r1)
            r4 = 1
            java.util.ArrayList r0 = r2.A3K(r4)
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r0.get(r3)
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            if (r0 == 0) goto L_0x004e
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = "merchant_id"
            r5.put(r0, r1)
        L_0x004e:
            com.instagram.common.session.UserSession r0 = r6.A03
            com.instagram.user.model.User r0 = r2.A2A(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_owner_id"
            r5.put(r0, r1)
        L_0x005f:
            X.1iA r0 = r2.BR7()
            int r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "media_type"
            r5.put(r0, r1)
            X.1Wj r3 = X.1Wj.A00
            if (r3 == 0) goto L_0x007f
            androidx.fragment.app.Fragment r0 = r7.A00
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r7.A01
            java.lang.String r0 = "2248469498800720"
            r3.A00(r2, r1, r0, r5)
        L_0x007f:
            r6.A02 = r4
        L_0x0081:
            return
        L_0x0082:
            r5 = 0
            X.0qQ.A0B(r9, r5)
            r0 = 56
            if (r10 != r0) goto L_0x0081
            java.lang.Object r4 = r8.A02
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            java.lang.Object r3 = r8.A01
            X.0sL r3 = (X.0sL) r3
            java.lang.Integer r0 = r9.A12
            if (r0 == 0) goto L_0x0081
            int r2 = r0.intValue()
            r1 = 1
            if (r2 == r5) goto L_0x00a8
            if (r2 == r1) goto L_0x00f5
            r0 = 2
            if (r2 != r0) goto L_0x0081
            int[] r0 = new int[r5]
        L_0x00a4:
            r4.setState(r0)
            return
        L_0x00a8:
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            goto L_0x00a4
        L_0x00b0:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r0 = 4
            if (r10 == r0) goto L_0x00c3
            r0 = 17
            if (r10 == r0) goto L_0x00c3
            r0 = 39
            if (r10 != r0) goto L_0x0081
            boolean r0 = r9.A2T
            if (r0 == 0) goto L_0x00f3
        L_0x00c3:
            java.lang.Object r0 = r8.A03
            X.GMH r0 = (X.GMH) r0
            java.lang.Object r2 = r8.A02
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            X.0sa r0 = r0.A0B
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00f3
            int r1 = r0.intValue()
            X.2V1 r0 = r2.Aqq()
            android.content.Context r0 = r0.A0C
            android.content.res.Resources r0 = r0.getResources()
            float r0 = r0.getDimension(r1)
        L_0x00e7:
            java.lang.Object r1 = r8.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A01(r0)
            return
        L_0x00f3:
            r0 = 0
            goto L_0x00e7
        L_0x00f5:
            int[] r0 = new int[r5]
            r4.setState(r0)
            java.lang.Integer r0 = r9.A11
            if (r0 == 0) goto L_0x0111
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x010e
            if (r0 != r1) goto L_0x0111
            X.2EG r1 = X.2EG.A3F
        L_0x0108:
            android.view.MotionEvent r0 = r9.A0e
            r3.invoke(r1, r0)
            return
        L_0x010e:
            X.2EG r1 = X.2EG.A3G
            goto L_0x0108
        L_0x0111:
            X.0wj r2 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            r0 = 2321(0x911, float:3.252E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            r0 = 3403(0xd4b, float:4.769E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.ABQ(r1, r0)
            r2.report()
            X.2EG r1 = X.2EG.A3E
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52362GPh.DQp(X.3W1, int):void");
    }
}
