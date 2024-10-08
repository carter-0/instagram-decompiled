package X;

import java.io.IOException;

/* renamed from: X.5in  reason: invalid class name and case insensitive filesystem */
public abstract class C292345in {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.5iq] */
    public static C292375iq parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C292365ip r1 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("time_bucket".equals(A0q)) {
                    r1 = C292355io.parseFromJson(r5);
                }
                r5.A0z();
            }
            if (r1 != null || !(r5 instanceof 0c9)) {
                ? obj = new Object();
                obj.A00 = r1;
                return obj;
            }
            ((0c9) r5).A03.A00("time_bucket", "Partitions");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
