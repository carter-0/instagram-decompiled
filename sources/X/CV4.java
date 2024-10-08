package X;

import java.io.IOException;

public abstract class CV4 {
    public static BDy parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            Float f = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Float f2 = null;
            Float f3 = null;
            Float f4 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (C41845B3m.A1G(A17)) {
                    f = AnonymousClass7TF.A0U(r6);
                } else if ("top_left_x".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r6);
                } else if ("top_left_y".equals(A17)) {
                    f3 = AnonymousClass7TF.A0U(r6);
                } else if (C41845B3m.A1F(A17)) {
                    f4 = AnonymousClass7TF.A0U(r6);
                }
                r6.A0z();
            }
            return new BDy(f, f2, f3, f4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
