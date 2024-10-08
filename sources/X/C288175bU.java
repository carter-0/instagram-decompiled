package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5bU  reason: invalid class name and case insensitive filesystem */
public abstract class C288175bU {
    public static final Modifier A00 = C287205Zk.A0C(Modifier.A00, 24.0f);

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        if (java.lang.Float.isInfinite(X.C288025bF.A00(r13)) != false) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r16, androidx.compose.ui.Modifier r17, X.AnonymousClass2DO r18, X.C288095bM r19, java.lang.String r20, int r21, int r22, long r23) {
        /*
            r6 = r19
            r10 = r17
            r7 = 0
            r15 = r18
            X.0qQ.A0B(r15, r7)
            r0 = 1641377165(0x61d56d8d, float:4.921313E20)
            r11 = r16
            r11.ExV(r0)
            r18 = r22
            r0 = r22 & 1
            r8 = r21
            if (r0 == 0) goto L_0x017a
            r2 = r21 | 6
        L_0x001c:
            r0 = r22 & 2
            r14 = 32
            r9 = r20
            if (r0 == 0) goto L_0x0169
            r2 = r2 | 48
        L_0x0026:
            r13 = r22 & 4
            if (r13 == 0) goto L_0x0158
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r3 = r22 & 8
            r5 = 2048(0x800, float:2.87E-42)
            r0 = r23
            if (r3 == 0) goto L_0x0147
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0036:
            r12 = r22 & 16
            if (r12 == 0) goto L_0x0136
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x003c:
            r4 = r2 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r3) goto L_0x0065
            boolean r3 = r11.Bwn()
            if (r3 == 0) goto L_0x0065
            r11.Evl()
        L_0x004b:
            X.5Xd r3 = r11.ASQ()
            if (r3 == 0) goto L_0x0064
            r19 = 1
            X.9Mz r2 = new X.9Mz
            r20 = r0
            r16 = r9
            r17 = r8
            r14 = r15
            r15 = r6
            r12 = r2
            r13 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r3.A06 = r2
        L_0x0064:
            return
        L_0x0065:
            if (r13 == 0) goto L_0x0069
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
        L_0x0069:
            if (r12 == 0) goto L_0x006d
            X.5bM r6 = X.C288075bK.A04
        L_0x006d:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x007b
            r4 = 1690405238(0x64c18976, float:2.8561014E22)
            java.lang.String r3 = "com.meta.compose.component.icon.BasicIcon (BasicIcon.kt:63)"
            X.0fL.A01(r4, r3)
        L_0x007b:
            r3 = 1521386925(0x5aae85ad, float:2.4561812E16)
            r11.ExS(r3)
            r4 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = 0
            if (r4 != r5) goto L_0x0087
            r3 = 1
        L_0x0087:
            java.lang.Object r5 = r11.ECw()
            r4 = 0
            if (r3 != 0) goto L_0x0092
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r5 != r3) goto L_0x00a2
        L_0x0092:
            long r12 = X.AnonymousClass5RW.A08
            int r3 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x009e
            r3 = 5
            X.5bV r4 = new X.5bV
            r4.<init>(r0, r3)
        L_0x009e:
            r5 = r4
            r11.FLL(r4)
        L_0x00a2:
            X.5bW r5 = (X.C288195bW) r5
            r13 = r11
            X.5Wx r13 = (X.C286565Wx) r13
            X.C286565Wx.A0L(r13, r7)
            r3 = 1521390467(0x5aae9383, float:2.45694184E16)
            r11.ExS(r3)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r12 = r3
            if (r20 == 0) goto L_0x00e0
            r4 = 1521392318(0x5aae9abe, float:2.45733934E16)
            r11.ExS(r4)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r16 = 0
            if (r2 != r14) goto L_0x00c3
            r16 = 1
        L_0x00c3:
            java.lang.Object r4 = r11.ECw()
            if (r16 != 0) goto L_0x00cd
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x00d7
        L_0x00cd:
            r2 = 8
            X.9Mk r4 = new X.9Mk
            r4.<init>(r9, r2)
            r11.FLL(r4)
        L_0x00d7:
            X.0sP r4 = (X.0sP) r4
            X.C286565Wx.A0L(r13, r7)
            androidx.compose.ui.Modifier r3 = X.AnonymousClass5R5.A00(r3, r4, r7)
        L_0x00e0:
            X.C286565Wx.A0L(r13, r7)
            X.0qQ.A0B(r10, r7)
            long r16 = r15.A03()
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x010b
            long r13 = r15.A03()
            float r2 = X.C288025bF.A02(r13)
            boolean r2 = java.lang.Float.isInfinite(r2)
            if (r2 == 0) goto L_0x010d
            float r2 = X.C288025bF.A00(r13)
            boolean r2 = java.lang.Float.isInfinite(r2)
            if (r2 == 0) goto L_0x010d
        L_0x010b:
            androidx.compose.ui.Modifier r12 = A00
        L_0x010d:
            androidx.compose.ui.Modifier r2 = r10.Ezh(r12)
            androidx.compose.ui.Alignment r13 = X.C287215Zl.A09
            r17 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.draw.PainterElement r12 = new androidx.compose.ui.draw.PainterElement
            r14 = r5
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            androidx.compose.ui.Modifier r2 = r2.Ezh(r12)
            androidx.compose.ui.Modifier r2 = r2.Ezh(r3)
            X.C287675aa.A02(r11, r2, r7)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x004b
            r2 = 1544885291(0x5c15142b, float:1.67847786E17)
            X.0fL.A00(r2)
            goto L_0x004b
        L_0x0136:
            r3 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x003c
            boolean r4 = r11.AGu(r6)
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0144
            r3 = 16384(0x4000, float:2.2959E-41)
        L_0x0144:
            r2 = r2 | r3
            goto L_0x003c
        L_0x0147:
            r3 = r8 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0036
            boolean r4 = r11.AGt(r0)
            r3 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0155
            r3 = 2048(0x800, float:2.87E-42)
        L_0x0155:
            r2 = r2 | r3
            goto L_0x0036
        L_0x0158:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002c
            boolean r1 = r11.AGu(r10)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0166
            r0 = 256(0x100, float:3.59E-43)
        L_0x0166:
            r2 = r2 | r0
            goto L_0x002c
        L_0x0169:
            r0 = r21 & 48
            if (r0 != 0) goto L_0x0026
            boolean r1 = r11.AGu(r9)
            r0 = 16
            if (r1 == 0) goto L_0x0177
            r0 = 32
        L_0x0177:
            r2 = r2 | r0
            goto L_0x0026
        L_0x017a:
            r0 = r21 & 6
            if (r0 != 0) goto L_0x018a
            boolean r0 = r11.AGw(r15)
            r2 = 2
            if (r0 == 0) goto L_0x0186
            r2 = 4
        L_0x0186:
            r2 = r2 | r21
            goto L_0x001c
        L_0x018a:
            r2 = r8
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C288175bU.A00(X.5Wy, androidx.compose.ui.Modifier, X.2DO, X.5bM, java.lang.String, int, int, long):void");
    }
}
