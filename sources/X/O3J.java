package X;

import java.io.IOException;

public abstract class O3J {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.OHB] */
    public static OHB parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A19(A17)) {
                    obj.A01 = O3N.parseFromJson(r3);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A03 = O3N.parseFromJson(r3);
                } else if ("subtitle".equals(A17)) {
                    obj.A02 = O3N.parseFromJson(r3);
                } else if ("action_type".equals(A17)) {
                    C69413Nks nks = (C69413Nks) C69413Nks.A01.get(r3.A1Q());
                    if (nks == null) {
                        nks = C69413Nks.NOT_MAPPED;
                    }
                    obj.A00 = nks;
                } else if ("beta_redirect_uri".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A04 = str;
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
