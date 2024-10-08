package X;

import java.io.IOException;

/* renamed from: X.Cku  reason: case insensitive filesystem */
public abstract class C44783Cku {
    public static C45295Cty parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45295Cty cty = new C45295Cty();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    C41846B3n.A1A(r3);
                } else if (C41845B3m.A19(A0q)) {
                    cty.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("profile_picture".equals(A0q)) {
                    cty.A00 = C44782Ckt.parseFromJson(r3);
                }
                r3.A0z();
            }
            return cty;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
