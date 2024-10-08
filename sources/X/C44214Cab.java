package X;

import java.io.IOException;

/* renamed from: X.Cab  reason: case insensitive filesystem */
public abstract class C44214Cab {
    public static C42047BFa parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            Float f = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C276014sL r3 = null;
            Float f2 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("height_ratio".equals(A17)) {
                    f = AnonymousClass7TF.A0U(r5);
                } else if ("item".equals(A17)) {
                    r3 = C275974sH.parseFromJson(r5);
                } else if ("width_ratio".equals(A17)) {
                    f2 = AnonymousClass7TF.A0U(r5);
                }
                r5.A0z();
            }
            return new C42047BFa(r3, f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
