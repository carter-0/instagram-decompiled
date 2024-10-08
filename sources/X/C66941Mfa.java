package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Mfa  reason: case insensitive filesystem */
public abstract class C66941Mfa {
    public static void A00(17Z r3, C66942Mfb mfb) {
        r3.A0Q("client_time", mfb.A02);
        r3.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, mfb.A01);
    }

    public static void A01(16F r1, C66942Mfb mfb, String str) {
        if ("client_time".equals(str)) {
            mfb.A02 = r1.A0y();
        } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(str)) {
            mfb.A01 = r1.A1D();
        }
    }
}
