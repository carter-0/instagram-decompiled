package X;

/* renamed from: X.5ci  reason: invalid class name and case insensitive filesystem */
public abstract class C288925ci {
    public static final C288905cg A00(AnonymousClass5VE r12) {
        C267794cD r122 = (C267794cD) r12;
        C267794cD r8 = r122.A03;
        C285045Pl r3 = null;
        while (r8 != null) {
            if (r8 instanceof C268794e0) {
                C288905cg A0I = ((C268794e0) r8).A0I();
                int ordinal = A0I.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    return A0I;
                }
            } else if ((r8.A01 & 1024) != 0 && (r8 instanceof C267944cV)) {
                int i = 0;
                for (C267794cD r2 = ((C267944cV) r8).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & 1024) != 0) {
                        i++;
                        if (i == 1) {
                            r8 = r2;
                        } else {
                            if (r3 == null) {
                                r3 = new C285045Pl(new C267794cD[16]);
                            }
                            if (r8 != null) {
                                r3.A09(r8);
                                r8 = null;
                            }
                            r3.A09(r2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            r8 = AnonymousClass5WH.A00(r3);
        }
        C267794cD r1 = r122.A03;
        if (r1.A08) {
            C285045Pl r82 = new C285045Pl(new C267794cD[16]);
            C267794cD r0 = r1.A02;
            if (r0 == null) {
                AnonymousClass5WH.A06(r82, r1);
            } else {
                r82.A09(r0);
            }
            while (true) {
                int i2 = r82.A00;
                if (i2 != 0) {
                    C267794cD r9 = (C267794cD) r82.A00(i2 - 1);
                    if ((r9.A00 & 1024) != 0) {
                        while (true) {
                            if ((r9.A01 & 1024) == 0) {
                                r9 = r9.A02;
                                if (r9 == null) {
                                    break;
                                }
                            } else {
                                C285045Pl r32 = null;
                                do {
                                    if (r9 instanceof C268794e0) {
                                        C288905cg A0I2 = ((C268794e0) r9).A0I();
                                        int ordinal2 = A0I2.ordinal();
                                        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                                            return A0I2;
                                        }
                                    } else if ((r9.A01 & 1024) != 0 && (r9 instanceof C267944cV)) {
                                        int i3 = 0;
                                        for (C267794cD r22 = ((C267944cV) r9).A00; r22 != null; r22 = r22.A02) {
                                            if ((r22.A01 & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    r9 = r22;
                                                } else {
                                                    if (r32 == null) {
                                                        r32 = new C285045Pl(new C267794cD[16]);
                                                    }
                                                    if (r9 != null) {
                                                        r32.A09(r9);
                                                        r9 = null;
                                                    }
                                                    r32.A09(r22);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                            continue;
                                        }
                                    }
                                    r9 = AnonymousClass5WH.A00(r32);
                                    continue;
                                } while (r9 != null);
                            }
                        }
                    } else {
                        AnonymousClass5WH.A06(r82, r9);
                    }
                } else {
                    return C288905cg.Inactive;
                }
            }
        } else {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
    }

    public static final void A01(C268794e0 r13) {
        C267794cD r6 = r13.A03;
        if (r6.A08) {
            C267794cD r0 = r6;
            AnonymousClass5R6 A02 = AnonymousClass5WH.A02(r13);
            if (A02 != null) {
                while (true) {
                    if ((A02.A0W.A02.A00 & 5120) != 0) {
                        while (r0 != null) {
                            int i = r0.A01;
                            if ((i & 5120) != 0) {
                                if (r0 != r6 && (i & 1024) != 0) {
                                    return;
                                }
                                if ((i & 4096) != 0) {
                                    C267794cD r5 = r0;
                                    C285045Pl r1 = null;
                                    do {
                                        if (r5 instanceof AnonymousClass5VE) {
                                            AnonymousClass5VE r52 = (AnonymousClass5VE) r5;
                                            r52.DGD(A00(r52));
                                        } else if ((r5.A01 & 4096) != 0 && (r5 instanceof C267944cV)) {
                                            int i2 = 0;
                                            for (C267794cD r4 = ((C267944cV) r5).A00; r4 != null; r4 = r4.A02) {
                                                if ((r4.A01 & 4096) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        r5 = r4;
                                                    } else {
                                                        if (r1 == null) {
                                                            r1 = new C285045Pl(new C267794cD[16]);
                                                        }
                                                        if (r5 != null) {
                                                            r1.A09(r5);
                                                            r5 = null;
                                                        }
                                                        r1.A09(r4);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                                continue;
                                            }
                                        }
                                        r5 = AnonymousClass5WH.A00(r1);
                                        continue;
                                    } while (r5 != null);
                                }
                            }
                            r0 = r0.A04;
                        }
                    }
                    A02 = A02.A0B();
                    if (A02 != null) {
                        AnonymousClass5RP r02 = A02.A0W;
                        if (r02 != null) {
                            r0 = r02.A05;
                        } else {
                            r0 = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
    }
}
