package X;

/* renamed from: X.I1b  reason: case insensitive filesystem */
public final class C56547I1b {
    public static final C56547I1b A01 = new C56547I1b();
    public static final C56547I1b A02 = new C56547I1b();
    public final C285045Pl A00 = new C285045Pl(new AnonymousClass5VJ[16]);

    public final void A00() {
        C285045Pl r0 = this.A00;
        int i = r0.A00;
        if (i == 0) {
            throw AnonymousClass7TE.A0z("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        } else if (i > 0) {
            Object[] objArr = r0.A02;
            int i2 = 0;
            do {
                C267794cD r4 = (C267794cD) ((AnonymousClass5VJ) objArr[i2]);
                C267794cD r9 = r4.A03;
                C285045Pl r3 = null;
                while (r9 != null) {
                    if (r9 instanceof C268794e0) {
                        if (C56664I6t.A03((C268794e0) r9)) {
                            return;
                        }
                    } else if ((r9.A01 & 1024) != 0 && (r9 instanceof C267944cV)) {
                        int i3 = 0;
                        for (C267794cD r2 = ((C267944cV) r9).A00; r2 != null; r2 = r2.A02) {
                            if ((r2.A01 & 1024) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    r9 = r2;
                                } else {
                                    r3 = C51971G9r.A0P(r3);
                                    if (r9 != null) {
                                        r3.A09(r9);
                                        r9 = null;
                                    }
                                    r3.A09(r2);
                                }
                            }
                        }
                        if (i3 == 1) {
                        }
                    }
                    r9 = AnonymousClass5WH.A00(r3);
                }
                C267794cD r1 = r4.A03;
                if (r1.A08) {
                    C285045Pl r42 = new C285045Pl(new C267794cD[16]);
                    C267794cD r02 = r1.A02;
                    if (r02 == null) {
                        AnonymousClass5WH.A06(r42, r1);
                    } else {
                        r42.A09(r02);
                    }
                    while (true) {
                        int i4 = r42.A00;
                        if (i4 != 0) {
                            C267794cD A0N = C51968G9o.A0N(r42, i4);
                            if ((A0N.A00 & 1024) != 0) {
                                while (true) {
                                    if ((A0N.A01 & 1024) == 0) {
                                        A0N = A0N.A02;
                                        if (A0N == null) {
                                            break;
                                        }
                                    } else {
                                        C285045Pl r32 = null;
                                        do {
                                            if (A0N instanceof C268794e0) {
                                                if (C56664I6t.A03((C268794e0) A0N)) {
                                                    return;
                                                }
                                            } else if ((A0N.A01 & 1024) != 0 && (A0N instanceof C267944cV)) {
                                                int i5 = 0;
                                                for (C267794cD r22 = ((C267944cV) A0N).A00; r22 != null; r22 = r22.A02) {
                                                    if ((r22.A01 & 1024) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
                                                            A0N = r22;
                                                        } else {
                                                            r32 = C51971G9r.A0P(r32);
                                                            if (A0N != null) {
                                                                r32.A09(A0N);
                                                                A0N = null;
                                                            }
                                                            r32.A09(r22);
                                                        }
                                                    }
                                                }
                                                if (i5 == 1) {
                                                    continue;
                                                }
                                            }
                                            A0N = AnonymousClass5WH.A00(r32);
                                            continue;
                                        } while (A0N != null);
                                    }
                                }
                            } else {
                                AnonymousClass5WH.A06(r42, A0N);
                            }
                        } else {
                            i2++;
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("visitChildren called on an unattached node");
                }
            } while (i2 < i);
        }
    }

    public final void A01() {
        A02(C58900IzP.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x006c A[EDGE_INSN: B:64:0x006c->B:29:0x006c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.0sP r13) {
        /*
            r12 = this;
            X.I1b r0 = A02
            r11 = 0
            r8 = 1
            boolean r0 = X.C51969G9p.A1a(r12, r0)
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r0 == 0) goto L_0x00c3
            X.I1b r0 = A01
            if (r12 == r0) goto L_0x00be
            X.5Pl r0 = r12.A00
            int r7 = r0.A00
            if (r7 == 0) goto L_0x00b7
            if (r7 <= 0) goto L_0x0070
            java.lang.Object[] r6 = r0.A02
            r5 = 0
        L_0x001b:
            r1 = r6[r5]
            X.5VJ r1 = (X.AnonymousClass5VJ) r1
            r10 = 1024(0x400, float:1.435E-42)
            r0 = r1
            X.4cD r0 = (X.C267794cD) r0
            X.4cD r0 = r0.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x00b0
            r0 = 16
            X.4cD[] r0 = new X.C267794cD[r0]
            X.5Pl r4 = new X.5Pl
            r4.<init>(r0)
            X.4cD r1 = (X.C267794cD) r1
            X.4cD r9 = r1.A03
            X.4cD r0 = r9.A02
            if (r0 == 0) goto L_0x004b
            r4.A09(r0)
        L_0x003e:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x006c
            X.4cD r9 = X.C51968G9o.A0N(r4, r0)
            int r0 = r9.A00
            r0 = r0 & r10
            if (r0 != 0) goto L_0x0051
        L_0x004b:
            X.AnonymousClass5WH.A06(r4, r9)
            goto L_0x003e
        L_0x004f:
            if (r9 == 0) goto L_0x003e
        L_0x0051:
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00ad
            r3 = 0
        L_0x0057:
            boolean r0 = r9 instanceof X.C268794e0
            if (r0 == 0) goto L_0x0077
            X.4e0 r9 = (X.C268794e0) r9
            X.IFx r0 = r9.A0H()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0071
            boolean r0 = X.C51971G9r.A1a(r9, r13)
        L_0x0069:
            if (r0 == 0) goto L_0x00a3
            r11 = 1
        L_0x006c:
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x001b
        L_0x0070:
            return r11
        L_0x0071:
            r0 = 7
            boolean r0 = X.I7B.A06(r9, r13, r0)
            goto L_0x0069
        L_0x0077:
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r9 instanceof X.C267944cV
            if (r0 == 0) goto L_0x00a3
            r0 = r9
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0086:
            if (r2 == 0) goto L_0x00a8
            int r0 = r2.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0092
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x0095
            r9 = r2
        L_0x0092:
            X.4cD r2 = r2.A02
            goto L_0x0086
        L_0x0095:
            X.5Pl r3 = X.C51971G9r.A0P(r3)
            if (r9 == 0) goto L_0x009f
            r3.A09(r9)
            r9 = 0
        L_0x009f:
            r3.A09(r2)
            goto L_0x0092
        L_0x00a3:
            X.4cD r9 = X.AnonymousClass5WH.A00(r3)
            goto L_0x00aa
        L_0x00a8:
            if (r1 != r8) goto L_0x00a3
        L_0x00aa:
            if (r9 == 0) goto L_0x003e
            goto L_0x0057
        L_0x00ad:
            X.4cD r9 = r9.A02
            goto L_0x004f
        L_0x00b0:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00b7:
            java.lang.String r0 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56547I1b.A02(X.0sP):boolean");
    }
}
