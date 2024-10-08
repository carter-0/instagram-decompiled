package X;

import com.facebook.common.dextricks.Constants;

public abstract class GQ7 {
    public static final AnonymousClass5Qr A00(C267804cE r10, Object obj) {
        AnonymousClass5RP r0;
        C267794cD r1 = ((C267794cD) r10).A03;
        if (r1.A08) {
            C267794cD r7 = r1.A04;
            AnonymousClass5R6 A02 = AnonymousClass5WH.A02(r10);
            while (A02 != null) {
                if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                    while (r7 != null) {
                        if ((r7.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            C267794cD r5 = r7;
                            C285045Pl r4 = null;
                            do {
                                if (r5 instanceof AnonymousClass5Qr) {
                                    AnonymousClass5Qr r52 = (AnonymousClass5Qr) r5;
                                    if (0qQ.A0K(obj, r52.C9j())) {
                                        return r52;
                                    }
                                } else if ((r5.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && (r5 instanceof C267944cV)) {
                                    int i = 0;
                                    for (C267794cD r2 = ((C267944cV) r5).A00; r2 != null; r2 = r2.A02) {
                                        if ((r2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r5 = r2;
                                            } else {
                                                r4 = C51973G9u.A0C(r4);
                                                if (r5 != null) {
                                                    r4.A09(r5);
                                                    r5 = null;
                                                }
                                                r4.A09(r2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                        continue;
                                    }
                                }
                                r5 = AnonymousClass5WH.A00(r4);
                                continue;
                            } while (r5 != null);
                        }
                        r7 = r7.A04;
                    }
                }
                A02 = A02.A0B();
                if (A02 == null || (r0 = A02.A0W) == null) {
                    r7 = null;
                } else {
                    r7 = r0.A05;
                }
            }
            return null;
        }
        throw AnonymousClass7TE.A0z("visitAncestors called on an unattached node");
    }

    public static final AnonymousClass5Qr A01(AnonymousClass5Qr r10) {
        AnonymousClass5RP r0;
        C267794cD r1 = ((C267794cD) r10).A03;
        if (r1.A08) {
            C267794cD r7 = r1.A04;
            AnonymousClass5R6 A02 = AnonymousClass5WH.A02(r10);
            while (A02 != null) {
                if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                    while (r7 != null) {
                        if ((r7.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            C267794cD r5 = r7;
                            C285045Pl r02 = null;
                            do {
                                if (r5 instanceof AnonymousClass5Qr) {
                                    AnonymousClass5Qr r52 = (AnonymousClass5Qr) r5;
                                    if (0qQ.A0K(r10.C9j(), r52.C9j()) && r10.getClass() == r52.getClass()) {
                                        return r52;
                                    }
                                } else if ((r5.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && (r5 instanceof C267944cV)) {
                                    int i = 0;
                                    for (C267794cD r3 = ((C267944cV) r5).A00; r3 != null; r3 = r3.A02) {
                                        if ((r3.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r5 = r3;
                                            } else {
                                                if (r02 == null) {
                                                    r02 = new C285045Pl(new C267794cD[16]);
                                                }
                                                if (r5 != null) {
                                                    r02.A09(r5);
                                                    r5 = null;
                                                }
                                                r02.A09(r3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                        continue;
                                    }
                                }
                                r5 = AnonymousClass5WH.A00(r02);
                                continue;
                            } while (r5 != null);
                        }
                        r7 = r7.A04;
                    }
                }
                A02 = A02.A0B();
                if (A02 == null || (r0 = A02.A0W) == null) {
                    r7 = null;
                } else {
                    r7 = r0.A05;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static final void A02(AnonymousClass5Qr r10, 0sP r11) {
        C267794cD r1 = ((C267794cD) r10).A03;
        if (r1.A08) {
            C267794cD r5 = r1.A04;
            AnonymousClass5R6 A02 = AnonymousClass5WH.A02(r10);
            if (A02 != null) {
                while (true) {
                    if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                        while (r5 != null) {
                            if ((r5.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                C267794cD r6 = r5;
                                C285045Pl r3 = null;
                                do {
                                    if (r6 instanceof AnonymousClass5Qr) {
                                        AnonymousClass5Qr r62 = (AnonymousClass5Qr) r6;
                                        if (0qQ.A0K(r10.C9j(), r62.C9j()) && r10.getClass() == r62.getClass() && !C51971G9r.A1a(r62, r11)) {
                                            return;
                                        }
                                    } else if ((r6.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && (r6 instanceof C267944cV)) {
                                        int i = 0;
                                        for (C267794cD r2 = ((C267944cV) r6).A00; r2 != null; r2 = r2.A02) {
                                            if ((r2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r6 = r2;
                                                } else {
                                                    r3 = C51973G9u.A0C(r3);
                                                    if (r6 != null) {
                                                        r3.A09(r6);
                                                        r6 = null;
                                                    }
                                                    r3.A09(r2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r6 = AnonymousClass5WH.A00(r3);
                                    continue;
                                } while (r6 != null);
                            }
                            r5 = r5.A04;
                        }
                    }
                    A02 = A02.A0B();
                    if (A02 != null) {
                        AnonymousClass5RP r0 = A02.A0W;
                        if (r0 != null) {
                            r5 = r0.A05;
                        } else {
                            r5 = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw AnonymousClass7TE.A0z("visitAncestors called on an unattached node");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3 A[EDGE_INSN: B:55:0x00a3->B:46:0x00a3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    public static final void A03(X.AnonymousClass5Qr r11, X.0sP r12) {
        /*
            r10 = 262144(0x40000, float:3.67342E-40)
            r0 = r11
            X.4cD r0 = (X.C267794cD) r0
            X.4cD r7 = r0.A03
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x0019
            r0 = 427(0x1ab, float:5.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0019:
            r0 = 16
            X.4cD[] r0 = new X.C267794cD[r0]
            X.5Pl r6 = new X.5Pl
            r6.<init>(r0)
            X.4cD r0 = r7.A02
            if (r0 == 0) goto L_0x00a8
            r6.A09(r0)
        L_0x0029:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x00ad
            r5 = 1
            X.4cD r7 = X.C51968G9o.A0N(r6, r0)
            int r0 = r7.A00
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00a8
            r0 = r7
        L_0x0038:
            int r1 = r0.A01
            r1 = r1 & r10
            if (r1 == 0) goto L_0x00a3
            r9 = 0
            r8 = r0
            r4 = r9
        L_0x0040:
            boolean r1 = r8 instanceof X.AnonymousClass5Qr
            if (r1 == 0) goto L_0x0074
            X.5Qr r8 = (X.AnonymousClass5Qr) r8
            java.lang.Object r2 = r11.C9j()
            java.lang.Object r1 = r8.C9j()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0071
            java.lang.Class r2 = r11.getClass()
            java.lang.Class r1 = r8.getClass()
            if (r2 != r1) goto L_0x0071
            java.lang.Object r2 = r12.invoke(r8)
        L_0x0062:
            X.GRZ r1 = X.GRZ.CancelTraversal
            if (r2 == r1) goto L_0x00ad
            X.GRZ r1 = X.GRZ.SkipSubtreeAndContinueTraversal
            if (r2 == r1) goto L_0x0029
        L_0x006a:
            X.4cD r8 = X.AnonymousClass5WH.A00(r4)
        L_0x006e:
            if (r8 == 0) goto L_0x00a3
            goto L_0x0040
        L_0x0071:
            X.GRZ r2 = X.GRZ.ContinueTraversal
            goto L_0x0062
        L_0x0074:
            int r1 = r8.A01
            r1 = r1 & r10
            if (r1 == 0) goto L_0x006a
            boolean r1 = r8 instanceof X.C267944cV
            if (r1 == 0) goto L_0x006a
            r1 = r8
            X.4cV r1 = (X.C267944cV) r1
            X.4cD r3 = r1.A00
            r2 = 0
        L_0x0083:
            if (r3 == 0) goto L_0x00a0
            int r1 = r3.A01
            r1 = r1 & r10
            if (r1 == 0) goto L_0x008f
            int r2 = r2 + 1
            if (r2 != r5) goto L_0x0092
            r8 = r3
        L_0x008f:
            X.4cD r3 = r3.A02
            goto L_0x0083
        L_0x0092:
            X.5Pl r4 = X.C51971G9r.A0P(r4)
            if (r8 == 0) goto L_0x009c
            r4.A09(r8)
            r8 = r9
        L_0x009c:
            r4.A09(r3)
            goto L_0x008f
        L_0x00a0:
            if (r2 != r5) goto L_0x006a
            goto L_0x006e
        L_0x00a3:
            X.4cD r0 = r0.A02
            if (r0 == 0) goto L_0x00a8
            goto L_0x0038
        L_0x00a8:
            X.AnonymousClass5WH.A06(r6, r7)
            goto L_0x0029
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQ7.A03(X.5Qr, X.0sP):void");
    }
}
