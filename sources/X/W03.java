package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public final class W03 {
    public 1Xj A00;
    public C15029UKi A01;
    public final 0wc A02;
    public final UserSession A03;
    public final X9C A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass4DU A08;

    public W03(UserSession userSession, AnonymousClass4DU r3, X9C x9c, String str, String str2, String str3) {
        DbW.A1O(str, 3, userSession);
        this.A08 = r3;
        this.A04 = x9c;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = userSession;
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
    }

    public final void A02(Product product, int i) {
        String str;
        0qQ.A0B(product, 0);
        C15054ULx A032 = C294165ly.A03(this.A03, product);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_ads_app_hero_carousel_load_success");
        if (A0e.isSampled()) {
            C15029UKi uKi = this.A01;
            if (uKi == null || (str = uKi.A05) == null) {
                str = "";
            }
            C51965G9l.A1L(A0e, A00(A0e, this, str));
            A01(A0e, this, C15054ULx.A00(A0e, A032));
            C13991Tnr.A11(A0e, i);
            A0e.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r0.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.0Aj r2, X.W03 r3, java.lang.String r4) {
        /*
            java.lang.String r1 = ""
            java.lang.String r0 = "m_pk"
            r2.AAJ(r0, r4)
            X.UKi r0 = r3.A01
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W03.A00(X.0Aj, X.W03, java.lang.String):java.lang.String");
    }

    public static void A01(0Aj r2, W03 w03, Long l) {
        r2.A9F("product_id", l);
        r2.AAJ("prior_module", w03.A05);
        r2.AAJ("prior_submodule", w03.A06);
    }

    public final void A03(Product product, String str) {
        String str2;
        C15054ULx A032 = C294165ly.A03(this.A03, product);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_ads_app_cta_click");
        if (A0e.isSampled()) {
            C15029UKi uKi = this.A01;
            if (uKi == null || (str2 = uKi.A05) == null) {
                str2 = "";
            }
            C51965G9l.A1L(A0e, A00(A0e, this, str2));
            A01(A0e, this, C15054ULx.A00(A0e, A032));
            DbS.A1J(A0e, str);
            A0e.AAJ("url", product.A0F);
            A0e.Cgf();
        }
    }
}
