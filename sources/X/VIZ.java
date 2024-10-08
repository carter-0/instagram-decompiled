package X;

public abstract class VIZ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "moved";
            case 2:
                return "end";
            case 3:
                return "fill";
            default:
                return "begin";
        }
    }
}
