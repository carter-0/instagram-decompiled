package X;

import java.io.IOException;

/* renamed from: X.Nre  reason: case insensitive filesystem */
public abstract class C69755Nre {
    public static C61074JwC parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C61080JwI jwI = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            C61080JwI jwI2 = null;
            C61080JwI jwI3 = null;
            C61080JwI jwI4 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("bottom_left".equals(A17)) {
                    jwI = C69754Nrd.parseFromJson(r6);
                } else if ("bottom_right".equals(A17)) {
                    jwI2 = C69754Nrd.parseFromJson(r6);
                } else if ("top_left".equals(A17)) {
                    jwI3 = C69754Nrd.parseFromJson(r6);
                } else if ("top_right".equals(A17)) {
                    jwI4 = C69754Nrd.parseFromJson(r6);
                }
                r6.A0z();
            }
            return new C61074JwC(2, jwI, jwI2, jwI3, jwI4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
