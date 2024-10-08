package X;

import java.io.IOException;

/* renamed from: X.Co6  reason: case insensitive filesystem */
public abstract class C44969Co6 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cv1, java.lang.Object] */
    public static C45359Cv1 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("reel".equals(A17)) {
                    obj.A01 = AnonymousClass3HR.parseFromJson(r3);
                } else if ("viewer_count".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if (C41845B3m.A1M(A17)) {
                    obj.A02 = r3.A0d();
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
