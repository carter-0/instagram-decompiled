package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;

/* renamed from: X.UkN  reason: case insensitive filesystem */
public final class C15899UkN extends C230372pW {
    public final AnonymousClass327 A00;
    public final C15047ULa A01;
    public final 0wc A02;
    public final UserSession A03;
    public final String A04;

    public C15899UkN(C15047ULa uLa, AnonymousClass0iw r3, 1Bk r4, UserSession userSession, ShoppingNavigationInfo shoppingNavigationInfo, String str) {
        super(r4);
        this.A03 = userSession;
        this.A01 = uLa;
        this.A04 = str;
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
        this.A00 = shoppingNavigationInfo.A00();
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        long A0R = AnonymousClass7TE.A0R(obj);
        W3U.A05(this.A03, System.currentTimeMillis());
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_ig_funded_incentive_impression");
        A0e.AAe("ig_funded_discount_ids", C66582MXn.A10(A0R));
        C13988Tno.A17(A0e, this.A00);
        C263944Ny r2 = null;
        A0e.AAK(this.A01.A00(), "bag_logging_info");
        A0e.AAK((0bb) null, "pdp_logging_info");
        String str = this.A04;
        if (str != null) {
            r2 = C263944Ny.A00(str);
        }
        A0e.AAE(r2, "merchant_id");
        A0e.Cgf();
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        long A0R = AnonymousClass7TE.A0R(obj);
        W3U.A05(this.A03, System.currentTimeMillis());
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_ig_funded_incentive_sub_impression");
        A0e.AAe("ig_funded_discount_ids", C66582MXn.A10(A0R));
        C13988Tno.A17(A0e, this.A00);
        C263944Ny r2 = null;
        A0e.AAK(this.A01.A00(), "bag_logging_info");
        A0e.AAK((0bb) null, "pdp_logging_info");
        String str = this.A04;
        if (str != null) {
            r2 = C263944Ny.A00(str);
        }
        A0e.AAE(r2, "merchant_id");
        A0e.Cgf();
    }
}
