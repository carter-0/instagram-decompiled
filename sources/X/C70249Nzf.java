package X;

import java.io.IOException;

/* renamed from: X.Nzf  reason: case insensitive filesystem */
public abstract class C70249Nzf {
    public static C66351mM parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66351mM r0 = new C66351mM();
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
                } else if ("item_id".equals(A0q)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A01 = A0l2;
                } else if ("otid".equals(A0q)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r0.A02 = A0l3;
                } else if ("one_click_upsell".equals(A0q)) {
                    r0.A00 = C300605xU.parseFromJson(r4);
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
