package X;

/* renamed from: X.EnF  reason: case insensitive filesystem */
public abstract class C48977EnF {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "authenticator_app";
            case 2:
                return "whatsapp";
            case 3:
                return "unknown";
            default:
                return "sms";
        }
    }
}
