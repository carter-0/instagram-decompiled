package X;

import java.io.IOException;

/* renamed from: X.9y9  reason: invalid class name and case insensitive filesystem */
public abstract class C394459y9 {
    public static C381919cn parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C381919cn r0 = new C381919cn();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("index".equals(A17)) {
                    r0.A00 = r4.A1D();
                } else if ("hint_word".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A01 = A0l;
                } else if ("word".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A02 = A0l2;
                } else if ("is_editable".equals(A17)) {
                    r0.A03 = r4.A0d();
                } else if ("is_visible".equals(A17)) {
                    r0.A04 = r4.A0d();
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
