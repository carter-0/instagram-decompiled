package X;

/* renamed from: X.Hdm  reason: case insensitive filesystem */
public abstract class C55196Hdm {
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b0, code lost:
        if (r13 == X.AnonymousClass5XT.A00) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r23, com.instagram.common.typedurl.ImageUrl r24, X.HMM r25, X.C54623HLg r26, java.lang.String r27, java.lang.String r28, X.0sP r29, X.0sK r30, int r31, int r32, boolean r33) {
        /*
            r17 = r30
            r8 = r29
            r4 = r33
            r19 = r25
            r5 = 0
            r18 = 1
            r0 = 1084051746(0x409d5122, float:4.916154)
            r9 = r23
            r9.ExV(r0)
            r6 = r32
            r0 = r32 & 1
            r30 = r27
            r7 = r31
            if (r0 == 0) goto L_0x0334
            r1 = r31 | 6
        L_0x001f:
            r0 = r32 & 2
            r29 = r28
            if (r0 == 0) goto L_0x0327
            r1 = r1 | 48
        L_0x0027:
            r0 = r32 & 4
            r32 = r24
            if (r0 == 0) goto L_0x031a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r0 = r6 & 8
            r31 = r26
            if (r0 == 0) goto L_0x030d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r12 = r6 & 16
            if (r12 == 0) goto L_0x0300
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r2 = r6 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r2 != 0) goto L_0x004a
            r0 = r0 & r7
            if (r0 != 0) goto L_0x004b
            int r0 = X.G9t.A0d(r9, r4)
        L_0x004a:
            r1 = r1 | r0
        L_0x004b:
            r11 = r6 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r11 != 0) goto L_0x0058
            r0 = r0 & r7
            if (r0 != 0) goto L_0x0059
            int r0 = X.G9t.A0K(r9, r8)
        L_0x0058:
            r1 = r1 | r0
        L_0x0059:
            r10 = r6 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x0068
            r0 = r0 & r7
            if (r0 != 0) goto L_0x0069
            r0 = r17
            int r0 = X.G9t.A0L(r9, r0)
        L_0x0068:
            r1 = r1 | r0
        L_0x0069:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r3 = r1 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r0) goto L_0x009c
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x009c
            r9.Evl()
        L_0x007c:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x009b
            X.JB9 r0 = new X.JB9
            r9 = r31
            r10 = r30
            r11 = r29
            r12 = r8
            r13 = r17
            r14 = r7
            r15 = r6
            r16 = r4
            r7 = r32
            r8 = r19
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.A06 = r0
        L_0x009b:
            return
        L_0x009c:
            if (r12 == 0) goto L_0x00a0
            X.HMM r19 = X.HMM.IDLE
        L_0x00a0:
            boolean r4 = X.C51966G9m.A1Q(r2, r4)
            if (r11 == 0) goto L_0x00a7
            r8 = 0
        L_0x00a7:
            if (r10 == 0) goto L_0x00ab
            X.0sK r17 = X.C45191Crt.A00
        L_0x00ab:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b9
            r2 = 45018048(0x2aeebc0, float:2.5702316E-37)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.WallPostProfileHeader (WallPostProfileHeader.kt:46)"
            X.0fL.A01(r2, r0)
        L_0x00b9:
            r0 = -2143746343(0xffffffff803906d9, float:-5.23708E-39)
            X.5Qk r3 = X.C51965G9l.A0K(r9, r0)
            r12 = r3
            if (r4 == 0) goto L_0x00c7
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A06(r3)
        L_0x00c7:
            if (r8 == 0) goto L_0x00f8
            r0 = 650965057(0x26ccf041, float:1.4220465E-15)
            boolean r2 = X.C51967G9n.A1Y(r9, r8, r0)
            boolean r0 = X.C51973G9u.A1G(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r9.ECw()
            if (r0 != 0) goto L_0x00df
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x00eb
        L_0x00df:
            r10 = 25
            X.Iw3 r2 = new X.Iw3
            r0 = r30
            r2.<init>(r0, r8, r10)
            r9.FLL(r2)
        L_0x00eb:
            X.0sa r2 = (X.C62320sa) r2
            X.C51965G9l.A1X(r9, r5)
            androidx.compose.ui.Modifier r0 = X.C287635aW.A06(r12, r2)
            androidx.compose.ui.Modifier r3 = r3.Ezh(r0)
        L_0x00f8:
            X.5Wx r10 = X.C51965G9l.A0H(r9, r5)
            X.5RD r2 = X.C51968G9o.A0W(r9)
            int r11 = X.C287425a7.A00(r9)
            X.5RM r0 = X.C286565Wx.A04(r10)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r9, r3)
            X.C51973G9u.A0y(r9, r10)
            X.C51971G9r.A12(r9, r2, r0)
            X.0sL r2 = X.C287485aD.A02
            boolean r0 = r10.A0K
            if (r0 != 0) goto L_0x011e
            boolean r0 = X.C51972G9s.A1Q(r9, r11)
            if (r0 != 0) goto L_0x0121
        L_0x011e:
            X.C51971G9r.A13(r9, r2, r11)
        L_0x0121:
            X.C51965G9l.A18(r9, r3)
            X.6FX r16 = X.AnonymousClass6FX.A00
            r0 = 1787497836(0x6a8b0d6c, float:8.405204E25)
            boolean r0 = X.C51967G9n.A1U(r9, r0)
            if (r0 == 0) goto L_0x0137
            r2 = 1802448842(0x6b6f2fca, float:2.8915895E26)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.profileHeaderStyle (WallPostProfileHeader.kt:124)"
            X.0fL.A01(r2, r0)
        L_0x0137:
            int r2 = r31.ordinal()
            if (r2 == r5) goto L_0x015b
            r0 = r18
            if (r2 == r0) goto L_0x014c
            r0 = 2
            if (r2 == r0) goto L_0x014c
            r0 = -1102671991(0xffffffffbe468f89, float:-0.19390692)
            X.Wub r0 = X.C51972G9s.A0v(r9, r10, r0)
            throw r0
        L_0x014c:
            r0 = -1102663565(0xffffffffbe46b073, float:-0.19403248)
            r9.ExS(r0)
            r3 = 1107296256(0x42000000, float:32.0)
            r2 = 1090519040(0x41000000, float:8.0)
            X.5Z4 r0 = X.C51966G9m.A0g(r9)
            goto L_0x0169
        L_0x015b:
            r0 = -1102670157(0xffffffffbe4696b3, float:-0.19393425)
            r9.ExS(r0)
            r3 = 1101004800(0x41a00000, float:20.0)
            r2 = 1082130432(0x40800000, float:4.0)
            X.5Z4 r0 = X.C51966G9m.A0b(r9)
        L_0x0169:
            X.Hmh r11 = new X.Hmh
            r11.<init>(r0, r3, r2)
            boolean r0 = X.C51967G9n.A1b(r10, r5)
            if (r0 == 0) goto L_0x017a
            r0 = -402606148(0xffffffffe800b7bc, float:-2.4314088E24)
            X.0fL.A00(r0)
        L_0x017a:
            X.C286565Wx.A0L(r10, r5)
            r0 = 650970407(0x26cd0527, float:1.4226129E-15)
            r9.ExS(r0)
            if (r4 == 0) goto L_0x020e
            X.4bM r3 = X.AnonymousClass5YA.A01
            X.4cd r2 = X.C51966G9m.A0j(r9, r3)
            float r0 = r11.A00
            r21 = r0
            float r2 = r2.F06(r0)
            X.4cd r3 = X.C51966G9m.A0j(r9, r3)
            float r0 = r11.A01
            r20 = r0
            float r0 = r3.F06(r0)
            int r0 = (int) r0
            r15 = r0
            r0 = 650981177(0x26cd2f39, float:1.4237532E-15)
            boolean r0 = X.C51967G9n.A1Y(r9, r11, r0)
            java.lang.Object r13 = r9.ECw()
            if (r0 != 0) goto L_0x01b2
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x01d0
        L_0x01b2:
            X.60e r13 = X.C3026864w.A00()
            r0 = 1073741824(0x40000000, float:2.0)
            float r14 = r2 / r0
            r0 = 0
            android.graphics.Path r3 = r13.A03
            r3.moveTo(r14, r0)
            float r15 = (float) r15
            float r0 = r14 - r15
            r3.lineTo(r14, r0)
            float r15 = r15 + r14
            r3.quadTo(r14, r14, r15, r14)
            r3.lineTo(r2, r14)
            r9.FLL(r13)
        L_0x01d0:
            X.C286565Wx.A0L(r10, r5)
            long r2 = X.C51966G9m.A0M(r9)
            r0 = r21
            androidx.compose.ui.Modifier r14 = X.C287205Zk.A0C(r12, r0)
            r0 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r14 = X.G9w.A0I(r14, r0)
            r0 = 650988694(0x26cd4c96, float:1.4245491E-15)
            boolean r0 = X.C51967G9n.A1Z(r9, r13, r0)
            boolean r15 = X.C51966G9m.A1T(r9, r2, r0)
            java.lang.Object r0 = r9.ECw()
            if (r15 != 0) goto L_0x01f8
            java.lang.Object r15 = X.AnonymousClass5XT.A00
            if (r0 != r15) goto L_0x0202
        L_0x01f8:
            r15 = 9
            X.Iwh r0 = new X.Iwh
            r0.<init>(r2, r13, r15)
            r9.FLL(r0)
        L_0x0202:
            X.0sP r0 = X.C51965G9l.A0z(r10, r0)
            X.C289565do.A00(r9, r14, r0, r5)
            r0 = r20
            X.C51967G9n.A13(r9, r12, r0)
        L_0x020e:
            X.C286565Wx.A0L(r10, r5)
            float r13 = r11.A00
            int r0 = r1 >> 3
            int r3 = X.C51965G9l.A02(r0)
            r2 = r29
            r0 = r32
            X.C55200Hdq.A00(r9, r0, r2, r13, r3)
            float r0 = r11.A01
            X.C51967G9n.A13(r9, r12, r0)
            r23 = r2
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0235
            r2 = -163098939(0xfffffffff6474ec5, float:-1.0106101E33)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.textForState (WallPostProfileHeader.kt:86)"
            X.0fL.A01(r2, r0)
        L_0x0235:
            int r2 = r19.ordinal()
            switch(r2) {
                case 0: goto L_0x02f1;
                case 1: goto L_0x02e7;
                case 2: goto L_0x02dd;
                case 3: goto L_0x023c;
                case 4: goto L_0x02dd;
                case 5: goto L_0x02d3;
                case 6: goto L_0x02c9;
                default: goto L_0x023c;
            }
        L_0x023c:
            r0 = -413973665(0xffffffffe753435f, float:-9.976621E23)
            r9.ExS(r0)
        L_0x0242:
            boolean r0 = X.C51967G9n.A1b(r10, r5)
            if (r0 == 0) goto L_0x024e
            r0 = 1619682222(0x608a63ae, float:7.977604E19)
            X.0fL.A00(r0)
        L_0x024e:
            X.5Z4 r11 = r11.A02
            r0 = r16
            androidx.compose.ui.Modifier r21 = r0.A00(r12)
            r0 = 2
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0265
            r12 = 1429306056(0x55317ac8, float:1.21963062E13)
            java.lang.String r3 = "com.instagram.wonderwall.ui.compose.components.textColorForState (WallPostProfileHeader.kt:100)"
            X.0fL.A01(r12, r3)
        L_0x0265:
            if (r2 == r0) goto L_0x02bf
            r3 = 4
            if (r2 == r3) goto L_0x02bf
            r3 = 5
            if (r2 == r3) goto L_0x02b5
            r3 = 6
            if (r2 == r3) goto L_0x02bf
            r2 = 851846023(0x32c62387, float:2.306639E-8)
            long r2 = X.C51970G9q.A0L(r9, r2)
        L_0x0277:
            boolean r12 = X.C51967G9n.A1b(r10, r5)
            if (r12 == 0) goto L_0x0283
            r12 = -1172277155(0xffffffffba20785d, float:-6.121451E-4)
            X.0fL.A00(r12)
        L_0x0283:
            r26 = 11256(0x2bf8, float:1.5773E-41)
            r20 = r9
            r22 = r11
            r24 = r18
            r25 = r0
            r27 = r2
            X.AnonymousClass5ZZ.A0F(r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 651008067(0x26cd9843, float:1.4266003E-15)
            r9.ExS(r0)
            if (r4 != 0) goto L_0x02a7
            int r0 = r1 >> 18
            r0 = r0 & 112(0x70, float:1.57E-43)
            r2 = r0 | 6
            r1 = r16
            r0 = r17
            X.C51967G9n.A1M(r1, r9, r0, r2)
        L_0x02a7:
            boolean r0 = X.C51971G9r.A1S(r9, r10, r5)
            if (r0 == 0) goto L_0x007c
            r0 = -932089630(0xffffffffc87170e2, float:-247235.53)
            X.0fL.A00(r0)
            goto L_0x007c
        L_0x02b5:
            r2 = 851844899(0x32c61f23, float:2.3064393E-8)
            X.5Yw r2 = X.C51967G9n.A0a(r9, r2)
            long r2 = r2.A10
            goto L_0x0277
        L_0x02bf:
            r2 = 851842830(0x32c6170e, float:2.3060718E-8)
            X.5Yw r2 = X.C51967G9n.A0a(r9, r2)
            long r2 = r2.A0E
            goto L_0x0277
        L_0x02c9:
            r0 = -413975608(0xffffffffe7533bc8, float:-9.975221E23)
            r9.ExS(r0)
            r0 = 2131976781(0x7f13624d, float:1.9590692E38)
            goto L_0x02fa
        L_0x02d3:
            r0 = -413978075(0xffffffffe7533225, float:-9.973443E23)
            r9.ExS(r0)
            r0 = 2131976779(0x7f13624b, float:1.9590688E38)
            goto L_0x02fa
        L_0x02dd:
            r0 = -413980602(0xffffffffe7532846, float:-9.9716224E23)
            r9.ExS(r0)
            r0 = 2131976782(0x7f13624e, float:1.9590694E38)
            goto L_0x02fa
        L_0x02e7:
            r0 = -413984346(0xffffffffe75319a6, float:-9.9689246E23)
            r9.ExS(r0)
            r0 = 2131976780(0x7f13624c, float:1.959069E38)
            goto L_0x02fa
        L_0x02f1:
            r0 = -413986999(0xffffffffe7530f49, float:-9.967013E23)
            r9.ExS(r0)
            r0 = 2131976783(0x7f13624f, float:1.9590696E38)
        L_0x02fa:
            java.lang.String r23 = X.C304346Dc.A00(r9, r0)
            goto L_0x0242
        L_0x0300:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003d
            r0 = r19
            int r0 = X.G9t.A0S(r9, r0)
            r1 = r1 | r0
            goto L_0x003d
        L_0x030d:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0037
            r0 = r31
            int r0 = X.G9t.A0R(r9, r0)
            r1 = r1 | r0
            goto L_0x0037
        L_0x031a:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002f
            r0 = r32
            int r0 = X.G9t.A0Q(r9, r0)
            r1 = r1 | r0
            goto L_0x002f
        L_0x0327:
            r0 = r31 & 48
            if (r0 != 0) goto L_0x0027
            r0 = r29
            int r0 = X.G9t.A0P(r9, r0)
            r1 = r1 | r0
            goto L_0x0027
        L_0x0334:
            r0 = r31 & 6
            if (r0 != 0) goto L_0x0342
            r0 = r30
            int r1 = X.G9t.A0O(r9, r0)
            r1 = r1 | r31
            goto L_0x001f
        L_0x0342:
            r1 = r7
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55196Hdm.A00(X.5Wy, com.instagram.common.typedurl.ImageUrl, X.HMM, X.HLg, java.lang.String, java.lang.String, X.0sP, X.0sK, int, int, boolean):void");
    }
}
