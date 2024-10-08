package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public abstract class VEL {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            case 2:
                return AnonymousClass000.A00(3399);
            default:
                return "tag";
        }
    }
}
