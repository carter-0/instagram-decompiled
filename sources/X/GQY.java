package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public abstract class GQY {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r2 == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if ((r18 & 8) != 0) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r12, androidx.compose.ui.Modifier r13, X.AnonymousClass5S2 r14, com.instagram.common.typedurl.ImageUrl r15, X.0sP r16, int r17, int r18) {
        /*
            r6 = r14
            r0 = 1222098101(0x48d7bcb5, float:441829.66)
            r12.ExV(r0)
            r11 = r18
            r0 = r18 & 1
            r9 = r15
            r10 = r17
            if (r0 == 0) goto L_0x00e8
            r0 = r17 | 6
        L_0x0012:
            r1 = r18 & 2
            r7 = r16
            if (r1 == 0) goto L_0x00dd
            r0 = r0 | 48
        L_0x001a:
            r1 = r18 & 4
            r8 = r13
            if (r1 == 0) goto L_0x00d2
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0021:
            r1 = r10 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0034
            r1 = r18 & 8
            if (r1 != 0) goto L_0x0031
            boolean r2 = r12.AGu(r14)
            r1 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x0033
        L_0x0031:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0033:
            r0 = r0 | r1
        L_0x0034:
            r2 = r0 & 1171(0x493, float:1.641E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r2 != r1) goto L_0x0053
            boolean r1 = r12.Bwn()
            if (r1 == 0) goto L_0x0053
            r12.Evl()
        L_0x0043:
            X.5Xd r0 = r12.ASQ()
            if (r0 == 0) goto L_0x0052
            r12 = 20
            X.JG8 r5 = new X.JG8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.A06 = r5
        L_0x0052:
            return
        L_0x0053:
            r12.Ewr()
            r1 = r17 & 1
            if (r1 == 0) goto L_0x00c7
            boolean r1 = r12.Aw3()
            if (r1 != 0) goto L_0x00c7
            r12.Evl()
            r1 = r18 & 8
            if (r1 == 0) goto L_0x0069
        L_0x0067:
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0069:
            boolean r1 = X.C51967G9n.A1S(r12)
            if (r1 == 0) goto L_0x0077
            r2 = -1739290363(0xffffffff98548905, float:-2.7469535E-24)
            java.lang.String r1 = "com.instagram.newsfeed.compose.ui.EndAddOnImage (NewsfeedStoryRow.kt:481)"
            X.0fL.A01(r2, r1)
        L_0x0077:
            r5 = 0
            X.2DN r3 = X.C51966G9m.A0o(r12, r15, r0)
            r4 = 1056964608(0x3f000000, float:0.5)
            r1 = 1110441984(0x42300000, float:44.0)
            androidx.compose.ui.Modifier r2 = X.C287205Zk.A0C(r13, r1)
            r1 = -1111259154(0xffffffffbdc387ee, float:-0.09547411)
            boolean r1 = X.C51974G9v.A1Y(r12, r1, r0)
            java.lang.Object r0 = r12.ECw()
            if (r1 != 0) goto L_0x0095
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x009f
        L_0x0095:
            r1 = 31
            X.MIy r0 = new X.MIy
            r0.<init>(r7, r1)
            r12.FLL(r0)
        L_0x009f:
            X.0sa r0 = (X.C62320sa) r0
            X.C51965G9l.A1X(r12, r5)
            androidx.compose.ui.Modifier r2 = X.C287635aW.A06(r2, r0)
            long r0 = X.C51966G9m.A0F(r12)
            androidx.compose.ui.Modifier r0 = X.C304816Fi.A03(r2, r6, r4, r0)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6FZ.A01(r0, r6)
            X.5bM r0 = X.C288075bK.A00
            X.AnonymousClass6G3.A08(r12, r1, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0043
            r0 = 1201087117(0x4797228d, float:77381.1)
            X.0fL.A00(r0)
            goto L_0x0043
        L_0x00c7:
            r1 = r18 & 8
            if (r1 == 0) goto L_0x0069
            r1 = 1090519040(0x41000000, float:8.0)
            X.5ZQ r6 = X.AnonymousClass5ZN.A01(r1)
            goto L_0x0067
        L_0x00d2:
            r1 = r10 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0021
            int r1 = X.G9t.A0Q(r12, r13)
            r0 = r0 | r1
            goto L_0x0021
        L_0x00dd:
            r1 = r17 & 48
            if (r1 != 0) goto L_0x001a
            int r1 = X.G9t.A0F(r12, r7)
            r0 = r0 | r1
            goto L_0x001a
        L_0x00e8:
            r0 = r17 & 6
            if (r0 != 0) goto L_0x00f4
            int r0 = X.G9t.A0O(r12, r15)
            r0 = r0 | r17
            goto L_0x0012
        L_0x00f4:
            r0 = r10
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQY.A03(X.5Wy, androidx.compose.ui.Modifier, X.5S2, com.instagram.common.typedurl.ImageUrl, X.0sP, int, int):void");
    }

    public static final void A07(C286575Wy r15, Modifier modifier, C54698HPd hPd, 0sP r18, int i) {
        int i2;
        ImageUrl imageUrl;
        0sP r12;
        int i3;
        Modifier A09;
        int i4;
        C286575Wy r8 = r15;
        r15.ExV(219334592);
        int i5 = i;
        C54698HPd hPd2 = hPd;
        if ((i & 6) == 0) {
            int i6 = 2;
            if (r8.AGu(hPd2)) {
                i6 = 4;
            }
            i2 = i6 | i;
        } else {
            i2 = i5;
        }
        0sP r2 = r18;
        if ((i & 48) == 0) {
            int i7 = 16;
            if (r8.AGw(r2)) {
                i7 = 32;
            }
            i2 |= i7;
        }
        Modifier modifier2 = modifier;
        if ((i5 & 384) == 0) {
            int i8 = 128;
            if (r8.AGu(modifier2)) {
                i8 = 256;
            }
            i2 |= i8;
        }
        if ((i2 & 147) != 146 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1705962122, "com.instagram.newsfeed.compose.ui.EndAddOn (NewsfeedStoryRow.kt:390)");
            }
            if (hPd2 instanceof C46535Dgc) {
                r8.ExS(553240813);
                A00(r8, modifier2, (i2 >> 6) & 14);
            } else if (hPd2 instanceof ENJ) {
                r8.ExS(553242792);
                A01(r8, modifier2, (i2 >> 6) & 14);
            } else {
                boolean z = true;
                boolean z2 = false;
                if (hPd2 instanceof C52398GQx) {
                    r8.ExS(553245235);
                    C46519DgM dgM = ((C52398GQx) hPd2).A00;
                    if (dgM != null) {
                        r8.ExS(553249014);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object ECw = r8.ECw();
                        if (z || ECw == AnonymousClass5XT.A00) {
                            ECw = new G4U(r2, 1);
                            r8.FLL(ECw);
                        }
                        C286565Wx.A0L((C286565Wx) r8, false);
                        A06(r8, C287195Zj.A0B(modifier2, 0.0f, 14.0f, 0.0f, 0.0f), dgM, (0sP) ECw, 0);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    IG1 ig1 = null;
                    if (hPd2 instanceof C52391GQq) {
                        r8.ExS(553253699);
                        imageUrl = ((C52391GQq) hPd2).A00;
                        r8.ExS(553256214);
                        if ((i2 & 112) == 32) {
                            z2 = true;
                        }
                        Object ECw2 = r8.ECw();
                        if (z2 || ECw2 == AnonymousClass5XT.A00) {
                            ECw2 = new G4U(r2, 2);
                            r8.FLL(ECw2);
                        }
                        r12 = (0sP) ECw2;
                        i3 = 0;
                        C286565Wx.A0L((C286565Wx) r8, false);
                        A09 = C287195Zj.A09(modifier2, 0.0f, 8.0f);
                        i4 = 8;
                    } else if (hPd2 instanceof HCJ) {
                        r8.ExS(553260938);
                        imageUrl = ((HCJ) hPd2).A00;
                        r8.ExS(553263414);
                        if ((i2 & 112) == 32) {
                            z2 = true;
                        }
                        Object ECw3 = r8.ECw();
                        if (z2 || ECw3 == AnonymousClass5XT.A00) {
                            ECw3 = new G4U(r2, 3);
                            r8.FLL(ECw3);
                        }
                        r12 = (0sP) ECw3;
                        i3 = 0;
                        C286565Wx.A0L((C286565Wx) r8, false);
                        A09 = C287195Zj.A09(modifier2, 0.0f, 8.0f);
                        ig1 = new IG1();
                        i4 = 0;
                    } else if (hPd2 instanceof HCK) {
                        r8.ExS(553269419);
                        HCK hck = (HCK) hPd2;
                        String str = hck.A01;
                        r8.ExS(553272278);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object ECw4 = r8.ECw();
                        if (z || ECw4 == AnonymousClass5XT.A00) {
                            ECw4 = new G4U(r2, 4);
                            r8.FLL(ECw4);
                        }
                        C286565Wx.A0L((C286565Wx) r8, false);
                        A08(r8, C287195Zj.A0B(modifier2, 0.0f, 14.0f, 0.0f, 0.0f), str, (0sP) ECw4, hck.A00, 0);
                    } else if (hPd2 instanceof C52411GRn) {
                        r8.ExS(553280389);
                        int i9 = ((C52411GRn) hPd2).A00;
                        r8.ExS(553283734);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object ECw5 = r8.ECw();
                        if (z || ECw5 == AnonymousClass5XT.A00) {
                            ECw5 = new G4U(r2, 5);
                            r8.FLL(ECw5);
                        }
                        C286565Wx.A0L((C286565Wx) r8, false);
                        A0A(r8, C287195Zj.A0B(modifier2, 0.0f, 14.0f, 0.0f, 0.0f), (0sP) ECw5, i9, 0);
                    } else if (hPd2 instanceof HCL) {
                        r8.ExS(553288291);
                        r8.ExS(553288982);
                        if ((i2 & 112) != 32) {
                            z = false;
                        }
                        Object ECw6 = r8.ECw();
                        if (z || ECw6 == AnonymousClass5XT.A00) {
                            ECw6 = new G4U(r2, 6);
                            r8.FLL(ECw6);
                        }
                        C286565Wx.A0L((C286565Wx) r8, false);
                        A09(r8, modifier2, (0sP) ECw6, (i2 >> 3) & 112);
                    } else if (hPd2 instanceof C52520GVx) {
                        r8.ExS(553291827);
                    } else {
                        r8.ExS(553240588);
                        C286565Wx.A0L((C286565Wx) r8, false);
                        throw new RuntimeException();
                    }
                    A03(r8, A09, ig1, imageUrl, r12, i3, i4);
                }
            }
            C286565Wx.A0L((C286565Wx) r8, false);
            if (0fL.A02()) {
                0fL.A00(629504133);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i5, 1, modifier2, r18, hPd2);
        }
    }

    public static final void A0C(C286575Wy r17, JV5 jv5, C54698HPd hPd, C59643JRl jRl, String str, 0sP r22, int i) {
        A04(r17, (Modifier) null, jv5, hPd, (C52406GRh) null, jRl, str, (String) null, (0sP) null, (0sP) null, r22, (0sP) null, 0.0d, i, 0, 7656, false);
    }

    public static final void A0E(C286575Wy r17, JV5 jv5, C54698HPd hPd, C59643JRl jRl, 0sP r21, int i) {
        A04(r17, (Modifier) null, jv5, hPd, (C52406GRh) null, jRl, (String) null, (String) null, (0sP) null, (0sP) null, r21, (0sP) null, 0.0d, i, 0, 7672, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r20, androidx.compose.ui.Modifier r21, int r22, int r23, int r24, long r25, long r27, boolean r29, boolean r30) {
        /*
            r4 = r30
            r3 = r29
            r6 = r21
            r0 = 455128289(0x1b20b4e1, float:1.3293335E-22)
            r7 = r20
            r7.ExV(r0)
            r16 = r24
            r0 = r24 & 1
            r15 = r22
            r5 = r23
            if (r0 == 0) goto L_0x0140
            r8 = r23 | 6
        L_0x001a:
            r10 = r24 & 2
            if (r10 == 0) goto L_0x0135
            r8 = r8 | 48
        L_0x0020:
            r0 = r24 & 4
            r23 = r25
            if (r0 == 0) goto L_0x0128
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r0 = r16 & 8
            r13 = r27
            if (r0 == 0) goto L_0x011d
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r1 = r16 & 16
            if (r1 == 0) goto L_0x0112
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r9 = r16 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r9 != 0) goto L_0x0043
            r0 = r0 & r5
            if (r0 != 0) goto L_0x0044
            int r0 = X.G9t.A0d(r7, r4)
        L_0x0043:
            r8 = r8 | r0
        L_0x0044:
            r0 = 74899(0x12493, float:1.04956E-40)
            r2 = r8 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r0) goto L_0x0070
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0070
            r7.Evl()
        L_0x0057:
            X.5Xd r0 = r7.ASQ()
            if (r0 == 0) goto L_0x006f
            X.J9m r12 = new X.J9m
            r21 = r3
            r22 = r4
            r17 = r23
            r19 = r13
            r13 = r6
            r14 = r15
            r15 = r5
            r12.<init>(r13, r14, r15, r16, r17, r19, r21, r22)
            r0.A06 = r12
        L_0x006f:
            return
        L_0x0070:
            if (r10 == 0) goto L_0x0074
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
        L_0x0074:
            boolean r3 = X.C51966G9m.A1R(r1, r3)
            boolean r4 = X.C51966G9m.A1Q(r9, r4)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x008a
            r1 = -874228376(0xffffffffcbe45568, float:-2.9928144E7)
            java.lang.String r0 = "com.instagram.newsfeed.compose.ui.CellIndicator (NewsfeedStoryRow.kt:358)"
            X.0fL.A01(r1, r0)
        L_0x008a:
            X.2DO r19 = X.C51966G9m.A0Y(r7, r8, r15)
            if (r4 == 0) goto L_0x0106
            r0 = 488354837(0x1d1bb415, float:2.060718E-21)
            r7.ExS(r0)
            r11 = 0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r7)
            long r0 = r0.A12
        L_0x009d:
            X.5Wx r10 = X.C51965G9l.A0H(r7, r11)
            X.5ZQ r9 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r1 = X.C304766Fd.A01(r6, r9, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A07(r1, r0)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            if (r3 == 0) goto L_0x00b3
            r2 = 0
        L_0x00b3:
            if (r4 == 0) goto L_0x00fc
            r0 = 488364693(0x1d1bda95, float:2.0627083E-21)
            X.5Yw r0 = X.C51967G9n.A0a(r7, r0)
            long r0 = r0.A12
        L_0x00be:
            X.C286565Wx.A0L(r10, r11)
            androidx.compose.ui.Modifier r0 = X.C304816Fi.A03(r12, r9, r2, r0)
            androidx.compose.ui.Modifier r1 = X.C304766Fd.A01(r0, r9, r13)
            r2 = 3
            r0 = 0
            if (r3 == 0) goto L_0x00cf
            r0 = 1077936128(0x40400000, float:3.0)
        L_0x00cf:
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A07(r1, r0)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6FZ.A01(r0, r9)
            r0 = 18
            if (r3 == 0) goto L_0x00dd
            r0 = 12
        L_0x00dd:
            float r0 = (float) r0
            androidx.compose.ui.Modifier r18 = X.C287205Zk.A0C(r1, r0)
            int r8 = r8 << r2
            r0 = r8 & 7168(0x1c00, float:1.0045E-41)
            r20 = r0 | 48
            r17 = r7
            r21 = r23
            X.C288165bT.A01(r17, r18, r19, r20, r21)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0057
            r0 = 842284959(0x32343f9f, float:1.0491845E-8)
            X.0fL.A00(r0)
            goto L_0x0057
        L_0x00fc:
            r0 = 488366644(0x1d1be234, float:2.0631023E-21)
            X.5Yw r0 = X.C51967G9n.A0a(r7, r0)
            long r0 = r0.A0k
            goto L_0x00be
        L_0x0106:
            r0 = 488356660(0x1d1bbb34, float:2.061086E-21)
            r7.ExS(r0)
            r11 = 0
            long r0 = X.C51966G9m.A0A(r7)
            goto L_0x009d
        L_0x0112:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0036
            int r0 = X.G9t.A0c(r7, r3)
            r8 = r8 | r0
            goto L_0x0036
        L_0x011d:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0030
            int r0 = X.G9t.A0E(r7, r13)
            r8 = r8 | r0
            goto L_0x0030
        L_0x0128:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0028
            r0 = r23
            int r0 = X.G9t.A0D(r7, r0)
            r8 = r8 | r0
            goto L_0x0028
        L_0x0135:
            r0 = r23 & 48
            if (r0 != 0) goto L_0x0020
            int r0 = X.G9t.A0P(r7, r6)
            r8 = r8 | r0
            goto L_0x0020
        L_0x0140:
            r0 = r23 & 6
            if (r0 != 0) goto L_0x014c
            int r8 = X.G9t.A05(r7, r15)
            r8 = r8 | r23
            goto L_0x001a
        L_0x014c:
            r8 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQY.A02(X.5Wy, androidx.compose.ui.Modifier, int, int, int, long, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ac, code lost:
        r7 = X.C51965G9l.A0H(r9, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (X.0fL.A02() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        X.0fL.A00(-389363745);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        X.C286565Wx.A0L(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (X.C51967G9n.A1U(r9, 1618884793) == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        X.0fL.A01(2099029226, "com.instagram.newsfeed.model.NewsfeedStoryCellIndicator.backgroundColor (NewsfeedStoryCellIndicator.kt:43)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        switch(r8) {
            case 0: goto L_0x0111;
            case 1: goto L_0x011d;
            case 2: goto L_0x0121;
            case 3: goto L_0x012b;
            case 4: goto L_0x012f;
            default: goto L_0x00d3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r0 = 725820988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
        r0 = X.C51967G9n.A0a(r9, r0).A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        X.C286565Wx.A0L(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e3, code lost:
        if (X.0fL.A02() == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        X.0fL.A00(-2044739195);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        X.C286565Wx.A0L(r7, false);
        A02(r9, r10, r11, (r5 & 112) | ((r5 << 9) & 458752), 0, r14, r0, X.C51969G9p.A1a(r6, X.C54657HMo.A04), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        r9.ExS(725813678);
        X.C286565Wx.A0L(r7, false);
        r0 = X.AnonymousClass5RW.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011d, code lost:
        r0 = 725814972;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0121, code lost:
        r0 = X.C51967G9n.A0a(r9, 725816596).A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
        r0 = 725817980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012f, code lost:
        r9.ExS(725819406);
        X.C286565Wx.A0L(r7, false);
        r0 = X.AnonymousClass5RW.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        r14 = X.C51965G9l.A08(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r20, androidx.compose.ui.Modifier r21, X.BBV r22, int r23, int r24, boolean r25) {
        /*
            r2 = r25
            r0 = -1526465094(0xffffffffa503fdba, float:-1.1448405E-16)
            r9 = r20
            r9.ExV(r0)
            r20 = r24
            r0 = r24 & 1
            r4 = r22
            r3 = r23
            if (r0 == 0) goto L_0x018e
            r5 = r23 | 6
        L_0x0016:
            r0 = r24 & 2
            r10 = r21
            if (r0 == 0) goto L_0x0183
            r5 = r5 | 48
        L_0x001e:
            r6 = r24 & 4
            if (r6 == 0) goto L_0x0178
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r1 = r5 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x004b
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x004b
            r9.Evl()
        L_0x0033:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x004a
            r21 = 8
            X.J8R r0 = new X.J8R
            r19 = r3
            r23 = r10
            r24 = r2
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r1.A06 = r0
        L_0x004a:
            return
        L_0x004b:
            boolean r2 = X.C51966G9m.A1Q(r6, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005d
            r1 = 1676659096(0x63efc998, float:8.8465964E21)
            java.lang.String r0 = "com.instagram.newsfeed.compose.ui.IndicatorFromConfig (NewsfeedStoryRow.kt:336)"
            X.0fL.A01(r1, r0)
        L_0x005d:
            java.lang.String r1 = r4.A00
            java.util.Map r0 = X.C54657HMo.A01
            java.lang.Object r6 = r0.get(r1)
            X.HMo r6 = (X.C54657HMo) r6
            if (r6 == 0) goto L_0x0103
            X.Hbc r0 = X.C55067Hbc.$redex_init_class
            int r8 = r6.ordinal()
            switch(r8) {
                case 0: goto L_0x008b;
                case 1: goto L_0x0087;
                case 2: goto L_0x0083;
                case 3: goto L_0x007f;
                case 4: goto L_0x007b;
                case 5: goto L_0x0077;
                default: goto L_0x0072;
            }
        L_0x0072:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0077:
            r11 = 2131238967(0x7f082037, float:1.8094228E38)
            goto L_0x008e
        L_0x007b:
            r11 = 2131237898(0x7f081c0a, float:1.809206E38)
            goto L_0x008e
        L_0x007f:
            r11 = 2131238545(0x7f081e91, float:1.8093372E38)
            goto L_0x008e
        L_0x0083:
            r11 = 2131238360(0x7f081dd8, float:1.8092997E38)
            goto L_0x008e
        L_0x0087:
            r11 = 2131237876(0x7f081bf4, float:1.8092015E38)
            goto L_0x008e
        L_0x008b:
            r11 = 2131238292(0x7f081d94, float:1.8092859E38)
        L_0x008e:
            r13 = 0
            r0 = -1537755124(0xffffffffa457b80c, float:-4.6776587E-17)
            boolean r0 = X.C51967G9n.A1U(r9, r0)
            if (r0 == 0) goto L_0x00a0
            r1 = -1749323660(0xffffffff97bb7074, float:-1.2112979E-24)
            java.lang.String r0 = "com.instagram.newsfeed.model.NewsfeedStoryCellIndicator.tintColor (NewsfeedStoryCellIndicator.kt:32)"
            X.0fL.A01(r1, r0)
        L_0x00a0:
            switch(r8) {
                case 0: goto L_0x013b;
                case 1: goto L_0x0148;
                case 2: goto L_0x0153;
                case 3: goto L_0x015e;
                case 4: goto L_0x016d;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r0 = 1785418728(0x6a6b53e8, float:7.112345E25)
            X.5Yw r0 = X.C51967G9n.A0a(r9, r0)
            long r14 = r0.A0J
        L_0x00ac:
            X.5Wx r7 = X.C51965G9l.A0H(r9, r13)
        L_0x00b0:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bc
            r0 = -389363745(0xffffffffe8cac7df, float:-7.66084E24)
            X.0fL.A00(r0)
        L_0x00bc:
            X.C286565Wx.A0L(r7, r13)
            r0 = 1618884793(0x607e38b9, float:7.327438E19)
            boolean r0 = X.C51967G9n.A1U(r9, r0)
            if (r0 == 0) goto L_0x00d0
            r1 = 2099029226(0x7d1ca4ea, float:1.301349E37)
            java.lang.String r0 = "com.instagram.newsfeed.model.NewsfeedStoryCellIndicator.backgroundColor (NewsfeedStoryCellIndicator.kt:43)"
            X.0fL.A01(r1, r0)
        L_0x00d0:
            switch(r8) {
                case 0: goto L_0x0111;
                case 1: goto L_0x011d;
                case 2: goto L_0x0121;
                case 3: goto L_0x012b;
                case 4: goto L_0x012f;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            r0 = 725820988(0x2b43263c, float:6.933098E-13)
        L_0x00d6:
            X.5Yw r0 = X.C51967G9n.A0a(r9, r0)
            long r0 = r0.A0S
        L_0x00dc:
            X.C286565Wx.A0L(r7, r13)
        L_0x00df:
            boolean r8 = X.0fL.A02()
            if (r8 == 0) goto L_0x00eb
            r8 = -2044739195(0xffffffff861fc185, float:-3.0046752E-35)
            X.0fL.A00(r8)
        L_0x00eb:
            X.C286565Wx.A0L(r7, r13)
            X.HMo r7 = X.C54657HMo.FACEBOOK
            boolean r18 = X.C51969G9p.A1a(r6, r7)
            r12 = r5 & 112(0x70, float:1.57E-43)
            r6 = 458752(0x70000, float:6.42848E-40)
            int r5 = r5 << 9
            r5 = r5 & r6
            r12 = r12 | r5
            r19 = r2
            r16 = r0
            A02(r9, r10, r11, r12, r13, r14, r16, r18, r19)
        L_0x0103:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = -1349187050(0xffffffffaf950a16, float:-2.7110109E-10)
            X.0fL.A00(r0)
            goto L_0x0033
        L_0x0111:
            r0 = 725813678(0x2b4309ae, float:6.929135E-13)
            r9.ExS(r0)
            X.C286565Wx.A0L(r7, r13)
            long r0 = X.AnonymousClass5RW.A09
            goto L_0x00df
        L_0x011d:
            r0 = 725814972(0x2b430ebc, float:6.9298365E-13)
            goto L_0x00d6
        L_0x0121:
            r0 = 725816596(0x2b431514, float:6.930717E-13)
            X.5Yw r0 = X.C51967G9n.A0a(r9, r0)
            long r0 = r0.A0Q
            goto L_0x00dc
        L_0x012b:
            r0 = 725817980(0x2b431a7c, float:6.931467E-13)
            goto L_0x00d6
        L_0x012f:
            r0 = 725819406(0x2b43200e, float:6.93224E-13)
            r9.ExS(r0)
            X.C286565Wx.A0L(r7, r13)
            long r0 = X.AnonymousClass5RW.A01
            goto L_0x00df
        L_0x013b:
            r0 = 1785411917(0x6a6b394d, float:7.109204E25)
            X.5Wx r7 = X.C51970G9q.A0R(r9, r0)
            r0 = 4278740735(0xff0866ff, double:2.1139788046E-314)
            goto L_0x0167
        L_0x0148:
            r0 = 1785413575(0x6a6b3fc7, float:7.1099686E25)
            X.5Yw r0 = X.C51967G9n.A0a(r9, r0)
            long r14 = r0.A0n
            goto L_0x00ac
        L_0x0153:
            r0 = 1785414951(0x6a6b4527, float:7.1106033E25)
            X.5Yw r0 = X.C51967G9n.A0a(r9, r0)
            long r14 = r0.A0U
            goto L_0x00ac
        L_0x015e:
            r0 = 1785415851(0x6a6b48ab, float:7.1110183E25)
            X.5Wx r7 = X.C51970G9q.A0R(r9, r0)
            r0 = 25824(0x64e0, double:1.27588E-319)
        L_0x0167:
            long r14 = X.C51965G9l.A08(r0)
            goto L_0x00b0
        L_0x016d:
            r0 = 1785417153(0x6a6b4dc1, float:7.1116188E25)
            X.5Wx r7 = X.C51970G9q.A0R(r9, r0)
            long r14 = X.AnonymousClass5RW.A09
            goto L_0x00b0
        L_0x0178:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0024
            int r0 = X.G9t.A0a(r9, r2)
            r5 = r5 | r0
            goto L_0x0024
        L_0x0183:
            r0 = r23 & 48
            if (r0 != 0) goto L_0x001e
            int r0 = X.G9t.A0P(r9, r10)
            r5 = r5 | r0
            goto L_0x001e
        L_0x018e:
            r0 = r23 & 6
            if (r0 != 0) goto L_0x019e
            boolean r0 = X.G9t.A1T(r9, r4, r3)
            int r5 = X.C51970G9q.A05(r0)
            r5 = r5 | r23
            goto L_0x0016
        L_0x019e:
            r5 = r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQY.A05(X.5Wy, androidx.compose.ui.Modifier, X.BBV, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0B(X.C286575Wy r33, X.C288195bW r34, X.AnonymousClass9J6 r35, com.instagram.common.typedurl.ImageUrl r36, com.instagram.common.typedurl.ImageUrl r37, X.0sP r38, int r39, int r40, boolean r41, boolean r42, boolean r43) {
        /*
            r7 = r35
            r1 = 1718579427(0x666f70e3, float:2.82682E23)
            r0 = r33
            r0.ExV(r1)
            r2 = r40
            r3 = r40 & 1
            r1 = r39
            if (r3 == 0) goto L_0x0241
            r3 = r39 | 6
        L_0x0014:
            r4 = r40 & 2
            r17 = r37
            if (r4 == 0) goto L_0x022e
            r3 = r3 | 48
        L_0x001c:
            r4 = r40 & 4
            r37 = r34
            if (r4 == 0) goto L_0x021b
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r4 = r40 & 8
            r32 = r41
            if (r4 == 0) goto L_0x0208
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r4 = r40 & 16
            r33 = r42
            if (r4 == 0) goto L_0x01f5
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r5 = r40 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            r15 = r43
            if (r5 != 0) goto L_0x004a
            r4 = r39 & r4
            if (r4 != 0) goto L_0x004b
            boolean r5 = r0.AGv(r15)
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r5 == 0) goto L_0x004a
            r4 = 131072(0x20000, float:1.83671E-40)
        L_0x004a:
            r3 = r3 | r4
        L_0x004b:
            r5 = r40 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            r35 = r38
            if (r5 != 0) goto L_0x0063
            r4 = r39 & r4
            if (r4 != 0) goto L_0x0064
            r4 = r35
            boolean r5 = r0.AGw(r4)
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r5 == 0) goto L_0x0063
            r4 = 1048576(0x100000, float:1.469368E-39)
        L_0x0063:
            r3 = r3 | r4
        L_0x0064:
            r6 = r2 & 128(0x80, float:1.794E-43)
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 != 0) goto L_0x007e
            r4 = r39 & r5
            if (r4 != 0) goto L_0x007f
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r39 & r4
            if (r4 != 0) goto L_0x01ef
            boolean r4 = r0.AGu(r7)
        L_0x0078:
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r4 == 0) goto L_0x007e
            r5 = 8388608(0x800000, float:1.17549435E-38)
        L_0x007e:
            r3 = r3 | r5
        L_0x007f:
            r4 = 4793491(0x492493, float:6.717112E-39)
            r5 = r3 & r4
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r4) goto L_0x00b1
            boolean r4 = r0.Bwn()
            if (r4 == 0) goto L_0x00b1
            r0.Evl()
        L_0x0092:
            X.5Xd r3 = r0.ASQ()
            if (r3 == 0) goto L_0x00b0
            r12 = 1
            X.JBh r0 = new X.JBh
            r4 = r0
            r5 = r36
            r6 = r7
            r7 = r37
            r8 = r35
            r9 = r17
            r10 = r1
            r11 = r2
            r13 = r32
            r14 = r33
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A06 = r0
        L_0x00b0:
            return
        L_0x00b1:
            r10 = 0
            if (r6 == 0) goto L_0x00b5
            r7 = r10
        L_0x00b5:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x00c3
            r5 = 1594189139(0x5f056553, float:9.61218E18)
            java.lang.String r4 = "com.instagram.newsfeed.compose.ui.Avatar (NewsfeedStoryRow.kt:272)"
            X.0fL.A01(r5, r4)
        L_0x00c3:
            r6 = 0
            if (r17 == 0) goto L_0x011a
            r4 = -2032545467(0xffffffff86d9d145, float:-8.193382E-35)
            r0.ExS(r4)
            r25 = 0
            r23 = r3 & 14
            r24 = 126(0x7e, float:1.77E-43)
            r18 = r0
            r19 = r36
            r20 = r10
            r21 = r10
            r22 = r10
            r27 = r6
            r28 = r6
            X.2DN r4 = X.1zC.A02(r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            int r3 = r3 >> 3
            r23 = r3 & 14
            r19 = r17
            X.2DN r3 = X.1zC.A02(r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            X.2DO[] r3 = new X.AnonymousClass2DO[]{r4, r3}
            X.62O r19 = X.AnonymousClass62Q.A04(r3)
            r20 = 1107296256(0x42000000, float:32.0)
            r21 = -1087897600(0xffffffffbf280000, float:-0.65625)
            r22 = 1059586048(0x3f280000, float:0.65625)
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 27696(0x6c30, float:3.881E-41)
            r25 = r6
            X.C52392GQr.A00(r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0105:
            r4 = r0
            X.5Wx r4 = (X.C286565Wx) r4
            r3 = 0
            X.C286565Wx.A0L(r4, r3)
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0092
            r3 = -1357924928(0xffffffffaf0fb5c0, float:-1.3070345E-10)
            X.0fL.A00(r3)
            goto L_0x0092
        L_0x011a:
            r4 = -2032148729(0xffffffff86dfdf07, float:-8.4210986E-35)
            r0.ExS(r4)
            if (r7 == 0) goto L_0x01ec
            java.lang.String r5 = r7.A01
        L_0x0124:
            r4 = -204098905(0xfffffffff3d5b2a7, float:-3.3861778E31)
            r0.ExS(r4)
            if (r5 != 0) goto L_0x01d9
            r11 = r10
        L_0x012d:
            r8 = r0
            X.5Wx r8 = (X.C286565Wx) r8
            r9 = 0
            X.C286565Wx.A0L(r8, r6)
            if (r11 != 0) goto L_0x0138
            r11 = r37
        L_0x0138:
            r4 = -204091027(0xfffffffff3d5d16d, float:-3.3880826E31)
            r0.ExS(r4)
            if (r7 == 0) goto L_0x0142
            java.lang.String r10 = r7.A00
        L_0x0142:
            X.5RW r4 = X.GRa.A00(r0, r10)
            X.C286565Wx.A0L(r8, r6)
            if (r4 == 0) goto L_0x01d5
            long r4 = r4.A00
        L_0x014d:
            r27 = 0
            r19 = 0
            r25 = r3 & 14
            r26 = 126(0x7e, float:1.77E-43)
            r20 = r0
            r21 = r36
            r22 = r19
            r23 = r19
            r24 = r19
            r29 = r6
            r30 = r6
            X.2DN r21 = X.1zC.A02(r20, r21, r22, r23, r24, r25, r26, r27, r29, r30)
            X.GQc r23 = X.C52377GQc.A00
            if (r43 == 0) goto L_0x01c6
            r10 = -204081335(0xfffffffff3d5f749, float:-3.390426E31)
            r0.ExS(r10)
            X.5Yw r10 = X.AnonymousClass5aQ.A00(r0)
            long r13 = r10.A0z
        L_0x0177:
            X.C286565Wx.A0L(r8, r6)
            if (r43 != 0) goto L_0x017e
            long r4 = X.AnonymousClass5RW.A07
        L_0x017e:
            r10 = -204076110(0xfffffffff3d60bb2, float:-3.3916893E31)
            r0.ExS(r10)
            r16 = 3670016(0x380000, float:5.142788E-39)
            r12 = r3 & r16
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r12 != r10) goto L_0x018d
            r6 = 1
        L_0x018d:
            java.lang.Object r10 = r0.ECw()
            if (r6 != 0) goto L_0x0197
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r10 != r6) goto L_0x01a1
        L_0x0197:
            X.G4U r10 = new X.G4U
            r6 = r35
            r10.<init>(r6, r9)
            r0.FLL(r10)
        L_0x01a1:
            X.0sP r10 = (X.0sP) r10
            X.C286565Wx.A0L(r8, r9)
            int r6 = r3 << 9
            r16 = r16 & r6
            r25 = r16 | 48
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r3
            r25 = r25 | r6
            r27 = 772(0x304, float:1.082E-42)
            r30 = r4
            r34 = r9
            r18 = r0
            r20 = r11
            r24 = r10
            r26 = r9
            r28 = r13
            X.GRY.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33, r34)
            goto L_0x0105
        L_0x01c6:
            r11 = r37
            r10 = -204080466(0xfffffffff3d5faae, float:-3.390636E31)
            r0.ExS(r10)
            X.5Yw r10 = X.AnonymousClass5aQ.A00(r0)
            long r13 = r10.A0d
            goto L_0x0177
        L_0x01d5:
            long r4 = X.AnonymousClass5RW.A07
            goto L_0x014d
        L_0x01d9:
            X.5RW r4 = X.GRa.A00(r0, r5)
            if (r4 == 0) goto L_0x01e9
            long r4 = r4.A00
            r8 = 5
            X.5bV r11 = new X.5bV
            r11.<init>(r4, r8)
            goto L_0x012d
        L_0x01e9:
            r11 = r10
            goto L_0x012d
        L_0x01ec:
            r5 = r10
            goto L_0x0124
        L_0x01ef:
            boolean r4 = r0.AGw(r7)
            goto L_0x0078
        L_0x01f5:
            r4 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0034
            r4 = r33
            boolean r5 = r0.AGv(r4)
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0205
            r4 = 16384(0x4000, float:2.2959E-41)
        L_0x0205:
            r3 = r3 | r4
            goto L_0x0034
        L_0x0208:
            r4 = r1 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x002c
            r4 = r32
            boolean r5 = r0.AGv(r4)
            r4 = 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0218
            r4 = 2048(0x800, float:2.87E-42)
        L_0x0218:
            r3 = r3 | r4
            goto L_0x002c
        L_0x021b:
            r4 = r1 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0024
            r4 = r37
            boolean r5 = r0.AGu(r4)
            r4 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x022b
            r4 = 256(0x100, float:3.59E-43)
        L_0x022b:
            r3 = r3 | r4
            goto L_0x0024
        L_0x022e:
            r4 = r39 & 48
            if (r4 != 0) goto L_0x001c
            r4 = r17
            boolean r5 = r0.AGu(r4)
            r4 = 16
            if (r5 == 0) goto L_0x023e
            r4 = 32
        L_0x023e:
            r3 = r3 | r4
            goto L_0x001c
        L_0x0241:
            r3 = r39 & 6
            if (r3 != 0) goto L_0x0253
            r3 = r36
            boolean r4 = r0.AGu(r3)
            r3 = 2
            if (r4 == 0) goto L_0x024f
            r3 = 4
        L_0x024f:
            r3 = r3 | r39
            goto L_0x0014
        L_0x0253:
            r3 = r1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQY.A0B(X.5Wy, X.5bW, X.9J6, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, X.0sP, int, int, boolean, boolean, boolean):void");
    }

    public static final void A0D(C286575Wy r17, JV5 jv5, C54698HPd hPd, C59643JRl jRl, 0sP r21) {
        A04(r17, (Modifier) null, jv5, hPd, (C52406GRh) null, jRl, "Title text", (String) null, (0sP) null, (0sP) null, r21, (0sP) null, 0.0d, 25008, 0, 7656, false);
    }

    public static final void A0G(C286575Wy r24, C59643JRl jRl, 0sP r26, int i, int i2, boolean z) {
        int i3;
        C288185bV r14;
        boolean z2 = z;
        C286575Wy r13 = r24;
        r13.ExV(-1813094073);
        int i4 = i2;
        C59643JRl jRl2 = jRl;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r13.AGu(jRl2)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i5;
        }
        0sP r7 = r26;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = 16;
            if (r13.AGw(r7)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            int i9 = 128;
            if (r13.AGv(z2)) {
                i9 = 256;
            }
            i3 |= i9;
        }
        if ((i3 & 147) != 146 || !r13.Bwn()) {
            if (i8 != 0) {
                z2 = false;
            }
            if (0fL.A02()) {
                0fL.A01(-704663622, "com.instagram.newsfeed.compose.ui.StartAvatar (NewsfeedStoryRow.kt:172)");
            }
            Modifier A0G = C287205Zk.A0G(Modifier.A00, 52.0f, 60.0f);
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A09, false);
            int A002 = C287425a7.A00(r13);
            C286565Wx r2 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r13, A0G);
            C62320sa r1 = C287485aD.A00;
            r13.ExX();
            if (r2.A0K) {
                r13.AMT(r1);
            } else {
                r13.FMk();
            }
            C287595aO.A00(r13, A00, C287485aD.A03);
            C287595aO.A00(r13, A04, C287485aD.A05);
            0sL r10 = C287485aD.A02;
            if (r2.A0K || !0qQ.A0K(r13.ECw(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                r13.FLL(valueOf);
                r13.ABr(valueOf, r10);
            }
            C287595aO.A00(r13, A01, C287485aD.A04);
            C289515dj r102 = C289515dj.A00;
            if (jRl2 instanceof C52400GQz) {
                r13.ExS(35237177);
                C52400GQz gQz = (C52400GQz) jRl2;
                if (gQz.A01 != null) {
                    r13.ExS(35276361);
                    AnonymousClass5PJ A012 = AnonymousClass5PI.A01(r13, new J7N(5, r102, jRl2, z2), 1634723159);
                    AnonymousClass5PJ A013 = AnonymousClass5PI.A01(r13, new JG2(38, r7, jRl2), 1200759478);
                    C56442Hya hya = C56442Hya.A00;
                    r13.ExS(2079374605);
                    boolean AGw = r13.AGw(hya);
                    Object ECw = r13.ECw();
                    if (AGw || ECw == AnonymousClass5XT.A00) {
                        ECw = new C58166InW(hya, 8);
                        r13.FLL(ECw);
                    }
                    C286565Wx.A0L(r2, false);
                    HXT.A00(r13, (Modifier) null, A012, A013, (C59520Ya) ECw, 54, 4);
                } else {
                    r13.ExS(36165131);
                    ImageUrl imageUrl = gQz.A03;
                    ImageUrl imageUrl2 = gQz.A02;
                    Integer num = gQz.A04;
                    r13.ExS(2079381147);
                    if (num == null) {
                        r14 = null;
                    } else {
                        r14 = new C288185bV(C289505di.A00(r13, num.intValue()), 5);
                    }
                    C286565Wx.A0L(r2, false);
                    0sP r18 = r7;
                    ImageUrl imageUrl3 = imageUrl;
                    ImageUrl imageUrl4 = imageUrl2;
                    A0B(r13, r14, gQz.A00, imageUrl3, imageUrl4, r18, (i3 << 15) & 3670016, 0, gQz.A05, gQz.A07, gQz.A06);
                }
                C286565Wx.A0L(r2, false);
            } else if (jRl2 instanceof C52404GRe) {
                r13.ExS(36628023);
                C52404GRe gRe = (C52404GRe) jRl2;
                A0H(r13, gRe.A01, r7, gRe.A00, (i3 << 3) & 896);
            } else {
                r13.ExS(2079311189);
                C286565Wx.A0L(r2, false);
                throw new RuntimeException();
            }
            C286565Wx.A0L(r2, false);
            r13.ASN();
            if (0fL.A02()) {
                0fL.A00(-1962660244);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 9, r26, jRl2, z2);
        }
    }

    public static final void A00(C286575Wy r8, Modifier modifier, int i) {
        int i2;
        r8.ExV(-1934662350);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1722792205, "com.instagram.newsfeed.compose.ui.EndAddOnBadgeChevron (NewsfeedStoryRow.kt:434)");
            }
            Modifier Ezh = modifier.Ezh(C287205Zk.A00);
            AnonymousClass5RD A0W = C51968G9o.A0W(r8);
            int A00 = C287425a7.A00(r8);
            C286565Wx r3 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r8, Ezh);
            C51973G9u.A0y(r8, r3);
            C51971G9r.A12(r8, A0W, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r1, A00);
            }
            C51965G9l.A18(r8, A01);
            AnonymousClass2DO A002 = C287975bA.A00(r8, R.drawable.blue_dot_medium, 0);
            C285245Qk r5 = Modifier.A00;
            C288165bT.A03(r8, C287205Zk.A0C(C287195Zj.A0B(r5, 12.0f, 0.0f, 0.0f, 0.0f), 8.0f), A002, AnonymousClass5aQ.A00(r8).A0b);
            C51970G9q.A14(r8, C287205Zk.A03(C287195Zj.A0B(r5, 8.0f, 0.0f, 0.0f, 0.0f)), C287975bA.A00(r8, R.drawable.instagram_chevron_right_pano_outline_16, 0));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(1901487064);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, modifier, i, 26);
        }
    }

    public static final void A01(C286575Wy r6, Modifier modifier, int i) {
        int i2;
        r6.ExV(-1811414987);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(893925104, "com.instagram.newsfeed.compose.ui.EndAddOnChevron (NewsfeedStoryRow.kt:452)");
            }
            Modifier Ezh = modifier.Ezh(C287205Zk.A00);
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0B, false);
            int A002 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, Ezh);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r1, A002);
            }
            C51965G9l.A18(r6, A01);
            C51970G9q.A14(r6, C287205Zk.A03(C51967G9n.A0E(Modifier.A00, 8.0f)), C287975bA.A00(r6, R.drawable.instagram_chevron_right_pano_outline_16, 0));
            if (C51967G9n.A1R(r6)) {
                0fL.A00(1112442800);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, modifier, i, 27);
        }
    }

    public static final void A06(C286575Wy r10, Modifier modifier, C46519DgM dgM, 0sP r13, int i) {
        int i2;
        C286575Wy r3 = r10;
        r10.ExV(-1725996051);
        int i3 = i;
        C46519DgM dgM2 = dgM;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r3, dgM) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r3, r13);
        }
        Modifier modifier2 = modifier;
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r3, modifier);
        }
        if ((i2 & 147) != 146 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-408744516, "com.instagram.newsfeed.compose.ui.EndAddOnFollowButton (NewsfeedStoryRow.kt:468)");
            }
            boolean A1O = C51973G9u.A1O(r3, 1618116313, i2);
            Object ECw = r3.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new C66217MIy(r13, 30);
                r3.FLL(ECw);
            }
            C51965G9l.A1V(r3);
            GR2.A00(r3, modifier2, dgM2, (GSN) null, (C62320sa) ECw, (i2 & 14) | ((i2 >> 3) & 112), 4);
            if (0fL.A02()) {
                0fL.A00(-1950502378);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 2, modifier2, r13, dgM2);
        }
    }

    public static final void A08(C286575Wy r11, Modifier modifier, String str, 0sP r14, int i, int i2) {
        int i3;
        C52399GQy A03;
        r11.ExV(-475570631);
        int i4 = i2;
        String str2 = str;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r11, str) | i2;
        } else {
            i3 = i4;
        }
        0sP r7 = r14;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r11, r14);
        }
        int i5 = i;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A07(r11, i);
        }
        Modifier modifier2 = modifier;
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0R(r11, modifier);
        }
        if ((i3 & 1171) != 1170 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2068874689, "com.instagram.newsfeed.compose.ui.EndAddOnPrimaryButton (NewsfeedStoryRow.kt:515)");
            }
            if (i == R.attr.igds_color_primary_button) {
                r11.ExS(-2059827597);
                A03 = C51965G9l.A0m(r11);
            } else {
                r11.ExS(-2059826091);
                A03 = AnonymousClass6CA.A00.A03(r11, 3, false, false);
            }
            C286565Wx r5 = (C286565Wx) r11;
            C286565Wx.A0L(r5, false);
            boolean A1O = C51973G9u.A1O(r11, -2059832500, i3);
            Object ECw = r11.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new C66217MIy(r14, 32);
                r11.FLL(ECw);
            }
            AnonymousClass6CE.A06(r11, modifier, A03, str2, C51965G9l.A0y(r5, ECw, false), ((i3 << 3) & 112) | ((i3 >> 3) & 896));
            if (0fL.A02()) {
                0fL.A00(2077262976);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Y(modifier2, r7, str2, i5, i4, 3);
        }
    }

    public static final void A09(C286575Wy r13, Modifier modifier, 0sP r15, int i) {
        int i2;
        C286575Wy r8 = r13;
        r13.ExV(2015866151);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r13, modifier);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(573300734, "com.instagram.newsfeed.compose.ui.EndAddOnXOut (NewsfeedStoryRow.kt:547)");
            }
            Modifier Ezh = modifier.Ezh(C287205Zk.A00);
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0A, false);
            int A002 = C287425a7.A00(r13);
            C286565Wx r4 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r13, Ezh);
            C51973G9u.A0y(r13, r4);
            C51971G9r.A12(r13, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r1, A002);
            }
            C51965G9l.A18(r13, A01);
            AnonymousClass2DO A003 = C287975bA.A00(r13, R.drawable.instagram_x_pano_outline_12, 0);
            String A004 = C288035bG.A00(r13, 2131960862);
            C285245Qk r3 = Modifier.A00;
            r13.ExS(1183993093);
            boolean A1Q = C51968G9o.A1Q(i2);
            Object ECw = r13.ECw();
            if (A1Q || ECw == AnonymousClass5XT.A00) {
                ECw = new C66217MIy(r15, 35);
                r13.FLL(ECw);
            }
            C288165bT.A08(r8, C51969G9p.A0V(r4, r3, ECw), A003, A004, C51966G9m.A0L(r13));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(1536804378);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier, r15, i3, 25);
        }
    }

    public static final void A0A(C286575Wy r13, Modifier modifier, 0sP r15, int i, int i2) {
        int i3;
        C286575Wy r12 = r13;
        r13.ExV(2082662175);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r13, i5) | i2;
        } else {
            i3 = i4;
        }
        0sP r4 = r15;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r13, r15);
        }
        Modifier modifier2 = modifier;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r13, modifier);
        }
        if ((i3 & 147) != 146 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-338497960, "com.instagram.newsfeed.compose.ui.EndAddOnUserActionsButtonGroup (NewsfeedStoryRow.kt:530)");
            }
            AnonymousClass5RD A0s = G9t.A0s(C287275Zs.A01, r13, C287215Zl.A04, ((i3 >> 6) & 14) | 384);
            boolean z = false;
            int A00 = C287425a7.A00(r13);
            C286565Wx r7 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r13, modifier);
            C51973G9u.A0y(r13, r7);
            C51971G9r.A12(r13, A0s, A04);
            0sL r1 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r1, A00);
            }
            C51965G9l.A18(r13, A01);
            r13.ExS(1127720816);
            int i6 = i3 & 112;
            boolean A1S = AnonymousClass7TF.A1S(i6, 32);
            Object ECw = r13.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C66217MIy(r15, 33);
                r13.FLL(ECw);
            }
            C286565Wx.A0L(r7, false);
            String A002 = C288035bG.A00(r13, i5);
            AnonymousClass6CE.A09(r13, C51965G9l.A0m(r13), A002, (C62320sa) ECw, 0);
            AnonymousClass2DO A003 = C287975bA.A00(r13, R.drawable.instagram_x_pano_outline_12, 0);
            String A004 = C288035bG.A00(r13, 2131960862);
            Modifier A0E = C51967G9n.A0E(Modifier.A00, 12.0f);
            r13.ExS(1127733578);
            if (i6 == 32) {
                z = true;
            }
            Object ECw2 = r13.ECw();
            if (z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C66217MIy(r4, 34);
                r13.FLL(ECw2);
            }
            C288165bT.A08(r12, C51969G9p.A0V(r7, A0E, ECw2), A003, A004, C51966G9m.A0L(r12));
            if (C51967G9n.A1R(r12)) {
                0fL.A00(1353596805);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, r4, i5, i4, 35);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0178, code lost:
        if (r6 != false) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0F(X.C286575Wy r14, X.C52406GRh r15, X.0sP r16, int r17) {
        /*
            r0 = -2027807476(0xffffffff87221d0c, float:-1.2196062E-34)
            r12 = r14
            r14.ExV(r0)
            r8 = r17
            r0 = r17 & 6
            r2 = r15
            if (r0 != 0) goto L_0x01cc
            int r0 = X.G9t.A0O(r14, r15)
            r0 = r0 | r17
        L_0x0014:
            r1 = r17 & 48
            r5 = r16
            if (r1 != 0) goto L_0x001f
            int r1 = X.G9t.A0F(r14, r5)
            r0 = r0 | r1
        L_0x001f:
            r3 = r0 & 19
            r1 = 18
            if (r3 != r1) goto L_0x003a
            boolean r1 = r14.Bwn()
            if (r1 == 0) goto L_0x003a
            r14.Evl()
        L_0x002e:
            X.5Xd r1 = r12.ASQ()
            if (r1 == 0) goto L_0x0039
            r0 = 26
            X.JGO.A01(r1, r2, r5, r8, r0)
        L_0x0039:
            return
        L_0x003a:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0048
            r3 = 1988704742(0x768939e6, float:1.3916387E33)
            java.lang.String r1 = "com.instagram.newsfeed.compose.ui.Ufi (NewsfeedStoryRow.kt:559)"
            X.0fL.A01(r3, r1)
        L_0x0048:
            X.5Zp r1 = X.C287215Zl.A04
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            X.5RD r7 = X.C51965G9l.A0Q(r14, r1)
            r4 = 0
            int r10 = X.C287425a7.A00(r14)
            r1 = r12
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r6 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r14, r3)
            X.C51973G9u.A0y(r14, r1)
            X.C51971G9r.A12(r14, r7, r6)
            X.0sL r7 = X.C287485aD.A02
            boolean r6 = r1.A0K
            if (r6 != 0) goto L_0x0072
            boolean r6 = X.C51972G9s.A1Q(r14, r10)
            if (r6 != 0) goto L_0x0075
        L_0x0072:
            X.C51971G9r.A13(r14, r7, r10)
        L_0x0075:
            X.C51965G9l.A18(r14, r9)
            boolean r10 = r15.A04
            r6 = 2131238362(0x7f081dda, float:1.8093E38)
            if (r10 == 0) goto L_0x0082
            r6 = 2131238360(0x7f081dd8, float:1.8092997E38)
        L_0x0082:
            X.2DO r14 = X.C287975bA.A00(r14, r6, r4)
            r6 = -1431079983(0xffffffffaab373d1, float:-3.187715E-13)
            r12.ExS(r6)
            boolean r9 = r15.A03
            if (r9 == 0) goto L_0x00dc
            r6 = 2131964937(0x7f133409, float:1.956667E38)
            java.lang.String r15 = X.C288035bG.A00(r12, r6)
            r11 = 1086324736(0x40c00000, float:6.0)
            r7 = 1084227584(0x40a00000, float:5.0)
            r6 = 0
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A0B(r3, r6, r11, r7, r6)
            r7 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A0D(r6, r7)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A08(r6, r7)
            r6 = -1431071377(0xffffffffaab3956f, float:-3.1900478E-13)
            boolean r7 = X.C51973G9u.A1O(r12, r6, r0)
            java.lang.Object r6 = r12.ECw()
            if (r7 != 0) goto L_0x00bb
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r6 != r7) goto L_0x00c5
        L_0x00bb:
            r7 = 38
            X.MIy r6 = new X.MIy
            r6.<init>(r5, r7)
            r12.FLL(r6)
        L_0x00c5:
            androidx.compose.ui.Modifier r13 = X.C51969G9p.A0V(r1, r11, r6)
            if (r10 == 0) goto L_0x01c1
            r6 = -1431067562(0xffffffffaab3a456, float:-3.1910818E-13)
            X.5Yw r6 = X.C51967G9n.A0a(r12, r6)
            long r6 = r6.A0T
        L_0x00d4:
            X.C286565Wx.A0L(r1, r4)
            r16 = r6
            X.C288165bT.A08(r12, r13, r14, r15, r16)
        L_0x00dc:
            X.C286565Wx.A0L(r1, r4)
            r6 = -1431064989(0xffffffffaab3ae63, float:-3.1917793E-13)
            r12.ExS(r6)
            boolean r6 = r2.A05
            if (r6 == 0) goto L_0x0168
            java.lang.Integer r10 = r2.A01
            r7 = -1431063538(0xffffffffaab3b40e, float:-3.1921725E-13)
            r12.ExS(r7)
            if (r10 == 0) goto L_0x012a
            java.lang.String r15 = X.C51968G9o.A13(r12, r10)
            r11 = 1082130432(0x40800000, float:4.0)
            r10 = 1086324736(0x40c00000, float:6.0)
            r7 = 0
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r3, r11, r10, r11, r7)
            r7 = 1806327379(0x6baa5e53, float:4.1192565E26)
            boolean r10 = X.C51973G9u.A1O(r12, r7, r0)
            java.lang.Object r7 = r12.ECw()
            if (r10 != 0) goto L_0x0111
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r7 != r10) goto L_0x011b
        L_0x0111:
            r10 = 39
            X.MIy r7 = new X.MIy
            r7.<init>(r5, r10)
            r12.FLL(r7)
        L_0x011b:
            androidx.compose.ui.Modifier r13 = X.C51969G9p.A0V(r1, r11, r7)
            long r16 = X.C51966G9m.A0M(r12)
            X.5Z4 r14 = X.C51966G9m.A0f(r12)
            X.AnonymousClass5ZZ.A0Q(r12, r13, r14, r15, r16)
        L_0x012a:
            X.C286565Wx.A0L(r1, r4)
            java.lang.Integer r7 = r2.A02
            if (r7 == 0) goto L_0x0168
            java.lang.String r15 = X.C51968G9o.A13(r12, r7)
            r11 = 1082130432(0x40800000, float:4.0)
            r10 = 1086324736(0x40c00000, float:6.0)
            r7 = 0
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r3, r11, r10, r11, r7)
            r7 = 1806339965(0x6baa8f7d, float:4.1239E26)
            boolean r7 = X.C51974G9v.A1Y(r12, r7, r0)
            java.lang.Object r10 = r12.ECw()
            if (r7 != 0) goto L_0x014f
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r10 != r7) goto L_0x0159
        L_0x014f:
            r7 = 40
            X.MIy r10 = new X.MIy
            r10.<init>(r5, r7)
            r12.FLL(r10)
        L_0x0159:
            androidx.compose.ui.Modifier r13 = X.C51969G9p.A0V(r1, r11, r10)
            long r16 = X.C51966G9m.A0M(r12)
            X.5Z4 r14 = X.C51966G9m.A0f(r12)
            X.AnonymousClass5ZZ.A0Q(r12, r13, r14, r15, r16)
        L_0x0168:
            X.C286565Wx.A0L(r1, r4)
            r7 = -1431038781(0xffffffffaab414c3, float:-3.198883E-13)
            r12.ExS(r7)
            java.lang.Integer r7 = r2.A00
            if (r7 == 0) goto L_0x01b3
            if (r9 != 0) goto L_0x017a
            r10 = 0
            if (r6 == 0) goto L_0x017c
        L_0x017a:
            r10 = 1084227584(0x40a00000, float:5.0)
        L_0x017c:
            java.lang.String r15 = X.C51968G9o.A13(r12, r7)
            r9 = 1086324736(0x40c00000, float:6.0)
            r7 = 1082130432(0x40800000, float:4.0)
            r6 = 0
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A0B(r3, r10, r9, r7, r6)
            r3 = 1806357493(0x6baad3f5, float:4.1303666E26)
            boolean r0 = X.C51974G9v.A1Y(r12, r3, r0)
            java.lang.Object r3 = r12.ECw()
            if (r0 != 0) goto L_0x019a
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x01a4
        L_0x019a:
            r0 = 41
            X.MIy r3 = new X.MIy
            r3.<init>(r5, r0)
            r12.FLL(r3)
        L_0x01a4:
            androidx.compose.ui.Modifier r13 = X.C51969G9p.A0V(r1, r6, r3)
            long r16 = X.C51966G9m.A0M(r12)
            X.5Z4 r14 = X.C51966G9m.A0f(r12)
            X.AnonymousClass5ZZ.A0Q(r12, r13, r14, r15, r16)
        L_0x01b3:
            boolean r0 = X.C51971G9r.A1S(r12, r1, r4)
            if (r0 == 0) goto L_0x002e
            r0 = 1764311306(0x6929410a, float:1.2788475E25)
            X.0fL.A00(r0)
            goto L_0x002e
        L_0x01c1:
            r6 = -1431066598(0xffffffffaab3a81a, float:-3.191343E-13)
            X.5Yw r6 = X.C51967G9n.A0a(r12, r6)
            long r6 = r6.A0s
            goto L_0x00d4
        L_0x01cc:
            r0 = r8
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQY.A0F(X.5Wy, X.GRh, X.0sP, int):void");
    }

    public static final void A0H(C286575Wy r20, Integer num, 0sP r22, int i, int i2) {
        int i3;
        C288185bV A0R;
        C286575Wy r8 = r20;
        r8.ExV(-790594180);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r8, i5) | i2;
        } else {
            i3 = i4;
        }
        Integer num2 = num;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r8, num2);
        }
        0sP r14 = r22;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0G(r8, r14);
        }
        if ((i3 & 147) != 146 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-584795696, "com.instagram.newsfeed.compose.ui.Avatar (NewsfeedStoryRow.kt:249)");
            }
            AnonymousClass2DO A0Y = C51966G9m.A0Y(r8, i3, i5);
            C52377GQc gQc = C52377GQc.A00;
            r8.ExS(-204132050);
            if (num == null) {
                A0R = null;
            } else {
                A0R = C51968G9o.A0R(C289505di.A00(r8, num2.intValue()));
            }
            C286565Wx r7 = (C286565Wx) r8;
            C286565Wx.A0L(r7, false);
            r8.ExS(-204132484);
            if (A0R == null) {
                A0R = C51968G9o.A0R(C51966G9m.A0G(r8));
            }
            C286565Wx.A0L(r7, false);
            GRY.A00(r8, (Modifier) null, A0R, A0Y, C288075bK.A05, gQc, r14, 805306416, (i3 >> 6) & 14, 484, C51966G9m.A0K(r8), 0, false, false, false);
            if (0fL.A02()) {
                0fL.A00(332955324);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(num2, r14, i5, i4, 34);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r45, androidx.compose.ui.Modifier r46, X.JV5 r47, X.C54698HPd r48, X.C52406GRh r49, X.C59643JRl r50, java.lang.String r51, java.lang.String r52, X.0sP r53, X.0sP r54, X.0sP r55, X.0sP r56, double r57, int r59, int r60, int r61, boolean r62) {
        /*
            r27 = r46
            r30 = r51
            r16 = r57
            r29 = r52
            r31 = r49
            r23 = r56
            r28 = r62
            r26 = r53
            r25 = r54
            r24 = r55
            r8 = 0
            r57 = r50
            r0 = r57
            X.0qQ.A0B(r0, r8)
            r32 = 1
            r1 = 2
            r58 = r48
            r0 = r58
            X.0qQ.A0B(r0, r1)
            r0 = 477600064(0x1c779940, float:8.1923516E-22)
            r5 = r45
            r5.ExV(r0)
            r3 = r61
            r0 = r61 & 1
            r4 = r59
            if (r0 == 0) goto L_0x048c
            r2 = r59 | 6
        L_0x0038:
            r0 = r61 & 2
            r59 = r47
            if (r0 == 0) goto L_0x0479
            r2 = r2 | 48
        L_0x0040:
            r0 = r61 & 4
            if (r0 == 0) goto L_0x0466
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0046:
            r19 = r61 & 8
            if (r19 == 0) goto L_0x0453
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r18 = r61 & 16
            if (r18 == 0) goto L_0x0440
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0052:
            r15 = r61 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r15 != 0) goto L_0x0067
            r0 = r0 & r4
            if (r0 != 0) goto L_0x0068
            r0 = r29
            boolean r1 = r5.AGu(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 == 0) goto L_0x0067
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0067:
            r2 = r2 | r0
        L_0x0068:
            r14 = r61 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r14 != 0) goto L_0x007d
            r0 = r0 & r4
            if (r0 != 0) goto L_0x007e
            r0 = r31
            boolean r1 = r5.AGu(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x007d
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x007d:
            r2 = r2 | r0
        L_0x007e:
            r7 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 != 0) goto L_0x0093
            r0 = r0 & r4
            if (r0 != 0) goto L_0x0094
            r0 = r26
            boolean r1 = r5.AGw(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r1 == 0) goto L_0x0093
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0093:
            r2 = r2 | r0
        L_0x0094:
            r9 = r3 & 256(0x100, float:3.59E-43)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 != 0) goto L_0x00aa
            r0 = r4 & r1
            if (r0 != 0) goto L_0x00ab
            r0 = r25
            boolean r0 = r5.AGw(r0)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00aa
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00aa:
            r2 = r2 | r1
        L_0x00ab:
            r10 = r3 & 512(0x200, float:7.175E-43)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            if (r10 != 0) goto L_0x00c1
            r0 = r4 & r1
            if (r0 != 0) goto L_0x00c2
            r0 = r24
            boolean r0 = r5.AGw(r0)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x00c1
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00c1:
            r2 = r2 | r1
        L_0x00c2:
            r11 = r3 & 1024(0x400, float:1.435E-42)
            r33 = r60
            if (r11 == 0) goto L_0x042a
            r12 = r60 | 6
        L_0x00ca:
            r13 = r3 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0417
            r12 = r12 | 48
        L_0x00d0:
            r6 = r3 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0402
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x00d6:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r2 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x011f
            r1 = r12 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x011f
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x011f
            r5.Evl()
        L_0x00ef:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x011e
            X.JCy r0 = new X.JCy
            r34 = r0
            r35 = r27
            r36 = r59
            r37 = r58
            r38 = r31
            r39 = r57
            r40 = r30
            r41 = r29
            r42 = r26
            r43 = r25
            r44 = r24
            r45 = r23
            r46 = r16
            r48 = r4
            r49 = r33
            r50 = r3
            r51 = r28
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49, r50, r51)
            r1.A06 = r0
        L_0x011e:
            return
        L_0x011f:
            if (r19 == 0) goto L_0x0123
            X.5Qk r27 = androidx.compose.ui.Modifier.A00
        L_0x0123:
            if (r18 == 0) goto L_0x0127
            r30 = 0
        L_0x0127:
            if (r15 == 0) goto L_0x012b
            r29 = 0
        L_0x012b:
            if (r14 == 0) goto L_0x012f
            r31 = 0
        L_0x012f:
            if (r7 == 0) goto L_0x0133
            X.GW0 r26 = X.GW0.A00
        L_0x0133:
            if (r9 == 0) goto L_0x0137
            X.GSj r25 = X.C52431GSj.A00
        L_0x0137:
            if (r10 == 0) goto L_0x013b
            X.J3t r24 = X.C59034J3t.A00
        L_0x013b:
            if (r11 == 0) goto L_0x013f
            X.GW1 r23 = X.GW1.A00
        L_0x013f:
            if (r13 == 0) goto L_0x0143
            r28 = 0
        L_0x0143:
            if (r6 == 0) goto L_0x0147
            r16 = 0
        L_0x0147:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0155
            r1 = -578778581(0xffffffffdd808a2b, float:-1.15778286E18)
            java.lang.String r0 = "com.instagram.newsfeed.compose.ui.NewsfeedStoryRow (NewsfeedStoryRow.kt:97)"
            X.0fL.A01(r1, r0)
        L_0x0155:
            r22 = 0
            r0 = 1875283526(0x6fc68e46, float:1.2290006E29)
            r5.ExS(r0)
            r6 = r12 & 14
            r1 = 4
            r0 = 0
            if (r6 != r1) goto L_0x0164
            r0 = 1
        L_0x0164:
            java.lang.Object r10 = r5.ECw()
            if (r0 != 0) goto L_0x016e
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r10 != r0) goto L_0x017a
        L_0x016e:
            r1 = 36
            X.MIy r10 = new X.MIy
            r0 = r23
            r10.<init>(r0, r1)
            r5.FLL(r10)
        L_0x017a:
            X.0sa r10 = (X.C62320sa) r10
            r0 = r5
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r8)
            r1 = 1875281346(0x6fc685c2, float:1.2287947E29)
            r5.ExS(r1)
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r2
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = 0
            if (r7 != r6) goto L_0x0191
            r1 = 1
        L_0x0191:
            java.lang.Object r7 = r5.ECw()
            if (r1 != 0) goto L_0x019b
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r7 != r1) goto L_0x01a7
        L_0x019b:
            r6 = 37
            X.MIy r7 = new X.MIy
            r1 = r24
            r7.<init>(r1, r6)
            r5.FLL(r7)
        L_0x01a7:
            X.0sa r7 = (X.C62320sa) r7
            X.C286565Wx.A0L(r0, r8)
            X.0sP r9 = X.C287655aY.A00
            X.GQZ r6 = new X.GQZ
            r1 = r22
            r6.<init>(r1, r10, r7)
            r1 = r27
            androidx.compose.ui.Modifier r6 = X.C287435a8.A02(r1, r9, r6)
            androidx.compose.foundation.layout.FillElement r1 = X.C287205Zk.A02
            androidx.compose.ui.Modifier r13 = r6.Ezh(r1)
            r21 = 1094713344(0x41400000, float:12.0)
            r11 = 1098907648(0x41800000, float:16.0)
            r6 = r16
            float r10 = (float) r6
            r1 = r21
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A0B(r13, r1, r10, r11, r10)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            androidx.compose.foundation.layout.IntrinsicHeightElement r1 = new androidx.compose.foundation.layout.IntrinsicHeightElement
            r1.<init>(r6, r9)
            androidx.compose.ui.Modifier r7 = r7.Ezh(r1)
            java.lang.String r6 = "activity_feed_newsfeed_story_row"
            androidx.compose.ui.platform.TestTagElement r1 = new androidx.compose.ui.platform.TestTagElement
            r1.<init>(r6)
            androidx.compose.ui.Modifier r11 = r7.Ezh(r1)
            X.5Zp r7 = X.C287215Zl.A05
            X.5Zu r6 = X.C287275Zs.A01
            r1 = 48
            X.5RD r10 = X.C287395a4.A02(r6, r5, r7, r1)
            int r9 = X.C287425a7.A00(r5)
            X.5RM r7 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r5, r11)
            X.0sa r14 = X.C287485aD.A00
            r5.ExX()
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x03fd
            r5.AMT(r14)
        L_0x0206:
            X.0sL r13 = X.C287485aD.A03
            X.C287595aO.A00(r5, r10, r13)
            X.0sL r11 = X.C287485aD.A05
            X.C287595aO.A00(r5, r7, r11)
            X.0sL r10 = X.C287485aD.A02
            boolean r1 = r0.A0K
            if (r1 != 0) goto L_0x0224
            java.lang.Object r7 = r5.ECw()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r1 = X.0qQ.A0K(r7, r1)
            if (r1 != 0) goto L_0x022e
        L_0x0224:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r5.FLL(r1)
            r5.ABr(r1, r10)
        L_0x022e:
            X.0sL r9 = X.C287485aD.A04
            X.C287595aO.A00(r5, r6, r9)
            X.6FX r15 = X.AnonymousClass6FX.A00
            r6 = r2 & 14
            int r1 = r2 >> 21
            r1 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 | r1
            int r1 = r12 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r6
            r35 = r57
            r36 = r25
            r37 = r1
            r38 = r8
            r39 = r28
            r34 = r5
            A0G(r34, r35, r36, r37, r38, r39)
            X.5Qk r20 = androidx.compose.ui.Modifier.A00
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = r20
            r1 = r32
            androidx.compose.ui.Modifier r6 = r15.FNR(r6, r7, r1)
            androidx.compose.foundation.layout.FillElement r1 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r7 = r6.Ezh(r1)
            r15 = 1090519040(0x41000000, float:8.0)
            if (r29 == 0) goto L_0x03f9
            int r1 = r29.length()
            if (r1 <= 0) goto L_0x03f9
        L_0x026c:
            r6 = 1090519040(0x41000000, float:8.0)
            r1 = 0
            r12 = r21
            androidx.compose.ui.Modifier r19 = X.C287195Zj.A0B(r7, r6, r15, r1, r12)
            X.5a0 r6 = X.C287275Zs.A02
            X.5Zr r12 = X.C287215Zl.A02
            r7 = 6
            X.5RD r18 = X.C291495hO.A02(r6, r5, r12, r7)
            int r15 = X.C287425a7.A00(r5)
            X.5RM r12 = X.C286565Wx.A04(r0)
            r6 = r19
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r5, r6)
            r5.ExX()
            boolean r6 = r0.A0K
            if (r6 == 0) goto L_0x03f4
            r5.AMT(r14)
        L_0x0296:
            r6 = r18
            X.C287595aO.A00(r5, r6, r13)
            X.C287595aO.A00(r5, r12, r11)
            boolean r6 = r0.A0K
            if (r6 != 0) goto L_0x02b0
            java.lang.Object r11 = r5.ECw()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            boolean r6 = X.0qQ.A0K(r11, r6)
            if (r6 != 0) goto L_0x02ba
        L_0x02b0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r5.FLL(r6)
            r5.ABr(r6, r10)
        L_0x02ba:
            X.C287595aO.A00(r5, r7, r9)
            r6 = 7986074(0x79db9a, float:1.1190873E-38)
            r5.ExS(r6)
            if (r29 == 0) goto L_0x02e0
            X.5Yw r6 = X.AnonymousClass5aQ.A00(r5)
            long r6 = r6.A0t
            X.5ZE r9 = X.AnonymousClass5aQ.A01(r5)
            X.5Z4 r11 = r9.A02
            r10 = 1073741824(0x40000000, float:2.0)
            r9 = r20
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r9, r1, r1, r1, r10)
            r12 = r29
            r13 = r6
            r9 = r5
            X.AnonymousClass5ZZ.A0W(r9, r10, r11, r12, r13)
        L_0x02e0:
            X.C286565Wx.A0L(r0, r8)
            r6 = 7994786(0x79fda2, float:1.1203081E-38)
            r5.ExS(r6)
            if (r30 == 0) goto L_0x031e
            X.5Yw r6 = X.AnonymousClass5aQ.A00(r5)
            long r6 = r6.A0o
            r51 = 0
            X.5ZE r9 = X.AnonymousClass5aQ.A01(r5)
            X.5Z4 r9 = r9.A01
            r48 = 16378(0x3ffa, float:2.295E-41)
            r35 = r22
            r36 = r9
            r37 = r22
            r38 = r22
            r39 = r22
            r40 = r30
            r41 = r22
            r42 = r8
            r43 = r8
            r44 = r8
            r45 = r8
            r46 = r8
            r47 = r8
            r49 = r6
            r53 = r51
            r55 = r8
            X.AnonymousClass5ZZ.A03(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53, r55)
        L_0x031e:
            X.C286565Wx.A0L(r0, r8)
            r6 = r59
            java.lang.Object r9 = r6.A00
            X.5Tq r9 = (X.C286025Tq) r9
            X.5Yw r6 = X.AnonymousClass5aQ.A00(r5)
            long r12 = r6.A0o
            X.5ZE r6 = X.AnonymousClass5aQ.A01(r5)
            X.5Z4 r6 = r6.A00
            r15 = r6
            X.5ZE r6 = X.AnonymousClass5aQ.A01(r5)
            X.5Z4 r6 = r6.A00
            X.5ZB r6 = r6.A02
            long r10 = r6.A01
            X.5ZE r6 = X.AnonymousClass5aQ.A01(r5)
            X.5Z4 r6 = r6.A00
            X.5ZB r6 = r6.A02
            long r6 = r6.A01
            r39 = 7
            X.GQa r14 = new X.GQa
            r35 = r10
            r37 = r6
            r34 = r14
            r34.<init>(r35, r37, r39)
            X.0sK r6 = X.C52519GVw.A00
            X.GQb r10 = new X.GQb
            r10.<init>(r14, r6)
            java.lang.String r7 = "verified"
            X.0eP r6 = new X.0eP
            r6.<init>(r7, r10)
            X.0eP[] r10 = new X.0eP[]{r6}
            X.6G6 r7 = X.AnonymousClass6G6.A03
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>"
            X.0qQ.A0C(r7, r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.collections.immutable.PersistentMap<K of kotlinx.collections.immutable.ExtensionsKt.mutate, V of kotlinx.collections.immutable.ExtensionsKt.mutate>"
            X.0qQ.A0C(r7, r6)
            X.XDy r6 = new X.XDy
            r6.<init>(r7)
            X.0Yt.A0H(r6, r10)
            X.6Du r43 = r6.AEL()
            r53 = 0
            r6 = 57344(0xe000, float:8.0356E-41)
            int r49 = r2 >> 9
            r49 = r49 & r6
            r50 = 104442(0x197fa, float:1.46354E-40)
            r35 = r22
            r36 = r9
            r37 = r15
            r38 = r22
            r39 = r22
            r40 = r22
            r41 = r26
            r42 = r22
            r44 = r8
            r45 = r8
            r46 = r8
            r47 = r8
            r48 = r8
            r51 = r12
            r55 = r8
            r56 = r8
            r34 = r5
            com.instagram.compose.core.ui.IgClickableTextKt.A01(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55, r56)
            r6 = 8038838(0x7aa9b6, float:1.1264811E-38)
            r5.ExS(r6)
            if (r31 == 0) goto L_0x03c3
            int r6 = r2 >> 24
            r9 = r6 & 112(0x70, float:1.57E-43)
            r7 = r31
            r6 = r24
            A0F(r5, r7, r6, r9)
        L_0x03c3:
            X.C286565Wx.A0L(r0, r8)
            r5.ASN()
            r6 = r20
            r0 = r21
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A0B(r6, r0, r1, r1, r1)
            int r0 = r2 >> 6
            r0 = r0 & 14
            r6 = r0 | 384(0x180, float:5.38E-43)
            int r0 = r2 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = r6 | r0
            r1 = r58
            r0 = r24
            A07(r5, r7, r1, r0, r6)
            r5.ASN()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ef
            r0 = 696324172(0x2981104c, float:5.731578E-14)
            X.0fL.A00(r0)
            goto L_0x00ef
        L_0x03f4:
            r5.FMk()
            goto L_0x0296
        L_0x03f9:
            r15 = 1094713344(0x41400000, float:12.0)
            goto L_0x026c
        L_0x03fd:
            r5.FMk()
            goto L_0x0206
        L_0x0402:
            r0 = r33
            r0 = r0 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00d6
            r0 = r16
            boolean r1 = r5.AGq(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0414
            r0 = 256(0x100, float:3.59E-43)
        L_0x0414:
            r12 = r12 | r0
            goto L_0x00d6
        L_0x0417:
            r0 = r60 & 48
            if (r0 != 0) goto L_0x00d0
            r0 = r28
            boolean r1 = r5.AGv(r0)
            r0 = 16
            if (r1 == 0) goto L_0x0427
            r0 = 32
        L_0x0427:
            r12 = r12 | r0
            goto L_0x00d0
        L_0x042a:
            r0 = r60 & 6
            if (r0 != 0) goto L_0x043c
            r0 = r23
            boolean r1 = r5.AGw(r0)
            r0 = 2
            if (r1 == 0) goto L_0x0438
            r0 = 4
        L_0x0438:
            r12 = r60 | r0
            goto L_0x00ca
        L_0x043c:
            r12 = r33
            goto L_0x00ca
        L_0x0440:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0052
            r0 = r30
            boolean r1 = r5.AGu(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0450
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x0450:
            r2 = r2 | r0
            goto L_0x0052
        L_0x0453:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x004c
            r0 = r27
            boolean r1 = r5.AGu(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0463
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0463:
            r2 = r2 | r0
            goto L_0x004c
        L_0x0466:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0046
            r0 = r58
            boolean r1 = r5.AGu(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0476
            r0 = 256(0x100, float:3.59E-43)
        L_0x0476:
            r2 = r2 | r0
            goto L_0x0046
        L_0x0479:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0040
            r0 = r59
            boolean r1 = r5.AGu(r0)
            r0 = 16
            if (r1 == 0) goto L_0x0489
            r0 = 32
        L_0x0489:
            r2 = r2 | r0
            goto L_0x0040
        L_0x048c:
            r0 = r59 & 6
            if (r0 != 0) goto L_0x049e
            r0 = r57
            boolean r0 = r5.AGu(r0)
            r2 = 2
            if (r0 == 0) goto L_0x049a
            r2 = 4
        L_0x049a:
            r2 = r2 | r59
            goto L_0x0038
        L_0x049e:
            r2 = r4
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQY.A04(X.5Wy, androidx.compose.ui.Modifier, X.JV5, X.HPd, X.GRh, X.JRl, java.lang.String, java.lang.String, X.0sP, X.0sP, X.0sP, X.0sP, double, int, int, int, boolean):void");
    }
}
