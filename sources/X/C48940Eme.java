package X;

import java.io.IOException;

/* renamed from: X.Eme  reason: case insensitive filesystem */
public abstract class C48940Eme {
    public static Eu5 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            Eu5 eu5 = new Eu5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("uri".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    eu5.A00 = str;
                }
                r3.A0z();
            }
            return eu5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
