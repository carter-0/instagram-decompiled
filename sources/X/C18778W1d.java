package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.W1d  reason: case insensitive filesystem */
public final class C18778W1d {
    public final RankingInfo A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final Product A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public static void A02(0Aj r2, C18778W1d w1d, int i, boolean z, boolean z2) {
        r2.A9F("item_count", Long.valueOf((long) i));
        r2.A7p("item_is_influencer_media", Boolean.valueOf(z));
        r2.A7p("is_loading", Boolean.valueOf(z2));
        r2.AAJ("checkout_session_id", w1d.A07);
        r2.AAJ("prior_module", w1d.A0A);
        r2.AAJ("prior_submodule", w1d.A0B);
    }

    public static final ArrayList A00(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66582MXn.A1N(((ProductDiscountInformationDict) it.next()).getId(), arrayList);
        }
        return arrayList;
    }

    public static void A01(0Aj r2, C18778W1d w1d) {
        r2.AAJ("checkout_session_id", w1d.A07);
        r2.AAJ("prior_module", w1d.A0A);
        r2.AAJ("prior_submodule", w1d.A0B);
    }

    public final void A03(int i, int i2, long j) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_lightbox_load_success");
        if (A0e.isSampled()) {
            C13991Tnr.A11(A0e, i);
            A0e.A9F("initial_index", Long.valueOf((long) i2));
            A0e.A9F("load_time", Long.valueOf(j));
            Product product = this.A05;
            C13991Tnr.A17(A0e, product.A0H);
            String A0j = C13991Tnr.A0j(product);
            if (A0j == null) {
                A0j = "";
            }
            A0e.AAJ("merchant_id", A0j);
            C13989Tnp.A1H(A0e, product);
            A01(A0e, this);
            1Xj r2 = this.A04;
            if (r2 != null) {
                UserSession userSession = this.A03;
                if (r2.A2A(userSession) != null) {
                    A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r2));
                }
            }
            A0e.Cgf();
        }
    }

    public final void A04(1Xj r6, String str, String str2, int i, int i2, boolean z, boolean z2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_lightbox_media_attribution_username_click");
        if (A0e.isSampled()) {
            String id = r6.getId();
            if (id != null) {
                A0e.AAJ("item_media_id", id);
                UserSession userSession = this.A03;
                User A2A = r6.A2A(userSession);
                if (A2A != null) {
                    A0e.AAJ("item_media_owner_id", A2A.getId());
                    Product product = this.A05;
                    C13991Tnr.A17(A0e, product.A0H);
                    String A0j = C13991Tnr.A0j(product);
                    if (A0j == null) {
                        A0j = "";
                    }
                    A0e.AAJ("merchant_id", A0j);
                    C13989Tnp.A1H(A0e, product);
                    C13992Tns.A0j(A0e, str, str2, i);
                    A02(A0e, this, i2, z, z2);
                    1Xj r1 = this.A04;
                    if (!(r1 == null || r1.A2A(userSession) == null)) {
                        A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r1));
                    }
                    A0e.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A05(Product product, String str) {
        W2s.A05(this.A01, this.A03, this.A04, (ShoppingGuideLoggingInfo) null, product, this.A0B, this.A0A, str, this.A07, this.A0D);
    }

    public C18778W1d(RankingInfo rankingInfo, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, Product product, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C51974G9v.A1S(userSession, product, str, str2, str3);
        AnonymousClass7TF.A1F(str4, 7, str5);
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
        this.A01 = r3;
        this.A03 = userSession;
        this.A05 = product;
        this.A07 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0D = str5;
        this.A04 = r5;
        this.A06 = str6;
        this.A00 = rankingInfo;
        this.A08 = str7;
        this.A0C = str8;
    }
}
