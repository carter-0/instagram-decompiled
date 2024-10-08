package X;

import java.io.IOException;

/* renamed from: X.RiA  reason: case insensitive filesystem */
public abstract class C9838RiA {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.RBB, java.lang.Object] */
    public static RBB parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                16P.A02(r3);
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
