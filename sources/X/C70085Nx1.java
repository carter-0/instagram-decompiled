package X;

import java.io.IOException;

/* renamed from: X.Nx1  reason: case insensitive filesystem */
public abstract class C70085Nx1 {
    public static N49 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            N49 n49 = new N49(41);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("message_id".equals(A17)) {
                    n49.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("message_sender_igid".equals(A17)) {
                    n49.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return n49;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
