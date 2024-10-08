package X;

import java.io.IOException;

/* renamed from: X.CeZ  reason: case insensitive filesystem */
public abstract class C44415CeZ {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.DGg, java.lang.Object] */
    public static C45951DGg parseFromJson(16F r2) {
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            while (r2.A1J() != 16L.A09) {
                r2.A1J();
                r2.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
