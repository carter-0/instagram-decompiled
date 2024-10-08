package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.Product;

/* renamed from: X.VwA  reason: case insensitive filesystem */
public abstract class C18655VwA {
    public ProductSource A00;
    public String A01;
    public final 0wc A02;
    public final String A03;
    public final String A04;

    public final void A01(C18043VkR vkR, Product product) {
        0qQ.A0B(product, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_shop_manager_add_product_tap");
        if (A0e.isSampled()) {
            A00(A0e, this, vkR, product);
            A0e.A7p("is_sku_match", Boolean.valueOf(C17056VGe.A00(vkR)));
            A0e.AAJ("submodule", this.A01);
            A0e.Cgf();
        }
    }

    public static void A00(0Aj r2, C18655VwA vwA, C18043VkR vkR, Product product) {
        String str;
        r2.AAJ("waterfall_id", vwA.A04);
        r2.AAJ("prior_module", vwA.A03);
        C16551Uwy A002 = VH2.A00(vkR.A02());
        if (A002 != null) {
            int ordinal = A002.ordinal();
            if (ordinal == 2) {
                str = "product_group";
            } else if (ordinal == 1) {
                str = "product_item";
            }
            r2.AAJ("product_row_type", str);
            r2.AAJ("product_id", product.A0H);
        }
        str = "";
        r2.AAJ("product_row_type", str);
        r2.AAJ("product_id", product.A0H);
    }

    public final void A02(C18043VkR vkR, Product product) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_shop_manager_hide_product_tap");
        if (A0e.isSampled()) {
            A00(A0e, this, vkR, product);
            A0e.A7p("is_sku_match", Boolean.valueOf(C17056VGe.A00(vkR)));
            A0e.AAJ("submodule", this.A01);
            A0e.Cgf();
        }
    }

    public final void A03(C18043VkR vkR, Product product, String str, long j, long j2, boolean z) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_shop_manager_add_to_shop_request_completed");
        if (A0e.isSampled()) {
            A00(A0e, this, vkR, product);
            A0e.A9F("network_start_time", Long.valueOf(j));
            A0e.A9F("network_end_time", Long.valueOf(j2));
            if (z) {
                str2 = RealtimeConstants.SEND_SUCCESS;
            } else {
                str2 = "failure";
            }
            A0e.AAJ("network_result", str2);
            A0e.AAJ("error_message", str);
            A0e.Cgf();
        }
    }

    public final void A04(C18043VkR vkR, Product product, String str, long j, long j2, boolean z) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_shop_manager_hide_product_request_completed");
        if (A0e.isSampled()) {
            A00(A0e, this, vkR, product);
            A0e.A9F("network_start_time", Long.valueOf(j));
            A0e.A9F("network_end_time", Long.valueOf(j2));
            if (z) {
                str2 = RealtimeConstants.SEND_SUCCESS;
            } else {
                str2 = "failure";
            }
            A0e.AAJ("network_result", str2);
            A0e.AAJ("error_message", str);
            A0e.AAJ("submodule", this.A01);
            A0e.Cgf();
        }
    }

    public final void A05(boolean z) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_product_search");
        if (A0e.isSampled()) {
            A0e.AAJ("waterfall_id", this.A04);
            C13988Tno.A1C(A0e, this.A03);
            A0e.A9F("is_marketer", C51971G9r.A0m());
            if (z) {
                str = RealtimeConstants.SEND_SUCCESS;
            } else {
                str = "failure";
            }
            A0e.AAJ("network_result", str);
            A0e.AAJ("product_search_context", "shop_manager");
            A0e.AAJ("submodule", this.A01);
            ProductSource productSource = this.A00;
            if (productSource != null) {
                A0e.AAJ("selected_source_id", productSource.A01);
                A0e.AAJ("selected_source_name", productSource.A04);
                A0e.AAJ("selected_source_type", productSource.A00.toString());
            }
            A0e.Cgf();
        }
    }

    public C18655VwA(UserSession userSession, AnonymousClass4DU r3, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
    }
}
