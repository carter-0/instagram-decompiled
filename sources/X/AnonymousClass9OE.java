package X;

/* renamed from: X.9OE  reason: invalid class name */
public abstract class AnonymousClass9OE {
    public static Integer A00(String str) {
        if (str.equals("BACK_ARROW")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("DOWN_ARROW")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("CLOSE_X")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DOWN_ARROW";
            case 2:
                return "CLOSE_X";
            default:
                return "BACK_ARROW";
        }
    }
}
