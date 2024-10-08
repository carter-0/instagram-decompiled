package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.5WB  reason: invalid class name */
public abstract class AnonymousClass5WB {
    public static final 0vu A00 = new 0vu(6);

    public static final int A00(AnonymousClass5QQ r2) {
        int i = 1;
        if (r2 instanceof C288835cZ) {
            i = 3;
        }
        if (r2 instanceof C288845ca) {
            i |= 4;
        }
        if (r2 instanceof C286355Ve) {
            i |= 8;
        }
        if (r2 instanceof C288345bl) {
            i |= 16;
        }
        if ((r2 instanceof C288855cb) || (r2 instanceof C288865cc)) {
            i |= 32;
        }
        if (r2 instanceof C288875cd) {
            i |= 256;
        }
        if (r2 instanceof C288885ce) {
            return i | 64;
        }
        return i;
    }

    static {
        0vu r0 = AnonymousClass01i.A00;
    }

    public static final int A01(C267794cD r4) {
        int i = r4.A01;
        if (i != 0) {
            return i;
        }
        0vu r3 = A00;
        Class<?> cls = r4.getClass();
        int A03 = r3.A03(cls);
        if (A03 >= 0) {
            return r3.A02[A03];
        }
        int i2 = 1;
        if (r4 instanceof C268434dO) {
            i2 = 3;
        }
        if (r4 instanceof C267814cG) {
            i2 |= 4;
        }
        if (r4 instanceof C267954cW) {
            i2 |= 8;
        }
        if (r4 instanceof AnonymousClass5VD) {
            i2 |= 16;
        }
        if (r4 instanceof C268804e1) {
            i2 |= 32;
        }
        if (r4 instanceof AnonymousClass5VI) {
            i2 |= 64;
        }
        if (r4 instanceof AnonymousClass5VF) {
            i2 |= 128;
        }
        if (r4 instanceof AnonymousClass5VH) {
            i2 |= 256;
        }
        if (r4 instanceof C268794e0) {
            i2 |= 1024;
        }
        if (r4 instanceof AnonymousClass5VG) {
            i2 |= C249703kE.FLAG_MOVED;
        }
        if (r4 instanceof AnonymousClass5VE) {
            i2 |= 4096;
        }
        if (r4 instanceof AnonymousClass5WC) {
            i2 |= 8192;
        }
        if (r4 instanceof AnonymousClass5WD) {
            i2 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        if (r4 instanceof C268824e3) {
            i2 |= Constants.LOAD_RESULT_PGO;
        }
        if (r4 instanceof AnonymousClass5Qr) {
            i2 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        }
        r3.A06(cls, i2);
        return i2;
    }

    public static final int A02(C267794cD r3) {
        if (!(r3 instanceof C267944cV)) {
            return A01(r3);
        }
        C267944cV r32 = (C267944cV) r3;
        int i = r32.A01;
        for (C267794cD r1 = r32.A00; r1 != null; r1 = r1.A02) {
            i |= A02(r1);
        }
        return i;
    }

    public static final void A03(C267794cD r2) {
        if (!r2.A08) {
            I2E.A01("autoInvalidateInsertedNode called on unattached node");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A05(r2, -1, 1);
        }
    }

    public static final void A04(C267794cD r2) {
        if (!r2.A08) {
            I2E.A01("autoInvalidateUpdatedNode called on unattached node");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A05(r2, -1, 0);
        }
    }

    public static final void A05(C267794cD r3, int i, int i2) {
        if (r3 instanceof C267944cV) {
            C267944cV r2 = (C267944cV) r3;
            int i3 = r2.A01;
            A06(r3, i3 & i, i2);
            int i4 = (i3 ^ -1) & i;
            for (C267794cD r0 = r2.A00; r0 != null; r0 = r0.A02) {
                A05(r0, i4, i2);
            }
            return;
        }
        A06(r3, i & r3.A01, i2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0160 A[EDGE_INSN: B:106:0x0160->B:97:0x0160 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ee  */
    public static final void A06(X.C267794cD r10, int r11, int r12) {
        /*
            if (r12 != 0) goto L_0x0009
            boolean r0 = r10.A0G()
            if (r0 != 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            r3 = 2
            r0 = r11 & 2
            if (r0 == 0) goto L_0x002a
            boolean r0 = r10 instanceof X.C268434dO
            if (r0 == 0) goto L_0x002a
            X.5R6 r0 = X.AnonymousClass5WH.A02(r10)
            r0.A0L()
            if (r12 != r3) goto L_0x002a
            X.4cg r1 = X.AnonymousClass5WH.A04(r10, r3)
            r0 = 1
            r1.A0C = r0
            X.0sa r0 = r1.A0I
            r0.invoke()
            r1.A0g()
        L_0x002a:
            r0 = 128(0x80, float:1.794E-43)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x003c
            boolean r0 = r10 instanceof X.AnonymousClass5VF
            if (r0 == 0) goto L_0x003c
            if (r12 == r3) goto L_0x003c
            X.5R6 r0 = X.AnonymousClass5WH.A02(r10)
            r0.A0L()
        L_0x003c:
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x006f
            boolean r0 = r10 instanceof X.AnonymousClass5VH
            if (r0 == 0) goto L_0x006f
            if (r12 == r3) goto L_0x006f
            X.5R6 r2 = X.AnonymousClass5WH.A02(r10)
            X.5SI r1 = r2.A0U
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x006f
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x006f
            boolean r0 = r2.A0M
            if (r0 != 0) goto L_0x006f
            X.4co r1 = X.AnonymousClass5RJ.A00(r2)
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.ui.platform.AndroidComposeView) r1
            X.5TN r0 = r1.A0a
            X.5TT r0 = r0.A06
            X.5Pl r0 = r0.A01
            r0.A09(r2)
            r0 = 1
            r2.A0M = r0
            r0 = 0
            androidx.compose.ui.platform.AndroidComposeView.A0B(r0, r1)
        L_0x006f:
            r0 = r11 & 4
            if (r0 == 0) goto L_0x007d
            boolean r0 = r10 instanceof X.C267814cG
            if (r0 == 0) goto L_0x007d
            r0 = r10
            X.4cG r0 = (X.C267814cG) r0
            X.C288785cT.A00(r0)
        L_0x007d:
            r0 = r11 & 8
            if (r0 == 0) goto L_0x008c
            boolean r0 = r10 instanceof X.C267954cW
            if (r0 == 0) goto L_0x008c
            X.5R6 r0 = X.AnonymousClass5WH.A02(r10)
            r0.A0M()
        L_0x008c:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r10 instanceof X.AnonymousClass5VI
            if (r0 == 0) goto L_0x00a5
            X.5R6 r0 = X.AnonymousClass5WH.A02(r10)
            X.5SI r2 = r0.A0U
            X.5SJ r0 = r2.A0J
            r1 = 1
            r0.A0J = r1
            X.5ey r0 = r2.A05
            if (r0 == 0) goto L_0x00a5
            r0.A0C = r1
        L_0x00a5:
            r0 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r10 instanceof X.C268794e0
            if (r0 == 0) goto L_0x00b6
            if (r12 == r3) goto L_0x00b6
            r0 = r10
            X.4e0 r0 = (X.C268794e0) r0
            X.C286375Wc.A01(r0)
        L_0x00b6:
            r0 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0160
            boolean r0 = r10 instanceof X.AnonymousClass5VG
            if (r0 == 0) goto L_0x0160
            r2 = r10
            X.5VG r2 = (X.AnonymousClass5VG) r2
            X.5WZ r1 = X.AnonymousClass5WZ.A01
            r0 = 0
            X.AnonymousClass5WZ.A00 = r0
            r2.AC1(r1)
            java.lang.Boolean r0 = X.AnonymousClass5WZ.A00
            if (r0 == 0) goto L_0x0160
            if (r12 != r3) goto L_0x014f
            r9 = 1024(0x400, float:1.435E-42)
            X.4cD r2 = (X.C267794cD) r2
            X.4cD r8 = r2.A03
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x017b
            r7 = 16
            X.4cD[] r0 = new X.C267794cD[r7]
            X.5Pl r6 = new X.5Pl
            r6.<init>(r0)
            X.4cD r0 = r8.A02
            if (r0 == 0) goto L_0x00fb
            r6.A09(r0)
        L_0x00ea:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0160
            r5 = 1
            int r0 = r0 - r5
            java.lang.Object r8 = r6.A00(r0)
            X.4cD r8 = (X.C267794cD) r8
            int r0 = r8.A00
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0101
        L_0x00fb:
            X.AnonymousClass5WH.A06(r6, r8)
            goto L_0x00ea
        L_0x00ff:
            if (r8 == 0) goto L_0x00ea
        L_0x0101:
            int r0 = r8.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x014c
            r4 = 0
            r3 = r4
        L_0x0108:
            boolean r0 = r8 instanceof X.C268794e0
            if (r0 == 0) goto L_0x0118
            X.4e0 r8 = (X.C268794e0) r8
            X.C286375Wc.A01(r8)
        L_0x0111:
            X.4cD r8 = X.AnonymousClass5WH.A00(r3)
        L_0x0115:
            if (r8 == 0) goto L_0x00ea
            goto L_0x0108
        L_0x0118:
            int r0 = r8.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0111
            boolean r0 = r8 instanceof X.C267944cV
            if (r0 == 0) goto L_0x0111
            r0 = r8
            X.4cV r0 = (X.C267944cV) r0
            X.4cD r2 = r0.A00
            r1 = 0
        L_0x0127:
            if (r2 == 0) goto L_0x0149
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0133
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0136
            r8 = r2
        L_0x0133:
            X.4cD r2 = r2.A02
            goto L_0x0127
        L_0x0136:
            if (r3 != 0) goto L_0x013f
            X.4cD[] r0 = new X.C267794cD[r7]
            X.5Pl r3 = new X.5Pl
            r3.<init>(r0)
        L_0x013f:
            if (r8 == 0) goto L_0x0145
            r3.A09(r8)
            r8 = r4
        L_0x0145:
            r3.A09(r2)
            goto L_0x0133
        L_0x0149:
            if (r1 != r5) goto L_0x0111
            goto L_0x0115
        L_0x014c:
            X.4cD r8 = r8.A02
            goto L_0x00ff
        L_0x014f:
            X.4co r0 = X.AnonymousClass5WH.A05(r2)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5QZ r0 = r0.A0S
            X.5QY r0 = (X.AnonymousClass5QY) r0
            X.5Qc r1 = r0.A03
            X.0vq r0 = r1.A01
            X.C285185Qc.A00(r0, r1, r2)
        L_0x0160:
            r0 = 4096(0x1000, float:5.74E-42)
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0008
            boolean r0 = r10 instanceof X.AnonymousClass5VE
            if (r0 == 0) goto L_0x0008
            X.4co r0 = X.AnonymousClass5WH.A05(r10)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5QZ r0 = r0.A0S
            X.5QY r0 = (X.AnonymousClass5QY) r0
            X.5Qc r1 = r0.A03
            X.0vq r0 = r1.A00
            X.C285185Qc.A00(r0, r1, r10)
            return
        L_0x017b:
            java.lang.String r1 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WB.A06(X.4cD, int, int):void");
    }
}
