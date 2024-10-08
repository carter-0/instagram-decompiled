package X;

import java.io.IOException;
import java.util.HashMap;

public abstract class Kx3 {
    public static C61079JwH parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            C61079JwH jwH = new C61079JwH(28);
            16L A11 = r7.A11();
            16L r5 = 16L.A0D;
            if (A11 != r5) {
                r7.A0z();
                return null;
            }
            while (true) {
                16L A1J = r7.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return jwH;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                HashMap hashMap = null;
                if ("path".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r7);
                    0qQ.A0B(A0l, 0);
                    jwH.A02 = A0l;
                } else if ("params".equals(A17)) {
                    if (r7.A11() == r5) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r7.A1J() != r4) {
                            C41847B3o.A1M(r7, hashMap);
                        }
                    }
                    0qQ.A0B(hashMap, 0);
                    jwH.A00 = hashMap;
                }
                r7.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
