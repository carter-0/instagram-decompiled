package X;

import java.io.IOException;

public abstract class V7A {
    public static C46539Dgg parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("beneficiary".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("has_completed_dsa_flow".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("payor".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("beneficiary", r10, "DSADefaultData");
            } else if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_completed_dsa_flow", r10, "DSADefaultData");
            } else if (str2 != null || !(r10 instanceof 0c9)) {
                return new C46539Dgg(str, bool.booleanValue(), str2);
            } else {
                AnonymousClass7TF.A1L("payor", r10, "DSADefaultData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
