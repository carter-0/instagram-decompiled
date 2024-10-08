package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D21 {
    public static CG3 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CG3 cg3 = new CG3();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("account_level_monetization_toggle".equals(A17)) {
                    cg3.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("product_type".equals(A17)) {
                    cg3.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("media_ids_changed".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg3.A02 = arrayList;
                } else {
                    1XY.A01(r5, cg3, A17);
                }
                r5.A0z();
            }
            return cg3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
