package X;

public abstract class XUR {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "PREPARED";
            case 2:
                return "STARTED";
            default:
                return "STOPPED";
        }
    }
}
