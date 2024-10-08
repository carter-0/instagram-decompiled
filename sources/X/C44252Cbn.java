package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cbn  reason: case insensitive filesystem */
public abstract class C44252Cbn {
    public static C61113JxP parseFromJson(16F r26) {
        String A00;
        16F r10 = r26;
        0qQ.A0B(r10, 0);
        try {
            Long l = null;
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            String str = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r9 = 16L.A09;
                A00 = AnonymousClass000.A00(4794);
                if (A1J == r9) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A00.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r10);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("is_default".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("is_list_name_public".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r10);
                } else if ("is_list_named".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if ("is_user_member_of_friend_list".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r10);
                } else if ("member_count".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("social_context_members".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            C41846B3n.A1E(r10, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("thread_ids".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r10, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r10.A0z();
            }
            if (l == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "PrivateStoriesFriendListDetails");
            } else if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_default", r10, "PrivateStoriesFriendListDetails");
            } else if (bool2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_list_named", r10, "PrivateStoriesFriendListDetails");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("member_count", r10, "PrivateStoriesFriendListDetails");
            } else if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r10, "PrivateStoriesFriendListDetails");
            } else if (arrayList != null || !(r10 instanceof 0c9)) {
                return new C61113JxP(bool3, bool4, str, str2, arrayList, arrayList2, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("social_context_members", r10, "PrivateStoriesFriendListDetails");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
