package X;

import java.io.IOException;

/* renamed from: X.Ccx  reason: case insensitive filesystem */
public abstract class C44315Ccx {
    public static BGE parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Float f = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Float f2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A15(A17)) {
                    f = AnonymousClass7TF.A0U(r4);
                } else if (C41845B3m.A16(A17)) {
                    f2 = AnonymousClass7TF.A0U(r4);
                }
                r4.A0z();
            }
            return new BGE(f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
