package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cxi  reason: case insensitive filesystem */
public final class C45508Cxi {
    public static CE7 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("access_token".equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("sponsor".equals(A17)) {
                    r4.A01 = C41845B3m.A0a(r5, false);
                } else if ("sponsors".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    r4.A03 = arrayList;
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            String str = r4.A02;
            0qQ.A0A(str);
            r4.A00 = new C61096Jx7(r4.A01, str, r4.A03);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
