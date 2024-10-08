package X;

import java.io.IOException;

/* renamed from: X.LHk  reason: case insensitive filesystem */
public final class C63992LHk {
    public static K1K parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            K1K k1k = new K1K();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("is_valid".equals(A17)) {
                    k1k.A01 = r4.A0d();
                } else if (C273654mx.A00(767).equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    k1k.A00 = str;
                } else {
                    1XY.A01(r4, k1k, A17);
                }
                r4.A0z();
            }
            return k1k;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
