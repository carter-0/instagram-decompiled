package X;

import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

public final class W1W {
    public 1Xj A00;
    public C15029UKi A01;
    public final AnonymousClass9JL A02;
    public final RankingInfo A03;
    public final 0wc A04;
    public final 0wc A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final ShoppingGuideLoggingInfo A08;
    public final ShoppingSearchLoggingInfo A09;
    public final X9C A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    public W1W(RankingInfo rankingInfo, UserSession userSession, AnonymousClass4DU r5, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, ShoppingSearchLoggingInfo shoppingSearchLoggingInfo, X9C x9c, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C232682uF r52;
        0qQ.A0B(str, 3);
        C51972G9s.A1E(userSession, str4);
        0qQ.A0B(str5, 8);
        this.A07 = r5;
        this.A0A = x9c;
        this.A0G = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A06 = userSession;
        this.A0E = str4;
        this.A0H = str5;
        this.A09 = shoppingSearchLoggingInfo;
        this.A08 = shoppingGuideLoggingInfo;
        this.A03 = rankingInfo;
        this.A0B = str6;
        this.A0C = str7;
        this.A04 = AnonymousClass0kN.A01(r5, userSession);
        this.A05 = AnonymousClass0kN.A00(r5, 0kJ.A05, userSession);
        0jB r0 = null;
        if ((r5 instanceof C232682uF) && (r52 = (C232682uF) r5) != null) {
            r0 = r52.E4k();
        }
        this.A02 = C294165ly.A01(r0);
    }

    public final void A03(Product product) {
        String str;
        0qQ.A0B(product, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_shopping_ar_try_on_tag_entry_point_impression");
        C13991Tnr.A17(A0e, product.A0H);
        User user = product.A0B;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        C13988Tno.A1A(A0e, str);
        C13989Tnp.A1H(A0e, product);
        A0e.AAJ("checkout_session_id", this.A0E);
        C13988Tno.A17(A0e, A00(this, (String) null));
        A0e.Cgf();
    }

    public static final AnonymousClass327 A00(W1W w1w, String str) {
        0bb r2 = new 0bb();
        r2.A06("prior_module", w1w.A0F);
        r2.A06("prior_submodule", w1w.A0D);
        r2.A06("shopping_session_id", w1w.A0H);
        C13989Tnp.A1K(r2, "submodule", str);
        return r2;
    }

    public static final C14930UFt A01(W1W w1w, C18588Vuf vuf) {
        0bb r3 = new 0bb();
        Product product = vuf.A08;
        if (product != null) {
            r3.A05(AnonymousClass000.A00(308), C51971G9r.A0n(0, product.A0H));
        }
        Product product2 = vuf.A09;
        if (product2 != null) {
            r3.A05("pdp_product_id", C51971G9r.A0n(0, product2.A0H));
            r3.A00.put("pdp_merchant_id", C263944Ny.A00(C13989Tnp.A0q(product2)).FH4());
        }
        r3.A06("central_pdp_version", w1w.A0B);
        return r3;
    }

    public static void A02(0Aj r2, W1W w1w) {
        r2.AAJ("prior_module", w1w.A0F);
        r2.AAJ("prior_submodule", w1w.A0D);
    }

    public final void A04(Product product, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_shopping_pdp_restock_reminder_tap");
        C13991Tnr.A17(A0e, product.A0H);
        C13988Tno.A1A(A0e, str);
        A0e.AAJ("submodule", "variant_selector");
        C13988Tno.A1D(A0e, this.A0H);
        A02(A0e, this);
        C13989Tnp.A1H(A0e, product);
        DbY.A1C(A0e);
        String str2 = this.A0C;
        if (str2 != null && !00l.A0W(str2)) {
            A0e.A9F("collection_page_id", AnonymousClass7TE.A10(str2));
        }
        A0e.Cgf();
    }
}
