package X;

import java.io.IOException;

/* renamed from: X.ClA  reason: case insensitive filesystem */
public abstract class C44798ClA {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cl9, java.lang.Object] */
    public static C44797Cl9 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("client_mutation_id".equals(AnonymousClass7TE.A17(r3))) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
