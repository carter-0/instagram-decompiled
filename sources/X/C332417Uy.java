package X;

/* renamed from: X.7Uy  reason: invalid class name and case insensitive filesystem */
public final class C332417Uy {
    public final 1Vf A00;
    public final 1Vf A01;
    public final C251983oI A02;
    public final 1Vg A03;
    public final 1Vg A04;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.Avj, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(X.C332417Uy r19, X.C332407Ux r20, java.lang.String r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r3 = r23
            r13 = r20
            r4 = r19
            r5 = r21
            r10 = r22
            boolean r0 = r3 instanceof X.C41541Avj
            if (r0 == 0) goto L_0x0132
            r7 = r3
            X.Avj r7 = (X.C41541Avj) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0132
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001c:
            java.lang.Object r0 = r7.A06
            X.1Hj r6 = X.1Hj.A02
            int r1 = r7.A00
            r16 = 1
            r9 = 4
            r14 = 3
            r12 = 2
            r11 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0039
            if (r1 == r11) goto L_0x0053
            if (r1 == r12) goto L_0x00a5
            if (r1 == r14) goto L_0x00ea
            if (r1 != r9) goto L_0x0139
            X.0eS.A00(r0)
        L_0x0036:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x0039:
            X.0eS.A00(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r7.A02 = r4
            r7.A03 = r13
            r7.A04 = r5
            r7.A05 = r10
            r7.A01 = r2
            r7.A00 = r11
            java.lang.Object r0 = r13.A03(r5, r7)
            if (r0 != r6) goto L_0x0068
            return r6
        L_0x0053:
            long r2 = r7.A01
            java.lang.Object r10 = r7.A05
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r7.A04
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r7.A03
            X.7Ux r13 = (X.C332407Ux) r13
            java.lang.Object r4 = r7.A02
            X.7Uy r4 = (X.C332417Uy) r4
            X.0eS.A00(r0)
        L_0x0068:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.00k.A0J(r0)
            X.9c6 r0 = (X.C381649c6) r0
            if (r0 == 0) goto L_0x00a2
            long r0 = r0.A01
        L_0x0074:
            long r0 = r0 + r16
            X.9c6 r18 = new X.9c6
            r19 = r5
            r20 = r0
            r22 = r2
            r18.<init>(r19, r20, r22)
            java.util.List r15 = java.util.Collections.singletonList(r18)
            X.0qQ.A07(r15)
            r7.A02 = r4
            r7.A03 = r13
            r7.A04 = r5
            r7.A05 = r10
            r7.A01 = r2
            r7.A00 = r12
            X.3oI r1 = r4.A02
            X.AsD r0 = new X.AsD
            r0.<init>(r4, r15)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r7)
            if (r0 != r6) goto L_0x00ba
            return r6
        L_0x00a2:
            r0 = 0
            goto L_0x0074
        L_0x00a5:
            long r2 = r7.A01
            java.lang.Object r10 = r7.A05
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r7.A04
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r13 = r7.A03
            X.7Ux r13 = (X.C332407Ux) r13
            java.lang.Object r4 = r7.A02
            X.7Uy r4 = (X.C332417Uy) r4
            X.0eS.A00(r0)
        L_0x00ba:
            if (r10 == 0) goto L_0x0036
            r7.A02 = r4
            r7.A03 = r5
            r7.A04 = r10
            r7.A05 = r8
            r7.A01 = r2
            r7.A00 = r14
            java.lang.String r1 = "\n        SELECT *\n        FROM user_impression_tracker\n        WHERE intervention_type = ? \n              AND user_id = ?\n      "
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r0 = X.1Wa.A00(r1, r12)
            r0.ADh(r11, r5)
            r0.ADh(r12, r10)
            android.os.CancellationSignal r12 = new android.os.CancellationSignal
            r12.<init>()
            X.3oI r11 = r13.A00
            X.AsG r1 = new X.AsG
            r1.<init>(r0, r13)
            r0 = 0
            java.lang.Object r0 = X.1wR.A00(r12, r11, r1, r7, r0)
            if (r0 != r6) goto L_0x00fb
            return r6
        L_0x00ea:
            long r2 = r7.A01
            java.lang.Object r10 = r7.A04
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r7.A03
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r7.A02
            X.7Uy r4 = (X.C332417Uy) r4
            X.0eS.A00(r0)
        L_0x00fb:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.00k.A0J(r0)
            X.9c9 r0 = (X.C381679c9) r0
            if (r0 == 0) goto L_0x012f
            long r12 = r0.A01
        L_0x0107:
            long r12 = r12 + r16
            X.9c9 r11 = new X.9c9
            r17 = r10
            r14 = r5
            r15 = r2
            r11.<init>(r12, r14, r15, r17)
            java.util.List r2 = java.util.Collections.singletonList(r11)
            X.0qQ.A07(r2)
            r7.A02 = r8
            r7.A03 = r8
            r7.A04 = r8
            r7.A00 = r9
            X.3oI r1 = r4.A02
            X.AsE r0 = new X.AsE
            r0.<init>(r4, r2)
            java.lang.Object r0 = X.1wR.A01(r1, r0, r7)
            if (r0 != r6) goto L_0x0036
            return r6
        L_0x012f:
            r12 = 0
            goto L_0x0107
        L_0x0132:
            X.Avj r7 = new X.Avj
            r7.<init>(r4, r3)
            goto L_0x001c
        L_0x0139:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332417Uy.A00(X.7Uy, X.7Ux, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public C332417Uy(C251983oI r2) {
        this.A02 = r2;
        this.A00 = new AnonymousClass9Z0(r2, this);
        this.A01 = new AnonymousClass9Z1(r2, this);
        this.A03 = new AnonymousClass9Z2(r2, this);
        this.A04 = new AnonymousClass9Z3(r2, this);
    }

    public C332417Uy() {
    }
}
