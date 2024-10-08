package X;

/* renamed from: X.I4i  reason: case insensitive filesystem */
public abstract class C56608I4i {
    public static final C268794e0 A01(C268794e0 r9) {
        C268794e0 r4;
        int A06;
        C267794cD r1 = r9.A03;
        if (!r1.A08) {
            return null;
        }
        C285045Pl r6 = new C285045Pl(new C267794cD[16]);
        C267794cD r0 = r1.A02;
        if (r0 == null) {
            AnonymousClass5WH.A06(r6, r1);
        } else {
            r6.A09(r0);
        }
        loop0:
        while (true) {
            int i = r6.A00;
            if (i != 0) {
                C267794cD A0N = C51968G9o.A0N(r6, i);
                if ((A0N.A00 & 1024) != 0) {
                    while (true) {
                        if ((A0N.A01 & 1024) == 0) {
                            A0N = A0N.A02;
                            if (A0N == null) {
                                break;
                            }
                        } else {
                            C285045Pl r3 = null;
                            do {
                                if (A0N instanceof C268794e0) {
                                    r4 = (C268794e0) A0N;
                                    if (r4.A03.A08 && ((A06 = C51969G9p.A06(r4)) == 0 || A06 == 1 || A06 == 2)) {
                                        return r4;
                                    }
                                } else if ((A0N.A01 & 1024) != 0 && (A0N instanceof C267944cV)) {
                                    int i2 = 0;
                                    for (C267794cD r2 = ((C267944cV) A0N).A00; r2 != null; r2 = r2.A02) {
                                        if ((r2.A01 & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                A0N = r2;
                                            } else {
                                                r3 = C51971G9r.A0P(r3);
                                                if (A0N != null) {
                                                    r3.A09(A0N);
                                                    A0N = null;
                                                }
                                                r3.A09(r2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                        continue;
                                    }
                                }
                                A0N = AnonymousClass5WH.A00(r3);
                                continue;
                            } while (A0N != null);
                        }
                    }
                } else {
                    AnonymousClass5WH.A06(r6, A0N);
                }
            } else {
                return null;
            }
        }
        return r4;
    }

    public static final AnonymousClass5VN A02(C268794e0 r2) {
        C268054cg r22 = r2.A05;
        if (r22 != null) {
            return C289425dZ.A02(r22).CgV(r22, false);
        }
        return AnonymousClass5VN.A04;
    }

    public static final boolean A03(C268794e0 r2) {
        AnonymousClass5R6 r1;
        C268054cg r0 = r2.A05;
        if (r0 == null || (r1 = r0.A0H) == null || !r1.A0U.A0J.A0E || r1.A0A == null) {
            return false;
        }
        return true;
    }

    public static final C268794e0 A00(C268794e0 r9) {
        int A06 = C51969G9p.A06(r9);
        if (A06 != 0) {
            if (A06 == 1) {
                C267794cD r2 = r9.A03;
                if (r2.A08) {
                    C285045Pl r1 = new C285045Pl(new C267794cD[16]);
                    C267794cD r0 = r2.A02;
                    if (r0 == null) {
                        AnonymousClass5WH.A06(r1, r2);
                    } else {
                        r1.A09(r0);
                    }
                    loop3:
                    while (true) {
                        int i = r1.A00;
                        if (i != 0) {
                            C267794cD A0N = C51968G9o.A0N(r1, i);
                            if ((A0N.A00 & 1024) != 0) {
                                while (true) {
                                    if ((A0N.A01 & 1024) == 0) {
                                        A0N = A0N.A02;
                                        if (A0N == null) {
                                            break;
                                        }
                                    } else {
                                        C285045Pl r7 = null;
                                        do {
                                            if (A0N instanceof C268794e0) {
                                                r9 = A00((C268794e0) A0N);
                                                if (r9 != null) {
                                                    break loop3;
                                                }
                                            } else if ((A0N.A01 & 1024) != 0 && (A0N instanceof C267944cV)) {
                                                int i2 = 0;
                                                for (C267794cD r5 = ((C267944cV) A0N).A00; r5 != null; r5 = r5.A02) {
                                                    if ((r5.A01 & 1024) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            A0N = r5;
                                                        } else {
                                                            r7 = C51971G9r.A0P(r7);
                                                            if (A0N != null) {
                                                                r7.A09(A0N);
                                                                A0N = null;
                                                            }
                                                            r7.A09(r5);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                    continue;
                                                }
                                            }
                                            A0N = AnonymousClass5WH.A00(r7);
                                            continue;
                                        } while (A0N != null);
                                    }
                                }
                            } else {
                                AnonymousClass5WH.A06(r1, A0N);
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("visitChildren called on an unattached node");
                }
            } else if (A06 != 2) {
                if (A06 == 3) {
                    return null;
                }
                throw AnonymousClass7TE.A1K();
            }
        }
        return r9;
    }
}
