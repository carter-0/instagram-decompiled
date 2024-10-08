package X;

/* renamed from: X.Maz  reason: case insensitive filesystem */
public final class C66692Maz {
    public static final C66692Maz A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r17 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r1.get(((com.instagram.user.model.User) r14.Bal().get(0)).getId()) == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        if (((X.AnonymousClass170) r8.get(0)).isVerified() == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r14.CTB() == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C66693Mb0 A00(android.content.Context r12, com.instagram.common.session.UserSession r13, X.C74516PwB r14, boolean r15, boolean r16, boolean r17) {
        /*
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r4 = r0.A01(r13)
            java.util.List r8 = r14.BkC()
            r3 = 1
            r2 = 0
            if (r15 == 0) goto L_0x009a
            boolean r0 = r14.CUG()
            if (r0 != 0) goto L_0x001c
            int r1 = r14.C6a()
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r1 != r0) goto L_0x009a
        L_0x001c:
            boolean r0 = r14.CY7()
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = r14.C6f()
            if (r0 == 0) goto L_0x009a
            int r0 = r0.length()
            if (r0 == 0) goto L_0x009a
            boolean r1 = r14.Cck()
            java.lang.String r0 = r14.C6f()
            if (r1 == 0) goto L_0x00a4
            if (r0 == 0) goto L_0x015c
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            boolean r0 = r14.Cck()
            X.MbA r4 = new X.MbA
            r4.<init>(r1, r2, r2, r0)
        L_0x004a:
            if (r16 != 0) goto L_0x004f
            r5 = 0
            if (r17 == 0) goto L_0x0050
        L_0x004f:
            r5 = 1
        L_0x0050:
            boolean r6 = r14.EtA()
            boolean r7 = r14.CZA()
            boolean r8 = r14.CTo()
            boolean r0 = r14.CUG()
            if (r0 != 0) goto L_0x0093
            java.util.List r0 = r14.Bal()
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0093
            java.util.Map r0 = r14.BWN()
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0093
            java.util.Map r1 = r14.BWN()
            if (r1 == 0) goto L_0x0093
            java.util.List r0 = r14.Bal()
            java.lang.Object r0 = r0.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            java.lang.Object r0 = r1.get(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0094
        L_0x0093:
            r9 = 0
        L_0x0094:
            X.Mb0 r3 = new X.Mb0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x009a:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r4.getUsername()
        L_0x00a4:
            X.McH r4 = new X.McH
            r4.<init>(r0)
            goto L_0x004a
        L_0x00aa:
            int r0 = r8.size()
            if (r0 != r3) goto L_0x00bd
            java.lang.Object r0 = r8.get(r2)
            X.170 r0 = (X.AnonymousClass170) r0
            boolean r0 = r0.isVerified()
            r7 = 1
            if (r0 != 0) goto L_0x00be
        L_0x00bd:
            r7 = 0
        L_0x00be:
            int r0 = r8.size()
            if (r0 != r3) goto L_0x00cb
            boolean r0 = r14.CTB()
            r6 = 1
            if (r0 != 0) goto L_0x00cc
        L_0x00cb:
            r6 = 0
        L_0x00cc:
            java.lang.String r1 = r14.C6f()
            int r0 = r8.size()
            if (r0 != r3) goto L_0x00f7
            if (r1 != 0) goto L_0x00e5
            java.lang.Object r0 = r8.get(r2)
            X.177 r0 = (X.AnonymousClass177) r0
            java.lang.String r1 = X.AnonymousClass50n.A07(r0)
            X.0qQ.A07(r1)
        L_0x00e5:
            java.util.List r5 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r5)
        L_0x00ec:
            boolean r0 = r14.Cck()
            X.MbA r4 = new X.MbA
            r4.<init>(r5, r7, r6, r0)
            goto L_0x004a
        L_0x00f7:
            int r1 = r8.size()
            r0 = 3
            int r9 = java.lang.Math.min(r1, r0)
            int r0 = java.lang.Math.max(r9, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x010e:
            if (r9 <= 0) goto L_0x00ec
            r4.clear()
            r1 = 0
        L_0x0114:
            java.lang.Object r0 = r8.get(r1)
            X.177 r0 = (X.AnonymousClass177) r0
            java.lang.String r0 = X.AnonymousClass50n.A08(r0)
            X.0qQ.A07(r0)
            r4.add(r0)
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x0114
            int r11 = r8.size()
            int r11 = r11 - r9
            java.lang.String r1 = ", "
            if (r11 <= 0) goto L_0x0152
            r10 = 2131976218(0x7f13601a, float:1.958955E38)
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r1 = r0.A02(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = r12.getString(r10, r0)
        L_0x0149:
            X.0qQ.A07(r0)
            r5.add(r0)
            int r9 = r9 + -1
            goto L_0x010e
        L_0x0152:
            X.3El r0 = new X.3El
            r0.<init>(r1)
            java.lang.String r0 = r0.A02(r4)
            goto L_0x0149
        L_0x015c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66692Maz.A00(android.content.Context, com.instagram.common.session.UserSession, X.PwB, boolean, boolean, boolean):X.Mb0");
    }
}
