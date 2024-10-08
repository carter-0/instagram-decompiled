package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class OR7 {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.Gyv, X.Nfd] */
    public static C69154Nfd parseFromJson(16F r4) {
        List list;
        0qQ.A0B(r4, 0);
        try {
            ? gyv = new C54072Gyv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("users".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    gyv.A01 = arrayList;
                } else if ("upsell_cards".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C379599Un parseFromJson = C69756Nrf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    gyv.A00 = arrayList;
                } else {
                    C55140Hco.A00(r4, gyv, A17);
                }
                r4.A0z();
            }
            List list2 = gyv.A01;
            if (list2 != null) {
                list = C67393MnA.A01(list2);
            } else {
                list = 0sn.A00;
            }
            gyv.A09 = list;
            gyv.A0A = gyv.A00;
            return gyv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
