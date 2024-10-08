package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import java.io.IOException;
import java.util.ArrayList;

public final class LJM {
    public static ProductFeedResponse parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ProductFeedResponse productFeedResponse = new ProductFeedResponse();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("more_available".equals(A17)) {
                    productFeedResponse.A04 = r4.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A17)) {
                        productFeedResponse.A01 = AnonymousClass7TG.A0l(r4);
                    } else if (C273654mx.A00(173).equals(A17)) {
                        productFeedResponse.A00 = r4.A1D();
                    } else if ("pagination_token".equals(A17)) {
                        productFeedResponse.A02 = AnonymousClass7TG.A0l(r4);
                    } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                ProductFeedItem parseFromJson = VF2.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        productFeedResponse.A03 = arrayList;
                    } else {
                        1XY.A01(r4, productFeedResponse, A17);
                    }
                }
                r4.A0z();
            }
            return productFeedResponse;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
