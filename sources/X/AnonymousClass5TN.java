package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5TN  reason: invalid class name */
public final class AnonymousClass5TN {
    public Constraints A00;
    public boolean A01;
    public boolean A02;
    public final C285045Pl A03 = new C285045Pl(new AnonymousClass5TU[16]);
    public final AnonymousClass5TO A04 = new AnonymousClass5TO();
    public final AnonymousClass5R6 A05;
    public final AnonymousClass5TT A06 = new AnonymousClass5TT();
    public final C285045Pl A07 = new C285045Pl(new AnonymousClass5RA[16]);

    private final void A03(AnonymousClass5R6 r3, boolean z) {
        boolean z2;
        AnonymousClass5SI r0 = r3.A0U;
        if (z) {
            z2 = r0.A0G;
        } else {
            z2 = r0.A0H;
        }
        if (z2) {
            AnonymousClass5TO r1 = this.A04;
            boolean contains = r1.A00.A00.contains(r3);
            if (!z) {
                if (!contains) {
                    contains = r1.A01.A00.contains(r3);
                }
                A0A(r3, z, false);
            }
            if (!contains) {
                return;
            }
            A0A(r3, z, false);
        }
    }

    public static final void A04(AnonymousClass5TN r14) {
        C285045Pl r12 = r14.A07;
        int i = r12.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = r12.A02;
            do {
                C268834e4 r8 = ((AnonymousClass5R6) ((AnonymousClass5RA) objArr[i2])).A0W.A06;
                0vu r0 = AnonymousClass5WB.A00;
                AnonymousClass5SH r6 = r8.A01;
                C267794cD A032 = C268054cg.A03(r8, true);
                while (A032 != null && (A032.A00 & 128) != 0) {
                    if ((A032.A01 & 128) != 0) {
                        C267794cD r4 = A032;
                        C285045Pl r02 = null;
                        do {
                            if (r4 instanceof AnonymousClass5VF) {
                                ((AnonymousClass5VF) r4).DXL(r8);
                            } else if ((r4.A01 & 128) != 0 && (r4 instanceof C267944cV)) {
                                int i3 = 0;
                                for (C267794cD r3 = ((C267944cV) r4).A00; r3 != null; r3 = r3.A02) {
                                    if ((r3.A01 & 128) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            r4 = r3;
                                        } else {
                                            if (r02 == null) {
                                                r02 = new C285045Pl(new C267794cD[16]);
                                            }
                                            if (r4 != null) {
                                                r02.A09(r4);
                                                r4 = null;
                                            }
                                            r02.A09(r3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                    continue;
                                }
                            }
                            r4 = AnonymousClass5WH.A00(r02);
                            continue;
                        } while (r4 != null);
                    }
                    if (A032 == r6) {
                        break;
                    }
                    A032 = A032.A02;
                }
                i2++;
            } while (i2 < i);
        }
        r12.A01();
    }

    public static final void A05(AnonymousClass5TN r7) {
        C285045Pl r72 = r7.A03;
        int i = r72.A00;
        if (i != 0) {
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r72.A02;
                do {
                    AnonymousClass5TU r1 = (AnonymousClass5TU) objArr[i2];
                    if (r1.A00.A0A != null) {
                        if (!r1.A02) {
                            r1.A00.A0a(r1.A01, true, false);
                        } else {
                            r1.A00.A0Z(r1.A01, true, false);
                        }
                    }
                    i2++;
                } while (i2 < i);
            }
            r72.A01();
        }
    }

    public static final boolean A06(AnonymousClass5R6 r2) {
        AnonymousClass5SJ r22 = r2.A0U.A0J;
        if (r22.A09 != AnonymousClass05K.A00) {
            AnonymousClass5SM r0 = r22.A0O;
            r0.A06();
            if (r0.A00 != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A07(AnonymousClass5R6 r3) {
        Integer num;
        AnonymousClass5SM r0;
        C290225ey r32 = r3.A0U.A05;
        if (r32 != null) {
            num = r32.A05;
        } else {
            num = AnonymousClass05K.A0C;
        }
        if (num != AnonymousClass05K.A00) {
            if (r32 == null || (r0 = r32.A0I) == null) {
                return false;
            }
            r0.A06();
            if (r0.A00 != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(X.AnonymousClass5R6 r6, androidx.compose.ui.unit.Constraints r7) {
        /*
            X.5R6 r0 = r6.A08
            r5 = 0
            if (r0 != 0) goto L_0x0006
            return r5
        L_0x0006:
            X.5SI r4 = r6.A0U
            X.5ey r0 = r4.A05
            if (r7 == 0) goto L_0x0040
            X.0qQ.A0A(r0)
        L_0x000f:
            long r1 = r7.A00
            boolean r3 = r0.A0N(r1)
        L_0x0015:
            X.5R6 r2 = r6.A0B()
            if (r3 == 0) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            X.5R6 r0 = r2.A08
            if (r0 != 0) goto L_0x0026
            r0 = 1
            r2.A0a(r5, r0, r5)
        L_0x0025:
            return r3
        L_0x0026:
            X.5ey r0 = r4.A05
            if (r0 == 0) goto L_0x0035
            java.lang.Integer r1 = r0.A05
        L_0x002c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0038
            r0 = 1
            r2.A0Z(r5, r0, r5)
            return r3
        L_0x0035:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x002c
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0025
            r2.A0X(r5)
            return r3
        L_0x0040:
            if (r0 == 0) goto L_0x0047
            androidx.compose.ui.unit.Constraints r7 = r0.A04
            if (r7 == 0) goto L_0x0047
            goto L_0x000f
        L_0x0047:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TN.A08(X.5R6, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.AnonymousClass5R6 r5, androidx.compose.ui.unit.Constraints r6) {
        /*
            if (r6 != 0) goto L_0x0011
            X.5SI r0 = r5.A0U
            X.5SJ r4 = r0.A0J
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x0041
            long r0 = r4.A04
            androidx.compose.ui.unit.Constraints r6 = new androidx.compose.ui.unit.Constraints
            r6.<init>(r0)
        L_0x0011:
            java.lang.Integer r1 = r5.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x001a
            r5.A0H()
        L_0x001a:
            X.5SI r0 = r5.A0U
            X.5SJ r4 = r0.A0J
            long r0 = r6.A00
            boolean r3 = r4.A0O(r0)
        L_0x0024:
            X.5R6 r2 = r5.A0B()
            if (r3 == 0) goto L_0x0037
            if (r2 == 0) goto L_0x0037
            java.lang.Integer r1 = r4.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0038
            r1 = 0
            r0 = 1
            r2.A0a(r1, r0, r1)
        L_0x0037:
            return r3
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0037
            r0 = 0
            r2.A0Y(r0)
            return r3
        L_0x0041:
            r3 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TN.A09(X.5R6, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d6, code lost:
        if (r0.A00 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0A(X.AnonymousClass5R6 r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r8.A0L
            r4 = 0
            if (r0 != 0) goto L_0x004b
            X.5SI r3 = r8.A0U
            X.5SJ r2 = r3.A0J
            boolean r0 = r2.A0E
            r1 = 1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x00a6
            boolean r0 = A06(r8)
            if (r0 == 0) goto L_0x00a6
        L_0x001c:
            X.5R6 r6 = r7.A05
            if (r8 != r6) goto L_0x00a4
            androidx.compose.ui.unit.Constraints r5 = r7.A00
            X.0qQ.A0A(r5)
        L_0x0025:
            if (r9 == 0) goto L_0x004c
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x002f
            boolean r4 = A08(r8, r5)
        L_0x002f:
            if (r10 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0037
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0048
        L_0x0037:
            java.lang.Boolean r2 = r8.A0D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0048
            r8.A0N()
        L_0x0048:
            A05(r7)
        L_0x004b:
            return r4
        L_0x004c:
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x00a2
            boolean r5 = A09(r8, r5)
        L_0x0054:
            if (r10 == 0) goto L_0x009c
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x009c
            if (r8 == r6) goto L_0x006e
            X.5R6 r0 = r8.A0B()
            if (r0 == 0) goto L_0x009c
            X.5SI r0 = r0.A0U
            X.5SJ r0 = r0.A0J
            boolean r0 = r0.A0E
            if (r0 != r1) goto L_0x009c
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x009c
        L_0x006e:
            if (r8 != r6) goto L_0x009e
            java.lang.Integer r3 = r8.A0F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 != r0) goto L_0x0079
            X.AnonymousClass5R6.A07(r8)
        L_0x0079:
            X.5R6 r0 = r8.A0B()
            if (r0 == 0) goto L_0x0087
            X.5RP r0 = r0.A0W
            X.4e4 r0 = r0.A06
            X.4cl r3 = r0.A05
            if (r3 != 0) goto L_0x0090
        L_0x0087:
            X.4co r0 = X.AnonymousClass5RJ.A00(r8)
            X.4cm r3 = new X.4cm
            r3.<init>(r0)
        L_0x0090:
            r3.A07(r2, r4, r4)
        L_0x0093:
            X.5TT r0 = r7.A06
            X.5Pl r0 = r0.A01
            r0.A09(r8)
            r8.A0M = r1
        L_0x009c:
            r4 = r5
            goto L_0x0048
        L_0x009e:
            r8.A0Q()
            goto L_0x0093
        L_0x00a2:
            r5 = 0
            goto L_0x0054
        L_0x00a4:
            r5 = 0
            goto L_0x0025
        L_0x00a6:
            java.lang.Boolean r5 = r8.A0D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x00c0
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x00c0
            goto L_0x001c
        L_0x00c0:
            X.5SM r0 = r2.A0O
            r0.A06()
            X.5SK r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            X.5ey r0 = r3.A05
            if (r0 == 0) goto L_0x004b
            X.5SM r0 = r0.A0I
            if (r0 == 0) goto L_0x004b
            r0.A06()
            X.5SK r0 = r0.A00
            if (r0 == 0) goto L_0x004b
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TN.A0A(X.5R6, boolean, boolean):boolean");
    }

    public final void A0B(AnonymousClass5R6 r2, boolean z) {
        AnonymousClass5TP r0;
        boolean z2;
        AnonymousClass5TO r02 = this.A04;
        if (z) {
            r0 = r02.A00;
        } else {
            r0 = r02.A01;
        }
        if (!r0.A00.isEmpty()) {
            if (!this.A02) {
                I2E.A01("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            } else {
                AnonymousClass5SI r03 = r2.A0U;
                if (z) {
                    z2 = r03.A0G;
                } else {
                    z2 = r03.A0H;
                }
                if (!(!z2)) {
                    I2E.A00("node not yet measured");
                } else {
                    A02(r2, z);
                    return;
                }
            }
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean A0C(AnonymousClass5R6 r6, boolean z) {
        AnonymousClass5SI r4 = r6.A0U;
        int intValue = r4.A06.intValue();
        if (intValue == 1 || intValue == 0) {
            return false;
        }
        if (intValue == 3 || intValue == 2) {
            this.A03.A09(new AnonymousClass5TU(r6, false, z));
            return false;
        } else if (intValue != 4) {
            throw new RuntimeException();
        } else if (r4.A0H && !z) {
            return false;
        } else {
            r4.A0H = true;
            if (r6.A0L) {
                return false;
            }
            if (!r4.A0J.A0E && !A06(r6)) {
                return false;
            }
            AnonymousClass5R6 A0B = r6.A0B();
            if (A0B == null || !A0B.A0U.A0H) {
                this.A04.A00(r6, false);
            }
            if (!this.A01) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean A0D(C62320sa r10) {
        String str;
        AnonymousClass5R6 r8 = this.A05;
        if (r8.A0A == null) {
            str = "performMeasureAndLayout called with unattached root";
        } else if (!r8.A0U.A0J.A0E) {
            str = "performMeasureAndLayout called with unplaced root";
        } else if (!(!this.A02)) {
            str = "performMeasureAndLayout called during measure layout";
        } else {
            boolean z = false;
            if (this.A00 != null) {
                this.A02 = true;
                this.A01 = true;
                try {
                    AnonymousClass5TO r5 = this.A04;
                    boolean z2 = false;
                    if (!r5.A01()) {
                        while (!r5.A01()) {
                            AnonymousClass5TP r3 = r5.A00;
                            boolean z3 = !r3.A00.isEmpty();
                            if (!z3) {
                                r3 = r5.A01;
                            }
                            AnonymousClass5R6 r1 = (AnonymousClass5R6) r3.A00.first();
                            r3.A00(r1);
                            boolean A0A = A0A(r1, z3, true);
                            if (r1 == r8 && A0A) {
                                z2 = true;
                            }
                        }
                        if (r10 != null) {
                            r10.invoke();
                        }
                    }
                    this.A02 = false;
                    this.A01 = false;
                    z = z2;
                } catch (Throwable th) {
                    this.A02 = false;
                    this.A01 = false;
                    throw th;
                }
            }
            A04(this);
            return z;
        }
        I2E.A00(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass5TN(AnonymousClass5R6 r4) {
        this.A05 = r4;
    }

    public static final void A00(AnonymousClass5R6 r5, AnonymousClass5TN r6) {
        C285045Pl A0A = r5.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass5R6 r2 = (AnonymousClass5R6) objArr[i2];
                if (0qQ.A0K(r2.A0D(), true) && !r2.A0L) {
                    if (r6.A04.A00.A00.contains(r2)) {
                        r2.A0N();
                    }
                    A00(r2, r6);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A01(AnonymousClass5R6 r4, AnonymousClass5TN r5) {
        Constraints constraints;
        C285045Pl A0A = r4.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass5R6 r1 = (AnonymousClass5R6) objArr[i2];
                if (A06(r1)) {
                    if (!C289045cv.A00(r1)) {
                        A01(r1, r5);
                    } else if (!r1.A0L) {
                        if (r1 == r5.A05) {
                            constraints = r5.A00;
                            0qQ.A0A(constraints);
                        } else {
                            constraints = null;
                        }
                        A08(r1, constraints);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A02(AnonymousClass5R6 r8, boolean z) {
        boolean z2;
        C285045Pl A0A = r8.A0A();
        int i = A0A.A00;
        if (i > 0) {
            Object[] objArr = A0A.A02;
            int i2 = 0;
            do {
                AnonymousClass5R6 r2 = (AnonymousClass5R6) objArr[i2];
                if (z ? A07(r2) : A06(r2)) {
                    if (C289045cv.A00(r2) && !z) {
                        if (!r2.A0U.A0G || !this.A04.A00.A00.contains(r2)) {
                            A0B(r2, true);
                        } else {
                            A0A(r2, true, false);
                        }
                    }
                    A03(r2, z);
                    AnonymousClass5SI r0 = r2.A0U;
                    if (z) {
                        z2 = r0.A0G;
                    } else {
                        z2 = r0.A0H;
                    }
                    if (!z2) {
                        A02(r2, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        A03(r8, z);
    }
}
