package X;

public abstract class ABH {
    public static Integer A00(String str) {
        if (str.equals("IGRTC")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("MWRTC")) {
            return AnonymousClass05K.A01;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static String A01(Integer num) {
        if (1 - num.intValue() != 0) {
            return "IGRTC";
        }
        return "MWRTC";
    }
}
