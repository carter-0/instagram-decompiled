package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

public abstract class VD4 {
    public static C17711Vcg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17711Vcg vcg = new C17711Vcg();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(140).equals(A17)) {
                    vcg.A00 = r3.A1D();
                } else if ("engagement".equals(A17)) {
                    vcg.A01 = r3.A1D();
                } else if ("like_count".equals(A17)) {
                    vcg.A02 = r3.A1D();
                } else if ("save_count".equals(A17)) {
                    vcg.A03 = r3.A1D();
                } else if ("shopping_outbound_click_count".equals(A17)) {
                    vcg.A04 = r3.A1D();
                } else if ("shopping_product_click_count".equals(A17)) {
                    vcg.A05 = r3.A1D();
                } else if (AnonymousClass000.A00(1928).equals(A17)) {
                    vcg.A06 = r3.A1D();
                } else if (AnonymousClass000.A00(75).equals(A17)) {
                    r3.A0y();
                } else if (C41845B3m.A17(A17)) {
                    vcg.A0B = AnonymousClass7TG.A0l(r3);
                } else if ("instagram_media_id".equals(A17)) {
                    vcg.A0C = AnonymousClass7TG.A0l(r3);
                } else if ("instagram_media_owner_id".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (AnonymousClass000.A00(309).equals(A17)) {
                    vcg.A0A = (C16625UyL) EnumHelper.A00(r3.A1Q(), C16625UyL.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("image".equals(A17)) {
                    vcg.A07 = C16962VCo.parseFromJson(r3);
                } else if ("instagram_media_owner_profile_image".equals(A17)) {
                    vcg.A08 = VD2.parseFromJson(r3);
                } else if (AnonymousClass000.A00(1465).equals(A17)) {
                    vcg.A09 = VD3.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vcg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
