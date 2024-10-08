package X;

import java.io.IOException;

/* renamed from: X.Cl5  reason: case insensitive filesystem */
public abstract class C44794Cl5 {
    public static C45400Cvg parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45400Cvg cvg = new C45400Cvg();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("body".equals(A17)) {
                    cvg.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("button_text".equals(A17)) {
                    cvg.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("gated_content_link".equals(A17)) {
                    cvg.A02 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1E(A17)) {
                    cvg.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("phone_link".equals(A17)) {
                    cvg.A03 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return cvg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
