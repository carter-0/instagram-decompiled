package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class I55 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: X.JVr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.JVr} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01bf, code lost:
        if (r8 == r2) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c1, code lost:
        r18 = new X.C59733JVr(3, r1, r5, r10, r28, r6, r3, r17);
        r7.FLL(r18);
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01db, code lost:
        r8 = X.C51965G9l.A0y(r0, r8, false);
        r3 = X.C304346Dc.A00(r7, 2131965530);
        r14 = X.C51973G9u.A1S(r7, r5, r6, 54406365) | X.AnonymousClass7TF.A1S(r13, 4);
        r13 = r7.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f8, code lost:
        if (r14 != false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fa, code lost:
        if (r13 != r2) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fc, code lost:
        r13 = new X.C20704Wxb(6, r28, r6, r5);
        r7.FLL(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0206, code lost:
        X.I7L.A07(r7, r12, r3, r8, X.C51965G9l.A0y(r0, r13, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0211, code lost:
        if (X.C51967G9n.A1R(r7) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0213, code lost:
        X.0fL.A00(314443306);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r23, X.AnonymousClass9FM r24, X.AnonymousClass39A r25, X.C2376138k r26, X.C62320sa r27, int r28) {
        /*
            r0 = -443465898(0xffffffffe5913f56, float:-8.5738935E22)
            r7 = r23
            r7.ExV(r0)
            r4 = r28
            r0 = r28 & 6
            r28 = r27
            if (r0 != 0) goto L_0x0226
            r0 = r28
            int r8 = X.C41848B3p.A01(r7, r0)
            r8 = r8 | r4
        L_0x0017:
            r0 = r4 & 48
            r5 = r26
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0F(r7, r5)
            r8 = r8 | r0
        L_0x0022:
            r0 = r4 & 384(0x180, float:5.38E-43)
            r10 = r24
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0G(r7, r10)
            r8 = r8 | r0
        L_0x002d:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            r6 = r25
            if (r0 != 0) goto L_0x0038
            int r0 = X.G9t.A0H(r7, r6)
            r8 = r8 | r0
        L_0x0038:
            r1 = r8 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x005d
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x005d
            r7.Evl()
        L_0x0047:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x005c
            r13 = 19
            X.JG7 r0 = new X.JG7
            r7 = r0
            r8 = r28
            r9 = r6
            r11 = r5
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.A06 = r0
        L_0x005c:
            return
        L_0x005d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006b
            r1 = -1737462334(0xffffffff98706dc2, float:-3.1074687E-24)
            java.lang.String r0 = "com.instagram.release.lockout.ExpiredLockoutScreen (LockoutFragment.kt:195)"
            X.0fL.A01(r1, r0)
        L_0x006b:
            android.content.Context r3 = X.C51970G9q.A0N(r7)
            int r1 = r10.A00
            com.instagram.release.buildinfo.BuildInfoStore r0 = r10.A02
            X.9J7 r0 = r0.A01
            int r0 = r0.A01
            boolean r17 = X.AnonymousClass7TF.A1T(r1, r0)
            long r11 = X.C61120lW.A01(r3)
            r20 = 0
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r0 = r0 - r11
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r11
            int r14 = (int) r0
            java.lang.String r2 = X.C49114Epd.A00(r3)
            r9 = 0
            X.0qQ.A0B(r3, r9)
            android.content.pm.PackageManager r11 = r3.getPackageManager()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = X.0oI.A02
            java.lang.String r1 = r11.getInstallerPackageName(r1)     // Catch:{ IllegalArgumentException -> 0x00a9 }
            if (r1 != 0) goto L_0x00ae
            goto L_0x00ac
        L_0x00a9:
            java.lang.String r1 = "unknown"
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r1 = ""
        L_0x00ae:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00c4
            java.lang.String r0 = "Installer: %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            if (r1 == 0) goto L_0x00c4
            r0 = 10
            java.lang.String r0 = X.002.A0D(r1, r0)
            if (r0 != 0) goto L_0x00c6
        L_0x00c4:
            java.lang.String r0 = ""
        L_0x00c6:
            java.lang.String r22 = X.002.A0R(r2, r0)
            r0 = -476681433(0xffffffffe3966b27, float:-5.5494655E21)
            java.lang.Object r0 = X.C51967G9n.A0m(r7, r0)
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            java.lang.Object r1 = X.C51974G9v.A0Z(r7, r0, r2, r9)
            X.5Oz r1 = (X.C284945Oz) r1
            X.5Wx r0 = X.C51965G9l.A0H(r7, r9)
            r11 = -476679731(0xffffffffe39671cd, float:-5.5504236E21)
            r7.ExS(r11)
            boolean r11 = X.C51971G9r.A1W(r1)
            if (r11 == 0) goto L_0x012b
            r11 = -476677170(0xffffffffe3967bce, float:-5.5518654E21)
            java.lang.Object r11 = X.C51967G9n.A0m(r7, r11)
            if (r11 != r2) goto L_0x00fc
            r12 = 10
            X.G0g r11 = new X.G0g
            r11.<init>(r1, r12)
            r7.FLL(r11)
        L_0x00fc:
            X.0sa r12 = X.C51965G9l.A0y(r0, r11, r9)
            r11 = -476674776(0xffffffffe3968528, float:-5.553213E21)
            boolean r11 = X.C51973G9u.A1S(r7, r5, r3, r11)
            boolean r11 = X.C51966G9m.A1U(r7, r6, r11)
            boolean r13 = X.C51973G9u.A1G(r8)
            r13 = r13 | r11
            java.lang.Object r11 = r7.ECw()
            if (r13 != 0) goto L_0x0118
            if (r11 != r2) goto L_0x0123
        L_0x0118:
            r13 = 17
            r11 = r28
            X.Iw8 r11 = X.C58699Iw8.A00(r3, r6, r11, r5, r13)
            r7.FLL(r11)
        L_0x0123:
            X.0sa r13 = X.C51965G9l.A0y(r0, r11, r9)
            r11 = 6
            A03(r7, r12, r13, r11)
        L_0x012b:
            X.C286565Wx.A0L(r0, r9)
            r16 = 4
            r12 = 2131237836(0x7f081bcc, float:1.8091934E38)
            r11 = 1113587712(0x42600000, float:56.0)
            X.Gph r13 = new X.Gph
            r13.<init>(r11, r12)
            r11 = 2131965532(0x7f13365c, float:1.9567877E38)
            java.lang.String r23 = X.C304346Dc.A00(r7, r11)
            r12 = 2131965523(0x7f133653, float:1.9567858E38)
            java.lang.Object[] r11 = X.AnonymousClass7TF.A1b(r14)
            java.lang.String r21 = X.C304346Dc.A01(r7, r11, r12)
            r11 = 6
            r27 = 3942(0xf66, float:5.524E-42)
            r24 = r20
            r25 = r20
            r26 = r9
            r18 = r7
            r19 = r13
            X.I7M.A06(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.5Zx r13 = X.C287275Zs.A06
            X.5Qk r14 = androidx.compose.ui.Modifier.A00
            X.5Zr r12 = X.C287215Zl.A02
            X.5RD r13 = X.C291495hO.A02(r13, r7, r12, r11)
            int r15 = X.C287425a7.A00(r7)
            X.5RM r12 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r7, r14)
            X.C51973G9u.A0y(r7, r0)
            X.C51971G9r.A12(r7, r13, r12)
            X.0sL r13 = X.C287485aD.A02
            boolean r12 = r0.A0K
            if (r12 != 0) goto L_0x0184
            boolean r12 = X.C51972G9s.A1Q(r7, r15)
            if (r12 != 0) goto L_0x0187
        L_0x0184:
            X.C51971G9r.A13(r7, r13, r15)
        L_0x0187:
            X.C51965G9l.A18(r7, r14)
            if (r17 == 0) goto L_0x021b
            r12 = 54376084(0x33db694, float:5.5751697E-37)
            r7.ExS(r12)
            r12 = 2131965525(0x7f133655, float:1.9567862E38)
        L_0x0195:
            java.lang.String r12 = X.C304346Dc.A00(r7, r12)
            X.C286565Wx.A0L(r0, r9)
            r14 = 54381149(0x33dca5d, float:5.577441E-37)
            r13 = r17
            boolean r14 = X.C51967G9n.A1W(r7, r14, r13)
            boolean r13 = r7.AGw(r10)
            boolean r14 = X.C51973G9u.A1T(r7, r3, r6, r14, r13)
            r13 = r8 & 14
            r8 = r16
            boolean r8 = X.AnonymousClass7TF.A1S(r13, r8)
            boolean r14 = X.C51968G9o.A1T(r7, r5, r14, r8)
            java.lang.Object r8 = r7.ECw()
            if (r14 != 0) goto L_0x01c1
            if (r8 != r2) goto L_0x01db
        L_0x01c1:
            r19 = 3
            X.JVr r8 = new X.JVr
            r18 = r8
            r20 = r1
            r21 = r5
            r22 = r10
            r23 = r28
            r24 = r6
            r25 = r3
            r26 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r7.FLL(r8)
        L_0x01db:
            X.0sa r8 = X.C51965G9l.A0y(r0, r8, r9)
            r1 = 2131965530(0x7f13365a, float:1.9567872E38)
            java.lang.String r3 = X.C304346Dc.A00(r7, r1)
            r1 = 54406365(0x33e2cdd, float:5.588748E-37)
            boolean r14 = X.C51973G9u.A1S(r7, r5, r6, r1)
            r1 = r16
            boolean r1 = X.AnonymousClass7TF.A1S(r13, r1)
            r14 = r14 | r1
            java.lang.Object r13 = r7.ECw()
            if (r14 != 0) goto L_0x01fc
            if (r13 != r2) goto L_0x0206
        L_0x01fc:
            X.Wxb r13 = new X.Wxb
            r1 = r28
            r13.<init>(r11, r1, r6, r5)
            r7.FLL(r13)
        L_0x0206:
            X.0sa r0 = X.C51965G9l.A0y(r0, r13, r9)
            X.I7L.A07(r7, r12, r3, r8, r0)
            boolean r0 = X.C51967G9n.A1R(r7)
            if (r0 == 0) goto L_0x0047
            r0 = 314443306(0x12be062a, float:1.1992205E-27)
            X.0fL.A00(r0)
            goto L_0x0047
        L_0x021b:
            r12 = 54378187(0x33dbecb, float:5.5761128E-37)
            r7.ExS(r12)
            r12 = 2131965533(0x7f13365d, float:1.9567879E38)
            goto L_0x0195
        L_0x0226:
            r8 = r4
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I55.A00(X.5Wy, X.9FM, X.39A, X.38k, X.0sa, int):void");
    }

    public static final void A01(C286575Wy r18, AnonymousClass39A r19, C2376138k r20, C62320sa r21, int i, boolean z) {
        int i2;
        String A00;
        C286575Wy r7 = r18;
        r7.ExV(1274538446);
        int i3 = i;
        C62320sa r3 = r21;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, r3) | i;
        } else {
            i2 = i3;
        }
        C2376138k r4 = r20;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r4);
        }
        AnonymousClass39A r5 = r19;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r7, r5);
        }
        if ((i2 & 147) != 146 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(468273424, "com.instagram.release.lockout.LockoutScreen (LockoutFragment.kt:131)");
            }
            Object A16 = C51966G9m.A16(r7);
            boolean A03 = r4.A03();
            Object A0m = C51967G9n.A0m(r7, -962689802);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r11 = (C284945Oz) C51974G9v.A0Z(r7, A0m, obj, false);
            C286565Wx r1 = (C286565Wx) r7;
            C286565Wx.A0L(r1, false);
            r7.ExS(-962688109);
            if (C51971G9r.A1W(r11)) {
                Object A0m2 = C51967G9n.A0m(r7, -962685474);
                if (A0m2 == obj) {
                    A0m2 = new C51764G0g(r11, 11);
                    r7.FLL(A0m2);
                }
                C62320sa A0y = C51965G9l.A0y(r1, A0m2, false);
                boolean A1U = C51966G9m.A1U(r7, r5, C51973G9u.A1S(r7, r4, A16, -962683061)) | AnonymousClass7TF.A1S(i2 & 14, 4);
                Object ECw = r7.ECw();
                if (A1U || ECw == obj) {
                    ECw = C58699Iw8.A00(A16, r5, r3, r4, 18);
                    r7.FLL(ECw);
                }
                A02(r7, A0y, C51965G9l.A0y(r1, ECw, false), 6);
            }
            C286565Wx.A0L(r1, false);
            C53511Gph gph = new C53511Gph(56.0f, R.drawable.f7instagram);
            String A002 = C304346Dc.A00(r7, 2131965531);
            if (A03) {
                r7.ExS(222135645);
                A00 = 002.A0R(C304346Dc.A00(r7, 2131965522), C304346Dc.A00(r7, 2131965524));
            } else {
                r7.ExS(-962661927);
                A00 = C304346Dc.A00(r7, 2131965522);
            }
            C286565Wx.A0L(r1, false);
            I7M.A08(r7, gph, A00, A002, 0, 4070);
            C287325Zx r10 = C287275Zs.A06;
            C285245Qk r14 = Modifier.A00;
            AnonymousClass5RD A02 = C291495hO.A02(r10, r7, C287215Zl.A02, 6);
            int A003 = C287425a7.A00(r7);
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r7, r14);
            C51973G9u.A0y(r7, r1);
            C51971G9r.A12(r7, A02, A04);
            0sL r102 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r7, A003)) {
                C51971G9r.A13(r7, r102, A003);
            }
            C51965G9l.A18(r7, A01);
            if (A03) {
                r7.ExS(1438934872);
                String A004 = C304346Dc.A00(r7, 2131965526);
                Object A0m3 = C51967G9n.A0m(r7, 184968764);
                if (A0m3 == obj) {
                    A0m3 = new C51764G0g(r11, 12);
                    r7.FLL(A0m3);
                }
                I7L.A0B(C51965G9l.A0y(r1, A0m3, false), A004, r7, 48);
            } else {
                r7.ExS(1439134481);
                String A005 = C304346Dc.A00(r7, 2131965526);
                Object A0m4 = C51967G9n.A0m(r7, 184974812);
                if (A0m4 == obj) {
                    A0m4 = new C51764G0g(r11, 13);
                    r7.FLL(A0m4);
                }
                C62320sa A0y2 = C51965G9l.A0y(r1, A0m4, false);
                String A006 = C304346Dc.A00(r7, 2131965530);
                boolean A1S = C51973G9u.A1S(r7, r4, r5, 184979884) | C51968G9o.A1R(i2);
                Object ECw2 = r7.ECw();
                if (A1S || ECw2 == obj) {
                    ECw2 = new C20704Wxb(7, r3, r5, r4);
                    r7.FLL(ECw2);
                }
                I7L.A08(r7, A005, A006, A0y2, C51965G9l.A0y(r1, ECw2, false), 48);
            }
            if (C51971G9r.A1S(r7, r1, false)) {
                0fL.A00(-352147489);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            C62320sa r9 = r3;
            AnonymousClass39A r8 = r5;
            C2376138k r72 = r4;
            ASQ.A06 = new J8U(r72, r8, r9, i3, 8, z);
        }
    }

    public static final void A02(C286575Wy r9, C62320sa r10, C62320sa r11, int i) {
        int i2;
        C286575Wy r4 = r9;
        r9.ExV(1838211607);
        C62320sa r8 = r10;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, r10) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, r11);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1692643139, "com.instagram.release.lockout.GooglePlayEnrollmentPrompt (LockoutFragment.kt:180)");
            }
            C56632I5m.A04(r4, HXM.A00(r9, (Integer) null, r11, 2131968772, 14), C304346Dc.A00(r9, 2131965521), C304346Dc.A00(r9, 2131965520), r8, i2 & 14, 4080);
            if (0fL.A02()) {
                0fL.A00(-1625389761);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r8, r11, i, 2);
        }
    }

    public static final void A03(C286575Wy r9, C62320sa r10, C62320sa r11, int i) {
        int i2;
        C286575Wy r4 = r9;
        r9.ExV(-629836337);
        C62320sa r8 = r10;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, r10) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, r11);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2123210219, "com.instagram.release.lockout.GooglePlayUninstallPrompt (LockoutFragment.kt:259)");
            }
            C56632I5m.A04(r4, HXM.A00(r9, (Integer) null, r11, 2131968772, 14), C304346Dc.A00(r9, 2131965528), C304346Dc.A00(r9, 2131965527), r8, i2 & 14, 4080);
            if (0fL.A02()) {
                0fL.A00(1835161915);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r8, r11, i, 3);
        }
    }
}
