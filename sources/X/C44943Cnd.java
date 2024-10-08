package X;

import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cnd  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44943Cnd {
    public static Map A00(ShoppingIncentiveMetadataIntf shoppingIncentiveMetadataIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (shoppingIncentiveMetadataIntf.BGl() != null) {
            A1H.put("incentive_id", shoppingIncentiveMetadataIntf.BGl());
        }
        if (shoppingIncentiveMetadataIntf.BRr() != null) {
            A1H.put("merchant_id", shoppingIncentiveMetadataIntf.BRr());
        }
        return 0Yt.A0B(A1H);
    }
}
