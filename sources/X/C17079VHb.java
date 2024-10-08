package X;

import java.io.IOException;

/* renamed from: X.VHb  reason: case insensitive filesystem */
public abstract class C17079VHb {
    public static C61083JwL parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61083JwL jwL = new C61083JwL(9);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product".equals(A17)) {
                    jwL.A01 = C275404q6.parseFromJson(r3);
                } else if ("collection".equals(A17)) {
                    jwL.A00 = C45710D2j.parseFromJson(r3);
                }
                r3.A0z();
            }
            return jwL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
