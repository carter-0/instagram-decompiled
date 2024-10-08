package X;

/* renamed from: X.5TT  reason: invalid class name */
public final class AnonymousClass5TT {
    public AnonymousClass5R6[] A00;
    public final C285045Pl A01 = new C285045Pl(new AnonymousClass5R6[16]);

    private final void A00(AnonymousClass5R6 r10) {
        AnonymousClass5SI r2 = r10.A0U;
        if (r2.A06 == AnonymousClass05K.A0Y && !r2.A0A && !r2.A0H && !r10.A0L && r2.A0J.A0E) {
            C267794cD r5 = r10.A0W.A02;
            if ((r5.A00 & 256) != 0) {
                do {
                    if ((r5.A01 & 256) != 0) {
                        C267794cD r7 = r5;
                        C285045Pl r0 = null;
                        do {
                            if (r7 instanceof AnonymousClass5VH) {
                                AnonymousClass5VH r72 = (AnonymousClass5VH) r7;
                                r72.DIA(AnonymousClass5WH.A04(r72, 256));
                            } else if ((r7.A01 & 256) != 0 && (r7 instanceof C267944cV)) {
                                int i = 0;
                                for (C267794cD r3 = ((C267944cV) r7).A00; r3 != null; r3 = r3.A02) {
                                    if ((r3.A01 & 256) != 0) {
                                        i++;
                                        if (i == 1) {
                                            r7 = r3;
                                        } else {
                                            if (r0 == null) {
                                                r0 = new C285045Pl(new C267794cD[16]);
                                            }
                                            if (r7 != null) {
                                                r0.A09(r7);
                                                r7 = null;
                                            }
                                            r0.A09(r3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                    continue;
                                }
                            }
                            r7 = AnonymousClass5WH.A00(r0);
                            continue;
                        } while (r7 != null);
                    }
                    if ((r5.A00 & 256) == 0) {
                        break;
                    }
                    r5 = r5.A02;
                } while (r5 == null);
            }
        }
        int i2 = 0;
        r10.A0M = false;
        C285045Pl A0A = r10.A0A();
        int i3 = A0A.A00;
        if (i3 > 0) {
            Object[] objArr = A0A.A02;
            do {
                A00((AnonymousClass5R6) objArr[i2]);
                i2++;
            } while (i2 < i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            X.5Pl r4 = r5.A01
            X.5dS r0 = X.C289355dS.A00
            r4.A07(r0)
            int r3 = r4.A00
            X.5R6[] r2 = r5.A00
            if (r2 == 0) goto L_0x0010
            int r0 = r2.length
            if (r0 >= r3) goto L_0x0018
        L_0x0010:
            r0 = 16
            int r0 = java.lang.Math.max(r0, r3)
            X.5R6[] r2 = new X.AnonymousClass5R6[r0]
        L_0x0018:
            r0 = 0
            r5.A00 = r0
            r1 = 0
        L_0x001c:
            if (r1 >= r3) goto L_0x0027
            java.lang.Object[] r0 = r4.A02
            r0 = r0[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0027:
            r4.A01()
        L_0x002a:
            int r3 = r3 + -1
            r0 = -1
            if (r0 >= r3) goto L_0x003c
            r1 = r2[r3]
            X.0qQ.A0A(r1)
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x002a
            r5.A00(r1)
            goto L_0x002a
        L_0x003c:
            r5.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5TT.A01():void");
    }
}
