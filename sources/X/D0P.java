package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D0P {
    public static CGP parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CGP cgp = new CGP();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                if (C41846B3n.A1Z(r5, A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C45408Cvo parseFromJson = C44591ChP.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cgp.A00 = arrayList;
                } else if ("count".equals(A0q)) {
                    r5.A1D();
                } else {
                    1XY.A01(r5, cgp, A0q);
                }
                r5.A0z();
            }
            return cgp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
