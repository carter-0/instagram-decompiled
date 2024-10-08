package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D13 {
    public static CGZ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGZ cgz = new CGZ();
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
                    cgz.A01 = arrayList;
                } else if (C66579MXk.A00(983).equals(A17)) {
                    cgz.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("has_more".equals(A17)) {
                    cgz.A02 = r5.A0d();
                } else {
                    1XY.A01(r5, cgz, A17);
                }
                r5.A0z();
            }
            return cgz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
