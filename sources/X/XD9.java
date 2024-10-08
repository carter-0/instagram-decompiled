package X;

public abstract class XD9 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "Rest";
            case 1:
                return "Realtime";
            case 2:
                return "ArmadilloExpress";
            default:
                return "Unset";
        }
    }
}
