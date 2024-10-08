package X;

import java.io.IOException;

/* renamed from: X.Clk  reason: case insensitive filesystem */
public abstract class C44834Clk {
    public static C42021BAw parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C60984Jug jug = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("node".equals(AnonymousClass7TE.A17(r3))) {
                    jug = C44838Clo.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C42021BAw(jug);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
