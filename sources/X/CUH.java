package X;

import java.io.IOException;

public abstract class CUH {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CsC, java.lang.Object] */
    public static C45201CsC parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C273654mx.A00(954).equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if ("authorization_header".equals(A17)) {
                    obj.A00 = CUG.parseFromJson(r3);
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
