package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class D38 {
    public static CGM parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGM cgm = new CGM();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Z(r4, A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1F(r4, arrayList);
                        }
                    }
                    cgm.A03 = arrayList;
                } else if ("paging_info".equals(A0q)) {
                    cgm.A02 = C276094sY.parseFromJson(r4);
                } else {
                    1XY.A01(r4, cgm, A0q);
                }
                r4.A0z();
            }
            List<C276014sL> list = cgm.A03;
            if (list == null) {
                return cgm;
            }
            for (C276014sL r0 : list) {
                1Xj r1 = r0.A00;
                if (r1 != null) {
                    cgm.A04.add(r1);
                }
            }
            return cgm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
