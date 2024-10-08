package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.9Sb  reason: invalid class name and case insensitive filesystem */
public final class C379009Sb {
    public static C384569hX parseFromJson(16F r3) {
        List list;
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
                if ("lyrics".equals(A0q)) {
                    r2.A00 = AnonymousClass9SD.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r2, A0q);
                }
                r3.A0z();
            }
            AnonymousClass9SE r0 = r2.A00;
            if (r0 != null && (list = r0.A00) != null && AnonymousClass7TE.A1b(list)) {
                return r2;
            }
            r2.A00 = null;
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
