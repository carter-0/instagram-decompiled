package X;

/* renamed from: X.EkD  reason: case insensitive filesystem */
public abstract class C48790EkD {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PROCESS";
            case 2:
                return "CONFIRM";
            case 3:
                return "COMPLETE";
            case 4:
                return "CANCELLED";
            case 5:
                return "FAILED";
            default:
                return "INACTIVE";
        }
    }
}
