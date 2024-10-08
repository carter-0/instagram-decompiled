package X;

import java.io.IOException;

public abstract class AB3 {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.A5a] */
    public static C39684A5a parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Float f = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Float f2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("centerX".equals(A17)) {
                    f = AnonymousClass7TF.A0V(r4);
                } else if ("centerY".equals(A17)) {
                    f2 = AnonymousClass7TF.A0V(r4);
                }
                r4.A0z();
            }
            ? obj = new Object();
            if (f != null) {
                obj.A00 = f.floatValue();
            }
            if (f2 == null) {
                return obj;
            }
            obj.A01 = f2.floatValue();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C39684A5a a5a) {
        r2.A0c();
        r2.A0O("centerX", a5a.A00);
        r2.A0O("centerY", a5a.A01);
        r2.A0Z();
    }
}
