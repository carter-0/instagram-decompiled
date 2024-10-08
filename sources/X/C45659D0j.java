package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.D0j  reason: case insensitive filesystem */
public final class C45659D0j {
    public static CG6 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CG6 cg6 = new CG6();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("members".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg6.A02 = arrayList;
                } else if ("suggested_users".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cg6.A03 = arrayList;
                } else if (AnonymousClass000.A00(374).equals(A17)) {
                    cg6.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("fb_close_friends_count".equals(A17)) {
                    cg6.A00 = r5.A1D();
                } else {
                    1XY.A01(r5, cg6, A17);
                }
                r5.A0z();
            }
            return cg6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
