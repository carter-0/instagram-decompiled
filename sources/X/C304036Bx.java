package X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.6Bx  reason: invalid class name and case insensitive filesystem */
public abstract class C304036Bx {
    public static final void A01(C286575Wy r21, AnonymousClass5vX r22, C62320sa r23, C62320sa r24, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        C286575Wy r9 = r21;
        r9.ExV(167800655);
        int i4 = i2;
        AnonymousClass5vX r3 = r22;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r9.AGu(r3)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i5;
        }
        C62320sa r4 = r23;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = 16;
            if (r9.AGw(r4)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        C62320sa r2 = r24;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            int i8 = 128;
            if (r9.AGw(r2)) {
                i8 = 256;
            }
            i3 |= i8;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            int i10 = 1024;
            if (r9.AGv(z2)) {
                i10 = C249703kE.FLAG_MOVED;
            }
            i3 |= i10;
        }
        if ((i3 & 1171) != 1170 || !r9.Bwn()) {
            if (i9 != 0) {
                z2 = true;
            }
            if (0fL.A02()) {
                0fL.A01(51024845, "com.instagram.feed.tifu.ui.Header (TifuUnit.kt:149)");
            }
            AnonymousClass6C6.A00(r9, C287205Zk.A02, AnonymousClass6C4.Up, AnonymousClass6C5.A00, AnonymousClass5PI.A01(r9, new C377449Lw(13, r2, r3), -172398579), (0sL) null, AnonymousClass5PI.A01(r9, new AnonymousClass9MO(0, r2, r4, r3, z2), 689435023), 0, 1772982, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, false, false);
            if (0fL.A02()) {
                0fL.A00(233068016);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9E(r3, r4, r2, i5, i4, 6, z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r44, X.C299665vd r45, X.C299635va r46, X.AnonymousClass5vX r47, X.C62320sa r48, X.C62320sa r49, X.C62320sa r50, X.C62320sa r51, X.0sP r52, X.0sP r53, X.0sP r54, X.0sP r55, X.0sL r56, int r57, int r58, int r59, boolean r60, boolean r61, boolean r62, boolean r63) {
        /*
            r12 = r60
            r10 = r61
            r9 = r63
            r8 = 0
            r6 = r47
            X.0qQ.A0B(r6, r8)
            r2 = 1
            r42 = r46
            r0 = r42
            X.0qQ.A0B(r0, r2)
            r1 = 2
            r43 = r45
            r0 = r43
            X.0qQ.A0B(r0, r1)
            r1 = 3
            r41 = r48
            r0 = r41
            X.0qQ.A0B(r0, r1)
            r1 = 4
            r40 = r49
            r0 = r40
            X.0qQ.A0B(r0, r1)
            r1 = 5
            r23 = r52
            r0 = r23
            X.0qQ.A0B(r0, r1)
            r1 = 6
            r39 = r50
            r0 = r39
            X.0qQ.A0B(r0, r1)
            r1 = 7
            r24 = r53
            r0 = r24
            X.0qQ.A0B(r0, r1)
            r1 = 8
            r25 = r54
            r0 = r25
            X.0qQ.A0B(r0, r1)
            r0 = 9
            r14 = r56
            X.0qQ.A0B(r14, r0)
            r1 = 10
            r22 = r51
            r0 = r22
            X.0qQ.A0B(r0, r1)
            r1 = 11
            r26 = r55
            r0 = r26
            X.0qQ.A0B(r0, r1)
            r0 = -553511140(0xffffffffdf02171c, float:-9.373992E18)
            r7 = r44
            r7.ExV(r0)
            r3 = r59
            r0 = r59 & 1
            r11 = 4
            r5 = r57
            if (r0 == 0) goto L_0x02c3
            r1 = r57 | 6
        L_0x0079:
            r0 = r59 & 2
            r13 = 32
            if (r0 == 0) goto L_0x02b0
            r1 = r1 | 48
        L_0x0081:
            r0 = r59 & 4
            r15 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x029d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0089:
            r0 = r59 & 8
            r19 = 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x028a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0091:
            r0 = r59 & 16
            r16 = 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0277
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0099:
            r0 = r59 & 32
            r18 = 131072(0x20000, float:1.83671E-40)
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x0264
            r1 = r1 | r17
        L_0x00a3:
            r4 = r59 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r4 != 0) goto L_0x00b9
            r0 = r57 & r0
            if (r0 != 0) goto L_0x00ba
            r0 = r39
            boolean r4 = r7.AGw(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r4 == 0) goto L_0x00b9
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x00b9:
            r1 = r1 | r0
        L_0x00ba:
            r4 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 != 0) goto L_0x00d0
            r0 = r57 & r0
            if (r0 != 0) goto L_0x00d1
            r0 = r24
            boolean r4 = r7.AGw(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r4 == 0) goto L_0x00d0
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x00d0:
            r1 = r1 | r0
        L_0x00d1:
            r0 = r3 & 256(0x100, float:3.59E-43)
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 != 0) goto L_0x00e7
            r4 = r4 & r57
            if (r4 != 0) goto L_0x00e8
            r0 = r25
            boolean r0 = r7.AGw(r0)
            r4 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00e7
            r4 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00e7:
            r1 = r1 | r4
        L_0x00e8:
            r0 = r3 & 512(0x200, float:7.175E-43)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 != 0) goto L_0x00fc
            r4 = r4 & r57
            if (r4 != 0) goto L_0x00fd
            boolean r0 = r7.AGw(r14)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x00fc
            r4 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00fc:
            r1 = r1 | r4
        L_0x00fd:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            r4 = r58
            if (r0 == 0) goto L_0x0250
            r11 = r58 | 6
        L_0x0105:
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x023f
            r11 = r11 | 48
        L_0x010b:
            r13 = r3 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0230
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x0111:
            r15 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0220
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x0117:
            r0 = r3 & 16384(0x4000, float:2.2959E-41)
            r29 = r62
            if (r0 == 0) goto L_0x020e
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x011f:
            r0 = 32768(0x8000, float:4.5918E-41)
            r16 = r59 & r0
            if (r16 == 0) goto L_0x01fe
            r11 = r11 | r17
        L_0x0128:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r1 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x0179
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r11
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x0179
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0179
            r7.Evl()
        L_0x0143:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x0178
            X.JDX r0 = new X.JDX
            r15 = r22
            r16 = r23
            r17 = r24
            r18 = r25
            r19 = r26
            r20 = r14
            r21 = r5
            r22 = r4
            r23 = r3
            r24 = r2
            r25 = r12
            r26 = r10
            r27 = r29
            r28 = r9
            r8 = r0
            r9 = r43
            r10 = r42
            r11 = r6
            r12 = r41
            r13 = r40
            r14 = r39
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A06 = r0
        L_0x0178:
            return
        L_0x0179:
            if (r13 == 0) goto L_0x017c
            r12 = 1
        L_0x017c:
            if (r15 == 0) goto L_0x017f
            r10 = 1
        L_0x017f:
            if (r16 == 0) goto L_0x0182
            r9 = 1
        L_0x0182:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0190
            r1 = 35392268(0x21c0b0c, float:1.146424E-37)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.TifuUnit (TifuUnit.kt:69)"
            X.0fL.A01(r1, r0)
        L_0x0190:
            X.4bM r1 = X.C286955Yl.A00
            r0 = r7
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r0 = X.C286565Wx.A04(r0)
            java.lang.Object r11 = X.C286615Xc.A01(r1, r0)
            X.0lg r11 = (X.0lg) r11
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x01f0
            r13 = 1134297088(0x439c0000, float:312.0)
        L_0x01a5:
            X.0Tu r15 = X.0Tu.A05
            r0 = 36326339469063899(0x810e9d000b36db, double:3.0362615824396937E-306)
            boolean r31 = X.182.A06(r15, r11, r0)
            X.6By r34 = X.C304046By.A00
            java.lang.Boolean r0 = r6.A01
            X.6C0 r1 = new X.6C0
            r15 = r1
            r16 = r43
            r17 = r42
            r18 = r6
            r19 = r39
            r20 = r41
            r21 = r40
            r27 = r14
            r28 = r13
            r30 = r10
            r32 = r12
            r33 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r11 = -2030686594(0xffffffff86f62e7e, float:-9.260323E-35)
            X.5PJ r36 = X.AnonymousClass5PI.A01(r7, r1, r11)
            r37 = 384(0x180, float:5.38E-43)
            r33 = r7
            r35 = r0
            r38 = r8
            X.AnonymousClass6C1.A00(r33, r34, r35, r36, r37, r38)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0143
            r0 = 1159411084(0x451b358c, float:2483.3467)
            X.0fL.A00(r0)
            goto L_0x0143
        L_0x01f0:
            X.0Tu r13 = X.0Tu.A05
            r0 = 36607814445110908(0x820e9d0001167c, double:3.214267490700577E-306)
            long r0 = X.182.A01(r13, r11, r0)
            int r13 = (int) r0
            float r13 = (float) r13
            goto L_0x01a5
        L_0x01fe:
            r0 = r58 & r17
            if (r0 != 0) goto L_0x0128
            boolean r0 = r7.AGv(r9)
            if (r0 != 0) goto L_0x020a
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x020a:
            r11 = r11 | r18
            goto L_0x0128
        L_0x020e:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x011f
            r0 = r29
            boolean r0 = r7.AGv(r0)
            if (r0 != 0) goto L_0x021c
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x021c:
            r11 = r11 | r16
            goto L_0x011f
        L_0x0220:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0117
            boolean r0 = r7.AGv(r10)
            if (r0 != 0) goto L_0x022c
            r19 = 1024(0x400, float:1.435E-42)
        L_0x022c:
            r11 = r11 | r19
            goto L_0x0117
        L_0x0230:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0111
            boolean r0 = r7.AGv(r12)
            if (r0 != 0) goto L_0x023c
            r15 = 128(0x80, float:1.794E-43)
        L_0x023c:
            r11 = r11 | r15
            goto L_0x0111
        L_0x023f:
            r0 = r58 & 48
            if (r0 != 0) goto L_0x010b
            r0 = r26
            boolean r0 = r7.AGw(r0)
            if (r0 != 0) goto L_0x024d
            r13 = 16
        L_0x024d:
            r11 = r11 | r13
            goto L_0x010b
        L_0x0250:
            r0 = r58 & 6
            if (r0 != 0) goto L_0x0261
            r0 = r22
            boolean r0 = r7.AGw(r0)
            if (r0 != 0) goto L_0x025d
            r11 = 2
        L_0x025d:
            r11 = r58 | r11
            goto L_0x0105
        L_0x0261:
            r11 = r4
            goto L_0x0105
        L_0x0264:
            r0 = r57 & r17
            if (r0 != 0) goto L_0x00a3
            r0 = r23
            boolean r4 = r7.AGw(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r4 == 0) goto L_0x0274
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0274:
            r1 = r1 | r0
            goto L_0x00a3
        L_0x0277:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0099
            r0 = r40
            boolean r4 = r7.AGw(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0287
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x0287:
            r1 = r1 | r0
            goto L_0x0099
        L_0x028a:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0091
            r0 = r41
            boolean r4 = r7.AGw(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x029a
            r0 = 2048(0x800, float:2.87E-42)
        L_0x029a:
            r1 = r1 | r0
            goto L_0x0091
        L_0x029d:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0089
            r0 = r43
            boolean r4 = r7.AGu(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x02ad
            r0 = 256(0x100, float:3.59E-43)
        L_0x02ad:
            r1 = r1 | r0
            goto L_0x0089
        L_0x02b0:
            r0 = r57 & 48
            if (r0 != 0) goto L_0x0081
            r0 = r42
            boolean r4 = r7.AGu(r0)
            r0 = 16
            if (r4 == 0) goto L_0x02c0
            r0 = 32
        L_0x02c0:
            r1 = r1 | r0
            goto L_0x0081
        L_0x02c3:
            r0 = r57 & 6
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r7.AGu(r6)
            r1 = 2
            if (r0 == 0) goto L_0x02cf
            r1 = 4
        L_0x02cf:
            r1 = r1 | r57
            goto L_0x0079
        L_0x02d3:
            r1 = r5
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304036Bx.A00(X.5Wy, X.5vd, X.5va, X.5vX, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
