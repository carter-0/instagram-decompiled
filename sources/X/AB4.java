package X;

public abstract class AB4 {
    public static Integer A00(String str) {
        if (str.equals("DEFAULT")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("REEL")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("COVER_FRAME")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "REEL";
            case 2:
                return "COVER_FRAME";
            default:
                return "DEFAULT";
        }
    }
}
