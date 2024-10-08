package X;

/* renamed from: X.EnE  reason: case insensitive filesystem */
public abstract class C48976EnE {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "authenticator_app";
            case 2:
                return "authenticator_app_multiple_totp";
            case 3:
                return "email";
            case 4:
                return "whatsapp";
            case 5:
                return "unknown";
            default:
                return "sms";
        }
    }
}
