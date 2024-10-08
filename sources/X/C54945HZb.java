package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HZb  reason: case insensitive filesystem */
public abstract class C54945HZb {
    public static final void A00(C286575Wy r32, OAO oao, int i) {
        int i2;
        boolean z;
        C286575Wy r9 = r32;
        r9.ExV(157325917);
        int i3 = i;
        OAO oao2 = oao;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r9, oao2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1074470634, "com.instagram.direct.fragment.thread.chatsettings.accounttheme.InterstitialScreen (MetaVerifiedBrandedChatNUXInterstitialFragment.kt:84)");
            }
            C56838IEj A00 = I28.A00(r9);
            Object A0m = C51967G9n.A0m(r9, 550423579);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r20 = (C284945Oz) C51974G9v.A0Z(r9, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r9, false);
            C285245Qk r15 = Modifier.A00;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r9);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r9, r15);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r9, A0H, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r9, A0a, A04, r13);
            0sL r11 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r9, A002)) {
                C51971G9r.A13(r9, r11, A002);
            }
            0sL A1K = C51966G9m.A1K(r9, A01);
            C289515dj r19 = C289515dj.A00;
            Modifier A0U = C51966G9m.A0U(r15);
            C287325Zx r5 = C287275Zs.A07;
            C287265Zr r4 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r5, r9, r4, 0);
            int A003 = C287425a7.A00(r9);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r9, A0U);
            C51973G9u.A0z(r9, A0H, r14);
            C287595aO.A00(r9, A02, r13);
            if (C51965G9l.A1Y(r9, A0H, A042, A0w) || !C51972G9s.A1Q(r9, A003)) {
                C51971G9r.A13(r9, r11, A003);
            }
            C287595aO.A00(r9, A012, A1K);
            C304676Et r2 = C304676Et.A00;
            Modifier A0T = C51966G9m.A0T(r15);
            Modifier A013 = I28.A01(A00, r2.A00(A0T, true));
            AnonymousClass5RD A022 = C291495hO.A02(r5, r9, r4, 6);
            int A004 = C287425a7.A00(r9);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A014 = C287435a8.A01(r9, A013);
            C51973G9u.A0z(r9, A0H, r14);
            C287595aO.A00(r9, A022, r13);
            if (C51965G9l.A1Y(r9, A0H, A043, A0w) || !C51972G9s.A1Q(r9, A004)) {
                C51971G9r.A13(r9, r11, A004);
            }
            C287595aO.A00(r9, A014, A1K);
            G9w.A15(r9, r15, 16.0f);
            String A005 = C288035bG.A00(r9, 2131954121);
            I7M.A07(r9, new C53512Gpi(R.drawable.ig_illustrations_illo_messages_refresh, 96.0f), (CharSequence) null, A005, 4082);
            boolean z2 = true;
            Modifier A05 = C287195Zj.A05(A0T);
            AnonymousClass5RD A023 = C291495hO.A02(r5, r9, r4, 0);
            int A006 = C287425a7.A00(r9);
            AnonymousClass5RM A044 = C286565Wx.A04(A0H);
            Modifier A015 = C287435a8.A01(r9, A05);
            C51973G9u.A0z(r9, A0H, r14);
            C287595aO.A00(r9, A023, r13);
            if (C51965G9l.A1Y(r9, A0H, A044, A0w) || !C51972G9s.A1Q(r9, A006)) {
                C51971G9r.A13(r9, r11, A006);
            }
            C287595aO.A00(r9, A015, A1K);
            C56649I6e.A02(r9, C287975bA.A00(r9, R.drawable.instagram_promote_pano_outline_24, 0), C53509Gpf.A00(r9, C288035bG.A00(r9, 2131954117), 2131954118));
            C56649I6e.A05(r9, C53509Gpf.A00(r9, C288035bG.A00(r9, 2131954119), 2131954120), R.drawable.instagram_comment_pano_outline_24);
            r9.ASN();
            G9w.A15(r9, r15, 32.0f);
            r9.ASN();
            String A007 = C288035bG.A00(r9, 2131954122);
            r9.ExS(-595123201);
            int i4 = i2 & 14;
            if (i4 == 4 || ((i2 & 8) != 0 && r9.AGw(oao2))) {
                z = true;
            } else {
                z = false;
            }
            Object ECw = r9.ECw();
            if (z || ECw == obj) {
                ECw = new C73665Phe(10, r20, oao2);
                r9.FLL(ECw);
            }
            C62320sa A0y = C51965G9l.A0y(A0H, ECw, false);
            String A008 = C288035bG.A00(r9, 2131954123);
            r9.ExS(-595114043);
            if (i4 != 4 && ((i2 & 8) == 0 || !r9.AGw(oao2))) {
                z2 = false;
            }
            Object ECw2 = r9.ECw();
            if (z2 || ECw2 == obj) {
                ECw2 = new C73897PlY(oao2, 28);
                r9.FLL(ECw2);
            }
            I7L.A00(r9, A0T, (CharSequence) null, A007, A008, A0y, C51965G9l.A0y(A0H, ECw2, false), 384, 0, 32664);
            r9.ASN();
            r9.ExS(939430487);
            if (C51971G9r.A1W(r20)) {
                GQD.A00(r9, C51965G9l.A0L(r19, r15));
            }
            if (C51971G9r.A1S(r9, A0H, false)) {
                0fL.A00(827430780);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, oao2, i3, 12);
        }
    }
}
