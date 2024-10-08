package X;

import java.io.IOException;

/* renamed from: X.9P9  reason: invalid class name */
public abstract class AnonymousClass9P9 {
    public static C340007kX parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C340007kX r0 = new C340007kX();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("reason".equals(A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    C339997kW r1 = (C339997kW) C339997kW.A01.get(str);
                    if (r1 != null) {
                        r0.A00 = r1;
                    } else {
                        throw AnonymousClass7TF.A0W("Unrecognized value ", str);
                    }
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
