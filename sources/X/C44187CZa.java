package X;

import java.io.IOException;

/* renamed from: X.CZa  reason: case insensitive filesystem */
public abstract class C44187CZa {
    public static BFG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C42057BFk bFk = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("photo3d_info".equals(AnonymousClass7TE.A17(r3))) {
                    bFk = CbQ.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new BFG(bFk);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
