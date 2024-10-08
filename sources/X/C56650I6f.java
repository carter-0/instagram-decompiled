package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I6f  reason: case insensitive filesystem */
public abstract class C56650I6f {
    public static final void A00(C287605aT r12, C286575Wy r13, Modifier modifier, JPI jpi, 0sP r16, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C287605aT r6 = r12;
        JPI jpi2 = jpi;
        0sP r7 = r16;
        AnonymousClass7TG.A0w(1, jpi, r12, r7);
        r13.ExV(1644036314);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r13, modifier) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, jpi);
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0a(r13, z2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0R(r13, r12);
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i3 |= G9t.A0I(r13, r7);
        }
        if ((i3 & 9363) != 9362 || !r13.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1283746100, "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPill (Pills.kt:150)");
            }
            Modifier modifier3 = modifier2;
            A02(r12, r13, modifier3, JJU.A00(r13, r7, jpi, 26, 557539287), (i3 & 14) | 24576 | ((i3 >> 6) & 112) | (i3 & 896), 0, z2, jpi.getEnabled());
            if (0fL.A02()) {
                0fL.A00(-240692760);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59194J9y(modifier2, jpi2, r6, r7, i6, i4, 5, z2);
        }
    }

    public static final void A06(String str, C286575Wy r6, int i) {
        int i2;
        0qQ.A0B(str, 0);
        r6.ExV(-894711963);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1859794278, "com.instagram.compose.igds.components.segmentedpills.LabelPillContent (Pills.kt:84)");
            }
            AnonymousClass5ZZ.A0i(r6, (AnonymousClass5Z4) null, str, i2 & 14, 32766);
            if (0fL.A02()) {
                0fL.A00(-2077608461);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str, i, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C287605aT r16, X.C286575Wy r17, androidx.compose.ui.Modifier r18, X.JPI r19, X.0sP r20, X.0sP r21, int r22, int r23, boolean r24) {
        /*
            r13 = r20
            r11 = r21
            r14 = r16
            r1 = r24
            r12 = r18
            r0 = 1
            r10 = r19
            X.0qQ.A0B(r10, r0)
            r0 = -275061529(0xffffffffef9ae4e7, float:-9.5874835E28)
            r2 = r17
            r2.ExV(r0)
            r16 = r23
            r6 = r23 & 1
            r15 = r22
            if (r6 == 0) goto L_0x0121
            r3 = r22 | 6
        L_0x0022:
            r0 = r23 & 2
            if (r0 == 0) goto L_0x0116
            r3 = r3 | 48
        L_0x0028:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x010b
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r8 = r23 & 8
            if (r8 == 0) goto L_0x0100
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r7 = r23 & 16
            if (r7 == 0) goto L_0x00f5
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r5 = r23 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x0048
            r0 = r0 & r22
            if (r0 != 0) goto L_0x0049
            int r0 = X.G9t.A0J(r2, r11)
        L_0x0048:
            r3 = r3 | r0
        L_0x0049:
            r0 = 74899(0x12493, float:1.04956E-40)
            r4 = r3 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r0) goto L_0x006e
            boolean r0 = r2.Bwn()
            if (r0 == 0) goto L_0x006e
            r2.Evl()
        L_0x005c:
            X.5Xd r0 = r2.ASQ()
            if (r0 == 0) goto L_0x006d
            r17 = 4
            X.JAe r9 = new X.JAe
            r18 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A06 = r9
        L_0x006d:
            return
        L_0x006e:
            if (r6 == 0) goto L_0x0072
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
        L_0x0072:
            r6 = 0
            if (r9 == 0) goto L_0x0076
            r1 = 0
        L_0x0076:
            if (r8 == 0) goto L_0x0084
            r0 = 1444956923(0x56204afb, float:4.4060975E13)
            java.lang.Object r14 = X.C51974G9v.A0V(r2, r0)
            X.5aT r14 = (X.C287605aT) r14
            X.C51965G9l.A1X(r2, r6)
        L_0x0084:
            if (r7 == 0) goto L_0x0088
            X.J1l r13 = X.C58974J1l.A00
        L_0x0088:
            if (r5 == 0) goto L_0x008c
            X.J1m r11 = X.C58975J1m.A00
        L_0x008c:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x009a
            r4 = 851840962(0x32c60fc2, float:2.30574E-8)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.IgdsSegmentedPill (Pills.kt:125)"
            X.0fL.A01(r4, r0)
        L_0x009a:
            r0 = 1444963118(0x5620632e, float:4.4086958E13)
            r2.ExS(r0)
            r5 = r3 & 896(0x380, float:1.256E-42)
            r0 = 256(0x100, float:3.59E-43)
            if (r5 != r0) goto L_0x00a7
            r6 = 1
        L_0x00a7:
            java.lang.Object r4 = r2.ECw()
            if (r6 != 0) goto L_0x00b1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x00c1
        L_0x00b1:
            X.HLn r6 = X.C54630HLn.SINGLE
            r4 = 40
            X.J6I r0 = new X.J6I
            r0.<init>(r13, r4)
            androidx.compose.ui.Modifier r4 = X.C56633I5n.A00(r14, r10, r6, r0, r1)
            r2.FLL(r4)
        L_0x00c1:
            androidx.compose.ui.Modifier r4 = (androidx.compose.ui.Modifier) r4
            boolean r23 = X.C51968G9o.A1Y(r2)
            androidx.compose.ui.Modifier r19 = r12.Ezh(r4)
            r0 = r3 & 112(0x70, float:1.57E-43)
            r5 = r5 | r0
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r0
            r4 = 57344(0xe000, float:8.0356E-41)
            int r0 = r3 >> 3
            r4 = r4 & r0
            r5 = r5 | r4
            r17 = r14
            r18 = r2
            r20 = r10
            r21 = r11
            r22 = r5
            r24 = r1
            A00(r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005c
            r0 = -412934572(0xffffffffe7631e54, float:-1.07253665E24)
            X.0fL.A00(r0)
            goto L_0x005c
        L_0x00f5:
            r0 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003a
            int r0 = X.G9t.A0I(r2, r13)
            r3 = r3 | r0
            goto L_0x003a
        L_0x0100:
            r0 = r15 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A0R(r2, r14)
            r3 = r3 | r0
            goto L_0x0034
        L_0x010b:
            r0 = r15 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002e
            int r0 = X.G9t.A0a(r2, r1)
            r3 = r3 | r0
            goto L_0x002e
        L_0x0116:
            r0 = r22 & 48
            if (r0 != 0) goto L_0x0028
            int r0 = X.G9t.A0P(r2, r10)
            r3 = r3 | r0
            goto L_0x0028
        L_0x0121:
            r0 = r22 & 6
            if (r0 != 0) goto L_0x012d
            int r3 = X.G9t.A0O(r2, r12)
            r3 = r3 | r22
            goto L_0x0022
        L_0x012d:
            r3 = r15
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56650I6f.A01(X.5aT, X.5Wy, androidx.compose.ui.Modifier, X.JPI, X.0sP, X.0sP, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C287605aT r16, X.C286575Wy r17, androidx.compose.ui.Modifier r18, X.0sK r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            r15 = r23
            r14 = r22
            r9 = r16
            r8 = r18
            r0 = 4
            r10 = r19
            X.0qQ.A0B(r10, r0)
            r0 = 676637002(0x2854a94a, float:1.1805073E-14)
            r4 = r17
            r4.ExV(r0)
            r12 = r21
            r7 = r21 & 1
            r11 = r20
            if (r7 == 0) goto L_0x015d
            r1 = r20 | 6
        L_0x0020:
            r6 = r21 & 2
            if (r6 == 0) goto L_0x0152
            r1 = r1 | 48
        L_0x0026:
            r2 = r21 & 4
            if (r2 == 0) goto L_0x0147
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r3 = r21 & 8
            if (r3 == 0) goto L_0x013c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r0 = r21 & 16
            if (r0 == 0) goto L_0x0131
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r5 = r1 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r0) goto L_0x0056
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x0056
            r4.Evl()
        L_0x0047:
            X.5Xd r0 = r4.ASQ()
            if (r0 == 0) goto L_0x0055
            r13 = 2
            X.J9w r7 = new X.J9w
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A06 = r7
        L_0x0055:
            return
        L_0x0056:
            if (r7 == 0) goto L_0x005a
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
        L_0x005a:
            if (r6 == 0) goto L_0x0068
            r0 = -880036869(0xffffffffcb8bb3fb, float:-1.8311158E7)
            java.lang.Object r9 = X.C51974G9v.A0V(r4, r0)
            X.5aU r9 = (X.C287615aU) r9
            X.C51965G9l.A1V(r4)
        L_0x0068:
            boolean r14 = X.C51966G9m.A1Q(r2, r14)
            boolean r15 = X.C51966G9m.A1R(r3, r15)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007e
            r2 = -1721664979(0xffffffff99617a2d, float:-1.16569006E-23)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.BasePill (Pills.kt:189)"
            X.0fL.A01(r2, r0)
        L_0x007e:
            int r0 = r1 >> 3
            r0 = r0 & 14
            X.5Oz r0 = X.C54738HQv.A00(r9, r4, r0)
            boolean r2 = X.C51971G9r.A1W(r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0098
            r1 = 507529152(0x1e4047c0, float:1.0179233E-20)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.PillColors.backgroundColor (Pills.kt:56)"
            X.0fL.A01(r1, r0)
        L_0x0098:
            if (r14 == 0) goto L_0x0122
            r0 = 1650129391(0x625af9ef, float:1.00984996E21)
            r4.ExS(r0)
            r5 = 0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r4)
            long r0 = r0.A0g
        L_0x00a7:
            X.5Wx r6 = X.C51965G9l.A0H(r4, r5)
            if (r15 != 0) goto L_0x011c
            r2 = 1050253722(0x3e99999a, float:0.3)
        L_0x00b0:
            long r0 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r2)
        L_0x00b4:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00c0
            r2 = 764075921(0x2d8adf91, float:1.5788067E-11)
            X.0fL.A00(r2)
        L_0x00c0:
            r2 = 1090519040(0x41000000, float:8.0)
            X.5ZQ r19 = X.AnonymousClass5ZN.A01(r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00d4
            r3 = 784959510(0x2ec98816, float:9.1645955E-11)
            java.lang.String r2 = "com.instagram.compose.igds.components.segmentedpills.PillColors.contentColor (Pills.kt:73)"
            X.0fL.A01(r3, r2)
        L_0x00d4:
            if (r14 == 0) goto L_0x0114
            r2 = 871094450(0x33ebd8b2, float:1.0982457E-7)
            X.5Yw r2 = X.C51967G9n.A0a(r4, r2)
            long r2 = r2.A0h
        L_0x00df:
            boolean r5 = X.C51967G9n.A1b(r6, r5)
            if (r5 == 0) goto L_0x00eb
            r5 = 782923634(0x2eaa7772, float:7.751923E-11)
            X.0fL.A00(r5)
        L_0x00eb:
            X.4bM r5 = X.C304856Fm.A00
            X.5Xl r5 = X.C51969G9p.A0T(r5, r2)
            r3 = 1147251850(0x4461ac8a, float:902.6959)
            r22 = 1
            X.J7q r2 = new X.J7q
            r17 = r0
            r20 = r8
            r21 = r10
            r16 = r2
            r16.<init>(r17, r19, r20, r21, r22)
            X.C51971G9r.A11(r4, r5, r2, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0047
            r0 = 340458982(0x144afde6, float:1.02484664E-26)
            X.0fL.A00(r0)
            goto L_0x0047
        L_0x0114:
            r2 = 871142965(0x33ec9635, float:1.1016929E-7)
            long r2 = X.C51970G9q.A0L(r4, r2)
            goto L_0x00df
        L_0x011c:
            if (r2 == 0) goto L_0x00b4
            r2 = 1060320051(0x3f333333, float:0.7)
            goto L_0x00b0
        L_0x0122:
            r0 = 1650191701(0x625bed55, float:1.0142346E21)
            r4.ExS(r0)
            r5 = 0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r4)
            long r0 = r0.A0i
            goto L_0x00a7
        L_0x0131:
            r0 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0038
            int r0 = X.G9t.A0I(r4, r10)
            r1 = r1 | r0
            goto L_0x0038
        L_0x013c:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0032
            int r0 = X.G9t.A0b(r4, r15)
            r1 = r1 | r0
            goto L_0x0032
        L_0x0147:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A0a(r4, r14)
            r1 = r1 | r0
            goto L_0x002c
        L_0x0152:
            r0 = r20 & 48
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A0P(r4, r9)
            r1 = r1 | r0
            goto L_0x0026
        L_0x015d:
            r0 = r20 & 6
            if (r0 != 0) goto L_0x0169
            int r1 = X.G9t.A0O(r4, r8)
            r1 = r1 | r20
            goto L_0x0020
        L_0x0169:
            r1 = r11
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56650I6f.A02(X.5aT, X.5Wy, androidx.compose.ui.Modifier, X.0sK, int, int, boolean, boolean):void");
    }

    public static final void A03(C286575Wy r12, AnonymousClass2DO r13, HL7 hl7, String str, String str2, int i, int i2) {
        int i3;
        String str3 = str2;
        HL7 hl72 = hl7;
        AnonymousClass2DO r7 = r13;
        String str4 = str;
        AnonymousClass7TF.A1H(str, r13);
        r12.ExV(-909483918);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r12, str) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r12, r13);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r12, hl7);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r12, str3);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i6 != 0) {
                hl72 = HL7.START;
            }
            if (i7 != 0) {
                str3 = null;
            }
            if (0fL.A02()) {
                0fL.A01(1935118757, "com.instagram.compose.igds.components.segmentedpills.LabelWithIconPillContent (Pills.kt:95)");
            }
            r12.ExS(662548426);
            if (hl72 == HL7.START) {
                int i8 = i3 >> 3;
                A04(r12, r13, str3, 12.0f, (i8 & 896) | (i8 & 14) | 48);
                C51967G9n.A13(r12, Modifier.A00, 6.0f);
            }
            C51965G9l.A1X(r12, false);
            AnonymousClass5ZZ.A0i(r12, (AnonymousClass5Z4) null, str, i3 & 14, 32766);
            if (hl72 == HL7.END) {
                C51967G9n.A13(r12, Modifier.A00, 6.0f);
                int i9 = i3 >> 3;
                A04(r12, r13, str3, 12.0f, (i9 & 896) | (i9 & 14) | 48);
            }
            if (0fL.A02()) {
                0fL.A00(2063066330);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(hl72, r7, str3, str4, i5, i4, 4);
        }
    }

    public static final void A04(C286575Wy r13, AnonymousClass2DO r14, String str, float f, int i) {
        int i2;
        C286575Wy r3 = r13;
        r13.ExV(1695605811);
        int i3 = i;
        AnonymousClass2DO r5 = r14;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r3, r14) | i;
        } else {
            i2 = i3;
        }
        float f2 = f;
        if ((i & 48) == 0) {
            i2 |= G9t.A00(r3, f2);
        }
        String str2 = str;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r3, str);
        }
        if ((i2 & 147) != 146 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-466046612, "com.instagram.compose.igds.components.segmentedpills.IconInPill (Pills.kt:215)");
            }
            C288165bT.A06(r3, C287205Zk.A0C(Modifier.A00, f2), r5, (C288095bM) null, str2, (i2 & 14) | ((i2 >> 3) & 112), 24, 0);
            if (0fL.A02()) {
                0fL.A00(81548589);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59138J7u(r5, str, f2, i3, 0);
        }
    }

    public static final void A05(C286575Wy r4, AnonymousClass2DO r5, String str, int i) {
        int i2;
        AnonymousClass7TG.A1N(r5, str);
        r4.ExV(-496698969);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r4, str);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1104315720, "com.instagram.compose.igds.components.segmentedpills.IconPillContent (Pills.kt:112)");
            }
            A04(r4, r5, str, 16.0f, ((i2 << 3) & 896) | (i2 & 14) | 48);
            if (0fL.A02()) {
                0fL.A00(-44122523);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r5, str, i, 5);
        }
    }
}
