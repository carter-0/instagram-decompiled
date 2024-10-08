package X;

import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import java.io.IOException;

/* renamed from: X.Cne  reason: case insensitive filesystem */
public abstract class C44944Cne {
    public static ShoppingIncentiveMetadata parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("incentive_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("merchant_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("incentive_id", r8, "ShoppingIncentiveMetadata");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new ShoppingIncentiveMetadata(str, str2);
            } else {
                AnonymousClass7TF.A1L("merchant_id", r8, "ShoppingIncentiveMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
