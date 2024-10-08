package X;

/* renamed from: X.6DA  reason: invalid class name */
public abstract class AnonymousClass6DA {
    public static final C287965b7 A00 = new C287965b7((Object) null, 1.0f, 1500.0f);
    public static final C287965b7 A01 = new C287965b7((Object) null, 1.0f, 300.0f);
    public static final C287965b7 A02 = new C287965b7((Object) null, 1.0f, 500.0f);
    public static final C287965b7 A03 = new C287965b7((Object) null, 0.75f, 700.0f);

    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5b8 r18, X.AnonymousClass5b8 r19, X.C286575Wy r20, androidx.compose.ui.Modifier r21, java.lang.String r22, java.lang.String r23, X.C62320sa r24, X.C62320sa r25, X.0sK r26, float r27, int r28, int r29) {
        /*
            r2 = r19
            r9 = r18
            r19 = r24
            r18 = r25
            r7 = r27
            r8 = r21
            r4 = 0
            r0 = r22
            X.0qQ.A0B(r0, r4)
            r3 = 1
            r21 = r23
            r0 = r21
            X.0qQ.A0B(r0, r3)
            r0 = 8
            r10 = r26
            X.0qQ.A0B(r10, r0)
            r0 = 288216113(0x112dd431, float:1.371268E-28)
            r11 = r20
            r11.ExV(r0)
            r5 = r29
            r0 = r29 & 1
            r6 = r28
            if (r0 == 0) goto L_0x01e9
            r1 = r28 | 6
        L_0x0033:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x01d6
            r1 = r1 | 48
        L_0x0039:
            r20 = r29 & 4
            if (r20 == 0) goto L_0x01c5
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x003f:
            r17 = r29 & 8
            if (r17 == 0) goto L_0x01b4
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0045:
            r16 = r29 & 16
            if (r16 == 0) goto L_0x01a1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x004b:
            r14 = r29 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x005f
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0060
            boolean r12 = r11.AGw(r9)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r12 == 0) goto L_0x005f
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x005f:
            r1 = r1 | r0
        L_0x0060:
            r15 = r29 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r15 != 0) goto L_0x0074
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0075
            boolean r12 = r11.AGw(r2)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r12 == 0) goto L_0x0074
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0074:
            r1 = r1 | r0
        L_0x0075:
            r12 = r5 & 128(0x80, float:1.794E-43)
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 != 0) goto L_0x008b
            r0 = r28 & r13
            if (r0 != 0) goto L_0x008c
            r0 = r18
            boolean r0 = r11.AGw(r0)
            r13 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x008b
            r13 = 8388608(0x800000, float:1.17549435E-38)
        L_0x008b:
            r1 = r1 | r13
        L_0x008c:
            r0 = r5 & 256(0x100, float:3.59E-43)
            r13 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 != 0) goto L_0x00a0
            r13 = r13 & r28
            if (r13 != 0) goto L_0x00a1
            boolean r0 = r11.AGw(r10)
            r13 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00a0
            r13 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00a0:
            r1 = r1 | r13
        L_0x00a1:
            r13 = 38347923(0x2492493, float:1.4777644E-37)
            r13 = r13 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r13 != r0) goto L_0x00d1
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x00d1
            r11.Evl()
        L_0x00b3:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x00d0
            X.JBs r0 = new X.JBs
            r11 = r19
            r12 = r18
            r13 = r10
            r14 = r7
            r15 = r6
            r16 = r5
            r5 = r0
            r6 = r9
            r7 = r2
            r9 = r22
            r10 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.A06 = r0
        L_0x00d0:
            return
        L_0x00d1:
            if (r20 == 0) goto L_0x00d5
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
        L_0x00d5:
            if (r17 == 0) goto L_0x00d8
            r7 = 0
        L_0x00d8:
            if (r16 == 0) goto L_0x00dc
            X.6DC r19 = X.AnonymousClass6DC.A00
        L_0x00dc:
            if (r14 == 0) goto L_0x00e9
            r14 = 1065353216(0x3f800000, float:1.0)
            r13 = 1153138688(0x44bb8000, float:1500.0)
            r0 = 0
            X.5b7 r9 = new X.5b7
            r9.<init>(r0, r14, r13)
        L_0x00e9:
            if (r15 == 0) goto L_0x00f6
            r14 = 1065353216(0x3f800000, float:1.0)
            r13 = 1153138688(0x44bb8000, float:1500.0)
            r0 = 0
            X.5b7 r2 = new X.5b7
            r2.<init>(r0, r14, r13)
        L_0x00f6:
            if (r12 == 0) goto L_0x00fa
            X.6DD r18 = X.AnonymousClass6DD.A00
        L_0x00fa:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0108
            r12 = -527287866(0xffffffffe09239c6, float:-8.429336E19)
            java.lang.String r0 = "com.instagram.barcelona.common.ui.sharedelement.SharedElement (SharedElement.kt:47)"
            X.0fL.A01(r12, r0)
        L_0x0108:
            r0 = 0
            boolean r0 = X.C289095d0.A01(r7, r0)
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
            if (r0 != 0) goto L_0x0119
            X.5ZQ r0 = X.AnonymousClass5ZN.A01(r7)
            androidx.compose.ui.Modifier r12 = X.AnonymousClass6FZ.A01(r12, r0)
        L_0x0119:
            androidx.compose.ui.Modifier r0 = r8.Ezh(r12)
            X.4bM r12 = X.AnonymousClass6DE.A00
            r11.AJO(r12)
            r12 = 868570627(0x33c55603, float:9.189173E-8)
            r11.ExS(r12)
            androidx.compose.ui.Alignment r12 = X.C287215Zl.A0E
            X.5RD r17 = X.C287675aa.A00(r12, r3)
            int r16 = X.C287425a7.A00(r11)
            r12 = r11
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r14 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r11, r0)
            X.0sa r15 = X.C287485aD.A00
            r11.ExX()
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x019d
            r11.AMT(r15)
        L_0x0149:
            X.0sL r15 = X.C287485aD.A03
            r0 = r17
            X.C287595aO.A00(r11, r0, r15)
            X.0sL r0 = X.C287485aD.A05
            X.C287595aO.A00(r11, r14, r0)
            X.0sL r14 = X.C287485aD.A02
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x0169
            java.lang.Object r15 = r11.ECw()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            boolean r0 = X.0qQ.A0K(r15, r0)
            if (r0 != 0) goto L_0x0173
        L_0x0169:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r11.FLL(r0)
            r11.ABr(r0, r14)
        L_0x0173:
            X.0sL r0 = X.C287485aD.A04
            X.C287595aO.A00(r11, r13, r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            int r0 = r1 >> 21
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.invoke(r13, r11, r0)
            X.C286565Wx.A0L(r12, r3)
            X.C286565Wx.A0L(r12, r4)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b3
            r0 = -988473085(0xffffffffc5151903, float:-2385.5632)
            X.0fL.A00(r0)
            goto L_0x00b3
        L_0x019d:
            r11.FMk()
            goto L_0x0149
        L_0x01a1:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004b
            r0 = r19
            boolean r12 = r11.AGw(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x01b1
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x01b1:
            r1 = r1 | r0
            goto L_0x004b
        L_0x01b4:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0045
            boolean r12 = r11.AGr(r7)
            r0 = 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x01c2
            r0 = 2048(0x800, float:2.87E-42)
        L_0x01c2:
            r1 = r1 | r0
            goto L_0x0045
        L_0x01c5:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003f
            boolean r12 = r11.AGu(r8)
            r0 = 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x01d3
            r0 = 256(0x100, float:3.59E-43)
        L_0x01d3:
            r1 = r1 | r0
            goto L_0x003f
        L_0x01d6:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x0039
            r0 = r21
            boolean r12 = r11.AGu(r0)
            r0 = 16
            if (r12 == 0) goto L_0x01e6
            r0 = 32
        L_0x01e6:
            r1 = r1 | r0
            goto L_0x0039
        L_0x01e9:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x01fb
            r0 = r22
            boolean r0 = r11.AGu(r0)
            r1 = 2
            if (r0 == 0) goto L_0x01f7
            r1 = 4
        L_0x01f7:
            r1 = r1 | r28
            goto L_0x0033
        L_0x01fb:
            r1 = r6
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6DA.A00(X.5b8, X.5b8, X.5Wy, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, X.0sa, X.0sa, X.0sK, float, int, int):void");
    }
}
