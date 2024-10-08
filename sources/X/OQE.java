package X;

import java.io.IOException;
import java.util.ArrayList;

public final class OQE {
    public static NHH parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NHH nhh = new NHH();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("users".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nhh.A01 = arrayList;
                } else if ("has_more".equals(A17)) {
                    nhh.A02 = r5.A0d();
                } else if ("next_page_cursor".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    nhh.A00 = A0l;
                } else {
                    1XY.A01(r5, nhh, A17);
                }
                r5.A0z();
            }
            return nhh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
