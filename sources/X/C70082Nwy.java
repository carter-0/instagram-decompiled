package X;

import java.io.IOException;

/* renamed from: X.Nwy  reason: case insensitive filesystem */
public abstract class C70082Nwy {
    public static N49 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            N49 n49 = new N49(40);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    n49.A00 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1E(A0q)) {
                    n49.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return n49;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
