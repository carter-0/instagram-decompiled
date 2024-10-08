package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

public final class W02 {
    public C60762Jqt A00;
    public ProductSource A01;
    public List A02;
    public final 0wc A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final UserSession A07;

    public final void A03(Boolean bool, Boolean bool2, Integer num, Integer num2, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        0qQ.A0B(num, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_shopping_product_search");
        A0e.AAJ("waterfall_id", this.A06);
        C13988Tno.A1C(A0e, this.A04);
        ProductSource productSource = this.A01;
        Long l = null;
        if (productSource == null || productSource.A01 == null) {
            str2 = null;
        } else {
            0qQ.A0A(productSource);
            str2 = productSource.A01;
        }
        A0e.AAJ("selected_source_id", str2);
        ProductSource productSource2 = this.A01;
        if (productSource2 != null) {
            str3 = productSource2.A00.toString();
        } else {
            str3 = "";
        }
        A0e.AAJ("selected_source_name", A00(A0e, this, "selected_source_type", str3));
        A0e.AAJ("product_search_context", C18267Voh.A01(num));
        if (z) {
            str4 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str4 = "failure";
        }
        A0e.AAJ("network_result", str4);
        if (num2 != null) {
            l = C51969G9p.A0r(num2);
        }
        A0e.A9F("result_count", l);
        A0e.AAJ("search_text", str);
        A0e.A7p("is_initial_load", bool);
        A0e.A7p("has_more_results", bool2);
        A01(A0e, this);
        A0e.Cgf();
    }

    public static void A01(0Aj r2, W02 w02) {
        r2.AAK(w02.A00, "suggested_tags_info");
        r2.AAe(AnonymousClass000.A00(1291), w02.A02);
    }

    public final void A02() {
        Boolean bool;
        String str;
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_shopping_product_tagging_opened");
        C13988Tno.A1C(A0e, this.A04);
        ProductSource productSource = this.A01;
        if (productSource != null) {
            bool = Boolean.valueOf(AnonymousClass7TF.A1W(productSource.A00, C16659Uyv.BRAND));
        } else {
            bool = null;
        }
        A0e.A7p("is_influencer", bool);
        A0e.AAJ("waterfall_id", this.A06);
        ProductSource productSource2 = this.A01;
        if (productSource2 != null) {
            str = productSource2.A00.toString();
        } else {
            str = "";
        }
        A0e.AAJ("selected_source_type", str);
        ProductSource productSource3 = this.A01;
        if (productSource3 != null) {
            str2 = productSource3.A01;
        } else {
            str2 = null;
        }
        A0e.AAJ("selected_source_name", A00(A0e, this, "selected_source_id", str2));
        A0e.AAJ("prior_submodule", this.A05);
        A0e.AAK(this.A00, "suggested_tags_info");
        A0e.Cgf();
    }

    public W02(UserSession userSession, AnonymousClass4DU r3, String str, String str2, String str3) {
        this.A07 = userSession;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = AnonymousClass0kN.A01(r3, userSession);
    }

    public static String A00(0Aj r0, W02 w02, String str, String str2) {
        r0.AAJ(str, str2);
        ProductSource productSource = w02.A01;
        if (productSource == null) {
            return null;
        }
        String str3 = productSource.A03;
        if (str3 == null) {
            return productSource.A04;
        }
        return str3;
    }
}
