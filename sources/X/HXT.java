package X;

public abstract class HXT {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if ((r1 & 3072) == 2048) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r23, androidx.compose.ui.Modifier r24, X.0sL r25, X.0sL r26, X.0sJ r27, int r28, int r29) {
        /*
            r8 = r27
            r11 = r24
            java.lang.String r20 = "badge"
            r12 = 0
            r22 = r25
            r0 = r22
            X.0qQ.A0B(r0, r12)
            java.lang.String r15 = "content"
            r1 = 1
            r21 = r26
            r0 = r21
            X.0qQ.A0B(r0, r1)
            r0 = 1283816727(0x4c857d17, float:6.9986488E7)
            r13 = r23
            r13.ExV(r0)
            r9 = r29
            r0 = r29 & 1
            r10 = r28
            if (r0 == 0) goto L_0x01b3
            r1 = r28 | 6
        L_0x002a:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x01a6
            r1 = r1 | 48
        L_0x0030:
            r4 = r29 & 4
            if (r4 == 0) goto L_0x019b
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x004b
            r0 = r29 & 8
            if (r0 != 0) goto L_0x0048
            boolean r2 = r13.AGw(r8)
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 != 0) goto L_0x004a
        L_0x0048:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x004a:
            r1 = r1 | r0
        L_0x004b:
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r2 != r0) goto L_0x0074
            boolean r0 = r13.Bwn()
            if (r0 == 0) goto L_0x0074
            r13.Evl()
        L_0x005a:
            X.5Xd r0 = r13.ASQ()
            if (r0 == 0) goto L_0x0073
            r19 = 12
            X.JG8 r12 = new X.JG8
            r14 = r21
            r15 = r8
            r16 = r22
            r17 = r10
            r18 = r9
            r13 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.A06 = r12
        L_0x0073:
            return
        L_0x0074:
            r13.Ewr()
            r0 = r28 & 1
            if (r0 == 0) goto L_0x0174
            boolean r0 = r13.Aw3()
            if (r0 != 0) goto L_0x0174
            int r1 = X.C51971G9r.A05(r13, r9, r1)
        L_0x0085:
            boolean r0 = X.C51967G9n.A1S(r13)
            if (r0 == 0) goto L_0x0093
            r2 = 622382100(0x2518cc14, float:1.3253043E-16)
            java.lang.String r0 = "com.instagram.compose.ui.badge.BadgeScaffold (BadgeScaffold.kt:48)"
            X.0fL.A01(r2, r0)
        L_0x0093:
            r0 = 505540078(0x1e21edee, float:8.572472E-21)
            r13.ExS(r0)
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            if (r0 <= r3) goto L_0x00a5
            boolean r0 = r13.AGu(r8)
            if (r0 != 0) goto L_0x00aa
        L_0x00a5:
            r2 = r1 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r2 != r3) goto L_0x00ab
        L_0x00aa:
            r0 = 1
        L_0x00ab:
            java.lang.Object r4 = r13.ECw()
            if (r0 != 0) goto L_0x00b5
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x00be
        L_0x00b5:
            r0 = 2
            X.IGL r4 = new X.IGL
            r4.<init>(r8, r0)
            r13.FLL(r4)
        L_0x00be:
            X.5Wx r14 = X.C51965G9l.A0H(r13, r12)
            int r19 = r1 >> 3
            int r3 = X.C287425a7.A00(r13)
            X.5RM r0 = X.C286565Wx.A04(r14)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r13, r11)
            X.0sa r7 = X.C287485aD.A00
            X.C51973G9u.A0z(r13, r14, r7)
            X.0sL r6 = X.C287485aD.A03
            X.0sL r5 = X.C51969G9p.A0w(r13, r4, r0, r6)
            X.0sL r4 = X.C287485aD.A02
            boolean r0 = r14.A0K
            if (r0 != 0) goto L_0x00e7
            boolean r0 = X.C51972G9s.A1Q(r13, r3)
            if (r0 != 0) goto L_0x00ea
        L_0x00e7:
            X.C51971G9r.A13(r13, r4, r3)
        L_0x00ea:
            X.0sL r3 = X.C51966G9m.A1K(r13, r2)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.layout.LayoutIdElement r0 = new androidx.compose.ui.layout.LayoutIdElement
            r0.<init>(r15)
            androidx.compose.ui.Modifier r0 = r2.Ezh(r0)
            X.5RD r18 = X.C51966G9m.A0Z(r12)
            int r15 = X.C287425a7.A00(r13)
            X.5RM r17 = X.C286565Wx.A04(r14)
            androidx.compose.ui.Modifier r16 = X.C287435a8.A01(r13, r0)
            X.C51973G9u.A0z(r13, r14, r7)
            r0 = r18
            X.C287595aO.A00(r13, r0, r6)
            r0 = r17
            boolean r0 = X.C51965G9l.A1Y(r13, r14, r0, r5)
            if (r0 != 0) goto L_0x011f
            boolean r0 = X.C51972G9s.A1Q(r13, r15)
            if (r0 != 0) goto L_0x0122
        L_0x011f:
            X.C51971G9r.A13(r13, r4, r15)
        L_0x0122:
            r0 = r16
            X.C287595aO.A00(r13, r0, r3)
            r15 = r21
            r0 = r19
            X.C51972G9s.A11(r13, r15, r0)
            androidx.compose.ui.layout.LayoutIdElement r15 = new androidx.compose.ui.layout.LayoutIdElement
            r0 = r20
            r15.<init>(r0)
            androidx.compose.ui.Modifier r15 = r2.Ezh(r15)
            X.5RD r12 = X.C51966G9m.A0a(r12)
            int r2 = X.C287425a7.A00(r13)
            X.5RM r0 = X.C286565Wx.A04(r14)
            androidx.compose.ui.Modifier r15 = X.C287435a8.A01(r13, r15)
            X.C51973G9u.A0z(r13, r14, r7)
            X.C287595aO.A00(r13, r12, r6)
            boolean r0 = X.C51965G9l.A1Y(r13, r14, r0, r5)
            if (r0 != 0) goto L_0x015b
            boolean r0 = X.C51972G9s.A1Q(r13, r2)
            if (r0 != 0) goto L_0x015e
        L_0x015b:
            X.C51971G9r.A13(r13, r4, r2)
        L_0x015e:
            X.C287595aO.A00(r13, r15, r3)
            r0 = r22
            X.C51972G9s.A11(r13, r0, r1)
            boolean r0 = X.C51967G9n.A1R(r13)
            if (r0 == 0) goto L_0x005a
            r0 = -845154214(0xffffffffcd9ff85a, float:-3.35481664E8)
            X.0fL.A00(r0)
            goto L_0x005a
        L_0x0174:
            if (r4 == 0) goto L_0x0178
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
        L_0x0178:
            r0 = r29 & 8
            if (r0 == 0) goto L_0x0085
            X.Hya r2 = X.C56442Hya.A00
            r0 = 505527475(0x1e21bcb3, float:8.562291E-21)
            java.lang.Object r8 = X.C51967G9n.A0m(r13, r0)
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r8 != r0) goto L_0x0192
            r0 = 5
            X.InW r8 = new X.InW
            r8.<init>(r2, r0)
            r13.FLL(r8)
        L_0x0192:
            X.0Ya r8 = (X.C59520Ya) r8
            X.C51965G9l.A1X(r13, r12)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0085
        L_0x019b:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0036
            int r0 = X.G9t.A0Q(r13, r11)
            r1 = r1 | r0
            goto L_0x0036
        L_0x01a6:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x0030
            r0 = r21
            int r0 = X.G9t.A0F(r13, r0)
            r1 = r1 | r0
            goto L_0x0030
        L_0x01b3:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x01c1
            r0 = r22
            int r1 = X.C41848B3p.A01(r13, r0)
            r1 = r1 | r28
            goto L_0x002a
        L_0x01c1:
            r1 = r10
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXT.A00(X.5Wy, androidx.compose.ui.Modifier, X.0sL, X.0sL, X.0sJ, int, int):void");
    }
}
