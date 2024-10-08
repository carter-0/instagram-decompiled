package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4sH  reason: invalid class name and case insensitive filesystem */
public abstract class C275974sH {
    public static C276014sL parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1Xj r1 = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("media".equals(A0q)) {
                    r1 = 1Xj.A00(r6);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num = Integer.valueOf(r6.A1D());
                }
                r6.A0z();
            }
            if (r1 != null || !(r6 instanceof 0c9)) {
                return new C276014sL(r1, num);
            }
            ((0c9) r6).A03.A00("media", "ClipsItemDict");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C276014sL r3) {
        r2.A0c();
        1Xj r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("media");
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r2, r1);
        }
        Integer num = r3.A01;
        if (num != null) {
            r2.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num.intValue());
        }
        r2.A0Z();
    }
}
