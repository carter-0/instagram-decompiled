package X;

import java.io.IOException;

/* renamed from: X.5AN  reason: invalid class name */
public final class AnonymousClass5AN {
    public static AnonymousClass5AM parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("free_token".equals(A0q)) {
                    r3.A01 = AnonymousClass5AW.parseFromJson(r4);
                } else if ("normal_token".equals(A0q)) {
                    r3.A02 = AnonymousClass5AW.parseFromJson(r4);
                } else {
                    1XY.A01(r4, r3, A0q);
                }
                r4.A0z();
            }
            C281905Aa r2 = r3.A01;
            0qQ.A0A(r2);
            C281905Aa r1 = r3.A02;
            0qQ.A0A(r1);
            r3.A00 = new C281935Ad(r2, r1);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
