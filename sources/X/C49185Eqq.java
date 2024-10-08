package X;

import java.io.IOException;

/* renamed from: X.Eqq  reason: case insensitive filesystem */
public abstract class C49185Eqq {
    public static EUQ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                C49182Eqn.A00(r4, r2, AnonymousClass7TE.A17(r4));
                r4.A0z();
            }
            r2.A08 = false;
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
