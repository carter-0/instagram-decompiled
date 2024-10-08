package X;

import java.io.IOException;

/* renamed from: X.Kus  reason: case insensitive filesystem */
public abstract class C63309Kus {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.L4l, java.lang.Object] */
    public static C63727L4l parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("total_latency_ms".equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0X(r3);
                } else if ("source_and_rank_latency_ms".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0X(r3);
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
