package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Cyu  reason: case insensitive filesystem */
public abstract class C45582Cyu {
    public static C278024w7 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("icon_glyph".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("icon_type".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                } else if (C41845B3m.A19(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("src".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C278024w7(num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C278024w7 r3) {
        r2.A0c();
        Integer num = r3.A00;
        if (num != null) {
            r2.A0P("icon_glyph", num.intValue());
        }
        Integer num2 = r3.A01;
        if (num2 != null) {
            r2.A0P("icon_type", num2.intValue());
        }
        String str = r3.A02;
        if (str != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        String str2 = r3.A03;
        if (str2 != null) {
            r2.A0R("src", str2);
        }
        r2.A0Z();
    }
}
