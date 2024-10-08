package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.user.model.User;
import org.webrtc.CameraCapturer;

/* renamed from: X.Hwg  reason: case insensitive filesystem */
public abstract class C56329Hwg {
    public static final void A01(C286575Wy r33, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, String str, C62320sa r37, C62320sa r38, C62320sa r39, C62320sa r40, 0sP r41, int i, boolean z, boolean z2) {
        int i2;
        long A01;
        C62320sa r31 = r37;
        0qQ.A0B(r31, 0);
        C62320sa r30 = r38;
        C62320sa r29 = r39;
        0sP r27 = r41;
        DbZ.A0t(1, r30, r27, r29);
        OpalProfileData opalProfileData3 = opalProfileData;
        OpalProfileData opalProfileData4 = opalProfileData2;
        C62320sa r28 = r40;
        C51973G9u.A0t(4, r28, opalProfileData3, opalProfileData4);
        C286575Wy r0 = r33;
        r0.ExV(293931549);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r0, r31) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r0, r30);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r0, r27);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r0, r29);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r0, r28);
        }
        boolean z3 = z;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0d(r0, z3);
        }
        boolean z4 = z2;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0e(r0, z4);
        }
        String str2 = str;
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0V(r0, str2);
        }
        if ((100663296 & i) == 0) {
            i2 |= G9t.A0M(r0, opalProfileData3);
        }
        if ((805306368 & i) == 0) {
            i2 |= G9t.A0N(r0, opalProfileData4);
        }
        if ((306783379 & i2) != 306783378 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-550978233, "com.instagram.opal.impl.ui.OpalNavbar (OpalNavbar.kt:50)");
            }
            UserSession A0h = C51968G9o.A0h(r0);
            String str3 = opalProfileData4.A05;
            boolean A1Y = C51967G9n.A1Y(r0, str3, -93226064);
            Object ECw = r0.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C51967G9n.A0e(r0, 2R8.A05(A0h, str3));
            }
            boolean A1a = AnonymousClass7TE.A1a(ECw);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            String str4 = opalProfileData4.A07;
            boolean A1Y2 = C51967G9n.A1Y(r0, str4, -93221624);
            Object ECw2 = r0.ECw();
            if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                if (str4.length() != 0 || str == null) {
                    ECw2 = str4;
                } else {
                    User A02 = 17h.A00(A0h).A02(str2);
                    if (A02 != null) {
                        ECw2 = A02.getUsername();
                    } else {
                        ECw2 = "";
                    }
                }
                r0.FLL(ECw2);
            }
            String str5 = (String) ECw2;
            C286565Wx.A0L(A0H, false);
            C285245Qk r11 = Modifier.A00;
            Modifier A0X = C51966G9m.A0X(C287195Zj.A0B(C51966G9m.A0T(r11), 16.0f, 0.0f, 12.0f, 0.0f), C51966G9m.A0A(r0));
            C287295Zu r17 = C287275Zs.A01;
            C287245Zp r14 = C287215Zl.A05;
            AnonymousClass5RD A022 = C287395a4.A02(r17, r0, r14, 0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A0X);
            C62320sa r21 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r21);
            0sL r15 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A022, A04, r15);
            0sL r13 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r13, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            AnonymousClass6FX r7 = AnonymousClass6FX.A00;
            Modifier A09 = C287205Zk.A09(r7.A00(r11), 22.0f);
            C287245Zp r10 = C287215Zl.A04;
            Modifier AB1 = r7.AB1(r10, A09);
            AnonymousClass5RD A023 = C287395a4.A02(r17, r0, r14, 0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r0, AB1);
            C51973G9u.A0z(r0, A0H, r21);
            C287595aO.A00(r0, A023, r15);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r13, A002);
            }
            C287595aO.A00(r0, A013, A1K);
            A00(r0, r7.AB1(r10, r11), r28, C51965G9l.A02(i2 >> 12), z3);
            long A0H2 = C51966G9m.A0H(r0);
            if (z2) {
                A01 = AnonymousClass5Z7.A00(21.5f, 4294967296L);
            } else {
                A01 = AnonymousClass5Z7.A01(20);
            }
            AnonymousClass5ZZ.A0K(r0, (Modifier) null, C51966G9m.A0e(r0), str5, 0, 16370, A0H2, A01);
            r0.ASN();
            if (A1a) {
                r0.ExS(-991809336);
                boolean z5 = false;
                if (0qQ.A0K(opalProfileData4.A04, opalProfileData3.A04) && 0qQ.A0K(opalProfileData4.A02, opalProfileData3.A02) && opalProfileData4.A00 == opalProfileData3.A00 && opalProfileData4.A0C == opalProfileData3.A0C && 0qQ.A0K(opalProfileData4.A06, opalProfileData3.A06)) {
                    z5 = C51971G9r.A1Z(opalProfileData4.A03, opalProfileData3.A03, false);
                }
                boolean z6 = !z5;
                AnonymousClass2DO A003 = C287975bA.A00(r0, R.drawable.instagram_new_post_pano_outline_24, 0);
                String A004 = C304346Dc.A00(r0, 2131968858);
                Modifier AB12 = r7.AB1(r10, C287205Zk.A0C(C287195Zj.A0B(r11, 8.0f, 0.0f, 0.0f, 0.0f), 24.0f));
                boolean A1N = C51973G9u.A1N(r0, -447623870, i2);
                Object ECw3 = r0.ECw();
                if (A1N || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C51794G2d(r31, 47);
                    r0.FLL(ECw3);
                }
                C288165bT.A08(r0, C287635aW.A05(AB12, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw3, false), true), A003, A004, C51966G9m.A0G(r0));
                if (opalProfileData4.A01 == C62520KhB.Saving) {
                    r0.ExS(-991268231);
                    GQD.A00(r0, r7.AB1(r10, C287205Zk.A0C(C287195Zj.A0B(r11, 24.0f, 0.0f, 0.0f, 0.0f), 24.0f)));
                    C286565Wx.A0L(A0H, false);
                } else if (z6) {
                    r0.ExS(-991065026);
                    AnonymousClass2DO A005 = C287975bA.A00(r0, R.drawable.instagram_check_pano_filled_24, 0);
                    String A006 = C304346Dc.A00(r0, 2131972502);
                    Modifier AB13 = r7.AB1(r10, C287205Zk.A0C(C287195Zj.A0B(r11, 24.0f, 0.0f, 0.0f, 0.0f), 24.0f));
                    boolean A1a2 = C51974G9v.A1a(r0, -447600686, i2);
                    Object ECw4 = r0.ECw();
                    if (A1a2 || ECw4 == AnonymousClass5XT.A00) {
                        ECw4 = new C51794G2d(r29, 48);
                        r0.FLL(ECw4);
                    }
                    C288165bT.A08(r0, C287635aW.A05(AB13, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw4, false), true), A005, A006, C51966G9m.A0G(r0));
                    C286565Wx.A0L(A0H, false);
                } else {
                    r0.ExS(-990598910);
                    AnonymousClass2DO A007 = C287975bA.A00(r0, R.drawable.instagram_edit_pano_outline_24, 0);
                    String A008 = C304346Dc.A00(r0, 2131968861);
                    Modifier AB14 = r7.AB1(r10, C287205Zk.A0C(C287195Zj.A0B(r11, 24.0f, 0.0f, 0.0f, 0.0f), 24.0f));
                    boolean A1Y3 = C51974G9v.A1Y(r0, -447584875, i2);
                    Object ECw5 = r0.ECw();
                    if (A1Y3 || ECw5 == AnonymousClass5XT.A00) {
                        ECw5 = new C51794G2d(r30, 49);
                        r0.FLL(ECw5);
                    }
                    C288165bT.A08(r0, C287635aW.A05(AB14, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw5, false), true), A007, A008, C51966G9m.A0G(r0));
                    C286565Wx.A0L(A0H, false);
                }
            } else {
                r0.ExS(-990105669);
                AnonymousClass2DO A009 = C287975bA.A00(r0, R.drawable.instagram_more_vertical_pano_outline_24, 0);
                String A0010 = C304346Dc.A00(r0, 2131966723);
                Modifier AB15 = r7.AB1(r10, C287205Zk.A04(r11));
                boolean A1U = C51966G9m.A1U(r0, opalProfileData4, C51974G9v.A1Z(r0, -447572920, i2));
                Object ECw6 = r0.ECw();
                if (A1U || ECw6 == AnonymousClass5XT.A00) {
                    ECw6 = C51970G9q.A0w(r0, r27, opalProfileData4, 44);
                }
                C288165bT.A08(r0, C287635aW.A05(AB15, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw6, false), true), A009, A0010, C51966G9m.A0G(r0));
            }
            if (C51971G9r.A1S(r0, A0H, false)) {
                0fL.A00(311002064);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59225JBd(opalProfileData3, opalProfileData4, str2, r31, r30, r29, r28, r27, i3, z3, z4);
        }
    }

    public static final void A00(C286575Wy r14, Modifier modifier, C62320sa r16, int i, boolean z) {
        int i2;
        C286575Wy r13 = r14;
        r14.ExV(1760283049);
        int i3 = i;
        C62320sa r4 = r16;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r4) | i3;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i3 & 48) == 0) {
            i2 |= G9t.A0Z(r14, z2);
        }
        Modifier modifier2 = modifier;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r14, modifier);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1834205414, "com.instagram.opal.impl.ui.OpalIcon (OpalNavbar.kt:144)");
            }
            Object A0m = C51967G9n.A0m(r14, -329131587);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new C52882GeI(DbT.A0l(z2));
                r14.FLL(A0m);
            }
            C52882GeI geI = (C52882GeI) A0m;
            C286565Wx r9 = (C286565Wx) r13;
            C286565Wx.A0L(r9, false);
            C60340gF r11 = C60340gF.A00;
            boolean A1Z = C51967G9n.A1Z(r14, geI, -329129185);
            Object ECw = r14.ECw();
            if (A1Z || ECw == obj) {
                ECw = new C51645Fy4(geI, (AnonymousClass4D7) null, 49);
                r14.FLL(ECw);
            }
            C51968G9o.A1E(r14, r9, ECw, r11);
            float A00 = C51971G9r.A00(C51972G9s.A1Y(geI.A01) ? 1 : 0);
            GQC A002 = GQC.A00(CameraCapturer.OPEN_CAMERA_DELAY_MS, 0);
            boolean A1N = C51973G9u.A1N(r14, -329117149, i2);
            Object ECw2 = r14.ECw();
            if (A1N || ECw2 == obj) {
                ECw2 = C51970G9q.A0t(r14, r4, 45);
            }
            C270284gU A02 = I69.A02(A002, r13, C51965G9l.A0z(r9, ECw2), A00, 3120, 4);
            Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(modifier2, 0.0f, 0.0f, C51971G9r.A03(A02) * 6.0f, 0.0f), C51971G9r.A03(A02) * 22.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A003 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r13, A0C);
            C51973G9u.A0y(r13, r9);
            C51971G9r.A12(r13, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r13, A003)) {
                C51971G9r.A13(r13, r1, A003);
            }
            C51965G9l.A18(r13, A01);
            C289515dj r12 = C289515dj.A00;
            C288165bT.A05(r13, C51965G9l.A0L(r12, C287205Zk.A03(Modifier.A00)), C287975bA.A00(r13, R.drawable.instagram_key_pano_filled_24, 0), C51966G9m.A0G(r13));
            if (C51967G9n.A1R(r13)) {
                0fL.A00(2074616408);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 15, r4, modifier2, z2);
        }
    }
}
