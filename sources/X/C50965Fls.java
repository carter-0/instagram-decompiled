package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fls  reason: case insensitive filesystem */
public final class C50965Fls implements C20922X4n {
    public final Fragment A00;
    public final UserSession A01;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DKP(X.C257603xf r6, com.instagram.user.model.User r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            if (r6 == 0) goto L_0x0078
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r1 = r6.AyI()
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r0 = com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles.REGULAR_DESIGN_CTA_BOI
            if (r1 != r0) goto L_0x006d
            r0 = 2749(0xabd, float:3.852E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7 = r3
            r3 = r0
        L_0x0014:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            if (r8 == 0) goto L_0x001f
            java.lang.String r0 = "offer_titles"
            r2.put(r0, r8)
        L_0x001f:
            if (r9 == 0) goto L_0x0026
            java.lang.String r0 = "offer_terms"
            r2.put(r0, r9)
        L_0x0026:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "should_show_shop_eligible_products_button"
            r2.put(r0, r1)
            if (r3 == 0) goto L_0x0036
            java.lang.String r0 = "cta_button_destination"
            r2.put(r0, r3)
        L_0x0036:
            if (r7 == 0) goto L_0x004a
            java.lang.String r1 = r7.getId()
            java.lang.String r0 = "merchant_id"
            r2.put(r0, r1)
            java.lang.String r1 = r7.getUsername()
            java.lang.String r0 = "merchant_username"
            r2.put(r0, r1)
        L_0x004a:
            androidx.fragment.app.Fragment r1 = r5.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment"
            X.0qQ.A0C(r1, r0)
            X.4DH r1 = (X.AnonymousClass4DH) r1
            com.instagram.common.session.UserSession r0 = r5.A01
            X.EyM r3 = new X.EyM
            r3.<init>(r1, r0, r2)
            com.instagram.common.session.UserSession r2 = r3.A01
            java.util.HashMap r1 = r3.A02
            java.lang.String r0 = "com.instagram.shopping.incentives.promotion_details.action"
            X.8ey r1 = X.C359988do.A05(r2, r0, r1)
            r0 = 16
            X.E84.A00(r1, r3, r0)
            X.1ES.A03(r1)
            return
        L_0x006d:
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r0 = com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles.REGULAR_DESIGN_CTA_SF
            if (r1 != r0) goto L_0x0078
            r0 = 4047(0xfcf, float:5.671E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            goto L_0x0014
        L_0x0078:
            r4 = 0
            r7 = r3
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50965Fls.DKP(X.3xf, com.instagram.user.model.User, java.lang.String, java.lang.String):void");
    }

    public C50965Fls(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
