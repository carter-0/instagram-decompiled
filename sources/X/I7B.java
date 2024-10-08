package X;

public abstract class I7B {
    public static final long A00(AnonymousClass5VN r6, AnonymousClass5VN r7, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = r6.A01;
            f2 = r7.A02;
        } else if (i == 4) {
            f = r7.A01;
            f2 = r6.A02;
        } else if (i == 5) {
            f = r6.A03;
            f2 = r7.A00;
        } else if (i == 6) {
            f = r7.A03;
            f2 = r6.A00;
        } else {
            throw AnonymousClass7TE.A0z("This function should only be used for 2-D focus search");
        }
        long abs = (long) Math.abs(Math.max(0.0f, f - f2));
        if (i == 3 || i == 4) {
            float f7 = r6.A03;
            f3 = 2.0f;
            f4 = f7 + ((r6.A00 - f7) / 2.0f);
            f5 = r7.A03;
            f6 = r7.A00;
        } else {
            float f8 = r6.A01;
            f3 = 2.0f;
            f4 = f8 + ((r6.A02 - f8) / 2.0f);
            f5 = r7.A01;
            f6 = r7.A02;
        }
        long A00 = (long) AnonymousClass7TE.A00(f4, f5 + ((f6 - f5) / f3));
        return (13 * abs * abs) + (A00 * A00);
    }

    public static final C268794e0 A01(C285045Pl r12, AnonymousClass5VN r13, int i) {
        AnonymousClass5VN A02;
        if (AnonymousClass7TF.A1S(i, 3)) {
            A02 = r13.A02((r13.A02 - r13.A01) + 1.0f, 0.0f);
        } else if (i == 4) {
            A02 = r13.A02(-((r13.A02 - r13.A01) + 1.0f), 0.0f);
        } else if (i == 5) {
            A02 = r13.A02(0.0f, (r13.A00 - r13.A03) + 1.0f);
        } else if (i == 6) {
            A02 = r13.A02(0.0f, -((r13.A00 - r13.A03) + 1.0f));
        } else {
            throw AnonymousClass7TE.A0z("This function should only be used for 2-D focus search");
        }
        C268794e0 r11 = null;
        int i2 = r12.A00;
        if (i2 > 0) {
            int i3 = 0;
            Object[] objArr = r12.A02;
            do {
                C268794e0 r6 = (C268794e0) objArr[i3];
                if (C56608I4i.A03(r6)) {
                    AnonymousClass5VN A022 = C56608I4i.A02(r6);
                    if (A08(A022, r13, i) && (!A08(A02, r13, i) || A09(r13, A022, A02, i) || (!A09(r13, A02, A022, i) && A00(r13, A022, i) < A00(r13, A02, i)))) {
                        r11 = r6;
                        A02 = A022;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return r11;
    }

    public static final boolean A05(C268794e0 r5, AnonymousClass5VN r6, 0sP r7, int i) {
        AnonymousClass5VN r3 = r6;
        0sP r4 = r7;
        int i2 = i;
        if (A04(r5, r6, r7, i)) {
            return true;
        }
        return AnonymousClass7TG.A1X((Boolean) HRJ.A00(r5, new C59093J6a(i2, 3, (Object) r3, (Object) r4, (Object) r5), i));
    }

    public static final boolean A07(AnonymousClass5VN r3, AnonymousClass5VN r4, int i) {
        float f;
        float f2;
        if (AnonymousClass7TF.A1S(i, 3) || i == 4) {
            if (r3.A00 <= r4.A03) {
                return false;
            }
            f = r3.A03;
            f2 = r4.A00;
        } else if (i != 5 && i != 6) {
            throw AnonymousClass7TE.A0z("This function should only be used for 2-D focus search");
        } else if (r3.A02 <= r4.A01) {
            return false;
        } else {
            f = r3.A01;
            f2 = r4.A02;
        }
        if (f < f2) {
            return true;
        }
        return false;
    }

    public static final boolean A08(AnonymousClass5VN r3, AnonymousClass5VN r4, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (AnonymousClass7TF.A1S(i, 3)) {
            float f5 = r4.A02;
            float f6 = r3.A02;
            if (f5 <= f6 && r4.A01 < f6) {
                return false;
            }
            f3 = r4.A01;
            f4 = r3.A01;
        } else {
            if (i == 4) {
                float f7 = r4.A01;
                float f8 = r3.A01;
                if (f7 >= f8 && r4.A02 > f8) {
                    return false;
                }
                f = r4.A02;
                f2 = r3.A02;
            } else if (i == 5) {
                float f9 = r4.A00;
                float f10 = r3.A00;
                if (f9 <= f10 && r4.A03 < f10) {
                    return false;
                }
                f3 = r4.A03;
                f4 = r3.A03;
            } else if (i == 6) {
                float f11 = r4.A03;
                float f12 = r3.A03;
                if (f11 >= f12 && r4.A00 > f12) {
                    return false;
                }
                f = r4.A00;
                f2 = r3.A00;
            } else {
                throw AnonymousClass7TE.A0z("This function should only be used for 2-D focus search");
            }
            if (f < f2) {
                return true;
            }
            return false;
        }
        if (f3 > f4) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    public static final void A03(X.C285045Pl r9, X.C267804cE r10) {
        /*
            r8 = 1024(0x400, float:1.435E-42)
            X.4cD r10 = (X.C267794cD) r10
            X.4cD r6 = r10.A03
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0090
            r0 = 16
            X.4cD[] r0 = new X.C267794cD[r0]
            X.5Pl r5 = new X.5Pl
            r5.<init>(r0)
            X.4cD r0 = r6.A02
            if (r0 == 0) goto L_0x0028
            r5.A09(r0)
        L_0x001a:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x008f
            r4 = 1
            X.4cD r6 = X.C51968G9o.A0N(r5, r0)
            int r0 = r6.A00
            r0 = r0 & r8
            if (r0 != 0) goto L_0x002e
        L_0x0028:
            X.AnonymousClass5WH.A06(r5, r6)
            goto L_0x001a
        L_0x002c:
            if (r6 == 0) goto L_0x001a
        L_0x002e:
            int r0 = r6.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x008c
            r7 = 0
            r3 = r7
        L_0x0035:
            boolean r0 = r6 instanceof X.C268794e0
            if (r0 == 0) goto L_0x005d
            X.4e0 r6 = (X.C268794e0) r6
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0052
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x0052
            X.IFx r0 = r6.A0H()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0059
            r9.A09(r6)
        L_0x0052:
            X.4cD r6 = X.AnonymousClass5WH.A00(r3)
        L_0x0056:
            if (r6 == 0) goto L_0x001a
            goto L_0x0035
        L_0x0059:
            A03(r9, r6)
            goto L_0x0052
        L_0x005d:
            int r0 = r6.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0052
            boolean r0 = r6 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0052
            r0 = r6
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x0089
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0078
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x007b
            r6 = r2
        L_0x0078:
            X.4cD r2 = r2.A02
            goto L_0x006c
        L_0x007b:
            X.5Pl r3 = X.C51971G9r.A0P(r3)
            if (r6 == 0) goto L_0x0085
            r3.A09(r6)
            r6 = r7
        L_0x0085:
            r3.A09(r2)
            goto L_0x0078
        L_0x0089:
            if (r1 != r4) goto L_0x0052
            goto L_0x0056
        L_0x008c:
            X.4cD r6 = r6.A02
            goto L_0x002c
        L_0x008f:
            return
        L_0x0090:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7B.A03(X.5Pl, X.4cE):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    public static final boolean A04(X.C268794e0 r11, X.AnonymousClass5VN r12, X.0sP r13, int r14) {
        /*
            r1 = 16
            X.4e0[] r0 = new X.C268794e0[r1]
            r10 = 0
            X.5Pl r3 = new X.5Pl
            r3.<init>(r0)
            r9 = 1024(0x400, float:1.435E-42)
            X.4cD r7 = r11.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00a4
            X.4cD[] r0 = new X.C267794cD[r1]
            X.5Pl r6 = new X.5Pl
            r6.<init>(r0)
            X.4cD r0 = r7.A02
            if (r0 == 0) goto L_0x0032
            r6.A09(r0)
        L_0x0020:
            int r1 = r6.A00
            boolean r0 = X.AnonymousClass7TF.A1P(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0086
            X.4cD r7 = X.C51968G9o.A0N(r6, r1)
            int r0 = r7.A00
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0038
        L_0x0032:
            X.AnonymousClass5WH.A06(r6, r7)
            goto L_0x0020
        L_0x0036:
            if (r7 == 0) goto L_0x0020
        L_0x0038:
            int r0 = r7.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0080
            r8 = 0
            r5 = r8
        L_0x003f:
            boolean r0 = r7 instanceof X.C268794e0
            if (r0 == 0) goto L_0x0051
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x004a
            r3.A09(r7)
        L_0x004a:
            X.4cD r7 = X.AnonymousClass5WH.A00(r5)
        L_0x004e:
            if (r7 == 0) goto L_0x0020
            goto L_0x003f
        L_0x0051:
            int r0 = r7.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7 instanceof X.C267944cV
            if (r0 == 0) goto L_0x004a
            r0 = r7
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x007d
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x006c
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x006f
            r7 = r2
        L_0x006c:
            X.4cD r2 = r2.A02
            goto L_0x0060
        L_0x006f:
            X.5Pl r5 = X.C51971G9r.A0P(r5)
            if (r7 == 0) goto L_0x0079
            r5.A09(r7)
            r7 = r8
        L_0x0079:
            r5.A09(r2)
            goto L_0x006c
        L_0x007d:
            if (r1 != r4) goto L_0x004a
            goto L_0x004e
        L_0x0080:
            X.4cD r7 = r7.A02
            goto L_0x0036
        L_0x0083:
            r3.A0B(r1)
        L_0x0086:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x009c
            X.4e0 r1 = A01(r3, r12, r14)
            if (r1 == 0) goto L_0x009c
            X.IFx r0 = r1.A0H()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x009d
            boolean r10 = X.C51971G9r.A1a(r1, r13)
        L_0x009c:
            return r10
        L_0x009d:
            boolean r0 = A05(r1, r12, r13, r14)
            if (r0 == 0) goto L_0x0083
            return r4
        L_0x00a4:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7B.A04(X.4e0, X.5VN, X.0sP, int):boolean");
    }

    public static final boolean A06(C268794e0 r5, 0sP r6, int i) {
        float f;
        float f2;
        Object A01;
        C285045Pl r3 = new C285045Pl(new C268794e0[16]);
        A03(r3, r5);
        int i2 = r3.A00;
        if (i2 > 1) {
            if (i == 7) {
                i = 4;
            } else if (!(i == 4 || i == 6)) {
                if (i == 3 || i == 5) {
                    AnonymousClass5VN A02 = C56608I4i.A02(r5);
                    f = A02.A02;
                    f2 = A02.A00;
                    A01 = A01(r3, new AnonymousClass5VN(f, f2, f, f2), i);
                } else {
                    throw AnonymousClass7TE.A0z("This function should only be used for 2-D focus search");
                }
            }
            AnonymousClass5VN A022 = C56608I4i.A02(r5);
            f = A022.A01;
            f2 = A022.A03;
            A01 = A01(r3, new AnonymousClass5VN(f, f2, f, f2), i);
        } else if (i2 == 0) {
            return false;
        } else {
            A01 = r3.A02[0];
        }
        if (A01 != null) {
            return C51971G9r.A1a(A01, r6);
        }
        return false;
    }

    public static final Boolean A02(C268794e0 r7, AnonymousClass5VN r8, 0sP r9, int i) {
        boolean z;
        int A06 = C51969G9p.A06(r7);
        if (A06 != 1) {
            if (!(A06 == 0 || A06 == 2)) {
                if (A06 != 3) {
                    throw AnonymousClass7TE.A1K();
                } else if (r7.A0H().A0A) {
                    return (Boolean) r9.invoke(r7);
                } else {
                    if (r8 != null) {
                        z = A04(r7, r8, r9, i);
                    }
                }
            }
            z = A06(r7, r9, i);
        } else {
            C268794e0 A01 = C56608I4i.A01(r7);
            if (A01 != null) {
                int A062 = C51969G9p.A06(A01);
                if (A062 == 1) {
                    Boolean A02 = A02(A01, r8, r9, i);
                    if (!AnonymousClass7TF.A1Y(A02, false)) {
                        return A02;
                    }
                    if (r8 == null) {
                        if (A01.A0I() == C288905cg.ActiveParent) {
                            C268794e0 A00 = C56608I4i.A00(A01);
                            if (A00 != null) {
                                r8 = C56608I4i.A02(A00);
                            } else {
                                throw AnonymousClass7TE.A0z("ActiveParent must have a focusedChild");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Searching for active node in inactive hierarchy");
                        }
                    }
                } else if (A062 == 0 || A062 == 2) {
                    if (r8 == null) {
                        r8 = C56608I4i.A02(A01);
                    }
                } else if (A062 != 3) {
                    throw AnonymousClass7TE.A1K();
                } else {
                    throw AnonymousClass7TE.A0z("ActiveParent must have a focusedChild");
                }
                z = A05(r7, r8, r9, i);
            } else {
                throw AnonymousClass7TE.A0z("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r1 <= r0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r8 == 4) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r8 != 5) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r1 = r5.A03;
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = java.lang.Math.max(0.0f, r1 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r8 != 5) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r1 = r5.A03;
        r0 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r2 >= java.lang.Math.max(1.0f, r1 - r0)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r1 = r7.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r1 = r6.A03;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r8 != 3) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.AnonymousClass5VN r5, X.AnonymousClass5VN r6, X.AnonymousClass5VN r7, int r8) {
        /*
            boolean r0 = A07(r7, r5, r8)
            r4 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = A07(r6, r5, r8)
            if (r0 == 0) goto L_0x001c
            r0 = 3
            r2 = 3
            if (r8 != r0) goto L_0x001d
            float r1 = r5.A01
            float r0 = r7.A02
        L_0x0015:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            if (r8 != r2) goto L_0x0028
        L_0x001b:
            r4 = 1
        L_0x001c:
            return r4
        L_0x001d:
            r0 = 4
            if (r8 != r0) goto L_0x0054
            float r1 = r5.A02
            float r0 = r7.A01
        L_0x0024:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001b
        L_0x0028:
            r0 = 4
            if (r8 == r0) goto L_0x001b
            r3 = 5
            if (r8 != r3) goto L_0x004f
            float r1 = r5.A03
            float r0 = r6.A00
        L_0x0032:
            float r1 = r1 - r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r1)
            if (r8 != r3) goto L_0x004a
            float r1 = r5.A03
            float r0 = r7.A03
        L_0x003e:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x001c
            goto L_0x001b
        L_0x004a:
            float r1 = r7.A00
            float r0 = r5.A00
            goto L_0x003e
        L_0x004f:
            float r1 = r6.A03
            float r0 = r5.A00
            goto L_0x0032
        L_0x0054:
            r0 = 5
            if (r8 != r0) goto L_0x005c
            float r1 = r5.A03
            float r0 = r7.A00
            goto L_0x0015
        L_0x005c:
            r0 = 6
            if (r8 != r0) goto L_0x0064
            float r1 = r5.A00
            float r0 = r7.A03
            goto L_0x0024
        L_0x0064:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7B.A09(X.5VN, X.5VN, X.5VN, int):boolean");
    }
}
