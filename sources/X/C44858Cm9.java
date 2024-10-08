package X;

import java.io.IOException;

/* renamed from: X.Cm9  reason: case insensitive filesystem */
public abstract class C44858Cm9 {
    public static C42122BIa parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            C42039BEr bEr = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("can_viewer_donate".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("donation_amount_config".equals(A17)) {
                    bEr = C44155CXu.parseFromJson(r10);
                } else if ("donation_disabled_message".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("donation_url".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("privacy_disclaimer".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("profile_fundraiser_id".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                } else if ("you_donated_message".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new C42122BIa(bEr, bool, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
