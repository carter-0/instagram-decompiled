package X;

/* renamed from: X.ATu  reason: case insensitive filesystem */
public final class C40154ATu implements C370288w9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C40159ATz A02;

    public C40154ATu(C40159ATz aTz, int i, long j) {
        this.A02 = aTz;
        this.A01 = j;
        this.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DYh(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.List r13 = (java.util.List) r13
            r3 = 0
            X.0qQ.A0B(r13, r3)
            java.util.Iterator r7 = r13.iterator()
        L_0x000a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r2 = r7.next()
            X.AHB r2 = (X.AHB) r2
            X.8Iv r1 = r2.A03
            X.8Iv r0 = X.C353728Iv.EMBEDDINGS
            if (r1 != r0) goto L_0x000a
            float[] r6 = r2.A02
            if (r6 == 0) goto L_0x000a
            X.ATz r0 = r12.A02
            long r1 = r12.A01
            int r5 = r12.A00
            java.util.List r4 = r0.A00
            X.A5y r0 = new X.A5y
            r0.<init>(r5, r6, r1)
            r4.add(r0)
            goto L_0x000a
        L_0x0031:
            X.ATz r0 = r12.A02
            java.util.List r2 = r0.A01
            java.util.List r0 = X.AGz.A01
            java.util.Iterator r11 = r13.iterator()
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
        L_0x003f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r4 = r11.next()
            X.AHB r4 = (X.AHB) r4
            java.lang.String r5 = r4.A01
            if (r5 == 0) goto L_0x003f
            java.util.List r1 = X.AGz.A01
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r3)
            r6 = 1
            if (r0 != 0) goto L_0x00ec
            r0 = 3
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 4
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 5
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 6
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 7
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 != 0) goto L_0x00ec
            r0 = 8
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 != 0) goto L_0x00ec
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r6)
            if (r0 != 0) goto L_0x0090
            r0 = 2
            boolean r0 = X.AnonymousClass7TH.A0g(r5, r1, r0)
            if (r0 == 0) goto L_0x009c
        L_0x0090:
            java.lang.Float r0 = r4.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x00e9
            float r0 = r0.floatValue()
        L_0x009a:
            float r1 = r1 - r0
        L_0x009b:
            float r10 = r10 + r1
        L_0x009c:
            r6 = 1063675494(0x3f666666, float:0.9)
            if (r9 != 0) goto L_0x00b7
            java.util.List r0 = X.AGz.A02
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00b7
            java.lang.Float r0 = r4.A00
            if (r0 == 0) goto L_0x00b7
            float r1 = r0.floatValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            float r10 = r10 + r1
            r9 = 1
        L_0x00b7:
            if (r8 != 0) goto L_0x00cf
            java.util.List r0 = X.AGz.A0C
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00cf
            java.lang.Float r0 = r4.A00
            if (r0 == 0) goto L_0x00cf
            float r1 = r0.floatValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
            float r10 = r10 + r1
            r8 = 1
        L_0x00cf:
            if (r7 != 0) goto L_0x003f
            java.util.List r0 = X.AGz.A0A
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x003f
            java.lang.Float r0 = r4.A00
            if (r0 == 0) goto L_0x003f
            float r1 = r0.floatValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            float r10 = r10 + r1
            r7 = 1
            goto L_0x003f
        L_0x00e9:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x009a
        L_0x00ec:
            float r1 = X.AHB.A00(r4)
            goto L_0x009b
        L_0x00f1:
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r2.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40154ATu.DYh(java.lang.Object):void");
    }
}
