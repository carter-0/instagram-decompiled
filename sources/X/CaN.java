package X;

import com.instagram.api.schemas.FeedItemType;
import java.io.IOException;

public abstract class CaN {
    public static BBI parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            FeedItemType feedItemType = null;
            Integer num = null;
            String str2 = null;
            C250533lb r5 = null;
            String str3 = null;
            Integer num2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (C273654mx.A00(2368).equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(str);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2b;
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (C41845B3m.A17(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r5 = C250523la.parseFromJson(r10);
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r10, num2, A17, "view_state_item_type");
                } else if (r10.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r10.A1P();
                }
                r10.A0z();
            }
            return new BBI(feedItemType, num, r5, num2, str2, str3, 0);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
