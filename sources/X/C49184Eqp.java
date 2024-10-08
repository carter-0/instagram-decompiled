package X;

import java.io.IOException;

/* renamed from: X.Eqp  reason: case insensitive filesystem */
public abstract class C49184Eqp {
    public static EUO parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("block_at".equals(A17)) {
                    r3.A1D();
                } else {
                    C49182Eqn.A00(r3, r2, A17);
                }
                r3.A0z();
            }
            int i = r2.A00;
            if (i == 0) {
                r2.A07 = true;
                return r2;
            } else if (i != 1) {
                return r2;
            } else {
                r2.A08 = true;
                return r2;
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
