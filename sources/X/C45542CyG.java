package X;

import java.io.IOException;

/* renamed from: X.CyG  reason: case insensitive filesystem */
public final class C45542CyG {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.CXL] */
    public static C43775CCt parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                1XY.A01(r3, r2, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            r2.A00 = new Object();
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
