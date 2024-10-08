package X;

import java.io.IOException;

public abstract class Ca8 {
    public static C61081JwJ parseFromJson(16F r8) {
        String A00;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C59721JVf jVf = null;
            String str = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r4 = 16L.A09;
                A00 = AnonymousClass000.A00(2659);
                if (A1J == r4) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (A00.equals(A17)) {
                    jVf = Ca6.parseFromJson(r8);
                } else if ("display_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (jVf == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r8, "MapRefinement");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C61081JwJ(jVf, str);
            } else {
                AnonymousClass7TF.A1L("display_text", r8, "MapRefinement");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
