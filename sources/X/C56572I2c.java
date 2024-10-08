package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I2c  reason: case insensitive filesystem */
public abstract class C56572I2c {
    public static final void A02(C286575Wy r10, Modifier modifier, C288095bM r12, IQK iqk, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r11 = r10;
        r10.ExV(-1410067784);
        int i4 = i2;
        IQK iqk2 = iqk;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r11, iqk) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r11, modifier2);
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= G9t.A0Q(r11, str);
        }
        C288095bM r5 = r12;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= G9t.A0R(r11, r12);
        }
        if ((i3 & 1171) != 1170 || !r11.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-815089681, "com.instagram.creation.genai.common.ui.CreationGenAIImage (CreationGenAIImage.kt:49)");
            }
            C3018360g r4 = new C3018360g(iqk.A00);
            AnonymousClass6GC r13 = new AnonymousClass6GC(r4, C51975G9x.A08(r4.A00));
            r13.A00 = 1;
            AnonymousClass6G3.A0A(r11, modifier2.Ezh(C287205Zk.A01), r13, r5, str2, ((i3 >> 3) & 112) | ((i3 << 3) & 57344));
            if (0fL.A02()) {
                0fL.A00(-1251508302);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9N(r5, iqk2, modifier2, str2, i5, i4, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r3 == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r13, androidx.compose.ui.Alignment r14, androidx.compose.ui.Modifier r15, X.C288095bM r16, X.C59493JLr r17, java.lang.String r18, int r19, int r20) {
        /*
            r10 = r16
            r11 = r18
            r7 = r14
            r8 = r15
            r0 = 0
            r9 = r17
            X.0qQ.A0B(r9, r0)
            r1 = 1428767485(0x552942fd, float:1.16315736E13)
            r14 = r13
            r13.ExV(r1)
            r13 = r20
            r1 = r20 & 1
            r12 = r19
            if (r1 == 0) goto L_0x012a
            r1 = r19 | 6
        L_0x001d:
            r6 = r20 & 2
            if (r6 == 0) goto L_0x011f
            r1 = r1 | 48
        L_0x0023:
            r5 = r20 & 4
            if (r5 == 0) goto L_0x0114
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0029:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x003c
            r2 = r20 & 8
            if (r2 != 0) goto L_0x0039
            boolean r3 = r14.AGu(r11)
            r2 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x003b:
            r1 = r1 | r2
        L_0x003c:
            r4 = r20 & 16
            if (r4 == 0) goto L_0x0109
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0042:
            r3 = r1 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r2) goto L_0x0060
            boolean r2 = r14.Bwn()
            if (r2 == 0) goto L_0x0060
            r14.Evl()
        L_0x0051:
            X.5Xd r0 = r14.ASQ()
            if (r0 == 0) goto L_0x005f
            r14 = 5
            X.JA8 r6 = new X.JA8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A06 = r6
        L_0x005f:
            return
        L_0x0060:
            r14.Ewr()
            r2 = r19 & 1
            if (r2 == 0) goto L_0x00ee
            boolean r2 = r14.Aw3()
            if (r2 != 0) goto L_0x00ee
            int r1 = X.C51971G9r.A05(r14, r13, r1)
        L_0x0071:
            boolean r2 = X.C51967G9n.A1S(r14)
            if (r2 == 0) goto L_0x007f
            r3 = -652358586(0xffffffffd91dcc46, float:-2.77601077E15)
            java.lang.String r2 = "com.instagram.creation.genai.common.ui.CreationGenAIImage (CreationGenAIImage.kt:27)"
            X.0fL.A01(r3, r2)
        L_0x007f:
            int r5 = r1 >> 3
            X.5RD r3 = X.C287675aa.A00(r7, r0)
            int r6 = X.C287425a7.A00(r14)
            r1 = r14
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r2 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r14, r8)
            X.C51973G9u.A0y(r14, r1)
            X.C51971G9r.A12(r14, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r1.A0K
            if (r2 != 0) goto L_0x00a6
            boolean r2 = X.C51972G9s.A1Q(r14, r6)
            if (r2 != 0) goto L_0x00a9
        L_0x00a6:
            X.C51971G9r.A13(r14, r3, r6)
        L_0x00a9:
            X.C51965G9l.A18(r14, r4)
            boolean r2 = r9 instanceof X.IQL
            if (r2 == 0) goto L_0x00cd
            r2 = -1271695441(0xffffffffb43377af, float:-1.6714215E-7)
            r14.ExS(r2)
            r15 = 0
            r18 = 0
            r17 = 3
            r16 = r0
            A01(r14, r15, r16, r17, r18)
        L_0x00c0:
            boolean r0 = X.C51971G9r.A1S(r14, r1, r0)
            if (r0 == 0) goto L_0x0051
            r0 = 1933736735(0x73427b1f, float:1.5408368E31)
            X.0fL.A00(r0)
            goto L_0x0051
        L_0x00cd:
            boolean r2 = r9 instanceof X.IQK
            if (r2 == 0) goto L_0x0139
            r2 = -1271687492(0xffffffffb43396bc, float:-1.6725511E-7)
            r14.ExS(r2)
            r4 = r9
            X.IQK r4 = (X.IQK) r4
            r15 = 0
            r3 = r5 & 896(0x380, float:1.256E-42)
            r2 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r2
            r20 = 2
            r16 = r10
            r17 = r4
            r18 = r11
            r19 = r3
            A02(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00c0
        L_0x00ee:
            if (r6 == 0) goto L_0x00f2
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
        L_0x00f2:
            if (r5 == 0) goto L_0x00f6
            androidx.compose.ui.Alignment r7 = X.C287215Zl.A09
        L_0x00f6:
            r2 = r20 & 8
            if (r2 == 0) goto L_0x0103
            r2 = 2131969731(0x7f1346c3, float:1.9576393E38)
            java.lang.String r11 = X.C304346Dc.A00(r14, r2)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0103:
            if (r4 == 0) goto L_0x0071
            X.5bM r10 = X.C288075bK.A04
            goto L_0x0071
        L_0x0109:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0042
            int r2 = X.G9t.A0S(r14, r10)
            r1 = r1 | r2
            goto L_0x0042
        L_0x0114:
            r2 = r12 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0029
            int r2 = X.G9t.A0Q(r14, r7)
            r1 = r1 | r2
            goto L_0x0029
        L_0x011f:
            r2 = r19 & 48
            if (r2 != 0) goto L_0x0023
            int r2 = X.G9t.A0P(r14, r15)
            r1 = r1 | r2
            goto L_0x0023
        L_0x012a:
            r1 = r19 & 6
            if (r1 != 0) goto L_0x0136
            int r1 = X.C41848B3p.A01(r14, r9)
            r1 = r1 | r19
            goto L_0x001d
        L_0x0136:
            r1 = r12
            goto L_0x001d
        L_0x0139:
            r0 = -1271697344(0xffffffffb4337040, float:-1.671151E-7)
            X.Wub r0 = X.C51972G9s.A0v(r14, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56572I2c.A00(X.5Wy, androidx.compose.ui.Alignment, androidx.compose.ui.Modifier, X.5bM, X.JLr, java.lang.String, int, int):void");
    }

    public static final void A01(C286575Wy r16, Modifier modifier, int i, int i2, long j) {
        int i3;
        long j2 = j;
        Modifier modifier2 = modifier;
        C286575Wy r3 = r16;
        r3.ExV(438447019);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r3, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 3) != 2 || !r3.Bwn()) {
            r3.Ewr();
            if ((i & 1) == 0 || r3.Aw3()) {
                if (i5 != 0) {
                    modifier2 = Modifier.A00;
                }
                if ((i2 & 2) != 0) {
                    j2 = AnonymousClass5aQ.A00(r3).A11;
                }
            } else {
                r3.Evl();
            }
            if (C51967G9n.A1S(r3)) {
                0fL.A01(-1555659821, "com.instagram.creation.genai.common.ui.CreationGenAIImageLoading (CreationGenAIImage.kt:64)");
            }
            HY6.A00(r3, modifier2.Ezh(C287205Zk.A01), (String) null, 0, 48, 12, 0);
            if (0fL.A02()) {
                0fL.A00(591738391);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7C(modifier2, i6, i4, j2);
        }
    }
}
