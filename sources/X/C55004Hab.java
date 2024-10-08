package X;

/* renamed from: X.Hab  reason: case insensitive filesystem */
public abstract class C55004Hab {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r29, X.C299665vd r30, X.C299635va r31, X.AnonymousClass5vX r32, X.C62320sa r33, X.C62320sa r34, X.C62320sa r35, X.C62320sa r36, X.0sP r37, X.0sP r38, X.0sP r39, X.0sP r40, X.0sL r41, int r42, int r43, int r44, boolean r45, boolean r46) {
        /*
            r2 = r45
            r1 = r46
            r0 = 2139586104(0x7f877e38, float:NaN)
            r5 = r29
            r5.ExV(r0)
            r3 = r44
            r0 = r44 & 1
            r28 = r32
            r4 = r42
            if (r0 == 0) goto L_0x0178
            r6 = r42 | 6
        L_0x0018:
            r0 = r44 & 2
            r15 = 32
            r29 = r31
            if (r0 == 0) goto L_0x016b
            r6 = r6 | 48
        L_0x0022:
            r0 = r44 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x015e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r0 = r44 & 16
            r21 = r34
            if (r0 == 0) goto L_0x0151
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0032:
            r8 = r44 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r7 = r37
            if (r8 != 0) goto L_0x0042
            r0 = r42 & r0
            if (r0 != 0) goto L_0x0043
            int r0 = X.G9t.A0J(r5, r7)
        L_0x0042:
            r6 = r6 | r0
        L_0x0043:
            r9 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r38
            if (r9 != 0) goto L_0x0053
            r0 = r42 & r0
            if (r0 != 0) goto L_0x0054
            int r0 = X.G9t.A0L(r5, r8)
        L_0x0053:
            r6 = r6 | r0
        L_0x0054:
            r10 = r3 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r39
            if (r10 != 0) goto L_0x0064
            r0 = r42 & r0
            if (r0 != 0) goto L_0x0065
            int r0 = X.G9t.A0M(r5, r9)
        L_0x0064:
            r6 = r6 | r0
        L_0x0065:
            r11 = r3 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r10 = r41
            if (r11 != 0) goto L_0x0075
            r0 = r42 & r0
            if (r0 != 0) goto L_0x0076
            int r0 = X.G9t.A0N(r5, r10)
        L_0x0075:
            r6 = r6 | r0
        L_0x0076:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            r12 = r36
            r11 = r43
            if (r0 == 0) goto L_0x0142
            r14 = r43 | 6
        L_0x0080:
            r0 = r3 & 2048(0x800, float:2.87E-42)
            r13 = r40
            if (r0 == 0) goto L_0x0133
            r14 = r14 | 48
        L_0x0088:
            r15 = r3 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0123
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x008e:
            r0 = 306258067(0x12412093, float:6.0940213E-28)
            r6 = r6 & r0
            r0 = 306258066(0x12412092, float:6.094021E-28)
            if (r6 != r0) goto L_0x00d7
            r6 = r14 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r6 != r0) goto L_0x00d7
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x00d7
            r5.Evl()
        L_0x00a6:
            X.5Xd r5 = r5.ASQ()
            if (r5 == 0) goto L_0x00d6
            X.JD8 r0 = new X.JD8
            r14 = r33
            r16 = r35
            r22 = r10
            r23 = r4
            r24 = r11
            r25 = r3
            r26 = r2
            r27 = r1
            r15 = r21
            r17 = r12
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r13
            r10 = r0
            r11 = r30
            r12 = r29
            r13 = r28
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.A06 = r0
        L_0x00d6:
            return
        L_0x00d7:
            boolean r2 = X.C51966G9m.A1R(r15, r2)
            r0 = r3 & 8192(0x2000, float:1.14794E-41)
            boolean r1 = X.C51966G9m.A1R(r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ef
            r6 = -1713012590(0xffffffff99e58092, float:-2.3729974E-23)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.TifuHScrollPagerUnit (TifuHScrollPagerUnit.kt:83)"
            X.0fL.A01(r6, r0)
        L_0x00ef:
            com.instagram.common.session.UserSession r18 = X.C51970G9q.A0f(r5)
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r14 = X.G9t.A0p(r5, r0)
            r6 = 458761590(0x1b582576, float:1.7879206E-22)
            X.JC6 r0 = new X.JC6
            r15 = r0
            r16 = r30
            r17 = r29
            r19 = r28
            r20 = r12
            r22 = r13
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = X.C51972G9s.A1T(r5, r14, r0, r6)
            if (r0 == 0) goto L_0x00a6
            r0 = 1313784388(0x4e4ec244, float:8.6720947E8)
            X.0fL.A00(r0)
            goto L_0x00a6
        L_0x0123:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r5.AGv(r2)
            if (r0 != 0) goto L_0x012f
            r16 = 128(0x80, float:1.794E-43)
        L_0x012f:
            r14 = r14 | r16
            goto L_0x008e
        L_0x0133:
            r0 = r43 & 48
            if (r0 != 0) goto L_0x0088
            boolean r0 = r5.AGw(r13)
            if (r0 != 0) goto L_0x013f
            r15 = 16
        L_0x013f:
            r14 = r14 | r15
            goto L_0x0088
        L_0x0142:
            r0 = r43 & 6
            if (r0 != 0) goto L_0x014e
            int r0 = X.C51971G9r.A08(r5, r12)
            r14 = r43 | r0
            goto L_0x0080
        L_0x014e:
            r14 = r11
            goto L_0x0080
        L_0x0151:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0032
            r0 = r21
            int r0 = X.G9t.A0I(r5, r0)
            r6 = r6 | r0
            goto L_0x0032
        L_0x015e:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002a
            r0 = r30
            int r0 = X.G9t.A0Q(r5, r0)
            r6 = r6 | r0
            goto L_0x002a
        L_0x016b:
            r0 = r42 & 48
            if (r0 != 0) goto L_0x0022
            r0 = r29
            int r0 = X.G9t.A0P(r5, r0)
            r6 = r6 | r0
            goto L_0x0022
        L_0x0178:
            r0 = r42 & 6
            if (r0 != 0) goto L_0x0186
            r0 = r28
            int r6 = X.G9t.A0O(r5, r0)
            r6 = r6 | r42
            goto L_0x0018
        L_0x0186:
            r6 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55004Hab.A00(X.5Wy, X.5vd, X.5va, X.5vX, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, int, int, int, boolean, boolean):void");
    }
}
