package X;

import java.io.IOException;

public abstract class O3K {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.OTO] */
    public static OTO parseFromJson(16F r3) {
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
                if (C41845B3m.A1E(A17)) {
                    obj.A01 = O3N.parseFromJson(r3);
                } else if ("action_type".equals(A17)) {
                    obj.A00 = (C69402Nkg) C69402Nkg.A01.get(r3.A1Q());
                } else if (C273654mx.A00(587).equals(A17)) {
                    C69398Nkc.A01.get(r3.A1Q());
                } else if ("url".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A02 = str;
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
