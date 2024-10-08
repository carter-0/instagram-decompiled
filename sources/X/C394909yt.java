package X;

import java.io.IOException;

/* renamed from: X.9yt  reason: invalid class name and case insensitive filesystem */
public abstract class C394909yt {
    public static C339987kV parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C339987kV r0 = new C339987kV();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("scale".equals(AnonymousClass7TE.A17(r4))) {
                    r0.A00 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
