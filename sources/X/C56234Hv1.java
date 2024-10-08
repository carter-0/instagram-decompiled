package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hv1  reason: case insensitive filesystem */
public abstract class C56234Hv1 {
    public static final void A01(Modifier modifier, C286575Wy r10, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r4 = r10;
        r10.ExV(-130573579);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !r10.Bwn()) {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1348762717, "com.instagram.barcelona.feed.post.ui.LabelSeparator (PostPoll.kt:118)");
            }
            AnonymousClass5ZZ.A0c(r4, modifier2, " · ", ((i3 << 3) & 112) | 6, 32760, C51966G9m.A0M(r10));
            if (0fL.A02()) {
                0fL.A00(-1393256950);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier2, i2, i, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026b, code lost:
        if (r11.contains(r12) != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b7, code lost:
        if (r3 > 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r5.getValue() == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        if ((r0 - (java.lang.System.currentTimeMillis() / 1000)) < 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a4, code lost:
        if (r0.intValue() != r1) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f7, code lost:
        if (r12 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r37, androidx.compose.ui.Modifier r38, com.instagram.api.schemas.LineType r39, X.C53292Gle r40, X.0sP r41, int r42, int r43, boolean r44, boolean r45) {
        /*
            r23 = r45
            r26 = r38
            r6 = 0
            r8 = r40
            r0 = r39
            boolean r24 = X.AnonymousClass7TF.A1U(r6, r8, r0)
            r0 = -995166625(0xffffffffc4aef65f, float:-1399.6991)
            r9 = r37
            r9.ExV(r0)
            r37 = r43
            r0 = r43 & 1
            r7 = r42
            if (r0 == 0) goto L_0x0362
            r2 = r42 | 6
        L_0x001f:
            r0 = r43 & 2
            if (r0 == 0) goto L_0x0355
            r2 = r2 | 48
        L_0x0025:
            r0 = r43 & 4
            r40 = r44
            if (r0 == 0) goto L_0x0348
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002d:
            r0 = r43 & 8
            r25 = r41
            if (r0 == 0) goto L_0x033b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r4 = r43 & 16
            if (r4 == 0) goto L_0x032e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r3 = r43 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L_0x004b
            r0 = r0 & r42
            if (r0 != 0) goto L_0x004c
            r0 = r23
            int r0 = X.G9t.A0d(r9, r0)
        L_0x004b:
            r2 = r2 | r0
        L_0x004c:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r2
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x007c
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x007c
            r9.Evl()
        L_0x005e:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x007b
            X.JAd r0 = new X.JAd
            r32 = r0
            r33 = r39
            r34 = r26
            r35 = r25
            r36 = r8
            r38 = r7
            r39 = r24
            r41 = r23
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1.A06 = r0
        L_0x007b:
            return
        L_0x007c:
            if (r4 == 0) goto L_0x0080
            X.5Qk r26 = androidx.compose.ui.Modifier.A00
        L_0x0080:
            r0 = r23
            boolean r23 = X.C51966G9m.A1Q(r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0094
            r1 = -2092011812(0xffffffff834e6edc, float:-6.066522E-37)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.PostPoll (PostPoll.kt:39)"
            X.0fL.A01(r1, r0)
        L_0x0094:
            r0 = 436242533(0x1a008865, float:2.6579958E-23)
            java.lang.Object r5 = X.C51967G9n.A0m(r9, r0)
            java.lang.Object r22 = X.AnonymousClass5XT.A00
            r21 = 0
            r0 = r22
            if (r5 != r0) goto L_0x00a9
            java.lang.Integer r0 = r8.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = X.G9t.A0o(r9, r0)
        L_0x00a9:
            X.5Oz r5 = (X.C284945Oz) r5
            r4 = r9
            X.5Wx r4 = (X.C286565Wx) r4
            r20 = 0
            X.C286565Wx.A0L(r4, r6)
            X.62P r0 = r8.A03
            r27 = r0
            java.util.Iterator r1 = r27.iterator()
            r3 = 0
        L_0x00bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.next()
            X.GnJ r0 = (X.C53387GnJ) r0
            int r0 = r0.A01
            int r3 = r3 + r0
            goto L_0x00bc
        L_0x00cc:
            java.lang.Integer r10 = r8.A01
            if (r10 != 0) goto L_0x00d8
            java.lang.Object r0 = r5.getValue()
            r36 = 1
            if (r0 != 0) goto L_0x00da
        L_0x00d8:
            r36 = 0
        L_0x00da:
            int r0 = r8.A00
            r38 = r0
            long r0 = (long) r0
            long r14 = java.lang.System.currentTimeMillis()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r18
            long r12 = r0 - r14
            r16 = 0
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x00f1
            r20 = 1
        L_0x00f1:
            java.lang.Object r11 = r5.getValue()
            if (r11 != 0) goto L_0x0109
            boolean r11 = r8.A04
            if (r11 == 0) goto L_0x0109
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 / r18
            long r12 = r0 - r14
            int r11 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            r33 = 0
            if (r11 >= 0) goto L_0x010b
        L_0x0109:
            r33 = 1
        L_0x010b:
            java.lang.Object r12 = r5.getValue()
            java.lang.Integer r12 = (java.lang.Integer) r12
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 / r18
            long r0 = r0 - r13
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x01f4
            if (r12 == 0) goto L_0x01f4
        L_0x011e:
            java.lang.Integer[] r0 = new java.lang.Integer[]{r12}
            X.62O r11 = X.AnonymousClass62Q.A04(r0)
        L_0x0126:
            androidx.compose.foundation.layout.FillElement r15 = X.C287205Zk.A02
            r0 = r26
            androidx.compose.ui.Modifier r12 = r0.Ezh(r15)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = r39
            java.lang.Integer r10 = X.C304236Cr.A00(r0, r1)
            r1 = r40
            r0 = r24
            androidx.compose.ui.Modifier r13 = X.C304246Cs.A00(r12, r10, r1, r0)
            r12 = 1094713344(0x41400000, float:12.0)
            r10 = 1098907648(0x41800000, float:16.0)
            r1 = 1090519040(0x41000000, float:8.0)
            if (r23 == 0) goto L_0x0147
            r1 = 0
        L_0x0147:
            r0 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r13, r12, r0, r10, r1)
            X.6Fc r0 = X.C287275Zs.A01(r0)
            X.5RD r12 = X.G9w.A0L(r0, r9)
            int r1 = X.C287425a7.A00(r9)
            X.5RM r0 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r9, r10)
            X.0sa r14 = X.C287485aD.A00
            X.C51973G9u.A0z(r9, r4, r14)
            X.0sL r13 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r9, r12, r0, r13)
            X.0sL r12 = X.C287485aD.A02
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0178
            boolean r0 = X.C51972G9s.A1Q(r9, r1)
            if (r0 != 0) goto L_0x017b
        L_0x0178:
            X.C51971G9r.A13(r9, r12, r1)
        L_0x017b:
            X.0sL r17 = X.C51966G9m.A1K(r9, r10)
            r1 = -1327567749(0xffffffffb0deec7b, float:-1.6219838E-9)
            r0 = r27
            java.util.Iterator r16 = X.C51968G9o.A17(r9, r0, r1)
        L_0x0188:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x026f
            java.lang.Object r10 = r16.next()
            X.GnJ r10 = (X.C53387GnJ) r10
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r10.A00
            if (r0 == 0) goto L_0x01a6
            int r0 = r0.intValue()
            r34 = 1
            if (r0 == r1) goto L_0x01a8
        L_0x01a6:
            r34 = 0
        L_0x01a8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r35 = r11.contains(r0)
            java.lang.String r0 = r10.A02
            r28 = r0
            int r0 = r10.A01
            r19 = r0
            r0 = -1327553938(0xffffffffb0df226e, float:-1.6235171E-9)
            r9.ExS(r0)
            if (r41 == 0) goto L_0x01f1
            r0 = 1711326189(0x6600c3ed, float:1.5201928E23)
            boolean r1 = X.C51967G9n.A1Y(r9, r10, r0)
            boolean r0 = X.C51973G9u.A1J(r2)
            r0 = r0 | r1
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x01d6
            r0 = r22
            if (r1 != r0) goto L_0x01de
        L_0x01d6:
            r1 = 42
            r0 = r25
            X.Iw5 r1 = X.C58696Iw5.A00(r9, r0, r5, r10, r1)
        L_0x01de:
            X.0sa r29 = X.C51965G9l.A0y(r4, r1, r6)
        L_0x01e2:
            X.C286565Wx.A0L(r4, r6)
            r27 = r9
            r30 = r3
            r31 = r19
            r32 = r6
            X.C56226Hut.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x0188
        L_0x01f1:
            r29 = 0
            goto L_0x01e2
        L_0x01f4:
            if (r10 != 0) goto L_0x01f9
            r14 = 1
            if (r12 != 0) goto L_0x01fa
        L_0x01f9:
            r14 = 0
        L_0x01fa:
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r27)
            java.util.Iterator r13 = r27.iterator()
        L_0x0202:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r10 = r13.next()
            X.GnJ r10 = (X.C53387GnJ) r10
            if (r14 == 0) goto L_0x0222
            int r1 = r10.A00
            if (r12 == 0) goto L_0x0222
            int r0 = r12.intValue()
            if (r1 != r0) goto L_0x0222
            int r0 = r10.A01
            int r0 = r0 + 1
        L_0x021e:
            X.AnonymousClass7TF.A1M(r11, r0)
            goto L_0x0202
        L_0x0222:
            int r0 = r10.A01
            goto L_0x021e
        L_0x0225:
            java.lang.Comparable r10 = X.00k.A04(r11)
            java.lang.Number r10 = (java.lang.Number) r10
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r11.iterator()
            r14 = 0
        L_0x0234:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r15.next()
            int r13 = r14 + 1
            if (r14 >= 0) goto L_0x024a
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x024a:
            int r11 = X.AnonymousClass7TE.A0M(r0)
            if (r10 == 0) goto L_0x025f
            int r0 = r10.intValue()
            if (r11 != r0) goto L_0x025f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            if (r0 == 0) goto L_0x025f
            r1.add(r0)
        L_0x025f:
            r14 = r13
            goto L_0x0234
        L_0x0261:
            X.62P r11 = X.AnonymousClass62Q.A00(r1)
            if (r12 == 0) goto L_0x0126
            boolean r0 = r11.contains(r12)
            if (r0 == 0) goto L_0x0126
            goto L_0x011e
        L_0x026f:
            X.C286565Wx.A0L(r4, r6)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = r0.Ezh(r15)
            X.5RD r0 = X.C51968G9o.A0V(r9)
            int r2 = X.C287425a7.A00(r9)
            X.5RM r10 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r9, r1)
            X.C51973G9u.A0z(r9, r4, r14)
            X.C287595aO.A00(r9, r0, r13)
            r0 = r18
            boolean r0 = X.C51965G9l.A1Y(r9, r4, r10, r0)
            if (r0 != 0) goto L_0x029c
            boolean r0 = X.C51972G9s.A1Q(r9, r2)
            if (r0 != 0) goto L_0x029f
        L_0x029c:
            X.C51971G9r.A13(r9, r12, r2)
        L_0x029f:
            r0 = r17
            X.C287595aO.A00(r9, r1, r0)
            int r3 = r3 + r36
            java.lang.Object r0 = r5.getValue()
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x02b6
            if (r1 != 0) goto L_0x02b6
            if (r20 == 0) goto L_0x02b9
        L_0x02b6:
            r2 = 1
            if (r3 > 0) goto L_0x02ba
        L_0x02b9:
            r2 = 0
        L_0x02ba:
            r0 = 1711343143(0x66010627, float:1.523247E23)
            r9.ExS(r0)
            if (r2 == 0) goto L_0x02d0
            r1 = 2131820571(0x7f11001b, float:1.927386E38)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r0 = X.C304346Dc.A02(r9, r0, r1, r3)
            X.C51975G9x.A15(r9, r0)
        L_0x02d0:
            X.C286565Wx.A0L(r4, r6)
            if (r20 != 0) goto L_0x030b
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x0304
            r0 = 1512453157(0x5a263425, float:1.16955449E16)
            r9.ExS(r0)
            r0 = 1711357030(0x66013c66, float:1.5257486E23)
            r9.ExS(r0)
            if (r2 == 0) goto L_0x02ee
            r1 = r21
            r0 = r24
            A01(r1, r9, r6, r0)
        L_0x02ee:
            X.C286565Wx.A0L(r4, r6)
            r0 = r38
            X.C54822HUd.A00(r9, r0, r6)
        L_0x02f6:
            boolean r0 = X.C51973G9u.A1R(r9, r4)
            if (r0 == 0) goto L_0x005e
            r0 = 923696704(0x370e7e40, float:8.493254E-6)
            X.0fL.A00(r0)
            goto L_0x005e
        L_0x0304:
            r0 = 1512881205(0x5a2cbc35, float:1.2155158E16)
            r9.ExS(r0)
            goto L_0x02f6
        L_0x030b:
            r0 = 1512620774(0x5a28c2e6, float:1.18755223E16)
            r9.ExS(r0)
            r0 = 1711362310(0x66015106, float:1.5266997E23)
            r9.ExS(r0)
            if (r2 == 0) goto L_0x0320
            r1 = r21
            r0 = r24
            A01(r1, r9, r6, r0)
        L_0x0320:
            X.C286565Wx.A0L(r4, r6)
            r0 = 2131953674(0x7f13080a, float:1.9543826E38)
            java.lang.String r0 = X.C288035bG.A00(r9, r0)
            X.C51975G9x.A15(r9, r0)
            goto L_0x02f6
        L_0x032e:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003b
            r0 = r26
            int r0 = X.G9t.A0S(r9, r0)
            r2 = r2 | r0
            goto L_0x003b
        L_0x033b:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0035
            r0 = r25
            int r0 = X.G9t.A0H(r9, r0)
            r2 = r2 | r0
            goto L_0x0035
        L_0x0348:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002d
            r0 = r40
            int r0 = X.G9t.A0a(r9, r0)
            r2 = r2 | r0
            goto L_0x002d
        L_0x0355:
            r0 = r42 & 48
            if (r0 != 0) goto L_0x0025
            r0 = r39
            int r0 = X.G9t.A0P(r9, r0)
            r2 = r2 | r0
            goto L_0x0025
        L_0x0362:
            r0 = r42 & 6
            if (r0 != 0) goto L_0x036e
            int r2 = X.G9t.A0O(r9, r8)
            r2 = r2 | r42
            goto L_0x001f
        L_0x036e:
            r2 = r7
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56234Hv1.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.Gle, X.0sP, int, int, boolean, boolean):void");
    }
}
