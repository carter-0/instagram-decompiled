package X;

import java.io.IOException;

/* renamed from: X.Cat  reason: case insensitive filesystem */
public abstract class C44232Cat {
    public static C41936B7n parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C41935B7m b7m = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("suggested_user_result_info_dict".equals(AnonymousClass7TE.A17(r3))) {
                    b7m = C44484Cfg.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C41936B7n(b7m);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
