package X;

/* renamed from: X.6TS  reason: invalid class name */
public abstract class AnonymousClass6TS {
    public static Integer A01(int i) {
        if (i == 0) {
            return AnonymousClass05K.A00;
        }
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        if (i == 2) {
            return AnonymousClass05K.A0C;
        }
        if (i == 3) {
            return AnonymousClass05K.A0N;
        }
        throw new IllegalArgumentException(002.A0O("Unknown enum value: ", i));
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LEFT";
            case 1:
                return "TOP";
            case 2:
                return "RIGHT";
            default:
                return "BOTTOM";
        }
    }
}
