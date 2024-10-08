package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

public abstract class OPw {
    public static AnonymousClass9IY parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            Integer num = null;
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            Long l = null;
            Long l2 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("offset".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r15);
                } else if ("length".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r15);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r15);
                } else if ("fbId".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r15);
                } else if ("user_or_thread_fbid".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r15);
                }
                r15.A0z();
            }
            if (num == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("offset", r15, "CommandRangeData");
            } else if (num2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("length", r15, "CommandRangeData");
            } else if (num3 != null || !(r15 instanceof 0c9)) {
                return new AnonymousClass9IY(l, l2, num2.intValue(), num3.intValue(), num.intValue(), 0);
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r15, "CommandRangeData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(AnonymousClass9IY r3, 17Z r4) {
        r4.A0c();
        r4.A0P("offset", r3.A02);
        r4.A0P("length", r3.A01);
        r4.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3.A03);
        Number number = (Number) r3.A04;
        if (number != null) {
            r4.A0Q("fbId", number.longValue());
        }
        Number number2 = (Number) r3.A05;
        if (number2 != null) {
            r4.A0Q("user_or_thread_fbid", number2.longValue());
        }
        r4.A0Z();
    }
}
