package X;

import java.io.IOException;

/* renamed from: X.HTh  reason: case insensitive filesystem */
public abstract class C54800HTh {
    public static C53446Goe parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("most_interactions".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else {
                    bool2 = C41847B3o.A0z(r7, bool2, A17, "some_interactions");
                }
                r7.A0z();
            }
            if (bool == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("most_interactions", r7, "LimitedInteractionsFeaturesToLimitImpl");
            } else if (bool2 != null || !(r7 instanceof 0c9)) {
                return new C53446Goe(bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("some_interactions", r7, "LimitedInteractionsFeaturesToLimitImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
