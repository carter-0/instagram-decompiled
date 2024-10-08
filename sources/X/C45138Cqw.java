package X;

import com.instagram.user.model.UnavailableProductImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Cqw  reason: case insensitive filesystem */
public abstract class C45138Cqw {
    public static UnavailableProductImpl parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("compound_product_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r10, false);
                } else if ("product_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (user == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant", r10, "UnavailableProductImpl");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new UnavailableProductImpl(user, str2, str);
            } else {
                AnonymousClass7TF.A1L("product_id", r10, "UnavailableProductImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
