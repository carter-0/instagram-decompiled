package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;

public abstract class I5C {
    public static final void A01(C286575Wy r14, WallPostInfo wallPostInfo, int i) {
        int i2;
        AnonymousClass2DO r7;
        long j;
        WallPostInfo wallPostInfo2 = wallPostInfo;
        0qQ.A0B(wallPostInfo, 0);
        C286575Wy r8 = r14;
        r14.ExV(-75485025);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, wallPostInfo) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1895074455, "com.instagram.wonderwall.ui.compose.components.WallPostHeaderEndContent (WallPost.kt:100)");
            }
            switch (wallPostInfo.A05.ordinal()) {
                case 0:
                case 1:
                case 6:
                    GQD.A02(r8, (Modifier) null, C52423GSb.A01(r8), 64, 1, C51967G9n.A0a(r14, -638119025).A0J);
                    break;
                case 2:
                case 4:
                    r14.ExS(-637915076);
                    r7 = C287975bA.A00(r14, R.drawable.instagram_error_pano_filled_24, 0);
                    j = C51966G9m.A09(r14);
                    break;
                case 5:
                    r14.ExS(-637638432);
                    r7 = C287975bA.A00(r14, R.drawable.instagram_circle_check_pano_filled_24, 0);
                    j = AnonymousClass5aQ.A00(r14).A10;
                    break;
                default:
                    r14.ExS(-637390277);
                    if (wallPostInfo.A09) {
                        r14.ExS(-637362253);
                        C288165bT.A06(r8, C287205Zk.A0C(Modifier.A00, 12.0f), C287975bA.A00(r14, R.drawable.instagram_pin_pano_filled_24, 0), (C288095bM) null, C304346Dc.A00(r14, 2131969494), 384, 24, 0);
                    } else {
                        r14.ExS(-637147330);
                        A02(r14, wallPostInfo, i2 & 14);
                    }
                    C51965G9l.A1X(r8, false);
                    break;
            }
            C288165bT.A03(r14, C287205Zk.A0C(Modifier.A00, 14.0f), r7, j);
            if (C51970G9q.A1a(r8, false)) {
                0fL.A00(-1617937071);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, wallPostInfo2, i3, 9);
        }
    }

    public static final void A02(C286575Wy r11, WallPostInfo wallPostInfo, int i) {
        int i2;
        0qQ.A0B(wallPostInfo, 0);
        r11.ExV(2099097626);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, wallPostInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-610800076, "com.instagram.wonderwall.ui.compose.components.WallPostTimeStamp (WallPost.kt:164)");
            }
            Context A0I = C51968G9o.A0I(r11);
            long j = wallPostInfo.A02;
            0qQ.A0B(A0I, 0);
            AnonymousClass5ZZ.A0r(r11, AnonymousClass5Z4.A01((AnonymousClass5Z2) null, C51966G9m.A0b(r11), (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, 0, 0, 15728637, 0, AnonymousClass5Z7.A01(12), 0), 1G0.A04(A0I, (double) j), C51966G9m.A0M(r11));
            if (0fL.A02()) {
                0fL.A00(-794273667);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, wallPostInfo, i, 10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r7 == false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r29, androidx.compose.ui.Modifier r30, com.instagram.wonderwall.model.WallPostItem r31, X.C66528MVg r32, java.lang.String r33, int r34, int r35, boolean r36, boolean r37, boolean r38) {
        /*
            r0 = r38
            r12 = r37
            r15 = r36
            r4 = r32
            r38 = r33
            r13 = r30
            r1 = 0
            r5 = r31
            X.0qQ.A0B(r5, r1)
            r2 = 1440060884(0x55d595d4, float:2.93549355E13)
            r3 = r29
            r3.ExV(r2)
            r29 = r35
            r6 = r35 & 1
            r2 = r34
            if (r6 == 0) goto L_0x01e9
            r8 = r34 | 6
        L_0x0024:
            r17 = r35 & 2
            if (r17 == 0) goto L_0x01de
            r8 = r8 | 48
        L_0x002a:
            r16 = r35 & 4
            if (r16 == 0) goto L_0x01d1
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r14 = r35 & 8
            if (r14 == 0) goto L_0x01c6
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r6 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0049
            r6 = r35 & 16
            if (r6 != 0) goto L_0x0046
            boolean r7 = r3.AGv(r15)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r7 != 0) goto L_0x0048
        L_0x0046:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0048:
            r8 = r8 | r6
        L_0x0049:
            r7 = r35 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r7 != 0) goto L_0x0057
            r6 = r6 & r34
            if (r6 != 0) goto L_0x0058
            int r6 = X.G9t.A0d(r3, r12)
        L_0x0057:
            r8 = r8 | r6
        L_0x0058:
            r10 = r35 & 64
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r10 != 0) goto L_0x0066
            r6 = r34 & r6
            if (r6 != 0) goto L_0x0067
            int r6 = X.G9t.A0e(r3, r0)
        L_0x0066:
            r8 = r8 | r6
        L_0x0067:
            r6 = 599187(0x92493, float:8.3964E-40)
            r9 = r8 & r6
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r6) goto L_0x009a
            boolean r6 = r3.Bwn()
            if (r6 == 0) goto L_0x009a
            r3.Evl()
        L_0x007a:
            X.5Xd r3 = r3.ASQ()
            if (r3 == 0) goto L_0x0099
            X.JAY r1 = new X.JAY
            r23 = r1
            r24 = r13
            r25 = r5
            r26 = r4
            r27 = r38
            r28 = r2
            r30 = r15
            r31 = r12
            r32 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.A06 = r1
        L_0x0099:
            return
        L_0x009a:
            r3.Ewr()
            r6 = r34 & 1
            r11 = -57345(0xffffffffffff1fff, float:NaN)
            r9 = 0
            if (r6 == 0) goto L_0x01a8
            boolean r6 = r3.Aw3()
            if (r6 != 0) goto L_0x01a8
            r3.Evl()
            r6 = r35 & 16
            if (r6 == 0) goto L_0x00b3
            r8 = r8 & r11
        L_0x00b3:
            boolean r6 = X.C51967G9n.A1S(r3)
            if (r6 == 0) goto L_0x00c1
            r7 = 1856714850(0x6eab3862, float:2.649505E28)
            java.lang.String r6 = "com.instagram.wonderwall.ui.compose.components.WallPost (WallPost.kt:52)"
            X.0fL.A01(r7, r6)
        L_0x00c1:
            com.instagram.wonderwall.model.WallPostInfo r14 = r5.BeB()
            r6 = 686869199(0x28f0cacf, float:2.6733307E-14)
            boolean r10 = X.C51967G9n.A1Y(r3, r14, r6)
            boolean r6 = X.C51973G9u.A1K(r8)
            r10 = r10 | r6
            java.lang.Object r7 = r3.ECw()
            if (r10 != 0) goto L_0x00db
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r7 != r6) goto L_0x00ee
        L_0x00db:
            boolean r6 = r14.A01()
            if (r6 != 0) goto L_0x00ea
            if (r0 == 0) goto L_0x00ea
            r6 = 47
            X.MPC r9 = new X.MPC
            r9.<init>(r4, r6)
        L_0x00ea:
            r3.FLL(r9)
            r7 = r9
        L_0x00ee:
            X.0sP r7 = (X.0sP) r7
            X.5Wx r6 = X.C51965G9l.A0H(r3, r1)
            r9 = 686877071(0x28f0e98f, float:2.6746642E-14)
            r3.ExS(r9)
            boolean r9 = r14.A00()
            if (r9 == 0) goto L_0x01a5
            X.5Qk r18 = androidx.compose.ui.Modifier.A00
            r23 = 0
            r19 = 0
            r9 = 1706693862(0x65ba14e6, float:1.0984321E23)
            r3.ExS(r9)
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            r9 = 2048(0x800, float:2.87E-42)
            boolean r17 = X.AnonymousClass7TF.A1S(r10, r9)
            r16 = r8 & 14
            boolean r8 = X.C51972G9s.A1I(r16)
            r17 = r17 | r8
            java.lang.Object r11 = r3.ECw()
            if (r17 != 0) goto L_0x0126
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r11 != r8) goto L_0x012c
        L_0x0126:
            r8 = 41
            X.MJ6 r11 = X.C51970G9q.A0v(r3, r4, r5, r8)
        L_0x012c:
            X.0sa r21 = X.C51965G9l.A0y(r6, r11, r1)
            r8 = 1706696092(0x65ba1d9c, float:1.09863295E23)
            r3.ExS(r8)
            boolean r10 = X.AnonymousClass7TF.A1S(r10, r9)
            boolean r8 = X.C51970G9q.A1V(r16)
            r10 = r10 | r8
            java.lang.Object r9 = r3.ECw()
            if (r10 != 0) goto L_0x0149
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r9 != r8) goto L_0x014f
        L_0x0149:
            r8 = 42
            X.MJ6 r9 = X.C51970G9q.A0v(r3, r4, r5, r8)
        L_0x014f:
            X.0sa r22 = X.C51965G9l.A0y(r6, r9, r1)
            r27 = 127(0x7f, float:1.78E-43)
            r20 = r19
            r24 = r23
            r25 = r23
            r26 = r23
            r28 = r1
            r17 = r3
            androidx.compose.ui.Modifier r8 = X.C52638GaC.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.ui.Modifier r31 = r13.Ezh(r8)
        L_0x0169:
            X.C286565Wx.A0L(r6, r1)
            r8 = -375904289(0xffffffffe99827df, float:-2.2993126E25)
            X.J94 r6 = new X.J94
            r16 = r6
            r17 = r14
            r18 = r5
            r19 = r4
            r20 = r38
            r21 = r7
            r22 = r15
            r23 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.5PJ r32 = X.AnonymousClass5PI.A01(r3, r6, r8)
            r34 = 24576(0x6000, float:3.4438E-41)
            r35 = 14
            r33 = 0
            r30 = r3
            r36 = r1
            r37 = r1
            X.C55194Hdk.A00(r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x007a
            r1 = -887606398(0xffffffffcb183382, float:-9974658.0)
            X.0fL.A00(r1)
            goto L_0x007a
        L_0x01a5:
            r31 = r13
            goto L_0x0169
        L_0x01a8:
            if (r17 == 0) goto L_0x01ac
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
        L_0x01ac:
            if (r16 == 0) goto L_0x01b0
            r38 = r9
        L_0x01b0:
            if (r14 == 0) goto L_0x01b3
            r4 = r9
        L_0x01b3:
            r6 = r35 & 16
            if (r6 == 0) goto L_0x01bc
            boolean r15 = X.DbW.A1a(r38)
            r8 = r8 & r11
        L_0x01bc:
            boolean r12 = X.C51966G9m.A1R(r7, r12)
            boolean r0 = X.C51966G9m.A1R(r10, r0)
            goto L_0x00b3
        L_0x01c6:
            r6 = r2 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0036
            int r6 = X.G9t.A0R(r3, r4)
            r8 = r8 | r6
            goto L_0x0036
        L_0x01d1:
            r6 = r2 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0030
            r6 = r38
            int r6 = X.G9t.A0Q(r3, r6)
            r8 = r8 | r6
            goto L_0x0030
        L_0x01de:
            r6 = r34 & 48
            if (r6 != 0) goto L_0x002a
            int r6 = X.G9t.A0P(r3, r13)
            r8 = r8 | r6
            goto L_0x002a
        L_0x01e9:
            r6 = r34 & 6
            if (r6 != 0) goto L_0x01f5
            int r8 = X.G9t.A0O(r3, r5)
            r8 = r8 | r34
            goto L_0x0024
        L_0x01f5:
            r8 = r2
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5C.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.wonderwall.model.WallPostItem, X.MVg, java.lang.String, int, int, boolean, boolean, boolean):void");
    }

    public static final void A03(C286575Wy r16, WallPostItem wallPostItem, C66528MVg mVg, float f, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        C66528MVg mVg2 = mVg;
        WallPostItem wallPostItem2 = wallPostItem;
        0qQ.A0B(wallPostItem2, 0);
        C286575Wy r13 = r16;
        r13.ExV(-59399459);
        int i4 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r13, wallPostItem2) | i;
        } else {
            i3 = i4;
        }
        float f2 = f;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A00(r13, f2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r13, mVg2);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i3 |= G9t.A0b(r13, z2);
        }
        if ((i3 & 1171) != 1170 || !r13.Bwn()) {
            if (i5 != 0) {
                mVg2 = null;
            }
            z2 = C51966G9m.A1R(i6, z2);
            if (0fL.A02()) {
                0fL.A01(1766557319, "com.instagram.wonderwall.ui.compose.components.WallPostText (WallPost.kt:144)");
            }
            String str = wallPostItem2.BeB().A07;
            long j = AnonymousClass5aQ.A00(r13).A0b;
            boolean A1T = C51966G9m.A1T(r13, j, C51967G9n.A1Y(r13, str, 565922138));
            Object ECw = r13.ECw();
            if (A1T || ECw == AnonymousClass5XT.A00) {
                ECw = C56360HxB.A01(str, j);
                r13.FLL(ECw);
            }
            C286025Tq r15 = (C286025Tq) ECw;
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            if (str.length() > 0) {
                AnonymousClass5Z4 A00 = I6X.A00(r13, r15, wallPostItem2.BAY());
                boolean A1S = AnonymousClass7TF.A1S(i3 & 896, 256) | C51968G9o.A1U(r13, r15, C51973G9u.A1N(r13, 565930325, i3), AnonymousClass7TF.A1S(i3 & 7168, C249703kE.FLAG_MOVED));
                Object ECw2 = r13.ECw();
                if (A1S || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58766IxD(21, wallPostItem2, r15, mVg2, z2);
                    r13.FLL(ECw2);
                }
                IgClickableTextKt.A05(r13, (Modifier) null, r15, A00, C51965G9l.A0z(A0H, ECw2), 112638, 0);
                G9w.A15(r13, Modifier.A00, f2);
            }
            if (0fL.A02()) {
                0fL.A00(-1923027515);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8K(wallPostItem2, mVg2, f2, i4, i2, z2);
        }
    }
}
