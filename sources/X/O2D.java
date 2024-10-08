package X;

public abstract class O2D {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "incoming_call";
            case 1:
                return "ring";
            case 2:
                return "dismiss";
            case 3:
                return "call_ended";
            default:
                return "unknown";
        }
    }
}
