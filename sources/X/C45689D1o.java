package X;

import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.model.shopping.reels.ProfileShopLink;
import java.io.IOException;

/* renamed from: X.D1o  reason: case insensitive filesystem */
public abstract class C45689D1o {
    public static ProfileShopLink parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            SellerShoppableFeedType sellerShoppableFeedType = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("profile_shop_image_url".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(89).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("profile_shop_username".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("seller_shoppable_feed_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    sellerShoppableFeedType = 16m.A00(str);
                }
                r7.A0z();
            }
            return new ProfileShopLink(sellerShoppableFeedType, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, ProfileShopLink profileShopLink) {
        r2.A0c();
        String str = profileShopLink.A01;
        if (str != null) {
            r2.A0R("profile_shop_image_url", str);
        }
        String str2 = profileShopLink.A02;
        if (str2 != null) {
            r2.A0R(AnonymousClass000.A00(89), str2);
        }
        String str3 = profileShopLink.A03;
        if (str3 != null) {
            r2.A0R("profile_shop_username", str3);
        }
        SellerShoppableFeedType sellerShoppableFeedType = profileShopLink.A00;
        if (sellerShoppableFeedType != null) {
            r2.A0R("seller_shoppable_feed_type", sellerShoppableFeedType.A00);
        }
        r2.A0Z();
    }
}
