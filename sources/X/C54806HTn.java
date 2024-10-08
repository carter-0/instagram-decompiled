package X;

import java.io.IOException;

/* renamed from: X.HTn  reason: case insensitive filesystem */
public abstract class C54806HTn {
    public static C53450Goi parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            C53451Goj goj = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("label_str".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("target".equals(A17)) {
                    goj = C54807HTo.parseFromJson(r8);
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("label_str", r8, "MidCardCtaInfo");
            } else if (goj != null || !(r8 instanceof 0c9)) {
                return new C53450Goi(goj, str);
            } else {
                AnonymousClass7TF.A1L("target", r8, "MidCardCtaInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
