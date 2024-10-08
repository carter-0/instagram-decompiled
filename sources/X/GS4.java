package X;

import androidx.compose.ui.Modifier;

public abstract class GS4 {
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r48, X.C46519DgM r49, X.MVE r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, X.C62320sa r58, int r59, int r60, boolean r61, boolean r62, boolean r63, boolean r64) {
        /*
            r4 = 0
            r46 = r51
            r45 = r52
            r1 = r46
            r0 = r45
            X.AnonymousClass7TF.A1H(r1, r0)
            r0 = 10
            r7 = r57
            X.0qQ.A0B(r7, r0)
            r2 = 11
            r42 = r58
            r47 = r49
            r1 = r47
            r0 = r42
            X.DbW.A1P(r1, r2, r0)
            r0 = 13
            r8 = r50
            X.0qQ.A0B(r8, r0)
            r0 = -2025289194(0xffffffff87488a16, float:-1.5086908E-34)
            r9 = r48
            r9.ExV(r0)
            r6 = r59
            r0 = r59 & 6
            r1 = 2
            if (r0 != 0) goto L_0x025c
            r0 = r46
            int r17 = X.G9t.A0O(r9, r0)
            r17 = r17 | r59
        L_0x003e:
            r0 = r59 & 48
            r10 = 32
            if (r0 != 0) goto L_0x004c
            r0 = r45
            int r0 = X.G9t.A0P(r9, r0)
            r17 = r17 | r0
        L_0x004c:
            r0 = r6 & 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            r44 = r53
            if (r0 != 0) goto L_0x005c
            r0 = r44
            int r0 = X.G9t.A0Q(r9, r0)
            r17 = r17 | r0
        L_0x005c:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            r2 = 1024(0x400, float:1.435E-42)
            r43 = r54
            if (r0 != 0) goto L_0x006c
            r0 = r43
            int r0 = X.G9t.A0R(r9, r0)
            r17 = r17 | r0
        L_0x006c:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            r20 = r55
            if (r0 != 0) goto L_0x007a
            r0 = r20
            int r0 = X.G9t.A0S(r9, r0)
            r17 = r17 | r0
        L_0x007a:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r59
            r19 = r56
            if (r0 != 0) goto L_0x008a
            r0 = r19
            int r0 = X.G9t.A0T(r9, r0)
            r17 = r17 | r0
        L_0x008a:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r59
            r41 = r61
            if (r0 != 0) goto L_0x009a
            r0 = r41
            int r0 = X.G9t.A0e(r9, r0)
            r17 = r17 | r0
        L_0x009a:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r59
            r18 = r62
            if (r0 != 0) goto L_0x00aa
            r0 = r18
            int r0 = X.G9t.A0f(r9, r0)
            r17 = r17 | r0
        L_0x00aa:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r59
            r40 = r63
            if (r0 != 0) goto L_0x00ba
            r0 = r40
            int r0 = X.G9t.A0g(r9, r0)
            r17 = r17 | r0
        L_0x00ba:
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r59 & r0
            r39 = r64
            if (r0 != 0) goto L_0x00ca
            r0 = r39
            int r0 = X.G9t.A0h(r9, r0)
            r17 = r17 | r0
        L_0x00ca:
            r5 = r60
            r0 = r60 & 6
            if (r0 != 0) goto L_0x0259
            boolean r0 = r9.AGu(r7)
            if (r0 == 0) goto L_0x00d7
            r1 = 4
        L_0x00d7:
            r1 = r60 | r1
        L_0x00d9:
            r0 = r60 & 48
            if (r0 != 0) goto L_0x00e8
            r0 = r47
            boolean r0 = r9.AGu(r0)
            if (r0 != 0) goto L_0x00e7
            r10 = 16
        L_0x00e7:
            r1 = r1 | r10
        L_0x00e8:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00f7
            r0 = r42
            boolean r0 = r9.AGw(r0)
            if (r0 != 0) goto L_0x00f6
            r3 = 128(0x80, float:1.794E-43)
        L_0x00f6:
            r1 = r1 | r3
        L_0x00f7:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0104
            boolean r0 = r9.AGu(r8)
            if (r0 == 0) goto L_0x0103
            r2 = 2048(0x800, float:2.87E-42)
        L_0x0103:
            r1 = r1 | r2
        L_0x0104:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r17 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r0) goto L_0x014d
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r2 != r0) goto L_0x014d
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x014d
            r9.Evl()
        L_0x011d:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x014c
            X.GSA r0 = new X.GSA
            r21 = r0
            r22 = r47
            r23 = r8
            r24 = r46
            r25 = r45
            r26 = r44
            r27 = r43
            r28 = r20
            r29 = r19
            r30 = r7
            r31 = r42
            r32 = r6
            r33 = r5
            r34 = r41
            r35 = r18
            r36 = r40
            r37 = r39
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1.A06 = r0
        L_0x014c:
            return
        L_0x014d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x015b
            r2 = 1123981067(0x42fe970b, float:127.295006)
            java.lang.String r0 = "com.instagram.newsfeed.compose.ui.SuggestedUserRow (SuggestedUserRow.kt:50)"
            X.0fL.A01(r2, r0)
        L_0x015b:
            com.instagram.common.typedurl.SimpleImageUrl r11 = X.DbS.A0V(r46)
            if (r55 == 0) goto L_0x0256
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r20)
        L_0x0165:
            if (r56 == 0) goto L_0x0253
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r19)
        L_0x016b:
            if (r62 == 0) goto L_0x024f
            if (r2 != 0) goto L_0x023f
            X.GSf r3 = X.C52427GSf.A00
        L_0x0171:
            X.JRj r3 = (X.C59641JRj) r3
        L_0x0173:
            X.GS7 r13 = X.GS7.A03
            X.GS5 r0 = X.GS5.A00
            float r12 = r0.AeO()
            float r2 = r0.AeL()
            float r0 = r0.AeM()
            X.GS6 r10 = new X.GS6
            r10.<init>(r12, r12, r2, r0)
            r15 = 0
            X.6Fk r2 = r13.A01
            r0 = 1117782016(0x42a00000, float:80.0)
            X.0qQ.A0B(r2, r4)
            X.GS7 r14 = new X.GS7
            r14.<init>(r2, r10, r0)
            r16 = 0
            X.2DN r24 = X.1zC.A00(r9, r11)
            r0 = 1541997578(0x5be9040a, float:1.31176221E17)
            r9.ExS(r0)
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = 2048(0x800, float:2.87E-42)
            boolean r10 = X.AnonymousClass7TF.A1S(r2, r1)
            java.lang.Object r0 = r9.ECw()
            if (r10 != 0) goto L_0x01b3
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r0 != r10) goto L_0x01b8
        L_0x01b3:
            r0 = 7
            X.FyD r0 = X.C51969G9p.A0y(r9, r8, r0)
        L_0x01b8:
            X.0Ya r0 = (X.C59520Ya) r0
            X.5Wx r10 = X.C51965G9l.A0H(r9, r4)
            X.0sa r0 = (X.C62320sa) r0
            r12 = -834734347(0xffffffffce3ef6f5, float:-8.009639E8)
            r26 = 3
            X.JGv r11 = new X.JGv
            r25 = r11
            r27 = r42
            r28 = r8
            r29 = r47
            r30 = r41
            r25.<init>(r26, r27, r28, r29, r30)
            X.5PJ r33 = X.AnonymousClass5PI.A01(r9, r11, r12)
            r13 = r17 & 112(0x70, float:1.57E-43)
            r12 = 57344(0xe000, float:8.0356E-41)
            int r11 = r17 << 6
            r12 = r12 & r11
            int r34 = X.C51969G9p.A05(r13, r12, r11)
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            int r11 = r17 >> 3
            r12 = r12 & r11
            r34 = r34 | r12
            r12 = 1879048192(0x70000000, float:1.58456325E29)
            int r11 = r17 << 3
            r12 = r12 & r11
            r34 = r34 | r12
            r35 = 196608(0x30000, float:2.75506E-40)
            r36 = 17612(0x44cc, float:2.468E-41)
            r23 = r15
            r25 = r15
            r28 = r45
            r29 = r44
            r30 = r43
            r31 = r0
            r32 = r15
            r37 = r4
            r38 = r4
            r21 = r9
            r22 = r15
            r26 = r3
            r27 = r14
            X.GS8.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0 = 1542041972(0x5be9b174, float:1.31557563E17)
            r9.ExS(r0)
            if (r2 != r1) goto L_0x021d
            r16 = 1
        L_0x021d:
            java.lang.Object r1 = r9.ECw()
            if (r16 != 0) goto L_0x0227
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0231
        L_0x0227:
            r0 = 43
            X.MFy r1 = new X.MFy
            r1.<init>(r8, r15, r0)
            r9.FLL(r1)
        L_0x0231:
            boolean r0 = X.C51972G9s.A1S(r9, r10, r1, r7)
            if (r0 == 0) goto L_0x011d
            r0 = -1244839349(0xffffffffb5cd424b, float:-1.5292984E-6)
            X.0fL.A00(r0)
            goto L_0x011d
        L_0x023f:
            if (r0 != 0) goto L_0x0248
            X.GSX r3 = new X.GSX
            r3.<init>(r2)
            goto L_0x0173
        L_0x0248:
            X.GSI r3 = new X.GSI
            r3.<init>(r2, r0)
            goto L_0x0173
        L_0x024f:
            X.GSg r3 = X.C52428GSg.A00
            goto L_0x0171
        L_0x0253:
            r0 = 0
            goto L_0x016b
        L_0x0256:
            r2 = 0
            goto L_0x0165
        L_0x0259:
            r1 = r5
            goto L_0x00d9
        L_0x025c:
            r17 = r6
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GS4.A01(X.5Wy, X.DgM, X.MVE, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0sa, int, int, boolean, boolean, boolean, boolean):void");
    }

    public static final void A00(C286575Wy r11, int i) {
        C286575Wy r2 = r11;
        r11.ExV(-983071018);
        if (i != 0 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-479742499, "com.instagram.newsfeed.compose.ui.SuggestedUsersHeaderRow (SuggestedUserRow.kt:116)");
            }
            AnonymousClass5ZZ.A0D(r2, C287195Zj.A08(C287205Zk.A09(Modifier.A00, 48.0f), 14.0f), C51965G9l.A0S(r11), C288035bG.A00(r11, 2131974681), 1, 48, 390, 11256, C51966G9m.A0H(r11));
            if (0fL.A02()) {
                0fL.A00(-583243886);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 49);
        }
    }
}
