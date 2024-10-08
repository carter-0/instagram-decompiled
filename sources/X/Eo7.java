package X;

public abstract class Eo7 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TARGET_SIGN_IN";
            case 2:
                return "TARGET_ACCOUNT_RECOVERY";
            case 3:
                return "TARGET_UNCLASSIFIED";
            default:
                return "TARGET_REGISTRATION";
        }
    }
}
