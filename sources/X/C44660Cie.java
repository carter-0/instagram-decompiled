package X;

import java.io.IOException;

/* renamed from: X.Cie  reason: case insensitive filesystem */
public abstract class C44660Cie {
    public static C61078JwG parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            BBV bbv = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("postback".equals(AnonymousClass7TE.A17(r3))) {
                    bbv = C44661Cif.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C61078JwG((Object) bbv, 7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
