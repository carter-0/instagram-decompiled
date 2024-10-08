package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CcZ  reason: case insensitive filesystem */
public abstract class C44291CcZ {
    public static AnonymousClass3IT parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Long l = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            Long l2 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("action_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("cursor".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    l = AnonymousClass7TF.A0Z(r13);
                } else if ("is_shuffle".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("is_unit_dismissable".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if ("netego_title".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("netego_type".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r13.A1P();
                    }
                } else if (!AnonymousClass000.A00(812).equals(A17)) {
                    l2 = C41847B3o.A14(r13, l2, A17, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                } else if (r13.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r13.A1J() != 16L.A08) {
                        BHV parseFromJson = C44462CfK.parseFromJson(r13);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r13.A0z();
            }
            return new AnonymousClass3IT(bool, bool2, l, l2, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
