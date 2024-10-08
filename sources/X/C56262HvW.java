package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HvW  reason: case insensitive filesystem */
public abstract class C56262HvW {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r2 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if ((r22 & 32) != 0) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r15, androidx.compose.ui.Modifier r16, X.C54610HKt r17, X.0sP r18, X.AnonymousClass62P r19, int r20, int r21, int r22, long r23) {
        /*
            r7 = r23
            r11 = r17
            r10 = r16
            r1 = 1
            r5 = 0
            r12 = r18
            r13 = r19
            int r23 = X.DbW.A02(r1, r13, r12)
            r0 = 1545585568(0x5c1fc3a0, float:1.79878453E17)
            r6 = r15
            r15.ExV(r0)
            r16 = r22
            r0 = r22 & 1
            r14 = r20
            r15 = r21
            if (r0 == 0) goto L_0x0182
            r4 = r21 | 6
        L_0x0023:
            r0 = r22 & 2
            if (r0 == 0) goto L_0x0177
            r4 = r4 | 48
        L_0x0029:
            r0 = r22 & 4
            if (r0 == 0) goto L_0x016c
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r9 = r22 & 8
            if (r9 == 0) goto L_0x0161
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r3 = r22 & 16
            if (r3 == 0) goto L_0x0153
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r21
            if (r0 != 0) goto L_0x0050
            r0 = r22 & 32
            if (r0 != 0) goto L_0x004d
            boolean r2 = r6.AGt(r7)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r2 != 0) goto L_0x004f
        L_0x004d:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x004f:
            r4 = r4 | r0
        L_0x0050:
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r2 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r0) goto L_0x0072
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0072
            r6.Evl()
        L_0x0062:
            X.5Xd r0 = r6.ASQ()
            if (r0 == 0) goto L_0x0071
            X.J9d r9 = new X.J9d
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A06 = r9
        L_0x0071:
            return
        L_0x0072:
            r6.Ewr()
            r0 = r21 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0141
            boolean r0 = r6.Aw3()
            if (r0 != 0) goto L_0x0141
            r6.Evl()
            r0 = r22 & 32
            if (r0 == 0) goto L_0x008a
        L_0x0089:
            r4 = r4 & r2
        L_0x008a:
            boolean r0 = X.C51967G9n.A1S(r6)
            if (r0 == 0) goto L_0x0098
            r2 = -505013827(0xffffffffe1e619bd, float:-5.3057572E20)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabLayout (IgdsSegmentedTabLayout.kt:44)"
            X.0fL.A01(r2, r0)
        L_0x0098:
            int r0 = r11.ordinal()
            if (r0 == r5) goto L_0x00e2
            if (r0 != r1) goto L_0x0191
            r0 = 61672794(0x3ad0d5a, float:1.01710915E-36)
            X.5Qk r2 = X.C51965G9l.A0K(r6, r0)
            X.5RD r1 = X.C51966G9m.A0a(r5)
            int r4 = X.C287425a7.A00(r6)
            r3 = r6
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r6, r2)
            X.C51973G9u.A0y(r6, r3)
            X.C51971G9r.A12(r6, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x00cc
            boolean r0 = X.C51972G9s.A1Q(r6, r4)
            if (r0 != 0) goto L_0x00cf
        L_0x00cc:
            X.C51971G9r.A13(r6, r1, r4)
        L_0x00cf:
            X.C51965G9l.A18(r6, r2)
            r6.ASN()
        L_0x00d5:
            boolean r0 = X.C51967G9n.A1b(r3, r5)
            if (r0 == 0) goto L_0x0062
            r0 = -142084181(0xfffffffff787f7ab, float:-5.515495E33)
            X.0fL.A00(r0)
            goto L_0x0062
        L_0x00e2:
            r0 = 61648333(0x3acadcd, float:1.0149154E-36)
            r6.ExS(r0)
            r0 = 61651072(0x3acb880, float:1.01516105E-36)
            r6.ExS(r0)
            r0 = r4 & 14
            boolean r0 = X.C51970G9q.A1V(r0)
            java.lang.Object r2 = r6.ECw()
            if (r0 != 0) goto L_0x00fe
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0108
        L_0x00fe:
            r0 = 11
            X.GLV r2 = new X.GLV
            r2.<init>(r14, r0)
            r6.FLL(r2)
        L_0x0108:
            X.0sP r2 = (X.0sP) r2
            r3 = r6
            X.5Wx r3 = (X.C286565Wx) r3
            X.C286565Wx.A0L(r3, r5)
            r1 = 1475393186(0x57f0b6a2, float:5.29334385E14)
            X.J7o r0 = new X.J7o
            r17 = r0
            r18 = r7
            r20 = r13
            r21 = r12
            r22 = r14
            r17.<init>(r18, r20, r21, r22, r23)
            X.5PJ r20 = X.AnonymousClass5PI.A01(r6, r0, r1)
            int r0 = r4 >> 15
            r0 = r0 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r1 = r4 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r18 = r10
            r19 = r2
            r21 = r0
            r22 = r5
            r23 = r7
            r17 = r6
            A01(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00d5
        L_0x0141:
            if (r9 == 0) goto L_0x0145
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
        L_0x0145:
            if (r3 == 0) goto L_0x0149
            X.HKt r11 = X.C54610HKt.Fixed
        L_0x0149:
            r0 = r22 & 32
            if (r0 == 0) goto L_0x008a
            long r7 = X.C51966G9m.A0A(r6)
            goto L_0x0089
        L_0x0153:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r21
            if (r0 != 0) goto L_0x003b
            int r0 = X.G9t.A0S(r6, r11)
            r4 = r4 | r0
            goto L_0x003b
        L_0x0161:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0035
            int r0 = X.G9t.A0R(r6, r10)
            r4 = r4 | r0
            goto L_0x0035
        L_0x016c:
            r0 = r15 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002f
            int r0 = X.G9t.A0G(r6, r12)
            r4 = r4 | r0
            goto L_0x002f
        L_0x0177:
            r0 = r21 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0029
            int r0 = X.G9t.A0P(r6, r13)
            r4 = r4 | r0
            goto L_0x0029
        L_0x0182:
            r0 = r21 & 14
            if (r0 != 0) goto L_0x018e
            int r4 = X.G9t.A05(r6, r14)
            r4 = r4 | r21
            goto L_0x0023
        L_0x018e:
            r4 = r15
            goto L_0x0023
        L_0x0191:
            r0 = 61646985(0x3aca889, float:1.0147945E-36)
            X.Wub r0 = X.C51973G9u.A0n(r6, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56262HvW.A00(X.5Wy, androidx.compose.ui.Modifier, X.HKt, X.0sP, X.62P, int, int, int, long):void");
    }

    public static final void A01(C286575Wy r20, Modifier modifier, 0sP r22, 0sL r23, int i, int i2, long j) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r10 = r20;
        r10.ExV(-1354119620);
        int i4 = i2;
        int i5 = i;
        long j2 = j;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C51970G9q.A05(r10.AGt(j2) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        0sP r2 = r22;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r10, r2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r10, modifier2);
        }
        0sL r1 = r23;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0H(r10, r1);
        }
        if ((i3 & 5851) != 1170 || !r10.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1368521849, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabLayoutImpl (IgdsSegmentedTabLayout.kt:100)");
            }
            C304846Fl.A01((C304806Fh) null, r10, AnonymousClass5R5.A00(modifier2, C58878Iz3.A00, false), (AnonymousClass5S2) null, JG1.A00(r10, r2, r1, 27, 2089636090), 0.0f, ((i3 << 6) & 896) | 1572864, 58, j2, 0);
            if (0fL.A02()) {
                0fL.A00(930419350);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9C(r2, modifier2, r1, i5, i4, 2, j2);
        }
    }
}
