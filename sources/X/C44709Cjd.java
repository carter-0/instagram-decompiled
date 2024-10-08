package X;

import java.io.IOException;

/* renamed from: X.Cjd  reason: case insensitive filesystem */
public abstract class C44709Cjd {
    public static C65611ei parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65611ei r0 = new C65611ei();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("profile".equals(A17)) {
                    r0.A01 = C41845B3m.A0a(r4, false);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r0.A00 = C49753F5e.parseFromJson(r4);
                } else if ("is_x_transport_forward".equals(A17)) {
                    r0.A02 = r4.A0d();
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
