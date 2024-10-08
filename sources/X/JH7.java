package X;

public final class JH7 extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JH7(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(3);
        this.A00 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018f, code lost:
        r5.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            r20 = this;
            r0 = r20
            r5 = r22
            r1 = r21
            int r2 = r0.A00
            r3 = r23
            switch(r2) {
                case 0: goto L_0x006b;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0123;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.7en r1 = (X.C336547en) r1
            java.util.List r5 = (java.util.List) r5
            boolean r3 = X.AnonymousClass7TE.A1a(r3)
            X.AnonymousClass7TG.A1N(r1, r5)
            java.lang.Object r2 = r0.A05
            X.GtT r2 = (X.C53738GtT) r2
            com.meta.foa.session.FoaUserSession r10 = r2.A00
            java.lang.Object r2 = r0.A02
            com.meta.foa.accountswitcher.UserAccountInfo r2 = (com.meta.foa.accountswitcher.UserAccountInfo) r2
            java.lang.String r11 = r2.A08
            if (r3 == 0) goto L_0x0069
            int r17 = r5.size()
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            long r18 = X.C51970G9q.A0H()
            X.XRa r13 = X.C21255XRa.A0R
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            X.2Wd r14 = X.C51965G9l.A0e(r2)
            r2 = 1120403456(0x42c80000, float:100.0)
            java.lang.Float r15 = java.lang.Float.valueOf(r2)
            X.GuM r8 = new X.GuM
            r12 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0048:
            java.lang.Object r9 = r0.A03
            X.0sL r9 = (X.0sL) r9
            r6 = 0
            java.lang.Object r4 = r0.A04
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r2 = r0.A01
            X.HPu r2 = (X.C54715HPu) r2
            r12 = 1
            X.0qQ.A0B(r10, r12)
            r0 = 4
            X.C51973G9u.A0u(r0, r9, r4, r2)
            X.Iy1 r3 = new X.Iy1
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.I3H.A02(r1, r2, r3)
        L_0x0066:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0069:
            r8 = 0
            goto L_0x0048
        L_0x006b:
            X.5Wy r5 = (X.C286575Wy) r5
            boolean r13 = X.C51972G9s.A1b(r3, r1)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x007f
            r2 = 629674397(0x2588119d, float:2.3604174E-16)
            java.lang.String r1 = "com.instagram.creation.genai.magicmod.common.ui.MagicModPromptView.<anonymous>.<anonymous> (MagicModPromptView.kt:55)"
            X.0fL.A01(r2, r1)
        L_0x007f:
            java.lang.Object r7 = r0.A05
            X.JLs r7 = (X.C59494JLs) r7
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r1 = 1092616192(0x41200000, float:10.0)
            androidx.compose.ui.Modifier r6 = X.C51967G9n.A0C(r2, r1)
            r14 = 1
            java.lang.Object r8 = r0.A01
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r8 = (com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform) r8
            java.lang.Object r10 = r0.A04
            X.0sL r10 = (X.0sL) r10
            java.lang.Object r9 = r0.A03
            X.0sa r9 = (X.C62320sa) r9
            java.lang.Object r11 = r0.A02
            X.0sL r11 = (X.0sL) r11
            r12 = 4536(0x11b8, float:6.356E-42)
            X.C56575I2f.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0066
            r0 = 973931705(0x3a0d04b9, float:5.379427E-4)
            goto L_0x018a
        L_0x00ac:
            X.5Wy r5 = (X.C286575Wy) r5
            int r2 = X.C51968G9o.A0D(r3)
            r1 = 16
            if (r2 != r1) goto L_0x00bc
            boolean r1 = r5.Bwn()
            if (r1 != 0) goto L_0x018f
        L_0x00bc:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00ca
            r2 = -1343302936(0xffffffffafeed2e8, float:-4.3441806E-10)
            java.lang.String r1 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:129)"
            X.0fL.A01(r2, r1)
        L_0x00ca:
            java.lang.Object r3 = r0.A02
            X.JOY r3 = (X.JOY) r3
            r2 = r3
            X.GqT r2 = (X.C53557GqT) r2
            X.JwC r1 = r2.A02
            if (r1 == 0) goto L_0x011a
            X.MXZ r8 = r2.A03
        L_0x00d7:
            X.MSo r8 = (X.C66460MSo) r8
            java.lang.Object r6 = r0.A01
            X.JwC r6 = (X.C61074JwC) r6
            if (r6 == 0) goto L_0x0110
            java.lang.Object r7 = r0.A03
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r7 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r7
            java.lang.Object r2 = r0.A04
            java.lang.Object r1 = r0.A05
            r0 = 1814043777(0x6c201c81, float:7.7425095E26)
            boolean r0 = X.G9t.A1X(r5, r3, r2, r0)
            boolean r0 = X.C51966G9m.A1U(r5, r1, r0)
            java.lang.Object r9 = r5.ECw()
            if (r0 != 0) goto L_0x00fc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r9 != r0) goto L_0x0106
        L_0x00fc:
            r0 = 16
            X.Wxb r9 = new X.Wxb
            r9.<init>(r0, r1, r2, r3)
            r5.FLL(r9)
        L_0x0106:
            X.0sa r9 = (X.C62320sa) r9
            boolean r10 = X.C51968G9o.A1Y(r5)
            r11 = r10
            X.C55142Hcq.A00(r5, r6, r7, r8, r9, r10, r11)
        L_0x0110:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0066
            r0 = 47634359(0x2d6d7b7, float:3.1568288E-37)
            goto L_0x018a
        L_0x011a:
            java.lang.Object r1 = r0.A05
            X.JOY r1 = (X.JOY) r1
            X.GqW r1 = (X.C53560GqW) r1
            X.MXa r8 = r1.A05
            goto L_0x00d7
        L_0x0123:
            X.5Wy r5 = (X.C286575Wy) r5
            int r2 = X.AnonymousClass7TE.A0M(r3)
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r2 = r2 & 17
            r1 = 16
            if (r2 != r1) goto L_0x0139
            boolean r1 = r5.Bwn()
            if (r1 != 0) goto L_0x018f
        L_0x0139:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0147
            r2 = 1570209023(0x5d977cff, float:1.364485E18)
            java.lang.String r1 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:147)"
            X.0fL.A01(r2, r1)
        L_0x0147:
            java.lang.Object r2 = r0.A02
            X.JOY r2 = (X.JOY) r2
            X.GqT r2 = (X.C53557GqT) r2
            java.lang.Object r1 = r0.A01
            boolean r13 = X.DbW.A1a(r1)
            X.MXZ r10 = r2.A03
            boolean r12 = r2.A07
            boolean r14 = r2.A06
            java.util.List r11 = r2.A04
            X.JwC r9 = r2.A02
            X.JwL r7 = r2.A01
            X.JwL r8 = r2.A00
            X.AnonymousClass7TF.A1D(r10, r3, r11)
            r1 = 6
            X.0qQ.A0B(r7, r1)
            X.GqT r6 = new X.GqT
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r0.A05
            X.JOX r2 = (X.JOX) r2
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A04
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r0 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r0
            r4 = r5
            r5 = r2
            r7 = r0
            r8 = r1
            r9 = r3
            X.C52744Gbw.A04(r4, r5, r6, r7, r8, r9)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0066
            r0 = 1470760602(0x57aa069a, float:3.7389066E14)
        L_0x018a:
            X.0fL.A00(r0)
            goto L_0x0066
        L_0x018f:
            r5.Evl()
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JH7.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
