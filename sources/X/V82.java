package X;

import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import java.io.IOException;

public abstract class V82 {
    public static ProductTileUCILoggingInfoImpl parseFromJson(16F r17) {
        16F r3 = r17;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product_finder_logging_blob".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                } else if ("ranking_extra_data".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                } else if ("ranking_request_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("ranking_unit_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else if (!"uci_request_id".equals(A17)) {
                    l2 = C41847B3o.A14(r3, l2, A17, "user_id_for_use_in_shops");
                } else if (r3.A11() == 16L.A0G) {
                    str4 = null;
                } else {
                    str4 = r3.A1P();
                }
                r3.A0z();
            }
            if (l == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("ranking_unit_id", r3, "ProductTileUCILoggingInfoImpl");
            } else if (str4 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("uci_request_id", r3, "ProductTileUCILoggingInfoImpl");
            } else if (l2 != null || !(r3 instanceof 0c9)) {
                return new ProductTileUCILoggingInfoImpl(l.longValue(), str, str2, str3, str4, l2.longValue());
            } else {
                AnonymousClass7TF.A1L("user_id_for_use_in_shops", r3, "ProductTileUCILoggingInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
