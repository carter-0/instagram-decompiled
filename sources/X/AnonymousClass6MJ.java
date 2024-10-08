package X;

/* renamed from: X.6MJ  reason: invalid class name */
public final class AnonymousClass6MJ {
    public static final AnonymousClass6MJ A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        if (r20 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6MK A00(android.content.Context r22, com.instagram.common.session.UserSession r23, X.C255773uh r24, X.C250973mM r25, X.AnonymousClass3BQ r26, X.C309426Yf r27, X.AnonymousClass6M6 r28, java.util.List r29) {
        /*
            r21 = this;
            r7 = 0
            r2 = r22
            X.0qQ.A0B(r2, r7)
            r9 = 4
            r10 = r28
            X.0qQ.A0B(r10, r9)
            r0 = r27
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0017
            android.util.LruCache r0 = X.C313386gM.A00
            r0.evictAll()
        L_0x0017:
            android.util.LruCache r0 = X.C313386gM.A00
            r11 = r24
            java.lang.String r5 = r11.A0j
            X.0qQ.A07(r5)
            android.util.LruCache r4 = X.C313386gM.A00
            java.lang.Object r3 = r0.get(r5)
            X.6MK r3 = (X.AnonymousClass6MK) r3
            if (r3 != 0) goto L_0x0256
            boolean r20 = X.C297785sK.A0a(r11)
            r3 = r23
            r0 = r26
            boolean r19 = X.C297785sK.A0N(r3, r11, r0)
            r1 = r25
            boolean r0 = X.C309506Yn.A05(r2, r3, r11, r1)
            if (r0 == 0) goto L_0x009f
            boolean r0 = X.C309506Yn.A0B(r3, r11, r1)
            if (r0 != 0) goto L_0x009f
        L_0x0044:
            r18 = 1
        L_0x0046:
            boolean r0 = X.C297785sK.A0m(r1)
            if (r0 == 0) goto L_0x0080
            int r0 = r10.A0B
        L_0x004e:
            int r6 = X.C316216lI.A02(r2)
            int r11 = r10.A0J
            int r6 = r6 - r11
            int r6 = r6 - r0
            boolean r12 = r10.A0M
            if (r12 != 0) goto L_0x005f
            if (r19 == 0) goto L_0x005f
            int r0 = r10.A00
            int r6 = r6 - r0
        L_0x005f:
            java.util.Iterator r13 = r29.iterator()
            r3 = 0
        L_0x0064:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r8 = r13.next()
            X.6MD r8 = (X.AnonymousClass6MD) r8
            int r1 = r8.A04()
            int r0 = r8.A05()
            int r1 = r1 + r0
            int r0 = r8.A03()
            int r1 = r1 + r0
            int r3 = r3 + r1
            goto L_0x0064
        L_0x0080:
            if (r20 == 0) goto L_0x0099
            int r0 = r10.A07
            int r8 = r0 * 4
        L_0x0086:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36603575312978879(0x820ac2000a13bf, double:3.2115866464706666E-306)
            long r0 = X.182.A01(r6, r3, r0)
            int r3 = (int) r0
            float r0 = X.0nA.A04(r2, r3)
            int r0 = (int) r0
            int r0 = r0 + r8
            goto L_0x004e
        L_0x0099:
            int r0 = r10.A01
            if (r18 == 0) goto L_0x004e
            r8 = r0
            goto L_0x0086
        L_0x009f:
            int r12 = r1.A01
            r6 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r0 = 0
            if (r12 <= 0) goto L_0x00ab
            int r0 = r12 - r6
        L_0x00ab:
            X.3uh r6 = r1.A0A(r3, r0)
            X.4gI r0 = r11.A0D()
            if (r0 == 0) goto L_0x00bf
            java.lang.Boolean r0 = r0.Bui()
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x00cf
        L_0x00bf:
            X.JSN r0 = r11.A0E()
            if (r0 == 0) goto L_0x00dd
            java.lang.Boolean r0 = r0.Bui()
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x00dd
        L_0x00cf:
            boolean r0 = X.C309506Yn.A05(r2, r3, r6, r1)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = X.C309506Yn.A0B(r3, r6, r1)
            if (r0 != 0) goto L_0x00dd
            goto L_0x0044
        L_0x00dd:
            r18 = 0
            if (r20 == 0) goto L_0x0046
            goto L_0x0044
        L_0x00e3:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r6 >= r3) goto L_0x011b
            java.util.Iterator r17 = r29.iterator()
        L_0x00ee:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r13 = r17.next()
            X.6MD r13 = (X.AnonymousClass6MD) r13
            X.6ME r0 = r13.A04
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x00ee
            if (r1 == r9) goto L_0x00ee
            r0 = 1
            if (r1 == r0) goto L_0x019e
            int r1 = r13.A04()
            int r0 = r13.A05()
            int r1 = r1 + r0
            int r0 = r13.A03()
            int r1 = r1 + r0
            int r3 = r3 - r1
            r8.add(r13)
        L_0x0119:
            if (r6 < r3) goto L_0x00ee
        L_0x011b:
            if (r6 <= r3) goto L_0x012b
            int r7 = r6 - r3
            int r1 = r29.size()
            int r0 = r8.size()
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r7 = r7 / r0
        L_0x012b:
            X.6MK r3 = new X.6MK
            r3.<init>()
            if (r20 == 0) goto L_0x0135
            int r0 = r10.A07
            int r11 = r11 + r0
        L_0x0135:
            if (r12 == 0) goto L_0x0140
            if (r19 != 0) goto L_0x0140
            if (r18 != 0) goto L_0x0140
            int r0 = r10.A01
            int r0 = r0 / 2
            int r11 = r11 + r0
        L_0x0140:
            java.util.Iterator r12 = r29.iterator()
        L_0x0144:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r9 = r12.next()
            X.6MD r9 = (X.AnonymousClass6MD) r9
            boolean r0 = r8.contains(r9)
            if (r0 == 0) goto L_0x0168
            X.6ME r9 = r9.A04
            X.6MH r1 = X.AnonymousClass6MH.A05
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.util.HashMap r0 = r3.A00
            r0.put(r9, r1)
            goto L_0x0144
        L_0x0168:
            int r0 = r9.A05()
            int r0 = r0 + r7
            int r11 = r11 + r0
            int r0 = X.AnonymousClass6M6.A00(r2)
            int r14 = r9.A06()
            int r0 = r0 - r14
            int r10 = r0 / 2
            X.6ME r1 = r9.A04
            int r15 = r9.A04()
            r0 = 0
            X.6MH r13 = new X.6MH
            r16 = r10
            r17 = r11
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            X.0qQ.A0B(r1, r0)
            java.util.HashMap r0 = r3.A00
            r0.put(r1, r13)
            int r1 = r9.A04()
            int r0 = r9.A03()
            int r1 = r1 + r0
            int r11 = r11 + r1
            goto L_0x0144
        L_0x019e:
            if (r6 >= r3) goto L_0x0119
            java.util.Iterator r14 = r29.iterator()
        L_0x01a4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r13 = r14.next()
            X.6MD r13 = (X.AnonymousClass6MD) r13
            X.6ME r1 = r13.A04
            X.6ME r0 = X.AnonymousClass6ME.CAPTION
            if (r1 != r0) goto L_0x01a4
            X.6MF r13 = (X.AnonymousClass6MF) r13
            if (r13 == 0) goto L_0x0119
            int r0 = r13.A04()
            int r16 = r3 - r0
            int r14 = r6 - r16
            if (r14 <= 0) goto L_0x01e9
            java.lang.String r15 = r13.A0P
            X.0rN r1 = r13.A05
            if (r1 != 0) goto L_0x01d4
            java.lang.String r0 = "textLayoutParams"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d4:
            int r0 = r13.A00
            int r0 = r14 - r0
            int r0 = X.AnonymousClass6MI.A01(r1, r15, r0)
            if (r0 <= 0) goto L_0x01e9
            X.AnonymousClass6MF.A01(r13, r14)
            int r0 = r13.A04()
            int r3 = r16 + r0
            goto L_0x0119
        L_0x01e9:
            r8.add(r13)
            int r1 = r13.A04()
            int r0 = r13.A05()
            int r1 = r1 + r0
            int r0 = r13.A03()
            int r1 = r1 + r0
            int r3 = r3 - r1
            goto L_0x0119
        L_0x01fd:
            java.util.Iterator r10 = r8.iterator()
        L_0x0201:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0253
            java.lang.Object r1 = r10.next()
            X.6MD r1 = (X.AnonymousClass6MD) r1
            X.6ME r8 = r1.A04
            X.6ME r0 = X.AnonymousClass6ME.PRODUCT_TAG
            if (r8 != r0) goto L_0x0201
            X.6ME r0 = X.AnonymousClass6ME.MEDIA
            r14 = 0
            X.0qQ.A0B(r0, r14)
            java.util.HashMap r7 = r3.A00
            java.lang.Object r9 = r7.get(r0)
            X.6MH r9 = (X.AnonymousClass6MH) r9
            if (r9 == 0) goto L_0x0201
            int r0 = X.AnonymousClass6M6.A00(r2)
            int r10 = r1.A06()
            int r0 = r0 - r10
            int r12 = r0 / 2
            int r11 = r1.A04()
            int r0 = r1.A03()
            int r2 = r11 + r0
            int r1 = r9.A03
            int r0 = r9.A00
            int r1 = r1 + r0
            int r1 = r1 - r2
            int r6 = r6 - r2
            int[] r0 = new int[]{r1, r6}
            r13 = r0[r14]
            if (r6 >= r13) goto L_0x0248
            r13 = r6
        L_0x0248:
            X.6MH r9 = new X.6MH
            r9.<init>(r10, r11, r12, r13, r14)
            X.0qQ.A0B(r8, r14)
            r7.put(r8, r9)
        L_0x0253:
            r4.put(r5, r3)
        L_0x0256:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MJ.A00(android.content.Context, com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6Yf, X.6M6, java.util.List):X.6MK");
    }
}
