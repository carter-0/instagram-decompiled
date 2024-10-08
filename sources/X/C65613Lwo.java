package X;

/* renamed from: X.Lwo  reason: case insensitive filesystem */
public final class C65613Lwo implements C337237fw {
    public final int A00;
    public final Object A01;

    public C65613Lwo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        if (X.AnonymousClass7TE.A1b(r5) == false) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x00e1;
                case 2: goto L_0x009a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            boolean r1 = r15.CT5()
            java.lang.Object r0 = r14.A01
            X.LEE r0 = (X.LEE) r0
            X.0eM r0 = r0.A08
            if (r1 != 0) goto L_0x0029
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 23
            X.MGg r3 = new X.MGg
            r3.<init>(r15, r2, r1, r0)
        L_0x0025:
            X.AnonymousClass7TE.A1Z(r3, r4)
        L_0x0028:
            return
        L_0x0029:
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 14
            X.MGU r3 = new X.MGU
            r3.<init>(r2, r1, r0)
            goto L_0x0025
        L_0x003a:
            boolean r0 = r15.CT5()
            java.lang.Object r5 = r14.A01
            X.9mO r5 = (X.C387549mO) r5
            if (r0 == 0) goto L_0x0053
            X.87H r2 = r5.A0B
            android.content.Context r1 = r5.A07
            r0 = 2131973859(0x7f1356e3, float:1.9584766E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0J(r0)
            return
        L_0x0053:
            X.8b5 r0 = r5.A0C
            r0.Dam(r15)
            X.7fy r2 = r5.A0E
            java.lang.Object r1 = r2.Bo1()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = r2.BiY()
            java.util.Iterator r3 = r1.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0028
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            if (r2 == 0) goto L_0x0070
            java.lang.String r1 = "@"
            java.lang.String r0 = r2.getUsername()
            java.lang.String r0 = X.002.A0R(r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x0070
            boolean r0 = r2.A2G()
            if (r0 == 0) goto L_0x0028
            r5.A03 = r2
            X.87H r0 = r5.A0B
            r0.A07()
            return
        L_0x009a:
            r5 = 0
            X.0qQ.A0B(r15, r5)
            java.lang.Object r4 = r15.Bo1()
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r14.A01
            X.KX6 r3 = (X.KX6) r3
            java.lang.Object r2 = r3.A00
            android.content.Context r1 = r3.A01
            com.instagram.common.session.UserSession r0 = r3.A02
            if (r4 != 0) goto L_0x00b2
            X.0sn r4 = X.0sn.A00
        L_0x00b2:
            java.util.ArrayList r1 = X.C46503Dg6.A01(r1, r0, r4)
            boolean r0 = r2 instanceof X.C46502Dg5
            if (r0 == 0) goto L_0x00d9
            X.Dg5 r2 = (X.C46502Dg5) r2
            if (r2 == 0) goto L_0x00d9
            r2.A02(r1)
            X.MmB r2 = r2.A02(r1)
        L_0x00c5:
            X.05G r1 = r3.A06
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            r1.Epw(r0)
            X.05G r0 = r3.A05
            X.AnonymousClass7TF.A1O(r0, r5)
            X.05G r0 = r3.A04
            X.JTR.A1W(r0)
            return
        L_0x00d9:
            X.0sn r0 = X.0sn.A00
            X.MmB r2 = new X.MmB
            r2.<init>(r0, r1)
            goto L_0x00c5
        L_0x00e1:
            r8 = 0
            X.0qQ.A0B(r15, r8)
            java.lang.Object r4 = r14.A01
            X.JjN r4 = (X.C60319JjN) r4
            java.lang.Object r5 = r15.Bo1()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r3 = X.JTP.A0x(r5)
        L_0x00f3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x010d
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            boolean r0 = r2.A2G()
            if (r0 == 0) goto L_0x00f3
            java.util.HashMap r1 = r4.A04
            java.lang.String r0 = r2.getUsername()
            r1.put(r0, r2)
            goto L_0x00f3
        L_0x010d:
            X.05G r2 = r4.A07
        L_0x010f:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            X.Jvp r4 = (X.C61051Jvp) r4
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0121
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            r12 = 1
            if (r0 != 0) goto L_0x0122
        L_0x0121:
            r12 = 0
        L_0x0122:
            r3 = 0
            r9 = 15615(0x3cff, float:2.1881E-41)
            r6 = r3
            r7 = r3
            r10 = r8
            r11 = r8
            r13 = r8
            X.Jvp r0 = X.C61051Jvp.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x010f
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65613Lwo.Dam(X.7fy):void");
    }
}
