package X;

import java.io.IOException;

/* renamed from: X.CXq  reason: case insensitive filesystem */
public abstract class C44151CXq {
    public static C42037BEp parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            N49 n49 = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (C41845B3m.A1Q(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("link_text".equals(A17)) {
                    n49 = C44205CZs.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (n49 != null || !(r7 instanceof 0c9)) {
                return new C42037BEp(n49, str);
            }
            AnonymousClass7TF.A1L("link_text", r7, "FooterComponentImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
