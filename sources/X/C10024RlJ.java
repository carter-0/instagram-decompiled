package X;

import com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.RlJ  reason: case insensitive filesystem */
public abstract class C10024RlJ {
    public static T7R A00;

    public static final Object A00(C307896Rx r23, AnonymousClass6Tm r24) {
        RF1 rf1;
        AnonymousClass6Tm r2 = r24;
        Object A03 = r2.A03(1);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List<Object> list = (List) A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object A0K : list) {
            if (0qQ.A0K(A0K, "subs")) {
                rf1 = RF1.ITEM_TYPE_SUBS;
            } else {
                rf1 = RF1.ITEM_TYPE_INAPP;
            }
            A0r.add(rf1);
        }
        Object A032 = r2.A03(2);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str = (String) DbT.A0q(r2, "null cannot be cast to non-null type kotlin.String", 4);
        String str2 = (String) DbT.A0q(r2, "null cannot be cast to non-null type kotlin.String", 5);
        Object A033 = r2.A03(6);
        0qQ.A0C(A033, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String A0n = Pxg.A0n(r2, 7);
        C277014uI A0P = DbW.A0P(r2, 8);
        LinkedHashMap A07 = 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "NOT_FETCHED"), AnonymousClass7TE.A1L("fetch_status_error_code", ""), AnonymousClass7TE.A1L("fetch_status_error_description", ""), AnonymousClass7TE.A1L("product_status", ""), AnonymousClass7TE.A1L("product_price", AnonymousClass7TE.A1H()), AnonymousClass7TE.A1L("purchase_product_status", ""), AnonymousClass7TE.A1L("purchase_product_status_error_code", ""), AnonymousClass7TE.A1L("purchase_product_status_error_description", ""), AnonymousClass7TE.A1L("internal_transaction_id", ""), AnonymousClass7TE.A1L("external_transaction_id", ""), AnonymousClass7TE.A1L("price_info", AnonymousClass7TE.A1H())});
        C307896Rx r4 = r23;
        S1M s1m = new S1M(r4, A0P);
        AnonymousClass7TE.A1Z(new BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(s1m, r4, (String) A032, A0n, str, str2, A0r, (List) DbT.A0q(r2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", 3), (Map) A033, A07, (AnonymousClass4D7) null), 19E.A02(AnonymousClass12T.A00.A04));
        A00 = null;
        return null;
    }
}
