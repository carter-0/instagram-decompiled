package X;

import java.io.IOException;
import java.util.HashMap;

public abstract class VEF {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VW1, java.lang.Object] */
    public static VW1 parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            16L A11 = r6.A11();
            16L r5 = 16L.A0D;
            if (A11 != r5) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return obj;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                HashMap hashMap = null;
                if (C41845B3m.A1E(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r6);
                } else if (AnonymousClass000.A00(1135).equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r6);
                } else if ("bloks_params".equals(A17)) {
                    if (r6.A11() == r5) {
                        hashMap = new HashMap();
                        while (r6.A1J() != r4) {
                            C41847B3o.A1M(r6, hashMap);
                        }
                    }
                    obj.A02 = hashMap;
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
