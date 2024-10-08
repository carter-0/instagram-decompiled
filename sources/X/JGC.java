package X;

public final class JGC extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGC(Object obj, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public static int A00(JGC jgc) {
        return C301445zH.A00(jgc.A01 | 1);
    }

    public static void A01(C286625Xd r1, Object obj, int i, int i2) {
        r1.A06 = new JGC(obj, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0129, code lost:
        r6.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0027;
                case 2: goto L_0x0037;
                case 3: goto L_0x0080;
                case 4: goto L_0x0090;
                case 5: goto L_0x00d8;
                case 6: goto L_0x012e;
                case 7: goto L_0x013f;
                case 8: goto L_0x0150;
                case 9: goto L_0x0161;
                case 10: goto L_0x0172;
                case 11: goto L_0x0183;
                case 12: goto L_0x0194;
                case 13: goto L_0x01a5;
                case 14: goto L_0x01b6;
                case 15: goto L_0x01c7;
                case 16: goto L_0x01d8;
                case 17: goto L_0x01e9;
                case 18: goto L_0x01fa;
                case 19: goto L_0x020b;
                case 20: goto L_0x021c;
                case 21: goto L_0x022d;
                case 22: goto L_0x023e;
                case 23: goto L_0x024f;
                case 24: goto L_0x0260;
                case 25: goto L_0x0271;
                case 26: goto L_0x0282;
                case 27: goto L_0x0293;
                case 28: goto L_0x02a4;
                case 29: goto L_0x02b5;
                case 30: goto L_0x02c6;
                case 31: goto L_0x02d7;
                case 32: goto L_0x02e8;
                case 33: goto L_0x02f9;
                case 34: goto L_0x030a;
                case 35: goto L_0x031b;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x032c;
                case 39: goto L_0x033d;
                case 40: goto L_0x034e;
                case 41: goto L_0x035f;
                case 42: goto L_0x0370;
                case 43: goto L_0x0381;
                case 44: goto L_0x0392;
                case 45: goto L_0x03a3;
                case 46: goto L_0x03b4;
                case 47: goto L_0x03c5;
                case 48: goto L_0x03d6;
                case 49: goto L_0x03e7;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = A00(r5)
            X.C56264HvY.A01(r2, r1, r0)
        L_0x0014:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0017:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.GRI r1 = (X.GRI) r1
            int r0 = A00(r5)
            r1.A00(r2, r0)
            goto L_0x0014
        L_0x0027:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.C287675aa.A02(r2, r1, r0)
            goto L_0x0014
        L_0x0037:
            X.5Wy r6 = (X.C286575Wy) r6
            int r1 = X.C51968G9o.A0B(r7)
            r0 = 2
            if (r1 != r0) goto L_0x0046
            boolean r0 = r6.Bwn()
            if (r0 != 0) goto L_0x0129
        L_0x0046:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0054
            r1 = -101476772(0xfffffffff9f3965c, float:-1.5809722E35)
            java.lang.String r0 = "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)"
            X.0fL.A01(r1, r0)
        L_0x0054:
            java.lang.Object r0 = r5.A02
            X.IF5 r0 = (X.IF5) r0
            X.GeT r0 = r0.A00
            int r4 = r5.A01
            X.6Ir r0 = r0.A02
            X.6It r1 = r0.AX1(r4)
            int r0 = r1.A01
            int r4 = r4 - r0
            java.lang.Object r0 = r1.A02
            X.IFE r0 = (X.IFE) r0
            X.0sJ r3 = r0.A01
            X.IF6 r2 = X.IF6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 6
            X.C51967G9n.A1L(r2, r1, r6, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0014
            r0 = 796922447(0x2f80124f, float:2.3296073E-10)
            goto L_0x0124
        L_0x0080:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sK r1 = (X.0sK) r1
            int r0 = A00(r5)
            X.C305416Hx.A00(r2, r1, r0)
            goto L_0x0014
        L_0x0090:
            X.5Wy r6 = (X.C286575Wy) r6
            int r1 = X.C51968G9o.A0B(r7)
            r0 = 2
            if (r1 != r0) goto L_0x009f
            boolean r0 = r6.Bwn()
            if (r0 != 0) goto L_0x0129
        L_0x009f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ad
            r1 = -1501358099(0xffffffffa68317ed, float:-9.096436E-16)
            java.lang.String r0 = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:78)"
            X.0fL.A01(r1, r0)
        L_0x00ad:
            java.lang.Object r0 = r5.A02
            X.IFP r0 = (X.IFP) r0
            X.GeU r0 = r0.A01
            int r4 = r5.A01
            X.6Ir r0 = r0.A00
            X.6It r1 = r0.AX1(r4)
            int r0 = r1.A01
            int r4 = r4 - r0
            java.lang.Object r0 = r1.A02
            X.IFF r0 = (X.IFF) r0
            X.0sJ r3 = r0.A01
            X.Hxd r2 = X.C56384Hxd.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 6
            X.C51967G9n.A1L(r2, r1, r6, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0014
            r0 = 1460730072(0x5710f8d8, float:1.5939845E14)
            goto L_0x0124
        L_0x00d8:
            X.5Wy r6 = (X.C286575Wy) r6
            int r1 = X.C51968G9o.A0B(r7)
            r0 = 2
            if (r1 != r0) goto L_0x00e7
            boolean r0 = r6.Bwn()
            if (r0 != 0) goto L_0x0129
        L_0x00e7:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f5
            r1 = -1757381788(0xffffffff97407b64, float:-6.2194287E-25)
            java.lang.String r0 = "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)"
            X.0fL.A01(r1, r0)
        L_0x00f5:
            java.lang.Object r2 = r5.A02
            X.GZg r2 = (X.C52607GZg) r2
            X.69H r0 = r2.A00
            int r4 = r5.A01
            X.6Is r0 = r0.A00()
            X.6It r1 = r0.AX1(r4)
            int r0 = r1.A01
            int r4 = r4 - r0
            java.lang.Object r0 = r1.A02
            X.GaD r0 = (X.C52639GaD) r0
            X.0sJ r3 = r0.A00
            X.GaG r2 = r2.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = X.C51967G9n.A0k()
            r3.invoke(r2, r1, r6, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0014
            r0 = -1813875092(0xffffffff93e2766c, float:-5.7167194E-27)
        L_0x0124:
            X.0fL.A00(r0)
            goto L_0x0014
        L_0x0129:
            r6.Evl()
            goto L_0x0014
        L_0x012e:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.Gb5 r1 = (X.C52693Gb5) r1
            int r0 = A00(r5)
            X.C52694Gb6.A03(r1, r2, r0)
            goto L_0x0014
        L_0x013f:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.I0h r1 = (X.I0h) r1
            int r0 = A00(r5)
            r1.A01(r2, r0)
            goto L_0x0014
        L_0x0150:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.54O r1 = (X.AnonymousClass54O) r1
            int r0 = A00(r5)
            r1.A06(r2, r0)
            goto L_0x0014
        L_0x0161:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.GWO r1 = (X.GWO) r1
            int r0 = A00(r5)
            r1.A06(r2, r0)
            goto L_0x0014
        L_0x0172:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            int r0 = A00(r5)
            X.C56195HuO.A01(r2, r1, r0)
            goto L_0x0014
        L_0x0183:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.JwB r1 = (X.C61073JwB) r1
            int r0 = A00(r5)
            X.C56201HuU.A01(r2, r1, r0)
            goto L_0x0014
        L_0x0194:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            android.app.Activity r1 = (android.app.Activity) r1
            int r0 = A00(r5)
            X.C54785HSs.A00(r1, r2, r0)
            goto L_0x0014
        L_0x01a5:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C54788HSv.A00(r1, r2, r0)
            goto L_0x0014
        L_0x01b6:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.HT2.A00(r1, r2, r0)
            goto L_0x0014
        L_0x01c7:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56648I6d.A06(r1, r2, r0)
            goto L_0x0014
        L_0x01d8:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = A00(r5)
            X.I2H.A02(r2, r1, r0)
            goto L_0x0014
        L_0x01e9:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.I6K.A00(r2, r1, r0)
            goto L_0x0014
        L_0x01fa:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.HUK.A00(r2, r1, r0)
            goto L_0x0014
        L_0x020b:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sL r1 = (X.0sL) r1
            int r0 = A00(r5)
            X.GZW.A00(r2, r1, r0)
            goto L_0x0014
        L_0x021c:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.AnonymousClass6CY.A06(r1, r2, r0)
            goto L_0x0014
        L_0x022d:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.AnonymousClass6CY.A07(r1, r2, r0)
            goto L_0x0014
        L_0x023e:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = A00(r5)
            X.HVK.A00(r2, r1, r0)
            goto L_0x0014
        L_0x024f:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.C56236Hv3.A00(r2, r1, r0)
            goto L_0x0014
        L_0x0260:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.Hqp r1 = (X.C55984Hqp) r1
            int r0 = A00(r5)
            X.C56257HvR.A01(r2, r1, r0)
            goto L_0x0014
        L_0x0271:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.7ev r1 = (X.C336627ev) r1
            int r0 = A00(r5)
            X.C54884HWr.A00(r2, r1, r0)
            goto L_0x0014
        L_0x0282:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            int r0 = A00(r5)
            X.C54889HWw.A00(r2, r1, r0)
            goto L_0x0014
        L_0x0293:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56615I4q.A03(r1, r2, r0)
            goto L_0x0014
        L_0x02a4:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = A00(r5)
            X.HXB.A00(r2, r1, r0)
            goto L_0x0014
        L_0x02b5:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.GnY r1 = (X.C53401GnY) r1
            int r0 = A00(r5)
            r1.A01(r2, r0)
            goto L_0x0014
        L_0x02c6:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.Jw8 r1 = (X.C61070Jw8) r1
            int r0 = A00(r5)
            X.HXH.A00(r2, r1, r0)
            goto L_0x0014
        L_0x02d7:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.JNx r1 = (X.C59551JNx) r1
            int r0 = A00(r5)
            X.C52739Gbr.A05(r2, r1, r0)
            goto L_0x0014
        L_0x02e8:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            int r0 = A00(r5)
            X.GS8.A0B(r2, r1, r0)
            goto L_0x0014
        L_0x02f9:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.JLm r1 = (X.C59488JLm) r1
            int r0 = A00(r5)
            X.C52747Gbz.A03(r2, r1, r0)
            goto L_0x0014
        L_0x030a:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sL r1 = (X.0sL) r1
            int r0 = A00(r5)
            X.C287015Yr.A00(r2, r1, r0)
            goto L_0x0014
        L_0x031b:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.GSL.A00(r2, r1, r0)
            goto L_0x0014
        L_0x032c:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C54915HXx.A00(r1, r2, r0)
            goto L_0x0014
        L_0x033d:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.I7I.A08(r1, r2, r0)
            goto L_0x0014
        L_0x034e:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            int r0 = A00(r5)
            X.I7I.A06(r2, r1, r0)
            goto L_0x0014
        L_0x035f:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r0 = A00(r5)
            X.I7I.A00(r1, r2, r0)
            goto L_0x0014
        L_0x0370:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.I7I.A09(r1, r2, r0)
            goto L_0x0014
        L_0x0381:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.I7I.A0A(r1, r2, r0)
            goto L_0x0014
        L_0x0392:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.HYB.A00(r1, r2, r0)
            goto L_0x0014
        L_0x03a3:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56619I4u.A03(r1, r2, r0)
            goto L_0x0014
        L_0x03b4:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.HYH.A00(r1, r2, r0)
            goto L_0x0014
        L_0x03c5:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.0sa r1 = (X.C62320sa) r1
            int r0 = A00(r5)
            X.C56575I2f.A02(r1, r2, r0)
            goto L_0x0014
        L_0x03d6:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            int r0 = A00(r5)
            X.C56277Hvl.A00(r2, r1, r0)
            goto L_0x0014
        L_0x03e7:
            X.5Wy r2 = X.C51966G9m.A0R(r6, r7)
            java.lang.Object r1 = r5.A02
            X.Gq1 r1 = (X.C53531Gq1) r1
            int r0 = A00(r5)
            X.C56492HzO.A00(r2, r1, r0)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGC.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
