package X;

public abstract class VBM {
    public static String A00(Integer num) {
        if (1 - num.intValue() != 0) {
            return "OPEN_MEDIA";
        }
        return "NO_OP";
    }
}
