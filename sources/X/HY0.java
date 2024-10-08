package X;

public abstract class HY0 {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r5 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if ((r31 & 8) != 0) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r27, X.C62320sa r28, X.0sP r29, int r30, int r31, long r32, boolean r34) {
        /*
            r0 = r32
            r14 = 1
            r8 = r28
            r7 = r29
            int r3 = X.DbW.A02(r14, r8, r7)
            r2 = 1413905171(0x54467b13, float:3.40987347E12)
            r9 = r27
            r9.ExV(r2)
            r29 = r31
            r2 = r31 & 1
            r6 = r30
            r15 = r34
            if (r2 == 0) goto L_0x012e
            r10 = r30 | 6
        L_0x001f:
            r2 = r31 & 2
            r12 = 32
            if (r2 == 0) goto L_0x0123
            r10 = r10 | 48
        L_0x0027:
            r2 = r31 & 4
            r4 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0118
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r2 = r6 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0042
            r2 = r31 & 8
            if (r2 != 0) goto L_0x003f
            boolean r5 = r9.AGt(r0)
            r2 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x0041
        L_0x003f:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0041:
            r10 = r10 | r2
        L_0x0042:
            r5 = r10 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r5 != r2) goto L_0x006d
            boolean r2 = r9.Bwn()
            if (r2 == 0) goto L_0x006d
            r9.Evl()
        L_0x0051:
            X.5Xd r3 = r9.ASQ()
            if (r3 == 0) goto L_0x006c
            X.J99 r2 = new X.J99
            r26 = r8
            r27 = r7
            r28 = r6
            r30 = r14
            r31 = r0
            r33 = r15
            r25 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r33)
            r3.A06 = r2
        L_0x006c:
            return
        L_0x006d:
            r9.Ewr()
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0110
            boolean r2 = r9.Aw3()
            if (r2 != 0) goto L_0x0110
            r9.Evl()
            r2 = r31 & 8
            if (r2 == 0) goto L_0x0083
        L_0x0081:
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0083:
            boolean r2 = X.C51967G9n.A1S(r9)
            if (r2 == 0) goto L_0x0091
            r5 = -550674140(0xffffffffdf2d6124, float:-1.2493306E19)
            java.lang.String r2 = "com.instagram.creation.genai.common.ui.CreationGenAIContextMenu (CreationGenAIContextMenu.kt:21)"
            X.0fL.A01(r5, r2)
        L_0x0091:
            X.HL4 r19 = X.HL4.A02
            r16 = 0
            r2 = -144602805(0xfffffffff761894b, float:-4.5744196E33)
            r9.ExS(r2)
            r2 = r10 & 896(0x380, float:1.256E-42)
            r11 = 0
            boolean r13 = X.AnonymousClass7TF.A1S(r2, r4)
            r5 = r10 & 112(0x70, float:1.57E-43)
            boolean r2 = X.AnonymousClass7TF.A1S(r5, r12)
            r13 = r13 | r2
            java.lang.Object r4 = r9.ECw()
            if (r13 != 0) goto L_0x00b3
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r4 != r2) goto L_0x00b7
        L_0x00b3:
            X.J6k r4 = X.C59102J6k.A00(r9, r7, r8, r3)
        L_0x00b7:
            X.0sP r4 = (X.0sP) r4
            r3 = r9
            X.5Wx r3 = (X.C286565Wx) r3
            r13 = 0
            X.C286565Wx.A0L(r3, r11)
            r2 = -144596878(0xfffffffff761a072, float:-4.576254E33)
            r9.ExS(r2)
            if (r5 != r12) goto L_0x00c9
            r11 = 1
        L_0x00c9:
            java.lang.Object r2 = r9.ECw()
            if (r11 != 0) goto L_0x00d3
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r2 != r5) goto L_0x00dd
        L_0x00d3:
            r5 = 35
            X.MIz r2 = new X.MIz
            r2.<init>(r8, r5)
            r9.FLL(r2)
        L_0x00dd:
            X.0sa r20 = X.C51965G9l.A0y(r3, r2, r13)
            X.JF9 r22 = X.JF9.A00
            int r2 = r10 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r5 = 458752(0x70000, float:6.42848E-40)
            int r3 = r10 << 6
            r3 = r3 & r5
            r2 = r2 | r3
            r24 = 193(0xc1, float:2.7E-43)
            r18 = r16
            r25 = r0
            r27 = r15
            r28 = r13
            r21 = r4
            r23 = r2
            r17 = r9
            X.C56261HvV.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0051
            r2 = 1599044141(0x5f4f7a2d, float:1.4950311E19)
            X.0fL.A00(r2)
            goto L_0x0051
        L_0x0110:
            r2 = r31 & 8
            if (r2 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0081
        L_0x0118:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x002f
            int r2 = X.G9t.A0G(r9, r7)
            r10 = r10 | r2
            goto L_0x002f
        L_0x0123:
            r2 = r30 & 48
            if (r2 != 0) goto L_0x0027
            int r2 = X.G9t.A0F(r9, r8)
            r10 = r10 | r2
            goto L_0x0027
        L_0x012e:
            r2 = r30 & 6
            if (r2 != 0) goto L_0x013a
            int r10 = X.G9t.A0Y(r9, r15)
            r10 = r10 | r30
            goto L_0x001f
        L_0x013a:
            r10 = r6
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HY0.A00(X.5Wy, X.0sa, X.0sP, int, int, long, boolean):void");
    }
}
