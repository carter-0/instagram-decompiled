package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5bT  reason: invalid class name and case insensitive filesystem */
public abstract class C288165bT {
    public static final void A00(C286575Wy r4, Modifier modifier, AnonymousClass2DO r6, int i, int i2, long j) {
        A06(r4, modifier, r6, (C288095bM) null, (String) null, i, i2, j);
    }

    public static final void A01(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, int i, long j) {
        A06(r7, modifier, r9, (C288095bM) null, (String) null, i, 16, j);
    }

    public static final void A02(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, long j) {
        A06(r7, modifier, r9, (C288095bM) null, (String) null, 384, 18, j);
    }

    public static final void A03(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, long j) {
        A06(r7, modifier, r9, (C288095bM) null, (String) null, 432, 16, j);
    }

    public static final void A04(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, long j) {
        A06(r7, modifier, r9, (C288095bM) null, (String) null, 440, 16, j);
    }

    public static final void A05(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, long j) {
        A06(r7, modifier, r9, (C288095bM) null, (String) null, 48, 16, j);
    }

    public static final void A07(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, String str, int i, long j) {
        A06(r7, modifier, r9, (C288095bM) null, str, i, 16, j);
    }

    public static final void A08(C286575Wy r7, Modifier modifier, AnonymousClass2DO r9, String str, long j) {
        A06(r7, modifier, r9, (C288095bM) null, str, 0, 16, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C286575Wy r15, androidx.compose.ui.Modifier r16, X.AnonymousClass2DO r17, X.C288095bM r18, java.lang.String r19, int r20, int r21, long r22) {
        /*
            r8 = r18
            r13 = r22
            r6 = r16
            r9 = r19
            r12 = 0
            r7 = r17
            X.0qQ.A0B(r7, r12)
            r0 = 1272923515(0x4bdf457b, float:2.926463E7)
            r15.ExV(r0)
            r11 = r21
            r0 = r21 & 1
            r10 = r20
            if (r0 == 0) goto L_0x0117
            r2 = r20 | 6
        L_0x001e:
            r4 = r21 & 2
            if (r4 == 0) goto L_0x0106
            r2 = r2 | 48
        L_0x0024:
            r3 = r21 & 4
            if (r3 == 0) goto L_0x00f5
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003d
            r0 = r21 & 8
            if (r0 != 0) goto L_0x003a
            boolean r1 = r15.AGt(r13)
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x003c
        L_0x003a:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x003c:
            r2 = r2 | r0
        L_0x003d:
            r5 = r21 & 16
            if (r5 == 0) goto L_0x00e4
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0043:
            r1 = r2 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0060
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x0060
            r15.Evl()
        L_0x0052:
            X.5Xd r0 = r15.ASQ()
            if (r0 == 0) goto L_0x005f
            X.9Mz r5 = new X.9Mz
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A06 = r5
        L_0x005f:
            return
        L_0x0060:
            r15.Ewr()
            r0 = r20 & 1
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r15.Aw3()
            if (r0 != 0) goto L_0x00b5
            r15.Evl()
            r0 = r21 & 8
            if (r0 == 0) goto L_0x0076
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0076:
            r15.ASM()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0087
            r1 = 755674971(0x2d0aaf5b, float:7.8833285E-12)
            java.lang.String r0 = "com.instagram.compose.core.ui.IgIcon (IgIcon.kt:37)"
            X.0fL.A01(r1, r0)
        L_0x0087:
            r20 = r2 & 14
            r0 = r2 & 112(0x70, float:1.57E-43)
            r20 = r20 | r0
            r0 = r2 & 896(0x380, float:1.256E-42)
            r20 = r20 | r0
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            r20 = r20 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r20 = r20 | r2
            r16 = r6
            r18 = r8
            r19 = r9
            r21 = r12
            r22 = r13
            X.C288175bU.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0052
            r0 = -852530405(0xffffffffcd2f6b1b, float:-1.83939504E8)
            X.0fL.A00(r0)
            goto L_0x0052
        L_0x00b5:
            if (r4 == 0) goto L_0x00b8
            r9 = 0
        L_0x00b8:
            if (r3 == 0) goto L_0x00bc
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
        L_0x00bc:
            r0 = r21 & 8
            if (r0 == 0) goto L_0x00df
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r15)
            long r0 = r0.A0n
            X.4bM r4 = X.AnonymousClass6CK.A00
            r3 = r15
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r3 = X.C286565Wx.A04(r3)
            java.lang.Object r3 = X.C286615Xc.A01(r4, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            long r13 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r3)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00df:
            if (r5 == 0) goto L_0x0076
            X.5bM r8 = X.C288075bK.A04
            goto L_0x0076
        L_0x00e4:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0043
            boolean r1 = r15.AGu(r8)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x00f2
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x00f2:
            r2 = r2 | r0
            goto L_0x0043
        L_0x00f5:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002a
            boolean r1 = r15.AGu(r6)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0103
            r0 = 256(0x100, float:3.59E-43)
        L_0x0103:
            r2 = r2 | r0
            goto L_0x002a
        L_0x0106:
            r0 = r20 & 48
            if (r0 != 0) goto L_0x0024
            boolean r1 = r15.AGu(r9)
            r0 = 16
            if (r1 == 0) goto L_0x0114
            r0 = 32
        L_0x0114:
            r2 = r2 | r0
            goto L_0x0024
        L_0x0117:
            r0 = r20 & 6
            if (r0 != 0) goto L_0x0127
            boolean r0 = r15.AGw(r7)
            r2 = 2
            if (r0 == 0) goto L_0x0123
            r2 = 4
        L_0x0123:
            r2 = r2 | r20
            goto L_0x001e
        L_0x0127:
            r2 = r10
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C288165bT.A06(X.5Wy, androidx.compose.ui.Modifier, X.2DO, X.5bM, java.lang.String, int, int, long):void");
    }
}
