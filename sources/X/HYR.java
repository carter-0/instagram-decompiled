package X;

public abstract class HYR {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r2 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if ((r33 & 16) != 0) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r26, X.I12 r27, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r28, X.C362088hK r29, X.C52956Gg9 r30, X.C62320sa r31, int r32, int r33) {
        /*
            r11 = r30
            r9 = 0
            r0 = r29
            X.0qQ.A0B(r0, r9)
            r14 = 1
            r30 = r28
            r28 = r31
            r1 = r30
            r0 = r28
            X.AnonymousClass7TF.A1C(r1, r14, r0)
            r0 = -869360141(0xffffffffcc2e9df3, float:-4.5774796E7)
            r12 = r26
            r12.ExV(r0)
            r19 = r33
            r0 = r33 & 1
            r10 = r32
            if (r0 == 0) goto L_0x0218
            r1 = r32 | 6
        L_0x0026:
            r0 = r33 & 2
            if (r0 == 0) goto L_0x020b
            r1 = r1 | 48
        L_0x002c:
            r0 = r33 & 4
            r22 = r27
            if (r0 == 0) goto L_0x01fe
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r0 = r33 & 8
            if (r0 == 0) goto L_0x01f1
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004d
            r0 = r33 & 16
            if (r0 != 0) goto L_0x004a
            boolean r2 = r12.AGw(r11)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x004c
        L_0x004a:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004c:
            r1 = r1 | r0
        L_0x004d:
            r2 = r1 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r0) goto L_0x0078
            boolean r0 = r12.Bwn()
            if (r0 == 0) goto L_0x0078
            r12.Evl()
        L_0x005c:
            X.5Xd r1 = r12.ASQ()
            if (r1 == 0) goto L_0x0077
            r20 = 9
            X.J9z r0 = new X.J9z
            r14 = r29
            r15 = r22
            r16 = r28
            r17 = r30
            r18 = r10
            r12 = r0
            r13 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.A06 = r0
        L_0x0077:
            return
        L_0x0078:
            r12.Ewr()
            r0 = r32 & 1
            r7 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r12.Aw3()
            if (r0 != 0) goto L_0x01c3
            r12.Evl()
            r0 = r33 & 16
            if (r0 == 0) goto L_0x0090
        L_0x008f:
            r1 = r1 & r7
        L_0x0090:
            boolean r0 = X.C51967G9n.A1S(r12)
            if (r0 == 0) goto L_0x009e
            r2 = 711855022(0x2a6e0bae, float:2.1142699E-13)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.screen.ui.MagicModToolNuxScreen (MagicModToolNuxScreen.kt:39)"
            X.0fL.A01(r2, r0)
        L_0x009e:
            X.0Ud r0 = r11.A02
            r2 = 0
            X.4gU r18 = X.AnonymousClass6FW.A02(r12, r0, r9)
            X.5Qk r17 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Alignment r16 = X.C287215Zl.A0E
            r0 = r16
            X.5RD r13 = X.C287675aa.A00(r0, r9)
            int r3 = X.C287425a7.A00(r12)
            r8 = r12
            X.5Wx r8 = (X.C286565Wx) r8
            X.5RM r5 = X.C286565Wx.A04(r8)
            r0 = r17
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r12, r0)
            X.0sa r7 = X.C287485aD.A00
            X.C51973G9u.A0z(r12, r8, r7)
            X.0sL r6 = X.C287485aD.A03
            X.0sL r15 = X.C51969G9p.A0w(r12, r13, r5, r6)
            X.0sL r5 = X.C287485aD.A02
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x00d7
            boolean r0 = X.C51972G9s.A1Q(r12, r3)
            if (r0 != 0) goto L_0x00da
        L_0x00d7:
            X.C51971G9r.A13(r12, r5, r3)
        L_0x00da:
            X.0sL r4 = X.C51966G9m.A1K(r12, r4)
            androidx.compose.ui.Modifier r13 = X.C51966G9m.A0T(r17)
            r0 = -589410036(0xffffffffdcde510c, float:-5.00612454E17)
            boolean r0 = X.C51974G9v.A1a(r12, r0, r1)
            java.lang.Object r3 = r12.ECw()
            if (r0 != 0) goto L_0x00f3
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x00fb
        L_0x00f3:
            r3 = 43
            r0 = r28
            X.Ivn r3 = X.C58678Ivn.A00(r12, r0, r3)
        L_0x00fb:
            X.0sa r0 = X.C51965G9l.A0y(r8, r3, r9)
            androidx.compose.ui.Modifier r0 = X.C287635aW.A05(r13, r2, r2, r0, r14)
            X.5RD r14 = X.C51966G9m.A0Z(r9)
            int r13 = X.C287425a7.A00(r12)
            X.5RM r3 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r0 = X.C287435a8.A01(r12, r0)
            X.C51973G9u.A0z(r12, r8, r7)
            X.C287595aO.A00(r12, r14, r6)
            boolean r3 = X.C51965G9l.A1Y(r12, r8, r3, r15)
            if (r3 != 0) goto L_0x0125
            boolean r3 = X.C51972G9s.A1Q(r12, r13)
            if (r3 != 0) goto L_0x0128
        L_0x0125:
            X.C51971G9r.A13(r12, r5, r13)
        L_0x0128:
            X.C287595aO.A00(r12, r0, r4)
            r0 = r30
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r0 = r0.A02
            int r3 = r1 >> 6
            r26 = r3 & 14
            r27 = 28
            r20 = r12
            r21 = r2
            r23 = r0
            r24 = r2
            r25 = r2
            X.C56276Hvk.A01(r20, r21, r22, r23, r24, r25, r26, r27)
            r12.ASN()
            androidx.compose.ui.Modifier r13 = X.C51966G9m.A0U(r17)
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            long r2 = X.C289505di.A00(r12, r0)
            X.5ZQ r0 = X.HYI.A00(r12)
            androidx.compose.ui.Modifier r3 = X.C304766Fd.A01(r13, r0, r2)
            r0 = r16
            X.5RD r13 = X.C287675aa.A00(r0, r9)
            int r2 = X.C287425a7.A00(r12)
            X.5RM r0 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r12, r3)
            X.C51973G9u.A0z(r12, r8, r7)
            X.C287595aO.A00(r12, r13, r6)
            boolean r0 = X.C51965G9l.A1Y(r12, r8, r0, r15)
            if (r0 != 0) goto L_0x017c
            boolean r0 = X.C51972G9s.A1Q(r12, r2)
            if (r0 != 0) goto L_0x017f
        L_0x017c:
            X.C51971G9r.A13(r12, r5, r2)
        L_0x017f:
            X.C287595aO.A00(r12, r3, r4)
            r0 = 787250612(0x2eec7db4, float:1.0754367E-10)
            boolean r0 = X.C51967G9n.A1Z(r12, r11, r0)
            java.lang.Object r2 = r12.ECw()
            if (r0 != 0) goto L_0x0193
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0199
        L_0x0193:
            r0 = 44
            X.Ivn r2 = X.C58678Ivn.A00(r12, r11, r0)
        L_0x0199:
            X.0sa r2 = X.C51965G9l.A0y(r8, r2, r9)
            r1 = r1 & 14
            r0 = r29
            X.HYJ.A00(r12, r0, r2, r1)
            r12.ASN()
            r12.ASN()
            java.lang.Object r0 = r18.getValue()
            boolean r0 = r0 instanceof X.H99
            if (r0 == 0) goto L_0x01b5
            r28.invoke()
        L_0x01b5:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005c
            r0 = -639466410(0xffffffffd9e28456, float:-7.9698562E15)
            X.0fL.A00(r0)
            goto L_0x005c
        L_0x01c3:
            r0 = r33 & 16
            if (r0 == 0) goto L_0x0090
            android.content.Context r0 = X.C51975G9x.A0A(r12)
            android.app.Application r0 = (android.app.Application) r0
            X.H5Z r6 = new X.H5Z
            r6.<init>(r0)
            X.07g r5 = X.C51975G9x.A0P(r12)
            if (r5 == 0) goto L_0x0229
            r4 = 0
            X.2YQ r3 = X.C51975G9x.A0Q(r5)
            java.lang.Class<X.Gg9> r2 = X.C52956Gg9.class
            r0 = -1439476281(0xffffffffaa3355c7, float:-1.5928154E-13)
            r12.ExT(r0)
            X.2YL r0 = X.C54765HRx.A00(r6, r5, r3, r2, r4)
            X.2YL r11 = X.C51975G9x.A0O(r0, r12)
            X.Gg9 r11 = (X.C52956Gg9) r11
            goto L_0x008f
        L_0x01f1:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003a
            r0 = r28
            int r0 = X.G9t.A0H(r12, r0)
            r1 = r1 | r0
            goto L_0x003a
        L_0x01fe:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0034
            r0 = r22
            int r0 = X.G9t.A0G(r12, r0)
            r1 = r1 | r0
            goto L_0x0034
        L_0x020b:
            r0 = r32 & 48
            if (r0 != 0) goto L_0x002c
            r0 = r30
            int r0 = X.G9t.A0F(r12, r0)
            r1 = r1 | r0
            goto L_0x002c
        L_0x0218:
            r0 = r32 & 6
            if (r0 != 0) goto L_0x0226
            r0 = r29
            int r1 = X.G9t.A0O(r12, r0)
            r1 = r1 | r32
            goto L_0x0026
        L_0x0226:
            r1 = r10
            goto L_0x0026
        L_0x0229:
            java.lang.IllegalStateException r0 = X.G9w.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HYR.A00(X.5Wy, X.I12, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, X.8hK, X.Gg9, X.0sa, int, int):void");
    }
}
