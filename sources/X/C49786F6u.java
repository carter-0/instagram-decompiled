package X;

import java.io.IOException;

/* renamed from: X.F6u  reason: case insensitive filesystem */
public final class C49786F6u {
    public static C47350Dvk parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("disabled".equals(A17)) {
                    r0.A01 = r3.A0d();
                } else if ("thread_presence_disabled".equals(A17)) {
                    r3.A0d();
                } else if ("copresence_disabled".equals(A17)) {
                    r0.A00 = r3.A0d();
                } else {
                    1XY.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
