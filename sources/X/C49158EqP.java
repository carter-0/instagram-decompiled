package X;

/* renamed from: X.EqP  reason: case insensitive filesystem */
public abstract class C49158EqP {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "APPROVED";
            case 2:
                return "REJECTED";
            case 3:
                return "PENDING";
            case 4:
                return "OUTDATED";
            default:
                return "NO_REVIEW";
        }
    }
}
