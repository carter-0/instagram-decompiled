package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;
import java.util.List;

public abstract class I54 {
    public static final void A02(C286575Wy r30, 0sP r31, int i, int i2) {
        int i3;
        0sP r3 = r31;
        0qQ.A0B(r3, 1);
        C286575Wy r0 = r30;
        r0.ExV(-1895940200);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = G9t.A05(r0, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 112) == 0) {
            i3 |= G9t.A0F(r0, r3);
        }
        if ((i3 & 91) != 18 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1662641537, "com.instagram.partnerprogram.fragment.OverlayAdsHeaderView (PublisherControlBlockedCategoriesComposeFragment.kt:278)");
            }
            r0.ExS(871928196);
            C303876Bd A0b = C51969G9p.A0b();
            String A00 = C304346Dc.A00(r0, 2131963681);
            String A02 = C304346Dc.A02(r0, C51968G9o.A1Z(A00, i5), R.plurals.ig_overlay_ads_publisher_control_revshare_blocked_categories_screen_description_text, i5);
            A0b.A09(A02);
            0qQ.A0B(A02, 0);
            int A0G = C51971G9r.A0G(A02, A00);
            int A05 = DbX.A05(A00) + A0G;
            A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0N(r0), 0, 0), A0G, A05);
            C286025Tq A0K = C51967G9n.A0K(A0b, "Disclaimer link", "Clickable link", A0G, A05);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            Modifier A01 = C287195Zj.A01(C51969G9p.A0U());
            AnonymousClass5Z4 A0D = C51966G9m.A0f(r0).A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 6291454, C51966G9m.A0M(r0), 0, 0, 0));
            boolean A1Y = C51967G9n.A1Y(r0, A0K, 871968955) | C51968G9o.A1S(i3);
            Object ECw = r0.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new MPB(43, (Object) A0K, (Object) r3);
                r0.FLL(ECw);
            }
            HR5.A00(r0, A01, A0K, A0D, (0sP) null, C51965G9l.A0z(A0H, ECw), 0, 0, 48, 120, false);
            if (0fL.A02()) {
                0fL.A00(-565320347);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, r3, i5, i4, 18);
        }
    }

    public static final void A03(C286575Wy r31, 0sP r32, int i, int i2) {
        int i3;
        String A02;
        0sP r3 = r32;
        0qQ.A0B(r3, 1);
        C286575Wy r0 = r31;
        r0.ExV(719511455);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = G9t.A05(r0, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 112) == 0) {
            i3 |= G9t.A0F(r0, r3);
        }
        if ((i3 & 91) != 18 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(146413273, "com.instagram.partnerprogram.fragment.ProfileAdsHeaderView (PublisherControlBlockedCategoriesComposeFragment.kt:222)");
            }
            r0.ExS(2057360932);
            C303876Bd A0b = C51969G9p.A0b();
            String A00 = C304346Dc.A00(r0, 2131963681);
            if (i5 == -1) {
                r0.ExS(-2140320974);
                A02 = G9w.A0h(r0, A00, 2131963686);
            } else {
                r0.ExS(-2140118699);
                A02 = C304346Dc.A02(r0, C51968G9o.A1Z(A00, i5), R.plurals.ig_profile_publisher_control_non_revshare_blocked_categories_screen_description_text, i5);
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            A0b.A09(A02);
            0qQ.A0B(A02, 0);
            int A0G = C51971G9r.A0G(A02, A00);
            int A05 = DbX.A05(A00) + A0G;
            A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0N(r0), 0, 0), A0G, A05);
            C286025Tq A0K = C51967G9n.A0K(A0b, "Disclaimer link", "Clickable link", A0G, A05);
            C286565Wx.A0L(A0H, false);
            Modifier A01 = C287195Zj.A01(C51969G9p.A0U());
            AnonymousClass5Z4 A0D = C51966G9m.A0f(r0).A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 6291454, C51966G9m.A0M(r0), 0, 0, 0));
            boolean A1Y = C51967G9n.A1Y(r0, A0K, 2057411394) | C51968G9o.A1S(i3);
            Object ECw = r0.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new MPB(44, (Object) A0K, (Object) r3);
                r0.FLL(ECw);
            }
            HR5.A00(r0, A01, A0K, A0D, (0sP) null, C51965G9l.A0z(A0H, ECw), 0, 0, 48, 120, false);
            if (0fL.A02()) {
                0fL.A00(-47568422);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, r3, i5, i4, 19);
        }
    }

    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(770381693);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1874760643, "com.instagram.partnerprogram.fragment.LoadingComponent (PublisherControlBlockedCategoriesComposeFragment.kt:179)");
            }
            C285245Qk r5 = Modifier.A00;
            AnonymousClass5RD A0Y = C51970G9q.A0Y();
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, r5);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A0Y, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            GQD.A03(r6, r5, A01);
            if (0fL.A02()) {
                0fL.A00(1296603875);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 4);
        }
    }

    public static final void A01(C286575Wy r14, IGRevShareProductType iGRevShareProductType, List list, 0sP r17, int i, int i2) {
        if (C51967G9n.A1T(r14, 1423012944)) {
            0fL.A01(-740432857, "com.instagram.partnerprogram.fragment.CategoryListComponent (PublisherControlBlockedCategoriesComposeFragment.kt:189)");
        }
        IGRevShareProductType iGRevShareProductType2 = iGRevShareProductType;
        List list2 = list;
        0sP r7 = r17;
        int i3 = i;
        if (C51975G9x.A1T(r14, new C59135J7r(i3, 4, r7, iGRevShareProductType, list2), 465570002)) {
            0fL.A00(1249498655);
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i2, i3, 34, list2, iGRevShareProductType2, r7);
        }
    }
}
