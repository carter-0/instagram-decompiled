package X;

import java.io.IOException;

/* renamed from: X.Nsj  reason: case insensitive filesystem */
public abstract class C69822Nsj {
    public static C61081JwJ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"ch".equals(A17)) {
                    l = C41847B3o.A14(r5, l, A17, "ttl");
                } else if (r5.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r5.A1P();
                }
                r5.A0z();
            }
            return new C61081JwJ(str, (Object) l, 24);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
