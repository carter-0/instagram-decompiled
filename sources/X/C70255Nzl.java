package X;

import java.io.IOException;

/* renamed from: X.Nzl  reason: case insensitive filesystem */
public abstract class C70255Nzl {
    public static C66461nF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66461nF r0 = new C66461nF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C66581MXm.A1X(r4, A0q)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A03 = A0l;
                } else if ("client_context".equals(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A00 = A0l2;
                } else if ("creator_id".equals(A0q)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r0.A01 = A0l3;
                } else if ("prompt_id".equals(A0q)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    r0.A02 = A0l4;
                } else {
                    C66670Mad.A01(r4, r0, A0q);
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
