package X;

public final class AY8 implements 1wn {
    public final /* synthetic */ C231822sS A00;

    public AY8(C231822sS r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = -13867300(0xffffffffff2c66dc, float:-2.291613E38)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.36h r14 = (X.C2370936h) r14
            r0 = 1768133932(0x6963952c, float:1.7195663E25)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r14, r1)
            X.3Q2 r8 = r14.A00
            X.2sS r7 = r13.A00
            java.lang.Integer r4 = r7.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 != r0) goto L_0x0076
            X.3QD r0 = r8.A6J
            X.3QD r2 = X.AnonymousClass3QD.CONFIGURED
            if (r0 != r2) goto L_0x0076
            X.3QD r0 = r8.A1f
            if (r0 != r2) goto L_0x0076
            java.util.Set r3 = X.C231822sS.A07
            java.lang.String r0 = r8.A35
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0076
            java.lang.String r2 = r8.A35
            java.lang.String r0 = X.C231822sS.A06
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0076
            X.C231822sS.A00()
            X.1Xj r2 = r8.A1C
            r9 = 1
            if (r2 == 0) goto L_0x00a4
            X.1Xy r0 = r2.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00a4
            X.1rj r0 = r0.AY4()
            if (r0 == 0) goto L_0x00a4
            java.lang.Boolean r0 = r0.Buz()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r9)
            if (r0 == 0) goto L_0x00a4
            X.1Xy r0 = r2.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00a4
            X.1rj r0 = r0.AY4()
            if (r0 == 0) goto L_0x00a4
            java.lang.Integer r0 = r0.BWs()
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x00a4
        L_0x0076:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 != r0) goto L_0x008c
            com.instagram.common.session.UserSession r0 = r7.A02
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.String r2 = r0.A06
            X.5m9 r1 = X.C294255m9.A09
            X.6uk r0 = new X.6uk
            r0.<init>(r1, r2)
            r3.A00(r0)
        L_0x008c:
            com.instagram.common.session.UserSession r0 = r7.A02
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.36h> r0 = X.C2370936h.class
            r1.A02(r13, r0)
            r0 = -1912786263(0xffffffff8dfd32a9, float:-1.5604525E-30)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2003755730(0x776ee2d2, float:4.845184E33)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x00a4:
            X.6ap r2 = new X.6ap
            r2.<init>()
            r2.A04()
            r0 = 5000(0x1388, float:7.006E-42)
            r2.A01 = r0
            android.content.Context r11 = r7.A00
            r10 = 2131970875(0x7f134b3b, float:1.9578713E38)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r12 = r7.A02
            com.instagram.user.model.User r0 = r0.A01(r12)
            java.lang.String r0 = r0.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r11.getString(r10, r0)
            r2.A0D = r0
            boolean r0 = r8.A0u()
            if (r0 == 0) goto L_0x0131
            java.util.List r0 = r8.A0L()
            java.lang.Object r0 = r0.get(r1)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            java.lang.String r0 = r0.A33
            if (r0 == 0) goto L_0x0131
            r2.A03()
            java.util.List r0 = r8.A0L()
            java.lang.Object r0 = r0.get(r1)
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            java.lang.String r0 = r0.A33
        L_0x00ee:
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromPath(r0)
            r2.A04 = r0
        L_0x00f4:
            X.0Tu r10 = X.0Tu.A05
            r0 = 36314859021667149(0x81042c000e0b4d, double:3.029001301277938E-306)
            boolean r0 = X.182.A06(r10, r12, r0)
            if (r0 == 0) goto L_0x0127
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            r2.A00 = r0
        L_0x0106:
            r1 = 10
            X.FdJ r0 = new X.FdJ
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r7)
            r2.A0A(r0)
            r2.A0L = r9
            X.Dc2 r2 = r2.A00()
            X.1xC r1 = X.1xC.A01
            X.3GP r0 = new X.3GP
            r0.<init>(r2)
            r1.A00(r0)
            java.lang.String r0 = r8.A35
            r3.add(r0)
            goto L_0x0076
        L_0x0127:
            r0 = 2131970876(0x7f134b3c, float:1.9578715E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r11, r0)
            r2.A0G = r0
            goto L_0x0106
        L_0x0131:
            java.lang.String r0 = r8.A33
            if (r0 == 0) goto L_0x00f4
            r2.A03()
            java.lang.String r0 = r8.A33
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AY8.onEvent(java.lang.Object):void");
    }
}
