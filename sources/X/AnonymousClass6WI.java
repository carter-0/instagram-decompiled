package X;

/* renamed from: X.6WI  reason: invalid class name */
public abstract class AnonymousClass6WI {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.6Vz, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36318342239230039L) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(com.instagram.common.session.UserSession r11, X.AnonymousClass6WH r12, java.util.ArrayList r13, java.util.List r14) {
        /*
            r13.clear()
            if (r12 == 0) goto L_0x00e8
            boolean r3 = r12.A03
            r9 = 0
            if (r3 == 0) goto L_0x003d
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x0027
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318342239230039(0x81075700001857, double:3.031204102090501E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 != 0) goto L_0x003d
        L_0x001b:
            java.lang.String r0 = r12.A00
            r13.add(r0)
        L_0x0020:
            java.lang.String r0 = r12.A00
            int r0 = r13.indexOf(r0)
            return r0
        L_0x0027:
            int r0 = r14.size()
            if (r9 >= r0) goto L_0x0020
            java.lang.Object r0 = r14.get(r9)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            r13.add(r0)
            int r9 = r9 + 1
            goto L_0x0027
        L_0x003d:
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x001b
            if (r3 == 0) goto L_0x0048
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x0048
            r9 = 1
        L_0x0048:
            boolean r6 = r12.A04
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r1.A01(r11)
            X.6Vv r10 = new X.6Vv
            r10.<init>(r0)
            X.6Vw r5 = new X.6Vw
            r5.<init>()
            com.instagram.user.model.User r0 = r1.A01(r11)
            X.6Vx r8 = new X.6Vx
            r8.<init>(r11, r0)
            X.6Vy r4 = new X.6Vy
            r4.<init>()
            X.6Vz r2 = new X.6Vz
            r2.<init>()
            r2.A00 = r11
            X.6W0 r3 = new X.6W0
            r3.<init>()
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318342239230039(0x81075700001857, double:3.031204102090501E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x0082
            r10 = r8
        L_0x0082:
            java.util.List r8 = r3.A01
            r8.add(r10)
            if (r9 == 0) goto L_0x00a2
            r0 = 36318342239295576(0x81075700011858, double:3.0312041021319466E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x00a2
            r0 = 36328843434344064(0x8110e400013e80, double:3.037845100165529E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 != 0) goto L_0x00a2
            r8.add(r5)
        L_0x00a2:
            r8.add(r4)
            if (r6 == 0) goto L_0x00aa
            r8.add(r2)
        L_0x00aa:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r14)
            java.util.Iterator r2 = r4.iterator()
        L_0x00b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c9
            X.1UV r1 = r3.A00
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.apply(r0)
            if (r0 != 0) goto L_0x00b3
            r2.remove()
            goto L_0x00b3
        L_0x00c9:
            boolean r0 = r13.isEmpty()
            X.17k.A0F(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            r13.add(r0)
            goto L_0x00d4
        L_0x00e8:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WI.A00(com.instagram.common.session.UserSession, X.6WH, java.util.ArrayList, java.util.List):int");
    }
}
