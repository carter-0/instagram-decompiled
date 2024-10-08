package X;

public abstract class I3P {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.3EF} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.Il4, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r1 != r3.A00) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (((X.C58072Il4) r8).A05 != 2) goto L_0x000d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.AnonymousClass4D7 r8, X.0sL r9, long r10) {
        /*
            r2 = 2
            boolean r0 = r8 instanceof X.C58072Il4
            if (r0 == 0) goto L_0x000d
            r0 = r8
            X.Il4 r0 = (X.C58072Il4) r0
            int r1 = r0.A05
            r0 = 1
            if (r1 == r2) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x002f
            r7 = r8
            X.Il4 r7 = (X.C58072Il4) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001e:
            java.lang.Object r0 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r4) goto L_0x0065
            java.lang.Object r3 = r7.A03
            X.0rm r3 = (X.0rm) r3
            goto L_0x0035
        L_0x002f:
            X.Il4 r7 = new X.Il4
            r7.<init>(r8)
            goto L_0x001e
        L_0x0035:
            X.0eS.A00(r0)     // Catch:{ 3EF -> 0x005d }
            return r0
        L_0x0039:
            X.0eS.A00(r0)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            X.0rm r3 = X.C51965G9l.A11()
            r7.A02 = r9     // Catch:{ 3EF -> 0x005d }
            r7.A03 = r3     // Catch:{ 3EF -> 0x005d }
            r7.A01 = r10     // Catch:{ 3EF -> 0x005d }
            r7.A00 = r4     // Catch:{ 3EF -> 0x005d }
            X.JL0 r0 = new X.JL0     // Catch:{ 3EF -> 0x005d }
            r0.<init>(r7, r10)     // Catch:{ 3EF -> 0x005d }
            r3.A00 = r0     // Catch:{ 3EF -> 0x005d }
            java.lang.Object r0 = A02(r9, r0)     // Catch:{ 3EF -> 0x005d }
            if (r0 != r6) goto L_0x005c
            return r6
        L_0x005c:
            return r0
        L_0x005d:
            r2 = move-exception
            X.4Co r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0069
        L_0x0064:
            return r5
        L_0x0065:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
        L_0x0069:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3P.A01(X.4D7, X.0sL, long):java.lang.Object");
    }

    public static final Object A00(AnonymousClass4D7 r3, 0sL r4, long j) {
        if (j > 0) {
            return A02(r4, new JL0(r3, j));
        }
        throw new AnonymousClass3EF("Timed out immediately", (C262204Co) null);
    }

    public static final Object A02(0sL r5, JL0 jl0) {
        Object obj;
        Object A0D;
        jl0.CO3(new C59473JKx(C241603Pv.A04(jl0.A00.getContext()).CO5(jl0, jl0.A00, jl0.A00)));
        boolean z = false;
        try {
            if (!(r5 instanceof 1Em)) {
                obj = 1Ey.A00(jl0, jl0, r5);
            } else {
                0u4.A05(r5, 2);
                obj = r5.invoke(jl0, jl0);
            }
        } catch (Throwable th) {
            obj = new 1Hd(false, th);
        }
        1Hj r2 = 1Hj.A02;
        if (obj == r2 || (A0D = jl0.A0D(obj)) == 19H.A04) {
            return r2;
        }
        if (!(A0D instanceof 1Hd)) {
            return 19H.A00(A0D);
        }
        Throwable th2 = ((1Hd) A0D).A00;
        if (!(th2 instanceof AnonymousClass3EF) || ((AnonymousClass3EF) th2).A00 != jl0) {
            z = true;
        }
        if (!z) {
            if (!(obj instanceof 1Hd)) {
                return obj;
            }
            th2 = ((1Hd) obj).A00;
        }
        throw th2;
    }
}
