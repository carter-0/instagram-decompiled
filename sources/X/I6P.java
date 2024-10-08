package X;

import androidx.compose.ui.Modifier;
import com.meta.foa.session.FoaUserSession;

public abstract class I6P {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.PqV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.PqV} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ec, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28) {
        /*
            r12 = 0
            r5 = r25
            r4 = r26
            X.AnonymousClass7TF.A1H(r5, r4)
            r11 = 2
            r13 = r27
            X.0qQ.A0B(r13, r11)
            r0 = 1775306711(0x69d107d7, float:3.1587815E25)
            r6 = r24
            r6.ExV(r0)
            r3 = r28
            r0 = r28 & 6
            if (r0 != 0) goto L_0x011b
            int r8 = X.G9t.A0O(r6, r5)
            r8 = r8 | r28
        L_0x0022:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x002b
            int r0 = X.G9t.A0P(r6, r4)
            r8 = r8 | r0
        L_0x002b:
            r0 = r3 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0036
            int r0 = X.G9t.A0Q(r6, r13)
            r8 = r8 | r0
        L_0x0036:
            r1 = r8 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0059
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0059
            r6.Evl()
        L_0x0045:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x0058
            X.J80 r0 = new X.J80
            r6 = r0
            r7 = r5
            r8 = r4
            r9 = r13
            r10 = r3
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A06 = r0
        L_0x0058:
            return
        L_0x0059:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0067
            r1 = 2017067565(0x783a022d, float:1.5090802E34)
            java.lang.String r0 = "com.instagram.creation.genai.memu.settings.FooterWithEndingLink (MemuSettingsComposables.kt:133)"
            X.0fL.A01(r1, r0)
        L_0x0067:
            java.lang.Object r10 = X.C51966G9m.A16(r6)
            r15 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r14 = java.lang.String.format(r0, r5, r1)
            X.0qQ.A07(r14)
            r0 = -571451189(0xffffffffddf058cb, float:-2.16485195E18)
            boolean r0 = X.C51967G9n.A1U(r6, r0)
            if (r0 == 0) goto L_0x008c
            r1 = 949616702(0x389a003e, float:7.343337E-5)
            java.lang.String r0 = "com.instagram.creation.genai.memu.settings.getAnnotatedStringWithLearnMoreLink (MemuSettingsComposables.kt:69)"
            X.0fL.A01(r1, r0)
        L_0x008c:
            r17 = 0
            int r7 = X.C51971G9r.A0G(r14, r4)
            int r2 = X.C51966G9m.A05(r4, r7)
            X.6Bd r1 = X.C51972G9s.A0L(r14)
            long r23 = X.C51966G9m.A0D(r6)
            r25 = 0
            X.5ZD r20 = X.AnonymousClass5ZD.A03
            r22 = 65530(0xfffa, float:9.1827E-41)
            X.5ZB r0 = new X.5ZB
            r18 = r17
            r19 = r17
            r21 = r17
            r27 = r25
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27)
            r1.A06(r0, r7, r2)
            java.lang.String r14 = "link"
            java.lang.String r0 = "Clickable link"
            X.5Tq r2 = X.C51967G9n.A0K(r1, r14, r0, r7, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00cb
            r0 = 1056090724(0x3ef2aa64, float:0.47395623)
            X.0fL.A00(r0)
        L_0x00cb:
            X.5Wx r7 = X.C51965G9l.A0H(r6, r12)
            java.lang.Object r1 = X.C51965G9l.A0r(r6)
            r0 = -1199373993(0xffffffffb8830157, float:-6.246816E-5)
            boolean r0 = X.G9t.A1Y(r6, r2, r10, r0)
            boolean r14 = X.C51966G9m.A1U(r6, r1, r0)
            r0 = r8 & 896(0x380, float:1.256E-42)
            if (r0 == r9) goto L_0x00e3
            r15 = 0
        L_0x00e3:
            r14 = r14 | r15
            java.lang.Object r0 = r6.ECw()
            if (r14 != 0) goto L_0x00ee
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r0 != r8) goto L_0x0102
        L_0x00ee:
            r23 = 32
            X.PqV r0 = new X.PqV
            r18 = r0
            r19 = r2
            r20 = r1
            r21 = r10
            r22 = r13
            r18.<init>((java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21, (java.lang.String) r22, (int) r23)
            r6.FLL(r0)
        L_0x0102:
            X.0sP r9 = X.C51965G9l.A0z(r7, r0)
            r7 = r17
            r8 = r2
            r10 = r12
            X.I2Y.A01(r6, r7, r8, r9, r10, r11)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0045
            r0 = -1606597472(0xffffffffa03d44a0, float:-1.6031629E-19)
            X.0fL.A00(r0)
            goto L_0x0045
        L_0x011b:
            r8 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6P.A02(X.5Wy, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public static final void A03(C286575Wy r9, C62320sa r10, int i, int i2) {
        int i3;
        0qQ.A0B(r10, 1);
        r9.ExV(1347916169);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r9, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r9, r10);
        }
        if ((i3 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-867029336, "com.instagram.creation.genai.memu.settings.LinkListCell (MemuSettingsComposables.kt:87)");
            }
            String A00 = C288035bG.A00(r9, i);
            C285245Qk r5 = Modifier.A00;
            C287625aV A0R = C51965G9l.A0R(0);
            boolean A1O = C51973G9u.A1O(r9, 1844402919, i3);
            Object ECw = r9.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = C58672Ivh.A00(r9, r10, 22);
            }
            C51965G9l.A1X(r9, false);
            C52636GaA.A0E(r9, C287635aW.A05(r5, A0R, (String) null, (C62320sa) ECw, true), C57124IPn.A00, A00);
            if (0fL.A02()) {
                0fL.A00(407355206);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, r10, i, i2, 14);
        }
    }

    public static boolean A05(C286575Wy r5, Object obj, String str, String str2) {
        FoaUserSession foaUserSession = (FoaUserSession) ((C54135H0e) obj).A05.getValue();
        0qQ.A0B(foaUserSession, 0);
        A02(r5, str, str2, 182.A04(0Tu.A05, C56316HwT.A00(foaUserSession), 36888786910708532L), 0);
        return 0fL.A02();
    }

    public static final void A04(C286575Wy r16, 0sP r17, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        0sP r1 = r17;
        boolean z3 = z2;
        C286575Wy r9 = r16;
        r9.ExV(-932795376);
        int i5 = i3;
        boolean z4 = z;
        int i6 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0Y(r9, z4) | i2;
        } else {
            i4 = i6;
        }
        int i7 = i;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r9, i7);
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i6 & 384) == 0) {
            i4 |= G9t.A0a(r9, z3);
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i4 |= G9t.A0H(r9, r1);
        }
        if ((i4 & 1171) != 1170 || !r9.Bwn()) {
            z3 = C51966G9m.A1R(i8, z3);
            if (i9 != 0) {
                r1 = J2L.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1260790257, "com.instagram.creation.genai.memu.settings.SettingSwitch (MemuSettingsComposables.kt:58)");
            }
            C52636GaA.A0H(r9, (Modifier) null, new C57125IPo(r1, z4, false), C288035bG.A00(r9, i7), i4 & 896, 130810, z3);
            if (0fL.A02()) {
                0fL.A00(1289431522);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            boolean z5 = z3;
            int i10 = i7;
            0sP r13 = r1;
            ASQ.A06 = new J89(r13, i10, i6, i5, z4, z5);
        }
    }

    public static final void A00(C286575Wy r8, int i) {
        C286575Wy r2 = r8;
        r8.ExV(-867674066);
        if (i != 0 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1669160208, "com.instagram.creation.genai.memu.settings.MemuSettingsDivider (MemuSettingsComposables.kt:48)");
            }
            C56618I4t.A02(r2, C287205Zk.A08(Modifier.A00, 6.0f), 0.0f, 6, 4, C51966G9m.A0C(r8));
            if (0fL.A02()) {
                0fL.A00(2130496923);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 31);
        }
    }

    public static final void A01(C286575Wy r2, int i, int i2) {
        int i3;
        r2.ExV(-555839344);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r2, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2003262537, "com.instagram.creation.genai.memu.settings.Header (MemuSettingsComposables.kt:43)");
            }
            C52747Gbz.A04(r2, C288035bG.A00(r2, i));
            if (0fL.A02()) {
                0fL.A00(-1257348456);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            C59347JFz.A00(ASQ, i, i2, 6);
        }
    }
}
