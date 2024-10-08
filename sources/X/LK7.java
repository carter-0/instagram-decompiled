package X;

import java.io.IOException;
import java.util.ArrayList;

public final class LK7 {
    public static K1Z parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            K1Z k1z = new K1Z();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("fetch_ts".equals(A17)) {
                    k1z.A02 = r4.A0y();
                } else if ("num_total_requests".equals(A17)) {
                    k1z.A00 = r4.A1D();
                } else if ("num_unseen_requests".equals(A17)) {
                    k1z.A01 = r4.A1D();
                } else if ("users".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    k1z.A03 = arrayList;
                } else {
                    1XY.A01(r4, k1z, A17);
                }
                r4.A0z();
            }
            return k1z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
