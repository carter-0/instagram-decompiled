package X;

import java.io.IOException;

/* renamed from: X.O0k  reason: case insensitive filesystem */
public abstract class C70280O0k {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.OMe] */
    public static C70809OMe parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("x".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("y".equals(A17)) {
                    obj.A01 = (float) r4.A0U();
                } else if ("zoom_level".equals(A17)) {
                    obj.A02 = r4.A1D();
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
