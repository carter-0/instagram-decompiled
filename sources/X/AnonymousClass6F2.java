package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6F2  reason: invalid class name */
public abstract class AnonymousClass6F2 {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r4 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r16, androidx.compose.ui.Modifier r17, int r18, int r19, int r20, int r21, long r22, long r24) {
        /*
            r0 = r24
            r14 = r22
            r9 = r17
            r2 = 1440415574(0x55daff56, float:3.00987743E13)
            r10 = r16
            r10.ExV(r2)
            r17 = r21
            r2 = r21 & 1
            r8 = r18
            r6 = r20
            if (r2 == 0) goto L_0x020c
            r2 = r20 | 6
        L_0x001a:
            r3 = r21 & 2
            r7 = r19
            if (r3 == 0) goto L_0x01fb
            r2 = r2 | 48
        L_0x0022:
            r5 = r21 & 4
            if (r5 == 0) goto L_0x01ea
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r3 = r6 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x003b
            r3 = r21 & 8
            if (r3 != 0) goto L_0x0038
            boolean r4 = r10.AGt(r14)
            r3 = 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x003a
        L_0x0038:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x003a:
            r2 = r2 | r3
        L_0x003b:
            r3 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x004e
            r3 = r21 & 16
            if (r3 != 0) goto L_0x004b
            boolean r4 = r10.AGt(r0)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x004d
        L_0x004b:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x004d:
            r2 = r2 | r3
        L_0x004e:
            r3 = r2 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r2) goto L_0x0074
            boolean r2 = r10.Bwn()
            if (r2 == 0) goto L_0x0074
            r10.Evl()
        L_0x005d:
            X.5Xd r2 = r10.ASQ()
            if (r2 == 0) goto L_0x0073
            X.J8x r12 = new X.J8x
            r20 = r0
            r18 = r14
            r16 = r6
            r15 = r7
            r14 = r8
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)
        L_0x0071:
            r2.A06 = r12
        L_0x0073:
            return
        L_0x0074:
            r10.Ewr()
            r2 = r20 & 1
            if (r2 == 0) goto L_0x00b8
            boolean r2 = r10.Aw3()
            if (r2 != 0) goto L_0x00b8
            r10.Evl()
        L_0x0084:
            r10.ASM()
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0095
            r3 = -1092426901(0xffffffffbee2e36b, float:-0.4431413)
            java.lang.String r2 = "com.instagram.feed.tifu.ui.pagerindicator.PagerIndicator (PagerIndicator.kt:27)"
            X.0fL.A01(r3, r2)
        L_0x0095:
            if (r8 > r7) goto L_0x00d1
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00a3
            r2 = -641765042(0xffffffffd9bf714e, float:-6.7357875E15)
            X.0fL.A00(r2)
        L_0x00a3:
            X.5Xd r2 = r10.ASQ()
            if (r2 == 0) goto L_0x0073
            X.J8w r12 = new X.J8w
            r20 = r0
            r18 = r14
            r16 = r6
            r15 = r7
            r14 = r8
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)
            goto L_0x0071
        L_0x00b8:
            if (r5 == 0) goto L_0x00bc
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
        L_0x00bc:
            r2 = r21 & 8
            if (r2 == 0) goto L_0x00c6
            X.6CB r2 = X.AnonymousClass6CA.A01(r10)
            long r14 = r2.A00
        L_0x00c6:
            r2 = r21 & 16
            if (r2 == 0) goto L_0x0084
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r10)
            long r0 = r0.A0w
            goto L_0x0084
        L_0x00d1:
            r5 = 0
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r10)
            long r2 = r2.A0k
            X.5S2 r4 = X.AnonymousClass5S0.A00
            androidx.compose.ui.Modifier r2 = X.C304766Fd.A01(r9, r4, r2)
            r4 = 1082130432(0x40800000, float:4.0)
            X.5Zr r3 = X.C287215Zl.A00
            X.6Fc r11 = X.C287275Zs.A02(r3, r4)
            X.5Zp r4 = X.C287215Zl.A04
            r3 = 54
            X.5RD r13 = X.C287395a4.A02(r11, r10, r4, r3)
            int r16 = X.C287425a7.A00(r10)
            r12 = r10
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r11 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r10, r2)
            X.0sa r3 = X.C287485aD.A00
            r10.ExX()
            boolean r2 = r12.A0K
            if (r2 == 0) goto L_0x017e
            r10.AMT(r3)
        L_0x0109:
            X.0sL r2 = X.C287485aD.A03
            X.C287595aO.A00(r10, r13, r2)
            X.0sL r2 = X.C287485aD.A05
            X.C287595aO.A00(r10, r11, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r12.A0K
            if (r2 != 0) goto L_0x0127
            java.lang.Object r11 = r10.ECw()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            boolean r2 = X.0qQ.A0K(r11, r2)
            if (r2 != 0) goto L_0x0131
        L_0x0127:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r10.FLL(r2)
            r10.ABr(r2, r3)
        L_0x0131:
            X.0sL r2 = X.C287485aD.A04
            X.C287595aO.A00(r10, r4, r2)
            r3 = r8
            r2 = 5
            if (r8 <= r2) goto L_0x013b
            r3 = 5
        L_0x013b:
            if (r7 >= r3) goto L_0x0182
            r2 = -509848367(0xffffffffe19c54d1, float:-3.6047547E20)
            r10.ExS(r2)
            r4 = 0
        L_0x0144:
            if (r4 >= r8) goto L_0x01d5
            if (r4 >= r3) goto L_0x0163
            r2 = -1540463376(0xffffffffa42e64f0, float:-3.7815733E-17)
            r10.ExS(r2)
            r23 = 0
            if (r4 != r7) goto L_0x0154
            r23 = 1
        L_0x0154:
            r19 = r14
            r21 = r0
            r18 = r10
            A01(r18, r19, r21, r23)
        L_0x015d:
            X.C286565Wx.A0L(r12, r5)
            int r4 = r4 + 1
            goto L_0x0144
        L_0x0163:
            if (r4 != r3) goto L_0x0171
            r2 = -1540457667(0xffffffffa42e7b3d, float:-3.7834622E-17)
            r10.ExS(r2)
            r2 = 1082130432(0x40800000, float:4.0)
        L_0x016d:
            A00(r10, r2, r0)
            goto L_0x015d
        L_0x0171:
            int r2 = r3 + 1
            if (r4 != r2) goto L_0x01cc
            r2 = -1540455395(0xffffffffa42e841d, float:-3.784214E-17)
            r10.ExS(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x016d
        L_0x017e:
            r10.FMk()
            goto L_0x0109
        L_0x0182:
            r2 = -509371742(0xffffffffe1a39aa2, float:-3.7724522E20)
            r10.ExS(r2)
            r4 = 0
        L_0x0189:
            if (r4 >= r8) goto L_0x01d5
            int r2 = r3 + -2
            if (r4 != r2) goto L_0x01a0
            r2 = -1540448387(0xffffffffa42e9f7d, float:-3.7865327E-17)
            r10.ExS(r2)
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0197:
            A00(r10, r2, r0)
        L_0x019a:
            X.C286565Wx.A0I(r12)
            int r4 = r4 + 1
            goto L_0x0189
        L_0x01a0:
            int r2 = r3 + -1
            if (r4 != r2) goto L_0x01ad
            r2 = -1540446051(0xffffffffa42ea89d, float:-3.7873057E-17)
            r10.ExS(r2)
            r2 = 1082130432(0x40800000, float:4.0)
            goto L_0x0197
        L_0x01ad:
            if (r4 < r3) goto L_0x01c5
            r2 = -1540443344(0xffffffffa42eb330, float:-3.7882013E-17)
            r10.ExS(r2)
            r23 = 0
            if (r4 != r7) goto L_0x01bb
            r23 = 1
        L_0x01bb:
            r19 = r14
            r21 = r0
            r18 = r10
            A01(r18, r19, r21, r23)
            goto L_0x019a
        L_0x01c5:
            r2 = -508945492(0xffffffffe1aa1bac, float:-3.9224256E20)
            r10.ExS(r2)
            goto L_0x019a
        L_0x01cc:
            r2 = -509420505(0xffffffffe1a2dc27, float:-3.7552952E20)
            r10.ExS(r2)
            X.C286565Wx.A0L(r12, r5)
        L_0x01d5:
            X.C286565Wx.A0L(r12, r5)
            r2 = 1
            X.C286565Wx.A0L(r12, r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x005d
            r2 = -1126396244(0xffffffffbcdc8eac, float:-0.0269235)
            X.0fL.A00(r2)
            goto L_0x005d
        L_0x01ea:
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0028
            boolean r4 = r10.AGu(r9)
            r3 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x01f8
            r3 = 256(0x100, float:3.59E-43)
        L_0x01f8:
            r2 = r2 | r3
            goto L_0x0028
        L_0x01fb:
            r3 = r20 & 48
            if (r3 != 0) goto L_0x0022
            boolean r4 = r10.AGs(r7)
            r3 = 16
            if (r4 == 0) goto L_0x0209
            r3 = 32
        L_0x0209:
            r2 = r2 | r3
            goto L_0x0022
        L_0x020c:
            r2 = r20 & 6
            if (r2 != 0) goto L_0x021c
            boolean r3 = r10.AGs(r8)
            r2 = 2
            if (r3 == 0) goto L_0x0218
            r2 = 4
        L_0x0218:
            r2 = r2 | r20
            goto L_0x001a
        L_0x021c:
            r2 = r6
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6F2.A02(X.5Wy, androidx.compose.ui.Modifier, int, int, int, int, long, long):void");
    }

    public static final void A00(C286575Wy r2, float f, long j) {
        r2.ExS(-351735687);
        if (0fL.A02()) {
            0fL.A01(-824770179, "com.instagram.feed.tifu.ui.pagerindicator.Dot (PagerIndicator.kt:89)");
        }
        C289585dr.A00(r2, C304766Fd.A01(C287205Zk.A0C(Modifier.A00, f), AnonymousClass5ZN.A00, j));
        if (0fL.A02()) {
            0fL.A00(1598235276);
        }
        C286565Wx.A0L((C286565Wx) r2, false);
    }

    public static final void A01(C286575Wy r2, long j, long j2, boolean z) {
        r2.ExS(-114404205);
        if (0fL.A02()) {
            0fL.A01(-62330633, "com.instagram.feed.tifu.ui.pagerindicator.LargeDot (PagerIndicator.kt:75)");
        }
        if (!z) {
            j = j2;
        }
        A00(r2, 6.0f, j);
        if (0fL.A02()) {
            0fL.A00(899536545);
        }
        C286565Wx.A0L((C286565Wx) r2, false);
    }
}
