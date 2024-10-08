package X;

import java.io.IOException;
import java.util.ArrayList;

public final class F5H {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dv3, X.E8Y] */
    public static E8Y parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? dv3 = new C47336Dv3();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(3763).equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    dv3.A00 = arrayList;
                } else if ("suggestions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    }
                    dv3.A01 = arrayList;
                } else {
                    C49896FBz.A00(r4, dv3, A17);
                }
                r4.A0z();
            }
            return dv3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
