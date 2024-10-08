package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class CYL {
    public static C42044BEx parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            User user = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            C42045BEy bEy = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            C59721JVf jVf = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("account".equals(A17)) {
                    user = C41845B3m.A0a(r7, false);
                } else if ("place".equals(A17)) {
                    bEy = CYM.parseFromJson(r7);
                } else if ("product".equals(A17)) {
                    productDetailsProductItemDict = C275404q6.parseFromJson(r7);
                } else if (AnonymousClass000.A00(3783).equals(A17)) {
                    jVf = CYN.parseFromJson(r7);
                }
                r7.A0z();
            }
            return new C42044BEx(jVf, bEy, productDetailsProductItemDict, user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
