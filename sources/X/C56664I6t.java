package X;

/* renamed from: X.I6t  reason: case insensitive filesystem */
public abstract class C56664I6t {
    public static final boolean A05(C268794e0 r3) {
        AnonymousClass6GW.A00(r3, new C58682Ivr(r3, 47));
        int A06 = C51969G9p.A06(r3);
        if (A06 != 1 && A06 != 3) {
            return true;
        }
        C286375Wc.A00(r3).A01.A09(r3, C288905cg.Active);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0061 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0126 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.C268794e0 r12, X.C268794e0 r13) {
        /*
            r11 = 1024(0x400, float:1.435E-42)
            X.4cD r1 = r13.A03
            boolean r0 = r1.A08
            java.lang.String r10 = "visitAncestors called on an unattached node"
            if (r0 == 0) goto L_0x0172
            X.4cD r9 = r1.A04
            X.5R6 r8 = X.AnonymousClass5WH.A02(r13)
        L_0x0010:
            r4 = 0
            r3 = 1
            r5 = 0
            if (r8 == 0) goto L_0x0073
            X.5RP r0 = r8.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0064
        L_0x001e:
            if (r9 == 0) goto L_0x0064
            int r0 = r9.A01
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0061
            r7 = r9
            r6 = r4
        L_0x0027:
            boolean r0 = r7 instanceof X.C268794e0
            if (r0 != 0) goto L_0x0074
            int r0 = r7.A01
            r0 = r0 & r11
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x005a
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x003a:
            if (r2 == 0) goto L_0x0057
            int r0 = r2.A01
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0046
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x0049
            r7 = r2
        L_0x0046:
            X.4cD r2 = r2.A02
            goto L_0x003a
        L_0x0049:
            X.5Pl r6 = X.C51971G9r.A0P(r6)
            if (r7 == 0) goto L_0x0053
            r6.A09(r7)
            r7 = r4
        L_0x0053:
            r6.A09(r2)
            goto L_0x0046
        L_0x0057:
            if (r1 != r3) goto L_0x005a
            goto L_0x005e
        L_0x005a:
            X.4cD r7 = X.AnonymousClass5WH.A00(r6)
        L_0x005e:
            if (r7 == 0) goto L_0x0061
            goto L_0x0027
        L_0x0061:
            X.4cD r9 = r9.A04
            goto L_0x001e
        L_0x0064:
            X.5R6 r8 = r8.A0B()
            if (r8 == 0) goto L_0x0071
            X.5RP r0 = r8.A0W
            if (r0 == 0) goto L_0x0071
            X.4cD r9 = r0.A05
            goto L_0x0010
        L_0x0071:
            r9 = r4
            goto L_0x0010
        L_0x0073:
            r7 = r4
        L_0x0074:
            boolean r0 = X.0qQ.A0K(r7, r12)
            if (r0 == 0) goto L_0x016b
            int r1 = X.C51969G9p.A06(r12)
            if (r1 == r5) goto L_0x00c8
            r0 = 2
            if (r1 == r0) goto L_0x0169
            if (r1 == r3) goto L_0x014c
            r0 = 3
            if (r1 != r0) goto L_0x0147
            X.4cD r1 = r12.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0142
            X.4cD r8 = r1.A04
            X.5R6 r7 = X.AnonymousClass5WH.A02(r12)
            if (r7 == 0) goto L_0x00ad
        L_0x0096:
            X.5RP r0 = r7.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r11
            if (r0 == 0) goto L_0x012a
        L_0x009f:
            if (r8 == 0) goto L_0x012a
            int r0 = r8.A01
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0126
            r6 = r8
            r5 = r4
        L_0x00a8:
            boolean r0 = r6 instanceof X.C268794e0
            if (r0 == 0) goto L_0x00f0
            r4 = r6
        L_0x00ad:
            X.4e0 r4 = (X.C268794e0) r4
            if (r4 != 0) goto L_0x00d8
            X.4co r0 = X.AnonymousClass5WH.A05(r12)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5QZ r0 = r0.A0S
            r1 = 0
            X.5QY r0 = (X.AnonymousClass5QY) r0
            X.0sL r0 = r0.A06
            java.lang.Object r0 = r0.invoke(r1, r1)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0169
        L_0x00c8:
            boolean r3 = A05(r13)
            X.5cg r1 = X.C288905cg.ActiveParent
            X.5Qd r0 = X.C286375Wc.A00(r12)
            X.0vr r0 = r0.A01
            r0.A09(r12, r1)
        L_0x00d7:
            return r3
        L_0x00d8:
            boolean r0 = A06(r4, r12)
            if (r0 == 0) goto L_0x0169
            boolean r3 = A06(r12, r13)
            X.5cg r1 = r12.A0I()
            X.5cg r0 = X.C288905cg.ActiveParent
            if (r1 != r0) goto L_0x013b
            if (r3 == 0) goto L_0x00d7
            X.C288925ci.A01(r4)
            return r3
        L_0x00f0:
            int r0 = r6.A01
            r0 = r0 & r11
            if (r0 == 0) goto L_0x011f
            boolean r0 = r6 instanceof X.C267944cV
            if (r0 == 0) goto L_0x011f
            r0 = r6
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x00ff:
            if (r2 == 0) goto L_0x011c
            int r0 = r2.A01
            r0 = r0 & r11
            if (r0 == 0) goto L_0x010b
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x010e
            r6 = r2
        L_0x010b:
            X.4cD r2 = r2.A02
            goto L_0x00ff
        L_0x010e:
            X.5Pl r5 = X.C51971G9r.A0P(r5)
            if (r6 == 0) goto L_0x0118
            r5.A09(r6)
            r6 = r4
        L_0x0118:
            r5.A09(r2)
            goto L_0x010b
        L_0x011c:
            if (r1 != r3) goto L_0x011f
            goto L_0x0123
        L_0x011f:
            X.4cD r6 = X.AnonymousClass5WH.A00(r5)
        L_0x0123:
            if (r6 == 0) goto L_0x0126
            goto L_0x00a8
        L_0x0126:
            X.4cD r8 = r8.A04
            goto L_0x009f
        L_0x012a:
            X.5R6 r7 = r7.A0B()
            if (r7 == 0) goto L_0x00ad
            X.5RP r0 = r7.A0W
            if (r0 == 0) goto L_0x0138
            X.4cD r8 = r0.A05
            goto L_0x0096
        L_0x0138:
            r8 = r4
            goto L_0x0096
        L_0x013b:
            java.lang.String r0 = "Deactivated node is focused"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0142:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0147:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x014c:
            X.4e0 r0 = X.C56608I4i.A01(r12)
            if (r0 == 0) goto L_0x0162
            X.4e0 r0 = X.C56608I4i.A01(r12)
            if (r0 == 0) goto L_0x015e
            boolean r0 = A07(r0, r5)
            if (r0 == 0) goto L_0x0169
        L_0x015e:
            A05(r13)
            return r3
        L_0x0162:
            java.lang.String r0 = "ActiveParent with no focused child"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0169:
            r3 = 0
            return r3
        L_0x016b:
            java.lang.String r0 = "Non child node cannot request focus."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0172:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56664I6t.A06(X.4e0, X.4e0):boolean");
    }

    public static final Boolean A00(C268794e0 r4, int i) {
        boolean z;
        C285195Qd A00 = C286375Wc.A00(r4);
        C58682Ivr ivr = new C58682Ivr(r4, 48);
        try {
            if (A00.A00) {
                C285195Qd.A00(A00);
            }
            A00.A00 = true;
            A00.A02.A09(ivr);
            int intValue = A02(r4, i).intValue();
            if (intValue == 0) {
                z = Boolean.valueOf(A04(r4));
            } else if (intValue == 2) {
                z = true;
            } else if (intValue == 1 || intValue == 3) {
                z = null;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            return z;
        } finally {
            C285195Qd.A01(A00);
        }
    }

    public static final Integer A01(C268794e0 r3, int i) {
        int A06 = C51969G9p.A06(r3);
        if (A06 != 0) {
            if (A06 == 2) {
                return AnonymousClass05K.A01;
            }
            if (A06 == 1) {
                C268794e0 A01 = C56608I4i.A01(r3);
                if (A01 != null) {
                    Integer A012 = A01(A01, i);
                    Integer num = AnonymousClass05K.A00;
                    if (A012 != num) {
                        return A012;
                    }
                    if (!r3.A02) {
                        r3.A02 = true;
                        try {
                            C56547I1b i1b = (C56547I1b) r3.A0H().A09.invoke(new I1T(i));
                            if (i1b != C56547I1b.A02) {
                                if (i1b == C56547I1b.A01) {
                                    num = AnonymousClass05K.A01;
                                } else if (i1b.A02(C58900IzP.A00)) {
                                    num = AnonymousClass05K.A0C;
                                } else {
                                    num = AnonymousClass05K.A0N;
                                }
                            }
                        } finally {
                            r3.A02 = false;
                        }
                    }
                    return num;
                }
                throw AnonymousClass7TE.A0w("ActiveParent with no focused child");
            } else if (A06 != 3) {
                throw AnonymousClass7TE.A1K();
            }
        }
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x006d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A02(X.C268794e0 r13, int r14) {
        /*
            int r0 = X.C51969G9p.A06(r13)
            r5 = 1
            r3 = 0
            if (r0 == r3) goto L_0x00fd
            r7 = 2
            if (r0 == r7) goto L_0x00fd
            if (r0 == r5) goto L_0x00e9
            r6 = 3
            if (r0 != r6) goto L_0x00e4
            r12 = 1024(0x400, float:1.435E-42)
            X.4cD r1 = r13.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00dd
            X.4cD r9 = r1.A04
            X.5R6 r8 = X.AnonymousClass5WH.A02(r13)
        L_0x001e:
            r11 = 0
            if (r8 == 0) goto L_0x007f
            X.5RP r0 = r8.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0070
        L_0x002a:
            if (r9 == 0) goto L_0x0070
            int r0 = r9.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x006d
            r4 = r9
            r10 = r11
        L_0x0033:
            boolean r0 = r4 instanceof X.C268794e0
            if (r0 != 0) goto L_0x0080
            int r0 = r4.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0066
            boolean r0 = r4 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0066
            r0 = r4
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0046:
            if (r2 == 0) goto L_0x0063
            int r0 = r2.A01
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0052
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0055
            r4 = r2
        L_0x0052:
            X.4cD r2 = r2.A02
            goto L_0x0046
        L_0x0055:
            X.5Pl r10 = X.C51973G9u.A0C(r10)
            if (r4 == 0) goto L_0x005f
            r10.A09(r4)
            r4 = r11
        L_0x005f:
            r10.A09(r2)
            goto L_0x0052
        L_0x0063:
            if (r1 != r5) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            X.4cD r4 = X.AnonymousClass5WH.A00(r10)
        L_0x006a:
            if (r4 == 0) goto L_0x006d
            goto L_0x0033
        L_0x006d:
            X.4cD r9 = r9.A04
            goto L_0x002a
        L_0x0070:
            X.5R6 r8 = r8.A0B()
            if (r8 == 0) goto L_0x007d
            X.5RP r0 = r8.A0W
            if (r0 == 0) goto L_0x007d
            X.4cD r9 = r0.A05
            goto L_0x001e
        L_0x007d:
            r9 = r11
            goto L_0x001e
        L_0x007f:
            r4 = r11
        L_0x0080:
            X.4e0 r4 = (X.C268794e0) r4
            if (r4 == 0) goto L_0x00fd
            int r0 = X.C51969G9p.A06(r4)
            if (r0 == r3) goto L_0x009a
            if (r0 == r7) goto L_0x00da
            if (r0 == r5) goto L_0x00d5
            if (r0 != r6) goto L_0x00d0
            java.lang.Integer r1 = A02(r4, r14)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x009a
            if (r1 != 0) goto L_0x00ff
        L_0x009a:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00fd
            r4.A01 = r5
            X.IFx r0 = r4.A0H()     // Catch:{ all -> 0x00cc }
            X.0sP r1 = r0.A08     // Catch:{ all -> 0x00cc }
            X.I1T r0 = new X.I1T     // Catch:{ all -> 0x00cc }
            r0.<init>(r14)     // Catch:{ all -> 0x00cc }
            java.lang.Object r1 = r1.invoke(r0)     // Catch:{ all -> 0x00cc }
            X.I1b r1 = (X.C56547I1b) r1     // Catch:{ all -> 0x00cc }
            X.I1b r0 = X.C56547I1b.A02     // Catch:{ all -> 0x00cc }
            if (r1 == r0) goto L_0x00fb
            X.I1b r0 = X.C56547I1b.A01     // Catch:{ all -> 0x00cc }
            if (r1 != r0) goto L_0x00bc
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x00cc }
            goto L_0x00c9
        L_0x00bc:
            X.IzP r0 = X.C58900IzP.A00     // Catch:{ all -> 0x00cc }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00c7
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00cc }
            goto L_0x00c9
        L_0x00c7:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00cc }
        L_0x00c9:
            r4.A01 = r3
            return r1
        L_0x00cc:
            r0 = move-exception
            r4.A01 = r3
            throw r0
        L_0x00d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d5:
            java.lang.Integer r1 = A02(r4, r14)
            return r1
        L_0x00da:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            return r1
        L_0x00dd:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00e4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e9:
            X.4e0 r0 = X.C56608I4i.A01(r13)
            if (r0 == 0) goto L_0x00f4
            java.lang.Integer r1 = A01(r0, r14)
            return r1
        L_0x00f4:
            java.lang.String r0 = "ActiveParent with no focused child"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00fb:
            r4.A01 = r3
        L_0x00fd:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x00ff:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56664I6t.A02(X.4e0, int):java.lang.Integer");
    }

    public static final boolean A03(C268794e0 r5) {
        C285195Qd A00 = C286375Wc.A00(r5);
        try {
            if (A00.A00) {
                C285195Qd.A00(A00);
            }
            A00.A00 = true;
            int A06 = C51969G9p.A06(r5);
            boolean z = true;
            if (A06 != 0) {
                if (A06 == 2) {
                    C286375Wc.A00(r5).A01.A09(r5, C288905cg.Active);
                    C288925ci.A01(r5);
                } else if (A06 == 1 || A06 == 3) {
                    z = false;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            return z;
        } finally {
            C285195Qd.A01(A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bb, code lost:
        if (r0 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0089 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.C268794e0 r11) {
        /*
            int r1 = X.C51969G9p.A06(r11)
            r3 = 0
            r8 = 1
            if (r1 == r3) goto L_0x00c0
            r0 = 2
            if (r1 == r0) goto L_0x00c0
            r6 = 0
            if (r1 == r8) goto L_0x009b
            r0 = 3
            if (r1 != r0) goto L_0x00c9
            r10 = 1024(0x400, float:1.435E-42)
            X.4cD r1 = r11.A03
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00c2
            X.4cD r9 = r1.A04
            X.5R6 r7 = X.AnonymousClass5WH.A02(r11)
            if (r7 == 0) goto L_0x0038
        L_0x0021:
            X.5RP r0 = r7.A0W
            X.4cD r0 = r0.A02
            int r0 = r0.A00
            r0 = r0 & r10
            if (r0 == 0) goto L_0x008c
        L_0x002a:
            if (r9 == 0) goto L_0x008c
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0089
            r5 = r6
            r4 = r9
        L_0x0033:
            boolean r0 = r4 instanceof X.C268794e0
            if (r0 == 0) goto L_0x0053
            r6 = r4
        L_0x0038:
            X.4e0 r6 = (X.C268794e0) r6
            if (r6 == 0) goto L_0x00a6
            X.5cg r1 = r6.A0I()
            boolean r3 = A06(r6, r11)
            if (r3 == 0) goto L_0x0052
            X.5cg r0 = r6.A0I()
            if (r1 == r0) goto L_0x004f
            X.C288925ci.A01(r6)
        L_0x004f:
            X.C288925ci.A01(r11)
        L_0x0052:
            return r3
        L_0x0053:
            int r0 = r4.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0082
            boolean r0 = r4 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0082
            r0 = r4
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0062:
            if (r2 == 0) goto L_0x007f
            int r0 = r2.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x006e
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x0071
            r4 = r2
        L_0x006e:
            X.4cD r2 = r2.A02
            goto L_0x0062
        L_0x0071:
            X.5Pl r5 = X.C51973G9u.A0C(r5)
            if (r4 == 0) goto L_0x007b
            r5.A09(r4)
            r4 = r6
        L_0x007b:
            r5.A09(r2)
            goto L_0x006e
        L_0x007f:
            if (r1 != r8) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            X.4cD r4 = X.AnonymousClass5WH.A00(r5)
        L_0x0086:
            if (r4 == 0) goto L_0x0089
            goto L_0x0033
        L_0x0089:
            X.4cD r9 = r9.A04
            goto L_0x002a
        L_0x008c:
            X.5R6 r7 = r7.A0B()
            if (r7 == 0) goto L_0x0038
            X.5RP r0 = r7.A0W
            if (r0 == 0) goto L_0x0099
            X.4cD r9 = r0.A05
            goto L_0x0021
        L_0x0099:
            r9 = r6
            goto L_0x0021
        L_0x009b:
            X.4e0 r0 = X.C56608I4i.A01(r11)
            if (r0 == 0) goto L_0x00bd
            boolean r0 = A07(r0, r3)
            goto L_0x00bb
        L_0x00a6:
            X.4co r0 = X.AnonymousClass5WH.A05(r11)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5QZ r0 = r0.A0S
            r1 = 0
            X.5QY r0 = (X.AnonymousClass5QY) r0
            X.0sL r0 = r0.A06
            java.lang.Object r0 = r0.invoke(r1, r1)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x00bb:
            if (r0 == 0) goto L_0x0052
        L_0x00bd:
            A05(r11)
        L_0x00c0:
            r3 = 1
            goto L_0x004f
        L_0x00c2:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00c9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56664I6t.A04(X.4e0):boolean");
    }

    public static final boolean A07(C268794e0 r2, boolean z) {
        int A06 = C51969G9p.A06(r2);
        if (A06 != 0) {
            if (A06 != 2) {
                if (A06 != 1) {
                    if (A06 != 3) {
                        throw AnonymousClass7TE.A1K();
                    }
                    return true;
                }
                C268794e0 A01 = C56608I4i.A01(r2);
                if (A01 != null && !A07(A01, z)) {
                    return false;
                }
            } else if (!z) {
                return z;
            } else {
                C286375Wc.A00(r2).A01.A09(r2, C288905cg.Inactive);
                C288925ci.A01(r2);
                return z;
            }
        }
        C286375Wc.A00(r2).A01.A09(r2, C288905cg.Inactive);
        C288925ci.A01(r2);
        return true;
    }
}
