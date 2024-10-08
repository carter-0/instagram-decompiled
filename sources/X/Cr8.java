package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class Cr8 {
    public static ULZ parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            Integer num3 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if ("sequenceNumber".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r11);
                } else if ("serverInfoData".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("receiverUserId".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("retryCount".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if (AnonymousClass000.A00(4127).equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("conferenceName".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                } else if ("conferenceType".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r11);
                } else {
                    num3 = C41847B3o.A13(r11, num3, A17, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
                r11.A0z();
            }
            return new ULZ(num, num2, num3, l, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
