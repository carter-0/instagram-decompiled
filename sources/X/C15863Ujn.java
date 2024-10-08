package X;

/* renamed from: X.Ujn  reason: case insensitive filesystem */
public final class C15863Ujn extends 0ng {
    public final /* synthetic */ AnonymousClass8HJ A00;
    public final /* synthetic */ WUW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15863Ujn(AnonymousClass8HJ r4, WUW wuw) {
        super(77, 3, false, false);
        this.A01 = wuw;
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        if (X.0qQ.A0I((java.lang.Float) r7.second, r8.A01) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r8 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r1 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r1.length() <= 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r6 == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r2 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r2.length() != 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        X.0qQ.A0A(r2);
        r1 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r1.invoke(X.AnonymousClass7TE.A0v(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r7 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.WUW r3 = r14.A01
            X.8HT r1 = r3.A0A
            X.8HJ r9 = r14.A00
            java.lang.String r0 = r9.A00
            X.0qQ.A06(r0)
            r1.A01(r0)
            r2 = 0
            X.I09 r10 = r3.A09
            X.8HJ r0 = r3.A0K
            X.0qQ.A0B(r0, r2)
            java.util.Map r6 = r10.A04
            java.lang.Object r4 = r6.get(r0)
            X.A7b r4 = (X.C39735A7b) r4
            if (r4 == 0) goto L_0x0108
            float r0 = r4.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            float r0 = r4.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r1, r0)
        L_0x0031:
            java.util.concurrent.atomic.AtomicInteger r5 = r10.A05
            int r0 = r5.get()
            r4 = 5
            if (r0 == r4) goto L_0x0085
            java.lang.Object r8 = r6.get(r9)
            X.A7b r8 = (X.C39735A7b) r8
            if (r7 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x008a
            java.lang.Object r1 = r7.first
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r8.A00
            boolean r0 = X.0qQ.A0I(r1, r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r7.second
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r8.A01
            boolean r0 = X.0qQ.A0I(r1, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0060
        L_0x005d:
            r6 = 0
            if (r8 == 0) goto L_0x0088
        L_0x0060:
            java.lang.String r1 = r8.A04
            if (r1 == 0) goto L_0x0088
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0088
            if (r6 == 0) goto L_0x0088
            java.lang.String r2 = r8.A05
            if (r2 == 0) goto L_0x0076
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0077
        L_0x0076:
            r2 = r1
        L_0x0077:
            X.0qQ.A0A(r2)
            X.0sL r1 = r10.A02
            if (r1 == 0) goto L_0x0085
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.invoke(r0, r2)
        L_0x0085:
            r3.A0L = r9
            return
        L_0x0088:
            if (r7 == 0) goto L_0x00a2
        L_0x008a:
            java.lang.Object r6 = r7.first
            r1 = r6
            java.lang.Float r1 = (java.lang.Float) r1
            r0 = 0
            boolean r0 = X.0qQ.A0I(r1, r0)
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r1 = r7.second
            java.lang.Float r1 = (java.lang.Float) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = X.0qQ.A0I(r1, r0)
            if (r0 == 0) goto L_0x00ad
        L_0x00a2:
            X.8HJ r0 = r10.A09
            if (r0 == r9) goto L_0x0085
            boolean r0 = r5.compareAndSet(r2, r4)
            if (r0 == 0) goto L_0x0085
            goto L_0x00da
        L_0x00ad:
            X.0qQ.A06(r6)
            float r12 = X.AnonymousClass7TE.A04(r6)
            java.lang.Object r0 = r7.second
            X.0qQ.A06(r0)
            float r13 = X.AnonymousClass7TE.A04(r0)
            boolean r0 = r5.compareAndSet(r2, r4)
            if (r0 == 0) goto L_0x0085
            r0 = 0
            java.lang.String r0 = X.AnonymousClass457.A0C(r0, r2, r2)     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r11 = X.AnonymousClass457.A0B(r0)     // Catch:{ IOException -> 0x00f6 }
            X.0qQ.A07(r11)     // Catch:{ IOException -> 0x00f6 }
            X.0sa r0 = r10.A06     // Catch:{ IOException -> 0x00f6 }
            r0.invoke()     // Catch:{ IOException -> 0x00f6 }
            X.Io2 r8 = new X.Io2     // Catch:{ IOException -> 0x00f6 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x00f6 }
            goto L_0x00f2
        L_0x00da:
            r0 = 0
            java.lang.String r0 = X.AnonymousClass457.A0C(r0, r2, r2)     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r1 = X.AnonymousClass457.A0B(r0)     // Catch:{ IOException -> 0x00f6 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x00f6 }
            X.0sa r0 = r10.A06     // Catch:{ IOException -> 0x00f6 }
            r0.invoke()     // Catch:{ IOException -> 0x00f6 }
            r0 = 21
            X.IwS r8 = new X.IwS     // Catch:{ IOException -> 0x00f6 }
            r8.<init>(r9, r10, r1, r0)     // Catch:{ IOException -> 0x00f6 }
        L_0x00f2:
            X.I09.A00(r8)     // Catch:{ IOException -> 0x00f6 }
            goto L_0x0085
        L_0x00f6:
            r2 = move-exception
            r0 = 52
            java.lang.String r1 = X.Pxd.A00(r0)
            r0 = 168(0xa8, float:2.35E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0KC.A0F(r1, r0, r2)
            goto L_0x0085
        L_0x0108:
            r7 = 0
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15863Ujn.run():void");
    }
}
