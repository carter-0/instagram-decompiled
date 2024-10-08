package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cly  reason: case insensitive filesystem */
public abstract class C44848Cly {
    public static LeadGenInfoFieldData parseFromJson(16F r9) {
        String A00;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                16L A1J = r9.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(1505);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("options".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r9, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r9.A0z();
            }
            if (bool == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r9, "LeadGenInfoFieldData");
            } else if (str != null || !(r9 instanceof 0c9)) {
                return new LeadGenInfoFieldData(str, arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r9, "LeadGenInfoFieldData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
