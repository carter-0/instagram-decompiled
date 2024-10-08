package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VjS  reason: case insensitive filesystem */
public final class C17990VjS {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final 28D A02;
    public final String A03;

    public final void A00(C62668KkU kkU, 1Xj r5) {
        C14929UFq uFq;
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A01.getValue(), "instagram_shopping_media_post");
        A0e.A8M(kkU, AnonymousClass000.A00(1806));
        if (r5 != null) {
            uFq = C294165ly.A00(this.A00, r5);
        } else {
            uFq = null;
        }
        A0e.AAK(uFq, "feed_item_info");
        A0e.A8M(this.A02, "prior_submodule");
        A0e.AAJ("waterfall_id", this.A03);
        A0e.Cgf();
    }

    public final void A01(1Xj r4) {
        C14929UFq uFq;
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A01.getValue(), "instagram_shopping_product_tagging_impression");
        if (r4 != null) {
            uFq = C294165ly.A00(this.A00, r4);
        } else {
            uFq = null;
        }
        A0e.AAK(uFq, "feed_item_info");
        A0e.A8M(this.A02, "prior_submodule");
        A0e.AAJ("waterfall_id", this.A03);
        A0e.Cgf();
    }

    public C17990VjS(28D r3, AnonymousClass0iw r4, UserSession userSession, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = r3;
        this.A01 = AnonymousClass0eN.A01(new C20613Wvu(23, this, r4));
    }
}
