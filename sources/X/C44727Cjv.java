package X;

import java.io.IOException;

/* renamed from: X.Cjv  reason: case insensitive filesystem */
public abstract class C44727Cjv {
    public static C45282Ctl parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45282Ctl ctl = new C45282Ctl();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    ctl.A00 = A0l;
                } else if (C41845B3m.A19(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    ctl.A01 = A0l2;
                }
                r4.A0z();
            }
            return ctl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
