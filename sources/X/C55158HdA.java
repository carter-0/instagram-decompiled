package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.HdA  reason: case insensitive filesystem */
public abstract class C55158HdA {
    public static String A00(Integer num) {
        if (1 - num.intValue() != 0) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }
        return "undo";
    }
}
