package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HYs  reason: case insensitive filesystem */
public abstract class C54936HYs {
    public static final void A00(C286575Wy r29, Modifier modifier, String str, String str2, String str3, String str4, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r8 = r29;
        r8.ExV(895675233);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r8, str) | i;
        } else {
            i3 = i5;
        }
        String str5 = str2;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r8, str5);
        }
        String str6 = str3;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r8, str6);
        }
        String str7 = str4;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0R(r8, str7);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= G9t.A0S(r8, modifier2);
        }
        if ((46811 & i3) != 9362 || !r8.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1751085550, "com.instagram.creator.achievements.modules.views.EarnedAchievementListCell (EarnedAchievementListCell.kt:28)");
            }
            C287245Zp r14 = C287215Zl.A04;
            C287355a0 r3 = C287275Zs.A04;
            Modifier A09 = C287195Zj.A09(modifier2, 16.0f, 8.0f);
            AnonymousClass5RD A00 = C287395a4.A00(r3, r8, r14);
            int A002 = C287425a7.A00(r8);
            C286565Wx r6 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r8, A09);
            C62320sa r5 = C287485aD.A00;
            C51973G9u.A0z(r8, r6, r5);
            0sL r4 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r8, A00, A04, r4);
            0sL r32 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r32, A002);
            }
            0sL A1K = C51966G9m.A1K(r8, A01);
            C287295Zu r1 = C287275Zs.A01;
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5RD A003 = C287395a4.A00(r1, r8, r14);
            int A004 = C287425a7.A00(r8);
            AnonymousClass5RM A042 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r8, r2);
            C51973G9u.A0z(r8, r6, r5);
            C287595aO.A00(r8, A003, r4);
            if (C51965G9l.A1Y(r8, r6, A042, A0w) || !C51972G9s.A1Q(r8, A004)) {
                C51971G9r.A13(r8, r32, A004);
            }
            C287595aO.A00(r8, A012, A1K);
            AnonymousClass2DN A005 = 1zC.A00(r8, DbS.A0V(str));
            C286575Wy r19 = r8;
            AnonymousClass6G3.A00(r19, C287215Zl.A09, C287205Zk.A0C(r2, 76.0f), (C288195bW) null, A005, (C288095bM) null, (String) null, 0.0f, 3128, 112);
            Modifier A0B = C287195Zj.A0B(r2, 16.0f, 0.0f, 0.0f, 0.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r8, 0);
            int A006 = C287425a7.A00(r8);
            AnonymousClass5RM A043 = C286565Wx.A04(r6);
            Modifier A013 = C287435a8.A01(r8, A0B);
            C51973G9u.A0z(r8, r6, r5);
            C287595aO.A00(r8, A0Z, r4);
            if (C51965G9l.A1Y(r8, r6, A043, A0w) || !C51972G9s.A1Q(r8, A006)) {
                C51971G9r.A13(r8, r32, A006);
            }
            C287595aO.A00(r8, A013, A1K);
            AnonymousClass5ZZ.A0i(r8, C51966G9m.A0h(r8), str5, (i3 >> 3) & 14, 16382);
            r8.ExS(621131597);
            if (str4 != null) {
                AnonymousClass5ZZ.A0h(r8, C51966G9m.A0c(r8), str7);
            }
            C286565Wx.A0L(r6, false);
            r8.ExS(621137705);
            if (str3 != null) {
                C51975G9x.A15(r8, str6);
            }
            C286565Wx.A0L(r6, false);
            r8.ASN();
            if (C51971G9r.A1R(r8)) {
                0fL.A00(-175954143);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59163J8t(modifier2, str, str5, str6, str7, i5, i4);
        }
    }
}
