package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cxu  reason: case insensitive filesystem */
public final class C45520Cxu {
    public static C43789CDh parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("carousel_media".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1D(r4, arrayList);
                        }
                    }
                    r3.A02 = arrayList;
                } else if ("more_carousel_media_available".equals(A17)) {
                    r3.A01 = AnonymousClass7TF.A0S(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            r3.A00 = new C42022BAx(r3.A02, C41845B3m.A14(r3.A01));
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
