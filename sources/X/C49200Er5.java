package X;

/* renamed from: X.Er5  reason: case insensitive filesystem */
public abstract class C49200Er5 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SELF_PROFILE_BADGED";
            case 2:
                return "SELF_PROFILE";
            case 3:
                return "OTHER_PROFILE";
            case 4:
                return "UNKNOWN";
            default:
                return "SELF_PROFILE_UNBADGED";
        }
    }
}
