package X;

import java.io.IOException;

/* renamed from: X.A0k  reason: case insensitive filesystem */
public abstract class C39568A0k {
    public static JV7 parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            AnonymousClass4W5 r4 = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("userId".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("qpResponse".equals(A17)) {
                    r4 = C283605Im.parseFromJson(r10);
                } else if ("bloksVersionId".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("userId", r10, "IGOnDemandFetcherData");
            } else if (r4 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("qpResponse", r10, "IGOnDemandFetcherData");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new JV7(r4, str, str2);
            } else {
                AnonymousClass7TF.A1L("bloksVersionId", r10, "IGOnDemandFetcherData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
