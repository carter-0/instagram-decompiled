package X;

public abstract class S9N {
    public static byte A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return -1;
            default:
                return 0;
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RSA2048_PSS";
            case 2:
                return "ECDSAP256";
            case 3:
                return "UNKNOWN";
            default:
                return "RSA2048_PKCS1_5";
        }
    }
}
