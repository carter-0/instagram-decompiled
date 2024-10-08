package X;

import java.io.IOException;

/* renamed from: X.B6k  reason: case insensitive filesystem */
public abstract class C41912B6k {
    public static C41913B6l parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("host_profile_id".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("is_eligible_request".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("host_profile_id", r8, "ProfileAdsInfoDictImpl");
            } else if (bool != null || !(r8 instanceof 0c9)) {
                return new C41913B6l(str, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_eligible_request", r8, "ProfileAdsInfoDictImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
