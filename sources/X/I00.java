package X;

import com.instagram.common.session.UserSession;

public final class I00 {
    public final long A00;
    public final 0wc A01;
    public final 1Xj A02;
    public final String A03;
    public final boolean A04;
    public final UserSession A05;

    public static final void A00(I00 i00, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(i00.A01, "instagram_shopping_merchant_product_action_sheet_action");
        A0e.A9F("product_id", Long.valueOf(i00.A00));
        A0e.AAE(C263944Ny.A00(i00.A03), "merchant_id");
        DbS.A1J(A0e, str);
        A0e.A7p("is_checkout_enabled", Boolean.valueOf(i00.A04));
        1Xj r2 = i00.A02;
        C51974G9v.A0p(A0e, r2, "m_pk", r2.getId());
        A0e.Cgf();
    }

    public I00(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, String str, String str2, boolean z) {
        this.A05 = userSession;
        this.A00 = DbZ.A07(str);
        this.A03 = str2;
        this.A04 = z;
        this.A02 = r4;
        this.A01 = AnonymousClass0kN.A01(r5, userSession);
    }
}
