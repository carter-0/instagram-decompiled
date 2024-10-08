package X;

import android.app.Activity;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.I5v  reason: case insensitive filesystem */
public abstract class C56640I5v {
    public static final void A02(C286575Wy r40, Modifier modifier, AnonymousClass0iw r42, C46756Dkj dkj, C62320sa r44, C62320sa r45, C62320sa r46, C62320sa r47, C62320sa r48, 0sP r49, 0sP r50, int i, int i2, boolean z) {
        int i3;
        int i4;
        C62320sa r12 = r44;
        C62320sa r11 = r45;
        boolean A1U = AnonymousClass7TF.A1U(0, r12, r11);
        C62320sa r7 = r46;
        0qQ.A0B(r7, 2);
        C62320sa r6 = r47;
        C62320sa r5 = r48;
        0sP r2 = r49;
        0sP r1 = r50;
        C51974G9v.A0d(3, r6, r2, r1, r5);
        Modifier modifier2 = modifier;
        AnonymousClass0iw r14 = r42;
        C46756Dkj dkj2 = dkj;
        C51973G9u.A0t(7, dkj2, r14, modifier2);
        C286575Wy r4 = r40;
        r4.ExV(-471704342);
        int i5 = i;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r4, r12) | i;
        } else {
            i3 = i5;
        }
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r4, r11);
        }
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r4, r7);
        }
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r4, r6);
        }
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r4, r2);
        }
        if ((196608 & i) == 0) {
            i3 |= G9t.A0J(r4, r1);
        }
        if ((i & 1572864) == 0) {
            i3 |= G9t.A0K(r4, r5);
        }
        if ((12582912 & i) == 0) {
            i3 |= G9t.A0L(r4, dkj2);
        }
        if ((100663296 & i) == 0) {
            i3 |= G9t.A0M(r4, r14);
        }
        if ((805306368 & i) == 0) {
            i3 |= G9t.A0X(r4, modifier2);
        }
        int i6 = i2;
        boolean z2 = z;
        if ((i2 & 6) == 0) {
            i4 = i2 | G9t.A0Y(r4, z2);
        } else {
            i4 = i6;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && r4.Bwn()) {
            r4.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1130416523, "com.instagram.opal.impl.ui.OpalEditContent (OpalEditContent.kt:82)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r4, dkj2.A05, 0);
            C51965G9l.A1X(r4, false);
            UserSession A0f = C51970G9q.A0f(r4);
            Object A16 = C51966G9m.A16(r4);
            0qQ.A0C(A16, "null cannot be cast to non-null type android.app.Activity");
            C304846Fl.A01((C304806Fh) null, r4, modifier2, (AnonymousClass5S2) null, AnonymousClass5PI.A01(r4, new JCE((Activity) A16, (C284945Oz) C51974G9v.A0Z(r4, C51967G9n.A0m(r4, -12211072), AnonymousClass5XT.A00, false), A02, r14, A0f, r6, r12, r7, r5, r11, r2, r1, z2), -2008309268), 0.0f, ((i3 >> 27) & 14) | 1572864, 62, 0, 0);
            if (0fL.A02()) {
                0fL.A00(-1878482277);
            }
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            boolean z3 = z2;
            C62320sa r16 = r5;
            C46756Dkj dkj3 = dkj2;
            0sP r18 = r2;
            C62320sa r19 = r6;
            ASQ.A06 = new C59256JCi(modifier2, r16, dkj3, r18, r19, r11, r1, r7, r12, r14, i5, i6, A1U ? 1 : 0, z3);
        }
    }

    public static final void A04(AnonymousClass0iw r7, UserSession userSession, String str) {
        C49049EoT.A00(r7, userSession, "tap", str, "edit_opal", userSession.A06, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r18, androidx.compose.ui.Alignment r19, androidx.compose.ui.Modifier r20, X.AnonymousClass5Z4 r21, java.lang.String r22, X.0sL r23, int r24, int r25, long r26, boolean r28) {
        /*
            r9 = r19
            r4 = r20
            r0 = 3
            r8 = r22
            X.0qQ.A0B(r8, r0)
            r0 = -357287667(0xffffffffeab4390d, float:-1.0893803E26)
            r10 = r18
            r10.ExV(r0)
            r17 = r25
            r0 = r25 & 1
            r6 = r24
            r5 = r28
            if (r0 == 0) goto L_0x0135
            r0 = r24 | 6
        L_0x001e:
            r1 = r25 & 2
            r14 = r26
            if (r1 == 0) goto L_0x012a
            r0 = r0 | 48
        L_0x0026:
            r1 = r25 & 4
            r28 = r21
            if (r1 == 0) goto L_0x011d
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r1 = r25 & 8
            if (r1 == 0) goto L_0x0112
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r11 = r25 & 16
            if (r11 == 0) goto L_0x0107
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r3 = r25 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L_0x0048
            r1 = r1 & r24
            if (r1 != 0) goto L_0x0049
            int r1 = X.G9t.A0T(r10, r9)
        L_0x0048:
            r0 = r0 | r1
        L_0x0049:
            r2 = r25 & 64
            r1 = 1572864(0x180000, float:2.204052E-39)
            r7 = r23
            if (r2 != 0) goto L_0x0059
            r1 = r24 & r1
            if (r1 != 0) goto L_0x005a
            int r1 = X.G9t.A0K(r10, r7)
        L_0x0059:
            r0 = r0 | r1
        L_0x005a:
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r0
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r1) goto L_0x0086
            boolean r1 = r10.Bwn()
            if (r1 == 0) goto L_0x0086
            r10.Evl()
        L_0x006c:
            X.5Xd r0 = r10.ASQ()
            if (r0 == 0) goto L_0x0085
            X.JAU r10 = new X.JAU
            r20 = r5
            r18 = r14
            r15 = r7
            r16 = r6
            r13 = r28
            r14 = r8
            r11 = r9
            r12 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r20)
            r0.A06 = r10
        L_0x0085:
            return
        L_0x0086:
            if (r11 == 0) goto L_0x008a
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
        L_0x008a:
            if (r3 == 0) goto L_0x008e
            androidx.compose.ui.Alignment r9 = X.C287215Zl.A0E
        L_0x008e:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x009c
            r2 = -889725187(0xffffffffcaf7defd, float:-8122238.5)
            java.lang.String r1 = "com.instagram.opal.impl.ui.TextDecorationBox (OpalEditContent.kt:331)"
            X.0fL.A01(r2, r1)
        L_0x009c:
            r3 = 0
            X.5RD r11 = X.C287675aa.A00(r9, r3)
            int r13 = X.C287425a7.A00(r10)
            r2 = r10
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r1 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r10, r4)
            X.C51973G9u.A0y(r10, r2)
            X.C51971G9r.A12(r10, r11, r1)
            X.0sL r11 = X.C287485aD.A02
            boolean r1 = r2.A0K
            if (r1 != 0) goto L_0x00c2
            boolean r1 = X.C51972G9s.A1Q(r10, r13)
            if (r1 != 0) goto L_0x00c5
        L_0x00c2:
            X.C51971G9r.A13(r10, r11, r13)
        L_0x00c5:
            X.C51965G9l.A18(r10, r12)
            r1 = -976438196(0xffffffffc5ccbc4c, float:-6551.537)
            r10.ExS(r1)
            if (r5 != 0) goto L_0x00f1
            r19 = 0
            r22 = 1
            int r1 = r0 >> 9
            r23 = r1 & 14
            int r1 = r0 << 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r23 = r23 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            int r11 = r0 << 6
            r1 = r1 & r11
            r1 = r1 | 390(0x186, float:5.47E-43)
            r25 = 11258(0x2bfa, float:1.5776E-41)
            r20 = r28
            r21 = r8
            r24 = r1
            X.AnonymousClass5ZZ.A0D(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00f1:
            X.C286565Wx.A0L(r2, r3)
            int r0 = r0 >> 18
            X.C51972G9s.A11(r10, r7, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006c
            r0 = 1562727(0x17d867, float:2.189847E-39)
            X.0fL.A00(r0)
            goto L_0x006c
        L_0x0107:
            r1 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x003a
            int r1 = X.G9t.A0S(r10, r4)
            r0 = r0 | r1
            goto L_0x003a
        L_0x0112:
            r1 = r6 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0034
            int r1 = X.G9t.A0R(r10, r8)
            r0 = r0 | r1
            goto L_0x0034
        L_0x011d:
            r1 = r6 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002e
            r1 = r28
            int r1 = X.G9t.A0Q(r10, r1)
            r0 = r0 | r1
            goto L_0x002e
        L_0x012a:
            r1 = r24 & 48
            if (r1 != 0) goto L_0x0026
            int r1 = X.G9t.A0C(r10, r14)
            r0 = r0 | r1
            goto L_0x0026
        L_0x0135:
            r0 = r24 & 6
            if (r0 != 0) goto L_0x0141
            int r0 = X.G9t.A0Y(r10, r5)
            r0 = r0 | r24
            goto L_0x001e
        L_0x0141:
            r0 = r6
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56640I5v.A00(X.5Wy, androidx.compose.ui.Alignment, androidx.compose.ui.Modifier, X.5Z4, java.lang.String, X.0sL, int, int, long, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r53, androidx.compose.ui.Modifier r54, X.AnonymousClass0iw r55, X.HLJ r56, java.lang.String r57, X.0sP r58, int r59, int r60, boolean r61) {
        /*
            r20 = r61
            r1 = 791546797(0x2f2e0bad, float:1.5829356E-10)
            r0 = r53
            r0.ExV(r1)
            r48 = r60
            r1 = r60 & 1
            r21 = 1
            r50 = r58
            r3 = r59
            if (r1 == 0) goto L_0x025f
            r1 = r59 | 6
        L_0x0018:
            r2 = r60 & 2
            r51 = r57
            if (r2 == 0) goto L_0x0252
            r1 = r1 | 48
        L_0x0020:
            r2 = r60 & 4
            r52 = r56
            if (r2 == 0) goto L_0x0245
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r2 = r60 & 8
            r53 = r55
            if (r2 == 0) goto L_0x0238
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r2 = r60 & 16
            if (r2 == 0) goto L_0x022b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r5 = r60 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x0046
            r2 = r2 & r59
            if (r2 != 0) goto L_0x0047
            r2 = r20
            int r2 = X.G9t.A0d(r0, r2)
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r2) goto L_0x0079
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0079
            r0.Evl()
        L_0x0059:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0078
            r49 = 3
            X.JAl r0 = new X.JAl
            r41 = r0
            r42 = r53
            r43 = r50
            r44 = r54
            r45 = r52
            r46 = r51
            r47 = r3
            r50 = r20
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1.A06 = r0
        L_0x0078:
            return
        L_0x0079:
            r2 = r20
            boolean r20 = X.C51966G9m.A1R(r5, r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x008d
            r4 = -263594126(0xfffffffff049df72, float:-2.4990646E29)
            java.lang.String r2 = "com.instagram.opal.impl.ui.ProfilePropertyRow (OpalEditContent.kt:239)"
            X.0fL.A01(r4, r2)
        L_0x008d:
            java.lang.Object r2 = X.C51965G9l.A0r(r0)
            r15 = 0
            X.5Oz r14 = X.C287175Zh.A00(r0, r2)
            X.4bM r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A03
            X.5Oz r19 = X.C51968G9o.A0M(r0, r2)
            r4 = 0
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A04(r54)
            X.5RD r6 = X.C51968G9o.A0V(r0)
            int r10 = X.C287425a7.A00(r0)
            r2 = r0
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r5 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r0, r7)
            X.0sa r8 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r2, r8)
            X.0sL r7 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r0, r6, r5, r7)
            X.0sL r6 = X.C287485aD.A02
            boolean r5 = r2.A0K
            if (r5 != 0) goto L_0x00cb
            boolean r5 = X.C51972G9s.A1Q(r0, r10)
            if (r5 != 0) goto L_0x00ce
        L_0x00cb:
            X.C51971G9r.A13(r0, r6, r10)
        L_0x00ce:
            X.0sL r17 = X.C51966G9m.A1K(r0, r9)
            X.6FX r12 = X.AnonymousClass6FX.A00
            int r5 = r52.ordinal()
            if (r5 == r15) goto L_0x0226
            r9 = r21
            if (r5 != r9) goto L_0x0275
            r9 = 2131968860(0x7f13435c, float:1.9574627E38)
        L_0x00e1:
            java.lang.String r25 = X.C304346Dc.A00(r0, r9)
            r34 = 0
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            r10 = 1119354880(0x42b80000, float:92.0)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A0D(r9, r10)
            r10 = 1086324736(0x40c00000, float:6.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r11, r4, r4, r10, r4)
            X.5Zp r10 = X.C287215Zl.A04
            androidx.compose.ui.Modifier r23 = r12.AB1(r10, r11)
            long r32 = X.C51966G9m.A0H(r0)
            r42 = 0
            r16 = 2
            X.5Z4 r24 = X.C51966G9m.A0g(r0)
            r30 = 384(0x180, float:5.38E-43)
            r31 = 12280(0x2ff8, float:1.7208E-41)
            r22 = r0
            r26 = r15
            r27 = r15
            r28 = r16
            r29 = r15
            X.AnonymousClass5ZZ.A0B(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.ui.Modifier r13 = X.C51966G9m.A0T(r9)
            X.5RD r12 = X.C51969G9p.A0Z(r0, r15)
            int r11 = X.C287425a7.A00(r0)
            X.5RM r10 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r0, r13)
            X.C51973G9u.A0z(r0, r2, r8)
            X.C287595aO.A00(r0, r12, r7)
            r7 = r18
            boolean r7 = X.C51965G9l.A1Y(r0, r2, r10, r7)
            if (r7 != 0) goto L_0x0140
            boolean r7 = X.C51972G9s.A1Q(r0, r11)
            if (r7 != 0) goto L_0x0143
        L_0x0140:
            X.C51971G9r.A13(r0, r6, r11)
        L_0x0143:
            r6 = r17
            X.C287595aO.A00(r0, r9, r6)
            r6 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A09(r13, r4, r6)
            r4 = -1041845656(0xffffffffc1e6b268, float:-28.837112)
            r0.ExS(r4)
            r7 = r1 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            boolean r10 = X.AnonymousClass7TF.A1S(r7, r6)
            boolean r8 = r0.AGu(r14)
            r4 = r53
            boolean r4 = X.C51968G9o.A1T(r0, r4, r8, r10)
            java.lang.Object r8 = r0.ECw()
            if (r4 != 0) goto L_0x0170
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r8 != r4) goto L_0x017a
        L_0x0170:
            r10 = 16
            r8 = r52
            r4 = r53
            X.J6m r8 = X.C59104J6m.A00(r0, r8, r4, r14, r10)
        L_0x017a:
            X.0sP r8 = X.C51965G9l.A0z(r2, r8)
            androidx.compose.ui.focus.FocusChangedElement r4 = new androidx.compose.ui.focus.FocusChangedElement
            r4.<init>(r8)
            androidx.compose.ui.Modifier r23 = r9.Ezh(r4)
            X.5Z4 r8 = X.C51966G9m.A0g(r0)
            long r40 = X.C51966G9m.A0H(r0)
            r39 = 6291454(0x5ffffe, float:8.816205E-39)
            X.5Z4 r4 = new X.5Z4
            r33 = r4
            r35 = r34
            r36 = r34
            r37 = r15
            r38 = r15
            r44 = r42
            r46 = r42
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r42, r44, r46)
            X.5Z4 r25 = r8.A0D(r4)
            if (r5 == r15) goto L_0x0223
            r4 = r21
            if (r5 != r4) goto L_0x0270
            r29 = 5
        L_0x01b1:
            long r4 = X.C51966G9m.A0H(r0)
            X.6Fe r8 = new X.6Fe
            r8.<init>(r4)
            r4 = -1041865221(0xffffffffc1e665fb, float:-28.799795)
            boolean r5 = X.C51972G9s.A1R(r0, r4, r7, r6)
            r4 = r19
            boolean r6 = r0.AGu(r4)
            r6 = r6 | r5
            boolean r4 = X.C51973G9u.A1G(r1)
            r6 = r6 | r4
            java.lang.Object r5 = r0.ECw()
            if (r6 != 0) goto L_0x01d7
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r5 != r4) goto L_0x01e3
        L_0x01d7:
            r7 = 17
            r6 = r52
            r5 = r50
            r4 = r19
            X.J6m r5 = X.C59104J6m.A00(r0, r6, r5, r4, r7)
        L_0x01e3:
            X.0sP r27 = X.C51965G9l.A0z(r2, r5)
            r9 = -1673144522(0xffffffff9c45d736, float:-6.5459986E-22)
            X.JGg r7 = new X.JGg
            r6 = r51
            r5 = r52
            r4 = r16
            r7.<init>(r6, r5, r4)
            X.5PJ r28 = X.AnonymousClass5PI.A01(r0, r7, r9)
            int r1 = r1 >> 3
            r31 = r1 & 14
            r32 = 14808(0x39d8, float:2.075E-41)
            r24 = r8
            r26 = r6
            r30 = r21
            r33 = r15
            X.I5J.A02(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1 = -1041787507(0xffffffffc1e7958d, float:-28.948023)
            r0.ExS(r1)
            if (r20 == 0) goto L_0x0215
            X.C56618I4t.A01(r0, r13)
        L_0x0215:
            boolean r1 = X.C51973G9u.A1R(r0, r2)
            if (r1 == 0) goto L_0x0059
            r1 = 250750642(0xef226b2, float:5.969487E-30)
            X.0fL.A00(r1)
            goto L_0x0059
        L_0x0223:
            r29 = 2
            goto L_0x01b1
        L_0x0226:
            r9 = 2131968862(0x7f13435e, float:1.957463E38)
            goto L_0x00e1
        L_0x022b:
            r2 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0036
            r2 = r54
            int r2 = X.G9t.A0S(r0, r2)
            r1 = r1 | r2
            goto L_0x0036
        L_0x0238:
            r2 = r3 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0030
            r2 = r53
            int r2 = X.G9t.A0H(r0, r2)
            r1 = r1 | r2
            goto L_0x0030
        L_0x0245:
            r2 = r3 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0028
            r2 = r52
            int r2 = X.G9t.A0Q(r0, r2)
            r1 = r1 | r2
            goto L_0x0028
        L_0x0252:
            r2 = r59 & 48
            if (r2 != 0) goto L_0x0020
            r2 = r51
            int r2 = X.G9t.A0P(r0, r2)
            r1 = r1 | r2
            goto L_0x0020
        L_0x025f:
            r1 = r59 & 6
            if (r1 != 0) goto L_0x026d
            r1 = r50
            int r1 = X.C41848B3p.A01(r0, r1)
            r1 = r1 | r59
            goto L_0x0018
        L_0x026d:
            r1 = r3
            goto L_0x0018
        L_0x0270:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0275:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56640I5v.A01(X.5Wy, androidx.compose.ui.Modifier, X.0iw, X.HLJ, java.lang.String, X.0sP, int, int, boolean):void");
    }

    public static final void A03(Modifier modifier, C286575Wy r15, int i, int i2) {
        int i3;
        C286575Wy r12 = r15;
        r15.ExV(838631062);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r15, i5) | i2;
        } else {
            i3 = i4;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r15, modifier);
        }
        if ((i3 & 19) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-384023925, "com.instagram.opal.impl.ui.AudienceRow (OpalEditContent.kt:350)");
            }
            AnonymousClass5RD A0s = G9t.A0s(C287275Zs.A01, r15, C287215Zl.A05, (i3 >> 3) & 14);
            int A00 = C287425a7.A00(r15);
            C286565Wx r9 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r15, modifier);
            C51973G9u.A0y(r15, r9);
            C51971G9r.A12(r15, A0s, A04);
            0sL r1 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A01);
            AnonymousClass6FX r6 = AnonymousClass6FX.A00;
            String A002 = C304346Dc.A00(r15, 2131968836);
            C285245Qk r8 = Modifier.A00;
            Modifier A003 = r6.A00(r8);
            C287245Zp r2 = C287215Zl.A04;
            AnonymousClass5ZZ.A0Q(r12, r6.AB1(r2, A003), C51966G9m.A0g(r12), A002, C51966G9m.A0H(r12));
            r12.ExS(623228798);
            if (i5 > 0) {
                AnonymousClass5ZZ.A0d(r12, r6.AB1(r2, C51967G9n.A0E(r8, 8.0f)), String.valueOf(i5), C51966G9m.A0M(r12));
            }
            C286565Wx.A0L(r9, false);
            C288165bT.A05(r12, r6.AB1(r2, C287205Zk.A03(C51967G9n.A0E(r8, 8.0f))), C287975bA.A00(r12, R.drawable.instagram_chevron_right_pano_outline_24, 0), C51966G9m.A0L(r12));
            if (C51967G9n.A1R(r12)) {
                0fL.A00(716155206);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier2, i5, i4, 17);
        }
    }
}
