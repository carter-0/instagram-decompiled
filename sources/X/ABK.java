package X;

public abstract class ABK {
    public static Integer A00(String str) {
        if (str.equals("ORANGE")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("PINK")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("PURPLE")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("BLUE")) {
            return AnonymousClass05K.A0N;
        }
        if (str.equals("RAINBOW")) {
            return AnonymousClass05K.A0Y;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PINK";
            case 2:
                return "PURPLE";
            case 3:
                return "BLUE";
            case 4:
                return "RAINBOW";
            default:
                return "ORANGE";
        }
    }
}
