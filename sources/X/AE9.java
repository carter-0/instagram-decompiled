package X;

public abstract class AE9 {
    public static Integer A02(String str) {
        if (str.equals("OFF")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("RADIAL")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("LINEAR")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 0;
            default:
                return -1;
        }
    }

    public static int A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }
}
