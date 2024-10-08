package X;

import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CnY  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44938CnY {
    public static Map A00(ProfileShopLinkIntf profileShopLinkIntf) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (profileShopLinkIntf.BhD() != null) {
            A1H.put("profile_shop_image_url", profileShopLinkIntf.BhD());
        }
        if (profileShopLinkIntf.BhF() != null) {
            A1H.put(AnonymousClass000.A00(89), profileShopLinkIntf.BhF());
        }
        if (profileShopLinkIntf.BhG() != null) {
            A1H.put("profile_shop_username", profileShopLinkIntf.BhG());
        }
        if (profileShopLinkIntf.BsB() != null) {
            SellerShoppableFeedType BsB = profileShopLinkIntf.BsB();
            if (BsB != null) {
                str = BsB.A00;
            } else {
                str = null;
            }
            A1H.put("seller_shoppable_feed_type", str);
        }
        return 0Yt.A0B(A1H);
    }
}
