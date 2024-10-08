package X;

/* renamed from: X.HSt  reason: case insensitive filesystem */
public abstract class C54786HSt {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r28, com.google.common.collect.ImmutableList r29, java.lang.String r30, java.lang.String r31, X.C62320sa r32, int r33, int r34, int r35, boolean r36) {
        /*
            r20 = r32
            r21 = r31
            r18 = r36
            r1 = 1
            r25 = r30
            r0 = r25
            X.0qQ.A0B(r0, r1)
            r0 = -545464579(0xffffffffdf7cdefd, float:-1.8221279E19)
            r1 = r28
            r1.ExV(r0)
            r28 = r35
            r0 = r35 & 1
            r26 = r33
            r4 = r34
            if (r0 == 0) goto L_0x0223
            r0 = r34 | 6
        L_0x0022:
            r2 = r35 & 2
            if (r2 == 0) goto L_0x0216
            r0 = r0 | 48
        L_0x0028:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0209
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r9 = r35 & 8
            if (r9 == 0) goto L_0x01fc
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r8 = r35 & 16
            r5 = r29
            if (r8 == 0) goto L_0x01f1
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003c:
            r7 = r35 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r7 != 0) goto L_0x004c
            r2 = r34 & r2
            if (r2 != 0) goto L_0x004d
            r2 = r20
            int r2 = X.G9t.A0J(r1, r2)
        L_0x004c:
            r0 = r0 | r2
        L_0x004d:
            r2 = 74899(0x12493, float:1.04956E-40)
            r6 = r0 & r2
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r6 != r2) goto L_0x007c
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x007c
            r1.Evl()
            r22 = r5
        L_0x0062:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x007b
            r29 = 0
            X.JAn r0 = new X.JAn
            r23 = r20
            r24 = r21
            r27 = r4
            r30 = r18
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.A06 = r0
        L_0x007b:
            return
        L_0x007c:
            r19 = 0
            r2 = r18
            boolean r18 = X.C51966G9m.A1Q(r3, r2)
            if (r9 == 0) goto L_0x0088
            java.lang.String r21 = ""
        L_0x0088:
            r22 = 0
            if (r8 != 0) goto L_0x008e
            r22 = r5
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            X.IpC r20 = X.C58269IpC.A00
        L_0x0092:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00a0
            r3 = 1604171003(0x5f9db4fb, float:2.2727967E19)
            java.lang.String r2 = "com.instagram.aistudio.editor.AiSettingsBanner (AiSettingsBanner.kt:34)"
            X.0fL.A01(r3, r2)
        L_0x00a0:
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r8 = 1098907648(0x41800000, float:16.0)
            r3 = 1090519040(0x41000000, float:8.0)
            r2 = 0
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A0B(r5, r8, r3, r2, r2)
            androidx.compose.foundation.layout.FillElement r10 = X.C287205Zk.A02
            androidx.compose.ui.Modifier r7 = r3.Ezh(r10)
            X.5RD r11 = X.C51975G9x.A0L(r1)
            int r13 = X.C287425a7.A00(r1)
            r3 = r1
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r6 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r1, r7)
            X.0sa r9 = X.C287485aD.A00
            X.C51973G9u.A0z(r1, r3, r9)
            X.0sL r7 = X.C287485aD.A03
            X.0sL r17 = X.C51969G9p.A0w(r1, r11, r6, r7)
            X.0sL r6 = X.C287485aD.A02
            boolean r11 = r3.A0K
            if (r11 != 0) goto L_0x00db
            boolean r11 = X.C51972G9s.A1Q(r1, r13)
            if (r11 != 0) goto L_0x00de
        L_0x00db:
            X.C51971G9r.A13(r1, r6, r13)
        L_0x00de:
            X.0sL r16 = X.C51966G9m.A1K(r1, r12)
            r11 = 1110441984(0x42300000, float:44.0)
            androidx.compose.ui.Modifier r15 = X.C287205Zk.A0C(r5, r11)
            r14 = 1073741824(0x40000000, float:2.0)
            long r11 = X.C51966G9m.A0C(r1)
            X.5ZQ r13 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r12 = X.C304816Fi.A03(r15, r13, r14, r11)
            r11 = 1092616192(0x41200000, float:10.0)
            androidx.compose.ui.Modifier r30 = X.C287195Zj.A07(r12, r11)
            r11 = r26
            X.2DO r31 = X.C51966G9m.A0Y(r1, r0, r11)
            r34 = 0
            r33 = 26
            r29 = r1
            r32 = r19
            X.C288165bT.A00(r29, r30, r31, r32, r33, r34)
            if (r18 == 0) goto L_0x01c2
            r8 = 1273632078(0x4bea154e, float:3.0681756E7)
            r1.ExS(r8)
            X.5Zx r11 = X.C287275Zs.A07
            X.5Zr r10 = X.C287215Zl.A02
            r8 = r19
            X.5RD r13 = X.C291495hO.A02(r11, r1, r10, r8)
            int r11 = X.C287425a7.A00(r1)
            X.5RM r12 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r1, r5)
            X.C51973G9u.A0z(r1, r3, r9)
            X.C287595aO.A00(r1, r13, r7)
            r7 = r17
            boolean r7 = X.C51965G9l.A1Y(r1, r3, r12, r7)
            if (r7 != 0) goto L_0x013d
            boolean r7 = X.C51972G9s.A1Q(r1, r11)
            if (r7 != 0) goto L_0x0140
        L_0x013d:
            X.C51971G9r.A13(r1, r6, r11)
        L_0x0140:
            r6 = r16
            X.C287595aO.A00(r1, r8, r6)
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A05(r5)
            androidx.compose.ui.Modifier r8 = X.C287205Zk.A00(r10, r6)
            long r12 = X.C51966G9m.A0H(r1)
            X.5Z4 r10 = X.C51966G9m.A0b(r1)
            r7 = r25
            r6 = r21
            X.5Tq r9 = X.C54787HSu.A00(r1, r7, r6)
            r6 = 943696288(0x383fa9a0, float:4.5695924E-5)
            r1.ExS(r6)
            boolean r0 = X.C51975G9x.A1O(r0)
            java.lang.Object r6 = r1.ECw()
            if (r0 != 0) goto L_0x0171
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x0179
        L_0x0171:
            r6 = 45
            r0 = r20
            X.MMr r6 = X.G9w.A0q(r1, r0, r6)
        L_0x0179:
            X.0sP r11 = X.C51965G9l.A0z(r3, r6)
            r7 = r1
            com.instagram.compose.core.ui.IgClickableTextKt.A08(r7, r8, r9, r10, r11, r12)
            r0 = 943697711(0x383faf2f, float:4.57011E-5)
            r1.ExS(r0)
            if (r22 == 0) goto L_0x01b9
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x01b9
            java.util.Iterator r8 = r22.iterator()
        L_0x0193:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r7 = r8.next()
            X.5Z4 r11 = X.C51966G9m.A0b(r1)
            long r13 = X.C51966G9m.A0H(r1)
            r6 = 1103101952(0x41c00000, float:24.0)
            r0 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r5, r6, r0, r2, r2)
            r0 = 2131952810(0x7f1304aa, float:1.9542073E38)
            java.lang.String r12 = X.C51968G9o.A14(r1, r7, r0)
            r9 = r1
            X.AnonymousClass5ZZ.A0W(r9, r10, r11, r12, r13)
            goto L_0x0193
        L_0x01b9:
            r0 = r19
            X.C286565Wx.A0L(r3, r0)
            r1.ASN()
            goto L_0x01e1
        L_0x01c2:
            r6 = 1274479649(0x4bf70421, float:3.2376898E7)
            r1.ExS(r6)
            androidx.compose.ui.Modifier r5 = r5.Ezh(r10)
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A0B(r5, r8, r2, r8, r2)
            long r11 = X.C51966G9m.A0H(r1)
            r8 = 5
            int r9 = X.C51965G9l.A03(r0)
            r10 = 32632(0x7f78, float:4.5727E-41)
            r5 = r1
            r7 = r25
            X.AnonymousClass5ZZ.A0b(r5, r6, r7, r8, r9, r10, r11)
        L_0x01e1:
            r0 = r19
            boolean r0 = X.C51971G9r.A1S(r1, r3, r0)
            if (r0 == 0) goto L_0x0062
            r0 = 953315353(0x38d27019, float:1.003446E-4)
            X.0fL.A00(r0)
            goto L_0x0062
        L_0x01f1:
            r2 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x003c
            int r2 = X.G9t.A0S(r1, r5)
            r0 = r0 | r2
            goto L_0x003c
        L_0x01fc:
            r2 = r4 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0034
            r2 = r21
            int r2 = X.G9t.A0R(r1, r2)
            r0 = r0 | r2
            goto L_0x0034
        L_0x0209:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x002e
            r2 = r18
            int r2 = X.G9t.A0a(r1, r2)
            r0 = r0 | r2
            goto L_0x002e
        L_0x0216:
            r2 = r34 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r25
            int r2 = X.G9t.A0P(r1, r2)
            r0 = r0 | r2
            goto L_0x0028
        L_0x0223:
            r0 = r34 & 6
            if (r0 != 0) goto L_0x0231
            r0 = r26
            int r0 = X.G9t.A05(r1, r0)
            r0 = r0 | r34
            goto L_0x0022
        L_0x0231:
            r0 = r4
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54786HSt.A00(X.5Wy, com.google.common.collect.ImmutableList, java.lang.String, java.lang.String, X.0sa, int, int, int, boolean):void");
    }
}
