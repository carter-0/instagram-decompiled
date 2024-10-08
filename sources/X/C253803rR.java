package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.3rR  reason: invalid class name and case insensitive filesystem */
public abstract class C253803rR {
    public static C253813rS parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("end".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("start".equals(A0q)) {
                    num2 = Integer.valueOf(r10.A1D());
                } else if (Dbh.A01(10, 8, 29).equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                ((0c9) r10).A03.A00("end", "ProfileContextLinkImpl");
            } else if (num2 != null || !(r10 instanceof 0c9)) {
                return new C253813rS(num.intValue(), str, num2.intValue(), str2);
            } else {
                ((0c9) r10).A03.A00("start", "ProfileContextLinkImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
