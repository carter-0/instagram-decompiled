package X;

import java.io.IOException;

/* renamed from: X.CjK  reason: case insensitive filesystem */
public abstract class C44692CjK {
    public static C66391mg parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66391mg r0 = new C66391mg();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("container_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A00 = A0l;
                } else if ("reshare_text".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A01 = A0l2;
                } else {
                    C66893Meb.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
