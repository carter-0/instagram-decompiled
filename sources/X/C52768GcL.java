package X;

import java.io.IOException;

/* renamed from: X.GcL  reason: case insensitive filesystem */
public abstract class C52768GcL {
    /* JADX WARNING: type inference failed for: r1v2, types: [X.Hj6, java.lang.Object] */
    public static C55524Hj6 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1Xj r0 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("media".equals(A0q)) {
                    r0 = 1Xj.A00(r3);
                }
                r3.A0z();
            }
            ? obj = new Object();
            if (r0 != null) {
                obj.A00 = r0;
            }
            if (obj.A00 == null) {
                return null;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
