package X;

import java.io.IOException;

/* renamed from: X.Nx2  reason: case insensitive filesystem */
public abstract class C70086Nx2 {
    public static C61078JwG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61078JwG jwG = new C61078JwG(12);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("last_expired_message_info".equals(AnonymousClass7TE.A17(r3))) {
                    jwG.A00 = C70085Nx1.parseFromJson(r3);
                }
                r3.A0z();
            }
            return jwG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
