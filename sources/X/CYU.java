package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CYU {
    public static C47199Dsl parseFromJson(16F r20) {
        16F r4 = r20;
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("color".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("follower_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("hallpass_id".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("member_count".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("social_context_followers".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("social_context_members".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41846B3n.A1E(r4, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r4.A0z();
            }
            if (str == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("color", r4, "HallpassDetails");
            } else if (num == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("follower_count", r4, "HallpassDetails");
            } else if (str2 == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("hallpass_id", r4, "HallpassDetails");
            } else if (num2 == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L("member_count", r4, "HallpassDetails");
            } else if (str3 == null && (r4 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r4, "HallpassDetails");
            } else if (arrayList2 != null || !(r4 instanceof 0c9)) {
                return new C47199Dsl(str, str2, str3, arrayList, arrayList2, num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("social_context_members", r4, "HallpassDetails");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
