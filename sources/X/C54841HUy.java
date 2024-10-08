package X;

/* renamed from: X.HUy  reason: case insensitive filesystem */
public abstract class C54841HUy {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r40, androidx.compose.ui.Modifier r41, X.HM0 r42, X.C299585vR r43, X.C304186Cm r44, java.lang.String r45, X.C62320sa r46, X.C62320sa r47, X.C62320sa r48, X.0sP r49, X.0sP r50, X.0sL r51, X.AnonymousClass62P r52, int r53, int r54, int r55, int r56, int r57, boolean r58) {
        /*
            r39 = r46
            r18 = r41
            r22 = r54
            r31 = r47
            r30 = r48
            r16 = r42
            r17 = r43
            r33 = r50
            r35 = r52
            r23 = r53
            boolean r21 = X.DbW.A1X(r39)
            r0 = -225775641(0xfffffffff28aefe7, float:-5.5038663E30)
            r8 = r40
            r8.ExV(r0)
            r6 = r57
            r0 = r57 & 1
            r40 = r45
            r7 = r55
            if (r0 == 0) goto L_0x024c
            r1 = r55 | 6
        L_0x002c:
            r0 = r57 & 2
            if (r0 == 0) goto L_0x023f
            r1 = r1 | 48
        L_0x0032:
            r0 = r57 & 4
            r4 = 128(0x80, float:1.794E-43)
            r41 = r44
            if (r0 == 0) goto L_0x0232
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x003c:
            r0 = r57 & 8
            r3 = 2048(0x800, float:2.87E-42)
            r38 = r58
            if (r0 == 0) goto L_0x0225
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0046:
            r0 = r57 & 16
            r20 = 16384(0x4000, float:2.2959E-41)
            r32 = r49
            if (r0 == 0) goto L_0x0218
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0050:
            r2 = r57 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r34 = r51
            if (r2 != 0) goto L_0x0062
            r0 = r55 & r0
            if (r0 != 0) goto L_0x0063
            r0 = r34
            int r0 = X.G9t.A0J(r8, r0)
        L_0x0062:
            r1 = r1 | r0
        L_0x0063:
            r19 = r57 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r19 != 0) goto L_0x0073
            r0 = r55 & r0
            if (r0 != 0) goto L_0x0074
            r0 = r18
            int r0 = X.G9t.A0U(r8, r0)
        L_0x0073:
            r1 = r1 | r0
        L_0x0074:
            r13 = r6 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x0084
            r0 = r55 & r0
            if (r0 != 0) goto L_0x0085
            r0 = r31
            int r0 = X.G9t.A0L(r8, r0)
        L_0x0084:
            r1 = r1 | r0
        L_0x0085:
            r12 = r6 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r12 != 0) goto L_0x0095
            r0 = r55 & r0
            if (r0 != 0) goto L_0x0096
            r0 = r30
            int r0 = X.G9t.A0M(r8, r0)
        L_0x0095:
            r1 = r1 | r0
        L_0x0096:
            r11 = r6 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 != 0) goto L_0x00a6
            r0 = r55 & r0
            if (r0 != 0) goto L_0x00a7
            r0 = r17
            int r0 = X.G9t.A0X(r8, r0)
        L_0x00a6:
            r1 = r1 | r0
        L_0x00a7:
            r14 = r6 & 1024(0x400, float:1.435E-42)
            r10 = r56
            if (r14 == 0) goto L_0x0207
            r9 = r56 | 6
        L_0x00af:
            r5 = r6 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x01fa
            r9 = r9 | 48
        L_0x00b5:
            r15 = r6 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x01e9
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x00bb:
            r4 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x01d8
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x00c1:
            r3 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x01c6
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x00c7:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r1 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r0) goto L_0x0113
            r0 = r9 & 9363(0x2493, float:1.312E-41)
            r2 = r0
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r0) goto L_0x0113
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x0113
            r8.Evl()
        L_0x00e1:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x0112
            X.JDC r0 = new X.JDC
            r24 = r41
            r25 = r40
            r26 = r39
            r27 = r31
            r28 = r30
            r29 = r32
            r30 = r33
            r31 = r34
            r32 = r35
            r33 = r23
            r34 = r22
            r35 = r7
            r36 = r10
            r37 = r6
            r20 = r0
            r21 = r18
            r22 = r16
            r23 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1.A06 = r0
        L_0x0112:
            return
        L_0x0113:
            if (r19 == 0) goto L_0x0117
            X.5Qk r18 = androidx.compose.ui.Modifier.A00
        L_0x0117:
            r2 = 0
            if (r13 == 0) goto L_0x011c
            r31 = r2
        L_0x011c:
            if (r12 == 0) goto L_0x0120
            r30 = r2
        L_0x0120:
            if (r11 == 0) goto L_0x0124
            X.5vR r17 = X.C299585vR.None
        L_0x0124:
            if (r14 == 0) goto L_0x0128
            r33 = r2
        L_0x0128:
            if (r5 == 0) goto L_0x012c
            X.HM0 r16 = X.HM0.A02
        L_0x012c:
            if (r15 == 0) goto L_0x0130
            r35 = r2
        L_0x0130:
            if (r4 == 0) goto L_0x0135
            r23 = 2147483647(0x7fffffff, float:NaN)
        L_0x0135:
            if (r3 == 0) goto L_0x0139
            r22 = 1
        L_0x0139:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0147
            r3 = -1066749470(0xffffffffc06ab1e2, float:-3.667107)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.PostKaraokeCaptions (PostKaraokeCaptions.kt:45)"
            X.0fL.A01(r3, r0)
        L_0x0147:
            r0 = 7956053(0x796655, float:1.1148805E-38)
            java.lang.Object r5 = X.C51967G9n.A0m(r8, r0)
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r5 != r12) goto L_0x0156
            androidx.compose.runtime.ParcelableSnapshotMutableState r5 = X.G9t.A0o(r8, r2)
        L_0x0156:
            X.5Oz r5 = (X.C284945Oz) r5
            r0 = r21
            X.5Wx r11 = X.C51965G9l.A0H(r8, r0)
            r0 = 7958934(0x797196, float:1.1152842E-38)
            boolean r4 = X.C51973G9u.A1N(r8, r0, r1)
            boolean r0 = X.C51973G9u.A1I(r9)
            r4 = r4 | r0
            java.lang.Object r3 = r8.ECw()
            if (r4 != 0) goto L_0x0172
            if (r3 != r12) goto L_0x017c
        L_0x0172:
            r4 = 14
            r3 = r35
            r0 = r40
            X.Phi r3 = X.C51970G9q.A0y(r8, r3, r0, r4)
        L_0x017c:
            r0 = r21
            X.0sa r0 = X.C51965G9l.A0y(r11, r3, r0)
            X.5TX r26 = X.C51965G9l.A0I(r2, r0)
            X.JHd r2 = new X.JHd
            r24 = r2
            r25 = r5
            r27 = r16
            r28 = r17
            r29 = r41
            r36 = r23
            r37 = r22
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r0 = -1439587007(0xffffffffaa31a541, float:-1.5778092E-13)
            X.5PJ r27 = X.AnonymousClass5PI.A01(r8, r2, r0)
            int r0 = r1 >> 3
            r0 = r0 & 14
            r2 = r0 | 384(0x180, float:5.38E-43)
            int r0 = r1 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r0
            r24 = r8
            r25 = r18
            r26 = r39
            r28 = r2
            r29 = r21
            X.C54823HUe.A00(r24, r25, r26, r27, r28, r29)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00e1
            r0 = 755349102(0x2d05b66e, float:7.600682E-12)
            X.0fL.A00(r0)
            goto L_0x00e1
        L_0x01c6:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00c7
            r0 = r22
            boolean r0 = r8.AGs(r0)
            if (r0 != 0) goto L_0x01d4
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x01d4:
            r9 = r9 | r20
            goto L_0x00c7
        L_0x01d8:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00c1
            r0 = r23
            boolean r0 = r8.AGs(r0)
            if (r0 != 0) goto L_0x01e6
            r3 = 1024(0x400, float:1.435E-42)
        L_0x01e6:
            r9 = r9 | r3
            goto L_0x00c1
        L_0x01e9:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00bb
            r0 = r35
            boolean r0 = r8.AGu(r0)
            if (r0 == 0) goto L_0x01f7
            r4 = 256(0x100, float:3.59E-43)
        L_0x01f7:
            r9 = r9 | r4
            goto L_0x00bb
        L_0x01fa:
            r0 = r56 & 48
            if (r0 != 0) goto L_0x00b5
            r0 = r16
            int r0 = X.G9t.A0P(r8, r0)
            r9 = r9 | r0
            goto L_0x00b5
        L_0x0207:
            r0 = r56 & 6
            if (r0 != 0) goto L_0x0215
            r0 = r33
            int r0 = X.C41848B3p.A01(r8, r0)
            r9 = r56 | r0
            goto L_0x00af
        L_0x0215:
            r9 = r10
            goto L_0x00af
        L_0x0218:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0050
            r0 = r32
            int r0 = X.G9t.A0I(r8, r0)
            r1 = r1 | r0
            goto L_0x0050
        L_0x0225:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0046
            r0 = r38
            int r0 = X.G9t.A0b(r8, r0)
            r1 = r1 | r0
            goto L_0x0046
        L_0x0232:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003c
            r0 = r41
            int r0 = X.G9t.A0Q(r8, r0)
            r1 = r1 | r0
            goto L_0x003c
        L_0x023f:
            r0 = r55 & 48
            if (r0 != 0) goto L_0x0032
            r0 = r39
            int r0 = X.G9t.A0F(r8, r0)
            r1 = r1 | r0
            goto L_0x0032
        L_0x024c:
            r0 = r55 & 6
            if (r0 != 0) goto L_0x025a
            r0 = r40
            int r1 = X.G9t.A0O(r8, r0)
            r1 = r1 | r55
            goto L_0x002c
        L_0x025a:
            r1 = r7
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54841HUy.A00(X.5Wy, androidx.compose.ui.Modifier, X.HM0, X.5vR, X.6Cm, java.lang.String, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sL, X.62P, int, int, int, int, int, boolean):void");
    }
}
