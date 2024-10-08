package X;

import java.io.IOException;

public abstract class Co4 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.CuC, java.lang.Object] */
    public static C45308CuC parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("ig_guide".equals(A17)) {
                    obj.A00 = C44967Co1.parseFromJson(r3);
                } else if ("ig_media".equals(A17)) {
                    obj.A01 = C44968Co2.parseFromJson(r3);
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
