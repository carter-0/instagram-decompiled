package X;

import java.io.IOException;

/* renamed from: X.Enx  reason: case insensitive filesystem */
public abstract class C49021Enx {
    public static C49557Exs parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C49557Exs exs = new C49557Exs();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("one_tap_nonce".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    exs.A01 = str;
                } else if (C41845B3m.A1B(A17)) {
                    exs.A00 = C41845B3m.A0a(r4, false);
                } else if (AnonymousClass000.A00(3447).equals(A17)) {
                    exs.A02 = r4.A0d();
                }
                r4.A0z();
            }
            return exs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
