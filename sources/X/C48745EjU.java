package X;

import java.io.IOException;

/* renamed from: X.EjU  reason: case insensitive filesystem */
public abstract class C48745EjU {
    public static C47359Dvt parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("icon_url".equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (C273654mx.A00(268).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("category_type".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("action_button_partner".equals(A17)) {
                    r1.A00 = C274654op.parseFromJson(r3);
                } else {
                    1XY.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
