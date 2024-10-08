package X;

import java.io.IOException;

/* renamed from: X.4vx  reason: invalid class name and case insensitive filesystem */
public abstract class C277924vx {
    public static C277934vy parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("viewer_poll_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                }
                r5.A0z();
            }
            if (bool != null || !(r5 instanceof 0c9)) {
                return new C277934vy(bool.booleanValue());
            }
            ((0c9) r5).A03.A00("viewer_poll_enabled", "IGLiveGamesConfigImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
