package X;

import java.io.IOException;

/* renamed from: X.Vo3  reason: case insensitive filesystem */
public final class C18236Vo3 {
    public static C15246UXg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(3109).equals(A17)) {
                    r1.A01 = r3.A0d();
                } else if (AnonymousClass000.A00(3000).equals(A17)) {
                    r1.A00 = r3.A0d();
                } else if (AnonymousClass000.A00(3110).equals(A17)) {
                    r1.A02 = r3.A0d();
                } else {
                    1XY.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
