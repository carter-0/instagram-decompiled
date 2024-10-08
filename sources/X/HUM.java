package X;

public abstract class HUM {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r27, androidx.compose.ui.Modifier r28, com.instagram.common.typedurl.ImageUrl r29, X.0sP r30, X.0sP r31, X.0sP r32, int r33, int r34, boolean r35) {
        /*
            r15 = r31
            r18 = r30
            r9 = 0
            r30 = r28
            r26 = r32
            r1 = r26
            r0 = r30
            X.DbW.A1N(r0, r9, r1)
            r0 = 764683644(0x2d94257c, float:1.6842298E-11)
            r11 = r27
            r11.ExV(r0)
            r22 = r34
            r0 = r34 & 1
            r10 = r33
            if (r0 == 0) goto L_0x01ce
            r3 = r33 | 6
        L_0x0022:
            r0 = r34 & 2
            r19 = r35
            if (r0 == 0) goto L_0x01c1
            r3 = r3 | 48
        L_0x002a:
            r0 = r34 & 4
            r20 = r29
            if (r0 == 0) goto L_0x01b4
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r4 = r34 & 8
            if (r4 == 0) goto L_0x01a7
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r2 = r34 & 16
            if (r2 == 0) goto L_0x019c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r1 = r34 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r1 != 0) goto L_0x004e
            r0 = r33 & r0
            if (r0 != 0) goto L_0x004f
            r0 = r26
            int r0 = X.G9t.A0J(r11, r0)
        L_0x004e:
            r3 = r3 | r0
        L_0x004f:
            r0 = 74899(0x12493, float:1.04956E-40)
            r1 = r3 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x007f
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x007f
            r11.Evl()
        L_0x0062:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x007e
            r23 = 1
            X.JAe r0 = new X.JAe
            r21 = r10
            r24 = r19
            r16 = r18
            r17 = r26
            r18 = r30
            r19 = r15
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.A06 = r0
        L_0x007e:
            return
        L_0x007f:
            if (r4 == 0) goto L_0x0083
            X.J0c r18 = X.C58939J0c.A00
        L_0x0083:
            if (r2 == 0) goto L_0x0087
            X.J0d r15 = X.C58940J0d.A00
        L_0x0087:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0095
            r1 = -838709533(0xffffffffce024ee3, float:-5.46552E8)
            java.lang.String r0 = "com.instagram.archive.updateshub.UpdatesHubSettings (UpdatesHubSettings.kt:40)"
            X.0fL.A01(r1, r0)
        L_0x0095:
            r0 = 698523784(0x29a2a088, float:7.222093E-14)
            java.lang.Object r1 = X.C51967G9n.A0m(r11, r0)
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            r0 = r19
            java.lang.Object r7 = X.C51974G9v.A0Z(r11, r1, r8, r0)
            X.5Oz r7 = (X.C284945Oz) r7
            X.5Wx r6 = X.C51965G9l.A0H(r11, r9)
            r0 = r3 & 14
            X.5Zx r2 = X.C287275Zs.A07
            X.5Zr r1 = X.C287215Zl.A02
            int r0 = r0 >> 3
            int r0 = X.C51965G9l.A01(r0)
            X.5RD r5 = X.C291495hO.A02(r2, r11, r1, r0)
            int r4 = X.C287425a7.A00(r11)
            X.5RM r1 = X.C286565Wx.A04(r6)
            r0 = r30
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r11, r0)
            X.C51973G9u.A0y(r11, r6)
            X.C51971G9r.A12(r11, r5, r1)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x00da
            boolean r0 = X.C51972G9s.A1Q(r11, r4)
            if (r0 != 0) goto L_0x00dd
        L_0x00da:
            X.C51971G9r.A13(r11, r1, r4)
        L_0x00dd:
            X.C51965G9l.A18(r11, r2)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            r29 = 1
            androidx.compose.foundation.layout.FillElement r12 = X.C287205Zk.A02
            androidx.compose.ui.Modifier r5 = r13.Ezh(r12)
            int r0 = r3 >> 6
            r0 = r0 & 14
            r1 = r0 | 3456(0xd80, float:4.843E-42)
            int r0 = r3 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            r23 = r11
            r24 = r5
            r25 = r20
            r27 = r1
            r28 = r9
            X.HUI.A00(r23, r24, r25, r26, r27, r28, r29)
            r0 = 2131976085(0x7f135f95, float:1.958928E38)
            java.lang.String r17 = X.C304346Dc.A00(r11, r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r4 = 0
            androidx.compose.ui.Modifier r16 = X.C287195Zj.A09(r5, r4, r0)
            boolean r14 = X.C51971G9r.A1W(r7)
            r0 = -524145413(0xffffffffe0c22cfb, float:-1.1193467E20)
            boolean r0 = X.C51974G9v.A1a(r11, r0, r3)
            java.lang.Object r1 = r11.ECw()
            if (r0 != 0) goto L_0x0123
            if (r1 != r8) goto L_0x012f
        L_0x0123:
            r2 = 35
            X.J6l r1 = new X.J6l
            r0 = r18
            r1.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r7)
            r11.FLL(r1)
        L_0x012f:
            X.IPo r1 = X.C57125IPo.A00(r6, r1, r14)
            r0 = 48
            r14 = r16
            r2 = r17
            X.C52636GaA.A0F(r11, r14, r1, r2, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A08(r13, r0)
            androidx.compose.ui.Modifier r2 = r0.Ezh(r12)
            long r0 = X.C51966G9m.A0K(r11)
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0X(r2, r0)
            r12 = 0
            X.C289585dr.A00(r11, r0)
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r2 = X.C304346Dc.A00(r11, r0)
            r1 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A09(r5, r1, r4)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A0B(r0, r4, r1, r4, r4)
            X.GQy r4 = X.C51965G9l.A0m(r11)
            r0 = -524129832(0xffffffffe0c269d8, float:-1.12071725E20)
            r11.ExS(r0)
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != r0) goto L_0x0176
            r12 = 1
        L_0x0176:
            java.lang.Object r1 = r11.ECw()
            if (r12 != 0) goto L_0x017e
            if (r1 != r8) goto L_0x0187
        L_0x017e:
            r0 = 2
            X.MMX r1 = new X.MMX
            r1.<init>((X.C284945Oz) r7, (X.0sP) r15, (int) r0)
            r11.FLL(r1)
        L_0x0187:
            X.0sa r0 = X.C51965G9l.A0y(r6, r1, r9)
            X.AnonymousClass6CE.A02(r11, r5, r4, r2, r0)
            boolean r0 = X.C51967G9n.A1R(r11)
            if (r0 == 0) goto L_0x0062
            r0 = 1339086763(0x4fd0d7ab, float:7.0075899E9)
            X.0fL.A00(r0)
            goto L_0x0062
        L_0x019c:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003e
            int r0 = X.G9t.A0I(r11, r15)
            r3 = r3 | r0
            goto L_0x003e
        L_0x01a7:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0038
            r0 = r18
            int r0 = X.G9t.A0H(r11, r0)
            r3 = r3 | r0
            goto L_0x0038
        L_0x01b4:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0032
            r0 = r20
            int r0 = X.G9t.A0Q(r11, r0)
            r3 = r3 | r0
            goto L_0x0032
        L_0x01c1:
            r0 = r33 & 48
            if (r0 != 0) goto L_0x002a
            r0 = r19
            int r0 = X.G9t.A0Z(r11, r0)
            r3 = r3 | r0
            goto L_0x002a
        L_0x01ce:
            r0 = r33 & 6
            if (r0 != 0) goto L_0x01dc
            r0 = r30
            int r3 = X.G9t.A0O(r11, r0)
            r3 = r3 | r33
            goto L_0x0022
        L_0x01dc:
            r3 = r10
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HUM.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.common.typedurl.ImageUrl, X.0sP, X.0sP, X.0sP, int, int, boolean):void");
    }
}
