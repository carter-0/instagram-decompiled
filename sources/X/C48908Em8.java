package X;

/* renamed from: X.Em8  reason: case insensitive filesystem */
public abstract class C48908Em8 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "UNLOCKED";
                break;
            case 2:
                str = "NOT_LOCKABLE";
                break;
            default:
                str = "LOCKED";
                break;
        }
        return str.hashCode() + intValue;
    }
}
