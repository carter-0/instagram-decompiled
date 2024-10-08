package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.InterestPivotStyle;
import java.io.IOException;

/* renamed from: X.Ecv  reason: case insensitive filesystem */
public abstract class C48338Ecv {
    public static C47204Dsr parseFromJson(16F r8) {
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str3 = null;
            InterestPivotRedirect interestPivotRedirect = null;
            String str4 = null;
            InterestPivotStyle interestPivotStyle = null;
            String str5 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("redirect".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    interestPivotRedirect = (InterestPivotRedirect) InterestPivotRedirect.A01.get(str2);
                    if (interestPivotRedirect == null) {
                        interestPivotRedirect = InterestPivotRedirect.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(1782).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("style".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    interestPivotStyle = (InterestPivotStyle) InterestPivotStyle.A01.get(str);
                    if (interestPivotStyle == null) {
                        interestPivotStyle = InterestPivotStyle.UNRECOGNIZED;
                    }
                } else if ("text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C47204Dsr(interestPivotRedirect, interestPivotStyle, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
