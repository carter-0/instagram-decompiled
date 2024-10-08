package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Nxa  reason: case insensitive filesystem */
public abstract class C70120Nxa {
    public static C66665MaY parseFromJson(16F r26) {
        16F r9 = r26;
        0qQ.A0B(r9, 0);
        try {
            Boolean bool = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            C70621ODs oDs = null;
            Boolean bool6 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("is_sampled_for_e2e_logging".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("is_in_shh_mode".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r9);
                } else if ("send_silently".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r9);
                } else if ("is_moment".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r9);
                } else if ("hide_future_requests".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r9);
                } else if ("mutation_attribution".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("power_up_data".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if ("ad_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if ("ephemerality_params".equals(A17)) {
                    oDs = C70055NwX.parseFromJson(r9);
                } else {
                    bool6 = C41847B3o.A0z(r9, bool6, A17, "should_xpost");
                }
                r9.A0z();
            }
            if (str == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r9, "DirectMutationBasicInfo");
            } else if (bool == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_sampled_for_e2e_logging", r9, "DirectMutationBasicInfo");
            } else if (bool2 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_in_shh_mode", r9, "DirectMutationBasicInfo");
            } else if (bool3 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("send_silently", r9, "DirectMutationBasicInfo");
            } else if (bool4 == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_moment", r9, "DirectMutationBasicInfo");
            } else if (bool5 != null || !(r9 instanceof 0c9)) {
                return new C66665MaY(oDs, bool6, str, str2, str3, str4, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
            } else {
                AnonymousClass7TF.A1L("hide_future_requests", r9, "DirectMutationBasicInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
