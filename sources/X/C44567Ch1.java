package X;

import java.io.IOException;

/* renamed from: X.Ch1  reason: case insensitive filesystem */
public abstract class C44567Ch1 {
    public static C337327gA parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("formatted_amount_raised".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("formatted_incentive_match".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("maxed_out_match_limit".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("num_badges".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("num_supporters".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (bool != null || !(r10 instanceof 0c9)) {
                return new C337327gA(str, str2, str3, str4, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("maxed_out_match_limit", r10, "UserPayInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
