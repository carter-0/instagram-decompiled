package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.GQd  reason: case insensitive filesystem */
public abstract class C52378GQd {
    public static final C7227Pzw A00 = new C7227Pzw(0.4f, 0.0f, 0.2f, 1.0f);
    public static final C7227Pzw A01 = new C7227Pzw(0.2f, 0.0f, 0.8f, 1.0f);
    public static final C7227Pzw A02 = new C7227Pzw(0.4f, 0.0f, 1.0f, 1.0f);
    public static final C7227Pzw A03 = new C7227Pzw(0.0f, 0.0f, 0.65f, 1.0f);
    public static final C7227Pzw A04 = new C7227Pzw(0.1f, 0.0f, 0.45f, 1.0f);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: X.GQe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.GQe} */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        if (r9 == X.AnonymousClass5XT.A00) goto L_0x00fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r20, androidx.compose.ui.Modifier r21, float r22, float r23, float r24, int r25, int r26, long r27, long r29, boolean r31) {
        /*
            r6 = r23
            r2 = r31
            r5 = r24
            r3 = r21
            r0 = 1132398729(0x437f0889, float:255.03334)
            r8 = r20
            r8.ExV(r0)
            r16 = r26
            r0 = r26 & 1
            r7 = r22
            r4 = r25
            if (r0 == 0) goto L_0x0159
            r9 = r25 | 6
        L_0x001c:
            r15 = r26 & 2
            if (r15 == 0) goto L_0x014e
            r9 = r9 | 48
        L_0x0022:
            r0 = r26 & 4
            r25 = r27
            if (r0 == 0) goto L_0x0141
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r12 = r16 & 8
            if (r12 == 0) goto L_0x0136
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r10 = r16 & 16
            r0 = r29
            if (r10 == 0) goto L_0x0125
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r14 = r16 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x0049
            r10 = r10 & r4
            if (r10 != 0) goto L_0x004a
            boolean r10 = r8.AGr(r6)
            int r10 = X.C51969G9p.A03(r10)
        L_0x0049:
            r9 = r9 | r10
        L_0x004a:
            r13 = r16 & 64
            r10 = 1572864(0x180000, float:2.204052E-39)
            if (r13 != 0) goto L_0x0057
            r10 = r10 & r4
            if (r10 != 0) goto L_0x0058
            int r10 = X.G9t.A04(r8, r5)
        L_0x0057:
            r9 = r9 | r10
        L_0x0058:
            r10 = 599187(0x92493, float:8.3964E-40)
            r11 = r9 & r10
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r10) goto L_0x0087
            boolean r10 = r8.Bwn()
            if (r10 == 0) goto L_0x0087
            r8.Evl()
        L_0x006b:
            X.5Xd r9 = r8.ASQ()
            if (r9 == 0) goto L_0x0086
            r17 = 1
            X.JBB r8 = new X.JBB
            r20 = r0
            r22 = r2
            r18 = r25
            r14 = r5
            r15 = r4
            r12 = r7
            r13 = r6
            r10 = r8
            r11 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r20, r22)
            r9.A06 = r8
        L_0x0086:
            return
        L_0x0087:
            if (r15 == 0) goto L_0x008b
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
        L_0x008b:
            boolean r2 = X.C51966G9m.A1Q(r12, r2)
            if (r14 == 0) goto L_0x0093
            r6 = 1082130432(0x40800000, float:4.0)
        L_0x0093:
            if (r13 == 0) goto L_0x0097
            r5 = 1109393408(0x42200000, float:40.0)
        L_0x0097:
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x00a5
            r11 = -102208807(0xfffffffff9e86ad9, float:-1.508475E35)
            java.lang.String r10 = "com.meta.compose.component.progressindicator.BasicCircularProgressIndicator (ProgressIndicator.kt:233)"
            X.0fL.A01(r11, r10)
        L_0x00a5:
            X.4cd r10 = X.C51968G9o.A0Y(r8)
            float r19 = r10.F06(r6)
            r11 = 0
            r18 = 0
            r20 = 1082130432(0x40800000, float:4.0)
            X.5tg r10 = new X.5tg
            r17 = r10
            r21 = r11
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            r14 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            X.GQu r12 = new X.GQu
            r12.<init>(r14, r13)
            X.GRf r13 = new X.GRf
            r13.<init>(r12, r7, r11, r11)
            r12 = 1
            androidx.compose.ui.Modifier r12 = X.AnonymousClass5R5.A00(r3, r13, r12)
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A0C(r12, r5)
            r12 = -1506148607(0xffffffffa639ff01, float:-6.4530363E-16)
            r8.ExS(r12)
            r12 = r9 & 14
            boolean r14 = X.C51972G9s.A1I(r12)
            boolean r12 = X.C51973G9u.A1J(r9)
            r14 = r14 | r12
            boolean r12 = X.C51974G9v.A1W(r9)
            boolean r12 = X.C51968G9o.A1T(r8, r10, r14, r12)
            boolean r9 = X.C51972G9s.A1N(r9)
            r12 = r12 | r9
            java.lang.Object r9 = r8.ECw()
            if (r12 != 0) goto L_0x00fb
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r9 != r12) goto L_0x010f
        L_0x00fb:
            X.GQe r9 = new X.GQe
            r17 = r9
            r18 = r10
            r19 = r7
            r20 = r0
            r22 = r25
            r24 = r2
            r17.<init>(r18, r19, r20, r22, r24)
            r8.FLL(r9)
        L_0x010f:
            X.0sP r9 = (X.0sP) r9
            X.C51965G9l.A1X(r8, r11)
            X.C289565do.A00(r8, r13, r9, r11)
            boolean r9 = X.0fL.A02()
            if (r9 == 0) goto L_0x006b
            r9 = -1198526314(0xffffffffb88ff096, float:-6.863584E-5)
            X.0fL.A00(r9)
            goto L_0x006b
        L_0x0125:
            r10 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0038
            boolean r11 = r8.AGt(r0)
            r10 = 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0133
            r10 = 16384(0x4000, float:2.2959E-41)
        L_0x0133:
            r9 = r9 | r10
            goto L_0x0038
        L_0x0136:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0030
            int r0 = X.G9t.A0b(r8, r2)
            r9 = r9 | r0
            goto L_0x0030
        L_0x0141:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002a
            r0 = r25
            int r0 = X.G9t.A0D(r8, r0)
            r9 = r9 | r0
            goto L_0x002a
        L_0x014e:
            r0 = r25 & 48
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0P(r8, r3)
            r9 = r9 | r0
            goto L_0x0022
        L_0x0159:
            r0 = r25 & 6
            if (r0 != 0) goto L_0x0169
            boolean r0 = r8.AGr(r7)
            int r9 = X.C51970G9q.A05(r0)
            r9 = r9 | r25
            goto L_0x001c
        L_0x0169:
            r9 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52378GQd.A00(X.5Wy, androidx.compose.ui.Modifier, float, float, float, int, int, long, long, boolean):void");
    }

    public static final void A01(C286575Wy r22, Modifier modifier, float f, int i, int i2, long j) {
        int i3;
        float f2 = f;
        Modifier modifier2 = modifier;
        C286575Wy r1 = r22;
        r1.ExV(-1482707784);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r1, modifier2) | i;
        } else {
            i3 = i6;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0C(r1, j2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A01(r1, f2);
        }
        if ((i3 & 147) != 146 || !r1.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                f2 = 4.0f;
            }
            if (0fL.A02()) {
                0fL.A01(452399366, "com.meta.compose.component.progressindicator.BasicCircularProgressIndicator (ProgressIndicator.kt:265)");
            }
            C298575tg r13 = new C298575tg((C13866Tin) null, C51968G9o.A0Y(r1).F06(f2), 4.0f, 2, 0);
            GRI A022 = GRH.A02(r1);
            C287805an r17 = C287765aj.A05;
            JNL jnl = C52518GVv.A02;
            GQC A012 = GQC.A01(jnl, 6660, 0);
            Integer num = AnonymousClass05K.A00;
            GRG A002 = GRH.A00(new GRJ(A012, num), A022, r17, r1, 0, 5, 229816);
            GRI gri = A022;
            C286575Wy r25 = r1;
            GRG A013 = GRH.A01(new GRJ(GQC.A01(jnl, 1332, 0), num), gri, r25, 0.0f, 286.0f, 29112);
            GRG A014 = GRH.A01(new GRJ(GRM.A00(GRO.A00), num), gri, r25, 0.0f, 290.0f, 29112);
            GRG A015 = GRH.A01(new GRJ(GRM.A00(GRT.A00), num), gri, r25, 0.0f, 290.0f, 29112);
            Modifier A0C = C287205Zk.A0C(AnonymousClass5R5.A00(modifier2, GRX.A00, true), 40.0f);
            boolean A1T = C51968G9o.A1T(r1, r13, C51965G9l.A1Z(r1, A013, C51974G9v.A1b(r1, A002, A014, A015, -1506048954)) | C51973G9u.A1I(i3), C51973G9u.A1H(i3));
            Object ECw = r1.ECw();
            if (A1T || ECw == AnonymousClass5XT.A00) {
                GRG grg = A015;
                GRG grg2 = A013;
                ECw = new GRL(A002, A014, grg, grg2, r13, f2, j2);
                r1.FLL(ECw);
            }
            C51965G9l.A1X(r1, false);
            C289565do.A00(r1, A0C, (0sP) ECw, 0);
            if (0fL.A02()) {
                0fL.A00(1699650025);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8O(modifier2, f2, i6, i4, 2, j2);
        }
    }

    public static final void A02(AnonymousClass5Q3 r15, C298575tg r16, float f, float f2, long j) {
        C298575tg r5 = r16;
        float f3 = r5.A01 / 2.0f;
        float A002 = C51969G9p.A00(r15) - (2.0f * f3);
        r15.AQR((C288195bW) null, r5, f, f2, 1.0f, 3, j, C289325dP.A00(f3, f3), C288015bE.A00(A002, A002), false);
    }
}
