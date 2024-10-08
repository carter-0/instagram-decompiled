package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I4s  reason: case insensitive filesystem */
public abstract class C56617I4s {
    public static final void A03(C286575Wy r13, HMB hmb, HLY hly, String str, C62320sa r17, int i, int i2, long j, boolean z) {
        A02(r13, (Modifier) null, hmb, (IH8) null, hly, str, r17, (C62320sa) null, i, 0, i2, 0, j, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r5 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if ((r25 & 32) != 0) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C52882GeI r17, X.C286575Wy r18, androidx.compose.ui.Modifier r19, X.HMB r20, X.IH8 r21, X.HLY r22, java.lang.String r23, int r24, int r25) {
        /*
            r13 = r17
            r10 = r21
            r11 = r19
            r2 = 0
            r12 = r20
            r14 = r23
            boolean r8 = X.AnonymousClass7TF.A1U(r2, r14, r12)
            r1 = 2
            r9 = r22
            X.0qQ.A0B(r9, r1)
            r0 = -472864936(0xffffffffe3d0a758, float:-7.6979623E21)
            r3 = r18
            r3.ExV(r0)
            r16 = r25
            r0 = r25 & 1
            r15 = r24
            if (r0 == 0) goto L_0x0125
            r4 = r24 | 6
        L_0x0027:
            r0 = r25 & 2
            if (r0 == 0) goto L_0x011a
            r4 = r4 | 48
        L_0x002d:
            r0 = r25 & 4
            if (r0 == 0) goto L_0x010f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r7 = r25 & 8
            if (r7 == 0) goto L_0x0104
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0039:
            r0 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004c
            r0 = r25 & 16
            if (r0 != 0) goto L_0x0049
            boolean r5 = r3.AGu(r10)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x004b
        L_0x0049:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004b:
            r4 = r4 | r0
        L_0x004c:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r24
            if (r0 != 0) goto L_0x0063
            r0 = r25 & 32
            if (r0 != 0) goto L_0x0060
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r5 = X.G9t.A1V(r3, r13, r0, r15)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r5 != 0) goto L_0x0062
        L_0x0060:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0062:
            r4 = r4 | r0
        L_0x0063:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r4
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r0) goto L_0x0085
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x0085
            r3.Evl()
        L_0x0075:
            X.5Xd r0 = r3.ASQ()
            if (r0 == 0) goto L_0x0084
            X.JAm r8 = new X.JAm
            r17 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.A06 = r8
        L_0x0084:
            return
        L_0x0085:
            r3.Ewr()
            r0 = r24 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r3.Aw3()
            if (r0 != 0) goto L_0x00e2
            r3.Evl()
            r0 = r25 & 16
            if (r0 == 0) goto L_0x00a0
            r4 = r4 & r5
        L_0x00a0:
            r0 = r25 & 32
            if (r0 == 0) goto L_0x00a5
        L_0x00a4:
            r4 = r4 & r6
        L_0x00a5:
            boolean r0 = X.C51967G9n.A1S(r3)
            if (r0 == 0) goto L_0x00b3
            r5 = -70129543(0xfffffffffbd1e879, float:-2.1798103E36)
            java.lang.String r0 = "com.instagram.compose.igds.components.tooltip.TooltipComponent (IgdsTooltip.kt:117)"
            X.0fL.A01(r5, r0)
        L_0x00b3:
            r6 = r4 & 14
            int r5 = r4 >> 3
            r0 = r5 & 112(0x70, float:1.57E-43)
            r6 = r6 | r0
            int r0 = r4 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r6 = r6 | r0
            int r24 = X.C51972G9s.A04(r5, r6)
            r5 = 458752(0x70000, float:6.42848E-40)
            int r0 = r4 << 6
            r5 = r5 & r0
            r24 = r24 | r5
            r17 = r13
            r19 = r11
            r21 = r10
            r25 = r2
            A01(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0075
            r0 = 1677737919(0x64003fbf, float:9.463107E21)
            X.0fL.A00(r0)
            goto L_0x0075
        L_0x00e2:
            if (r7 == 0) goto L_0x00e6
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
        L_0x00e6:
            r0 = r25 & 16
            if (r0 == 0) goto L_0x00f6
            float r0 = X.IH8.A03
            X.4cd r0 = X.C51970G9q.A0a(r3)
            X.IH8 r10 = new X.IH8
            r10.<init>(r0, r12)
            r4 = r4 & r5
        L_0x00f6:
            r0 = r25 & 32
            if (r0 == 0) goto L_0x00a5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            X.GeI r13 = new X.GeI
            r13.<init>(r0)
            goto L_0x00a4
        L_0x0104:
            r0 = r15 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0039
            int r0 = X.G9t.A0R(r3, r11)
            r4 = r4 | r0
            goto L_0x0039
        L_0x010f:
            r0 = r15 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0033
            int r0 = X.G9t.A0Q(r3, r9)
            r4 = r4 | r0
            goto L_0x0033
        L_0x011a:
            r0 = r24 & 48
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0P(r3, r12)
            r4 = r4 | r0
            goto L_0x002d
        L_0x0125:
            r0 = r24 & 6
            if (r0 != 0) goto L_0x0131
            int r4 = X.G9t.A0O(r3, r14)
            r4 = r4 | r24
            goto L_0x0027
        L_0x0131:
            r4 = r15
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56617I4s.A00(X.GeI, X.5Wy, androidx.compose.ui.Modifier, X.HMB, X.IH8, X.HLY, java.lang.String, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.Iww} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: X.Iww} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x023f, code lost:
        if (r12 == X.AnonymousClass5XT.A00) goto L_0x0241;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C52882GeI r27, X.C286575Wy r28, androidx.compose.ui.Modifier r29, X.HMB r30, X.IH8 r31, X.HLY r32, java.lang.String r33, int r34, int r35) {
        /*
            r20 = r29
            r1 = -2031684358(0xffffffff86e6f4fa, float:-8.6876345E-35)
            r0 = r28
            r0.ExV(r1)
            r25 = r35
            r1 = r35 & 1
            r19 = 3
            r4 = 1
            r23 = r33
            r8 = r34
            if (r1 == 0) goto L_0x0365
            r1 = r34 | 6
        L_0x0019:
            r2 = r35 & 2
            r34 = r32
            if (r2 == 0) goto L_0x0358
            r1 = r1 | 48
        L_0x0021:
            r2 = r35 & 4
            r22 = r30
            if (r2 == 0) goto L_0x034b
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0029:
            r2 = r35 & 8
            r35 = r31
            if (r2 == 0) goto L_0x033e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0031:
            r2 = r25 & 16
            r24 = r27
            if (r2 == 0) goto L_0x0328
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0039:
            r5 = r25 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x0048
            r2 = r2 & r8
            if (r2 != 0) goto L_0x0049
            r2 = r20
            int r2 = X.G9t.A0T(r0, r2)
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r2) goto L_0x0077
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0077
            r0.Evl()
        L_0x005b:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0076
            X.JAm r0 = new X.JAm
            r21 = r22
            r22 = r24
            r24 = r8
            r26 = r19
            r17 = r0
            r18 = r34
            r19 = r35
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A06 = r0
        L_0x0076:
            return
        L_0x0077:
            if (r5 == 0) goto L_0x007b
            X.5Qk r20 = androidx.compose.ui.Modifier.A00
        L_0x007b:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0089
            r3 = -1828557103(0xffffffff93026ed1, float:-1.6462944E-27)
            java.lang.String r2 = "com.instagram.compose.igds.components.tooltip.TooltipText (IgdsTooltip.kt:146)"
            X.0fL.A01(r3, r2)
        L_0x0089:
            int r3 = r34.ordinal()
            r5 = 0
            if (r3 == r5) goto L_0x00ae
            if (r3 == r4) goto L_0x00a4
            r2 = 2
            if (r3 == r2) goto L_0x00b6
            r4 = 2050489492(0x7a37fc94, float:2.388283E35)
            r2 = r19
            if (r3 == r2) goto L_0x00b9
            r1 = 2050482308(0x7a37e084, float:2.3868601E35)
            X.Wub r0 = X.C51973G9u.A0n(r0, r1)
            throw r0
        L_0x00a4:
            r2 = 2050485966(0x7a37eece, float:2.3875846E35)
            X.5Wx r2 = X.C51970G9q.A0R(r0, r2)
            long r16 = X.C291445hJ.A00
            goto L_0x00c5
        L_0x00ae:
            r2 = 2050484276(0x7a37e834, float:2.38725E35)
            long r16 = X.C51970G9q.A0L(r0, r2)
            goto L_0x00c1
        L_0x00b6:
            r4 = 2050487572(0x7a37f514, float:2.3879028E35)
        L_0x00b9:
            X.5Yw r2 = X.C51967G9n.A0a(r0, r4)
            long r6 = r2.A13
            r16 = r6
        L_0x00c1:
            X.5Wx r2 = X.C51965G9l.A0H(r0, r5)
        L_0x00c5:
            boolean r4 = X.C61670oa.A0G()
            r11 = 1094713344(0x41400000, float:12.0)
            if (r4 == 0) goto L_0x00cf
            r11 = 1099956224(0x41900000, float:18.0)
        L_0x00cf:
            boolean r6 = X.HXS.A00(r22)
            boolean r4 = X.C61670oa.A0G()
            r10 = 1091567616(0x41100000, float:9.0)
            if (r4 == 0) goto L_0x00dd
            r10 = 1093664768(0x41300000, float:11.0)
        L_0x00dd:
            if (r6 == 0) goto L_0x0216
            float r4 = X.IH8.A02
        L_0x00e1:
            float r10 = r10 + r4
            boolean r4 = X.C61670oa.A0G()
            r9 = 1091567616(0x41100000, float:9.0)
            if (r4 == 0) goto L_0x00ec
            r9 = 1093664768(0x41300000, float:11.0)
        L_0x00ec:
            if (r6 == 0) goto L_0x0212
            r4 = 0
        L_0x00ef:
            float r9 = r9 + r4
            int r4 = r1 >> 12
            r4 = r4 & 14
            r12 = r4 | 48
            java.lang.String r7 = "IgdsTooltip_Transition"
            X.0sP r4 = X.I67.A01
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0108
            r6 = 898989740(0x35957eac, float:1.1138231E-6)
            java.lang.String r4 = "androidx.compose.animation.core.updateTransition (Transition.kt:873)"
            X.0fL.A01(r6, r4)
        L_0x0108:
            int r6 = X.C51965G9l.A02(r12)
            r4 = r24
            X.I4f r15 = X.I67.A02(r4, r0, r7, r6)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x011e
            r4 = -1093615288(0xffffffffbed0c148, float:-0.40772462)
            X.0fL.A00(r4)
        L_0x011e:
            X.JIL r7 = X.JIL.A00
            X.5an r28 = X.C287765aj.A02
            java.lang.Object r4 = r15.A04()
            boolean r13 = X.AnonymousClass7TE.A1a(r4)
            r6 = -953412586(0xffffffffc72c1416, float:-44052.086)
            boolean r4 = X.C51967G9n.A1U(r0, r6)
            if (r4 == 0) goto L_0x013b
            r12 = -1405033975(0xffffffffac40e209, float:-2.7410316E-12)
            java.lang.String r4 = "com.instagram.compose.igds.components.tooltip.TooltipText.<anonymous> (IgdsTooltip.kt:179)"
            X.0fL.A01(r12, r4)
        L_0x013b:
            float r12 = X.C51971G9r.A00(r13)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x014b
            r4 = 495894558(0x1d8ec01e, float:3.778573E-21)
            X.0fL.A00(r4)
        L_0x014b:
            X.C286565Wx.A0L(r2, r5)
            java.lang.Float r30 = java.lang.Float.valueOf(r12)
            X.5Oz r4 = r15.A07
            r21 = r4
            boolean r12 = X.C51972G9s.A1Y(r21)
            boolean r4 = X.C51967G9n.A1U(r0, r6)
            if (r4 == 0) goto L_0x0168
            r6 = 141674377(0x871c789, float:7.275785E-34)
            java.lang.String r4 = "com.instagram.compose.igds.components.tooltip.TooltipText.<anonymous> (IgdsTooltip.kt:179)"
            X.0fL.A01(r6, r4)
        L_0x0168:
            float r6 = X.C51971G9r.A00(r12)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0178
            r4 = -1970984162(0xffffffff8a852b1e, float:-1.2823653E-32)
            X.0fL.A00(r4)
        L_0x0178:
            X.C286565Wx.A0L(r2, r5)
            java.lang.Float r31 = java.lang.Float.valueOf(r6)
            X.JQ8 r6 = r15.A03()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r7.invoke(r6, r0, r4)
            X.5b8 r6 = (X.AnonymousClass5b8) r6
            r32 = 196608(0x30000, float:2.75506E-40)
            r26 = r6
            r27 = r15
            r29 = r0
            X.IFp r14 = X.I67.A01(r26, r27, r28, r29, r30, r31, r32)
            X.JIK r13 = X.JIK.A00
            java.lang.Object r6 = r15.A04()
            boolean r18 = X.AnonymousClass7TE.A1a(r6)
            r7 = 1381162026(0x5252dc2a, float:2.26409218E11)
            boolean r6 = X.C51967G9n.A1U(r0, r7)
            if (r6 == 0) goto L_0x01b4
            r12 = 2087681136(0x7c6f7c70, float:4.9739314E36)
            java.lang.String r6 = "com.instagram.compose.igds.components.tooltip.TooltipText.<anonymous> (IgdsTooltip.kt:185)"
            X.0fL.A01(r12, r6)
        L_0x01b4:
            float r12 = X.C51971G9r.A00(r18)
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x01c4
            r6 = -143568271(0xfffffffff7715271, float:-4.8945924E33)
            X.0fL.A00(r6)
        L_0x01c4:
            X.C286565Wx.A0L(r2, r5)
            java.lang.Float r30 = java.lang.Float.valueOf(r12)
            boolean r12 = X.C51972G9s.A1Y(r21)
            boolean r6 = X.C51967G9n.A1U(r0, r7)
            if (r6 == 0) goto L_0x01dd
            r7 = -1963587146(0xffffffff8af609b6, float:-2.3692591E-32)
            java.lang.String r6 = "com.instagram.compose.igds.components.tooltip.TooltipText.<anonymous> (IgdsTooltip.kt:185)"
            X.0fL.A01(r7, r6)
        L_0x01dd:
            float r7 = X.C51971G9r.A00(r12)
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x01ed
            r6 = -898369798(0xffffffffca73f6fa, float:-3997118.5)
            X.0fL.A00(r6)
        L_0x01ed:
            X.C286565Wx.A0L(r2, r5)
            java.lang.Float r31 = java.lang.Float.valueOf(r7)
            X.JQ8 r6 = r15.A03()
            java.lang.Object r4 = r13.invoke(r6, r0, r4)
            X.5b8 r4 = (X.AnonymousClass5b8) r4
            r26 = r4
            X.IFp r4 = X.I67.A01(r26, r27, r28, r29, r30, r31, r32)
            r6 = r22
            int r6 = X.DbU.A02(r6, r5)
            switch(r6) {
                case 0: goto L_0x0219;
                case 1: goto L_0x021e;
                case 2: goto L_0x021c;
                case 3: goto L_0x0219;
                case 4: goto L_0x021c;
                case 5: goto L_0x021e;
                default: goto L_0x020d;
            }
        L_0x020d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0212:
            float r4 = X.IH8.A02
            goto L_0x00ef
        L_0x0216:
            r4 = 0
            goto L_0x00e1
        L_0x0219:
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0220
        L_0x021c:
            r7 = 0
            goto L_0x0220
        L_0x021e:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0220:
            boolean r6 = X.HXS.A00(r22)
            float r6 = X.C51970G9q.A01(r6)
            long r6 = X.C285615Rz.A00(r7, r6)
            r12 = 2050535538(0x7a38b072, float:2.3974034E35)
            boolean r12 = X.G9t.A1Z(r0, r14, r4, r12)
            boolean r13 = X.C51966G9m.A1T(r0, r6, r12)
            java.lang.Object r12 = r0.ECw()
            if (r13 != 0) goto L_0x0241
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            if (r12 != r13) goto L_0x0253
        L_0x0241:
            r31 = 5
            X.Iww r12 = new X.Iww
            r26 = r12
            r27 = r6
            r29 = r14
            r30 = r4
            r26.<init>(r27, r29, r30, r31)
            r0.FLL(r12)
        L_0x0253:
            r4 = r20
            androidx.compose.ui.Modifier r26 = X.C51973G9u.A0D(r2, r4, r12)
            r12 = 1090519040(0x41000000, float:8.0)
            boolean r4 = X.C61670oa.A0G()
            if (r4 == 0) goto L_0x0263
            r12 = 1094713344(0x41400000, float:12.0)
        L_0x0263:
            X.IG4 r4 = new X.IG4
            r7 = r22
            r6 = r35
            r4.<init>(r7, r6, r12)
            long r29 = X.AnonymousClass5RW.A01
            r28 = 1090519040(0x41000000, float:8.0)
            boolean r33 = X.C51975G9x.A1M(r28)
            long r31 = X.AnonymousClass5RV.A00
            r27 = r4
            androidx.compose.ui.Modifier r6 = X.C56169Hty.A01(r26, r27, r28, r29, r31, r33)
            r4 = 38896117(0x25181f5, float:1.5392191E-37)
            boolean r4 = X.C51967G9n.A1U(r0, r4)
            if (r4 == 0) goto L_0x028d
            r7 = -1124979386(0xffffffffbcf22d46, float:-0.029562604)
            java.lang.String r4 = "com.instagram.compose.igds.components.tooltip.getBackgroundColor (IgdsTooltip.kt:129)"
            X.0fL.A01(r7, r4)
        L_0x028d:
            if (r3 == r5) goto L_0x031a
            r4 = 1
            if (r3 == r4) goto L_0x030e
            r4 = 2
            if (r3 == r4) goto L_0x0302
            r4 = r19
            if (r3 != r4) goto L_0x0376
            r3 = 595363194(0x237c857a, float:1.3689212E-17)
            X.5Yw r3 = X.C51967G9n.A0a(r0, r3)
            long r3 = r3.A11
            X.C286565Wx.A0L(r2, r5)
        L_0x02a5:
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x02b1
            r7 = 681934245(0x28a57da5, float:1.837317E-14)
            X.0fL.A00(r7)
        L_0x02b1:
            X.C286565Wx.A0L(r2, r5)
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0X(r6, r3)
            X.5RD r6 = X.C51966G9m.A0a(r5)
            int r5 = X.C287425a7.A00(r0)
            X.5RM r3 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0y(r0, r2)
            X.C51971G9r.A12(r0, r6, r3)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r2.A0K
            if (r2 != 0) goto L_0x02da
            boolean r2 = X.C51972G9s.A1Q(r0, r5)
            if (r2 != 0) goto L_0x02dd
        L_0x02da:
            X.C51971G9r.A13(r0, r3, r5)
        L_0x02dd:
            X.C51965G9l.A18(r0, r4)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A0B(r2, r11, r10, r11, r9)
            X.5Z4 r3 = X.C51966G9m.A0h(r0)
            r5 = r1 & 14
            r1 = r0
            r4 = r23
            r6 = r16
            X.AnonymousClass5ZZ.A0O(r1, r2, r3, r4, r5, r6)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x005b
            r1 = 1183802806(0x468f65b6, float:18354.855)
            X.0fL.A00(r1)
            goto L_0x005b
        L_0x0302:
            r3 = 595361548(0x237c7f0c, float:1.3687851E-17)
            r0.ExS(r3)
            X.C286565Wx.A0L(r2, r5)
            long r3 = X.C291445hJ.A0S
            goto L_0x02a5
        L_0x030e:
            r3 = 595360203(0x237c79cb, float:1.3686738E-17)
            r0.ExS(r3)
            X.C286565Wx.A0L(r2, r5)
            long r3 = X.C291445hJ.A0b
            goto L_0x02a5
        L_0x031a:
            r3 = 595358424(0x237c72d8, float:1.36852665E-17)
            X.5Yw r3 = X.C51967G9n.A0a(r0, r3)
            long r3 = r3.A0B
            X.C286565Wx.A0L(r2, r5)
            goto L_0x02a5
        L_0x0328:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0039
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r24
            boolean r3 = X.G9t.A1V(r0, r2, r3, r8)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x033b
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x033b:
            r1 = r1 | r2
            goto L_0x0039
        L_0x033e:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0031
            r2 = r35
            int r2 = X.G9t.A0R(r0, r2)
            r1 = r1 | r2
            goto L_0x0031
        L_0x034b:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0029
            r2 = r22
            int r2 = X.G9t.A0Q(r0, r2)
            r1 = r1 | r2
            goto L_0x0029
        L_0x0358:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0021
            r2 = r34
            int r2 = X.G9t.A0P(r0, r2)
            r1 = r1 | r2
            goto L_0x0021
        L_0x0365:
            r1 = r34 & 6
            if (r1 != 0) goto L_0x0373
            r1 = r23
            int r1 = X.G9t.A0O(r0, r1)
            r1 = r1 | r34
            goto L_0x0019
        L_0x0373:
            r1 = r8
            goto L_0x0019
        L_0x0376:
            r1 = 595356564(0x237c6b94, float:1.3683728E-17)
            X.Wub r0 = X.C51972G9s.A0v(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56617I4s.A01(X.GeI, X.5Wy, androidx.compose.ui.Modifier, X.HMB, X.IH8, X.HLY, java.lang.String, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: X.MGF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: X.MGF} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if (r1 == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        if (r8.AGu(r3) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016f, code lost:
        if (r0 == r12) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0171, code lost:
        r26 = new X.MGF(r19, r28, (X.AnonymousClass4D7) null, 3, r14);
        r8.FLL(r26);
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0183, code lost:
        X.C51968G9o.A1E(r8, r11, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018a, code lost:
        if (X.C51971G9r.A1W(r28) == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0192, code lost:
        if (X.C51972G9s.A1Y(r10.A00) != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019a, code lost:
        if (X.C51972G9s.A1Y(r10.A01) == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019c, code lost:
        X.I5L.A01(r8, r3, (X.C56020HrS) null, r33, X.AnonymousClass5PI.A01(r8, new X.JAR(r10, r21, r7, r3, r20, r43, r33, r17, r4), -133480127), (((r2 >> 24) & 14) | 3072) | ((r2 >> 6) & 112), 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d8, code lost:
        if (X.0fL.A02() == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01da, code lost:
        X.0fL.A00(319209484);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r27, androidx.compose.ui.Modifier r28, X.HMB r29, X.IH8 r30, X.HLY r31, java.lang.String r32, X.C62320sa r33, X.C62320sa r34, int r35, int r36, int r37, long r38, long r40, boolean r42, boolean r43) {
        /*
            r21 = r28
            r20 = r31
            r14 = r40
            r4 = r43
            r17 = r38
            r3 = r30
            r19 = r34
            r9 = 0
            r43 = r32
            r7 = r29
            r0 = r43
            int r12 = X.DbW.A02(r9, r0, r7)
            r24 = 3
            r1 = r33
            r0 = r24
            X.0qQ.A0B(r1, r0)
            r0 = -304956088(0xffffffffedd2bd48, float:-8.152585E27)
            r8 = r27
            r8.ExV(r0)
            r5 = r37
            r0 = r37 & 1
            r6 = r35
            if (r0 == 0) goto L_0x0256
            r2 = r35 | 6
        L_0x0034:
            r0 = r37 & 2
            if (r0 == 0) goto L_0x0249
            r2 = r2 | 48
        L_0x003a:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x023e
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0040:
            r0 = r37 & 8
            if (r0 == 0) goto L_0x0233
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r23 = r37 & 16
            if (r23 == 0) goto L_0x0226
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x004c:
            r16 = r37 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r16 != 0) goto L_0x005c
            r0 = r0 & r35
            if (r0 != 0) goto L_0x005d
            r0 = r20
            int r0 = X.G9t.A0T(r8, r0)
        L_0x005c:
            r2 = r2 | r0
        L_0x005d:
            r11 = r37 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r11 != 0) goto L_0x006b
            r0 = r35 & r0
            if (r0 != 0) goto L_0x006c
            int r0 = X.G9t.A0e(r8, r4)
        L_0x006b:
            r2 = r2 | r0
        L_0x006c:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r35 & r0
            if (r0 != 0) goto L_0x0083
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0080
            r0 = r17
            boolean r1 = r8.AGt(r0)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 != 0) goto L_0x0082
        L_0x0080:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0082:
            r2 = r2 | r0
        L_0x0083:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r35 & r0
            if (r0 != 0) goto L_0x0098
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0095
            boolean r1 = r8.AGu(r3)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r1 != 0) goto L_0x0097
        L_0x0095:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0097:
            r2 = r2 | r0
        L_0x0098:
            r13 = r5 & 512(0x200, float:7.175E-43)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            if (r13 != 0) goto L_0x00ac
            r0 = r35 & r1
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r8.AGt(r14)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x00ac
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00ac:
            r2 = r2 | r1
        L_0x00ad:
            r10 = r5 & 1024(0x400, float:1.435E-42)
            r25 = r36
            if (r10 == 0) goto L_0x0214
            r22 = r36 | 6
        L_0x00b5:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r2 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x00f4
            r0 = r22 & 3
            if (r0 != r12) goto L_0x00f4
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x00f4
            r8.Evl()
        L_0x00cc:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x00f3
            X.JCf r0 = new X.JCf
            r22 = r33
            r23 = r19
            r24 = r6
            r26 = r5
            r27 = r17
            r29 = r14
            r31 = r42
            r32 = r4
            r16 = r0
            r17 = r21
            r18 = r7
            r19 = r3
            r21 = r43
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r32)
            r1.A06 = r0
        L_0x00f3:
            return
        L_0x00f4:
            r8.Ewr()
            r0 = r35 & 1
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x01e2
            boolean r0 = r8.Aw3()
            if (r0 != 0) goto L_0x01e2
            r8.Evl()
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x010c
            r2 = r2 & r1
        L_0x010c:
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0114
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r2 & r0
        L_0x0114:
            boolean r0 = X.C51967G9n.A1S(r8)
            if (r0 == 0) goto L_0x0122
            r1 = -1781314600(0xffffffff95d34bd8, float:-8.534188E-26)
            java.lang.String r0 = "com.instagram.compose.igds.components.tooltip.IgdsTooltip (IgdsTooltip.kt:77)"
            X.0fL.A01(r1, r0)
        L_0x0122:
            r0 = 550151673(0x20caa5f9, float:3.4329963E-19)
            java.lang.Object r10 = X.C51967G9n.A0m(r8, r0)
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            r16 = 0
            if (r10 != r12) goto L_0x013b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            X.GeI r10 = new X.GeI
            r10.<init>(r0)
            r8.FLL(r10)
        L_0x013b:
            X.GeI r10 = (X.C52882GeI) r10
            r11 = r8
            X.5Wx r11 = (X.C286565Wx) r11
            r0 = r42
            java.lang.Boolean r0 = X.C51967G9n.A0f(r11, r0)
            r10.A00(r0)
            r0 = 550155121(0x20cab371, float:3.4338875E-19)
            java.lang.Object r0 = X.C51974G9v.A0X(r8, r12, r0, r9)
            X.5Oz r28 = X.C51965G9l.A0J(r11, r0, r9)
            X.0gF r9 = X.C60340gF.A00
            r0 = 550157022(0x20cabade, float:3.434379E-19)
            r8.ExS(r0)
            boolean r13 = X.C51974G9v.A1U(r2)
            r0 = r22 & 14
            r1 = 4
            if (r0 != r1) goto L_0x0167
            r16 = 1
        L_0x0167:
            r13 = r13 | r16
            java.lang.Object r0 = r8.ECw()
            if (r13 != 0) goto L_0x0171
            if (r0 != r12) goto L_0x0183
        L_0x0171:
            r29 = 0
            X.MGF r0 = new X.MGF
            r26 = r0
            r27 = r19
            r30 = r24
            r31 = r14
            r26.<init>(r27, r28, r29, r30, r31)
            r8.FLL(r0)
        L_0x0183:
            X.C51968G9o.A1E(r8, r11, r0, r9)
            boolean r0 = X.C51971G9r.A1W(r28)
            if (r0 == 0) goto L_0x01d4
            X.5Oz r0 = r10.A00
            boolean r0 = X.C51972G9s.A1Y(r0)
            if (r0 != 0) goto L_0x019c
            X.5Oz r0 = r10.A01
            boolean r0 = X.C51972G9s.A1Y(r0)
            if (r0 == 0) goto L_0x01d4
        L_0x019c:
            r37 = 0
            r9 = -133480127(0xfffffffff80b4141, float:-1.12977E34)
            X.JAR r0 = new X.JAR
            r26 = r0
            r27 = r10
            r28 = r21
            r29 = r7
            r30 = r3
            r31 = r20
            r32 = r43
            r34 = r17
            r36 = r4
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r36)
            X.5PJ r39 = X.AnonymousClass5PI.A01(r8, r0, r9)
            int r0 = r2 >> 24
            r0 = r0 & 14
            r9 = r0 | 3072(0xc00, float:4.305E-42)
            int r0 = r2 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r9 = r9 | r0
            r35 = r8
            r36 = r3
            r38 = r33
            r40 = r9
            r41 = r1
            X.I5L.A01(r35, r36, r37, r38, r39, r40, r41)
        L_0x01d4:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00cc
            r0 = 319209484(0x1306c00c, float:1.7007864E-27)
            X.0fL.A00(r0)
            goto L_0x00cc
        L_0x01e2:
            if (r23 == 0) goto L_0x01e6
            X.5Qk r21 = androidx.compose.ui.Modifier.A00
        L_0x01e6:
            if (r16 == 0) goto L_0x01ea
            X.HLY r20 = X.HLY.DEFAULT
        L_0x01ea:
            boolean r4 = X.C51966G9m.A1R(r11, r4)
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01f5
            r17 = 5000(0x1388, double:2.4703E-320)
            r2 = r2 & r1
        L_0x01f5:
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x020a
            float r0 = X.IH8.A03
            X.4bM r0 = X.AnonymousClass5YA.A01
            X.4cd r0 = X.C51966G9m.A0j(r8, r0)
            X.IH8 r3 = new X.IH8
            r3.<init>(r0, r7)
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r2 & r0
        L_0x020a:
            if (r13 == 0) goto L_0x020e
            r14 = 0
        L_0x020e:
            if (r10 == 0) goto L_0x0114
            r19 = 0
            goto L_0x0114
        L_0x0214:
            r0 = r36 & 6
            if (r0 != 0) goto L_0x0222
            r0 = r19
            int r0 = X.C41848B3p.A01(r8, r0)
            r22 = r36 | r0
            goto L_0x00b5
        L_0x0222:
            r22 = r25
            goto L_0x00b5
        L_0x0226:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004c
            r0 = r21
            int r0 = X.G9t.A0S(r8, r0)
            r2 = r2 | r0
            goto L_0x004c
        L_0x0233:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0046
            int r0 = X.G9t.A0H(r8, r1)
            r2 = r2 | r0
            goto L_0x0046
        L_0x023e:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0040
            int r0 = X.G9t.A0Q(r8, r7)
            r2 = r2 | r0
            goto L_0x0040
        L_0x0249:
            r0 = r35 & 48
            if (r0 != 0) goto L_0x003a
            r0 = r42
            int r0 = X.G9t.A0Z(r8, r0)
            r2 = r2 | r0
            goto L_0x003a
        L_0x0256:
            r0 = r35 & 6
            if (r0 != 0) goto L_0x0264
            r0 = r43
            int r2 = X.G9t.A0O(r8, r0)
            r2 = r2 | r35
            goto L_0x0034
        L_0x0264:
            r2 = r6
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56617I4s.A02(X.5Wy, androidx.compose.ui.Modifier, X.HMB, X.IH8, X.HLY, java.lang.String, X.0sa, X.0sa, int, int, int, long, long, boolean, boolean):void");
    }
}
