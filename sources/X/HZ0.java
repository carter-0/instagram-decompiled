package X;

public abstract class HZ0 {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r12.AGt(r2) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r5 == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r12, androidx.compose.ui.Modifier r13, float r14, int r15, int r16, long r17, long r19) {
        /*
            r0 = r19
            r2 = r17
            r4 = 1370897795(0x51b63d83, float:9.7839505E10)
            r11 = r12
            r12.ExV(r4)
            r7 = r16 & 1
            if (r7 == 0) goto L_0x010a
            r6 = r15 | 6
        L_0x0011:
            r4 = r16 & 2
            if (r4 == 0) goto L_0x00ff
            r6 = r6 | 48
        L_0x0017:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x002a
            r4 = r16 & 4
            if (r4 != 0) goto L_0x0027
            boolean r5 = r12.AGt(r2)
            r4 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x0029
        L_0x0027:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0029:
            r6 = r6 | r4
        L_0x002a:
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x003d
            r4 = r16 & 8
            if (r4 != 0) goto L_0x003a
            boolean r5 = r12.AGt(r0)
            r4 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x003c
        L_0x003a:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x003c:
            r6 = r6 | r4
        L_0x003d:
            r5 = r6 & 5851(0x16db, float:8.199E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r5 != r4) goto L_0x005e
            boolean r4 = r12.Bwn()
            if (r4 == 0) goto L_0x005e
            r12.Evl()
        L_0x004c:
            X.5Xd r4 = r11.ASQ()
            if (r4 == 0) goto L_0x005d
            X.J8D r12 = new X.J8D
            r19 = r0
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r19)
            r4.A06 = r12
        L_0x005d:
            return
        L_0x005e:
            r12.Ewr()
            r4 = r15 & 1
            if (r4 == 0) goto L_0x00e9
            boolean r4 = r12.Aw3()
            if (r4 != 0) goto L_0x00e9
            r12.Evl()
        L_0x006e:
            boolean r4 = X.C51967G9n.A1S(r12)
            if (r4 == 0) goto L_0x007c
            r5 = -1979156703(0xffffffff8a087721, float:-6.5705675E-33)
            java.lang.String r4 = "com.instagram.creator.achievements.modules.views.ProgressBar (ProgressBar.kt:30)"
            X.0fL.A01(r5, r4)
        L_0x007c:
            r4 = 1082130432(0x40800000, float:4.0)
            X.5ZQ r10 = X.AnonymousClass5ZN.A01(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A08(r13, r4)
            androidx.compose.ui.Modifier r4 = X.AnonymousClass6FZ.A01(r4, r10)
            X.5S2 r9 = X.AnonymousClass5S0.A00
            androidx.compose.ui.Modifier r4 = X.C304766Fd.A01(r4, r9, r0)
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0V(r4)
            androidx.compose.ui.Alignment r5 = X.C287215Zl.A0E
            r8 = 0
            X.5RD r12 = X.C287675aa.A00(r5, r8)
            int r7 = X.C287425a7.A00(r11)
            r6 = r11
            X.5Wx r6 = (X.C286565Wx) r6
            X.5RM r5 = X.C286565Wx.A04(r6)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r11, r4)
            X.C51973G9u.A0y(r11, r6)
            X.C51971G9r.A12(r11, r12, r5)
            X.0sL r5 = X.C287485aD.A02
            boolean r6 = r6.A0K
            if (r6 != 0) goto L_0x00be
            boolean r6 = X.C51972G9s.A1Q(r11, r7)
            if (r6 != 0) goto L_0x00c1
        L_0x00be:
            X.C51971G9r.A13(r11, r5, r7)
        L_0x00c1:
            X.C51965G9l.A18(r11, r4)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r4 = X.AnonymousClass6FZ.A01(r4, r10)
            androidx.compose.ui.Modifier r5 = X.C304766Fd.A01(r4, r9, r2)
            androidx.compose.foundation.layout.FillElement r4 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r4 = r5.Ezh(r4)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A07(r4, r14)
            X.C287675aa.A02(r11, r4, r8)
            boolean r4 = X.C51967G9n.A1R(r11)
            if (r4 == 0) goto L_0x004c
            r4 = -1226281556(0xffffffffb6e86dac, float:-6.9269063E-6)
            X.0fL.A00(r4)
            goto L_0x004c
        L_0x00e9:
            if (r7 == 0) goto L_0x00ed
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
        L_0x00ed:
            r4 = r16 & 4
            if (r4 == 0) goto L_0x00f5
            long r2 = X.C51966G9m.A0N(r12)
        L_0x00f5:
            r4 = r16 & 8
            if (r4 == 0) goto L_0x006e
            long r0 = X.C51966G9m.A0C(r12)
            goto L_0x006e
        L_0x00ff:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0017
            int r4 = X.G9t.A00(r12, r14)
            r6 = r6 | r4
            goto L_0x0017
        L_0x010a:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x0115
            int r6 = X.G9t.A0O(r12, r13)
            r6 = r6 | r15
            goto L_0x0011
        L_0x0115:
            r6 = r15
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HZ0.A00(X.5Wy, androidx.compose.ui.Modifier, float, int, int, long, long):void");
    }
}
