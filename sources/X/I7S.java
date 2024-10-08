package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.ArrayList;
import java.util.List;

public abstract class I7S {
    public static final AnonymousClass62O A00 = AnonymousClass62Q.A04(HLI.MainFeed, HLI.Clips);

    public static final void A0A(AnonymousClass0iw r7, UserSession userSession, String str, String str2) {
        C49049EoT.A00(r7, userSession, str, str2, "opal_self_profile", userSession.A06, (String) null);
    }

    public static final void A0B(AnonymousClass0iw r7, UserSession userSession, String str, String str2, int i) {
        String str3;
        String A002;
        int ordinal = ((HLI) A00.get(i)).ordinal();
        if (ordinal == 0) {
            str3 = "post_tab";
        } else if (ordinal == 1) {
            str3 = "reel_tab";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        UserSession userSession2 = userSession;
        String str4 = str;
        if (2R8.A05(userSession, str)) {
            A002 = "opal_self_profile";
        } else {
            A002 = AnonymousClass000.A00(1650);
        }
        C49049EoT.A00(r7, userSession2, str2, str3, A002, str4, (String) null);
    }

    public static String A00(List list, int i) {
        return ((OpalAudienceSelectorRepository.OpalAudience) list.get(i)).A03;
    }

    public static final void A01(C286575Wy r17, Modifier modifier, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C286575Wy r6 = r17;
        r6.ExV(-179870339);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, modifier) | i;
        } else {
            i2 = i4;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1599922755, "com.instagram.opal.impl.ui.OpalStoryHighlights (OpalContent.kt:878)");
            }
            r6.AJO(C286955Yl.A00);
            Object A0m = C51967G9n.A0m(r6, -587412235);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = C51967G9n.A0e(r6, false);
            }
            boolean A1a = AnonymousClass7TE.A1a(A0m);
            C286565Wx A0H = C51965G9l.A0H(r6, false);
            if (!A1a) {
                if (0fL.A02()) {
                    0fL.A00(-177835875);
                }
                ASQ = r6.ASQ();
                if (ASQ != null) {
                    i3 = 32;
                    JGD.A01(ASQ, modifier, i4, i3);
                }
                return;
            }
            C56838IEj A002 = I28.A00(r6);
            Modifier A02 = C287435a8.A02(modifier, C287655aY.A00, new JGP(A002, false));
            AnonymousClass5RD A0K = G9w.A0K(C287275Zs.A05, r6);
            int A003 = C287425a7.A00(r6);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r6, A02);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r6, A0H, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A0K, A04, r12);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r6, A003)) {
                C51971G9r.A13(r6, r10, A003);
            }
            0sL A1K = C51966G9m.A1K(r6, A01);
            C285245Qk r3 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r6, 0);
            int A004 = C287425a7.A00(r6);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r6, r3);
            C51973G9u.A0z(r6, A0H, r13);
            C287595aO.A00(r6, A0Z, r12);
            if (C51965G9l.A1Y(r6, A0H, A042, A0w) || !C51972G9s.A1Q(r6, A004)) {
                C51971G9r.A13(r6, r10, A004);
            }
            C287595aO.A00(r6, A012, A1K);
            C304676Et r16 = C304676Et.A00;
            Modifier A0C = C287205Zk.A0C(r3, 56.0f);
            C304776Fe r8 = new C304776Fe(C51966G9m.A0G(r6));
            AnonymousClass5ZQ r7 = AnonymousClass5ZN.A00;
            Modifier A022 = C304816Fi.A02(A0C, r8, r7, 0.5f);
            AnonymousClass5RD A0Z2 = C51966G9m.A0Z(false);
            int A005 = C287425a7.A00(r6);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r6, A022);
            C51973G9u.A0z(r6, A0H, r13);
            C287595aO.A00(r6, A0Z2, r12);
            if (C51965G9l.A1Y(r6, A0H, A043, A0w) || !C51972G9s.A1Q(r6, A005)) {
                C51971G9r.A13(r6, r10, A005);
            }
            C287595aO.A00(r6, A013, A1K);
            C288165bT.A03(r6, C287205Zk.A04(r3), C287975bA.A00(r6, R.drawable.instagram_add_pano_outline_24, 0), C51966G9m.A0G(r6));
            r6.ASN();
            String A006 = C304346Dc.A00(r6, 2131956460);
            C286575Wy r82 = r6;
            AnonymousClass5ZZ.A0Q(r82, C51966G9m.A0S(r16, C287195Zj.A07(r3, 4.0f)), C51966G9m.A0b(r6), A006, C51966G9m.A0H(r6));
            r6.ASN();
            r6.ExS(1401123144);
            int i5 = 1;
            do {
                C287675aa.A02(r6, C304766Fd.A01(C287205Zk.A0C(r3, 56.0f), r7, C51966G9m.A08(r6)), 0);
                i5++;
            } while (i5 < 5);
            if (C51971G9r.A1S(r6, A0H, false)) {
                0fL.A00(-1554860175);
            }
        } else {
            r6.Evl();
        }
        ASQ = r6.ASQ();
        if (ASQ != null) {
            i3 = 33;
            JGD.A01(ASQ, modifier, i4, i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.G2q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.G2q} */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0138, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x013a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r24, androidx.compose.ui.Modifier r25, X.C61052Jvq r26, X.AnonymousClass0iw r27, com.instagram.common.typedurl.ImageUrl r28, java.lang.String r29, X.C62320sa r30, X.C62320sa r31, X.0sL r32, int r33, boolean r34) {
        /*
            r0 = 1451177669(0x567f36c5, float:7.0152675E13)
            r12 = r24
            r12.ExV(r0)
            r6 = r33
            r0 = r33 & 6
            r15 = r32
            if (r0 != 0) goto L_0x01c3
            int r16 = X.C41848B3p.A01(r12, r15)
            r16 = r16 | r33
        L_0x0016:
            r0 = r33 & 48
            r24 = r30
            if (r0 != 0) goto L_0x0024
            r0 = r24
            int r0 = X.G9t.A0F(r12, r0)
            r16 = r16 | r0
        L_0x0024:
            r0 = r6 & 384(0x180, float:5.38E-43)
            r7 = r31
            if (r0 != 0) goto L_0x0030
            int r0 = X.G9t.A0G(r12, r7)
            r16 = r16 | r0
        L_0x0030:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            r23 = r29
            if (r0 != 0) goto L_0x003e
            r0 = r23
            int r0 = X.G9t.A0R(r12, r0)
            r16 = r16 | r0
        L_0x003e:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            r31 = r28
            if (r0 != 0) goto L_0x004c
            r0 = r31
            int r0 = X.G9t.A0S(r12, r0)
            r16 = r16 | r0
        L_0x004c:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r33 & r0
            r9 = r26
            if (r0 != 0) goto L_0x005a
            int r0 = X.G9t.A0J(r12, r9)
            r16 = r16 | r0
        L_0x005a:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r33 & r0
            r5 = r34
            if (r0 != 0) goto L_0x0068
            int r0 = X.G9t.A0e(r12, r5)
            r16 = r16 | r0
        L_0x0068:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r33 & r0
            r8 = r27
            if (r0 != 0) goto L_0x0076
            int r0 = X.G9t.A0L(r12, r8)
            r16 = r16 | r0
        L_0x0076:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r33 & r0
            r10 = r25
            if (r0 != 0) goto L_0x0084
            int r0 = X.G9t.A0W(r12, r10)
            r16 = r16 | r0
        L_0x0084:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r16 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00b8
            boolean r0 = r12.Bwn()
            if (r0 == 0) goto L_0x00b8
            r12.Evl()
        L_0x0097:
            X.5Xd r0 = r12.ASQ()
            if (r0 == 0) goto L_0x00b7
            r21 = 0
            X.JBq r11 = new X.JBq
            r22 = r5
            r16 = r31
            r17 = r8
            r18 = r10
            r19 = r23
            r20 = r6
            r12 = r15
            r13 = r7
            r14 = r9
            r15 = r24
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.A06 = r11
        L_0x00b7:
            return
        L_0x00b8:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c6
            r1 = -375854093(0xffffffffe998ebf3, float:-2.310887E25)
            java.lang.String r0 = "com.instagram.opal.impl.ui.OpalProfilePic (OpalContent.kt:676)"
            X.0fL.A01(r1, r0)
        L_0x00c6:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r14 = X.C51970G9q.A0S(r0)
            com.instagram.common.session.UserSession r11 = X.C51968G9o.A0h(r12)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A0E
            r4 = 0
            X.5RD r1 = X.C287675aa.A00(r0, r4)
            int r13 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r10)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x00fb
            boolean r0 = X.C51972G9s.A1Q(r12, r13)
            if (r0 != 0) goto L_0x00fe
        L_0x00fb:
            X.C51971G9r.A13(r12, r1, r13)
        L_0x00fe:
            X.C51965G9l.A18(r12, r2)
            X.5dj r2 = X.C289515dj.A00
            X.J48 r27 = X.J48.A00
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            r0 = 212297036(0xca7654c, float:2.579139E-31)
            r12.ExS(r0)
            boolean r0 = X.C51974G9v.A1W(r16)
            boolean r0 = X.G9t.A1a(r12, r8, r9, r0)
            boolean r13 = X.C51965G9l.A1Z(r12, r14, r0)
            boolean r0 = X.C51973G9u.A1G(r16)
            r13 = r13 | r0
            boolean r0 = X.C51973G9u.A1J(r16)
            boolean r13 = X.C51968G9o.A1T(r12, r11, r13, r0)
            boolean r0 = X.C51973G9u.A1K(r16)
            r13 = r13 | r0
            boolean r0 = X.C51973G9u.A1H(r16)
            r13 = r13 | r0
            java.lang.Object r0 = r12.ECw()
            if (r13 != 0) goto L_0x013a
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            if (r0 != r13) goto L_0x0152
        L_0x013a:
            X.G2q r0 = new X.G2q
            r17 = r0
            r18 = r14
            r19 = r9
            r20 = r8
            r21 = r11
            r22 = r31
            r25 = r15
            r26 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r12.FLL(r0)
        L_0x0152:
            X.0sP r28 = X.C51965G9l.A0z(r3, r0)
            r29 = 54
            r25 = r12
            r26 = r1
            r30 = r4
            X.I63.A02(r25, r26, r27, r28, r29, r30)
            r0 = 212365138(0xca86f52, float:2.5951497E-31)
            r12.ExS(r0)
            if (r34 == 0) goto L_0x01b5
            android.content.Context r0 = X.C51968G9o.A0I(r12)
            android.graphics.drawable.Drawable r0 = X.1QE.A0D(r0, r4)
            X.2DO r14 = X.C287995bC.A00(r0, r12)
            r0 = 2131968858(0x7f13435a, float:1.9574622E38)
            java.lang.String r13 = X.C304346Dc.A00(r12, r0)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A07
            androidx.compose.ui.Modifier r1 = r2.AAz(r0, r1)
            r0 = -1059061760(0xffffffffc0e00000, float:-7.0)
            androidx.compose.ui.Modifier r1 = X.C56164Htt.A00(r1, r0, r0)
            r0 = 212377027(0xca89dc3, float:2.5979448E-31)
            r12.ExS(r0)
            boolean r0 = X.C51972G9s.A1N(r16)
            boolean r2 = X.G9t.A1a(r12, r11, r8, r0)
            java.lang.Object r0 = r12.ECw()
            if (r2 != 0) goto L_0x01a0
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r0 != r2) goto L_0x01aa
        L_0x01a0:
            r2 = 38
            X.Iw4 r0 = new X.Iw4
            r0.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r11, (java.lang.Object) r7)
            r12.FLL(r0)
        L_0x01aa:
            X.0sa r0 = X.C51965G9l.A0y(r3, r0, r4)
            androidx.compose.ui.Modifier r0 = X.C52638GaC.A01(r12, r1, r0)
            X.AnonymousClass6G3.A0B(r12, r0, r14, r13, r4)
        L_0x01b5:
            boolean r0 = X.C51971G9r.A1S(r12, r3, r4)
            if (r0 == 0) goto L_0x0097
            r0 = 1291804353(0x4cff5ec1, float:1.33887496E8)
            X.0fL.A00(r0)
            goto L_0x0097
        L_0x01c3:
            r16 = r6
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7S.A02(X.5Wy, androidx.compose.ui.Modifier, X.Jvq, X.0iw, com.instagram.common.typedurl.ImageUrl, java.lang.String, X.0sa, X.0sa, X.0sL, int, boolean):void");
    }

    public static final void A03(C286575Wy r32, Modifier modifier, C61052Jvq jvq, AnonymousClass0iw r35, OpalProfileData opalProfileData, C62320sa r37, C62320sa r38, 0sL r39, 0sL r40, int i, boolean z) {
        int i2;
        String str;
        ImageUrl A0V;
        String str2;
        String str3;
        C286575Wy r8 = r32;
        r8.ExV(-2135243600);
        int i3 = i;
        0sL r6 = r39;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, r6) | i;
        } else {
            i2 = i3;
        }
        C62320sa r30 = r37;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, r30);
        }
        0sL r27 = r40;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r8, r27);
        }
        C62320sa r26 = r38;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r8, r26);
        }
        OpalProfileData opalProfileData2 = opalProfileData;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r8, opalProfileData2);
        }
        boolean z2 = z;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0d(r8, z2);
        }
        C61052Jvq jvq2 = jvq;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r8, jvq2);
        }
        AnonymousClass0iw r31 = r35;
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r8, r31);
        }
        if ((i & 100663296) == 0) {
            i2 |= G9t.A0W(r8, modifier);
        }
        if ((38347923 & i2) != 38347922 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(176422394, "com.instagram.opal.impl.ui.OpalInfo (OpalContent.kt:629)");
            }
            AnonymousClass5RD A0s = G9t.A0s(C287275Zs.A01, r8, C287215Zl.A05, (i2 >> 24) & 14);
            int A002 = C287425a7.A00(r8);
            C286565Wx r11 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r11);
            Modifier A01 = C287435a8.A01(r8, modifier);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r8, r11, r12);
            0sL r10 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r8, A0s, A04, r10);
            0sL r4 = C287485aD.A02;
            if (r11.A0K || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r4, A002);
            }
            0sL A1K = C51966G9m.A1K(r8, A01);
            AnonymousClass6FX r2 = AnonymousClass6FX.A00;
            if (opalProfileData != null) {
                str = opalProfileData2.A05;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (opalProfileData != null) {
                A0V = opalProfileData2.A01();
            } else {
                A0V = DbS.A0V((String) null);
            }
            C285245Qk r15 = Modifier.A00;
            int i4 = i2 >> 3;
            A02(r8, r15, jvq2, r31, A0V, str, r30, r26, r27, (i4 & 458752) | (i4 & 896) | ((i2 >> 6) & 14) | 100663296 | (i2 & 112) | (3670016 & (i2 << 3)) | (29360128 & i2), z2);
            Modifier AB1 = r2.AB1(C287215Zl.A04, C287195Zj.A0B(r2.A00(r15), 12.0f, 0.0f, 0.0f, 0.0f));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r8, 0);
            int A003 = C287425a7.A00(r8);
            AnonymousClass5RM A042 = C286565Wx.A04(r11);
            Modifier A012 = C287435a8.A01(r8, AB1);
            C51973G9u.A0z(r8, r11, r12);
            C287595aO.A00(r8, A0Z, r10);
            if (C51965G9l.A1Y(r8, r11, A042, A0w) || !C51972G9s.A1Q(r8, A003)) {
                C51971G9r.A13(r8, r4, A003);
            }
            C287595aO.A00(r8, A012, A1K);
            r8.ExS(-122683432);
            int i5 = i2 & 14;
            boolean A1I = C51972G9s.A1I(i5);
            Object ECw = r8.ECw();
            if (A1I || ECw == AnonymousClass5XT.A00) {
                ECw = new G4U(r6, 33);
                r8.FLL(ECw);
            }
            0sP A0z = C51965G9l.A0z(r11, ECw);
            if (opalProfileData == null || (str2 = opalProfileData2.A04) == null) {
                str2 = "";
            }
            HLJ hlj = HLJ.Name;
            Modifier A0T = C51966G9m.A0T(r15);
            int i6 = i2 >> 9;
            int i7 = (i6 & 57344) | 199680 | (i6 & 896);
            A05(r8, A0T, r31, hlj, str2, A0z, i7, z2);
            r8.ExS(-122670697);
            boolean A1I2 = C51972G9s.A1I(i5);
            Object ECw2 = r8.ECw();
            if (A1I2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new G4U(r6, 34);
                r8.FLL(ECw2);
            }
            0sP A0z2 = C51965G9l.A0z(r11, ECw2);
            if (opalProfileData == null || (str3 = opalProfileData2.A02) == null) {
                str3 = "";
            }
            A05(r8, C287195Zj.A0B(A0T, 0.0f, 6.0f, 0.0f, 0.0f), r31, HLJ.Bio, str3, A0z2, i7, z2);
            if (C51971G9r.A1R(r8)) {
                0fL.A00(-1540301709);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59234JBm(r31, modifier, r6, r26, opalProfileData2, jvq2, r27, r30, i3, 1, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.GVB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.GVB} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b5, code lost:
        if (r3 == X.AnonymousClass5XT.A00) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x029b, code lost:
        r0.ASN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02a2, code lost:
        if (X.C51967G9n.A1a(r1) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02a4, code lost:
        X.0fL.A00(1313119744);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r33, androidx.compose.ui.Modifier r34, X.AnonymousClass0iw r35, X.C62520KhB r36, X.C62320sa r37, X.C62320sa r38, X.C62320sa r39, int r40, boolean r41) {
        /*
            r1 = -1419859731(0xffffffffab5ea8ed, float:-7.9104675E-13)
            r0 = r33
            r0.ExV(r1)
            r6 = r40
            r1 = r40 & 6
            r32 = r37
            if (r1 != 0) goto L_0x02ac
            r1 = r32
            int r4 = X.C41848B3p.A01(r0, r1)
            r4 = r4 | r40
        L_0x0018:
            r1 = r40 & 48
            r31 = r38
            if (r1 != 0) goto L_0x0025
            r1 = r31
            int r1 = X.G9t.A0F(r0, r1)
            r4 = r4 | r1
        L_0x0025:
            r1 = r6 & 384(0x180, float:5.38E-43)
            r30 = r39
            if (r1 != 0) goto L_0x0032
            r1 = r30
            int r1 = X.G9t.A0G(r0, r1)
            r4 = r4 | r1
        L_0x0032:
            r1 = r6 & 3072(0xc00, float:4.305E-42)
            r29 = r41
            if (r1 != 0) goto L_0x003f
            r1 = r29
            int r1 = X.G9t.A0b(r0, r1)
            r4 = r4 | r1
        L_0x003f:
            r1 = r6 & 24576(0x6000, float:3.4438E-41)
            r33 = r36
            if (r1 != 0) goto L_0x004c
            r1 = r33
            int r1 = X.G9t.A0S(r0, r1)
            r4 = r4 | r1
        L_0x004c:
            r1 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 & r40
            r7 = r35
            if (r1 != 0) goto L_0x0059
            int r1 = X.G9t.A0J(r0, r7)
            r4 = r4 | r1
        L_0x0059:
            r1 = 1572864(0x180000, float:2.204052E-39)
            r1 = r1 & r40
            if (r1 != 0) goto L_0x0066
            r1 = r34
            int r1 = X.G9t.A0U(r0, r1)
            r4 = r4 | r1
        L_0x0066:
            r1 = 599187(0x92493, float:8.3964E-40)
            r2 = r4 & r1
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r1) goto L_0x0095
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0095
            r0.Evl()
        L_0x0079:
            X.5Xd r0 = r0.ASQ()
            if (r0 == 0) goto L_0x0094
            r13 = 0
            X.JAi r5 = new X.JAi
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r6
            r14 = r29
            r6 = r34
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A06 = r5
        L_0x0094:
            return
        L_0x0095:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00a3
            r2 = 300279913(0x11e5e869, float:3.6273063E-28)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalSelfProfileEmptyContent (OpalContent.kt:512)"
            X.0fL.A01(r2, r1)
        L_0x00a3:
            java.lang.Object r5 = X.C51965G9l.A0r(r0)
            int r1 = r33.ordinal()
            switch(r1) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x0241;
                case 2: goto L_0x00b6;
                case 3: goto L_0x01fa;
                case 4: goto L_0x00b6;
                case 5: goto L_0x01fa;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r1 = -1395260380(0xffffffffacd60424, float:-6.0827055E-12)
            X.Wub r0 = X.C51973G9u.A0o(r0, r1)
            throw r0
        L_0x00b6:
            r1 = -302570560(0xffffffffedf723c0, float:-9.560752E27)
            r0.ExS(r1)
            r12 = 2
            r18 = 0
            r3 = 1098907648(0x41800000, float:16.0)
            r10 = 0
            r1 = r34
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0A(r1, r3, r10, r3)
            X.5Zx r8 = X.C287275Zs.A07
            X.5Zr r1 = X.C287215Zl.A02
            r2 = 0
            X.5RD r9 = X.C291495hO.A02(r8, r0, r1, r2)
            int r13 = X.C287425a7.A00(r0)
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r8 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r11)
            X.C51973G9u.A0y(r0, r1)
            X.C51971G9r.A12(r0, r9, r8)
            X.0sL r9 = X.C287485aD.A02
            boolean r8 = r1.A0K
            if (r8 != 0) goto L_0x00f2
            boolean r8 = X.C51972G9s.A1Q(r0, r13)
            if (r8 != 0) goto L_0x00f5
        L_0x00f2:
            X.C51971G9r.A13(r0, r9, r13)
        L_0x00f5:
            X.C51965G9l.A18(r0, r11)
            X.6Et r9 = X.C304676Et.A00
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            X.5Zr r8 = X.C287215Zl.A00
            androidx.compose.ui.Modifier r14 = r9.AB0(r8, r11)
            r13 = 2131238415(0x7f081e0f, float:1.8093108E38)
            X.2DO r13 = X.C287975bA.A00(r0, r13, r2)
            r22 = 48
            r17 = 1090519040(0x41000000, float:8.0)
            X.AnonymousClass6G3.A03(r0, r14, r13)
            r13 = 2131968906(0x7f13438a, float:1.957472E38)
            java.lang.String r26 = X.C304346Dc.A00(r0, r13)
            androidx.compose.ui.Modifier r24 = X.C287195Zj.A06(r11)
            long r27 = X.C51966G9m.A0H(r0)
            X.5Z4 r25 = X.C51966G9m.A0e(r0)
            r23 = r0
            X.AnonymousClass5ZZ.A0W(r23, r24, r25, r26, r27)
            r13 = 2131968907(0x7f13438b, float:1.9574722E38)
            java.lang.String r21 = X.C304346Dc.A00(r0, r13)
            androidx.compose.ui.Modifier r20 = X.C287195Zj.A06(r11)
            long r24 = X.C51966G9m.A0H(r0)
            r23 = 32760(0x7ff8, float:4.5907E-41)
            r19 = r0
            X.AnonymousClass5ZZ.A0c(r19, r20, r21, r22, r23, r24)
            r13 = 2131968856(0x7f134358, float:1.9574618E38)
            java.lang.String r16 = X.C304346Dc.A00(r0, r13)
            X.6CA r14 = X.AnonymousClass6CA.A00
            r13 = 1
            X.GQy r13 = r14.A03(r0, r12, r13, r2)
            androidx.compose.ui.Modifier r12 = X.C51966G9m.A0T(r11)
            r11 = 1103101952(0x41c00000, float:24.0)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r12, r10, r11, r10, r3)
            androidx.compose.ui.Modifier r14 = r9.AB0(r8, r10)
            r10 = -1716787458(0xffffffff99abe6fe, float:-1.7774283E-23)
            boolean r10 = X.C51973G9u.A1N(r0, r10, r4)
            boolean r10 = X.G9t.A1a(r0, r5, r7, r10)
            java.lang.Object r11 = r0.ECw()
            if (r10 != 0) goto L_0x016f
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r11 != r10) goto L_0x017b
        L_0x016f:
            r15 = 39
            X.Iw4 r11 = new X.Iw4
            r10 = r32
            r11.<init>((int) r15, (java.lang.Object) r7, (java.lang.Object) r5, (java.lang.Object) r10)
            r0.FLL(r11)
        L_0x017b:
            X.0sa r11 = X.C51965G9l.A0y(r1, r11, r2)
            r10 = r16
            X.AnonymousClass6CE.A03(r0, r14, r13, r10, r11)
            r10 = 2131968831(0x7f13433f, float:1.9574568E38)
            java.lang.String r13 = X.C304346Dc.A00(r0, r10)
            X.6CB r11 = X.AnonymousClass6CA.A01(r0)
            r10 = r17
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A0B(r12, r3, r10, r3, r3)
            androidx.compose.ui.Modifier r8 = r9.AB0(r8, r3)
            r3 = -1716762782(0xffffffff99ac4762, float:-1.7813214E-23)
            boolean r9 = X.C51974G9v.A1a(r0, r3, r4)
            boolean r3 = X.C51973G9u.A1H(r4)
            r9 = r9 | r3
            boolean r3 = X.C51973G9u.A1I(r4)
            boolean r4 = X.C51973G9u.A1T(r0, r5, r7, r9, r3)
            java.lang.Object r3 = r0.ECw()
            if (r4 != 0) goto L_0x01b7
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r3 != r4) goto L_0x01cd
        L_0x01b7:
            r20 = 3
            X.GVB r3 = new X.GVB
            r19 = r3
            r21 = r5
            r22 = r7
            r23 = r31
            r24 = r30
            r25 = r29
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r0.FLL(r3)
        L_0x01cd:
            X.0sa r2 = X.C51965G9l.A0y(r1, r3, r2)
            X.AnonymousClass6CE.A03(r0, r8, r11, r13, r2)
            r0.ASN()
            X.0gF r8 = X.C60340gF.A00
            r2 = -1395156168(0xffffffffacd79b38, float:-6.1279003E-12)
            boolean r2 = X.C51973G9u.A1S(r0, r5, r7, r2)
            java.lang.Object r3 = r0.ECw()
            if (r2 != 0) goto L_0x01ea
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r3 != r2) goto L_0x01f5
        L_0x01ea:
            r4 = 7
            X.Fy7 r3 = new X.Fy7
            r2 = r18
            r3.<init>(r5, r7, r2, r4)
            r0.FLL(r3)
        L_0x01f5:
            X.C51968G9o.A1E(r0, r1, r3, r8)
            goto L_0x029e
        L_0x01fa:
            r2 = 0
            r1 = -302958215(0xffffffffedf13979, float:-9.331921E27)
            X.5Qk r9 = X.C51965G9l.A0K(r0, r1)
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0U(r9)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A01(r1)
            androidx.compose.ui.Alignment r8 = X.C287215Zl.A09
            X.5RD r3 = X.C287675aa.A00(r8, r2)
            int r5 = X.C287425a7.A00(r0)
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r2 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0y(r0, r1)
            X.C51971G9r.A12(r0, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r1.A0K
            if (r2 != 0) goto L_0x0231
            boolean r2 = X.C51972G9s.A1Q(r0, r5)
            if (r2 != 0) goto L_0x0234
        L_0x0231:
            X.C51971G9r.A13(r0, r3, r5)
        L_0x0234:
            X.C51965G9l.A18(r0, r4)
            X.5dj r2 = X.C289515dj.A00
            androidx.compose.ui.Modifier r2 = r2.AAz(r8, r9)
            X.GQD.A00(r0, r2)
            goto L_0x029b
        L_0x0241:
            r2 = 0
            r1 = -303457718(0xffffffffede99a4a, float:-9.0370664E27)
            X.5Qk r9 = X.C51965G9l.A0K(r0, r1)
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0U(r9)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A01(r1)
            androidx.compose.ui.Alignment r8 = X.C287215Zl.A09
            X.5RD r3 = X.C287675aa.A00(r8, r2)
            int r5 = X.C287425a7.A00(r0)
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r2 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0y(r0, r1)
            X.C51971G9r.A12(r0, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r1.A0K
            if (r2 != 0) goto L_0x0278
            boolean r2 = X.C51972G9s.A1Q(r0, r5)
            if (r2 != 0) goto L_0x027b
        L_0x0278:
            X.C51971G9r.A13(r0, r3, r5)
        L_0x027b:
            X.C51965G9l.A18(r0, r4)
            X.5dj r3 = X.C289515dj.A00
            r2 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r11 = X.C304346Dc.A00(r0, r2)
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A06(r9)
            androidx.compose.ui.Modifier r9 = r3.AAz(r8, r2)
            long r12 = X.C51966G9m.A0H(r0)
            X.5Z4 r10 = X.C51966G9m.A0g(r0)
            r8 = r0
            X.AnonymousClass5ZZ.A0X(r8, r9, r10, r11, r12)
        L_0x029b:
            r0.ASN()
        L_0x029e:
            boolean r1 = X.C51967G9n.A1a(r1)
            if (r1 == 0) goto L_0x0079
            r1 = 1313119744(0x4e449e00, float:8.2467226E8)
            X.0fL.A00(r1)
            goto L_0x0079
        L_0x02ac:
            r4 = r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7S.A04(X.5Wy, androidx.compose.ui.Modifier, X.0iw, X.KhB, X.0sa, X.0sa, X.0sa, int, boolean):void");
    }

    public static final void A05(C286575Wy r43, Modifier modifier, AnonymousClass0iw r45, HLJ hlj, String str, 0sP r48, int i, boolean z) {
        int i2;
        int i3;
        AnonymousClass5Z4 r6;
        long A01;
        C286575Wy r0 = r43;
        r0.ExV(-533605065);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r0, r48) | i;
        } else {
            i2 = i4;
        }
        int i5 = i & 48;
        String str2 = str;
        if (i5 == 0) {
            i2 |= G9t.A0P(r0, str2);
        }
        boolean z2 = z;
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0a(r0, z2);
        }
        HLJ hlj2 = hlj;
        if ((i4 & 3072) == 0) {
            i2 |= G9t.A0R(r0, hlj2);
        }
        AnonymousClass0iw r13 = r45;
        if ((i4 & 24576) == 0) {
            i2 |= G9t.A0I(r0, r13);
        }
        Modifier modifier2 = modifier;
        if ((196608 & i4) == 0) {
            i2 |= G9t.A0T(r0, modifier2);
        }
        if ((74899 & i2) != 74898 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2110747040, "com.instagram.opal.impl.ui.OpalProfilePropertyRow (OpalContent.kt:924)");
            }
            C284945Oz A002 = C287175Zh.A00(r0, C51965G9l.A0r(r0));
            int ordinal = hlj2.ordinal();
            if (ordinal == 0) {
                i3 = 2;
            } else if (ordinal == 1) {
                i3 = 5;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            if (ordinal != 0) {
                r6 = C51967G9n.A0b(r0, -641338250).A00;
                A01 = AnonymousClass5Z7.A01(14);
            } else {
                r6 = C51967G9n.A0b(r0, -641343946).A07;
                A01 = AnonymousClass5Z7.A01(16);
            }
            AnonymousClass5Z4 A0D = r6.A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 6291453, 0, A01, 0, 0));
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            AnonymousClass5Z4 A0D2 = A0D.A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 6291454, C51966G9m.A0H(r0), 0, 0, 0));
            C284945Oz A0M = C51968G9o.A0M(r0, AndroidCompositionLocals_androidKt.A03);
            if (z) {
                r0.ExS(1593772084);
                r0.ExS(-641306743);
                int i6 = i2 & 7168;
                boolean A1T = C51968G9o.A1T(r0, r13, AnonymousClass7TF.A1S(i6, C249703kE.FLAG_MOVED), r0.AGu(A002));
                Object ECw = r0.ECw();
                if (A1T || ECw == AnonymousClass5XT.A00) {
                    ECw = C59104J6m.A00(r0, hlj2, r13, A002, 14);
                }
                Modifier Ezh = modifier2.Ezh(new FocusChangedElement(C51965G9l.A0z(A0H, ECw)));
                C304776Fe r7 = new C304776Fe(C51966G9m.A0H(r0));
                r0.ExS(-641324111);
                boolean A1Z = C51965G9l.A1Z(r0, A0M, AnonymousClass7TF.A1S(i6, C249703kE.FLAG_MOVED)) | C51973G9u.A1G(i2);
                Object ECw2 = r0.ECw();
                if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C59104J6m.A00(r0, hlj2, r48, A0M, 15);
                }
                String str3 = str2;
                I5J.A02(r0, Ezh, r7, A0D2, str3, C51965G9l.A0z(A0H, ECw2), AnonymousClass5PI.A01(r0, new C59354JGg(str3, hlj2, 1), -72904161), i3, 1, (i2 >> 3) & 14, 14808, false);
            } else {
                r0.ExS(1595844093);
                AnonymousClass5ZZ.A03(r0, modifier2, A0D2, (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, str2, (0sP) null, 0, 1, i3, 0, 805306368 | ((i2 >> 3) & 14) | ((i2 >> 12) & 112), 0, 14844, 0, 0, 0, false);
            }
            if (C51967G9n.A1b(A0H, false)) {
                0fL.A00(386114087);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA9(r13, modifier2, r48, hlj2, str2, i4, 1, z2);
        }
    }

    public static final void A08(C286575Wy r14, Modifier modifier, List list, C62320sa r17, int i, int i2) {
        int i3;
        C287245Zp r2;
        C286625Xd ASQ;
        int i4;
        C286575Wy r5 = r14;
        r14.ExV(1209881840);
        int i5 = i2;
        if ((i2 & 6) == 0) {
            i3 = C41848B3p.A01(r14, r17) | i2;
        } else {
            i3 = i5;
        }
        int i6 = i;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r14, i6);
        }
        List list2 = list;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r14, list2);
        }
        Modifier modifier2 = modifier;
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r14, modifier);
        }
        if ((i3 & 1171) != 1170 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(634531362, "com.instagram.opal.impl.ui.OpalVisibility (OpalContent.kt:760)");
            }
            if (i6 == 0 || !list2.isEmpty()) {
                Modifier A0P = C51968G9o.A0P(C51969G9p.A0X(modifier, 8.0f, C51966G9m.A0C(r14)), 8.0f);
                boolean A1N = C51973G9u.A1N(r14, 1295293242, i3);
                Object ECw = r14.ECw();
                if (A1N || ECw == AnonymousClass5XT.A00) {
                    ECw = G9w.A0s(r14, r17, 11);
                }
                C286565Wx A0H = C51965G9l.A0H(r14, false);
                Modifier A05 = C287635aW.A05(A0P, (C287625aV) null, (String) null, (C62320sa) ECw, true);
                AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
                int A002 = C287425a7.A00(r14);
                AnonymousClass5RM A04 = C286565Wx.A04(A0H);
                Modifier A01 = C287435a8.A01(r14, A05);
                C62320sa r15 = C287485aD.A00;
                C51973G9u.A0z(r14, A0H, r15);
                0sL r142 = C287485aD.A03;
                0sL A0w = C51969G9p.A0w(r5, A0Z, A04, r142);
                0sL r13 = C287485aD.A02;
                if (A0H.A0K || !C51972G9s.A1Q(r5, A002)) {
                    C51971G9r.A13(r5, r13, A002);
                }
                0sL A1K = C51966G9m.A1K(r5, A01);
                C285245Qk r8 = Modifier.A00;
                Modifier A07 = C287195Zj.A07(C51966G9m.A0T(r8), 16.0f);
                AnonymousClass5RD A0K = G9w.A0K(C287275Zs.A01(12.0f), r5);
                int A003 = C287425a7.A00(r5);
                AnonymousClass5RM A042 = C286565Wx.A04(A0H);
                Modifier A012 = C287435a8.A01(r5, A07);
                C51973G9u.A0z(r5, A0H, r15);
                C287595aO.A00(r5, A0K, r142);
                if (C51965G9l.A1Y(r5, A0H, A042, A0w) || !C51972G9s.A1Q(r5, A003)) {
                    C51971G9r.A13(r5, r13, A003);
                }
                C287595aO.A00(r5, A012, A1K);
                AnonymousClass6FX r11 = AnonymousClass6FX.A00;
                if (i6 == 0) {
                    r5.ExS(-6203954);
                    AnonymousClass2DO A004 = C287975bA.A00(r5, R.drawable.instagram_eye_pano_outline_24, 0);
                    Modifier A043 = C287205Zk.A04(r8);
                    r2 = C287215Zl.A04;
                    C288165bT.A05(r5, r11.AB1(r2, A043), A004, C51966G9m.A0G(r5));
                    AnonymousClass5ZZ.A0f(r5, r11.AB1(r2, r11.A00(r8)), C304346Dc.A00(r5, 2131968903), C51966G9m.A0M(r5));
                } else {
                    r5.ExS(-5710372);
                    Modifier A005 = r11.A00(r8);
                    r2 = C287215Zl.A04;
                    A0C(list2, r11.AB1(r2, A005), r5, i6, C51965G9l.A02(i3 >> 3));
                }
                C286565Wx.A0L(A0H, false);
                C288165bT.A05(r5, r11.AB1(r2, C287205Zk.A0C(r8, 16.0f)), C287975bA.A00(r5, R.drawable.instagram_chevron_right_pano_outline_24, 0), C51966G9m.A0L(r5));
                if (C51971G9r.A1R(r5)) {
                    0fL.A00(1861388384);
                }
            } else {
                if (0fL.A02()) {
                    0fL.A00(-1231153716);
                }
                ASQ = r14.ASQ();
                if (ASQ != null) {
                    i4 = 31;
                    ASQ.A06 = new JG6(i5, i6, i4, modifier2, list2, r17);
                }
                return;
            }
        } else {
            r14.Evl();
        }
        ASQ = r5.ASQ();
        if (ASQ != null) {
            i4 = 32;
            ASQ.A06 = new JG6(i5, i6, i4, modifier2, list2, r17);
        }
    }

    public static final void A09(C286575Wy r8, Modifier modifier, C62320sa r10, int i) {
        int i2;
        C286575Wy r4 = r8;
        r8.ExV(2091574348);
        C62320sa r82 = r10;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r10) | i;
        } else {
            i2 = i;
        }
        Modifier modifier2 = modifier;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r4, modifier);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1228877182, "com.instagram.opal.impl.ui.OpalMessageButton (OpalContent.kt:868)");
            }
            AnonymousClass6CE.A06(r4, modifier2, AnonymousClass6CA.A00.A03(r4, 3, false, false), C304346Dc.A00(r4, 2131966184), r82, (i2 & 14) | ((i2 << 3) & 896));
            if (0fL.A02()) {
                0fL.A00(880999272);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier2, r10, i, 32);
        }
    }

    public static final void A0C(List list, Modifier modifier, C286575Wy r18, int i, int i2) {
        int i3;
        int i4;
        Object[] objArr;
        C286575Wy r5 = r18;
        r5.ExV(-849712685);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r5, i6) | i2;
        } else {
            i3 = i5;
        }
        List<OpalAudienceSelectorRepository.OpalAudience> list2 = list;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r5, list2);
        }
        Modifier modifier2 = modifier;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r5, modifier2);
        }
        if ((i3 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(313976970, "com.instagram.opal.impl.ui.OpalVisibilityFacepile (OpalContent.kt:810)");
            }
            r5.ExS(-1919992206);
            ArrayList A0r = AnonymousClass7TG.A0r(list2);
            for (OpalAudienceSelectorRepository.OpalAudience opalAudience : list2) {
                A0r.add(C51975G9x.A0W(r5, opalAudience.A02));
            }
            C286565Wx r15 = (C286565Wx) r5;
            C286565Wx.A0L(r15, false);
            int size = list2.size();
            if (size == 1) {
                r5.ExS(609940496);
                i4 = 2131968839;
                objArr = new Object[]{A00(list2, 0)};
            } else if (size == 2) {
                r5.ExS(610115026);
                i4 = 2131968838;
                objArr = new Object[]{A00(list2, 0), A00(list2, 1)};
            } else if (size != 3) {
                r5.ExS(610643328);
                i4 = 2131968840;
                objArr = new Object[]{A00(list2, 0), A00(list2, 1), A00(list2, 2), String.valueOf(i - 3)};
            } else {
                r5.ExS(610350812);
                i4 = 2131968841;
                objArr = new Object[]{A00(list2, 0), A00(list2, 1), A00(list2, 2)};
            }
            String A01 = C304346Dc.A01(r5, objArr, i4);
            C286565Wx.A0L(r15, false);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r5, C287215Zl.A05, C51965G9l.A02(((i3 >> 6) & 14) >> 3));
            int A002 = C287425a7.A00(r5);
            AnonymousClass5RM A04 = C286565Wx.A04(r15);
            Modifier A012 = C287435a8.A01(r5, modifier2);
            C62320sa r0 = C287485aD.A00;
            C51973G9u.A0z(r5, r15, r0);
            0sL r1 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r5, A02, A04, r1);
            0sL r12 = C287485aD.A02;
            if (r15.A0K || !C51972G9s.A1Q(r5, A002)) {
                C51971G9r.A13(r5, r12, A002);
            }
            0sL A1K = C51966G9m.A1K(r5, A012);
            AnonymousClass6FX r10 = AnonymousClass6FX.A00;
            C285245Qk r9 = Modifier.A00;
            C287245Zp r8 = C287215Zl.A04;
            Modifier AB1 = r10.AB1(r8, r9);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A003 = C287425a7.A00(r5);
            AnonymousClass5RM A042 = C286565Wx.A04(r15);
            Modifier A013 = C287435a8.A01(r5, AB1);
            C51973G9u.A0z(r5, r15, r0);
            C287595aO.A00(r5, A0Z, r1);
            if (C51965G9l.A1Y(r5, r15, A042, A0w) || !C51972G9s.A1Q(r5, A003)) {
                C51971G9r.A13(r5, r12, A003);
            }
            C287595aO.A00(r5, A013, A1K);
            C52392GQr.A00(r5, AnonymousClass62Q.A00(00k.A0d(A0r, 3)), 28.0f, 0.0f, 0.0f, 0.0f, 48, 28);
            r5.ASN();
            AnonymousClass5ZZ.A0f(r5, C287195Zj.A0B(r10.AB1(r8, r10.A00(r9)), 12.0f, 0.0f, 0.0f, 0.0f), A01, C51966G9m.A0M(r5));
            if (C51967G9n.A1R(r5)) {
                0fL.A00(1941493380);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, list2, i6, i5, 36);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: X.MGM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: X.MGM} */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x035d, code lost:
        if (r14.A0A == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0406, code lost:
        if (r0 == r4) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0408, code lost:
        r11 = new X.MGM(r10, r49, r7, r15, r8, (X.AnonymousClass4D7) null, 7);
        r3.FLL(r11);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x041f, code lost:
        if (X.C51972G9s.A1S(r3, r1, r0, r9) == false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0421, code lost:
        X.0fL.A00(1967000793);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C286575Wy r57, androidx.compose.ui.Modifier r58, X.AnonymousClass0iw r59, X.C47183Dry r60, X.C62320sa r61, X.C62320sa r62, X.C62320sa r63, X.C62320sa r64, X.C62320sa r65, X.C62320sa r66, X.C62320sa r67, X.C62320sa r68, X.0sP r69, X.0sP r70, X.0sP r71, X.0sP r72, X.0sL r73, X.0sL r74, X.0sK r75, X.0sK r76, int r77, int r78, long r79) {
        /*
            r0 = 1838937740(0x6d9bf68c, float:6.033529E27)
            r3 = r57
            r3.ExV(r0)
            r6 = r77
            r0 = r77 & 6
            r49 = r69
            if (r0 != 0) goto L_0x042d
            r0 = r49
            int r5 = X.C41848B3p.A01(r3, r0)
            r5 = r5 | r77
        L_0x0018:
            r0 = r77 & 48
            r48 = r70
            if (r0 != 0) goto L_0x0025
            r0 = r48
            int r0 = X.G9t.A0F(r3, r0)
            r5 = r5 | r0
        L_0x0025:
            r0 = r6 & 384(0x180, float:5.38E-43)
            r43 = r75
            if (r0 != 0) goto L_0x0032
            r0 = r43
            int r0 = X.G9t.A0G(r3, r0)
            r5 = r5 | r0
        L_0x0032:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            r42 = r76
            if (r0 != 0) goto L_0x003f
            r0 = r42
            int r0 = X.G9t.A0H(r3, r0)
            r5 = r5 | r0
        L_0x003f:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            r8 = 8192(0x2000, float:1.14794E-41)
            r47 = r71
            if (r0 != 0) goto L_0x004e
            r0 = r47
            int r0 = X.G9t.A0I(r3, r0)
            r5 = r5 | r0
        L_0x004e:
            r7 = 196608(0x30000, float:2.75506E-40)
            r0 = r77 & r7
            r46 = r72
            if (r0 != 0) goto L_0x005d
            r0 = r46
            int r0 = X.G9t.A0J(r3, r0)
            r5 = r5 | r0
        L_0x005d:
            r1 = 1572864(0x180000, float:2.204052E-39)
            r0 = r77 & r1
            r57 = r61
            if (r0 != 0) goto L_0x006c
            r0 = r57
            int r0 = X.G9t.A0K(r3, r0)
            r5 = r5 | r0
        L_0x006c:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r77 & r0
            r56 = r62
            if (r0 != 0) goto L_0x007b
            r0 = r56
            int r0 = X.G9t.A0L(r3, r0)
            r5 = r5 | r0
        L_0x007b:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r77 & r0
            r55 = r63
            if (r0 != 0) goto L_0x008a
            r0 = r55
            int r0 = X.G9t.A0M(r3, r0)
            r5 = r5 | r0
        L_0x008a:
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r77 & r4
            r54 = r64
            if (r0 != 0) goto L_0x0099
            r0 = r54
            int r0 = X.G9t.A0N(r3, r0)
            r5 = r5 | r0
        L_0x0099:
            r2 = r78
            r0 = r78 & 6
            r53 = r65
            if (r0 != 0) goto L_0x0429
            r0 = r53
            int r0 = X.C41848B3p.A01(r3, r0)
            r17 = r78 | r0
        L_0x00a9:
            r0 = r78 & 48
            r52 = r66
            if (r0 != 0) goto L_0x00b7
            r0 = r52
            int r0 = X.G9t.A0F(r3, r0)
            r17 = r17 | r0
        L_0x00b7:
            r0 = r2 & 384(0x180, float:5.38E-43)
            r45 = r73
            if (r0 != 0) goto L_0x00c5
            r0 = r45
            int r0 = X.G9t.A0G(r3, r0)
            r17 = r17 | r0
        L_0x00c5:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            r51 = r67
            if (r0 != 0) goto L_0x00d3
            r0 = r51
            int r0 = X.C51971G9r.A09(r3, r0)
            r17 = r17 | r0
        L_0x00d3:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            r44 = r74
            if (r0 != 0) goto L_0x00e5
            r0 = r44
            boolean r0 = r3.AGw(r0)
            if (r0 == 0) goto L_0x00e3
            r8 = 16384(0x4000, float:2.2959E-41)
        L_0x00e3:
            r17 = r17 | r8
        L_0x00e5:
            r0 = r78 & r7
            r50 = r68
            if (r0 != 0) goto L_0x00f3
            r0 = r50
            int r0 = X.G9t.A0J(r3, r0)
            r17 = r17 | r0
        L_0x00f3:
            r0 = r78 & r1
            r8 = r60
            if (r0 != 0) goto L_0x00ff
            int r0 = X.G9t.A0K(r3, r8)
            r17 = r17 | r0
        L_0x00ff:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r78 & r0
            r15 = r59
            if (r0 != 0) goto L_0x010d
            int r0 = X.G9t.A0L(r3, r15)
            r17 = r17 | r0
        L_0x010d:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r78 & r0
            r40 = r79
            if (r0 != 0) goto L_0x0123
            r0 = r40
            boolean r1 = r3.AGt(r0)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            if (r1 == 0) goto L_0x0121
            r0 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0121:
            r17 = r17 | r0
        L_0x0123:
            r0 = r78 & r4
            if (r0 != 0) goto L_0x012f
            r0 = r58
            int r0 = X.G9t.A0X(r3, r0)
            r17 = r17 | r0
        L_0x012f:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r5 & r4
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x017f
            r4 = r4 & r17
            if (r4 != r0) goto L_0x017f
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x017f
            r3.Evl()
        L_0x0146:
            X.5Xd r1 = r3.ASQ()
            if (r1 == 0) goto L_0x017e
            X.JDg r0 = new X.JDg
            r17 = r53
            r18 = r52
            r19 = r51
            r20 = r50
            r21 = r49
            r22 = r48
            r23 = r47
            r24 = r46
            r25 = r45
            r26 = r44
            r27 = r43
            r28 = r42
            r29 = r6
            r30 = r2
            r31 = r40
            r9 = r0
            r10 = r58
            r11 = r15
            r12 = r8
            r13 = r57
            r14 = r56
            r15 = r55
            r16 = r54
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.A06 = r0
        L_0x017e:
            return
        L_0x017f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x018d
            r1 = 771401598(0x2dfaa77e, float:2.8496091E-11)
            java.lang.String r0 = "com.instagram.opal.impl.ui.OpalProfile (OpalContent.kt:356)"
            X.0fL.A01(r1, r0)
        L_0x018d:
            r0 = -149266999(0xfffffffff71a5dc9, float:-3.1309215E33)
            java.lang.Object r10 = X.C51967G9n.A0m(r3, r0)
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r10 != r4) goto L_0x019d
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.G9t.A0o(r3, r0)
        L_0x019d:
            r1 = r3
            X.5Wx r1 = (X.C286565Wx) r1
            r0 = 0
            X.C286565Wx.A0L(r1, r0)
            r7 = -149262412(0xfffffffff71a6fb4, float:-3.132341E33)
            java.lang.Object r9 = X.C51967G9n.A0m(r3, r7)
            if (r9 != r4) goto L_0x01b3
            r7 = 35
            X.G4U r9 = X.C51970G9q.A0t(r3, r10, r7)
        L_0x01b3:
            X.C286565Wx.A0L(r1, r0)
            X.0qQ.A0B(r9, r0)
            r7 = 866356325(0x33a38c65, float:7.6158166E-8)
            boolean r7 = X.C51967G9n.A1U(r3, r7)
            if (r7 == 0) goto L_0x01ca
            r10 = 1573072985(0x5dc33059, float:1.75810494E18)
            java.lang.String r7 = "com.instagram.opal.impl.ui.rememberOpalScaffoldState (OpalScaffold.kt:59)"
            X.0fL.A01(r10, r7)
        L_0x01ca:
            r7 = 1227659205(0x492c97c5, float:706940.3)
            boolean r7 = X.C51967G9n.A1U(r3, r7)
            if (r7 == 0) goto L_0x01db
            r10 = -1938850703(0xffffffff8c6f7c71, float:-1.8449338E-31)
            java.lang.String r7 = "com.instagram.opal.impl.ui.rememberOpalScrollAwayBehavior (OpalScrollAwayHeader.kt:49)"
            X.0fL.A01(r10, r7)
        L_0x01db:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            X.5Tp r19 = X.I4K.A04
            X.IsY r20 = X.C58477IsY.A00
            r22 = 3072(0xc00, float:4.305E-42)
            r23 = 4
            r18 = r3
            r21 = r7
            java.lang.Object r11 = X.C305136Gr.A00(r18, r19, r20, r21, r22, r23)
            X.I4K r11 = (X.I4K) r11
            X.5Oz r7 = r11.A02
            r7.Epw(r9)
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x0200
            r7 = -509358292(0xffffffffe1a3cf2c, float:-3.7771845E20)
            X.0fL.A00(r7)
        L_0x0200:
            X.C286565Wx.A0L(r1, r0)
            r7 = 197064632(0xbbef7b8, float:7.3558064E-32)
            boolean r9 = X.C51967G9n.A1Y(r3, r11, r7)
            java.lang.Object r7 = r3.ECw()
            if (r9 != 0) goto L_0x0212
            if (r7 != r4) goto L_0x0218
        L_0x0212:
            r7 = 46
            X.G4U r7 = X.C51970G9q.A0t(r3, r11, r7)
        L_0x0218:
            X.0sP r7 = X.C51965G9l.A0z(r1, r7)
            X.6Gn r10 = X.C54735HQs.A00(r3, r7)
            r7 = 197066848(0xbbf0060, float:7.357109E-32)
            java.lang.Object r9 = X.C51967G9n.A0m(r3, r7)
            if (r9 != r4) goto L_0x0231
            X.Hl5 r9 = new X.Hl5
            r9.<init>(r10, r11)
            r3.FLL(r9)
        L_0x0231:
            X.Hl5 r9 = (X.C55646Hl5) r9
            boolean r7 = X.C51967G9n.A1b(r1, r0)
            if (r7 == 0) goto L_0x023f
            r7 = 1152721698(0x44b52322, float:1449.0979)
            X.0fL.A00(r7)
        L_0x023f:
            X.C286565Wx.A0L(r1, r0)
            android.content.Context r11 = X.C51968G9o.A0I(r3)
            r7 = -149247886(0xfffffffff71aa872, float:-3.1368367E33)
            java.lang.Object r12 = X.C51967G9n.A0m(r3, r7)
            if (r12 != r4) goto L_0x028e
            X.62O r7 = A00
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r13 = r7.iterator()
        L_0x0259:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0287
            java.lang.Object r7 = r13.next()
            X.HLI r7 = (X.HLI) r7
            int r10 = r7.ordinal()
            if (r10 == r0) goto L_0x0280
            r7 = 1
            if (r10 != r7) goto L_0x0430
            r10 = 2131238690(0x7f081f22, float:1.8093666E38)
            r7 = 2131968850(0x7f134352, float:1.9574606E38)
        L_0x0274:
            java.lang.String r7 = r11.getString(r7)
            X.Gmg r7 = X.C56263HvX.A01(r7, r10)
            r12.add(r7)
            goto L_0x0259
        L_0x0280:
            r10 = 2131238631(0x7f081ee7, float:1.8093546E38)
            r7 = 2131968881(0x7f134371, float:1.957467E38)
            goto L_0x0274
        L_0x0287:
            X.62P r12 = X.AnonymousClass62Q.A00(r12)
            r3.FLL(r12)
        L_0x028e:
            X.62P r12 = (X.AnonymousClass62P) r12
            X.C286565Wx.A0L(r1, r0)
            r7 = -149226520(0xfffffffff71afbe8, float:-3.143449E33)
            boolean r10 = X.C51967G9n.A1Z(r3, r8, r7)
            java.lang.Object r7 = r3.ECw()
            if (r10 != 0) goto L_0x02a2
            if (r7 != r4) goto L_0x02a8
        L_0x02a2:
            r7 = 10
            X.G2d r7 = X.G9w.A0s(r3, r8, r7)
        L_0x02a8:
            X.0sa r11 = X.C51965G9l.A0y(r1, r7, r0)
            r13 = 6
            r7 = 2
            X.0qQ.A0B(r11, r7)
            r7 = -41968955(0xfffffffffd7f9ac5, float:-2.1234797E37)
            r3.ExS(r7)
            r14 = 0
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x02c6
            r10 = 1027445694(0x3d3d93be, float:0.046283476)
            java.lang.String r7 = "com.instagram.opal.impl.ui.rememberOpalTabPagerState (OpalTabPager_1_7.kt:50)"
            X.0fL.A01(r10, r7)
        L_0x02c6:
            r7 = -53758923(0xfffffffffccbb435, float:-8.4615304E36)
            boolean r7 = X.C51967G9n.A1Y(r3, r11, r7)
            if (r7 == 0) goto L_0x02d0
            r14 = 1
        L_0x02d0:
            java.lang.Object r10 = r3.ECw()
            if (r14 != 0) goto L_0x02d8
            if (r10 != r4) goto L_0x02e1
        L_0x02d8:
            r7 = 7
            X.G2a r10 = new X.G2a
            r10.<init>(r11, r7)
            r3.FLL(r10)
        L_0x02e1:
            X.0sa r7 = X.C51965G9l.A0y(r1, r10, r0)
            X.GZF r13 = X.C52610GZj.A01(r3, r7, r0, r13, r0)
            r7 = -53758014(0xfffffffffccbb7c2, float:-8.4621065E36)
            boolean r10 = X.C51967G9n.A1Y(r3, r13, r7)
            java.lang.Object r7 = r3.ECw()
            if (r10 != 0) goto L_0x02f8
            if (r7 != r4) goto L_0x0300
        L_0x02f8:
            X.Hl6 r7 = new X.Hl6
            r7.<init>(r13, r11)
            r3.FLL(r7)
        L_0x0300:
            X.Hl6 r7 = (X.C55647Hl6) r7
            X.C286565Wx.A0L(r1, r0)
            X.5Oz r10 = r7.A01
            r10.Epw(r11)
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x0316
            r10 = 1838511119(0x6d95740f, float:5.7816966E27)
            X.0fL.A00(r10)
        L_0x0316:
            X.C286565Wx.A0L(r1, r0)
            java.lang.Object r10 = r3.ECw()
            java.lang.Object r10 = X.C51974G9v.A0Y(r3, r10, r4)
            X.6FV r10 = (X.AnonymousClass6FV) r10
            X.4Cq r10 = r10.A00
            r29 = r10
            com.instagram.common.session.UserSession r10 = X.C51970G9q.A0f(r3)
            com.instagram.opal.impl.data.OpalProfileData r14 = r8.A05
            java.lang.String r13 = r14.A05
            r11 = -149222249(0xfffffffff71b0c97, float:-3.144771E33)
            boolean r16 = X.C51967G9n.A1Y(r3, r13, r11)
            java.lang.Object r11 = r3.ECw()
            if (r16 != 0) goto L_0x033e
            if (r11 != r4) goto L_0x0346
        L_0x033e:
            boolean r11 = X.2R8.A05(r10, r13)
            java.lang.Boolean r11 = X.C51967G9n.A0e(r3, r11)
        L_0x0346:
            boolean r32 = X.AnonymousClass7TE.A1a(r11)
            X.C286565Wx.A0L(r1, r0)
            if (r32 == 0) goto L_0x035f
            X.KhB r13 = r14.A01
            X.KhB r11 = X.C62520KhB.Loaded
            if (r13 == r11) goto L_0x0359
            X.KhB r11 = X.C62520KhB.Saving
            if (r13 != r11) goto L_0x035f
        L_0x0359:
            boolean r11 = r14.A0A
            r31 = 1
            if (r11 != 0) goto L_0x0361
        L_0x035f:
            r31 = 0
        L_0x0361:
            r13 = -139468527(0xfffffffff7afe111, float:-7.1345066E33)
            X.JHW r11 = new X.JHW
            r18 = r11
            r19 = r44
            r20 = r50
            r21 = r15
            r22 = r48
            r23 = r51
            r24 = r45
            r25 = r57
            r26 = r8
            r27 = r0
            r28 = r32
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.5PJ r33 = X.AnonymousClass5PI.A01(r3, r11, r13)
            r13 = -611465936(0xffffffffdb8dc530, float:-7.9809563E16)
            X.JHQ r11 = new X.JHQ
            r21 = r11
            r22 = r15
            r23 = r10
            r24 = r7
            r25 = r8
            r26 = r49
            r27 = r12
            r28 = r29
            r29 = r40
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31)
            X.5PJ r34 = X.AnonymousClass5PI.A01(r3, r11, r13)
            X.JHe r11 = new X.JHe
            r18 = r11
            r19 = r15
            r20 = r7
            r21 = r8
            r22 = r55
            r23 = r54
            r24 = r53
            r25 = r56
            r26 = r52
            r27 = r46
            r28 = r47
            r29 = r43
            r30 = r42
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r12 = -1083463345(0xffffffffbf6ba94f, float:-0.9205522)
            X.5PJ r35 = X.AnonymousClass5PI.A01(r3, r11, r12)
            r36 = 224256(0x36c00, float:3.1425E-40)
            int r11 = r17 >> 24
            r11 = r11 & 112(0x70, float:1.57E-43)
            r36 = r36 | r11
            int r11 = r17 >> 18
            r11 = r11 & 896(0x380, float:1.256E-42)
            r36 = r36 | r11
            r30 = r3
            r31 = r58
            r32 = r9
            r37 = r0
            r38 = r40
            X.C55078Hbn.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.GZF r0 = r7.A00
            int r0 = r0.A03()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = -149084247(0xfffffffff71d27a9, float:-3.1874805E33)
            boolean r5 = X.C51973G9u.A1N(r3, r0, r5)
            boolean r0 = r3.AGu(r7)
            boolean r0 = X.C51973G9u.A1T(r3, r8, r10, r0, r5)
            boolean r5 = X.C51966G9m.A1U(r3, r15, r0)
            java.lang.Object r0 = r3.ECw()
            if (r5 != 0) goto L_0x0408
            if (r0 != r4) goto L_0x041b
        L_0x0408:
            r17 = 0
            r18 = 7
            X.MGM r0 = new X.MGM
            r11 = r0
            r12 = r10
            r13 = r49
            r14 = r7
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r3.FLL(r0)
        L_0x041b:
            boolean r0 = X.C51972G9s.A1S(r3, r1, r0, r9)
            if (r0 == 0) goto L_0x0146
            r0 = 1967000793(0x753e0cd9, float:2.4091723E32)
            X.0fL.A00(r0)
            goto L_0x0146
        L_0x0429:
            r17 = r2
            goto L_0x00a9
        L_0x042d:
            r5 = r6
            goto L_0x0018
        L_0x0430:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7S.A06(X.5Wy, androidx.compose.ui.Modifier, X.0iw, X.Dry, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, X.0sL, X.0sK, X.0sK, int, int, long):void");
    }

    public static final void A07(C286575Wy r43, Modifier modifier, AnonymousClass0iw r45, C46789DlJ dlJ, String str, C62320sa r48, C62320sa r49, C62320sa r50, C62320sa r51, C62320sa r52, C62320sa r53, C62320sa r54, C62320sa r55, C62320sa r56, C62320sa r57, C62320sa r58, 0sP r59, 0sP r60, 0sP r61, 0sL r62, 0sL r63, 0sK r64, 0sK r65, int i, int i2, int i3, long j, boolean z) {
        int i4;
        int i5;
        int i6;
        C52397GQw A002;
        C62320sa r27 = r48;
        0qQ.A0B(r27, 0);
        C62320sa r33 = r51;
        C62320sa r32 = r50;
        C62320sa r31 = r49;
        AnonymousClass7TG.A1U(r31, r32, r33);
        C62320sa r29 = r53;
        C62320sa r28 = r52;
        DbW.A1N(r28, 4, r29);
        0sK r41 = r64;
        0sP r37 = r60;
        0sP r36 = r59;
        C51973G9u.A0s(6, r36, r37, r41);
        0sK r42 = r65;
        0sP r38 = r61;
        C51969G9p.A1N(r42, 9, r38);
        C62320sa r34 = r55;
        C62320sa r30 = r54;
        0sL r40 = r63;
        0sL r39 = r62;
        C51974G9v.A1R(r30, r39, r34, r40);
        C62320sa r35 = r56;
        0qQ.A0B(r35, 15);
        C62320sa r502 = r57;
        C62320sa r26 = r58;
        C51969G9p.A1S(r502, 16, r26);
        C46789DlJ dlJ2 = dlJ;
        0qQ.A0B(dlJ2, 18);
        AnonymousClass0iw r522 = r45;
        Modifier modifier2 = modifier;
        C51970G9q.A1O(r522, 20, modifier2);
        C286575Wy r3 = r43;
        r3.ExV(-1071761543);
        int i7 = i;
        if ((i & 6) == 0) {
            i4 = i | C41848B3p.A01(r3, r27);
        } else {
            i4 = i7;
        }
        int i8 = 32;
        if ((i & 48) == 0) {
            i4 |= G9t.A0F(r3, r31);
        }
        int i9 = 128;
        if ((i7 & 384) == 0) {
            i4 |= G9t.A0G(r3, r32);
        }
        if ((i7 & 3072) == 0) {
            i4 |= G9t.A0H(r3, r33);
        }
        int i10 = 8192;
        if ((i7 & 24576) == 0) {
            i4 |= G9t.A0I(r3, r28);
        }
        if ((i & 196608) == 0) {
            i4 |= G9t.A0J(r3, r29);
        }
        if ((i & 1572864) == 0) {
            i4 |= G9t.A0K(r3, r36);
        }
        if ((i & 12582912) == 0) {
            i4 |= G9t.A0L(r3, r37);
        }
        if ((i & 100663296) == 0) {
            i4 |= G9t.A0M(r3, r41);
        }
        if ((i & 805306368) == 0) {
            i4 |= G9t.A0N(r3, r42);
        }
        int i11 = i2;
        if ((i2 & 6) == 0) {
            i5 = i2 | C41848B3p.A01(r3, r38);
        } else {
            i5 = i11;
        }
        if ((i2 & 48) == 0) {
            i5 |= G9t.A0F(r3, r30);
        }
        if ((i11 & 384) == 0) {
            i5 |= G9t.A0G(r3, r39);
        }
        if ((i11 & 3072) == 0) {
            i5 |= G9t.A0H(r3, r34);
        }
        if ((i11 & 24576) == 0) {
            if (r3.AGw(r40)) {
                i10 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i5 |= i10;
        }
        if ((i2 & 196608) == 0) {
            i5 |= G9t.A0J(r3, r35);
        }
        if ((i2 & 1572864) == 0) {
            i5 |= G9t.A0K(r3, r502);
        }
        if ((i2 & 12582912) == 0) {
            i5 |= G9t.A0L(r3, r26);
        }
        if ((i2 & 100663296) == 0) {
            i5 |= G9t.A0M(r3, dlJ2);
        }
        String str2 = str;
        if ((i2 & 805306368) == 0) {
            i5 |= G9t.A0X(r3, str2);
        }
        int i12 = i3;
        if ((i3 & 6) == 0) {
            i6 = i3 | C51971G9r.A08(r3, r522);
        } else {
            i6 = i12;
        }
        long j2 = j;
        if ((i3 & 48) == 0) {
            if (!r3.AGt(j2)) {
                i8 = 16;
            }
            i6 |= i8;
        }
        boolean z2 = z;
        if ((i12 & 384) == 0) {
            if (r3.AGv(z2)) {
                i9 = 256;
            }
            i6 |= i9;
        }
        if ((i12 & 3072) == 0) {
            i6 |= C51971G9r.A07(r3, modifier2);
        }
        if ((i4 & 306783379) == 306783378 && (306783379 & i5) == 306783378 && (i6 & 1171) == 1170 && r3.Bwn()) {
            r3.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1619877306, "com.instagram.opal.impl.ui.OpalContent (OpalContent.kt:137)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r3, dlJ2.A06, 0);
            Object[] objArr = new Object[0];
            boolean A1Z = C51974G9v.A1Z(r3, 448744683, i6);
            Object ECw = r3.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C52649GaN(z2, 4);
                r3.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r3, false);
            C284945Oz r15 = (C284945Oz) C305136Gr.A00(r3, (C286015Tp) null, (C62320sa) ECw, objArr, 0, 6);
            Object A0m = C51967G9n.A0m(r3, 448746634);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r12 = (C284945Oz) C51974G9v.A0Z(r3, A0m, obj, false);
            boolean A1W = AnonymousClass7TF.A1W(((C47183Dry) C51967G9n.A0o(A0H, A02, false)).A06, C62520KhB.Loading);
            UserSession A0f = C51970G9q.A0f(r3);
            Object A0m2 = C51967G9n.A0m(r3, 448752820);
            if (A0m2 == obj) {
                A0m2 = AnonymousClass7TF.A0R(DbS.A0J(A0f, 0), A0f, 36321082429350993L);
                r3.FLL(A0m2);
            }
            boolean A1a = AnonymousClass7TE.A1a(A0m2);
            C286565Wx.A0L(A0H, false);
            if (A1a) {
                r3.ExS(1026580304);
                boolean A1W2 = C51971G9r.A1W(r12);
                A002 = C52382GQh.A00(GQC.A01(C52518GVv.A02, 200, 0), r3, C58474IsV.A00, 0.0f, 3120, 36, A1W2);
            } else {
                r3.ExS(1026816338);
                boolean A1Z2 = C51967G9n.A1Z(r3, dlJ2, 448767807);
                Object ECw2 = r3.ECw();
                if (A1Z2 || ECw2 == obj) {
                    ECw2 = G9w.A0s(r3, dlJ2, 9);
                }
                A002 = C52382GQh.A00((GQC) null, r3, C51965G9l.A0y(A0H, ECw2, false), 0.0f, 3072, 52, A1W);
            }
            C286565Wx.A0L(A0H, false);
            r3.ExS(448770604);
            if (A1a && C51971G9r.A03(A002.A06) / A002.A01 > 1.0f) {
                C60340gF r9 = C60340gF.A00;
                r3.ExS(448774785);
                boolean A1M = C51973G9u.A1M(i5, 3670016);
                Object ECw3 = r3.ECw();
                if (A1M || ECw3 == obj) {
                    ECw3 = new C51648Fy7(r502, r12, (AnonymousClass4D7) null, 6);
                    r3.FLL(ECw3);
                }
                C51968G9o.A1E(r3, A0H, ECw3, r9);
            }
            C286565Wx.A0L(A0H, false);
            if (C51972G9s.A1T(r3, C52383GQi.A00(modifier2, A002), new C59294JDu(r15, r12, A02, (C285165Qa) r3.AJO(AnonymousClass5YA.A02), r522, A0f, A002, dlJ2, str2, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, j2, A1a, A1W), 737584695)) {
                0fL.A00(-922343279);
            }
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59289JDp(modifier2, r522, dlJ2, str2, r27, r31, r32, r33, r28, r29, r30, r34, r35, r502, r26, r36, r37, r38, r39, r40, r41, r42, i7, i11, i12, j2, z2);
        }
    }
}
