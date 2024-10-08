package X;

/* renamed from: X.5VA  reason: invalid class name */
public final class AnonymousClass5VA {
    public boolean A00;
    public final C285045Pl A01 = new C285045Pl(new AnonymousClass5VB[16]);
    public final C285045Pl A02 = new C285045Pl(new AnonymousClass5VK[16]);
    public final C285045Pl A03 = new C285045Pl(new AnonymousClass5R6[16]);
    public final C285045Pl A04 = new C285045Pl(new AnonymousClass5VK[16]);
    public final C268124co A05;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4 A[EDGE_INSN: B:55:0x00a4->B:46:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    public static final void A00(X.C267794cD r10, X.AnonymousClass5VK r11, java.util.Set r12) {
        /*
            X.4cD r9 = r10.A03
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0010:
            r8 = 16
            X.4cD[] r0 = new X.C267794cD[r8]
            X.5Pl r7 = new X.5Pl
            r7.<init>(r0)
            X.4cD r0 = r9.A02
            if (r0 == 0) goto L_0x00a9
            r7.A09(r0)
        L_0x0020:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x00ae
            r6 = 1
            int r0 = r0 - r6
            java.lang.Object r9 = r7.A00(r0)
            X.4cD r9 = (X.C267794cD) r9
            int r0 = r9.A00
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00a9
            r0 = r9
        L_0x0033:
            int r1 = r0.A01
            r1 = r1 & 32
            if (r1 == 0) goto L_0x00a4
            r10 = 0
            r5 = r0
            r4 = r10
        L_0x003c:
            boolean r1 = r5 instanceof X.C268804e1
            if (r1 == 0) goto L_0x0067
            X.4e1 r5 = (X.C268804e1) r5
            boolean r1 = r5 instanceof X.AnonymousClass5VB
            if (r1 == 0) goto L_0x005a
            r2 = r5
            X.5VB r2 = (X.AnonymousClass5VB) r2
            X.5QQ r1 = r2.A00
            boolean r1 = r1 instanceof X.C288855cb
            if (r1 == 0) goto L_0x005a
            java.util.HashSet r1 = r2.A02
            boolean r1 = r1.contains(r11)
            if (r1 == 0) goto L_0x005a
            r12.add(r5)
        L_0x005a:
            X.6Ii r1 = r5.Bi2()
            boolean r1 = r1.A01(r11)
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x009a
            goto L_0x0020
        L_0x0067:
            int r1 = r5.A01
            r1 = r1 & 32
            if (r1 == 0) goto L_0x009a
            boolean r1 = r5 instanceof X.C267944cV
            if (r1 == 0) goto L_0x009a
            r1 = r5
            X.4cV r1 = (X.C267944cV) r1
            X.4cD r3 = r1.A00
            r2 = 0
        L_0x0077:
            if (r3 == 0) goto L_0x009f
            int r1 = r3.A01
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0084
            int r2 = r2 + 1
            if (r2 != r6) goto L_0x0087
            r5 = r3
        L_0x0084:
            X.4cD r3 = r3.A02
            goto L_0x0077
        L_0x0087:
            if (r4 != 0) goto L_0x0090
            X.4cD[] r1 = new X.C267794cD[r8]
            X.5Pl r4 = new X.5Pl
            r4.<init>(r1)
        L_0x0090:
            if (r5 == 0) goto L_0x0096
            r4.A09(r5)
            r5 = r10
        L_0x0096:
            r4.A09(r3)
            goto L_0x0084
        L_0x009a:
            X.4cD r5 = X.AnonymousClass5WH.A00(r4)
            goto L_0x00a1
        L_0x009f:
            if (r2 != r6) goto L_0x009a
        L_0x00a1:
            if (r5 == 0) goto L_0x00a4
            goto L_0x003c
        L_0x00a4:
            X.4cD r0 = r0.A02
            if (r0 == 0) goto L_0x00a9
            goto L_0x0033
        L_0x00a9:
            X.AnonymousClass5WH.A06(r7, r9)
            goto L_0x0020
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VA.A00(X.4cD, X.5VK, java.util.Set):void");
    }

    public AnonymousClass5VA(C268124co r4) {
        this.A05 = r4;
    }
}
