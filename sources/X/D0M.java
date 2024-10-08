package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D0M {
    public static CGQ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGQ cgq = new CGQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Z(r5, A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1D(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgq.A01 = arrayList;
                } else if (C41845B3m.A1H(A0q)) {
                    cgq.A00 = AnonymousClass7TG.A0l(r5);
                } else if (C41845B3m.A1V(A0q)) {
                    r5.A0d();
                } else {
                    1XY.A01(r5, cgq, A0q);
                }
                r5.A0z();
            }
            return cgq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
