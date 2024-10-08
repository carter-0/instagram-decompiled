package X;

/* renamed from: X.93J  reason: invalid class name */
public final class AnonymousClass93J {
    public final 1Vf A00;
    public final C251983oI A01;
    public final 1Vg A02;
    public final 1Vg A03;
    public final 1Vg A04;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JYA, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(X.AnonymousClass93J r8, java.lang.String r9, java.util.Collection r10, X.AnonymousClass4D7 r11, long r12) {
        /*
            r7 = 2
            boolean r0 = X.JYA.A01(r7, r11)
            if (r0 == 0) goto L_0x002d
            r5 = r11
            X.JYA r5 = (X.JYA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r6 = 3
            r0 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 == r0) goto L_0x004c
            if (r1 == r7) goto L_0x0080
            if (r1 == r6) goto L_0x0080
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002d:
            X.JYA r5 = new X.JYA
            r5.<init>(r8, r11, r7)
            goto L_0x0015
        L_0x0033:
            X.0eS.A00(r2)
            r5.A02 = r8
            r5.A03 = r10
            r5.A01 = r12
            r5.A00 = r0
            X.3oI r1 = r8.A01
            X.AsK r0 = new X.AsK
            r0.<init>(r8, r9)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x0059
            return r4
        L_0x004c:
            long r12 = r5.A01
            java.lang.Object r10 = r5.A03
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r8 = r5.A02
            X.93J r8 = (X.AnonymousClass93J) r8
            X.0eS.A00(r2)
        L_0x0059:
            r2 = 0
            r1 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0074
            r5.A02 = r1
            r5.A03 = r1
            r5.A00 = r7
        L_0x0066:
            X.3oI r1 = r8.A01
            X.AsJ r0 = new X.AsJ
            r0.<init>(r8, r10)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r5)
            if (r0 != r4) goto L_0x0083
            return r4
        L_0x0074:
            int r0 = (int) r12
            java.util.List r10 = X.00k.A0d(r10, r0)
            r5.A02 = r1
            r5.A03 = r1
            r5.A00 = r6
            goto L_0x0066
        L_0x0080:
            X.0eS.A00(r2)
        L_0x0083:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93J.A00(X.93J, java.lang.String, java.util.Collection, X.4D7, long):java.lang.Object");
    }

    public AnonymousClass93J(C251983oI r2) {
        this.A01 = r2;
        this.A00 = new C60719Jq8(r2, this);
        this.A03 = new AnonymousClass9Z4(r2, this);
        this.A02 = new AnonymousClass9Z5(r2, this);
        this.A04 = new AnonymousClass9Z6(r2, this);
    }

    public AnonymousClass93J() {
    }
}
