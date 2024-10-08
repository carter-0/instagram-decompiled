package X;

import java.io.IOException;

/* renamed from: X.ChA  reason: case insensitive filesystem */
public abstract class C44576ChA {
    public static BIC parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("created_at".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r8);
                } else if ("emoji".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (l == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("created_at", r8, "ViewerReaction");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new BIC(l.longValue(), str);
            } else {
                AnonymousClass7TF.A1L("emoji", r8, "ViewerReaction");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
