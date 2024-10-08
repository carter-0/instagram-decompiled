package X;

import java.io.IOException;

/* renamed from: X.6qU  reason: invalid class name and case insensitive filesystem */
public final class C319376qU {
    public static C319366qT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("count".equals(A0q)) {
                    r2.A01 = Integer.valueOf(r3.A1D());
                } else {
                    1XY.A01(r3, r2, A0q);
                }
                r3.A0z();
            }
            Integer num = r2.A01;
            0qQ.A0A(num);
            r2.A00 = new XED(num.intValue());
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
