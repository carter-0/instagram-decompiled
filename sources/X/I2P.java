package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I2P {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r30, androidx.compose.ui.Modifier r31, X.C288095bM r32, com.instagram.common.typedurl.ImageUrl r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, X.C62320sa r37, float r38, int r39, int r40) {
        /*
            r5 = r37
            r15 = r32
            r13 = r38
            r17 = r31
            r0 = -1573494994(0xffffffffa2365f2e, float:-2.4715987E-18)
            r1 = r30
            r1.ExV(r0)
            r3 = r40
            r2 = r40 & 1
            r0 = r39
            r40 = r34
            if (r2 == 0) goto L_0x01fa
            r2 = r39 | 6
        L_0x001c:
            r4 = r3 & 2
            r18 = r33
            if (r4 == 0) goto L_0x01ed
            r2 = r2 | 48
        L_0x0024:
            r4 = r3 & 4
            r39 = r35
            if (r4 == 0) goto L_0x01e0
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r4 = r3 & 8
            r38 = r36
            if (r4 == 0) goto L_0x01d3
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r10 = r3 & 16
            if (r10 == 0) goto L_0x01c6
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r9 = r3 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r9 != 0) goto L_0x0047
            r4 = r4 & r0
            if (r4 != 0) goto L_0x0048
            int r4 = X.G9t.A0J(r1, r5)
        L_0x0047:
            r2 = r2 | r4
        L_0x0048:
            r8 = r3 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            if (r8 != 0) goto L_0x0055
            r4 = r4 & r0
            if (r4 != 0) goto L_0x0056
            int r4 = X.G9t.A04(r1, r13)
        L_0x0055:
            r2 = r2 | r4
        L_0x0056:
            r7 = r3 & 128(0x80, float:1.794E-43)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 != 0) goto L_0x0063
            r4 = r4 & r0
            if (r4 != 0) goto L_0x0064
            int r4 = X.G9t.A0V(r1, r15)
        L_0x0063:
            r2 = r2 | r4
        L_0x0064:
            r4 = 4793491(0x492493, float:6.717112E-39)
            r6 = r2 & r4
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r6 != r4) goto L_0x009b
            boolean r4 = r1.Bwn()
            if (r4 == 0) goto L_0x009b
            r1.Evl()
        L_0x0077:
            X.5Xd r2 = r1.ASQ()
            if (r2 == 0) goto L_0x009a
            X.JB0 r1 = new X.JB0
            r19 = r1
            r20 = r17
            r21 = r15
            r22 = r18
            r23 = r40
            r24 = r39
            r25 = r38
            r26 = r5
            r27 = r13
            r28 = r0
            r29 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2.A06 = r1
        L_0x009a:
            return
        L_0x009b:
            if (r10 == 0) goto L_0x009f
            X.5Qk r17 = androidx.compose.ui.Modifier.A00
        L_0x009f:
            r35 = 0
            if (r9 != 0) goto L_0x00a5
            r35 = r5
        L_0x00a5:
            r16 = 48
            if (r8 == 0) goto L_0x00ab
            r13 = 1111490560(0x42400000, float:48.0)
        L_0x00ab:
            if (r7 == 0) goto L_0x00af
            X.5bM r15 = X.C288075bK.A04
        L_0x00af:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x00bd
            r5 = 261576924(0xf9758dc, float:1.4923977E-29)
            java.lang.String r4 = "com.instagram.barcelona.linkpreview.ui.CondensedLinkPreview (LinkPreviewRow.kt:188)"
            X.0fL.A01(r5, r4)
        L_0x00bd:
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0V(r17)
            r11 = 0
            X.5Zp r6 = X.C287215Zl.A04
            androidx.compose.ui.Modifier r7 = X.C287205Zk.A01(r6, r4)
            long r4 = X.C51966G9m.A0A(r1)
            r20 = 0
            X.5S2 r10 = X.AnonymousClass5S0.A00
            androidx.compose.ui.Modifier r7 = X.C304766Fd.A01(r7, r10, r4)
            r4 = 0
            r37 = 4
            r5 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A0B(r7, r5, r5, r4, r5)
            X.5Zu r8 = X.C287275Zs.A01
            r7 = r16
            X.5RD r8 = X.C287395a4.A02(r8, r1, r6, r7)
            int r12 = X.C287425a7.A00(r1)
            r6 = r1
            X.5Wx r6 = (X.C286565Wx) r6
            X.5RM r7 = X.C286565Wx.A04(r6)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r1, r9)
            X.C51973G9u.A0y(r1, r6)
            X.C51971G9r.A12(r1, r8, r7)
            X.0sL r8 = X.C287485aD.A02
            boolean r7 = r6.A0K
            if (r7 != 0) goto L_0x0106
            boolean r7 = X.C51972G9s.A1Q(r1, r12)
            if (r7 != 0) goto L_0x0109
        L_0x0106:
            X.C51971G9r.A13(r1, r8, r12)
        L_0x0109:
            X.C51965G9l.A18(r1, r9)
            X.6FX r14 = X.AnonymousClass6FX.A00
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            r7 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r7 = X.C51968G9o.A0P(r9, r7)
            androidx.compose.ui.Modifier r12 = X.C287205Zk.A0C(r7, r13)
            X.5Yw r7 = X.AnonymousClass5aQ.A00(r1)
            long r7 = r7.A0i
            androidx.compose.ui.Modifier r7 = X.C304766Fd.A01(r12, r10, r7)
            if (r33 == 0) goto L_0x01a7
            r8 = 1309744129(0x4e111c01, float:6.086329E8)
            r1.ExS(r8)
            int r30 = X.C51965G9l.A03(r2)
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r2
            r30 = r30 | r8
            r33 = 0
            r32 = 1912(0x778, float:2.679E-42)
            r22 = r20
            r25 = r20
            r26 = r20
            r27 = r20
            r28 = r20
            r29 = r4
            r31 = r11
            r19 = r1
            r21 = r7
            r23 = r15
            r24 = r18
            X.C304096Cd.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0152:
            X.C286565Wx.A0L(r6, r11)
            androidx.compose.ui.Modifier r12 = r14.A00(r9)
            long r7 = X.C51966G9m.A0A(r1)
            androidx.compose.ui.Modifier r8 = X.C304766Fd.A01(r12, r10, r7)
            r7 = 1092616192(0x41200000, float:10.0)
            androidx.compose.ui.Modifier r22 = X.C287195Zj.A09(r8, r7, r4)
            r7 = r2 & 14
            r7 = r7 | 384(0x180, float:5.38E-43)
            int r8 = r2 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r2
            r21 = r1
            r23 = r20
            r24 = r40
            r25 = r39
            r26 = r38
            r27 = r7
            A02(r21, r22, r23, r24, r25, r26, r27)
            r2 = -1620295951(0xffffffff9f6c3ef1, float:-5.0027008E-20)
            r1.ExS(r2)
            if (r35 == 0) goto L_0x0197
            androidx.compose.ui.Modifier r33 = X.C287195Zj.A0B(r9, r4, r4, r5, r4)
            r32 = r1
            r34 = r20
            r36 = r16
            X.HUU.A00(r32, r33, r34, r35, r36, r37)
        L_0x0197:
            boolean r2 = X.C51971G9r.A1S(r1, r6, r11)
            if (r2 == 0) goto L_0x01a3
            r2 = 401678695(0x17f12167, float:1.5582692E-24)
            X.0fL.A00(r2)
        L_0x01a3:
            r5 = r35
            goto L_0x0077
        L_0x01a7:
            r8 = 1309922100(0x4e13d334, float:6.2002304E8)
            r1.ExS(r8)
            r8 = 2131238493(0x7f081e5d, float:1.8093266E38)
            X.2DO r23 = X.C287975bA.A00(r1, r8, r11)
            androidx.compose.ui.Alignment r8 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r22 = X.C287205Zk.A02(r8, r7)
            r25 = 24
            r26 = 0
            r21 = r1
            r24 = r16
            X.C288165bT.A00(r21, r22, r23, r24, r25, r26)
            goto L_0x0152
        L_0x01c6:
            r4 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x003a
            r4 = r17
            int r4 = X.G9t.A0S(r1, r4)
            r2 = r2 | r4
            goto L_0x003a
        L_0x01d3:
            r4 = r0 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0034
            r4 = r38
            int r4 = X.G9t.A0R(r1, r4)
            r2 = r2 | r4
            goto L_0x0034
        L_0x01e0:
            r4 = r0 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x002c
            r4 = r39
            int r4 = X.G9t.A0Q(r1, r4)
            r2 = r2 | r4
            goto L_0x002c
        L_0x01ed:
            r4 = r39 & 48
            if (r4 != 0) goto L_0x0024
            r4 = r18
            int r4 = X.G9t.A0P(r1, r4)
            r2 = r2 | r4
            goto L_0x0024
        L_0x01fa:
            r2 = r39 & 6
            if (r2 != 0) goto L_0x0208
            r2 = r40
            int r2 = X.G9t.A0O(r1, r2)
            r2 = r2 | r39
            goto L_0x001c
        L_0x0208:
            r2 = r0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2P.A00(X.5Wy, androidx.compose.ui.Modifier, X.5bM, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, X.0sa, float, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r46, androidx.compose.ui.Modifier r47, com.instagram.api.schemas.LineType r48, X.C53255Gl3 r49, com.instagram.common.typedurl.ImageUrl r50, com.instagram.common.typedurl.ImageUrl r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, X.C62320sa r55, X.C62320sa r56, int r57, int r58, int r59, boolean r60, boolean r61) {
        /*
            r20 = r47
            r25 = r55
            r24 = r56
            r7 = r61
            r22 = 4
            r34 = r54
            r1 = r34
            r0 = r22
            X.0qQ.A0B(r1, r0)
            r10 = 5
            r56 = r48
            r0 = r56
            X.0qQ.A0B(r0, r10)
            r1 = -425429578(0xffffffffe6a475b6, float:-3.8831974E23)
            r0 = r46
            r0.ExV(r1)
            r1 = r59
            r3 = r59 & 1
            r2 = r57
            r36 = r52
            if (r3 == 0) goto L_0x0331
            r4 = r57 | 6
        L_0x002f:
            r3 = r59 & 2
            r37 = r50
            if (r3 == 0) goto L_0x0324
            r4 = r4 | 48
        L_0x0037:
            r3 = r59 & 4
            r26 = r51
            if (r3 == 0) goto L_0x0317
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x003f:
            r3 = r59 & 8
            r35 = r53
            if (r3 == 0) goto L_0x030a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r3 = r59 & 16
            if (r3 == 0) goto L_0x02fd
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x004d:
            r5 = r59 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x005d
            r3 = r3 & r57
            if (r3 != 0) goto L_0x005e
            r3 = r56
            int r3 = X.G9t.A0T(r0, r3)
        L_0x005d:
            r4 = r4 | r3
        L_0x005e:
            r5 = r59 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            r55 = r49
            if (r5 != 0) goto L_0x0070
            r3 = r3 & r57
            if (r3 != 0) goto L_0x0071
            r3 = r55
            int r3 = X.G9t.A0U(r0, r3)
        L_0x0070:
            r4 = r4 | r3
        L_0x0071:
            r5 = r1 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r23 = r60
            if (r5 != 0) goto L_0x0083
            r3 = r3 & r57
            if (r3 != 0) goto L_0x0084
            r3 = r23
            int r3 = X.G9t.A0f(r0, r3)
        L_0x0083:
            r4 = r4 | r3
        L_0x0084:
            r5 = r1 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 != 0) goto L_0x0094
            r3 = r57 & r3
            if (r3 != 0) goto L_0x0095
            r3 = r20
            int r3 = X.G9t.A0W(r0, r3)
        L_0x0094:
            r4 = r4 | r3
        L_0x0095:
            r6 = r1 & 512(0x200, float:7.175E-43)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r6 != 0) goto L_0x00a5
            r3 = r57 & r3
            if (r3 != 0) goto L_0x00a6
            r3 = r25
            int r3 = X.G9t.A0N(r0, r3)
        L_0x00a5:
            r4 = r4 | r3
        L_0x00a6:
            r8 = r1 & 1024(0x400, float:1.435E-42)
            r38 = r58
            if (r8 == 0) goto L_0x02eb
            r21 = r58 | 6
        L_0x00ae:
            r9 = r1 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02df
            r21 = r21 | 48
        L_0x00b4:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r4 & r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r3) goto L_0x00f7
            r11 = r21 & 19
            r3 = 18
            if (r11 != r3) goto L_0x00f7
            boolean r3 = r0.Bwn()
            if (r3 == 0) goto L_0x00f7
            r0.Evl()
        L_0x00cd:
            X.5Xd r3 = r0.ASQ()
            if (r3 == 0) goto L_0x00f6
            X.JCl r0 = new X.JCl
            r27 = r20
            r28 = r56
            r29 = r55
            r30 = r37
            r31 = r26
            r32 = r36
            r33 = r35
            r35 = r25
            r36 = r24
            r37 = r2
            r39 = r1
            r40 = r23
            r41 = r7
            r26 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r3.A06 = r0
        L_0x00f6:
            return
        L_0x00f7:
            if (r5 == 0) goto L_0x00fb
            X.5Qk r20 = androidx.compose.ui.Modifier.A00
        L_0x00fb:
            if (r6 == 0) goto L_0x00ff
            r25 = 0
        L_0x00ff:
            if (r8 == 0) goto L_0x0103
            r24 = 0
        L_0x0103:
            r5 = 0
            boolean r7 = X.C51966G9m.A1Q(r9, r7)
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0116
            r6 = 1216929181(0x4888dd9d, float:280300.9)
            java.lang.String r3 = "com.instagram.barcelona.linkpreview.ui.LinkPreviewAttachment (LinkPreviewRow.kt:101)"
            X.0fL.A01(r6, r3)
        L_0x0116:
            if (r60 == 0) goto L_0x02db
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
        L_0x011a:
            r3 = r56
            java.lang.Integer r8 = X.C304236Cr.A00(r3, r6)
            r3 = r55
            boolean r6 = r3.A01
            r40 = 0
            r12 = 1
            r3 = r20
            androidx.compose.ui.Modifier r6 = X.C304246Cs.A00(r3, r8, r6, r12)
            r3 = r55
            X.6Fk r3 = r3.A00
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A00(r3, r6)
            X.5RD r11 = X.C51966G9m.A0a(r5)
            int r9 = X.C287425a7.A00(r0)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r8 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r0, r6)
            X.0sa r19 = X.C287485aD.A00
            r13 = r19
            X.C51973G9u.A0z(r0, r3, r13)
            X.0sL r15 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r0, r11, r8, r15)
            X.0sL r11 = X.C287485aD.A02
            boolean r8 = r3.A0K
            if (r8 != 0) goto L_0x0161
            boolean r8 = X.C51972G9s.A1Q(r0, r9)
            if (r8 != 0) goto L_0x0164
        L_0x0161:
            X.C51971G9r.A13(r0, r11, r9)
        L_0x0164:
            X.0sL r17 = X.C51966G9m.A1K(r0, r6)
            X.5dj r16 = X.C289515dj.A00
            r6 = 69968407(0x42ba217, float:2.0175381E-36)
            X.5Qk r6 = X.C51965G9l.A0K(r0, r6)
            X.AnonymousClass5aQ.A02(r0)
            X.5ZQ r13 = X.AnonymousClass5ZM.A01
            androidx.compose.ui.Modifier r9 = X.AnonymousClass6FZ.A01(r6, r13)
            X.J1I r8 = X.J1I.A00
            androidx.compose.ui.Modifier r12 = X.AnonymousClass5R5.A00(r9, r8, r12)
            if (r25 == 0) goto L_0x0190
            X.5aV r9 = X.C51965G9l.A0R(r10)
            r8 = r25
            androidx.compose.ui.Modifier r8 = X.C288235ba.A02(r0, r6, r9, r8)
            androidx.compose.ui.Modifier r12 = r12.Ezh(r8)
        L_0x0190:
            X.C286565Wx.A0L(r3, r5)
            r8 = 0
            long r9 = X.C51966G9m.A0F(r0)
            r14 = 69977112(0x42bc418, float:2.0190995E-36)
            r0.ExS(r14)
            if (r7 == 0) goto L_0x02d6
            r13 = 1094713344(0x41400000, float:12.0)
            X.5ZQ r13 = X.AnonymousClass5ZN.A01(r13)
        L_0x01a6:
            X.C286565Wx.A0L(r3, r5)
            androidx.compose.ui.Modifier r13 = X.C304816Fi.A03(r12, r13, r8, r9)
            if (r51 != 0) goto L_0x01e9
            r6 = -2125502385(0xffffffff814f684f, float:-3.8094733E-38)
            r0.ExS(r6)
            int r6 = X.C51965G9l.A01(r4)
            int r4 = r4 >> 3
            int r18 = X.C51969G9p.A04(r4, r6)
            r6 = 458752(0x70000, float:6.42848E-40)
            int r4 = r21 << 15
            r6 = r6 & r4
            r18 = r18 | r6
            r19 = 192(0xc0, float:2.69E-43)
            r9 = r0
            r10 = r13
            r11 = r40
            r12 = r37
            r13 = r36
            r14 = r35
            r15 = r34
            r16 = r24
            r17 = r8
            A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x01db:
            boolean r3 = X.C51971G9r.A1S(r0, r3, r5)
            if (r3 == 0) goto L_0x00cd
            r3 = 1527719528(0x5b0f2668, float:4.029315E16)
            X.0fL.A00(r3)
            goto L_0x00cd
        L_0x01e9:
            if (r7 == 0) goto L_0x021c
            r6 = -2125193377(0xffffffff81541f5f, float:-3.8960758E-38)
            r0.ExS(r6)
            r16 = 1115160576(0x42780000, float:62.0)
            X.5bM r10 = X.C288075bK.A00
            r8 = 14155776(0xd80000, float:1.9836467E-38)
            r6 = r4 & 14
            r8 = r8 | r6
            int r6 = r4 >> 3
            r4 = r6 & 112(0x70, float:1.57E-43)
            r8 = r8 | r4
            int r17 = X.C51969G9p.A04(r6, r8)
            r6 = 458752(0x70000, float:6.42848E-40)
            int r4 = r21 << 15
            r6 = r6 & r4
            r17 = r17 | r6
            r8 = r0
            r9 = r13
            r11 = r26
            r12 = r36
            r13 = r35
            r14 = r34
            r15 = r24
            r18 = r5
            A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x01db
        L_0x021c:
            r9 = -2124811984(0xffffffff8159f130, float:-4.002965E-38)
            r0.ExS(r9)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            X.0sP r10 = X.C287655aY.A00
            androidx.compose.foundation.layout.IntrinsicWidthElement r9 = new androidx.compose.foundation.layout.IntrinsicWidthElement
            r9.<init>(r12, r10)
            androidx.compose.ui.Modifier r9 = r13.Ezh(r9)
            X.5RD r14 = X.C51969G9p.A0Z(r0, r5)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r12 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r0, r9)
            r9 = r19
            X.C51973G9u.A0z(r0, r3, r9)
            X.C287595aO.A00(r0, r14, r15)
            r9 = r18
            boolean r9 = X.C51965G9l.A1Y(r0, r3, r12, r9)
            if (r9 != 0) goto L_0x0255
            boolean r9 = X.C51972G9s.A1Q(r0, r13)
            if (r9 != 0) goto L_0x0258
        L_0x0255:
            X.C51971G9r.A13(r0, r11, r13)
        L_0x0258:
            r9 = r17
            X.C287595aO.A00(r0, r10, r9)
            r9 = 1137442816(0x43cc0000, float:408.0)
            androidx.compose.ui.Modifier r10 = X.C287205Zk.A0D(r6, r9)
            r9 = 1072790539(0x3ff17c0b, float:1.886598)
            androidx.compose.ui.Modifier r9 = X.C54739HQw.A00(r10, r9, r5)
            androidx.compose.ui.Modifier r41 = X.G9t.A0p(r0, r9)
            X.5bM r43 = X.C288075bK.A00
            r9 = 12582960(0xc00030, float:1.7632483E-38)
            int r11 = r4 >> 6
            r50 = r11 & 14
            r50 = r50 | r9
            r53 = 0
            r52 = 1912(0x778, float:2.679E-42)
            r39 = r0
            r42 = r40
            r44 = r26
            r45 = r40
            r46 = r40
            r47 = r40
            r48 = r40
            r49 = r8
            r51 = r5
            X.C304096Cd.A01(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            androidx.compose.ui.Modifier r28 = X.C287195Zj.A01(r6)
            r9 = r4 & 14
            r10 = r9 | 24576(0x6000, float:3.4438E-41)
            r9 = r11 & 112(0x70, float:1.57E-43)
            r10 = r10 | r9
            int r9 = r4 << 3
            r9 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 | r9
            int r4 = r4 >> 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r4
            r27 = r0
            r29 = r37
            r30 = r36
            r31 = r35
            r32 = r34
            r33 = r10
            A02(r27, r28, r29, r30, r31, r32, r33)
            r0.ASN()
            if (r24 == 0) goto L_0x01db
            androidx.compose.ui.Alignment r9 = X.C287215Zl.A0D
            r4 = r16
            androidx.compose.ui.Modifier r6 = r4.AAz(r9, r6)
            r4 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A0B(r6, r8, r4, r4, r8)
            r8 = r0
            r10 = r40
            r11 = r24
            r12 = r5
            r13 = r22
            X.HUU.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x01db
        L_0x02d6:
            X.AnonymousClass5aQ.A02(r0)
            goto L_0x01a6
        L_0x02db:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x011a
        L_0x02df:
            r3 = r58 & 48
            if (r3 != 0) goto L_0x00b4
            int r3 = X.G9t.A0Z(r0, r7)
            r21 = r21 | r3
            goto L_0x00b4
        L_0x02eb:
            r3 = r58 & 6
            if (r3 != 0) goto L_0x02f9
            r3 = r24
            int r3 = X.C41848B3p.A01(r0, r3)
            r21 = r58 | r3
            goto L_0x00ae
        L_0x02f9:
            r21 = r38
            goto L_0x00ae
        L_0x02fd:
            r3 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x004d
            r3 = r34
            int r3 = X.G9t.A0S(r0, r3)
            r4 = r4 | r3
            goto L_0x004d
        L_0x030a:
            r3 = r2 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0047
            r3 = r35
            int r3 = X.G9t.A0R(r0, r3)
            r4 = r4 | r3
            goto L_0x0047
        L_0x0317:
            r3 = r2 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x003f
            r3 = r26
            int r3 = X.G9t.A0Q(r0, r3)
            r4 = r4 | r3
            goto L_0x003f
        L_0x0324:
            r3 = r57 & 48
            if (r3 != 0) goto L_0x0037
            r3 = r37
            int r3 = X.G9t.A0P(r0, r3)
            r4 = r4 | r3
            goto L_0x0037
        L_0x0331:
            r3 = r57 & 6
            if (r3 != 0) goto L_0x033f
            r3 = r36
            int r4 = X.G9t.A0O(r0, r3)
            r4 = r4 | r57
            goto L_0x002f
        L_0x033f:
            r4 = r2
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2P.A01(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.Gl3, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, X.0sa, X.0sa, int, int, int, boolean, boolean):void");
    }

    public static final void A02(C286575Wy r28, Modifier modifier, ImageUrl imageUrl, String str, String str2, String str3, int i) {
        int i2;
        C286575Wy r0 = r28;
        r0.ExV(1045546429);
        int i3 = i;
        String str4 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, str4) | i;
        } else {
            i2 = i3;
        }
        String str5 = str2;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r0, str5);
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r0, imageUrl2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r0, str3);
        }
        Modifier modifier2 = modifier;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0S(r0, modifier2);
        }
        if ((i2 & 9363) != 9362 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(817137636, "com.instagram.barcelona.linkpreview.ui.EditorLinkPreviewTextContent (LinkPreviewRow.kt:242)");
            }
            AnonymousClass5RD A0R = C51971G9r.A0R(C287275Zs.A01(2.0f), r0, C287215Zl.A02, (((i2 >> 12) & 14) | 48) >> 3);
            int A00 = C287425a7.A00(r0);
            C286565Wx r6 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r0, modifier2);
            C62320sa r15 = C287485aD.A00;
            C51973G9u.A0z(r0, r6, r15);
            0sL r14 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0R, A04, r14);
            0sL r12 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C304756Fc A012 = C287275Zs.A01(4.0f);
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A0K = G9w.A0K(A012, r0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r6);
            Modifier A013 = C287435a8.A01(r0, r7);
            C51973G9u.A0z(r0, r6, r15);
            C287595aO.A00(r0, A0K, r14);
            if (C51965G9l.A1Y(r0, r6, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r12, A002);
            }
            C287595aO.A00(r0, A013, A1K);
            r0.ExS(1189586726);
            if (imageUrl != null) {
                C304096Cd.A03(r0, C287205Zk.A0C(r7, 12.0f), imageUrl2, ((i2 >> 6) & 14) | 432);
            }
            C286565Wx.A0L(r6, false);
            r0.ExS(1189592681);
            if (str != null) {
                C286575Wy r8 = r0;
                String str6 = str4;
                AnonymousClass5ZZ.A0L(r8, C51966G9m.A0T(r7), C51966G9m.A0b(r0), str6, (i2 & 14) | 48, C51966G9m.A0M(r0));
            }
            C286565Wx.A0L(r6, false);
            r0.ASN();
            String str7 = str5;
            if (str2 == null) {
                str7 = str3;
            }
            Modifier A0T = C51966G9m.A0T(r7);
            long A0H = C51966G9m.A0H(r0);
            AnonymousClass5ZZ.A0D(r0, A0T, C51966G9m.A0c(r0).A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 6160383, 0, 0, 0, AnonymousClass5Z7.A01(18))), str7, 2, 48, 390, 11256, A0H);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-1220767815);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9T(imageUrl2, modifier2, str4, str5, str3, i3, 1);
        }
    }
}
