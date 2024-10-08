package X;

import java.io.IOException;

/* renamed from: X.Cem  reason: case insensitive filesystem */
public abstract class C44428Cem {
    public static BHB parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                if (C41846B3n.A1Y(r5, A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if (C41845B3m.A1A(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new BHB(str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
