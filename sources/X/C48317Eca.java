package X;

/* renamed from: X.Eca  reason: case insensitive filesystem */
public abstract class C48317Eca {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(8)) {
            switch (num.intValue()) {
                case 1:
                    str2 = Py0.A01(43, 8, 43);
                    break;
                case 2:
                    str2 = "password";
                    break;
                case 3:
                    str2 = "email";
                    break;
                case 4:
                    str2 = Py0.A01(9, 12, 5);
                    break;
                case 5:
                    str2 = "full_name";
                    break;
                case 6:
                    str2 = "sentry";
                    break;
                case 7:
                    str2 = "confirmation_code";
                    break;
                default:
                    str2 = "unknown";
                    break;
            }
            if (0qQ.A0K(str2, str)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }
}
