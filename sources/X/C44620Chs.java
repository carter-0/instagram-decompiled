package X;

import java.io.IOException;

/* renamed from: X.Chs  reason: case insensitive filesystem */
public abstract class C44620Chs {
    public static C45272Ctb parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45272Ctb ctb = new C45272Ctb();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1E(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    ctb.A00 = A0l;
                } else if (C41845B3m.A18(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    ctb.A01 = A0l2;
                }
                r4.A0z();
            }
            return ctb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
