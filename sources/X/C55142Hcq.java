package X;

import androidx.compose.ui.Modifier;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;

/* renamed from: X.Hcq  reason: case insensitive filesystem */
public abstract class C55142Hcq {
    public static final void A00(C286575Wy r25, C61074JwC jwC, SettingsScreenViewModel settingsScreenViewModel, C66460MSo mSo, C62320sa r29, int i, int i2) {
        int i3;
        C62320sa r22 = r29;
        C61074JwC jwC2 = jwC;
        SettingsScreenViewModel settingsScreenViewModel2 = settingsScreenViewModel;
        C66460MSo mSo2 = mSo;
        boolean A1b = C51973G9u.A1b(mSo2, jwC2, settingsScreenViewModel2);
        C286575Wy r0 = r25;
        r0.ExV(19229050);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r0, mSo2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r0, jwC2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r0, settingsScreenViewModel2);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r0, r22);
        }
        if ((i3 & 1171) != 1170 || !r0.Bwn()) {
            if (i6 != 0) {
                r22 = C58495Isq.A00;
            }
            if (0fL.A02()) {
                0fL.A01(117172270, "com.instagram.settings2.core.view.SettingBanner (SettingBanner.kt:31)");
            }
            boolean A1S = C51973G9u.A1S(r0, settingsScreenViewModel2, mSo2, -2109345461);
            Object ECw = r0.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C66186MGx((Object) mSo2, (Object) settingsScreenViewModel2, (AnonymousClass4D7) null, 5);
                r0.FLL(ECw);
            }
            C286565Wx A0E = C51975G9x.A0E(r0, ECw, mSo2);
            C285245Qk r12 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(r12, 16.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0E);
            Modifier A01 = C287435a8.A01(r0, A07);
            C62320sa r9 = C287485aD.A00;
            C51973G9u.A0z(r0, A0E, r9);
            0sL r8 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0a, A04, r8);
            0sL r7 = C287485aD.A02;
            if (A0E.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r7, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C287355a0 r15 = C287275Zs.A02;
            AnonymousClass5ZQ A012 = AnonymousClass5ZN.A01(16.0f);
            long j = AnonymousClass5aQ.A00(r0).A09;
            Modifier A0X = C51966G9m.A0X(C51968G9o.A0P(C51966G9m.A0V(C56169Hty.A01(r12, A012, 12.0f, j, AnonymousClass5aQ.A00(r0).A09, C51975G9x.A1M(12.0f))), 16.0f), C51966G9m.A08(r0));
            AnonymousClass5RD A0L = G9w.A0L(r15, r0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0E);
            Modifier A013 = C287435a8.A01(r0, A0X);
            C51973G9u.A0z(r0, A0E, r9);
            C287595aO.A00(r0, A0L, r8);
            if (C51965G9l.A1Y(r0, A0E, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r7, A002);
            }
            C287595aO.A00(r0, A013, A1K);
            String A12 = C51968G9o.A12(r0, (C61083JwL) jwC2.A03);
            long A0H = C51966G9m.A0H(r0);
            C286575Wy r24 = r0;
            AnonymousClass5ZZ.A0Q(r24, C287195Zj.A0B(r12, 16.0f, 16.0f, 16.0f, 0.0f), C51965G9l.A0S(r0), A12, A0H);
            String A122 = C51968G9o.A12(r0, (C61083JwL) jwC2.A02);
            long A0H2 = C51966G9m.A0H(r0);
            AnonymousClass5ZZ.A0Q(r24, C287195Zj.A0B(r12, 16.0f, 4.0f, 16.0f, 0.0f), C51966G9m.A0b(r0), A122, A0H2);
            String A123 = C51968G9o.A12(r0, (C61083JwL) jwC2.A01);
            long A0N = C51966G9m.A0N(r0);
            AnonymousClass5Z4 A0f = C51966G9m.A0f(r0);
            Modifier A0B = C287195Zj.A0B(r12, 16.0f, 4.0f, 16.0f, 16.0f);
            boolean A1S2 = C51973G9u.A1S(r0, settingsScreenViewModel2, mSo2, -1708858502) | C51973G9u.A1J(i3);
            Object ECw2 = r0.ECw();
            if (A1S2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C20704Wxb(15, settingsScreenViewModel2, mSo2, r22);
                r0.FLL(ECw2);
            }
            AnonymousClass5ZZ.A0Q(r24, C287635aW.A05(A0B, (C287625aV) null, (String) null, C51965G9l.A0y(A0E, ECw2, false), A1b), A0f, A123, A0N);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(-1445354928);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(jwC2, settingsScreenViewModel2, mSo2, r22, i5, i4, 23);
        }
    }
}
