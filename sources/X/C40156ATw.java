package X;

/* renamed from: X.ATw  reason: case insensitive filesystem */
public final class C40156ATw implements C370288w9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C353708It A02;

    public C40156ATw(C353708It r1, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.8Iy] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.9uP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.9uP, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DYh(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            java.util.List r2 = (java.util.List) r2
            r9 = 0
            X.0qQ.A0B(r2, r9)
            java.util.List r0 = X.AGy.A01
            java.util.Iterator r11 = r2.iterator()
            r8 = 0
            r10 = 0
            r7 = 0
            r6 = 0
        L_0x0012:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r3 = r11.next()
            X.AHB r3 = (X.AHB) r3
            java.lang.String r4 = r3.A01
            if (r4 == 0) goto L_0x0012
            java.util.List r5 = X.AGy.A01
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r9)
            r1 = 1
            if (r0 != 0) goto L_0x00b7
            r0 = 2
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r0)
            if (r0 != 0) goto L_0x00b7
            r0 = 3
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r0)
            if (r0 != 0) goto L_0x00b7
            r0 = 4
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r0)
            if (r0 != 0) goto L_0x00b7
            r0 = 5
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r0)
            if (r0 != 0) goto L_0x00b7
            r0 = 6
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r0)
            if (r0 != 0) goto L_0x00b7
            r0 = 7
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r0)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = X.AnonymousClass7TH.A0g(r4, r5, r1)
            if (r0 == 0) goto L_0x0067
            java.lang.Float r0 = r3.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x00b4
            float r0 = r0.floatValue()
        L_0x0065:
            float r1 = r1 - r0
        L_0x0066:
            float r8 = r8 + r1
        L_0x0067:
            r5 = 1063675494(0x3f666666, float:0.9)
            if (r10 != 0) goto L_0x0082
            java.util.List r0 = X.AGy.A02
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0082
            java.lang.Float r0 = r3.A00
            if (r0 == 0) goto L_0x0082
            float r1 = r0.floatValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            float r8 = r8 + r1
            r10 = 1
        L_0x0082:
            if (r7 != 0) goto L_0x009a
            java.util.List r0 = X.AGy.A04
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x009a
            java.lang.Float r0 = r3.A00
            if (r0 == 0) goto L_0x009a
            float r1 = r0.floatValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x009a
            float r8 = r8 + r1
            r7 = 1
        L_0x009a:
            if (r6 != 0) goto L_0x0012
            java.util.List r0 = X.AGy.A03
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0012
            java.lang.Float r0 = r3.A00
            if (r0 == 0) goto L_0x0012
            float r1 = r0.floatValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            float r8 = r8 + r1
            r6 = 1
            goto L_0x0012
        L_0x00b4:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0065
        L_0x00b7:
            float r1 = X.AHB.A00(r3)
            goto L_0x0066
        L_0x00bc:
            java.util.Iterator r14 = r2.iterator()
        L_0x00c0:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r2 = r14.next()
            X.AHB r2 = (X.AHB) r2
            X.8Iv r1 = r2.A03
            X.8Iv r0 = X.C353728Iv.EMBEDDINGS
            if (r1 != r0) goto L_0x00c0
            float[] r6 = r2.A02
            if (r6 == 0) goto L_0x00c0
            X.8It r11 = r15.A02
            int r7 = r15.A00
            long r2 = r15.A01
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            int r4 = r6.length
            r1 = 0
        L_0x00e2:
            if (r1 >= r4) goto L_0x00f0
            r0 = r6[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            int r1 = r1 + 1
            goto L_0x00e2
        L_0x00f0:
            X.8Iy r10 = new X.8Iy
            r10.<init>()
            r10.A00 = r5
            r5.size()
            X.8Iy r13 = r11.A00
            X.0qQ.A0B(r13, r9)
            java.util.List r12 = r10.A00
            int r6 = r12.size()
            r5 = 0
            r4 = 0
        L_0x0107:
            if (r4 >= r6) goto L_0x0119
            float r1 = X.AnonymousClass7TG.A00(r12, r4)
            java.util.List r0 = r13.A00
            float r0 = X.AnonymousClass7TG.A00(r0, r4)
            float r1 = r1 - r0
            float r1 = r1 * r1
            float r5 = r5 + r1
            int r4 = r4 + 1
            goto L_0x0107
        L_0x0119:
            if (r7 != 0) goto L_0x0121
            r11.A00 = r10
            java.util.List r1 = r11.A01
            monitor-enter(r1)
            goto L_0x0134
        L_0x0121:
            r0 = 1142292480(0x44160000, float:600.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c0
            r11.A00 = r10
            java.util.List r1 = r11.A01
            monitor-enter(r1)
            X.9uP r0 = new X.9uP     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r0.A01 = r7     // Catch:{ all -> 0x0145 }
            goto L_0x013b
        L_0x0134:
            X.9uP r0 = new X.9uP     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r0.A01 = r9     // Catch:{ all -> 0x0145 }
        L_0x013b:
            r0.A02 = r2     // Catch:{ all -> 0x0145 }
            r0.A00 = r8     // Catch:{ all -> 0x0145 }
            r1.add(r0)     // Catch:{ all -> 0x0145 }
            monitor-exit(r1)
            goto L_0x00c0
        L_0x0145:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40156ATw.DYh(java.lang.Object):void");
    }
}
