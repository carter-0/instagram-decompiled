package X;

import java.io.IOException;

/* renamed from: X.Civ  reason: case insensitive filesystem */
public abstract class C44677Civ {
    public static CsQ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CsQ csQ = new CsQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C66579MXk.A00(1113).equals(A17)) {
                    0qQ.A0B(AnonymousClass7TG.A0l(r4), 0);
                } else if ("album_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    csQ.A00 = A0l;
                }
                r4.A0z();
            }
            return csQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
