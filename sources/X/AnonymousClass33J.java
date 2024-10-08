package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.33J  reason: invalid class name */
public final class AnonymousClass33J implements AnonymousClass33K {
    public final UserSession A00;
    public final AnonymousClass326 A01;
    public final AnonymousClass325 A02;

    public AnonymousClass33J(UserSession userSession, AnonymousClass326 r3, AnonymousClass325 r4) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final void Dvp(1Xj r5, AnonymousClass3W1 r6) {
        AnonymousClass326 r3 = this.A01;
        0wc r2 = r3.A00;
        0Aj A002 = r2.A00(r2.A00, "instagram_shopping_seller_featured_product_permission_media_request_tap");
        A002.AAK(C294165ly.A00(r3.A01, r5), "feed_item_info");
        A002.Cgf();
        this.A02.A03(r5, new C57326IXj(this, r5, r6), "media_upsell_cta");
    }
}
