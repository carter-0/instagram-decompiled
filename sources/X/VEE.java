package X;

import java.io.IOException;

public abstract class VEE {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.V3C] */
    public static V3C parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            VW1 vw1 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("button".equals(AnonymousClass7TE.A17(r3))) {
                    vw1 = VEF.parseFromJson(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            obj.A00 = vw1;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
