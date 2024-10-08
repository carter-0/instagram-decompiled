package X;

import java.io.IOException;

/* renamed from: X.O0z  reason: case insensitive filesystem */
public abstract class C70295O0z {
    public static O95 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            O95 o95 = new O95();
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
                    o95.A00 = str;
                }
                r3.A0z();
            }
            return o95;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
