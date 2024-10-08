package X;

import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cqv  reason: case insensitive filesystem */
public abstract class C45137Cqv {
    public static ScheduledLiveProductsMetadata parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ScheduledLiveAffiliateInfoImpl scheduledLiveAffiliateInfoImpl = null;
            ProductCollectionImpl productCollectionImpl = null;
            ScheduledLiveDiscountInfoImpl scheduledLiveDiscountInfoImpl = null;
            User user = null;
            ArrayList arrayList = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("affiliate_info".equals(A17)) {
                    scheduledLiveAffiliateInfoImpl = C44329CdB.parseFromJson(r9);
                } else if ("collection_metadata".equals(A17)) {
                    productCollectionImpl = C45710D2j.parseFromJson(r9);
                } else if ("discount_info".equals(A17)) {
                    scheduledLiveDiscountInfoImpl = C44331CdD.parseFromJson(r9);
                } else if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r9, false);
                } else if ("products".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            ProductWrapper parseFromJson = C45711D2k.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r9.A0z();
            }
            return new ScheduledLiveProductsMetadata(scheduledLiveAffiliateInfoImpl, scheduledLiveDiscountInfoImpl, productCollectionImpl, user, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
