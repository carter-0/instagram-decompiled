package X;

/* renamed from: X.Q1o  reason: case insensitive filesystem */
public final class C7264Q1o {
    public final int A00;
    public final 1NK A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r13 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C303656Af A00(X.Q2X r20, X.Q1l r21, X.C7263Q1n r22, java.lang.String r23, boolean r24) {
        /*
            r19 = this;
            r9 = 0
            r0 = r23
            X.0qQ.A0B(r0, r9)
            r4 = r21
            r5 = r20
            X.C51972G9s.A1B(r4, r5)
            r15 = r22
            com.google.common.collect.ImmutableList r10 = r15.A01
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x001a
            r5.Cw9()
        L_0x001a:
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r8.<init>(r9)
            com.google.common.collect.ImmutableList$Builder r7 = com.google.common.collect.ImmutableList.builder()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x0049
            java.util.Iterator r2 = r0.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            X.GVl r1 = (X.C52508GVl) r1
            com.instagram.model.showreelnative.IgShowreelNativeAsset r0 = r1.A00
            java.lang.String r0 = r0.getUrl()
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = ""
        L_0x0045:
            r3.put(r0, r1)
            goto L_0x002f
        L_0x0049:
            com.google.common.collect.ImmutableMap r6 = com.google.common.collect.ImmutableMap.copyOf(r3)
            X.0qQ.A07(r6)
            X.3kO r14 = X.C66580MXl.A0J(r10)
        L_0x0054:
            boolean r0 = r14.hasNext()
            r1 = r19
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r2 = r14.next()
            X.JV7 r2 = (X.JV7) r2
            X.1NK r12 = r1.A01
            java.lang.String r11 = r1.A02
            X.0qQ.A0A(r2)
            X.0qQ.A0B(r2, r9)
            com.google.common.util.concurrent.SettableFuture r1 = new com.google.common.util.concurrent.SettableFuture
            r1.<init>()
            X.Q1t r0 = new X.Q1t
            r0.<init>(r2, r5, r1, r8)
            X.Q1s r3 = new X.Q1s
            r3.<init>(r1, r0)
            java.lang.String r10 = r2.A02
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r10)
            boolean r1 = r6.containsKey(r10)
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r6.get(r10)
            X.GVl r1 = (X.C52508GVl) r1
            if (r1 == 0) goto L_0x00ab
            com.instagram.model.showreelnative.IgShowreelNativeAsset r13 = r1.A00
            java.lang.Integer r1 = r13.CGY()
            if (r1 == 0) goto L_0x00ab
            int r2 = r1.intValue()
            java.lang.Integer r1 = r13.BCu()
            if (r1 == 0) goto L_0x00ab
            int r1 = r1.intValue()
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r10, r2, r1)
        L_0x00ab:
            X.1OO r1 = r12.A0J(r0, r11)
            r0 = r24
            r1.A0I = r0
            r0 = 1
            r1.A0F = r0
            X.1MK r0 = r3.A00
            r1.A02(r0)
            r1.A01()
            r7.add(r3)
            goto L_0x0054
        L_0x00c2:
            com.google.common.collect.ImmutableList r0 = r7.build()
            X.MmO r2 = X.C255183ti.A00(r0)
            r14 = 12
            X.IxG r13 = new X.IxG
            r18 = r4
            r17 = r5
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 2
            X.Q2c r1 = new X.Q2c
            r1.<init>(r0, r13)
            X.1Lf r0 = X.1Lf.A01
            X.6Af r0 = X.C303646Ae.A01(r1, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7264Q1o.A00(X.Q2X, X.Q1l, X.Q1n, java.lang.String, boolean):X.6Af");
    }

    public C7264Q1o(AnonymousClass624 r5, 1NK r6, String str) {
        this.A01 = r6;
        this.A02 = str;
        this.A00 = DbS.A04(0Tu.A05, AnonymousClass624.A00(r5), 36592253781410176L);
    }
}
