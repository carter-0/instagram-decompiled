package X;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class H19 extends AnonymousClass4DH implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "OpenCarouselReviewPageHeaderFragment";
    public User A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "open_carousel_review_page_header";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public H19() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58178Ini(new C58178Ini(this, 27), 25));
        0Yh A0z = DbS.A0z(C53039GhV.class);
        this.A02 = DbS.A0I(new C58178Ini(A002, 26), new C58186Inq(5, A002, this), new C58186Inq(4, (Object) null, A002), A0z);
    }

    public static final void A00(C286575Wy r18, GMQ gmq, H19 h19, int i) {
        int i2;
        String str;
        int i3;
        List Aay;
        C286575Wy r13 = r18;
        r13.ExV(-1574236929);
        int i4 = i;
        GMQ gmq2 = gmq;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, gmq2) | i;
        } else {
            i2 = i4;
        }
        H19 h192 = h19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, h192);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-94481417, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.AuthorComponent (OpenCarouselReviewPageHeaderFragment.kt:102)");
            }
            C287245Zp r1 = C287215Zl.A04;
            C285245Qk r5 = Modifier.A00;
            String str2 = null;
            Modifier A0A = C287195Zj.A0A(r5, 16.0f, 0.0f, 16.0f);
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r13, r1);
            int A002 = C287425a7.A00(r13);
            C286565Wx r2 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r13, A0A);
            C51973G9u.A0y(r13, r2);
            C51971G9r.A12(r13, A0Q, A04);
            0sL r12 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r12, A002);
            }
            C51965G9l.A18(r13, A012);
            User user = h192.A00;
            if (user != null) {
                str = user.Bh3().getUrl();
            } else {
                str = null;
            }
            r13.ExS(-1262993933);
            if (str == null) {
                i3 = 2;
            } else {
                SimpleImageUrl A003 = C253833rU.A00(DbT.A09(str), -1, -1);
                i3 = 2;
                AnonymousClass2DN A004 = 1zC.A00(r13, A003);
                Modifier A0W = C51966G9m.A0W(C287195Zj.A0B(C287205Zk.A0G(r5, 26.0f, 20.0f), 0.0f, 0.0f, 6.0f, 0.0f));
                boolean A1Z = C51967G9n.A1Z(r13, h192, 53831711);
                Object ECw = r13.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58178Ini(h192, 22);
                    r13.FLL(ECw);
                }
                AnonymousClass6G3.A08(r13, C52638GaC.A01(r13, A0W, C51965G9l.A0y(r2, ECw, false)), A004, C288075bK.A01);
            }
            C286565Wx.A0L(r2, false);
            User user2 = h192.A00;
            if (user2 != null) {
                str2 = user2.getUsername();
            }
            r13.ExS(-1262975128);
            if (str2 != null) {
                AnonymousClass5Z4 A0h = C51966G9m.A0h(r13);
                long A0H = C51966G9m.A0H(r13);
                boolean A1Z2 = C51967G9n.A1Z(r13, h192, 53844191);
                Object ECw2 = r13.ECw();
                if (A1Z2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58178Ini(h192, 23);
                    r13.FLL(ECw2);
                }
                AnonymousClass5ZZ.A0E(r13, C52638GaC.A01(r13, r5, C51965G9l.A0y(r2, ECw2, false)), A0h, str2, 1, 0, 15352, A0H);
                r13.ExS(-1262965797);
                User user3 = h192.A00;
                if (user3 != null && user3.isVerified()) {
                    AnonymousClass6FU.A00(r13, C287195Zj.A0B(r5, 1.0f, 0.0f, 0.0f, 0.0f), 0.0f, 6, i3);
                }
                C286565Wx.A0L(r2, false);
                r13.ExS(-1262961593);
                1Xj r14 = (1Xj) gmq2.A05;
                if (!(r14 == null || (Aay = r14.A0C.Aay()) == null || !AnonymousClass7TE.A1b(Aay))) {
                    A02(r13, gmq2, h192, C51965G9l.A01(i2));
                }
                C286565Wx.A0L(r2, false);
            }
            if (C51971G9r.A1S(r13, r2, false)) {
                0fL.A00(2000951229);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, gmq2, h192, i4, 20);
        }
    }

    public static final void A01(C286575Wy r10, GMQ gmq, H19 h19, int i) {
        int i2;
        String A2o;
        C286575Wy r3 = r10;
        r10.ExV(-1990391272);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, gmq) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2069647486, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.PromptComponent (OpenCarouselReviewPageHeaderFragment.kt:90)");
            }
            1Xj r0 = (1Xj) gmq.A05;
            if (!(r0 == null || (A2o = r0.A2o()) == null)) {
                AnonymousClass5ZZ.A0I(r3, C287195Zj.A0A(Modifier.A00, 16.0f, 0.0f, 16.0f), C51965G9l.A0S(r10), A2o, 5, 16252, 0);
            }
            if (0fL.A02()) {
                0fL.A00(-1918839485);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, gmq, h19, i, 21);
        }
    }

    public static final void A02(C286575Wy r20, GMQ gmq, H19 h19, int i) {
        int i2;
        int i3;
        List Aay;
        C286575Wy r0 = r20;
        r0.ExV(-6353222);
        int i4 = i;
        GMQ gmq2 = gmq;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r0, gmq2) | i;
        } else {
            i2 = i4;
        }
        H19 h192 = h19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r0, h192);
        }
        if ((i2 & 19) != 18 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-195990374, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.SubmitterCountComponent (OpenCarouselReviewPageHeaderFragment.kt:137)");
            }
            1Xj r4 = (1Xj) gmq2.A05;
            if (r4 == null || (Aay = r4.A0C.Aay()) == null) {
                i3 = 0;
            } else {
                i3 = Aay.size();
            }
            Spanned A022 = 0bC.A02(DbV.A05(h192), new String[]{"", String.valueOf(i3)}, R.plurals.open_carousel_media_user_name_header, i3);
            0qQ.A07(A022);
            Object obj = null;
            C303876Bd A0b = C51969G9p.A0b();
            A0b.A09(" ");
            String obj2 = A022.toString();
            Object[] spans = A022.getSpans(0, A022.length(), Object.class);
            0qQ.A07(spans);
            if (0 < spans.length) {
                obj = spans[0];
            }
            A0b.A09(obj2);
            if (obj != null) {
                int spanStart = A022.getSpanStart(obj) + 1;
                int spanEnd = A022.getSpanEnd(obj) + 1;
                A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65531, 0, 0, 0), spanStart, spanEnd);
                A0b.A0A("submitters", "Submitters", spanStart, spanEnd);
            }
            C286025Tq A023 = A0b.A02();
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
            long A0H = C51966G9m.A0H(r0);
            C285245Qk r7 = Modifier.A00;
            boolean A1S = C51973G9u.A1S(r0, h192, gmq2, 923035727);
            Object ECw = r0.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C58186Inq(3, gmq2, h192);
                r0.FLL(ECw);
            }
            C51965G9l.A1X(r0, false);
            AnonymousClass5ZZ.A01(r0, C52638GaC.A01(r0, r7, (C62320sa) ECw), A023, A0c, 24568, A0H);
            if (0fL.A02()) {
                0fL.A00(30226602);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, gmq2, h192, i4, 22);
        }
    }

    public static final void A03(C286575Wy r4, H19 h19, int i) {
        r4.ExV(-1992476345);
        if ((i & 1) != 0 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-793889692, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.Separator (OpenCarouselReviewPageHeaderFragment.kt:230)");
            }
            C285245Qk r3 = Modifier.A00;
            C51969G9p.A14(r4, C287205Zk.A08(C51966G9m.A0T(r3), 0.5f), C51965G9l.A0A(r4));
            G9w.A15(r4, r3, 8.0f);
            if (0fL.A02()) {
                0fL.A00(1356365525);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, h19, i, 19);
        }
    }

    public static final void A04(C286575Wy r15, H19 h19, int i) {
        int i2;
        C286575Wy r7 = r15;
        r15.ExV(-1156136344);
        int i3 = i;
        H19 h192 = h19;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, h192) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(475409250, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.ViewPostButtonComponent (OpenCarouselReviewPageHeaderFragment.kt:167)");
            }
            boolean A1Z = C51967G9n.A1Z(r15, h192, -1753113227);
            Object ECw = r15.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C58178Ini(h192, 24);
                r15.FLL(ECw);
            }
            boolean A1Y = C51968G9o.A1Y(r15);
            String A002 = C304346Dc.A00(r15, 2131969007);
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(Modifier.A00), 16.0f, 6.0f, 16.0f, 20.0f);
            C52399GQy A0m = C51965G9l.A0m(r15);
            AnonymousClass6CE.A00((C287605aT) null, r7, A0B, (AnonymousClass6CG) null, AnonymousClass6CD.LARGE, A0m, A002, (C62320sa) ECw, 14180352, 264, true, A1Y);
            if (0fL.A02()) {
                0fL.A00(-341243143);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, h192, i3, 20);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1851263395);
        ComposeView A0H = DbV.A0H(this, JGK.A01(this, 49), -1381756590);
        AnonymousClass0fD.A09(-1762906801, A022);
        return A0H;
    }
}
