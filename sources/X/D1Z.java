package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D1Z {
    public static CFO parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CFO cfo = new CFO();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("thumbnails".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1B(r4, arrayList);
                        }
                    }
                    cfo.A00 = arrayList;
                } else if ("title_prefill".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else {
                    1XY.A01(r4, cfo, A17);
                }
                r4.A0z();
            }
            return cfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
