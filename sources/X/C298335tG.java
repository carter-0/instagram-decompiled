package X;

import java.io.IOException;

/* renamed from: X.5tG  reason: invalid class name and case insensitive filesystem */
public final class C298335tG {
    public static C293325kX parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C293325kX r0 = new C293325kX();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("client_mutation_id".equals(A0q)) {
                    if (r3.A11() != 16L.A0G) {
                        r3.A1P();
                    }
                } else if ("extra_info_output".equals(A0q)) {
                    r0.A00 = C293335kY.parseFromJson(r3);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
