package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Htp  reason: case insensitive filesystem */
public abstract class C56161Htp {
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ca, code lost:
        if (((r22 & ((r22 ^ -1) << 6)) & -9187201950435737472L) != 0) goto L_0x01d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass5b8 r29, X.C56606I4f r30, X.C286575Wy r31, androidx.compose.ui.Modifier r32, X.0sP r33, X.0sK r34, int r35, int r36) {
        /*
            r9 = r33
            r28 = r29
            r10 = r32
            r0 = 679005231(0x2878cc2f, float:1.3811041E-14)
            r12 = r31
            r12.ExV(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r36
            r0 = r36 & r0
            r11 = r30
            r8 = r35
            if (r0 == 0) goto L_0x02a2
            r1 = r35 | 6
        L_0x001c:
            r5 = r36 & 1
            if (r5 == 0) goto L_0x0297
            r1 = r1 | 48
        L_0x0022:
            r4 = r36 & 2
            if (r4 == 0) goto L_0x028a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x027f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r0 = r36 & 8
            r31 = r34
            if (r0 == 0) goto L_0x0272
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r2 = r1 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r0) goto L_0x0063
            boolean r0 = r12.Bwn()
            if (r0 == 0) goto L_0x0063
            r12.Evl()
        L_0x0045:
            X.5Xd r1 = r12.ASQ()
            if (r1 == 0) goto L_0x0062
            r30 = 0
            X.J9z r0 = new X.J9z
            r22 = r0
            r23 = r11
            r24 = r10
            r25 = r28
            r26 = r9
            r27 = r31
            r28 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r1.A06 = r0
        L_0x0062:
            return
        L_0x0063:
            if (r5 == 0) goto L_0x0067
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
        L_0x0067:
            r7 = 0
            if (r4 == 0) goto L_0x0070
            r0 = 300(0x12c, float:4.2E-43)
            X.GQC r28 = X.GQC.A00(r0, r7)
        L_0x0070:
            if (r3 == 0) goto L_0x0074
            X.Iyd r9 = X.C58852Iyd.A00
        L_0x0074:
            boolean r0 = X.0fL.A02()
            r27 = -1
            if (r0 == 0) goto L_0x0084
            r2 = -1669577740(0xffffffff9c7c43f4, float:-8.3467633E-22)
            java.lang.String r0 = "androidx.compose.animation.Crossfade (Crossfade.kt:103)"
            X.0fL.A01(r2, r0)
        L_0x0084:
            java.lang.Object r6 = r12.ECw()
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r6 != r2) goto L_0x009b
            X.6HD r6 = new X.6HD
            r6.<init>()
            java.lang.Object r0 = r11.A04()
            r6.add(r0)
            r12.FLL(r6)
        L_0x009b:
            X.6HD r6 = (X.AnonymousClass6HD) r6
            java.lang.Object r5 = r12.ECw()
            if (r5 != r2) goto L_0x00ae
            X.0vr r0 = X.01o.A01
            r0 = 6
            X.0vr r5 = new X.0vr
            r5.<init>(r0)
            r12.FLL(r5)
        L_0x00ae:
            X.0vr r5 = (X.0vr) r5
            java.lang.Object r0 = r11.A04()
            X.5Oz r4 = r11.A07
            boolean r0 = X.C51969G9p.A1U(r4, r0)
            r3 = 1
            if (r0 == 0) goto L_0x025c
            r0 = 860660313(0x334ca259, float:4.7645106E-8)
            r12.ExS(r0)
            int r0 = r6.size()
            if (r0 != r3) goto L_0x023b
            java.lang.Object r0 = r6.get(r7)
            boolean r0 = X.C51969G9p.A1U(r4, r0)
            if (r0 == 0) goto L_0x023b
            r0 = 860984945(0x33519671, float:4.879843E-8)
            r12.ExS(r0)
        L_0x00d9:
            X.C51965G9l.A1X(r12, r7)
        L_0x00dc:
            X.5Wx r3 = X.C51965G9l.A0H(r12, r7)
            java.lang.Object r26 = r4.getValue()
            int r1 = X.C51971G9r.A0E(r26)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r15 = r1 & 127(0x7f, float:1.78E-43)
            int r2 = r5.A00
            int r25 = r1 >>> 7
            r25 = r25 & r2
            r24 = 0
        L_0x00f9:
            long[] r13 = r5.A02
            int r14 = r25 >> 3
            r0 = r25 & 7
            int r1 = r0 << 3
            r16 = r13[r14]
            long r16 = r16 >>> r1
            int r0 = r14 + 1
            r22 = r13[r0]
            int r0 = 64 - r1
            long r22 = r22 << r0
            long r13 = (long) r1
            long r0 = -r13
            r13 = 63
            long r0 = r0 >> r13
            long r22 = r22 & r0
            long r22 = r22 | r16
            long r0 = (long) r15
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r16
            long r0 = r0 ^ r22
            long r13 = r0 - r16
            r20 = -1
            long r0 = r0 ^ r20
            long r0 = r0 & r13
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r18
        L_0x012e:
            r16 = 0
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x01c0
            int r13 = java.lang.Long.numberOfTrailingZeros(r0)
            int r16 = r13 >> 3
            int r16 = r16 + r25
            r16 = r16 & r2
            java.lang.Object[] r13 = r5.A03
            r14 = r13[r16]
            r13 = r26
            boolean r13 = X.0qQ.A0K(r14, r13)
            if (r13 == 0) goto L_0x01b9
            if (r16 < 0) goto L_0x01d4
            r0 = 861812273(0x335e3631, float:5.173769E-8)
            r12.ExS(r0)
        L_0x0152:
            X.C286565Wx.A0L(r3, r7)
            X.5RD r1 = X.C51966G9m.A0a(r7)
            int r4 = X.C287425a7.A00(r12)
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r10)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0177
            boolean r0 = X.C51972G9s.A1Q(r12, r4)
            if (r0 != 0) goto L_0x017a
        L_0x0177:
            X.C51971G9r.A13(r12, r1, r4)
        L_0x017a:
            X.C51965G9l.A18(r12, r2)
            r0 = -187482432(0xfffffffff4d33ec0, float:-1.338925E32)
            r12.ExS(r0)
            int r4 = r6.size()
            r2 = 0
        L_0x0188:
            if (r2 >= r4) goto L_0x0264
            java.lang.Object r13 = r6.get(r2)
            r1 = -1081873445(0xffffffffbf83ebdb, float:-1.0306352)
            java.lang.Object r0 = r9.invoke(r13)
            r12.ExC(r1, r0)
            java.lang.Object r1 = r5.A03(r13)
            X.0sL r1 = (X.0sL) r1
            if (r1 != 0) goto L_0x01af
            r0 = 821713034(0x30fa588a, float:1.8215058E-9)
            r12.ExS(r0)
        L_0x01a6:
            X.C286565Wx.A0L(r3, r7)
            X.C286565Wx.A0L(r3, r7)
            int r2 = r2 + 1
            goto L_0x0188
        L_0x01af:
            r0 = -1081871785(0xffffffffbf83f257, float:-1.0308331)
            r12.ExS(r0)
            X.C51967G9n.A1P(r12, r1, r7)
            goto L_0x01a6
        L_0x01b9:
            r16 = 1
            long r13 = r0 - r16
            long r0 = r0 & r13
            goto L_0x012e
        L_0x01c0:
            long r13 = r22 ^ r20
            r0 = 6
            long r13 = r13 << r0
            long r22 = r22 & r13
            long r22 = r22 & r18
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x01d4
            int r24 = r24 + 8
            int r25 = r25 + r24
            r25 = r25 & r2
            goto L_0x00f9
        L_0x01d4:
            r0 = 861052122(0x33529cda, float:4.903709E-8)
            r12.ExS(r0)
            java.util.Iterator r13 = r6.iterator()
            r1 = 0
        L_0x01df:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r13.next()
            java.lang.Object r2 = r9.invoke(r0)
            java.lang.Object r0 = r4.getValue()
            java.lang.Object r0 = r9.invoke(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0230
            r0 = r27
            if (r1 == r0) goto L_0x0233
            java.lang.Object r0 = r4.getValue()
            r6.set(r1, r0)
        L_0x0206:
            r5.A08()
            int r13 = r6.size()
            r4 = 0
        L_0x020e:
            if (r4 >= r13) goto L_0x0152
            java.lang.Object r2 = r6.get(r4)
            r1 = -1426421288(0xffffffffaafa89d8, float:-4.450457E-13)
            X.J7t r0 = new X.J7t
            r14 = r0
            r15 = r7
            r16 = r11
            r17 = r28
            r18 = r2
            r19 = r31
            r14.<init>(r15, r16, r17, r18, r19)
            X.5PJ r0 = X.AnonymousClass5PI.A01(r12, r0, r1)
            r5.A09(r2, r0)
            int r4 = r4 + 1
            goto L_0x020e
        L_0x0230:
            int r1 = r1 + 1
            goto L_0x01df
        L_0x0233:
            java.lang.Object r0 = r4.getValue()
            r6.add(r0)
            goto L_0x0206
        L_0x023b:
            r0 = 860794667(0x334eaf2b, float:4.8122427E-8)
            boolean r1 = X.C51973G9u.A1N(r12, r0, r1)
            java.lang.Object r0 = r12.ECw()
            if (r1 != 0) goto L_0x024a
            if (r0 != r2) goto L_0x0252
        L_0x024a:
            r0 = 6
            X.J6G r0 = X.J6G.A00(r11, r0)
            r12.FLL(r0)
        L_0x0252:
            X.0sP r0 = (X.0sP) r0
            X.018.A1A(r6, r0)
            r5.A08()
            goto L_0x00d9
        L_0x025c:
            r0 = 860990897(0x3351adb1, float:4.8819576E-8)
            r12.ExS(r0)
            goto L_0x00dc
        L_0x0264:
            boolean r0 = X.C51971G9r.A1S(r12, r3, r7)
            if (r0 == 0) goto L_0x0045
            r0 = -1113210541(0xffffffffbda5c153, float:-0.08093514)
            X.0fL.A00(r0)
            goto L_0x0045
        L_0x0272:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0036
            r0 = r31
            int r0 = X.G9t.A0I(r12, r0)
            r1 = r1 | r0
            goto L_0x0036
        L_0x027f:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x002e
            int r0 = X.G9t.A0H(r12, r9)
            r1 = r1 | r0
            goto L_0x002e
        L_0x028a:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0028
            r0 = r28
            int r0 = X.G9t.A0G(r12, r0)
            r1 = r1 | r0
            goto L_0x0028
        L_0x0297:
            r0 = r35 & 48
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0P(r12, r10)
            r1 = r1 | r0
            goto L_0x0022
        L_0x02a2:
            r0 = r35 & 6
            if (r0 != 0) goto L_0x02ae
            int r1 = X.G9t.A0O(r12, r11)
            r1 = r1 | r35
            goto L_0x001c
        L_0x02ae:
            r1 = r8
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56161Htp.A00(X.5b8, X.I4f, X.5Wy, androidx.compose.ui.Modifier, X.0sP, X.0sK, int, int):void");
    }

    public static final void A01(AnonymousClass5b8 r14, C286575Wy r15, Modifier modifier, Object obj, String str, 0sK r19, int i, int i2) {
        int i3;
        String str2 = str;
        AnonymousClass5b8 r7 = r14;
        Modifier modifier2 = modifier;
        C286575Wy r1 = r15;
        r15.ExV(-310686752);
        int i4 = i2;
        Object obj2 = obj;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C51970G9q.A05(G9t.A1T(r15, obj2, i5) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r15, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r15, r14);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r15, str2);
        }
        0sK r10 = r19;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r15, r10);
        }
        if ((i3 & 9363) != 9362 || !r15.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r7 = GQC.A00(300, 0);
            }
            if (i8 != 0) {
                str2 = "Crossfade";
            }
            if (0fL.A02()) {
                0fL.A01(804645818, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            A00(r7, I67.A03(r15, obj2, str2, (i3 & 8) | (i3 & 14) | ((i3 >> 6) & 112)), r1, modifier2, (0sP) null, r19, (i3 & 112) | (i3 & 896) | (i3 & 57344), 4);
            if (0fL.A02()) {
                0fL.A00(1324503022);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA8(r7, obj2, modifier2, r10, str2, i5, i4, 0);
        }
    }
}
