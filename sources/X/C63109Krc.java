package X;

import java.io.IOException;

/* renamed from: X.Krc  reason: case insensitive filesystem */
public abstract class C63109Krc {
    public static C60909JtT parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C60909JtT jtT = new C60909JtT();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("iso3_language_code".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    jtT.A01 = A0l;
                } else if ("display_name".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    jtT.A00 = A0l2;
                }
                r4.A0z();
            }
            return jtT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
