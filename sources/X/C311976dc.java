package X;

/* renamed from: X.6dc  reason: invalid class name and case insensitive filesystem */
public final class C311976dc {
    public final 2NZ A00;
    public final 2NZ A01;
    public final 2NZ A02;
    public final 2NZ A03;
    public final 1Vf A04;
    public final 1Vf A05;
    public final 1Vf A06;
    public final C251983oI A07;
    public final 1Vg A08;
    public final 1Vg A09;
    public final 1Vg A0A;
    public final 1Vg A0B;
    public final 1Vg A0C;
    public final 2NZ A0D;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(X.C346147ug r9, X.C311976dc r10, X.C346117ud r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 19
            boolean r0 = X.MED.A04(r3, r12)
            if (r0 == 0) goto L_0x00e3
            r7 = r12
            X.MED r7 = (X.MED) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e3
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            r8 = 4
            r4 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r3) goto L_0x0049
            if (r1 == r2) goto L_0x006e
            if (r1 == r4) goto L_0x00a6
            if (r1 != r8) goto L_0x00ea
            X.0eS.A00(r0)
        L_0x002d:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0030:
            X.0eS.A00(r0)
            r7.A01 = r10
            r7.A02 = r9
            r7.A03 = r11
            r7.A00 = r3
            X.3oI r1 = r10.A07
            X.Arz r0 = new X.Arz
            r0.<init>(r9, r10)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r7)
            if (r0 != r6) goto L_0x0058
            return r6
        L_0x0049:
            java.lang.Object r11 = r7.A03
            X.7ud r11 = (X.C346117ud) r11
            java.lang.Object r9 = r7.A02
            X.7ug r9 = (X.C346147ug) r9
            java.lang.Object r10 = r7.A01
            X.6dc r10 = (X.C311976dc) r10
            X.0eS.A00(r0)
        L_0x0058:
            r7.A01 = r10
            r7.A02 = r9
            r7.A03 = r11
            r7.A00 = r2
            X.3oI r1 = r10.A07
            X.7z6 r0 = new X.7z6
            r0.<init>(r10, r11)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r7)
            if (r0 != r6) goto L_0x007d
            return r6
        L_0x006e:
            java.lang.Object r11 = r7.A03
            X.7ud r11 = (X.C346117ud) r11
            java.lang.Object r9 = r7.A02
            X.7ug r9 = (X.C346147ug) r9
            java.lang.Object r10 = r7.A01
            X.6dc r10 = (X.C311976dc) r10
            X.0eS.A00(r0)
        L_0x007d:
            java.lang.String r2 = r11.A01
            r7.A01 = r10
            r7.A02 = r9
            r7.A03 = r11
            r7.A00 = r4
            java.lang.String r1 = "\n        SELECT ref.`order` FROM effect_collections_effects ref\n        WHERE ref.collectionId=? ORDER BY ref.`order`\n        LIMIT 1\n  "
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r0 = X.1Wa.A00(r1, r3)
            r0.ADh(r3, r2)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r10.A07
            X.As5 r1 = new X.As5
            r1.<init>(r0, r10)
            r0 = 0
            java.lang.Object r0 = X.1wR.A00(r3, r2, r1, r7, r0)
            if (r0 != r6) goto L_0x00b5
            return r6
        L_0x00a6:
            java.lang.Object r11 = r7.A03
            X.7ud r11 = (X.C346117ud) r11
            java.lang.Object r9 = r7.A02
            X.7ug r9 = (X.C346147ug) r9
            java.lang.Object r10 = r7.A01
            X.6dc r10 = (X.C311976dc) r10
            X.0eS.A00(r0)
        L_0x00b5:
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00e0
            long r0 = r0.longValue()
        L_0x00bd:
            java.lang.String r5 = r11.A01
            java.lang.String r4 = r9.A0L
            r2 = 1
            long r0 = r0 - r2
            X.7z7 r2 = new X.7z7
            r2.<init>(r5, r4, r0)
            r0 = 0
            r7.A01 = r0
            r7.A02 = r0
            r7.A03 = r0
            r7.A00 = r8
            X.3oI r1 = r10.A07
            X.As0 r0 = new X.As0
            r0.<init>(r2, r10)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r7)
            if (r0 != r6) goto L_0x002d
            return r6
        L_0x00e0:
            r0 = 0
            goto L_0x00bd
        L_0x00e3:
            X.MED r7 = new X.MED
            r7.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00ea:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311976dc.A00(X.7ug, X.6dc, X.7ud, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A01(X.C311976dc r6, X.C346117ud r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 24
            boolean r0 = X.C66146MDy.A02(r3, r8)
            if (r0 == 0) goto L_0x0063
            r5 = r8
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0063
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r0) goto L_0x0043
            if (r1 != r3) goto L_0x0069
            X.0eS.A00(r2)
        L_0x0027:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x002a:
            X.0eS.A00(r2)
            java.lang.String r2 = r7.A01
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r0
            X.3oI r1 = r6.A07
            X.7z0 r0 = new X.7z0
            r0.<init>(r6, r2)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x004e
            return r4
        L_0x0043:
            java.lang.Object r7 = r5.A02
            X.7ud r7 = (X.C346117ud) r7
            java.lang.Object r6 = r5.A01
            X.6dc r6 = (X.C311976dc) r6
            X.0eS.A00(r2)
        L_0x004e:
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            X.3oI r1 = r6.A07
            X.7z1 r0 = new X.7z1
            r0.<init>(r6, r7)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x0063:
            X.MDy r5 = new X.MDy
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0069:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311976dc.A01(X.6dc, X.7ud, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r4 = r0.A01;
        r1.A01 = r15;
        r1.A02 = r0;
        r1.A03 = r6;
        r1.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        if (X.1wR.A01(r15.A07, new X.C348797z2(r15, r4), r1) == r5) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        r9 = r0.A00.A01;
        r1.A01 = r15;
        r1.A02 = r0;
        r1.A03 = r4;
        r1.A00 = 4;
        r6 = X.1WY.A08;
        r8 = X.1Wa.A00("\n      SELECT * FROM effect_collections \n      WHERE collectionId=? \n      AND syncedAt>=?\n  ", 2);
        r8.ADh(1, r9);
        r8.ADa(2, 0);
        r6 = X.1wR.A00(new android.os.CancellationSignal(), r15.A07, new X.C346107uc(r8, r15), r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e2, code lost:
        if (r6 != r5) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e4, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f2, code lost:
        r6 = (X.C346117ud) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f4, code lost:
        if (r6 == null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        r2 = r0.A00;
        r10 = r2.A03;
        r14 = r2.A05;
        r8 = r6.A04;
        r9 = r6.A02;
        r7 = new X.C346117ud(r8, r9, r10, X.002.A0T(r8, r9, '_'), r6.A00, r14);
        r1.A01 = r15;
        r1.A02 = r0;
        r1.A03 = r4;
        r1.A00 = 5;
        r6 = r15.A07;
        r2 = new X.C41321As3(r15, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0121, code lost:
        if (X.1wR.A01(r6, r2, r1) != r5) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0123, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0124, code lost:
        r3 = r0.A00;
        r1.A01 = r15;
        r1.A02 = r0;
        r1.A03 = r4;
        r1.A00 = 6;
        r6 = r15.A07;
        r2 = new X.C348837z6(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0144, code lost:
        r3 = r0.A01;
        r9 = new java.util.ArrayList(X.0Yv.A1E(r3, 10));
        r6 = 0;
        r12 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015a, code lost:
        if (r12.hasNext() == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015c, code lost:
        r3 = r12.next();
        r11 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0162, code lost:
        if (r6 >= 0) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0164, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016c, code lost:
        r2 = r0.A00;
        r9.add(new X.C348847z7(r2.A01, ((X.C346147ug) r3).A0L, r2.A00 + ((long) r6)));
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0182, code lost:
        r1.A01 = r4;
        r1.A02 = null;
        r1.A03 = null;
        r1.A00 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0197, code lost:
        if (X.1wR.A01(r15.A07, new X.C348857z8(r15, r9), r1) != r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0199, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A02(X.C311976dc r16, X.C346177uj r17, X.AnonymousClass4D7 r18, boolean r19) {
        /*
            r15 = r16
            r0 = r17
            r5 = 18
            r6 = r18
            boolean r1 = X.MED.A04(r5, r6)
            if (r1 == 0) goto L_0x002d
            r1 = r6
            X.MED r1 = (X.MED) r1
            int r4 = r1.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x002d
            int r4 = r4 - r3
            r1.A00 = r4
        L_0x001c:
            java.lang.Object r6 = r1.A04
            X.1Hj r5 = X.1Hj.A02
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x0050;
                case 1: goto L_0x0074;
                case 2: goto L_0x0041;
                case 3: goto L_0x0033;
                case 4: goto L_0x00e5;
                case 5: goto L_0x0137;
                case 6: goto L_0x0137;
                case 7: goto L_0x019a;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002d:
            X.MED r1 = new X.MED
            r1.<init>(r15, r6, r5)
            goto L_0x001c
        L_0x0033:
            java.lang.Object r4 = r1.A03
            java.lang.Object r0 = r1.A02
            X.7uj r0 = (X.C346177uj) r0
            java.lang.Object r15 = r1.A01
            X.6dc r15 = (X.C311976dc) r15
            X.0eS.A00(r6)
            goto L_0x00b2
        L_0x0041:
            java.lang.Object r2 = r1.A03
            java.lang.Object r0 = r1.A02
            X.7uj r0 = (X.C346177uj) r0
            java.lang.Object r15 = r1.A01
            X.6dc r15 = (X.C311976dc) r15
            X.0eS.A00(r6)
            r6 = r2
            goto L_0x0099
        L_0x0050:
            X.0eS.A00(r6)
            if (r19 == 0) goto L_0x0098
            X.7ud r2 = r0.A00
            java.lang.String r3 = r2.A01
            r16 = 0
            r1.A01 = r15
            r1.A02 = r0
            r2 = 1
            r1.A00 = r2
            r18 = 0
            X.3oI r2 = r15.A07
            X.7ub r14 = new X.7ub
            r17 = r3
            r14.<init>(r15, r16, r17, r18)
            java.lang.Object r6 = X.AnonymousClass1t4.A00(r2, r1, r14)
            if (r6 != r5) goto L_0x007f
            return r5
        L_0x0074:
            java.lang.Object r0 = r1.A02
            X.7uj r0 = (X.C346177uj) r0
            java.lang.Object r15 = r1.A01
            X.6dc r15 = (X.C311976dc) r15
            X.0eS.A00(r6)
        L_0x007f:
            X.7ud r4 = r0.A00
            r1.A01 = r15
            r1.A02 = r0
            r1.A03 = r6
            r2 = 2
            r1.A00 = r2
            X.3oI r3 = r15.A07
            X.7yz r2 = new X.7yz
            r2.<init>(r15, r4)
            java.lang.Object r2 = X.AnonymousClass1t4.A00(r3, r1, r2)
            if (r2 != r5) goto L_0x0099
            return r5
        L_0x0098:
            r6 = 0
        L_0x0099:
            java.util.List r4 = r0.A01
            r1.A01 = r15
            r1.A02 = r0
            r1.A03 = r6
            r2 = 3
            r1.A00 = r2
            X.3oI r3 = r15.A07
            X.7z2 r2 = new X.7z2
            r2.<init>(r15, r4)
            java.lang.Object r2 = X.1wR.A01(r3, r2, r1)
            if (r2 == r5) goto L_0x00e4
            r4 = r6
        L_0x00b2:
            X.7ud r2 = r0.A00
            java.lang.String r9 = r2.A01
            r1.A01 = r15
            r1.A02 = r0
            r1.A03 = r4
            r2 = 4
            r1.A00 = r2
            r2 = 0
            java.lang.String r8 = "\n      SELECT * FROM effect_collections \n      WHERE collectionId=? \n      AND syncedAt>=?\n  "
            r7 = 2
            java.util.TreeMap r6 = X.1WY.A08
            X.1WY r8 = X.1Wa.A00(r8, r7)
            r6 = 1
            r8.ADh(r6, r9)
            r8.ADa(r7, r2)
            android.os.CancellationSignal r7 = new android.os.CancellationSignal
            r7.<init>()
            X.3oI r6 = r15.A07
            X.7uc r3 = new X.7uc
            r3.<init>(r8, r15)
            r2 = 0
            java.lang.Object r6 = X.1wR.A00(r7, r6, r3, r1, r2)
            if (r6 != r5) goto L_0x00f2
        L_0x00e4:
            return r5
        L_0x00e5:
            java.lang.Object r4 = r1.A03
            java.lang.Object r0 = r1.A02
            X.7uj r0 = (X.C346177uj) r0
            java.lang.Object r15 = r1.A01
            X.6dc r15 = (X.C311976dc) r15
            X.0eS.A00(r6)
        L_0x00f2:
            X.7ud r6 = (X.C346117ud) r6
            if (r6 == 0) goto L_0x0124
            X.7ud r2 = r0.A00
            java.lang.String r10 = r2.A03
            boolean r14 = r2.A05
            java.lang.String r8 = r6.A04
            java.lang.String r9 = r6.A02
            long r12 = r6.A00
            r2 = 95
            java.lang.String r11 = X.002.A0T(r8, r9, r2)
            X.7ud r7 = new X.7ud
            r7.<init>(r8, r9, r10, r11, r12, r14)
            r1.A01 = r15
            r1.A02 = r0
            r1.A03 = r4
            r2 = 5
            r1.A00 = r2
            X.3oI r6 = r15.A07
            X.As3 r2 = new X.As3
            r2.<init>(r15, r7)
        L_0x011d:
            java.lang.Object r2 = X.1wR.A01(r6, r2, r1)
            if (r2 != r5) goto L_0x0144
            return r5
        L_0x0124:
            X.7ud r3 = r0.A00
            r1.A01 = r15
            r1.A02 = r0
            r1.A03 = r4
            r2 = 6
            r1.A00 = r2
            X.3oI r6 = r15.A07
            X.7z6 r2 = new X.7z6
            r2.<init>(r15, r3)
            goto L_0x011d
        L_0x0137:
            java.lang.Object r4 = r1.A03
            java.lang.Object r0 = r1.A02
            X.7uj r0 = (X.C346177uj) r0
            java.lang.Object r15 = r1.A01
            X.6dc r15 = (X.C311976dc) r15
            X.0eS.A00(r6)
        L_0x0144:
            java.util.List r3 = r0.A01
            r2 = 10
            int r2 = X.0Yv.A1E(r3, r2)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            r6 = 0
            java.util.Iterator r12 = r3.iterator()
        L_0x0156:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0182
            java.lang.Object r3 = r12.next()
            int r11 = r6 + 1
            if (r6 >= 0) goto L_0x016c
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x016c:
            X.7ug r3 = (X.C346147ug) r3
            X.7ud r2 = r0.A00
            java.lang.String r10 = r2.A01
            java.lang.String r8 = r3.A0L
            long r2 = r2.A00
            long r6 = (long) r6
            long r2 = r2 + r6
            X.7z7 r6 = new X.7z7
            r6.<init>(r10, r8, r2)
            r9.add(r6)
            r6 = r11
            goto L_0x0156
        L_0x0182:
            r1.A01 = r4
            r0 = 0
            r1.A02 = r0
            r1.A03 = r0
            r0 = 7
            r1.A00 = r0
            X.3oI r2 = r15.A07
            X.7z8 r0 = new X.7z8
            r0.<init>(r15, r9)
            java.lang.Object r0 = X.1wR.A01(r2, r0, r1)
            if (r0 != r5) goto L_0x019f
            return r5
        L_0x019a:
            java.lang.Object r4 = r1.A01
            X.0eS.A00(r6)
        L_0x019f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311976dc.A02(X.6dc, X.7uj, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A03(X.C311976dc r10, java.lang.Integer r11, java.lang.String r12, X.AnonymousClass4D7 r13, long r14) {
        /*
            r3 = 17
            boolean r0 = X.MED.A04(r3, r13)
            if (r0 == 0) goto L_0x00aa
            r5 = r13
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00aa
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0034
            if (r0 == r8) goto L_0x0061
            if (r0 != r3) goto L_0x00b1
            java.lang.Object r7 = r5.A01
            X.7ud r7 = (X.C346117ud) r7
            X.0eS.A00(r1)
        L_0x002c:
            java.util.List r1 = (java.util.List) r1
            X.7uj r9 = new X.7uj
            r9.<init>(r7, r1)
        L_0x0033:
            return r9
        L_0x0034:
            X.0eS.A00(r1)
            r5.A01 = r10
            r5.A02 = r12
            r5.A03 = r11
            r5.A00 = r8
            java.lang.String r1 = "\n      SELECT * FROM effect_collections \n      WHERE collectionId=? \n      AND syncedAt>=?\n  "
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r0 = X.1Wa.A00(r1, r3)
            r0.ADh(r8, r12)
            r0.ADa(r3, r14)
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            X.3oI r2 = r10.A07
            X.7uc r1 = new X.7uc
            r1.<init>(r0, r10)
            r0 = 0
            java.lang.Object r1 = X.1wR.A00(r4, r2, r1, r5, r0)
            if (r1 != r6) goto L_0x0070
            return r6
        L_0x0061:
            java.lang.Object r11 = r5.A03
            java.lang.Number r11 = (java.lang.Number) r11
            java.lang.Object r12 = r5.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r5.A01
            X.6dc r10 = (X.C311976dc) r10
            X.0eS.A00(r1)
        L_0x0070:
            r7 = r1
            X.7ud r7 = (X.C346117ud) r7
            if (r7 == 0) goto L_0x0033
            if (r11 == 0) goto L_0x00a6
            int r2 = r11.intValue()
        L_0x007b:
            r5.A01 = r7
            r5.A02 = r9
            r5.A03 = r9
            r5.A00 = r3
            java.lang.String r1 = "\n        SELECT * FROM effects effect \n        INNER JOIN effect_collections_effects ref ON effect.effectId = ref.effectId \n        WHERE ref.collectionId=? ORDER BY ref.`order`\n        LIMIT ?\n  "
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r4 = X.1Wa.A00(r1, r3)
            r4.ADh(r8, r12)
            long r0 = (long) r2
            r4.ADa(r3, r0)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            X.3oI r2 = r10.A07
            X.7ue r1 = new X.7ue
            r1.<init>(r4, r10)
            r0 = 0
            java.lang.Object r1 = X.1wR.A00(r3, r2, r1, r5, r0)
            if (r1 != r6) goto L_0x002c
            return r6
        L_0x00a6:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x007b
        L_0x00aa:
            X.MED r5 = new X.MED
            r5.<init>(r10, r13, r3)
            goto L_0x0016
        L_0x00b1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311976dc.A03(X.6dc, java.lang.Integer, java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A04(X.C311976dc r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 44
            boolean r0 = X.C66144MDw.A02(r3, r8)
            if (r0 == 0) goto L_0x0075
            r5 = r8
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r0) goto L_0x0042
            if (r1 == r2) goto L_0x005b
            if (r1 != r3) goto L_0x007b
            X.0eS.A00(r6)
        L_0x002a:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x002d:
            X.0eS.A00(r6)
            r5.A01 = r7
            r5.A00 = r0
            X.3oI r1 = r7.A07
            X.Arm r0 = new X.Arm
            r0.<init>(r7)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x0049
            return r4
        L_0x0042:
            java.lang.Object r7 = r5.A01
            X.6dc r7 = (X.C311976dc) r7
            X.0eS.A00(r6)
        L_0x0049:
            r5.A01 = r7
            r5.A00 = r2
            X.3oI r1 = r7.A07
            X.Arn r0 = new X.Arn
            r0.<init>(r7)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x0062
            return r4
        L_0x005b:
            java.lang.Object r7 = r5.A01
            X.6dc r7 = (X.C311976dc) r7
            X.0eS.A00(r6)
        L_0x0062:
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            X.3oI r1 = r7.A07
            X.Aro r0 = new X.Aro
            r0.<init>(r7)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x002a
            return r4
        L_0x0075:
            X.MDw r5 = new X.MDw
            r5.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x007b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311976dc.A04(X.6dc, X.4D7):java.lang.Object");
    }

    public C311976dc(C251983oI r2) {
        this.A07 = r2;
        this.A04 = new C311986dd(r2, this);
        this.A05 = new C311996de(r2, this);
        this.A06 = new C312006df(r2, this);
        this.A00 = new C312016dg(r2, this);
        this.A01 = new C312026dh(r2, this);
        this.A03 = new C312036di(r2, this);
        this.A0D = new C312046dj(r2, this);
        this.A02 = new C312056dk(r2, this);
        this.A08 = new C312066dl(r2, this);
        this.A0C = new C312076dm(r2, this);
        this.A09 = new C312086dn(r2, this);
        this.A0A = new C312096do(r2, this);
        this.A0B = new C312106dp(r2, this);
    }

    public C311976dc() {
    }
}
