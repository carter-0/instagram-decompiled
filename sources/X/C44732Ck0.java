package X;

import java.io.IOException;

/* renamed from: X.Ck0  reason: case insensitive filesystem */
public abstract class C44732Ck0 {
    public static C269864fo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1Xj r1 = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (C41845B3m.A1D(AnonymousClass7TE.A17(r3))) {
                    r1 = 1Xj.A00(r3);
                }
                r3.A0z();
            }
            return new C269864fo(r1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
