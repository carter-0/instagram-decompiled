package X;

import java.io.IOException;

/* renamed from: X.Cl0  reason: case insensitive filesystem */
public abstract class C44789Cl0 {
    public static C45227Csi parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45227Csi csi = new C45227Csi();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (C41845B3m.A18(A17)) {
                    csi.A00 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return csi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
