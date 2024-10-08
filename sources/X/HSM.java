package X;

public abstract class HSM {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ALPHA";
            case 1:
                return "ROTATION";
            case 2:
                return "ROTATION_X";
            case 3:
                return "ROTATION_Y";
            default:
                return "SCALE";
        }
    }
}
