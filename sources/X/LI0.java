package X;

import java.io.IOException;
import java.util.ArrayList;

public final class LI0 {
    public static K1M parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("media".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1D(r4, arrayList);
                        }
                    }
                    r0.A01 = arrayList;
                } else if ("page_size".equals(A17)) {
                    r4.A1D();
                } else if ("next_max_id".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
