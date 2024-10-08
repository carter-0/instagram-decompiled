package X;

import com.instagram.model.shopping.ProductAREffectContainer;
import java.io.IOException;

public abstract class O1G {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    public static ProductAREffectContainer parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (AnonymousClass000.A00(595).equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = C45681D1g.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
