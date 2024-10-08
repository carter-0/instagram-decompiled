package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;

public abstract class I6N {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r19, androidx.compose.ui.Modifier r20, X.JV7 r21, X.JV7 r22, java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.String r25, X.0sP r26, X.0sP r27, int r28, int r29, int r30, boolean r31) {
        /*
            r2 = r20
            r0 = -1587258378(0xffffffffa1645bf6, float:-7.7371114E-19)
            r5 = r19
            r5.ExV(r0)
            r3 = r30
            r0 = r30 & 1
            r18 = r25
            r4 = r29
            if (r0 == 0) goto L_0x01a3
            r1 = r29 | 6
        L_0x0016:
            r0 = r30 & 2
            r19 = r23
            if (r0 == 0) goto L_0x0196
            r1 = r1 | 48
        L_0x001e:
            r0 = r30 & 4
            r6 = r28
            if (r0 == 0) goto L_0x018b
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r12 = r30 & 8
            if (r12 == 0) goto L_0x0180
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r0 = r30 & 16
            r7 = r26
            if (r0 == 0) goto L_0x0175
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r9 = r30 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r8 = r24
            if (r9 != 0) goto L_0x0044
            r0 = r29 & r0
            if (r0 != 0) goto L_0x0045
            int r0 = X.G9t.A0J(r5, r8)
        L_0x0044:
            r1 = r1 | r0
        L_0x0045:
            r10 = r30 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r9 = r27
            if (r10 != 0) goto L_0x0055
            r0 = r29 & r0
            if (r0 != 0) goto L_0x0056
            int r0 = X.G9t.A0K(r5, r9)
        L_0x0055:
            r1 = r1 | r0
        L_0x0056:
            r10 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x0066
            r0 = r29 & r0
            if (r0 != 0) goto L_0x0067
            r0 = r21
            int r0 = X.G9t.A0V(r5, r0)
        L_0x0066:
            r1 = r1 | r0
        L_0x0067:
            r10 = r3 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r20 = r22
            if (r10 != 0) goto L_0x0079
            r0 = r29 & r0
            if (r0 != 0) goto L_0x007a
            r0 = r20
            int r0 = X.G9t.A0W(r5, r0)
        L_0x0079:
            r1 = r1 | r0
        L_0x007a:
            r11 = r3 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r10 = r31
            if (r11 != 0) goto L_0x008a
            r0 = r29 & r0
            if (r0 != 0) goto L_0x008b
            int r0 = X.G9t.A0h(r5, r10)
        L_0x008a:
            r1 = r1 | r0
        L_0x008b:
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r11 & r1
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r0) goto L_0x00be
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x00be
            r5.Evl()
        L_0x009d:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x00bd
            X.JC2 r0 = new X.JC2
            r15 = r4
            r16 = r3
            r17 = r10
            r10 = r8
            r11 = r18
            r12 = r7
            r13 = r9
            r14 = r6
            r5 = r0
            r6 = r2
            r7 = r21
            r8 = r20
            r9 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.A06 = r0
        L_0x00bd:
            return
        L_0x00be:
            if (r12 == 0) goto L_0x00c2
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
        L_0x00c2:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00d0
            r11 = -18230844(0xfffffffffee9d1c4, float:-1.5539964E38)
            java.lang.String r0 = "com.instagram.compose.igds.components.megaphone.ContentBody (IgdsMegaphone.kt:252)"
            X.0fL.A01(r11, r0)
        L_0x00d0:
            int r0 = r1 >> 9
            X.5RD r13 = X.C51976G9y.A0D(r5, r0)
            r12 = 0
            int r15 = X.C287425a7.A00(r5)
            r11 = r5
            X.5Wx r11 = (X.C286565Wx) r11
            X.5RM r0 = X.C286565Wx.A04(r11)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r5, r2)
            X.C51973G9u.A0y(r5, r11)
            X.C51971G9r.A12(r5, r13, r0)
            X.0sL r13 = X.C287485aD.A02
            boolean r0 = r11.A0K
            if (r0 != 0) goto L_0x00f8
            boolean r0 = X.C51972G9s.A1Q(r5, r15)
            if (r0 != 0) goto L_0x00fb
        L_0x00f8:
            X.C51971G9r.A13(r5, r13, r15)
        L_0x00fb:
            X.C51965G9l.A18(r5, r14)
            X.5Z4 r0 = X.C51965G9l.A0S(r5)
            X.5Z4 r15 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r0, (X.C268454dQ) null, (X.AnonymousClass5ZD) null, (X.C291825hw) null, r6, 0, 0, 16744447, 0, 0, 0, 0)
            androidx.compose.ui.Modifier r14 = X.C51969G9p.A0U()
            r0 = r1 & 14
            r13 = r0 | 48
            r0 = r18
            X.AnonymousClass5ZZ.A09(r5, r14, r15, r0, r13)
            X.5Z4 r0 = X.C51966G9m.A0c(r5)
            X.5Z4 r15 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r0, (X.C268454dQ) null, (X.AnonymousClass5ZD) null, (X.C291825hw) null, r6, 0, 0, 16744447, 0, 0, 0, 0)
            int r0 = r1 >> 3
            r13 = r0 & 14
            int r14 = r1 >> 6
            r0 = r14 & 896(0x380, float:1.256E-42)
            r13 = r13 | r0
            r0 = r19
            A04(r5, r15, r0, r7, r13)
            r0 = -1914935205(0xffffffff8ddc685b, float:-1.35836695E-30)
            r5.ExS(r0)
            if (r24 == 0) goto L_0x014b
            boolean r0 = X.00l.A0W(r8)
            if (r0 != 0) goto L_0x014b
            X.5Z4 r0 = X.C51966G9m.A0b(r5)
            X.5Z4 r15 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r0, (X.C268454dQ) null, (X.AnonymousClass5ZD) null, (X.C291825hw) null, r6, 0, 0, 16744447, 0, 0, 0, 0)
            int r0 = r1 >> 15
            r13 = r0 & 14
            int r0 = r1 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r13 = r13 | r0
            A04(r5, r15, r8, r9, r13)
        L_0x014b:
            X.C286565Wx.A0L(r11, r12)
            r0 = -1914928452(0xffffffff8ddc82bc, float:-1.359002E-30)
            r5.ExS(r0)
            if (r31 != 0) goto L_0x0167
            r13 = r14 & 14
            int r1 = r1 >> 18
            r0 = r1 & 112(0x70, float:1.57E-43)
            r13 = r13 | r0
            r0 = r1 & 896(0x380, float:1.256E-42)
            r13 = r13 | r0
            r1 = r21
            r0 = r20
            A05(r5, r1, r0, r6, r13)
        L_0x0167:
            boolean r0 = X.C51971G9r.A1S(r5, r11, r12)
            if (r0 == 0) goto L_0x009d
            r0 = 1086211622(0x40be4626, float:5.946063)
            X.0fL.A00(r0)
            goto L_0x009d
        L_0x0175:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A0I(r5, r7)
            r1 = r1 | r0
            goto L_0x0034
        L_0x0180:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A0R(r5, r2)
            r1 = r1 | r0
            goto L_0x002c
        L_0x018b:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A07(r5, r6)
            r1 = r1 | r0
            goto L_0x0026
        L_0x0196:
            r0 = r29 & 48
            if (r0 != 0) goto L_0x001e
            r0 = r19
            int r0 = X.G9t.A0F(r5, r0)
            r1 = r1 | r0
            goto L_0x001e
        L_0x01a3:
            r0 = r29 & 6
            if (r0 != 0) goto L_0x01b1
            r0 = r18
            int r1 = X.G9t.A0O(r5, r0)
            r1 = r1 | r29
            goto L_0x0016
        L_0x01b1:
            r1 = r4
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6N.A01(X.5Wy, androidx.compose.ui.Modifier, X.JV7, X.JV7, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, X.0sP, X.0sP, int, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r40, X.AnonymousClass2DO r41, X.JV7 r42, X.JV7 r43, X.JQC r44, java.lang.CharSequence r45, java.lang.CharSequence r46, java.lang.String r47, X.C62320sa r48, X.0sP r49, X.0sP r50, int r51, int r52) {
        /*
            r38 = r43
            r39 = r42
            r36 = r46
            r29 = r49
            r5 = r41
            r21 = r48
            r30 = r50
            r9 = r44
            r6 = 0
            r15 = 1
            r0 = 17514912(0x10b41a0, float:2.5577352E-38)
            r4 = r40
            r4.ExV(r0)
            r2 = r52
            r0 = r52 & 1
            r35 = r47
            r3 = r51
            if (r0 == 0) goto L_0x030a
            r0 = r51 | 6
        L_0x0026:
            r1 = r52 & 2
            r37 = r45
            if (r1 == 0) goto L_0x02fd
            r0 = r0 | 48
        L_0x002e:
            r17 = r52 & 4
            if (r17 == 0) goto L_0x02f2
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r16 = r52 & 8
            if (r16 == 0) goto L_0x02e5
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r14 = r52 & 16
            if (r14 == 0) goto L_0x02da
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r13 = r52 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r13 != 0) goto L_0x0050
            r1 = r1 & r51
            if (r1 != 0) goto L_0x0051
            r1 = r29
            int r1 = X.G9t.A0J(r4, r1)
        L_0x0050:
            r0 = r0 | r1
        L_0x0051:
            r12 = r52 & 64
            r1 = 1572864(0x180000, float:2.204052E-39)
            if (r12 != 0) goto L_0x0061
            r1 = r51 & r1
            if (r1 != 0) goto L_0x0062
            r1 = r36
            int r1 = X.G9t.A0K(r4, r1)
        L_0x0061:
            r0 = r0 | r1
        L_0x0062:
            r7 = r2 & 128(0x80, float:1.794E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 != 0) goto L_0x0072
            r1 = r51 & r1
            if (r1 != 0) goto L_0x0073
            r1 = r30
            int r1 = X.G9t.A0L(r4, r1)
        L_0x0072:
            r0 = r0 | r1
        L_0x0073:
            r8 = r2 & 256(0x100, float:3.59E-43)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 != 0) goto L_0x0083
            r1 = r51 & r1
            if (r1 != 0) goto L_0x0084
            r1 = r39
            int r1 = X.G9t.A0W(r4, r1)
        L_0x0083:
            r0 = r0 | r1
        L_0x0084:
            r10 = r2 & 512(0x200, float:7.175E-43)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            if (r10 != 0) goto L_0x0094
            r1 = r51 & r1
            if (r1 != 0) goto L_0x0095
            r1 = r38
            int r1 = X.G9t.A0X(r4, r1)
        L_0x0094:
            r0 = r0 | r1
        L_0x0095:
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r0 & r1
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r1) goto L_0x00cb
            boolean r1 = r4.Bwn()
            if (r1 == 0) goto L_0x00cb
            r4.Evl()
        L_0x00a8:
            X.5Xd r1 = r4.ASQ()
            if (r1 == 0) goto L_0x00ca
            X.JC3 r0 = new X.JC3
            r4 = r0
            r6 = r39
            r7 = r38
            r8 = r9
            r9 = r37
            r10 = r36
            r11 = r35
            r12 = r21
            r13 = r29
            r14 = r30
            r15 = r3
            r16 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.A06 = r0
        L_0x00ca:
            return
        L_0x00cb:
            if (r17 == 0) goto L_0x00cf
            X.IPa r9 = X.C57111IPa.A00
        L_0x00cf:
            r20 = 0
            if (r16 == 0) goto L_0x00d5
            r21 = r20
        L_0x00d5:
            if (r14 == 0) goto L_0x00d9
            r5 = r20
        L_0x00d9:
            if (r13 == 0) goto L_0x00dd
            r29 = r20
        L_0x00dd:
            if (r12 == 0) goto L_0x00e1
            r36 = r20
        L_0x00e1:
            if (r7 == 0) goto L_0x00e5
            r30 = r20
        L_0x00e5:
            if (r8 == 0) goto L_0x00e9
            r39 = r20
        L_0x00e9:
            if (r10 == 0) goto L_0x00ed
            r38 = r20
        L_0x00ed:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00fb
            r7 = 1222868547(0x48e37e43, float:465906.1)
            java.lang.String r1 = "com.instagram.compose.igds.components.megaphone.IgdsMegaphone (IgdsMegaphone.kt:147)"
            X.0fL.A01(r7, r1)
        L_0x00fb:
            boolean r34 = X.C61670oa.A0C()
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r10 = X.C51966G9m.A0T(r7)
            X.5RD r14 = X.C51966G9m.A0a(r6)
            int r13 = X.C287425a7.A00(r4)
            r1 = r4
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r12 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r4, r10)
            X.0sa r19 = X.C287485aD.A00
            r8 = r19
            X.C51973G9u.A0z(r4, r1, r8)
            X.0sL r18 = X.C287485aD.A03
            r8 = r18
            X.0sL r17 = X.C51969G9p.A0w(r4, r14, r12, r8)
            X.0sL r8 = X.C287485aD.A02
            boolean r12 = r1.A0K
            if (r12 != 0) goto L_0x0133
            boolean r12 = X.C51972G9s.A1Q(r4, r13)
            if (r12 != 0) goto L_0x0136
        L_0x0133:
            X.C51971G9r.A13(r4, r8, r13)
        L_0x0136:
            X.0sL r16 = X.C51966G9m.A1K(r4, r11)
            X.5dj r14 = X.C289515dj.A00
            r11 = 1105671824(0x41e73690, float:28.901642)
            r4.ExS(r11)
            if (r21 == 0) goto L_0x0170
            r11 = 2131239023(0x7f08206f, float:1.8094341E38)
            X.2DO r24 = X.C287975bA.A00(r4, r11, r6)
            r13 = r21
            r12 = r20
            androidx.compose.ui.Modifier r13 = X.C287635aW.A05(r7, r12, r12, r13, r15)
            r12 = 1094713344(0x41400000, float:12.0)
            r11 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A09(r13, r12, r11)
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A0C(r11, r12)
            androidx.compose.ui.Alignment r12 = X.C287215Zl.A0D
            androidx.compose.ui.Modifier r23 = r14.AAz(r12, r13)
            r27 = 0
            r25 = 48
            r26 = 24
            r22 = r4
            X.C288165bT.A00(r22, r23, r24, r25, r26, r27)
        L_0x0170:
            X.C286565Wx.A0L(r1, r6)
            r11 = 1
            if (r5 != 0) goto L_0x0177
            r11 = 0
        L_0x0177:
            X.6Fj r11 = r9.AJW(r11)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A00(r11, r10)
            X.5RD r14 = X.C51969G9p.A0Z(r4, r6)
            int r13 = X.C287425a7.A00(r4)
            X.5RM r12 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r4, r10)
            r10 = r19
            X.C51973G9u.A0z(r4, r1, r10)
            r10 = r18
            X.C287595aO.A00(r4, r14, r10)
            r10 = r17
            boolean r10 = X.C51965G9l.A1Y(r4, r1, r12, r10)
            if (r10 != 0) goto L_0x01a7
            boolean r10 = X.C51972G9s.A1Q(r4, r13)
            if (r10 != 0) goto L_0x01aa
        L_0x01a7:
            X.C51971G9r.A13(r4, r8, r13)
        L_0x01aa:
            r10 = r16
            X.C287595aO.A00(r4, r11, r10)
            X.6Et r11 = X.C304676Et.A00
            X.IPZ r10 = X.IPZ.A00
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0290
            r10 = 800469363(0x2fb63173, float:3.3140743E-10)
            r4.ExS(r10)
            X.5Zu r10 = X.C287275Zs.A01
            X.5Zp r12 = X.C287215Zl.A05
            X.5RD r15 = X.C287395a4.A02(r10, r4, r12, r6)
            int r14 = X.C287425a7.A00(r4)
            X.5RM r13 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r4, r7)
            r10 = r19
            X.C51973G9u.A0z(r4, r1, r10)
            r10 = r18
            X.C287595aO.A00(r4, r15, r10)
            r10 = r17
            boolean r10 = X.C51965G9l.A1Y(r4, r1, r13, r10)
            if (r10 != 0) goto L_0x01eb
            boolean r10 = X.C51972G9s.A1Q(r4, r14)
            if (r10 != 0) goto L_0x01ee
        L_0x01eb:
            X.C51971G9r.A13(r4, r8, r14)
        L_0x01ee:
            r8 = r16
            X.C287595aO.A00(r4, r11, r8)
            X.6FX r10 = X.AnonymousClass6FX.A00
            r8 = -1380108449(0xffffffffadbd375f, float:-2.1511402E-11)
            r4.ExS(r8)
            if (r34 != 0) goto L_0x021a
            if (r5 == 0) goto L_0x021a
            X.6Fk r8 = r9.BFs()
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A00(r8, r7)
            r8 = 1113587712(0x42600000, float:56.0)
            androidx.compose.ui.Modifier r8 = X.C287205Zk.A0C(r11, r8)
            androidx.compose.ui.Modifier r11 = r10.AB1(r12, r8)
            int r8 = r0 >> 12
            r8 = r8 & 14
            r8 = r8 | 48
            X.AnonymousClass6G3.A06(r4, r11, r5, r8)
        L_0x021a:
            X.C286565Wx.A0L(r1, r6)
            int r8 = r9.C4p()
            androidx.compose.ui.Modifier r23 = r10.A00(r7)
            int r13 = X.C51965G9l.A01(r0)
            int r11 = r0 >> 3
            int r32 = X.C51974G9v.A00(r11, r13)
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r11
            r32 = r32 | r13
            r24 = r39
            r25 = r38
            r26 = r37
            r27 = r36
            r28 = r35
            r31 = r8
            r33 = r6
            r22 = r4
            A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r11 = -1380078690(0xffffffffadbdab9e, float:-2.1563026E-11)
            r4.ExS(r11)
            if (r34 == 0) goto L_0x026c
            if (r5 == 0) goto L_0x026c
            X.6Fk r11 = r9.BFs()
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A00(r11, r7)
            r7 = 1113587712(0x42600000, float:56.0)
            androidx.compose.ui.Modifier r7 = X.C287205Zk.A0C(r11, r7)
            androidx.compose.ui.Modifier r10 = r10.AB1(r12, r7)
            int r7 = r0 >> 12
            r7 = r7 & 14
            r7 = r7 | 48
            X.AnonymousClass6G3.A06(r4, r10, r5, r7)
        L_0x026c:
            X.C286565Wx.A0L(r1, r6)
            r4.ASN()
        L_0x0272:
            if (r34 == 0) goto L_0x0282
            int r6 = r0 >> 21
            r0 = r6 & 112(0x70, float:1.57E-43)
            r7 = r6 & 896(0x380, float:1.256E-42)
            r7 = r7 | r0
            r6 = r39
            r0 = r38
            A05(r4, r6, r0, r8, r7)
        L_0x0282:
            boolean r0 = X.C51973G9u.A1R(r4, r1)
            if (r0 == 0) goto L_0x00a8
            r0 = -911278837(0xffffffffc9aefd0b, float:-1433505.4)
            X.0fL.A00(r0)
            goto L_0x00a8
        L_0x0290:
            r8 = 802055044(0x2fce6384, float:3.7541892E-10)
            r4.ExS(r8)
            r8 = -1359600858(0xffffffffaef62326, float:-1.11930284E-10)
            r4.ExS(r8)
            if (r5 == 0) goto L_0x02ae
            androidx.compose.ui.Modifier r10 = X.C51966G9m.A0S(r11, r7)
            int r7 = r0 >> 12
            r8 = r7 & 14
            int r7 = r0 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = r8 | r7
            A00(r4, r10, r5, r9, r8)
        L_0x02ae:
            X.C286565Wx.A0L(r1, r6)
            int r8 = r9.C4p()
            int r6 = X.C51965G9l.A01(r0)
            int r7 = r0 >> 3
            int r32 = X.C51974G9v.A00(r7, r6)
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r7
            r32 = r32 | r6
            r33 = 8
            r24 = r39
            r25 = r38
            r26 = r37
            r27 = r36
            r28 = r35
            r31 = r8
            r22 = r4
            r23 = r20
            A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0272
        L_0x02da:
            r1 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0040
            int r1 = X.G9t.A0I(r4, r5)
            r0 = r0 | r1
            goto L_0x0040
        L_0x02e5:
            r1 = r3 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x003a
            r1 = r21
            int r1 = X.G9t.A0H(r4, r1)
            r0 = r0 | r1
            goto L_0x003a
        L_0x02f2:
            r1 = r3 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0034
            int r1 = X.G9t.A0Q(r4, r9)
            r0 = r0 | r1
            goto L_0x0034
        L_0x02fd:
            r1 = r51 & 48
            if (r1 != 0) goto L_0x002e
            r1 = r37
            int r1 = X.G9t.A0F(r4, r1)
            r0 = r0 | r1
            goto L_0x002e
        L_0x030a:
            r0 = r51 & 6
            if (r0 != 0) goto L_0x0318
            r0 = r35
            int r0 = X.G9t.A0O(r4, r0)
            r0 = r0 | r51
            goto L_0x0026
        L_0x0318:
            r0 = r3
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6N.A02(X.5Wy, X.2DO, X.JV7, X.JV7, X.JQC, java.lang.CharSequence, java.lang.CharSequence, java.lang.String, X.0sa, X.0sP, X.0sP, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r20, X.AnonymousClass2DO r21, X.JV7 r22, X.JV7 r23, X.JQC r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, X.C62320sa r28, int r29, int r30) {
        /*
            r8 = r22
            r6 = r27
            r9 = r21
            r5 = r28
            r2 = r24
            r28 = 0
            r0 = -96214132(0xfffffffffa43e38c, float:-2.5427827E35)
            r10 = r20
            r10.ExV(r0)
            r3 = r30
            r0 = r30 & 1
            r7 = r25
            r4 = r29
            if (r0 == 0) goto L_0x013d
            r0 = r29 | 6
        L_0x0020:
            r1 = r30 & 2
            r11 = r26
            if (r1 == 0) goto L_0x0132
            r0 = r0 | 48
        L_0x0028:
            r19 = r30 & 4
            if (r19 == 0) goto L_0x0127
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r18 = r30 & 8
            if (r18 == 0) goto L_0x011c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r17 = r30 & 16
            if (r17 == 0) goto L_0x0111
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r16 = r30 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r16 != 0) goto L_0x0048
            r1 = r1 & r29
            if (r1 != 0) goto L_0x0049
            int r1 = X.G9t.A0T(r10, r6)
        L_0x0048:
            r0 = r0 | r1
        L_0x0049:
            r15 = r30 & 64
            r1 = 1572864(0x180000, float:2.204052E-39)
            if (r15 != 0) goto L_0x0057
            r1 = r29 & r1
            if (r1 != 0) goto L_0x0058
            int r1 = X.G9t.A0U(r10, r8)
        L_0x0057:
            r0 = r0 | r1
        L_0x0058:
            r12 = r3 & 128(0x80, float:1.794E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r13 = r23
            if (r12 != 0) goto L_0x0068
            r1 = r29 & r1
            if (r1 != 0) goto L_0x0069
            int r1 = X.G9t.A0V(r10, r13)
        L_0x0068:
            r0 = r0 | r1
        L_0x0069:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r14 = r0 & r1
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r14 != r1) goto L_0x009f
            boolean r1 = r10.Bwn()
            if (r1 == 0) goto L_0x009f
            r10.Evl()
            r19 = r13
        L_0x007e:
            X.5Xd r1 = r10.ASQ()
            if (r1 == 0) goto L_0x009e
            X.JB4 r0 = new X.JB4
            r12 = r0
            r13 = r9
            r14 = r8
            r15 = r19
            r16 = r2
            r17 = r7
            r18 = r11
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1.A06 = r0
        L_0x009e:
            return
        L_0x009f:
            if (r19 == 0) goto L_0x00a3
            X.IPa r2 = X.C57111IPa.A00
        L_0x00a3:
            r19 = 0
            if (r18 == 0) goto L_0x00a9
            r5 = r19
        L_0x00a9:
            if (r17 == 0) goto L_0x00ad
            r9 = r19
        L_0x00ad:
            if (r16 == 0) goto L_0x00b1
            r6 = r19
        L_0x00b1:
            if (r15 == 0) goto L_0x00b5
            r8 = r19
        L_0x00b5:
            if (r12 != 0) goto L_0x00b9
            r19 = r13
        L_0x00b9:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00c7
            r12 = -879043837(0xffffffffcb9adb03, float:-2.0297222E7)
            java.lang.String r1 = "com.instagram.compose.igds.components.megaphone.IgdsMegaphone (IgdsMegaphone.kt:106)"
            X.0fL.A01(r12, r1)
        L_0x00c7:
            r25 = 0
            r12 = 12779520(0xc30000, float:1.7907922E-38)
            r1 = r0 & 14
            r12 = r12 | r1
            r1 = r0 & 112(0x70, float:1.57E-43)
            r12 = r12 | r1
            int r27 = X.C51969G9p.A04(r0, r12)
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r27 = r27 | r1
            r12 = 3670016(0x380000, float:5.142788E-39)
            int r1 = r0 << 3
            r12 = r12 & r1
            r27 = r27 | r12
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            int r1 = r0 << 6
            r12 = r12 & r1
            r27 = r27 | r12
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r0
            r27 = r27 | r1
            r23 = r7
            r24 = r5
            r26 = r25
            r18 = r8
            r20 = r2
            r21 = r11
            r22 = r6
            r16 = r10
            r17 = r9
            A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007e
            r0 = -573644408(0xffffffffddcee188, float:-1.86341822E18)
            X.0fL.A00(r0)
            goto L_0x007e
        L_0x0111:
            r1 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x003a
            int r1 = X.G9t.A0I(r10, r9)
            r0 = r0 | r1
            goto L_0x003a
        L_0x011c:
            r1 = r4 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0034
            int r1 = X.G9t.A0H(r10, r5)
            r0 = r0 | r1
            goto L_0x0034
        L_0x0127:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002e
            int r1 = X.G9t.A0Q(r10, r2)
            r0 = r0 | r1
            goto L_0x002e
        L_0x0132:
            r1 = r29 & 48
            if (r1 != 0) goto L_0x0028
            int r1 = X.G9t.A0P(r10, r11)
            r0 = r0 | r1
            goto L_0x0028
        L_0x013d:
            r0 = r29 & 6
            if (r0 != 0) goto L_0x0149
            int r0 = X.G9t.A0O(r10, r7)
            r0 = r0 | r29
            goto L_0x0020
        L_0x0149:
            r0 = r4
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6N.A03(X.5Wy, X.2DO, X.JV7, X.JV7, X.JQC, java.lang.String, java.lang.String, java.lang.String, X.0sa, int, int):void");
    }

    public static final void A00(C286575Wy r3, Modifier modifier, AnonymousClass2DO r5, JQC jqc, int i) {
        int i2;
        r3.ExV(573433969);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r3, r5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r3, jqc);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r3, modifier);
        }
        if ((i2 & 147) != 146 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-669783134, "com.instagram.compose.igds.components.megaphone.Illustration (IgdsMegaphone.kt:232)");
            }
            AnonymousClass6G3.A06(r3, C287205Zk.A0C(C287195Zj.A00(jqc.BFs(), modifier), 56.0f), r5, (i2 & 14) | 48);
            if (0fL.A02()) {
                0fL.A00(-553316137);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(jqc, r5, modifier, i, 18);
        }
    }

    public static final void A04(C286575Wy r17, AnonymousClass5Z4 r18, CharSequence charSequence, 0sP r20, int i) {
        int i2;
        boolean z;
        C286575Wy r6 = r17;
        r6.ExV(516974592);
        int i3 = i;
        CharSequence charSequence2 = charSequence;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r6, charSequence2) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass5Z4 r9 = r18;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r6, r9);
        }
        0sP r3 = r20;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r6, r3);
        }
        if ((i2 & 147) != 146 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(328619140, "com.instagram.compose.igds.components.megaphone.BodyText (IgdsMegaphone.kt:283)");
            }
            Modifier A0V = C51966G9m.A0V(C51967G9n.A0D(Modifier.A00, 4.0f));
            if (charSequence2 instanceof C286025Tq) {
                r6.ExS(1375848504);
                if (r20 != null) {
                    r6.ExS(1375878574);
                    z = false;
                    C286575Wy r11 = r6;
                    Modifier modifier = A0V;
                    C286025Tq r13 = (C286025Tq) charSequence2;
                    AnonymousClass5Z4 r14 = r9;
                    0sP r15 = r3;
                    IgClickableTextKt.A02(r11, modifier, r13, r14, r15, 0, 48, (i2 & 112) | ((i2 << 6) & 57344), 112632, C51966G9m.A0M(r6));
                } else {
                    r6.ExS(1376096318);
                    z = false;
                    AnonymousClass5ZZ.A00(r6, A0V, (C286025Tq) charSequence2, r9, 0, 0, 0, 48, (i2 << 6) & 7168, 24568, C51966G9m.A0M(r6));
                }
                C51965G9l.A1X(r6, z);
            } else {
                r6.ExS(1376271468);
                z = false;
                C286575Wy r112 = r6;
                Modifier modifier2 = A0V;
                AnonymousClass5Z4 r132 = r9;
                AnonymousClass5ZZ.A0C(r112, modifier2, r132, charSequence2.toString(), 0, 0, 48, (i2 << 9) & 57344, 16376, C51966G9m.A0M(r6));
            }
            if (C51970G9q.A1a(r6, z)) {
                0fL.A00(1233648584);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(charSequence2, r3, r9, i3, 17);
        }
    }

    public static final void A05(C286575Wy r15, JV7 jv7, JV7 jv72, int i, int i2) {
        int i3;
        C287265Zr r10;
        C286575Wy r14 = r15;
        r15.ExV(-1223155139);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r15, i5) | i2;
        } else {
            i3 = i4;
        }
        JV7 jv73 = jv7;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r15, jv73);
        }
        JV7 jv74 = jv72;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r15, jv74);
        }
        if ((i3 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1767912939, "com.instagram.compose.igds.components.megaphone.BottomButtons (IgdsMegaphone.kt:318)");
            }
            if (jv7 != null || i5 == 3) {
                r10 = C287215Zl.A00;
            } else {
                r10 = C287215Zl.A02;
            }
            C285245Qk r5 = Modifier.A00;
            FillElement fillElement = C287205Zk.A02;
            Modifier Ezh = r5.Ezh(fillElement);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r15, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r15);
            C286565Wx r3 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r15, Ezh);
            C51973G9u.A0y(r15, r3);
            C51971G9r.A12(r15, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A01);
            C304676Et r2 = C304676Et.A00;
            r15.ExS(-1420760741);
            if (jv7 != null) {
                C62320sa r11 = (C62320sa) jv73.A00;
                String str = jv73.A02;
                C52399GQy A0m = C51965G9l.A0m(r15);
                float f = 12.0f;
                if (C61670oa.A0C()) {
                    f = 16.0f;
                }
                AnonymousClass6CE.A06(r14, C51967G9n.A0D(r5, f).Ezh(fillElement), A0m, str, r11, 0);
            }
            C286565Wx.A0L(r3, false);
            r14.ExS(-1420748281);
            if (jv74 != null) {
                String str2 = jv74.A02;
                AnonymousClass6CE.A06(r14, r2.AB0(r10, C51967G9n.A0D(r5, 12.0f)), AnonymousClass6CA.A00(r14), str2, (C62320sa) jv74.A00, 0);
            }
            if (C51971G9r.A1S(r14, r3, false)) {
                0fL.A00(82799891);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(jv73, jv74, i5, i4, 23);
        }
    }
}
