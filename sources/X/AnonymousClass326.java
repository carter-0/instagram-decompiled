package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;

/* renamed from: X.326  reason: invalid class name */
public final class AnonymousClass326 {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass327 A02;

    public AnonymousClass326(AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
        0bb r1 = new 0bb();
        r1.A06("shopping_session_id", str);
        r1.A06("prior_module", str2);
        r1.A06("prior_submodule", str3);
        this.A02 = r1;
    }

    public final void A00(1Xj r4, FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, String str2, String str3, String str4) {
        C14929UFq uFq;
        0qQ.A0B(str, 1);
        0qQ.A0B(featuredProductPermissionStatus, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_media_owner_featured_product_permission_status_update_success");
        A002.AAJ("action", featuredProductPermissionStatus.A00);
        A002.A9F("product_id", Long.valueOf(Long.parseLong(str2)));
        A002.AAE(C263944Ny.A00(str3), "merchant_id");
        A002.A9F("permission_id", Long.valueOf(Long.parseLong(str)));
        AnonymousClass327 r1 = this.A02;
        r1.A06("submodule", str4);
        A002.AAK(r1, "navigation_info");
        if (r4 != null) {
            uFq = C294165ly.A00(this.A01, r4);
        } else {
            uFq = null;
        }
        A002.AAK(uFq, "feed_item_info");
        A002.Cgf();
    }

    public final void A01(1Xj r4, FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, String str2, String str3, String str4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_seller_featured_product_permission_status_update_success");
        A002.AAJ("action", featuredProductPermissionStatus.A00);
        A002.A9F("product_id", Long.valueOf(Long.parseLong(str2)));
        A002.AAE(C263944Ny.A00(str3), "merchant_id");
        A002.A9F("permission_id", Long.valueOf(Long.parseLong(str)));
        A002.AAK(C294165ly.A00(this.A01, r4), "feed_item_info");
        AnonymousClass327 r1 = this.A02;
        r1.A06("submodule", str4);
        A002.AAK(r1, "navigation_info");
        A002.Cgf();
    }

    public final void A02(FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 1);
        0qQ.A0B(featuredProductPermissionStatus, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str4, 5);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_media_owner_featured_product_permission_status_update_failure");
        A002.AAJ("action", featuredProductPermissionStatus.A00);
        A002.A9F("product_id", Long.valueOf(Long.parseLong(str2)));
        A002.AAE(C263944Ny.A00(str3), "merchant_id");
        A002.A9F("permission_id", Long.valueOf(Long.parseLong(str)));
        AnonymousClass327 r1 = this.A02;
        r1.A06("submodule", str4);
        A002.AAK(r1, "navigation_info");
        A002.AAK((0bb) null, "feed_item_info");
        A002.Cgf();
    }
}
