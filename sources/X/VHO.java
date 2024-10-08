package X;

import java.io.IOException;

public abstract class VHO {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.VTi] */
    public static C17381VTi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product_collection_tile".equals(A17)) {
                    obj.A01 = C45710D2j.parseFromJson(r3);
                } else if ("metadata".equals(A17)) {
                    obj.A00 = VHL.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
