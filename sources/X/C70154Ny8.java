package X;

import java.io.IOException;

/* renamed from: X.Ny8  reason: case insensitive filesystem */
public abstract class C70154Ny8 {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.O8D] */
    public static O8D parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("ig_thread_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                } else if ("latest_timestamp_ms".equals(A17)) {
                    r4.A0y();
                } else if ("thread".equals(A17)) {
                    obj.A00 = C370528wc.parseFromJson(r4);
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
