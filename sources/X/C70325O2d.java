package X;

import java.io.IOException;

/* renamed from: X.O2d  reason: case insensitive filesystem */
public abstract class C70325O2d {
    public static C69158Nfh parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C69158Nfh nfh = new C69158Nfh();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("place".equals(A17)) {
                    C18072Vl0 parseFromJson = C18226Vnq.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    nfh.A00 = parseFromJson;
                } else {
                    C66941Mfa.A01(r4, nfh, A17);
                }
                r4.A0z();
            }
            return nfh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
