package X;

import java.io.IOException;
import java.util.ArrayList;

public final class LK8 {
    public static K1Q parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            K1Q k1q = new K1Q();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("users_removed".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1q.A00 = arrayList;
                } else if ("users_with_commenting_removed".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1q.A01 = arrayList;
                } else {
                    1XY.A01(r5, k1q, A17);
                }
                r5.A0z();
            }
            return k1q;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
