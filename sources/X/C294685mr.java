package X;

/* renamed from: X.5mr  reason: invalid class name and case insensitive filesystem */
public abstract class C294685mr {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r10 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (java.lang.Boolean.TRUE.equals(r10.A05) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r4.A0F(r9, (java.lang.String) null, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r1 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (java.lang.Boolean.TRUE.equals(r10.A03) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r10, java.util.List r11) {
        /*
            r6 = 0
            r5 = 1
            X.0qQ.A0B(r10, r5)
            X.5mt r4 = X.C294695ms.A00(r10)
            X.17i r7 = X.17h.A00(r10)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0016:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r8 = r11.next()
            X.5Gi r8 = (X.C283155Gi) r8
            com.instagram.user.model.User r9 = r8.A04()
            if (r9 == 0) goto L_0x004c
            X.5Gj r0 = r8.A04
            X.9Ii r10 = r0.A08
            if (r10 == 0) goto L_0x0039
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r10.A03
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003c
        L_0x0039:
            r2 = 0
            if (r10 == 0) goto L_0x0047
        L_0x003c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r10.A05
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            r0 = 0
            r4.A0F(r9, r0, r2, r1)
        L_0x004c:
            X.5Gj r0 = r8.A04
            java.lang.String r9 = r0.A0f
            java.lang.String r1 = r0.A0h
            if (r9 == 0) goto L_0x00a3
            if (r1 == 0) goto L_0x00a3
            java.util.List r0 = r0.A0t
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.size()
            if (r0 <= r5) goto L_0x00a3
            boolean r0 = r3.add(r9)
            if (r0 == 0) goto L_0x00a3
            com.instagram.user.model.User r2 = r7.A02(r9)
            if (r2 != 0) goto L_0x0071
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r9, r1)
        L_0x0071:
            X.5Gj r0 = r8.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0E
            if (r0 == 0) goto L_0x007a
            r2.A0l(r0)
        L_0x007a:
            X.5Gj r0 = r8.A04
            X.JwG r0 = r0.A0A
            if (r0 == 0) goto L_0x008b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            r2.A1E(r0)
            java.lang.String r1 = "remove_follower"
            X.5Gj r0 = r8.A04
            java.util.List r0 = r0.A0t
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00a0
            r2.A13(r5)
        L_0x00a0:
            r7.A01(r2, r5, r6)
        L_0x00a3:
            X.5Gm r1 = r8.A05
            X.5Gm r0 = X.C283195Gm.FOLLOW_REQUEST
            if (r1 != r0) goto L_0x0016
            com.instagram.user.model.User r2 = r8.A04()
            if (r2 == 0) goto L_0x00c6
            X.5Gj r0 = r8.A04
            X.9Ii r0 = r0.A08
            if (r0 == 0) goto L_0x00c0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.A04
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00c1
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            r2.A19(r0)
            goto L_0x0016
        L_0x00c6:
            java.lang.String r1 = "ActivityPagedData"
            java.lang.String r0 = "The user object in the follow request story is null."
            X.0wb.A03(r1, r0)
            goto L_0x0016
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294685mr.A00(com.instagram.common.session.UserSession, java.util.List):void");
    }
}
