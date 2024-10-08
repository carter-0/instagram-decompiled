package X;

/* renamed from: X.7F9  reason: invalid class name */
public final class AnonymousClass7F9 implements Runnable {
    public final /* synthetic */ AnonymousClass7ZX A00;

    public AnonymousClass7F9(AnonymousClass7ZX r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (X.1Au.A00(r2).A01.getInt("direct_shh_mode_user_education_click_count", 0) >= 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01dc, code lost:
        r0 = "threadTheme";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.7ZX r1 = r0.A00
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0mo r0 = r1.A0R()
            int r3 = r0.A01
        L_0x000f:
            int r3 = r3 + -1
            r5 = -1
            if (r5 >= r3) goto L_0x00c8
            X.0mo r0 = r1.A0R()
            java.lang.Object r7 = r0.A05(r3)
            X.0qQ.A07(r7)
            X.7So r7 = (X.C331837So) r7
            boolean r0 = r7 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x000f
            X.7LQ r7 = (X.AnonymousClass7LQ) r7
            X.3su r8 = r7.A0e
            X.0qQ.A07(r8)
            com.instagram.common.session.UserSession r2 = r1.A0g
            X.0Tu r0 = X.0Tu.A05
            r5 = 36317835434006122(0x8106e1000e166a, double:3.030883596426155E-306)
            boolean r0 = X.182.A06(r0, r2, r5)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r5 = r8.A0i()
        L_0x003f:
            boolean r0 = r1.CVk(r3)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r1.CXG(r3)
            if (r0 != 0) goto L_0x00a4
            java.util.HashMap r6 = r1.A0t
            boolean r0 = r6.containsKey(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009f
            X.7SD r0 = r1.A0H
            boolean r0 = r0.A0m
            r11 = 1
            if (r0 != 0) goto L_0x006d
            X.1Av r0 = X.1Au.A00(r2)
            X.0xa r10 = r0.A01
            java.lang.String r9 = "direct_shh_mode_user_education_click_count"
            r0 = 0
            int r0 = r10.getInt(r9, r0)
            r16 = 1
            if (r0 < r11) goto L_0x006f
        L_0x006d:
            r16 = 0
        L_0x006f:
            android.content.Context r9 = r1.A00
            if (r9 == 0) goto L_0x01d9
            long r12 = r8.C7c()
            boolean r14 = r8.A2P
            java.lang.String r2 = r2.A06
            java.lang.String r0 = r8.A1u
            boolean r15 = r0.equals(r2)
            X.7L2 r0 = r1.A0F
            if (r0 == 0) goto L_0x01dc
            X.7Kx r0 = r0.A04
            int r11 = r0.A0A
            X.7SD r0 = r1.A0H
            boolean r2 = r0.A18
            X.7Bp r10 = r7.A0F
            boolean r0 = r0.A0m
            r17 = r2
            r18 = r0
            X.7O9 r0 = X.AnonymousClass7O9.A00(r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r6.put(r5, r0)
            X.AnonymousClass7ZX.A0K(r1, r0)
        L_0x009f:
            r4.add(r5)
            goto L_0x000f
        L_0x00a4:
            java.util.HashMap r2 = r1.A0t
            boolean r0 = r2.containsKey(r5)
            if (r0 == 0) goto L_0x000f
            java.lang.Object r2 = r2.remove(r5)
            if (r2 == 0) goto L_0x00c0
            X.0mo r0 = r1.A0R()
            r0.A08(r2)
            goto L_0x000f
        L_0x00bb:
            java.lang.String r5 = r8.A0h()
            goto L_0x003f
        L_0x00c0:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00c8:
            java.util.HashMap r3 = r1.A0t
            int r2 = r3.size()
            int r0 = r4.size()
            if (r2 == r0) goto L_0x011f
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x00dc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x011f
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r7 = r2.getValue()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x00dc
            r6 = 0
            X.0mo r0 = r1.A0R()
            int r2 = r0.A01
            r3 = -1
        L_0x00fe:
            if (r6 >= r2) goto L_0x010e
            X.0mo r0 = r1.A0R()
            java.lang.Object r0 = r0.A05(r6)
            if (r0 != r7) goto L_0x010b
            r3 = r6
        L_0x010b:
            int r6 = r6 + 1
            goto L_0x00fe
        L_0x010e:
            if (r3 == r5) goto L_0x011b
            X.0mo r2 = r1.A0R()
            r2.A05(r3)
            r0 = 1
            X.0mo.A02(r2, r3, r0)
        L_0x011b:
            r8.remove()
            goto L_0x00dc
        L_0x011f:
            com.instagram.common.session.UserSession r7 = r1.A0g
            X.7S7 r0 = r1.A0p
            X.3t2 r0 = r0.C6c()
            X.0qQ.A07(r0)
            boolean r2 = r0 instanceof X.C254773t1
            X.7SD r0 = r1.A0H
            boolean r0 = X.C66642MaB.A01(r7, r0, r2)
            if (r0 == 0) goto L_0x0245
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0mo r0 = r1.A0R()
            int r6 = r0.A01
        L_0x013f:
            int r6 = r6 + -1
            if (r5 >= r6) goto L_0x01ee
            X.0mo r0 = r1.A0R()
            java.lang.Object r8 = r0.A05(r6)
            X.0qQ.A07(r8)
            X.7So r8 = (X.C331837So) r8
            boolean r0 = r8 instanceof X.AnonymousClass7LQ
            if (r0 == 0) goto L_0x013f
            X.7LQ r8 = (X.AnonymousClass7LQ) r8
            X.3su r9 = r8.A0e
            X.0qQ.A07(r9)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36317835434006122(0x8106e1000e166a, double:3.030883596426155E-306)
            boolean r0 = X.182.A06(r0, r7, r2)
            if (r0 == 0) goto L_0x01d4
            java.lang.String r3 = r9.A0i()
        L_0x016c:
            boolean r0 = r1.A0U
            if (r0 != 0) goto L_0x01bd
            com.instagram.user.model.User r0 = r1.A0q
            java.lang.String r2 = r0.getId()
            java.lang.String r0 = r9.A1u
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01bd
            boolean r0 = r1.CVk(r6)
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r1.CXJ(r6)
            if (r0 != 0) goto L_0x01bd
            java.util.HashMap r2 = r1.A0s
            boolean r0 = r2.containsKey(r3)
            if (r0 != 0) goto L_0x01b9
            long r12 = r9.C7c()
            android.content.Context r9 = r1.A00
            if (r9 == 0) goto L_0x01d9
            r0 = 2131964439(0x7f133217, float:1.956566E38)
            java.lang.String r10 = r9.getString(r0)
            X.0qQ.A07(r10)
            X.7L2 r0 = r1.A0F
            if (r0 == 0) goto L_0x01dc
            X.7Kx r0 = r0.A04
            int r11 = r0.A0A
            X.7Bp r9 = r8.A0F
            X.7OA r8 = new X.7OA
            r8.<init>(r9, r10, r11, r12)
            r2.put(r3, r8)
            X.AnonymousClass7ZX.A0K(r1, r8)
        L_0x01b9:
            r4.add(r3)
            goto L_0x013f
        L_0x01bd:
            java.util.HashMap r2 = r1.A0s
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L_0x013f
            java.lang.Object r2 = r2.remove(r3)
            if (r2 == 0) goto L_0x01e6
            X.0mo r0 = r1.A0R()
            r0.A08(r2)
            goto L_0x013f
        L_0x01d4:
            java.lang.String r3 = r9.A0h()
            goto L_0x016c
        L_0x01d9:
            java.lang.String r0 = "context"
            goto L_0x01de
        L_0x01dc:
            java.lang.String r0 = "threadTheme"
        L_0x01de:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01e6:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x01ee:
            java.util.HashMap r3 = r1.A0s
            int r2 = r3.size()
            int r0 = r4.size()
            if (r2 == r0) goto L_0x0245
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x0202:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0245
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r7 = r2.getValue()
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0202
            r6 = 0
            X.0mo r0 = r1.A0R()
            int r2 = r0.A01
            r3 = -1
        L_0x0224:
            if (r6 >= r2) goto L_0x0234
            X.0mo r0 = r1.A0R()
            java.lang.Object r0 = r0.A05(r6)
            if (r0 != r7) goto L_0x0231
            r3 = r6
        L_0x0231:
            int r6 = r6 + 1
            goto L_0x0224
        L_0x0234:
            if (r3 == r5) goto L_0x0241
            X.0mo r2 = r1.A0R()
            r2.A05(r3)
            r0 = 1
            X.0mo.A02(r2, r3, r0)
        L_0x0241:
            r8.remove()
            goto L_0x0202
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F9.run():void");
    }
}
