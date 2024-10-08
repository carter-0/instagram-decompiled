package X;

import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.VGd  reason: case insensitive filesystem */
public abstract class C17055VGd {
    public static final void A00(C58840Ae r5, ProductTile productTile, String str, String str2) {
        String str3;
        User user;
        String A00;
        0qQ.A0B(r5, 0);
        Product product = productTile.A07;
        if (product != null && (str3 = product.A0H) != null && (user = product.A0B) != null && (A00 = AnonymousClass3ZA.A00(user)) != null) {
            0Aj A0d = C51969G9p.A0d(r5, "instagram_shopping_product_see_less");
            C14932UFv uFv = null;
            if (A0d.isSampled()) {
                C13991Tnr.A17(A0d, str3);
                C13988Tno.A1A(A0d, A00);
                A0d.AAJ("displayed_m_pk", C51969G9p.A0u(productTile.A05));
                RankingInfo rankingInfo = productTile.A04;
                if (rankingInfo != null) {
                    uFv = VF4.A00(rankingInfo);
                }
                A0d.AAK(uFv, "ranking_logging_info");
                C13988Tno.A1D(A0d, str);
                C13988Tno.A1C(A0d, str2);
                A0d.Cgf();
            }
        }
    }
}
