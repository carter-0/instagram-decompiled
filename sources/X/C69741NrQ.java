package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.NrQ  reason: case insensitive filesystem */
public abstract class C69741NrQ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_USER_PASSWORD";
            case 2:
                return "MALFORMED_SERVER_RESPONSE";
            case 3:
                return "MALFORMED_CLIENT_INPUT";
            case 4:
                return "ENCRYPTION_FAILURE";
            case 5:
                return "DECRYPTION_FAILURE";
            case 6:
                return "SERIALIZATION_FAILURE";
            case 7:
                return "DESERIALIZATION_FAILURE";
            case 8:
                return "RSA_INVALID_KEY";
            case 9:
                return "RSA_VERIFICATION_FAILURE";
            case 10:
                return "ED25519_INVALID_KEY";
            case 11:
                return "ED25519_VERIFICATION_FAILURE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "SHA256";
            case 13:
                return "UNKNOWN_ERROR_CODE";
            default:
                return "FAILED_JNI_TRANSLATION";
        }
    }
}
