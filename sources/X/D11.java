package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D11 {
    public static CG2 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CG2 cg2 = new CG2();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("mutual_follows".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg2.A02 = arrayList;
                } else if ("follows".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg2.A01 = arrayList;
                } else if ("creators".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg2.A00 = arrayList;
                } else {
                    1XY.A01(r5, cg2, A17);
                }
                r5.A0z();
            }
            return cg2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
